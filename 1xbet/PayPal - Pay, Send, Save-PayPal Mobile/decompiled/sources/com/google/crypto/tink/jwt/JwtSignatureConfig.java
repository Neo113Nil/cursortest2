package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtSignatureConfig {
    public static final java.lang.String JWT_ECDSA_PUBLIC_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getKeyType();
    public static final java.lang.String JWT_ECDSA_PRIVATE_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.getKeyType();
    public static final java.lang.String JWT_RSA_PKCS1_PRIVATE_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.getKeyType();
    public static final java.lang.String JWT_RSA_PKCS1_PUBLIC_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.getKeyType();
    public static final java.lang.String JWT_RSA_PSS_PRIVATE_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager.getKeyType();
    public static final java.lang.String JWT_RSA_PSS_PUBLIC_KEY_TYPE_URL = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.getKeyType();
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance();

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.register();
        com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.register();
        com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.registerPair(true);
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.registerPair(true);
        com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager.registerPair(true);
    }

    private JwtSignatureConfig() {
    }
}
