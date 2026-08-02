package com.nimbusds.jose.crypto.factories;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DefaultJWSVerifierFactory implements com.nimbusds.jose.proc.JWSVerifierFactory {
    public static final java.util.Set<com.nimbusds.jose.JWSAlgorithm> SUPPORTED_ALGORITHMS;
    private final com.nimbusds.jose.jca.JCAContext jcaContext = new com.nimbusds.jose.jca.JCAContext();

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(com.nimbusds.jose.crypto.MACVerifier.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.RSASSAVerifier.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.ECDSAVerifier.SUPPORTED_ALGORITHMS);
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

    @Override // com.nimbusds.jose.proc.JWSVerifierFactory
    public com.nimbusds.jose.JWSVerifier createJWSVerifier(com.nimbusds.jose.JWSHeader jWSHeader, java.security.Key key) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWSVerifier eCDSAVerifier;
        if (com.nimbusds.jose.crypto.MACVerifier.SUPPORTED_ALGORITHMS.contains(jWSHeader.getAlgorithm())) {
            if (!(key instanceof javax.crypto.SecretKey)) {
                throw new com.nimbusds.jose.KeyTypeException(javax.crypto.SecretKey.class);
            }
            eCDSAVerifier = new com.nimbusds.jose.crypto.MACVerifier((javax.crypto.SecretKey) key);
        } else if (com.nimbusds.jose.crypto.RSASSAVerifier.SUPPORTED_ALGORITHMS.contains(jWSHeader.getAlgorithm())) {
            if (!(key instanceof java.security.interfaces.RSAPublicKey)) {
                throw new com.nimbusds.jose.KeyTypeException(java.security.interfaces.RSAPublicKey.class);
            }
            eCDSAVerifier = new com.nimbusds.jose.crypto.RSASSAVerifier((java.security.interfaces.RSAPublicKey) key);
        } else if (com.nimbusds.jose.crypto.ECDSAVerifier.SUPPORTED_ALGORITHMS.contains(jWSHeader.getAlgorithm())) {
            if (!(key instanceof java.security.interfaces.ECPublicKey)) {
                throw new com.nimbusds.jose.KeyTypeException(java.security.interfaces.ECPublicKey.class);
            }
            eCDSAVerifier = new com.nimbusds.jose.crypto.ECDSAVerifier((java.security.interfaces.ECPublicKey) key);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported JWS algorithm: ");
            sb.append(jWSHeader.getAlgorithm());
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        eCDSAVerifier.getJCAContext().setProvider(this.jcaContext.getProvider());
        return eCDSAVerifier;
    }
}
