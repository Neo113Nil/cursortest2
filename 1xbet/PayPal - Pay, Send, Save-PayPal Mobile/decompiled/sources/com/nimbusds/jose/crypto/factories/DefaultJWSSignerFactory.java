package com.nimbusds.jose.crypto.factories;

/* loaded from: classes10.dex */
public class DefaultJWSSignerFactory implements com.nimbusds.jose.produce.JWSSignerFactory {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS;
    private final com.nimbusds.jose.jca.JCAContext jcaContext = new com.nimbusds.jose.jca.JCAContext();

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(com.nimbusds.jose.crypto.MACSigner.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.RSASSASigner.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.ECDSASigner.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.Ed25519Signer.SUPPORTED_ALGORITHMS);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // com.nimbusds.jose.JWSProvider
    public java.util.Set<com.nimbusds.jose.JWSAlgorithm> supportedJWSAlgorithms() {
        return SUPPORTED_ALGORITHMS;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public com.nimbusds.jose.jca.JCAContext getJCAContext() {
        return this.jcaContext;
    }

    @Override // com.nimbusds.jose.produce.JWSSignerFactory
    public com.nimbusds.jose.JWSSigner createJWSSigner(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWSSigner ed25519Signer;
        if (!jwk.isPrivate()) {
            throw com.nimbusds.jose.jwk.JWKException.expectedPrivate();
        }
        if (jwk.getKeyUse() != null && !com.nimbusds.jose.jwk.KeyUse.SIGNATURE.equals(jwk.getKeyUse())) {
            throw new com.nimbusds.jose.jwk.JWKException("The JWK use must be sig (signature) or unspecified");
        }
        if (jwk instanceof com.nimbusds.jose.jwk.OctetSequenceKey) {
            ed25519Signer = new com.nimbusds.jose.crypto.MACSigner((com.nimbusds.jose.jwk.OctetSequenceKey) jwk);
        } else if (jwk instanceof com.nimbusds.jose.jwk.RSAKey) {
            ed25519Signer = new com.nimbusds.jose.crypto.RSASSASigner((com.nimbusds.jose.jwk.RSAKey) jwk);
        } else if (jwk instanceof com.nimbusds.jose.jwk.ECKey) {
            ed25519Signer = new com.nimbusds.jose.crypto.ECDSASigner((com.nimbusds.jose.jwk.ECKey) jwk);
        } else if (jwk instanceof com.nimbusds.jose.jwk.OctetKeyPair) {
            ed25519Signer = new com.nimbusds.jose.crypto.Ed25519Signer((com.nimbusds.jose.jwk.OctetKeyPair) jwk);
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported JWK type: ".concat(java.lang.String.valueOf(jwk)));
        }
        ed25519Signer.getJCAContext().setSecureRandom(this.jcaContext.getSecureRandom());
        ed25519Signer.getJCAContext().setProvider(this.jcaContext.getProvider());
        return ed25519Signer;
    }

    @Override // com.nimbusds.jose.produce.JWSSignerFactory
    public com.nimbusds.jose.JWSSigner createJWSSigner(com.nimbusds.jose.jwk.JWK jwk, com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWSSigner ed25519Signer;
        if (!jwk.isPrivate()) {
            throw com.nimbusds.jose.jwk.JWKException.expectedPrivate();
        }
        if (jwk.getKeyUse() != null && !com.nimbusds.jose.jwk.KeyUse.SIGNATURE.equals(jwk.getKeyUse())) {
            throw new com.nimbusds.jose.jwk.JWKException("The JWK use must be sig (signature) or unspecified");
        }
        if (com.nimbusds.jose.crypto.MACSigner.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
            if (!(jwk instanceof com.nimbusds.jose.jwk.OctetSequenceKey)) {
                throw com.nimbusds.jose.jwk.JWKException.expectedClass(com.nimbusds.jose.jwk.OctetSequenceKey.class);
            }
            ed25519Signer = new com.nimbusds.jose.crypto.MACSigner((com.nimbusds.jose.jwk.OctetSequenceKey) jwk);
        } else if (com.nimbusds.jose.crypto.RSASSASigner.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
            if (!(jwk instanceof com.nimbusds.jose.jwk.RSAKey)) {
                throw com.nimbusds.jose.jwk.JWKException.expectedClass(com.nimbusds.jose.jwk.RSAKey.class);
            }
            ed25519Signer = new com.nimbusds.jose.crypto.RSASSASigner((com.nimbusds.jose.jwk.RSAKey) jwk);
        } else if (com.nimbusds.jose.crypto.ECDSASigner.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
            if (!(jwk instanceof com.nimbusds.jose.jwk.ECKey)) {
                throw com.nimbusds.jose.jwk.JWKException.expectedClass(com.nimbusds.jose.jwk.ECKey.class);
            }
            ed25519Signer = new com.nimbusds.jose.crypto.ECDSASigner((com.nimbusds.jose.jwk.ECKey) jwk);
        } else if (com.nimbusds.jose.crypto.Ed25519Signer.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
            if (!(jwk instanceof com.nimbusds.jose.jwk.OctetKeyPair)) {
                throw com.nimbusds.jose.jwk.JWKException.expectedClass(com.nimbusds.jose.jwk.OctetKeyPair.class);
            }
            ed25519Signer = new com.nimbusds.jose.crypto.Ed25519Signer((com.nimbusds.jose.jwk.OctetKeyPair) jwk);
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported JWS algorithm: ".concat(java.lang.String.valueOf(jWSAlgorithm)));
        }
        ed25519Signer.getJCAContext().setSecureRandom(this.jcaContext.getSecureRandom());
        ed25519Signer.getJCAContext().setProvider(this.jcaContext.getProvider());
        return ed25519Signer;
    }
}
