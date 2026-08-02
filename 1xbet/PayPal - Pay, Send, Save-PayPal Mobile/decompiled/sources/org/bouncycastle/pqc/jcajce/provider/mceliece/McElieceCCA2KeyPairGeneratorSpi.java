package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator getHighSpeedVideoFpsRanges;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator();
        org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec mcElieceCCA2KeyGenParameterSpec = (org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec) algorithmParameterSpec;
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters(mcElieceCCA2KeyGenParameterSpec.getM(), mcElieceCCA2KeyGenParameterSpec.getT(), mcElieceCCA2KeyGenParameterSpec.getDigest())));
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator();
        org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec mcElieceCCA2KeyGenParameterSpec = (org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec) algorithmParameterSpec;
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters(mcElieceCCA2KeyGenParameterSpec.getM(), mcElieceCCA2KeyGenParameterSpec.getT(), mcElieceCCA2KeyGenParameterSpec.getDigest())));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator();
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRanges.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public McElieceCCA2KeyPairGeneratorSpi() {
        super("McEliece-CCA2");
    }
}
