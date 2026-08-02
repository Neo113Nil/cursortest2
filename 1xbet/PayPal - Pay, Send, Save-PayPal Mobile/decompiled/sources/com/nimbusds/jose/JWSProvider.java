package com.nimbusds.jose;

/* loaded from: classes4.dex */
public interface JWSProvider extends com.nimbusds.jose.JOSEProvider, com.nimbusds.jose.jca.JCAAware<com.nimbusds.jose.jca.JCAContext> {
    java.util.Set<com.nimbusds.jose.JWSAlgorithm> supportedJWSAlgorithms();
}
