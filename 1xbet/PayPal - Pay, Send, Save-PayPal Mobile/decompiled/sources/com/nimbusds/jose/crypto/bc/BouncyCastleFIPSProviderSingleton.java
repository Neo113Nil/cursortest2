package com.nimbusds.jose.crypto.bc;

/* loaded from: classes10.dex */
public final class BouncyCastleFIPSProviderSingleton {
    private static org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider bouncyCastleFIPSProvider;

    private BouncyCastleFIPSProviderSingleton() {
    }

    public static org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider getInstance() {
        if (bouncyCastleFIPSProvider == null) {
            bouncyCastleFIPSProvider = new org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider();
        }
        return bouncyCastleFIPSProvider;
    }
}
