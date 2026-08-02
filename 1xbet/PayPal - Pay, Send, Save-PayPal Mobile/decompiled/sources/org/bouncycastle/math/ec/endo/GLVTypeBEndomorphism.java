package org.bouncycastle.math.ec.endo;

/* loaded from: classes17.dex */
public class GLVTypeBEndomorphism implements org.bouncycastle.math.ec.endo.GLVEndomorphism {
    protected final org.bouncycastle.math.ec.endo.GLVTypeBParameters parameters;
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

    public GLVTypeBEndomorphism(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.endo.GLVTypeBParameters gLVTypeBParameters) {
        this.parameters = gLVTypeBParameters;
        this.pointMap = new org.bouncycastle.math.ec.ScaleXPointMap(eCCurve.fromBigInteger(gLVTypeBParameters.getBeta()));
    }
}
