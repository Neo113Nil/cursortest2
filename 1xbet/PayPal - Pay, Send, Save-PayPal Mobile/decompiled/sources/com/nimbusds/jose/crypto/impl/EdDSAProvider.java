package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class EdDSAProvider extends com.nimbusds.jose.crypto.impl.BaseJWSProvider {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS = java.util.Collections.singleton(com.nimbusds.jose.JWSAlgorithm.EdDSA);

    public EdDSAProvider() {
        super(SUPPORTED_ALGORITHMS);
    }
}
