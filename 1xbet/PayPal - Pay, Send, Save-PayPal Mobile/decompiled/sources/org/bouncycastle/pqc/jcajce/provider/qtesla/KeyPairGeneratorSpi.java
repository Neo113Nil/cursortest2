package org.bouncycastle.pqc.jcajce.provider.qtesla;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyPairGenerator getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a QTESLAParameterSpec");
        }
        org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = new org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters(((java.lang.Integer) getHighSpeedVideoFpsRanges.get(((org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec) algorithmParameterSpec).getSecurityCategory())).intValue(), secureRandom);
        this.getHighSpeedVideoSizes = qTESLAKeyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(qTESLAKeyGenerationParameters);
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.Camera2StreamConfigurationMap) {
            org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = new org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters(6, this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoSizes = qTESLAKeyGenerationParameters;
            this.getHighResolutionOutputSizeshNQ4ISI.init(qTESLAKeyGenerationParameters);
            this.Camera2StreamConfigurationMap = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighResolutionOutputSizeshNQ4ISI.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey((org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey((org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public KeyPairGeneratorSpi() {
        super("qTESLA");
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyPairGenerator();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.Camera2StreamConfigurationMap = false;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put(org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(5), org.bouncycastle.util.Integers.valueOf(5));
        hashMap.put(org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(6), org.bouncycastle.util.Integers.valueOf(6));
    }
}
