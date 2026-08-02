package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public class JWSAlgorithmFamilyJWSKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.proc.AbstractJWKSelectorWithSource<C> implements com.nimbusds.jose.proc.JWSKeySelector<C> {
    private final java.util.Map<com.nimbusds.jose.JWSAlgorithm, com.nimbusds.jose.proc.JWSKeySelector<C>> selectors;

    @Override // com.nimbusds.jose.proc.AbstractJWKSelectorWithSource
    public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    public JWSAlgorithmFamilyJWSKeySelector(com.nimbusds.jose.JWSAlgorithm.Family family, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        super(jWKSource);
        this.selectors = new java.util.HashMap();
        if (family == null) {
            throw new java.lang.IllegalArgumentException("JWS algorithm family must not be null");
        }
        java.util.Iterator<T> it = family.iterator();
        while (it.hasNext()) {
            com.nimbusds.jose.JWSAlgorithm jWSAlgorithm = (com.nimbusds.jose.JWSAlgorithm) it.next();
            this.selectors.put(jWSAlgorithm, new com.nimbusds.jose.proc.JWSVerificationKeySelector(jWSAlgorithm, jWKSource));
        }
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public java.util.List<? extends java.security.Key> selectJWSKeys(com.nimbusds.jose.JWSHeader jWSHeader, C c) throws com.nimbusds.jose.KeySourceException {
        com.nimbusds.jose.proc.JWSKeySelector<C> jWSKeySelector = this.selectors.get(jWSHeader.getAlgorithm());
        if (jWSKeySelector == null) {
            return java.util.Collections.emptyList();
        }
        return jWSKeySelector.selectJWSKeys(jWSHeader, c);
    }

    public static <C extends com.nimbusds.jose.proc.SecurityContext> com.nimbusds.jose.proc.JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSetURL(java.net.URL url) throws com.nimbusds.jose.KeySourceException {
        return fromJWKSource(new com.nimbusds.jose.jwk.source.RemoteJWKSet(url));
    }

    public static <C extends com.nimbusds.jose.proc.SecurityContext> com.nimbusds.jose.proc.JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSource(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) throws com.nimbusds.jose.KeySourceException {
        for (com.nimbusds.jose.jwk.JWK jwk : jWKSource.get(new com.nimbusds.jose.jwk.JWKSelector(new com.nimbusds.jose.jwk.JWKMatcher.Builder().publicOnly(true).keyUses(com.nimbusds.jose.jwk.KeyUse.SIGNATURE, null).keyTypes(com.nimbusds.jose.jwk.KeyType.RSA, com.nimbusds.jose.jwk.KeyType.EC).build()), null)) {
            if (com.nimbusds.jose.jwk.KeyType.RSA.equals(jwk.getKeyType())) {
                return new com.nimbusds.jose.proc.JWSAlgorithmFamilyJWSKeySelector<>(com.nimbusds.jose.JWSAlgorithm.Family.RSA, jWKSource);
            }
            if (com.nimbusds.jose.jwk.KeyType.EC.equals(jwk.getKeyType())) {
                return new com.nimbusds.jose.proc.JWSAlgorithmFamilyJWSKeySelector<>(com.nimbusds.jose.JWSAlgorithm.Family.EC, jWKSource);
            }
        }
        throw new com.nimbusds.jose.KeySourceException("Couldn't retrieve JWKs");
    }
}
