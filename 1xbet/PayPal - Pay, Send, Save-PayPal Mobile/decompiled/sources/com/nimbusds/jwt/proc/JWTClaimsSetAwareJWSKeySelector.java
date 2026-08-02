package com.nimbusds.jwt.proc;

/* loaded from: classes10.dex */
public interface JWTClaimsSetAwareJWSKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> {
    java.util.List<? extends java.security.Key> selectKeys(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, C c) throws com.nimbusds.jose.KeySourceException;
}
