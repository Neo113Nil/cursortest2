package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtMacConfig {
    public static final java.lang.String JWT_HMAC_TYPE_URL = com.google.crypto.tink.jwt.JwtHmacKeyManager.getKeyType();

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.jwt.JwtHmacKeyManager.register(true);
        com.google.crypto.tink.jwt.JwtMacWrapper.register();
    }

    private JwtMacConfig() {
    }
}
