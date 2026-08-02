package com.nimbusds.jose;

/* loaded from: classes10.dex */
public interface JWEProvider extends com.nimbusds.jose.JOSEProvider, com.nimbusds.jose.jca.JCAAware<com.nimbusds.jose.jca.JWEJCAContext> {
    java.util.Set<com.nimbusds.jose.EncryptionMethod> supportedEncryptionMethods();

    java.util.Set<com.nimbusds.jose.JWEAlgorithm> supportedJWEAlgorithms();
}
