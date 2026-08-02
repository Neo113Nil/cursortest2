package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public abstract class ECDSAProvider extends com.nimbusds.jose.crypto.impl.BaseJWSProvider {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS;

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.ES256);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.ES256K);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.ES384);
        linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.ES512);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDSAProvider(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        super(java.util.Collections.singleton(jWSAlgorithm));
        if (!SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
            throw new com.nimbusds.jose.JOSEException("Unsupported EC DSA algorithm: ".concat(java.lang.String.valueOf(jWSAlgorithm)));
        }
    }

    public com.nimbusds.jose.JWSAlgorithm supportedECDSAAlgorithm() {
        return supportedJWSAlgorithms().iterator().next();
    }
}
