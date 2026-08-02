package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public interface RestrictedResourceRetriever extends com.nimbusds.jose.util.ResourceRetriever {
    int getConnectTimeout();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders();

    int getReadTimeout();

    int getSizeLimit();

    void setConnectTimeout(int i);

    void setHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void setReadTimeout(int i);

    void setSizeLimit(int i);
}
