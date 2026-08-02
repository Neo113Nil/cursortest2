package com.nimbusds.jwt.proc;

/* loaded from: classes10.dex */
public interface JWTClaimsSetVerifier<C extends com.nimbusds.jose.proc.SecurityContext> {
    void verify(com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, C c) throws com.nimbusds.jwt.proc.BadJWTException;
}
