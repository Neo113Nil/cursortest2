package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pc extends java.net.ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final java.util.List<java.net.Proxy> select(java.net.URI uri) {
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("uri must not be null");
        }
        return java.util.Collections.singletonList(java.net.Proxy.NO_PROXY);
    }
}
