package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenTruePass() {
    BishopBlack bishopBlack = new BishopBlack(Cell.C1);
    Cell[] way = bishopBlack.way(Cell.G5);
    Cell[] expect = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
    assertArrayEquals(expect, way);
    }

    @Test
    public void whenTrueBackPass() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] way = bishopBlack.way(Cell.C1);
        Cell[] expect = new Cell[] {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertArrayEquals(expect, way);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenEx() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.D1);
    }
}