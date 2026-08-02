package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
public class LMSKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private org.bouncycastle.crypto.KeyGenerationParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator hSSKeyPairGenerator;
        if (algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec) {
            org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec lMSKeyGenParameterSpec = (org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec) algorithmParameterSpec;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.lms.LMSParameters(lMSKeyGenParameterSpec.getSigParams(), lMSKeyGenParameterSpec.getOtsParams()), secureRandom);
            hSSKeyPairGenerator = new org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator();
        } else {
            int i = 0;
            if (algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.LMSHSSKeyGenParameterSpec) {
                org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec[] lMSSpecs = ((org.bouncycastle.pqc.jcajce.spec.LMSHSSKeyGenParameterSpec) algorithmParameterSpec).getLMSSpecs();
                org.bouncycastle.pqc.crypto.lms.LMSParameters[] lMSParametersArr = new org.bouncycastle.pqc.crypto.lms.LMSParameters[lMSSpecs.length];
                while (i != lMSSpecs.length) {
                    lMSParametersArr[i] = new org.bouncycastle.pqc.crypto.lms.LMSParameters(lMSSpecs[i].getSigParams(), lMSSpecs[i].getOtsParams());
                    i++;
                }
                this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters(lMSParametersArr, secureRandom);
                hSSKeyPairGenerator = new org.bouncycastle.pqc.crypto.lms.HSSKeyPairGenerator();
            } else if (algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec) {
                org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec lMSParameterSpec = (org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec) algorithmParameterSpec;
                this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.lms.LMSParameters(lMSParameterSpec.getSigParams(), lMSParameterSpec.getOtsParams()), secureRandom);
                hSSKeyPairGenerator = new org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator();
            } else {
                if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.LMSHSSParameterSpec)) {
                    throw new java.security.InvalidAlgorithmParameterException("parameter object not a LMSParameterSpec/LMSHSSParameterSpec");
                }
                org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[] lMSSpecs2 = ((org.bouncycastle.pqc.jcajce.spec.LMSHSSParameterSpec) algorithmParameterSpec).getLMSSpecs();
                org.bouncycastle.pqc.crypto.lms.LMSParameters[] lMSParametersArr2 = new org.bouncycastle.pqc.crypto.lms.LMSParameters[lMSSpecs2.length];
                while (i != lMSSpecs2.length) {
                    lMSParametersArr2[i] = new org.bouncycastle.pqc.crypto.lms.LMSParameters(lMSSpecs2[i].getSigParams(), lMSSpecs2[i].getOtsParams());
                    i++;
                }
                this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters(lMSParametersArr2, secureRandom);
                hSSKeyPairGenerator = new org.bouncycastle.pqc.crypto.lms.HSSKeyPairGenerator();
            }
        }
        this.getHighSpeedVideoFpsRanges = hSSKeyPairGenerator;
        hSSKeyPairGenerator.init(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters lMSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.lms.LMSParameters(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h10, org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w2), this.getHighSpeedVideoSizes);
            this.Camera2StreamConfigurationMap = lMSKeyGenerationParameters;
            this.getHighSpeedVideoFpsRanges.init(lMSKeyGenerationParameters);
            this.getHighSpeedVideoFpsRangesFor = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRanges.generateKeyPair();
        if (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator) {
            return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey((org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) generateKeyPair.getPrivate()));
        }
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey((org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey((org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public LMSKeyPairGeneratorSpi() {
        super("LMS");
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator();
        this.getHighSpeedVideoSizes = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighSpeedVideoFpsRangesFor = false;
    }
}
