package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface JwtPublicKeyVerifyInternal {
    com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecodeWithKid(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator, java.util.Optional<java.lang.String> optional) throws java.security.GeneralSecurityException;
}
