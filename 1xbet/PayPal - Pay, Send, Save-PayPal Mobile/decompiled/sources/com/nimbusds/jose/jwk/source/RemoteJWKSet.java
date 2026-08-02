package com.nimbusds.jose.jwk.source;

@java.lang.Deprecated
@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RemoteJWKSet<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.jwk.source.JWKSource<C> {
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    private final com.nimbusds.jose.jwk.source.JWKSource<C> failoverJWKSource;
    private final com.nimbusds.jose.jwk.source.JWKSetCache jwkSetCache;
    private final com.nimbusds.jose.util.ResourceRetriever jwkSetRetriever;
    private final java.net.URL jwkSetURL;

    public static int resolveDefaultHTTPConnectTimeout() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.nimbusds.jose.jwk.source.RemoteJWKSet.class.getName());
        sb.append(".defaultHttpConnectTimeout");
        return resolveDefault(sb.toString(), 500);
    }

    public static int resolveDefaultHTTPReadTimeout() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.nimbusds.jose.jwk.source.RemoteJWKSet.class.getName());
        sb.append(".defaultHttpReadTimeout");
        return resolveDefault(sb.toString(), 500);
    }

    public static int resolveDefaultHTTPSizeLimit() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.nimbusds.jose.jwk.source.RemoteJWKSet.class.getName());
        sb.append(".defaultHttpSizeLimit");
        return resolveDefault(sb.toString(), 51200);
    }

    private static int resolveDefault(java.lang.String str, int i) {
        java.lang.String property = java.lang.System.getProperty(str);
        if (property == null) {
            return i;
        }
        try {
            return java.lang.Integer.parseInt(property);
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    public RemoteJWKSet(java.net.URL url) {
        this(url, (com.nimbusds.jose.jwk.source.JWKSource) null);
    }

    public RemoteJWKSet(java.net.URL url, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        this(url, jWKSource, null, null);
    }

    public RemoteJWKSet(java.net.URL url, com.nimbusds.jose.util.ResourceRetriever resourceRetriever) {
        this(url, resourceRetriever, null);
    }

    public RemoteJWKSet(java.net.URL url, com.nimbusds.jose.util.ResourceRetriever resourceRetriever, com.nimbusds.jose.jwk.source.JWKSetCache jWKSetCache) {
        this(url, null, resourceRetriever, jWKSetCache);
    }

    public RemoteJWKSet(java.net.URL url, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource, com.nimbusds.jose.util.ResourceRetriever resourceRetriever, com.nimbusds.jose.jwk.source.JWKSetCache jWKSetCache) {
        if (url == null) {
            throw new java.lang.IllegalArgumentException("The JWK set URL must not be null");
        }
        this.jwkSetURL = url;
        this.failoverJWKSource = jWKSource;
        if (resourceRetriever != null) {
            this.jwkSetRetriever = resourceRetriever;
        } else {
            this.jwkSetRetriever = new com.nimbusds.jose.util.DefaultResourceRetriever(resolveDefaultHTTPConnectTimeout(), resolveDefaultHTTPReadTimeout(), resolveDefaultHTTPSizeLimit());
        }
        if (jWKSetCache != null) {
            this.jwkSetCache = jWKSetCache;
        } else {
            this.jwkSetCache = new com.nimbusds.jose.jwk.source.DefaultJWKSetCache();
        }
    }

    private com.nimbusds.jose.jwk.JWKSet updateJWKSetFromURL() throws com.nimbusds.jose.RemoteKeySourceException {
        try {
            try {
                com.nimbusds.jose.jwk.JWKSet parse = com.nimbusds.jose.jwk.JWKSet.parse(this.jwkSetRetriever.retrieveResource(this.jwkSetURL).getContent());
                this.jwkSetCache.put(parse);
                return parse;
            } catch (java.text.ParseException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't parse remote JWK set: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.RemoteKeySourceException(sb.toString(), e);
            }
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't retrieve remote JWK set: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.RemoteKeySourceException(sb2.toString(), e2);
        }
    }

    public java.net.URL getJWKSetURL() {
        return this.jwkSetURL;
    }

    public com.nimbusds.jose.jwk.source.JWKSource<C> getFailoverJWKSource() {
        return this.failoverJWKSource;
    }

    public com.nimbusds.jose.util.ResourceRetriever getResourceRetriever() {
        return this.jwkSetRetriever;
    }

    public com.nimbusds.jose.jwk.source.JWKSetCache getJWKSetCache() {
        return this.jwkSetCache;
    }

    public com.nimbusds.jose.jwk.JWKSet getCachedJWKSet() {
        return this.jwkSetCache.get();
    }

    protected static java.lang.String getFirstSpecifiedKeyID(com.nimbusds.jose.jwk.JWKMatcher jWKMatcher) {
        java.util.Set<java.lang.String> keyIDs = jWKMatcher.getKeyIDs();
        if (keyIDs == null || keyIDs.isEmpty()) {
            return null;
        }
        for (java.lang.String str : keyIDs) {
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    private java.util.List<com.nimbusds.jose.jwk.JWK> failover(java.lang.Exception exc, com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.RemoteKeySourceException {
        if (getFailoverJWKSource() == null) {
            return null;
        }
        try {
            return getFailoverJWKSource().get(jWKSelector, c);
        } catch (com.nimbusds.jose.KeySourceException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(exc.getMessage());
            sb.append("; Failover JWK source retrieval failed with: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.RemoteKeySourceException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public java.util.List<com.nimbusds.jose.jwk.JWK> get(com.nimbusds.jose.jwk.JWKSelector jWKSelector, C c) throws com.nimbusds.jose.RemoteKeySourceException {
        com.nimbusds.jose.jwk.JWKSet jWKSet;
        com.nimbusds.jose.jwk.JWKSet jWKSet2 = this.jwkSetCache.get();
        if (this.jwkSetCache.requiresRefresh() || jWKSet2 == null) {
            try {
                synchronized (this) {
                    jWKSet2 = this.jwkSetCache.get();
                    if (this.jwkSetCache.requiresRefresh() || jWKSet2 == null) {
                        jWKSet2 = updateJWKSetFromURL();
                    }
                }
            } catch (java.lang.Exception e) {
                java.util.List<com.nimbusds.jose.jwk.JWK> failover = failover(e, jWKSelector, c);
                if (failover != null) {
                    return failover;
                }
                if (jWKSet2 == null) {
                    throw e;
                }
            }
        }
        java.util.List<com.nimbusds.jose.jwk.JWK> select = jWKSelector.select(jWKSet2);
        if (!select.isEmpty()) {
            return select;
        }
        java.lang.String firstSpecifiedKeyID = getFirstSpecifiedKeyID(jWKSelector.getMatcher());
        if (firstSpecifiedKeyID == null) {
            return java.util.Collections.emptyList();
        }
        if (jWKSet2.getKeyByKeyId(firstSpecifiedKeyID) != null) {
            return java.util.Collections.emptyList();
        }
        try {
            synchronized (this) {
                if (jWKSet2 == this.jwkSetCache.get()) {
                    jWKSet = updateJWKSetFromURL();
                } else {
                    jWKSet = this.jwkSetCache.get();
                }
                if (jWKSet == null) {
                    return java.util.Collections.emptyList();
                }
                return jWKSelector.select(jWKSet);
            }
        } catch (com.nimbusds.jose.KeySourceException e2) {
            java.util.List<com.nimbusds.jose.jwk.JWK> failover2 = failover(e2, jWKSelector, c);
            if (failover2 != null) {
                return failover2;
            }
            throw e2;
        }
    }
}
