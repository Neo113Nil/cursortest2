package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AeadConfig {

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0;
    public static final java.lang.String AES_CTR_HMAC_AEAD_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    public static final java.lang.String AES_GCM_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesGcmKey");
    public static final java.lang.String AES_GCM_SIV_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
    public static final java.lang.String AES_EAX_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.AesEaxKey");
    public static final java.lang.String KMS_AEAD_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.KmsAeadKey");
    public static final java.lang.String KMS_ENVELOPE_AEAD_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    public static final java.lang.String CHACHA20_POLY1305_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
    public static final java.lang.String XCHACHA20_POLY1305_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

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
        com.google.crypto.tink.aead.AeadWrapper.register();
        com.google.crypto.tink.mac.MacConfig.register();
        com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.register(true);
        com.google.crypto.tink.aead.AesGcmKeyManager.register(true);
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.aead.AesEaxKeyManager.register(true);
        com.google.crypto.tink.aead.AesGcmSivKeyManager.register(true);
        com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager.register(true);
        com.google.crypto.tink.aead.KmsAeadKeyManager.register(true);
        com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.register(true);
        com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.register(true);
        com.google.crypto.tink.aead.XAesGcmKeyManager.register(true);
    }

    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
        register();
    }

    private AeadConfig() {
    }
}
