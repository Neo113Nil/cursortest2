package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class GLVMultiplier extends org.bouncycastle.math.ec.AbstractECMultiplier {
    protected final org.bouncycastle.math.ec.ECCurve curve;
    protected final org.bouncycastle.math.ec.endo.GLVEndomorphism glvEndomorphism;

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected org.bouncycastle.math.ec.ECPoint multiplyPositive(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            throw new java.lang.IllegalStateException();
        }
        java.math.BigInteger[] decomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        java.math.BigInteger bigInteger2 = decomposeScalar[0];
        java.math.BigInteger bigInteger3 = decomposeScalar[1];
        return this.glvEndomorphism.hasEfficientPointMap() ? org.bouncycastle.math.ec.ECAlgorithms.getHighResolutionOutputSizeshNQ4ISI(this.glvEndomorphism, eCPoint, bigInteger2, bigInteger3) : org.bouncycastle.math.ec.ECAlgorithms.getHighSpeedVideoFpsRanges(eCPoint, bigInteger2, org.bouncycastle.math.ec.endo.EndoUtil.mapPoint(this.glvEndomorphism, eCPoint), bigInteger3);
    }

    public GLVMultiplier(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.endo.GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            throw new java.lang.IllegalArgumentException("Need curve with known group order");
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }
}
