package com.nimbusds.jose.crypto.bc;

/* loaded from: classes10.dex */
public final class BouncyCastleProviderSingleton {
    private static org.bouncycastle.jce.provider.BouncyCastleProvider bouncyCastleProvider;

    private BouncyCastleProviderSingleton() {
    }

    public static org.bouncycastle.jce.provider.BouncyCastleProvider getInstance() {
        if (bouncyCastleProvider == null) {
            bouncyCastleProvider = new org.bouncycastle.jce.provider.BouncyCastleProvider();
        }
        return bouncyCastleProvider;
    }
}
