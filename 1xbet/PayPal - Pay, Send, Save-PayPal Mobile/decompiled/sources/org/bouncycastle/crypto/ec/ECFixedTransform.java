package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public class ECFixedTransform implements org.bouncycastle.crypto.ec.ECPairFactorTransform {
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public org.bouncycastle.crypto.ec.ECPair transform(org.bouncycastle.crypto.ec.ECPair eCPair) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = this.getHighSpeedVideoSizes;
        if (eCPublicKeyParameters == null) {
            throw new java.lang.IllegalStateException("ECFixedTransform not initialised");
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        java.math.BigInteger n = parameters.getN();
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        java.math.BigInteger mod = this.getHighSpeedVideoFpsRanges.mod(n);
        org.bouncycastle.math.ec.ECPoint[] eCPointArr = {createBasePointMultiplier.multiply(parameters.getG(), mod).add(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getX())), this.getHighSpeedVideoSizes.getQ().multiply(mod).add(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getY()))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new org.bouncycastle.crypto.ec.ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
            throw new java.lang.IllegalArgumentException("ECPublicKeyParameters are required for fixed transform.");
        }
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairFactorTransform
    public java.math.BigInteger getTransformValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }

    public ECFixedTransform(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRanges = bigInteger;
    }
}
