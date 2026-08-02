package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
public interface AsymmetricJWK {
    boolean matches(java.security.cert.X509Certificate x509Certificate);

    java.security.KeyPair toKeyPair() throws com.nimbusds.jose.JOSEException;

    java.security.PrivateKey toPrivateKey() throws com.nimbusds.jose.JOSEException;

    java.security.PublicKey toPublicKey() throws com.nimbusds.jose.JOSEException;
}
