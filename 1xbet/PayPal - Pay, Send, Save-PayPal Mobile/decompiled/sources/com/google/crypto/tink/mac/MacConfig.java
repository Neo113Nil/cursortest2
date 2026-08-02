package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class MacConfig {
    public static final java.lang.String HMAC_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.HmacKey");

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0;

    private static java.lang.String initializeClassReturnInput(java.lang.String str) {
        return str;
    }

    static {
        com.google.crypto.tink.proto.RegistryConfig defaultInstance = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();
        TINK_1_0_0 = defaultInstance;
        TINK_1_1_0 = defaultInstance;
        LATEST = defaultInstance;
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
        com.google.crypto.tink.mac.MacWrapper.register();
        com.google.crypto.tink.mac.ChunkedMacWrapper.register();
        com.google.crypto.tink.mac.HmacKeyManager.register(true);
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.mac.AesCmacKeyManager.register(true);
    }

    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
        register();
    }

    private MacConfig() {
    }
}
