package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public class SingleKeyJWSKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.proc.JWSKeySelector<C> {
    private final com.nimbusds.jose.JWSAlgorithm expectedJWSAlg;
    private final java.util.List<java.security.Key> singletonKeyList;

    public SingleKeyJWSKeySelector(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, java.security.Key key) {
        if (jWSAlgorithm == null) {
            throw new java.lang.IllegalArgumentException("The expected JWS algorithm cannot be null");
        }
        if (key == null) {
            throw new java.lang.IllegalArgumentException("The key cannot be null");
        }
        this.singletonKeyList = java.util.Collections.singletonList(key);
        this.expectedJWSAlg = jWSAlgorithm;
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public java.util.List<? extends java.security.Key> selectJWSKeys(com.nimbusds.jose.JWSHeader jWSHeader, C c) {
        if (!this.expectedJWSAlg.equals(jWSHeader.getAlgorithm())) {
            return java.util.Collections.emptyList();
        }
        return this.singletonKeyList;
    }
}
