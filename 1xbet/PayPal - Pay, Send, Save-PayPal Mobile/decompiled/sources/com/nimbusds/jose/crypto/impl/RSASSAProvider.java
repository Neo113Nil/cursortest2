package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class RSASSAProvider extends com.nimbusds.jose.crypto.impl.BaseJWSProvider {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.RS256);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.RS384);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.RS512);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.PS256);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.PS384);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.PS512);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public RSASSAProvider() {
        super(SUPPORTED_ALGORITHMS);
    }
}
