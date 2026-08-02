package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class BCJcaJceHelper extends org.bouncycastle.jcajce.util.ProviderJcaJceHelper {
    private static volatile java.security.Provider getHighResolutionOutputSizeshNQ4ISI;

    private static java.security.Provider getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (org.bouncycastle.jcajce.util.BCJcaJceHelper.class) {
            java.security.Provider provider = java.security.Security.getProvider(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
            if (provider instanceof org.bouncycastle.jce.provider.BouncyCastleProvider) {
                return provider;
            }
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                return getHighResolutionOutputSizeshNQ4ISI;
            }
            org.bouncycastle.jce.provider.BouncyCastleProvider bouncyCastleProvider = new org.bouncycastle.jce.provider.BouncyCastleProvider();
            getHighResolutionOutputSizeshNQ4ISI = bouncyCastleProvider;
            return bouncyCastleProvider;
        }
    }

    public BCJcaJceHelper() {
        super(getHighResolutionOutputSizeshNQ4ISI());
    }
}
