package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface JwtMac {
    java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException;
}
