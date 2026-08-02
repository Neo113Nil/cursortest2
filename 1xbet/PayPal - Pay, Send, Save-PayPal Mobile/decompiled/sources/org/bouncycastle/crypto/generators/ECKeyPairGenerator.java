package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class ECKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator, org.bouncycastle.math.ec.ECConstants {
    org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRangesFor;
    java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters = (org.bouncycastle.crypto.params.ECKeyGenerationParameters) keyGenerationParameters;
        this.getHighSpeedVideoSizes = eCKeyGenerationParameters.getRandom();
        this.getHighSpeedVideoFpsRangesFor = eCKeyGenerationParameters.getDomainParameters();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        java.math.BigInteger n = this.getHighSpeedVideoFpsRangesFor.getN();
        int bitLength = n.bitLength();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, this.getHighSpeedVideoSizes);
            if (createRandomBigInteger.compareTo(ONE) >= 0 && createRandomBigInteger.compareTo(n) < 0 && org.bouncycastle.math.ec.WNafUtil.getNafWeight(createRandomBigInteger) >= (bitLength >>> 2)) {
                return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.ECPublicKeyParameters(createBasePointMultiplier().multiply(this.getHighSpeedVideoFpsRangesFor.getG(), createRandomBigInteger), this.getHighSpeedVideoFpsRangesFor), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.ECPrivateKeyParameters(createRandomBigInteger, this.getHighSpeedVideoFpsRangesFor));
            }
        }
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }
}
