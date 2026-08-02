package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.pqc.crypto.mceliece.McElieceKeyPairGenerator getHighSpeedVideoFpsRanges;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.mceliece.McElieceKeyPairGenerator();
        org.bouncycastle.pqc.jcajce.spec.McElieceKeyGenParameterSpec mcElieceKeyGenParameterSpec = (org.bouncycastle.pqc.jcajce.spec.McElieceKeyGenParameterSpec) algorithmParameterSpec;
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.mceliece.McElieceParameters(mcElieceKeyGenParameterSpec.getM(), mcElieceKeyGenParameterSpec.getT())));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        try {
            initialize(new org.bouncycastle.pqc.jcajce.spec.McElieceKeyGenParameterSpec(), secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException unused) {
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRanges.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey((org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey((org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public McElieceKeyPairGeneratorSpi() {
        super("McEliece");
    }
}
