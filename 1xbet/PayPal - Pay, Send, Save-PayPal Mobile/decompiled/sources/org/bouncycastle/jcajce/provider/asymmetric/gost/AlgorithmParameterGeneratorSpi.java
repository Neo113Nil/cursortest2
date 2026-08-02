package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class AlgorithmParameterGeneratorSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi {
    protected java.security.SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, java.security.SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected java.security.AlgorithmParameters engineGenerateParameters() {
        org.bouncycastle.crypto.generators.GOST3410ParametersGenerator gOST3410ParametersGenerator = new org.bouncycastle.crypto.generators.GOST3410ParametersGenerator();
        java.security.SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            gOST3410ParametersGenerator.init(this.strength, 2, secureRandom);
        } else {
            gOST3410ParametersGenerator.init(this.strength, 2, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
        }
        org.bouncycastle.crypto.params.GOST3410Parameters generateParameters = gOST3410ParametersGenerator.generateParameters();
        try {
            java.security.AlgorithmParameters createParametersInstance = createParametersInstance("GOST3410");
            createParametersInstance.init(new org.bouncycastle.jce.spec.GOST3410ParameterSpec(new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec(generateParameters.getP(), generateParameters.getQ(), generateParameters.getA())));
            return createParametersInstance;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
    }
}
