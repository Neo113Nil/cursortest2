package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class SignatureConfig {
    public static final java.lang.String ECDSA_PUBLIC_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
    public static final java.lang.String ECDSA_PRIVATE_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
    public static final java.lang.String ED25519_PUBLIC_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
    public static final java.lang.String ED25519_PRIVATE_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
    public static final java.lang.String RSA_PKCS1_PRIVATE_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
    public static final java.lang.String RSA_PKCS1_PUBLIC_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
    public static final java.lang.String RSA_PSS_PRIVATE_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
    public static final java.lang.String RSA_PSS_PUBLIC_KEY_TYPE_URL = initializeClassReturnInput("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");

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
        com.google.crypto.tink.signature.PublicKeySignWrapper.register();
        com.google.crypto.tink.signature.PublicKeyVerifyWrapper.register();
        com.google.crypto.tink.signature.EcdsaSignKeyManager.registerPair(true);
        com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.registerPair(true);
        com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.registerPair(true);
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.signature.Ed25519PrivateKeyManager.registerPair(true);
    }

    private SignatureConfig() {
    }
}
