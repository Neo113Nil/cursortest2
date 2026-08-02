package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JWSVerifierFactory extends com.nimbusds.jose.JWSProvider {
    com.nimbusds.jose.JWSVerifier createJWSVerifier(com.nimbusds.jose.JWSHeader jWSHeader, java.security.Key key) throws com.nimbusds.jose.JOSEException;
}
