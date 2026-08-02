package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class URLBasedJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSetSource<C> {
    private final com.nimbusds.jose.util.ResourceRetriever resourceRetriever;
    private final java.net.URL url;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
    }

    public URLBasedJWKSetSource(java.net.URL url, com.nimbusds.jose.util.ResourceRetriever resourceRetriever) {
        java.util.Objects.requireNonNull(url, "The URL must not be null");
        this.url = url;
        java.util.Objects.requireNonNull(resourceRetriever, "The resource retriever must not be null");
        this.resourceRetriever = resourceRetriever;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            try {
                return com.nimbusds.jose.jwk.JWKSet.parse(this.resourceRetriever.retrieveResource(this.url).getContent());
            } catch (java.lang.Exception e) {
                throw new com.nimbusds.jose.jwk.source.JWKSetParseException("Unable to parse JWK set", e);
            }
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't retrieve JWK set from URL: ");
            sb.append(e2.getMessage());
            throw new com.nimbusds.jose.jwk.source.JWKSetRetrievalException(sb.toString(), e2);
        }
    }
}
