package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class CramerShoupKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.CramerShoupKeyGenerationParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.CramerShoupParameters parameters = this.getHighSpeedVideoSizes.getParameters();
        java.security.SecureRandom random = this.getHighSpeedVideoSizes.getRandom();
        java.math.BigInteger p = parameters.getP();
        java.math.BigInteger bigInteger = Camera2StreamConfigurationMap;
        org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = new org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters(parameters, org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, p.subtract(bigInteger), random), org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, p.subtract(bigInteger), random), org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, p.subtract(bigInteger), random), org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, p.subtract(bigInteger), random), org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger, p.subtract(bigInteger), random));
        java.math.BigInteger g1 = parameters.getG1();
        java.math.BigInteger g2 = parameters.getG2();
        java.math.BigInteger p2 = parameters.getP();
        org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = new org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters(parameters, g1.modPow(cramerShoupPrivateKeyParameters.getX1(), p2).multiply(g2.modPow(cramerShoupPrivateKeyParameters.getX2(), p2)), g1.modPow(cramerShoupPrivateKeyParameters.getY1(), p2).multiply(g2.modPow(cramerShoupPrivateKeyParameters.getY2(), p2)), g1.modPow(cramerShoupPrivateKeyParameters.getZ(), p2));
        cramerShoupPrivateKeyParameters.setPk(cramerShoupPublicKeyParameters);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) cramerShoupPublicKeyParameters, (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cramerShoupPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.CramerShoupKeyGenerationParameters) keyGenerationParameters;
    }
}
