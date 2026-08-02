package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator getHighResolutionOutputSizeshNQ4ISI;
    java.security.SecureRandom getHighSpeedVideoFpsRanges;
    org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters elGamalKeyGenerationParameters;
        boolean z = algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ElGamalParameterSpec;
        if (!z && !(algorithmParameterSpec instanceof javax.crypto.spec.DHParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (z) {
            org.bouncycastle.jce.spec.ElGamalParameterSpec elGamalParameterSpec = (org.bouncycastle.jce.spec.ElGamalParameterSpec) algorithmParameterSpec;
            elGamalKeyGenerationParameters = new org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.ElGamalParameters(elGamalParameterSpec.getP(), elGamalParameterSpec.getG()));
        } else {
            javax.crypto.spec.DHParameterSpec dHParameterSpec = (javax.crypto.spec.DHParameterSpec) algorithmParameterSpec;
            elGamalKeyGenerationParameters = new org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.ElGamalParameters(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.getHighSpeedVideoFpsRangesFor = elGamalKeyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(elGamalKeyGenerationParameters);
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizesFor = i;
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters elGamalKeyGenerationParameters;
        if (!this.Camera2StreamConfigurationMap) {
            javax.crypto.spec.DHParameterSpec dHDefaultParameters = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.getHighSpeedVideoSizesFor);
            if (dHDefaultParameters != null) {
                elGamalKeyGenerationParameters = new org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters(this.getHighSpeedVideoFpsRanges, new org.bouncycastle.crypto.params.ElGamalParameters(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                org.bouncycastle.crypto.generators.ElGamalParametersGenerator elGamalParametersGenerator = new org.bouncycastle.crypto.generators.ElGamalParametersGenerator();
                elGamalParametersGenerator.init(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
                elGamalKeyGenerationParameters = new org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters(this.getHighSpeedVideoFpsRanges, elGamalParametersGenerator.generateParameters());
            }
            this.getHighSpeedVideoFpsRangesFor = elGamalKeyGenerationParameters;
            this.getHighResolutionOutputSizeshNQ4ISI.init(elGamalKeyGenerationParameters);
            this.Camera2StreamConfigurationMap = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighResolutionOutputSizeshNQ4ISI.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey((org.bouncycastle.crypto.params.ElGamalPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey((org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator();
        this.getHighSpeedVideoSizesFor = 1024;
        this.getHighSpeedVideoSizes = 20;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.Camera2StreamConfigurationMap = false;
    }
}
