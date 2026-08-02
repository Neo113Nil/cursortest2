package com.nimbusds.jose.util;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public abstract class AbstractRestrictedResourceRetriever implements com.nimbusds.jose.util.RestrictedResourceRetriever {
    private int connectTimeout;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    private int readTimeout;
    private int sizeLimit;

    public AbstractRestrictedResourceRetriever(int i, int i2, int i3) {
        setConnectTimeout(i);
        setReadTimeout(i2);
        setSizeLimit(i3);
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setConnectTimeout(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("The connect timeout must not be negative");
        }
        this.connectTimeout = i;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getReadTimeout() {
        return this.readTimeout;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setReadTimeout(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("The read timeout must not be negative");
        }
        this.readTimeout = i;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getSizeLimit() {
        return this.sizeLimit;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setSizeLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("The size limit must not be negative");
        }
        this.sizeLimit = i;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.headers = map;
    }
}
