package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class JWECryptoParts {
    private final com.nimbusds.jose.util.Base64URL authenticationTag;
    private final com.nimbusds.jose.util.Base64URL cipherText;
    private final com.nimbusds.jose.util.Base64URL encryptedKey;
    private final com.nimbusds.jose.JWEHeader header;
    private final com.nimbusds.jose.util.Base64URL iv;

    public JWECryptoParts(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) {
        this(null, base64URL, base64URL2, base64URL3, base64URL4);
    }

    public JWECryptoParts(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) {
        this.header = jWEHeader;
        this.encryptedKey = base64URL;
        this.iv = base64URL2;
        if (base64URL3 == null) {
            throw new java.lang.IllegalArgumentException("The cipher text must not be null");
        }
        this.cipherText = base64URL3;
        this.authenticationTag = base64URL4;
    }

    public final com.nimbusds.jose.JWEHeader getHeader() {
        return this.header;
    }

    public final com.nimbusds.jose.util.Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public final com.nimbusds.jose.util.Base64URL getInitializationVector() {
        return this.iv;
    }

    public final com.nimbusds.jose.util.Base64URL getCipherText() {
        return this.cipherText;
    }

    public final com.nimbusds.jose.util.Base64URL getAuthenticationTag() {
        return this.authenticationTag;
    }
}
