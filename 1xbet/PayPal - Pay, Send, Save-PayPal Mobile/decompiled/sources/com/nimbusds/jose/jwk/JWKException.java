package com.nimbusds.jose.jwk;

/* loaded from: classes10.dex */
public class JWKException extends com.nimbusds.jose.KeyException {
    public JWKException(java.lang.String str) {
        super(str);
    }

    public static com.nimbusds.jose.jwk.JWKException expectedClass(java.lang.Class<? extends com.nimbusds.jose.jwk.JWK> cls) {
        return new com.nimbusds.jose.jwk.JWKException("Invalid JWK: Must be an instance of ".concat(java.lang.String.valueOf(cls)));
    }

    public static com.nimbusds.jose.jwk.JWKException expectedPrivate() {
        return new com.nimbusds.jose.jwk.JWKException("Expected private JWK but none available");
    }
}
