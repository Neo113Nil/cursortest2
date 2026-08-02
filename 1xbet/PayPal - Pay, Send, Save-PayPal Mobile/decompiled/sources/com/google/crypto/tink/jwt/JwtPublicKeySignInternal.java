package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface JwtPublicKeySignInternal {
    java.lang.String signAndEncodeWithKid(com.google.crypto.tink.jwt.RawJwt rawJwt, java.util.Optional<java.lang.String> optional) throws java.security.GeneralSecurityException;
}
