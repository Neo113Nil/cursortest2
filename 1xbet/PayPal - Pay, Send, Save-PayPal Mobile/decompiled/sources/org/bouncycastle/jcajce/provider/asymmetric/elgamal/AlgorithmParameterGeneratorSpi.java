package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class AlgorithmParameterGeneratorSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi {
    protected java.security.SecureRandom random;
    protected int strength = 1024;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.DHGenParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        javax.crypto.spec.DHGenParameterSpec dHGenParameterSpec = (javax.crypto.spec.DHGenParameterSpec) algorithmParameterSpec;
        this.strength = dHGenParameterSpec.getPrimeSize();
        this.getHighResolutionOutputSizeshNQ4ISI = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, java.security.SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected java.security.AlgorithmParameters engineGenerateParameters() {
        org.bouncycastle.crypto.generators.ElGamalParametersGenerator elGamalParametersGenerator = new org.bouncycastle.crypto.generators.ElGamalParametersGenerator();
        java.security.SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            elGamalParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            elGamalParametersGenerator.init(this.strength, 20, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
        }
        org.bouncycastle.crypto.params.ElGamalParameters generateParameters = elGamalParametersGenerator.generateParameters();
        try {
            java.security.AlgorithmParameters createParametersInstance = createParametersInstance("ElGamal");
            createParametersInstance.init(new javax.crypto.spec.DHParameterSpec(generateParameters.getP(), generateParameters.getG(), this.getHighResolutionOutputSizeshNQ4ISI));
            return createParametersInstance;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }
}
