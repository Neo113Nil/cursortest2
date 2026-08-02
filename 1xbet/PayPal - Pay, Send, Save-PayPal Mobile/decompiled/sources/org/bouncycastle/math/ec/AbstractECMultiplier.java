package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class AbstractECMultiplier implements org.bouncycastle.math.ec.ECMultiplier {
    protected abstract org.bouncycastle.math.ec.ECPoint multiplyPositive(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger);

    @Override // org.bouncycastle.math.ec.ECMultiplier
    public org.bouncycastle.math.ec.ECPoint multiply(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || eCPoint.isInfinity()) {
            return eCPoint.getCurve().getInfinity();
        }
        org.bouncycastle.math.ec.ECPoint multiplyPositive = multiplyPositive(eCPoint, bigInteger.abs());
        if (signum <= 0) {
            multiplyPositive = multiplyPositive.negate();
        }
        return checkResult(multiplyPositive);
    }

    protected org.bouncycastle.math.ec.ECPoint checkResult(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return org.bouncycastle.math.ec.ECAlgorithms.Camera2StreamConfigurationMap(eCPoint);
    }
}
