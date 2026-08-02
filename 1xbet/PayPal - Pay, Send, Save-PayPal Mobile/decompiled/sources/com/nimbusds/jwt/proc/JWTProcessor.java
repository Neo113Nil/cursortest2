package com.nimbusds.jwt.proc;

/* loaded from: classes10.dex */
public interface JWTProcessor<C extends com.nimbusds.jose.proc.SecurityContext> {
    com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.EncryptedJWT encryptedJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.JWT jwt, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.PlainJWT plainJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.SignedJWT signedJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jwt.JWTClaimsSet process(java.lang.String str, C c) throws java.text.ParseException, com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;
}
