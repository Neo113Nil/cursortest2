package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class GOST3410KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.GOST3410Parameters parameters = this.getHighSpeedVideoSizes.getParameters();
        java.security.SecureRandom random = this.getHighSpeedVideoSizes.getRandom();
        java.math.BigInteger q = parameters.getQ();
        java.math.BigInteger p = parameters.getP();
        java.math.BigInteger a2 = parameters.getA();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(256, random);
            if (createRandomBigInteger.signum() > 0 && createRandomBigInteger.compareTo(q) < 0 && org.bouncycastle.math.ec.WNafUtil.getNafWeight(createRandomBigInteger) >= 64) {
                return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.GOST3410PublicKeyParameters(a2.modPow(createRandomBigInteger, p), parameters), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters(createRandomBigInteger, parameters));
            }
        }
    }
}
