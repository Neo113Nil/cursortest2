package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DSAKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.DSAKeyGenerationParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        java.math.BigInteger createRandomInRange;
        org.bouncycastle.crypto.params.DSAParameters parameters = this.getHighSpeedVideoFpsRangesFor.getParameters();
        java.math.BigInteger q = parameters.getQ();
        java.security.SecureRandom random = this.getHighSpeedVideoFpsRangesFor.getRandom();
        int bitLength = q.bitLength();
        do {
            java.math.BigInteger bigInteger = getHighSpeedVideoFpsRanges;
            createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, q.subtract(bigInteger), random);
        } while (org.bouncycastle.math.ec.WNafUtil.getNafWeight(createRandomInRange) < (bitLength >>> 2));
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.DSAPublicKeyParameters(parameters.getG().modPow(createRandomInRange, parameters.getP()), parameters), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.DSAPrivateKeyParameters(createRandomInRange, parameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.DSAKeyGenerationParameters) keyGenerationParameters;
    }
}
