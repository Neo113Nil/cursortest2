package org.bouncycastle.pqc.jcajce.provider.newhope;

/* loaded from: classes17.dex */
public class NHKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    java.security.SecureRandom Camera2StreamConfigurationMap;
    org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        throw new java.security.InvalidAlgorithmParameterException("parameter object not recognised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        if (i != 1024) {
            throw new java.lang.IllegalArgumentException("strength must be 1024 bits");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 1024));
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI.init(new org.bouncycastle.crypto.KeyGenerationParameters(this.Camera2StreamConfigurationMap, 1024));
            this.getHighSpeedVideoFpsRanges = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighResolutionOutputSizeshNQ4ISI.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey((org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public NHKeyPairGeneratorSpi() {
        super("NH");
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator();
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighSpeedVideoFpsRanges = false;
    }
}
