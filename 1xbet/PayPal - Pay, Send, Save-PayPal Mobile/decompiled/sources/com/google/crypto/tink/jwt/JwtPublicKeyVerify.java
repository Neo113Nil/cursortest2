package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface JwtPublicKeyVerify {
    com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException;
}
