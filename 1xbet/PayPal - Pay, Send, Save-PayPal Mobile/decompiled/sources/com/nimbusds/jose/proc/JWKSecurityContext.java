package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public class JWKSecurityContext implements com.nimbusds.jose.proc.SecurityContext {
    private final java.util.List<com.nimbusds.jose.jwk.JWK> keys;

    public JWKSecurityContext(java.util.List<com.nimbusds.jose.jwk.JWK> list) {
        this.keys = list;
        if (list == null) {
            throw new java.lang.IllegalArgumentException("The list of keys must not be null");
        }
    }

    public java.util.List<com.nimbusds.jose.jwk.JWK> getKeys() {
        return this.keys;
    }
}
