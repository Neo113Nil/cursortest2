package org.bouncycastle.math.ec.endo;

/* loaded from: classes17.dex */
public abstract class EndoUtil {
    public static final java.lang.String PRECOMP_NAME = "bc_endo";

    public static org.bouncycastle.math.ec.ECPoint mapPoint(final org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism, final org.bouncycastle.math.ec.ECPoint eCPoint) {
        return ((org.bouncycastle.math.ec.endo.EndoPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.endo.EndoUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.endo.EndoPreCompInfo endoPreCompInfo = preCompInfo instanceof org.bouncycastle.math.ec.endo.EndoPreCompInfo ? (org.bouncycastle.math.ec.endo.EndoPreCompInfo) preCompInfo : null;
                org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism2 = org.bouncycastle.math.ec.endo.ECEndomorphism.this;
                if (endoPreCompInfo != null && endoPreCompInfo.getEndomorphism() == eCEndomorphism2 && endoPreCompInfo.getMappedPoint() != null) {
                    return endoPreCompInfo;
                }
                org.bouncycastle.math.ec.ECPoint map = org.bouncycastle.math.ec.endo.ECEndomorphism.this.getPointMap().map(eCPoint);
                org.bouncycastle.math.ec.endo.EndoPreCompInfo endoPreCompInfo2 = new org.bouncycastle.math.ec.endo.EndoPreCompInfo();
                endoPreCompInfo2.setEndomorphism(org.bouncycastle.math.ec.endo.ECEndomorphism.this);
                endoPreCompInfo2.setMappedPoint(map);
                return endoPreCompInfo2;
            }
        })).getMappedPoint();
    }

    public static java.math.BigInteger[] decomposeScalar(org.bouncycastle.math.ec.endo.ScalarSplitParameters scalarSplitParameters, java.math.BigInteger bigInteger) {
        int bits = scalarSplitParameters.getBits();
        java.math.BigInteger Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bigInteger, scalarSplitParameters.getG1(), bits);
        java.math.BigInteger Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bigInteger, scalarSplitParameters.getG2(), bits);
        return new java.math.BigInteger[]{bigInteger.subtract(Camera2StreamConfigurationMap.multiply(scalarSplitParameters.getV1A()).add(Camera2StreamConfigurationMap2.multiply(scalarSplitParameters.getV2A()))), Camera2StreamConfigurationMap.multiply(scalarSplitParameters.getV1B()).add(Camera2StreamConfigurationMap2.multiply(scalarSplitParameters.getV2B())).negate()};
    }

    private static java.math.BigInteger Camera2StreamConfigurationMap(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        java.math.BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        java.math.BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(org.bouncycastle.math.ec.ECConstants.ONE);
        }
        return z ? shiftRight.negate() : shiftRight;
    }
}
