package org.bouncycastle.math.ec.endo;

/* loaded from: classes17.dex */
public class GLVTypeAEndomorphism implements org.bouncycastle.math.ec.endo.GLVEndomorphism {
    protected final org.bouncycastle.math.ec.endo.GLVTypeAParameters parameters;
    protected final org.bouncycastle.math.ec.ECPointMap pointMap;

    @Override // org.bouncycastle.math.ec.endo.ECEndomorphism
    public boolean hasEfficientPointMap() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.endo.ECEndomorphism
    public org.bouncycastle.math.ec.ECPointMap getPointMap() {
        return this.pointMap;
    }

    @Override // org.bouncycastle.math.ec.endo.GLVEndomorphism
    public java.math.BigInteger[] decomposeScalar(java.math.BigInteger bigInteger) {
        return org.bouncycastle.math.ec.endo.EndoUtil.decomposeScalar(this.parameters.getSplitParams(), bigInteger);
    }

    public GLVTypeAEndomorphism(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.endo.GLVTypeAParameters gLVTypeAParameters) {
        this.parameters = gLVTypeAParameters;
        this.pointMap = new org.bouncycastle.math.ec.ScaleYNegateXPointMap(eCCurve.fromBigInteger(gLVTypeAParameters.getI()));
    }
}
