package com.google.crypto.tink.config;

/* loaded from: classes9.dex */
public final class TinkConfig {

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

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
        com.google.crypto.tink.daead.DeterministicAeadConfig.register();
        com.google.crypto.tink.hybrid.HybridConfig.register();
        com.google.crypto.tink.prf.PrfConfig.register();
        com.google.crypto.tink.signature.SignatureConfig.register();
        com.google.crypto.tink.streamingaead.StreamingAeadConfig.register();
    }

    private TinkConfig() {
    }
}
