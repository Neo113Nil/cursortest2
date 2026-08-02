package com.nimbusds.jose.mint;

/* loaded from: classes10.dex */
public interface JWSMinter<C extends com.nimbusds.jose.proc.SecurityContext> {
    com.nimbusds.jose.JWSObject mint(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.Payload payload, C c) throws com.nimbusds.jose.JOSEException;
}
