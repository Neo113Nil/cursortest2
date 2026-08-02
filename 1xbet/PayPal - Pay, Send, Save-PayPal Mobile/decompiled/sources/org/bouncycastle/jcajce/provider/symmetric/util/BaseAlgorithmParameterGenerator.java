package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseAlgorithmParameterGenerator extends java.security.AlgorithmParameterGeneratorSpi {
    protected java.security.SecureRandom random;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, java.security.SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        return this.getHighResolutionOutputSizeshNQ4ISI.createAlgorithmParameters(str);
    }
}
