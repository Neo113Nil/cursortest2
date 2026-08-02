package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public abstract class BaseJWSProvider implements com.nimbusds.jose.JWSProvider {
    private final java.util.Set<com.nimbusds.jose.JWSAlgorithm> algs;
    private final com.nimbusds.jose.jca.JCAContext jcaContext = new com.nimbusds.jose.jca.JCAContext();

    public BaseJWSProvider(java.util.Set<com.nimbusds.jose.JWSAlgorithm> set) {
        if (set == null) {
            throw new java.lang.IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.algs = java.util.Collections.unmodifiableSet(set);
    }

    @Override // com.nimbusds.jose.JWSProvider
    public java.util.Set<com.nimbusds.jose.JWSAlgorithm> supportedJWSAlgorithms() {
        return this.algs;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public com.nimbusds.jose.jca.JCAContext getJCAContext() {
        return this.jcaContext;
    }
}
