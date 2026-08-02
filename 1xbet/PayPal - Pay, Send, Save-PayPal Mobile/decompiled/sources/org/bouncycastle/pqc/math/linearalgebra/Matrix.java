package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public abstract class Matrix {
    public static final char MATRIX_TYPE_RANDOM_LT = 'L';
    public static final char MATRIX_TYPE_RANDOM_REGULAR = 'R';
    public static final char MATRIX_TYPE_RANDOM_UT = 'U';
    public static final char MATRIX_TYPE_UNIT = 'I';
    public static final char MATRIX_TYPE_ZERO = 'Z';
    protected int numColumns;
    protected int numRows;

    public abstract org.bouncycastle.pqc.math.linearalgebra.Matrix computeInverse();

    public abstract byte[] getEncoded();

    public abstract boolean isZero();

    public abstract org.bouncycastle.pqc.math.linearalgebra.Vector leftMultiply(org.bouncycastle.pqc.math.linearalgebra.Vector vector);

    public abstract org.bouncycastle.pqc.math.linearalgebra.Matrix rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Matrix matrix);

    public abstract org.bouncycastle.pqc.math.linearalgebra.Matrix rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation);

    public abstract org.bouncycastle.pqc.math.linearalgebra.Vector rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Vector vector);

    public abstract java.lang.String toString();

    public int getNumRows() {
        return this.numRows;
    }

    public int getNumColumns() {
        return this.numColumns;
    }
}
