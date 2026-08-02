package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtNames {
    static final java.lang.String CLAIM_AUDIENCE = "aud";
    static final java.lang.String CLAIM_EXPIRATION = "exp";
    static final java.lang.String CLAIM_ISSUED_AT = "iat";
    static final java.lang.String CLAIM_ISSUER = "iss";
    static final java.lang.String CLAIM_JWT_ID = "jti";
    static final java.lang.String CLAIM_NOT_BEFORE = "nbf";
    static final java.lang.String CLAIM_SUBJECT = "sub";
    static final java.lang.String HEADER_ALGORITHM = "alg";
    static final java.lang.String HEADER_CRITICAL = "crit";
    static final java.lang.String HEADER_KEY_ID = "kid";
    static final java.lang.String HEADER_TYPE = "typ";

    static void validate(java.lang.String str) {
        if (isRegisteredName(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("claim '%s' is invalid because it's a registered name; use the corresponding setter method.", str));
        }
    }

    static boolean isRegisteredName(java.lang.String str) {
        return str.equals("iss") || str.equals("sub") || str.equals("aud") || str.equals("exp") || str.equals("nbf") || str.equals("iat") || str.equals("jti");
    }

    private JwtNames() {
    }
}
