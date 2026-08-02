package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public abstract class Vector {
    protected int length;

    public abstract org.bouncycastle.pqc.math.linearalgebra.Vector add(org.bouncycastle.pqc.math.linearalgebra.Vector vector);

    public abstract boolean equals(java.lang.Object obj);

    public abstract byte[] getEncoded();

    public abstract int hashCode();

    public abstract boolean isZero();

    public abstract org.bouncycastle.pqc.math.linearalgebra.Vector multiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation);

    public abstract java.lang.String toString();

    public final int getLength() {
        return this.length;
    }
}
