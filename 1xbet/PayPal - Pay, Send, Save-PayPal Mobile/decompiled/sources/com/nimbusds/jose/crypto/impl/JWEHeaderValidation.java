package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class JWEHeaderValidation {
    public static com.nimbusds.jose.JWEAlgorithm getAlgorithmAndEnsureNotNull(com.nimbusds.jose.JWEHeader jWEHeader) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (algorithm != null) {
            return algorithm;
        }
        throw new com.nimbusds.jose.JOSEException("The algorithm \"alg\" header parameter must not be null");
    }

    private JWEHeaderValidation() {
    }
}
