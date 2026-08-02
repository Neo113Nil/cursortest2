package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public abstract class GF2nElement implements org.bouncycastle.pqc.math.linearalgebra.GFElement {
    protected int mDegree;
    protected org.bouncycastle.pqc.math.linearalgebra.GF2nField mField;

    abstract void Camera2StreamConfigurationMap();

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public abstract java.lang.Object clone();

    abstract boolean getHighSpeedVideoFpsRangesFor(int i);

    public abstract org.bouncycastle.pqc.math.linearalgebra.GF2nElement increase();

    public abstract void increaseThis();

    public abstract org.bouncycastle.pqc.math.linearalgebra.GF2nElement solveQuadraticEquation() throws java.lang.RuntimeException;

    public abstract org.bouncycastle.pqc.math.linearalgebra.GF2nElement square();

    public abstract org.bouncycastle.pqc.math.linearalgebra.GF2nElement squareRoot();

    public abstract void squareRootThis();

    public abstract void squareThis();

    public abstract boolean testRightmostBit();

    public abstract int trace();

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public final void subtractFromThis(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) {
        addToThis(gFElement);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public final org.bouncycastle.pqc.math.linearalgebra.GFElement subtract(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) {
        return add(gFElement);
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nField getField() {
        return this.mField;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nElement convert(org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField) {
        return this.mField.convert(this, gF2nField);
    }
}
