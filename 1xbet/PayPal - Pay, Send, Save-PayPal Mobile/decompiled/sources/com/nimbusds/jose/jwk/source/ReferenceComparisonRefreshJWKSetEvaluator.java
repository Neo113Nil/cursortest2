package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
class ReferenceComparisonRefreshJWKSetEvaluator extends com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator {
    private final com.nimbusds.jose.jwk.JWKSet jwkSet;

    public ReferenceComparisonRefreshJWKSetEvaluator(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        this.jwkSet = jWKSet;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator
    public boolean requiresRefresh(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        return jWKSet == this.jwkSet;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.jwkSet);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return java.util.Objects.equals(this.jwkSet, ((com.nimbusds.jose.jwk.source.ReferenceComparisonRefreshJWKSetEvaluator) obj).jwkSet);
        }
        return false;
    }
}
