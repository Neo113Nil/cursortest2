package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class StreamingAeadConfig {
    public static final java.lang.String AES_CTR_HMAC_STREAMINGAEAD_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
    public static final java.lang.String AES_GCM_HKDF_STREAMINGAEAD_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();
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
        com.google.crypto.tink.streamingaead.StreamingAeadWrapper.register();
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.register(true);
        com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.register(true);
    }

    private StreamingAeadConfig() {
    }
}
