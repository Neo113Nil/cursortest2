package com.nimbusds.jose.proc;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWSVerificationKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.proc.AbstractJWKSelectorWithSource<C> implements com.nimbusds.jose.proc.JWSKeySelector<C> {
    private final java.util.Set<com.nimbusds.jose.JWSAlgorithm> jwsAlgs;
    private final boolean singleJwsAlgConstructorWasCalled;

    @Override // com.nimbusds.jose.proc.AbstractJWKSelectorWithSource
    public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    public JWSVerificationKeySelector(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        super(jWKSource);
        if (jWSAlgorithm == null) {
            throw new java.lang.IllegalArgumentException("The JWS algorithm must not be null");
        }
        this.jwsAlgs = java.util.Collections.singleton(jWSAlgorithm);
        this.singleJwsAlgConstructorWasCalled = true;
    }

    public JWSVerificationKeySelector(java.util.Set<com.nimbusds.jose.JWSAlgorithm> set, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        super(jWKSource);
        if (set == null || set.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The JWS algorithms must not be null or empty");
        }
        this.jwsAlgs = java.util.Collections.unmodifiableSet(set);
        this.singleJwsAlgConstructorWasCalled = false;
    }

    public boolean isAllowed(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
        return this.jwsAlgs.contains(jWSAlgorithm);
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWSAlgorithm getExpectedJWSAlgorithm() {
        if (this.singleJwsAlgConstructorWasCalled) {
            return this.jwsAlgs.iterator().next();
        }
        throw new java.lang.UnsupportedOperationException("Since this class was constructed with multiple algorithms, the behavior of this method is undefined.");
    }

    protected com.nimbusds.jose.jwk.JWKMatcher createJWKMatcher(com.nimbusds.jose.JWSHeader jWSHeader) {
        if (isAllowed(jWSHeader.getAlgorithm())) {
            return com.nimbusds.jose.jwk.JWKMatcher.forJWSHeader(jWSHeader);
        }
        return null;
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public java.util.List<java.security.Key> selectJWSKeys(com.nimbusds.jose.JWSHeader jWSHeader, C c) throws com.nimbusds.jose.KeySourceException {
        if (!this.jwsAlgs.contains(jWSHeader.getAlgorithm())) {
            return java.util.Collections.emptyList();
        }
        com.nimbusds.jose.jwk.JWKMatcher createJWKMatcher = createJWKMatcher(jWSHeader);
        if (createJWKMatcher == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<com.nimbusds.jose.jwk.JWK> list = getJWKSource().get(new com.nimbusds.jose.jwk.JWKSelector(createJWKMatcher), c);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.security.Key key : com.nimbusds.jose.jwk.KeyConverter.toJavaKeys(list)) {
            if ((key instanceof java.security.PublicKey) || (key instanceof javax.crypto.SecretKey)) {
                linkedList.add(key);
            }
        }
        return linkedList;
    }
}
