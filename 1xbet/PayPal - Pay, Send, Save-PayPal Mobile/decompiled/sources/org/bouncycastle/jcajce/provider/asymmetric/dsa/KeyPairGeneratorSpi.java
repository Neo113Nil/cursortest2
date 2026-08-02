package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.crypto.generators.DSAKeyPairGenerator Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.params.DSAKeyGenerationParameters getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.security.SecureRandom getHighSpeedVideoSizes;
    private static java.util.Hashtable getInputFormats = new java.util.Hashtable();
    private static java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof java.security.spec.DSAParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        java.security.spec.DSAParameterSpec dSAParameterSpec = (java.security.spec.DSAParameterSpec) algorithmParameterSpec;
        org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.DSAParameters(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters;
        this.Camera2StreamConfigurationMap.init(dSAKeyGenerationParameters);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        boolean z;
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new java.security.InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        java.security.spec.DSAParameterSpec dSADefaultParameters = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i);
        if (dSADefaultParameters != null) {
            org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.DSAParameters(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters;
            this.Camera2StreamConfigurationMap.init(dSAKeyGenerationParameters);
            z = true;
        } else {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = secureRandom;
            z = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.generators.DSAParametersGenerator dSAParametersGenerator;
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.Integer valueOf = org.bouncycastle.util.Integers.valueOf(this.getHighSpeedVideoFpsRangesFor);
            if (getInputFormats.containsKey(valueOf)) {
                this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.DSAKeyGenerationParameters) getInputFormats.get(valueOf);
            } else {
                synchronized (getHighSpeedVideoSizesFor) {
                    if (getInputFormats.containsKey(valueOf)) {
                        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.DSAKeyGenerationParameters) getInputFormats.get(valueOf);
                    } else {
                        int defaultCertainty = org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(this.getHighSpeedVideoFpsRangesFor);
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        if (i == 1024) {
                            dSAParametersGenerator = new org.bouncycastle.crypto.generators.DSAParametersGenerator();
                            if (!org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                dSAParametersGenerator.init(new org.bouncycastle.crypto.params.DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.getHighSpeedVideoSizes));
                                org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(this.getHighSpeedVideoSizes, dSAParametersGenerator.generateParameters());
                                this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters;
                                getInputFormats.put(valueOf, dSAKeyGenerationParameters);
                            }
                            dSAParametersGenerator.init(this.getHighSpeedVideoFpsRangesFor, defaultCertainty, this.getHighSpeedVideoSizes);
                            org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters2 = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(this.getHighSpeedVideoSizes, dSAParametersGenerator.generateParameters());
                            this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters2;
                            getInputFormats.put(valueOf, dSAKeyGenerationParameters2);
                        } else if (i > 1024) {
                            org.bouncycastle.crypto.params.DSAParameterGenerationParameters dSAParameterGenerationParameters = new org.bouncycastle.crypto.params.DSAParameterGenerationParameters(i, 256, defaultCertainty, this.getHighSpeedVideoSizes);
                            dSAParametersGenerator = new org.bouncycastle.crypto.generators.DSAParametersGenerator(new org.bouncycastle.crypto.digests.SHA256Digest());
                            dSAParametersGenerator.init(dSAParameterGenerationParameters);
                            org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters22 = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(this.getHighSpeedVideoSizes, dSAParametersGenerator.generateParameters());
                            this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters22;
                            getInputFormats.put(valueOf, dSAKeyGenerationParameters22);
                        } else {
                            dSAParametersGenerator = new org.bouncycastle.crypto.generators.DSAParametersGenerator();
                            dSAParametersGenerator.init(this.getHighSpeedVideoFpsRangesFor, defaultCertainty, this.getHighSpeedVideoSizes);
                            org.bouncycastle.crypto.params.DSAKeyGenerationParameters dSAKeyGenerationParameters222 = new org.bouncycastle.crypto.params.DSAKeyGenerationParameters(this.getHighSpeedVideoSizes, dSAParametersGenerator.generateParameters());
                            this.getHighSpeedVideoFpsRanges = dSAKeyGenerationParameters222;
                            getInputFormats.put(valueOf, dSAKeyGenerationParameters222);
                        }
                    }
                }
            }
            this.Camera2StreamConfigurationMap.init(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.Camera2StreamConfigurationMap.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey((org.bouncycastle.crypto.params.DSAPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPrivateKey((org.bouncycastle.crypto.params.DSAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.generators.DSAKeyPairGenerator();
        this.getHighSpeedVideoFpsRangesFor = 2048;
        this.getHighSpeedVideoSizes = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }
}
