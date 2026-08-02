package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class HybridConfig {
    public static final java.lang.String ECIES_AEAD_HKDF_PUBLIC_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    public static final java.lang.String ECIES_AEAD_HKDF_PRIVATE_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    private static java.lang.String initializeClassReturnInput(java.lang.String str) {
        return str;
    }

    static {
        try {
            init();
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.ExceptionInInitializerError(e);
        }
    }

    @java.lang.Deprecated
    public static void init() throws java.security.GeneralSecurityException {
        register();
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HybridDecryptWrapper.register();
        com.google.crypto.tink.hybrid.HybridEncryptWrapper.register();
        com.google.crypto.tink.aead.AeadConfig.register();
        com.google.crypto.tink.daead.DeterministicAeadConfig.register();
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.registerPair(true);
        com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.registerPair(true);
    }

    private HybridConfig() {
    }
}
