package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JWEDecrypterFactory extends com.nimbusds.jose.JWEProvider {
    com.nimbusds.jose.JWEDecrypter createJWEDecrypter(com.nimbusds.jose.JWEHeader jWEHeader, java.security.Key key) throws com.nimbusds.jose.JOSEException;
}
