package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class AlgorithmParameterGeneratorSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi {
    protected org.bouncycastle.crypto.params.DSAParameterGenerationParameters params;
    protected java.security.SecureRandom random;
    protected int strength = 2048;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, java.security.SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            throw new java.security.InvalidParameterException("strength must be from 512 - 3072");
        }
        if (i <= 1024 && i % 64 != 0) {
            throw new java.security.InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }
        if (i > 1024 && i % 1024 != 0) {
            throw new java.security.InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
        this.strength = i;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected java.security.AlgorithmParameters engineGenerateParameters() {
        org.bouncycastle.crypto.generators.DSAParametersGenerator dSAParametersGenerator = this.strength <= 1024 ? new org.bouncycastle.crypto.generators.DSAParametersGenerator() : new org.bouncycastle.crypto.generators.DSAParametersGenerator(new org.bouncycastle.crypto.digests.SHA256Digest());
        if (this.random == null) {
            this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        int defaultCertainty = org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i = this.strength;
        if (i == 1024) {
            org.bouncycastle.crypto.params.DSAParameterGenerationParameters dSAParameterGenerationParameters = new org.bouncycastle.crypto.params.DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.random);
            this.params = dSAParameterGenerationParameters;
            dSAParametersGenerator.init(dSAParameterGenerationParameters);
        } else if (i > 1024) {
            org.bouncycastle.crypto.params.DSAParameterGenerationParameters dSAParameterGenerationParameters2 = new org.bouncycastle.crypto.params.DSAParameterGenerationParameters(i, 256, defaultCertainty, this.random);
            this.params = dSAParameterGenerationParameters2;
            dSAParametersGenerator.init(dSAParameterGenerationParameters2);
        } else {
            dSAParametersGenerator.init(i, defaultCertainty, this.random);
        }
        org.bouncycastle.crypto.params.DSAParameters generateParameters = dSAParametersGenerator.generateParameters();
        try {
            java.security.AlgorithmParameters createParametersInstance = createParametersInstance("DSA");
            createParametersInstance.init(new java.security.spec.DSAParameterSpec(generateParameters.getP(), generateParameters.getQ(), generateParameters.getG()));
            return createParametersInstance;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }
}
