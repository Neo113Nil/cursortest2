package com.google.crypto.tink.daead;

/* loaded from: classes4.dex */
public final class DeterministicAeadConfig {
    public static final java.lang.String AES_SIV_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesSivKey");

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    private static java.lang.String initializeClassReturnInput(java.lang.String str) {
        return str;
    }

    static {
        try {
            register();
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.ExceptionInInitializerError(e);
        }
    }

    @java.lang.Deprecated
    public static void init() throws java.security.GeneralSecurityException {
        register();
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.daead.DeterministicAeadWrapper.register();
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.daead.AesSivKeyManager.register(true);
    }

    private DeterministicAeadConfig() {
    }
}
