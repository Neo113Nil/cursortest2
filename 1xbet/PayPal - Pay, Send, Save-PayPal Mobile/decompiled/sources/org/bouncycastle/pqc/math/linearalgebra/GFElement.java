package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public interface GFElement {
    org.bouncycastle.pqc.math.linearalgebra.GFElement add(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException;

    void addToThis(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException;

    java.lang.Object clone();

    boolean equals(java.lang.Object obj);

    int hashCode();

    org.bouncycastle.pqc.math.linearalgebra.GFElement invert() throws java.lang.ArithmeticException;

    boolean isOne();

    boolean isZero();

    org.bouncycastle.pqc.math.linearalgebra.GFElement multiply(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException;

    void multiplyThisBy(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException;

    org.bouncycastle.pqc.math.linearalgebra.GFElement subtract(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException;

    void subtractFromThis(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement);

    byte[] toByteArray();

    java.math.BigInteger toFlexiBigInt();

    java.lang.String toString();

    java.lang.String toString(int i);
}
