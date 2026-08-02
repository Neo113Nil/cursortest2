package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi {
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.BCJcaJceHelper();

    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        return this.getHighResolutionOutputSizeshNQ4ISI.createAlgorithmParameters(str);
    }
}
