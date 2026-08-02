package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.params.DHKeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator getHighSpeedVideoSizes;
    private static java.util.Hashtable getOutputMinFrameDuration = new java.util.Hashtable();
    private static java.lang.Object getInputSizeshNQ4ISI = new java.lang.Object();

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.DHParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            org.bouncycastle.crypto.params.DHKeyGenerationParameters highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(secureRandom, (javax.crypto.spec.DHParameterSpec) algorithmParameterSpec);
            this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.init(highSpeedVideoFpsRangesFor);
            this.Camera2StreamConfigurationMap = true;
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.security.InvalidAlgorithmParameterException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = secureRandom;
        this.Camera2StreamConfigurationMap = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.DHKeyGenerationParameters highSpeedVideoFpsRangesFor;
        if (!this.Camera2StreamConfigurationMap) {
            java.lang.Integer valueOf = org.bouncycastle.util.Integers.valueOf(this.getHighSpeedVideoFpsRanges);
            if (getOutputMinFrameDuration.containsKey(valueOf)) {
                highSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.DHKeyGenerationParameters) getOutputMinFrameDuration.get(valueOf);
            } else {
                javax.crypto.spec.DHParameterSpec dHDefaultParameters = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.getHighSpeedVideoFpsRanges);
                if (dHDefaultParameters != null) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, dHDefaultParameters);
                } else {
                    synchronized (getInputSizeshNQ4ISI) {
                        if (getOutputMinFrameDuration.containsKey(valueOf)) {
                            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.DHKeyGenerationParameters) getOutputMinFrameDuration.get(valueOf);
                        } else {
                            org.bouncycastle.crypto.generators.DHParametersGenerator dHParametersGenerator = new org.bouncycastle.crypto.generators.DHParametersGenerator();
                            int i = this.getHighSpeedVideoFpsRanges;
                            dHParametersGenerator.init(i, org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(i), this.getHighSpeedVideoFpsRangesFor);
                            org.bouncycastle.crypto.params.DHKeyGenerationParameters dHKeyGenerationParameters = new org.bouncycastle.crypto.params.DHKeyGenerationParameters(this.getHighSpeedVideoFpsRangesFor, dHParametersGenerator.generateParameters());
                            this.getHighResolutionOutputSizeshNQ4ISI = dHKeyGenerationParameters;
                            getOutputMinFrameDuration.put(valueOf, dHKeyGenerationParameters);
                        }
                    }
                    this.getHighSpeedVideoSizes.init(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.Camera2StreamConfigurationMap = true;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.init(this.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoSizes.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey((org.bouncycastle.crypto.params.DHPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey((org.bouncycastle.crypto.params.DHPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    private static org.bouncycastle.crypto.params.DHKeyGenerationParameters getHighSpeedVideoFpsRangesFor(java.security.SecureRandom secureRandom, javax.crypto.spec.DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec ? new org.bouncycastle.crypto.params.DHKeyGenerationParameters(secureRandom, ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) dHParameterSpec).getDomainParameters()) : new org.bouncycastle.crypto.params.DHKeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.DHParameters(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    public KeyPairGeneratorSpi() {
        super("DH");
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator();
        this.getHighSpeedVideoFpsRanges = 2048;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.Camera2StreamConfigurationMap = false;
    }
}
