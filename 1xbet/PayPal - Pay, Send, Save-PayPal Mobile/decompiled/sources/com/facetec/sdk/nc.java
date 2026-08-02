package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nc {
    private java.net.Proxy b;
    private java.net.InetSocketAddress c;
    private com.facetec.sdk.lz d;

    public nc(com.facetec.sdk.lz lzVar, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        if (lzVar == null) {
            throw new java.lang.NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new java.lang.NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new java.lang.NullPointerException("inetSocketAddress == null");
        }
        this.d = lzVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final com.facetec.sdk.lz d() {
        return this.d;
    }

    public final java.net.Proxy e() {
        return this.b;
    }

    public final java.net.InetSocketAddress b() {
        return this.c;
    }

    public final boolean a() {
        return this.d.e != null && this.b.type() == java.net.Proxy.Type.HTTP;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.nc)) {
            return false;
        }
        com.facetec.sdk.nc ncVar = (com.facetec.sdk.nc) obj;
        return ncVar.d.equals(this.d) && ncVar.b.equals(this.b) && ncVar.c.equals(this.c);
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Route{");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
