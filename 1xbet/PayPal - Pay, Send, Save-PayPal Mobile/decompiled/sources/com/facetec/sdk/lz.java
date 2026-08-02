package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class lz {

    /* renamed from: a, reason: collision with root package name */
    @javax.annotation.Nullable
    public final java.net.Proxy f3636a;
    private com.facetec.sdk.mv b;
    public javax.net.SocketFactory c;
    public final java.util.List<com.facetec.sdk.mj> d;

    @javax.annotation.Nullable
    final javax.net.ssl.SSLSocketFactory e;
    private java.util.List<com.facetec.sdk.na> f;
    private com.facetec.sdk.lx g;
    private java.net.ProxySelector h;

    @javax.annotation.Nullable
    private javax.net.ssl.HostnameVerifier i;
    private com.facetec.sdk.mq j;

    /* renamed from: o, reason: collision with root package name */
    @javax.annotation.Nullable
    private com.facetec.sdk.me f3637o;

    public lz(java.lang.String str, int i, com.facetec.sdk.mq mqVar, javax.net.SocketFactory socketFactory, @javax.annotation.Nullable javax.net.ssl.SSLSocketFactory sSLSocketFactory, @javax.annotation.Nullable javax.net.ssl.HostnameVerifier hostnameVerifier, @javax.annotation.Nullable com.facetec.sdk.me meVar, com.facetec.sdk.lx lxVar, @javax.annotation.Nullable java.net.Proxy proxy, java.util.List<com.facetec.sdk.na> list, java.util.List<com.facetec.sdk.mj> list2, java.net.ProxySelector proxySelector) {
        com.facetec.sdk.mv.d dVar = new com.facetec.sdk.mv.d();
        java.lang.String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            dVar.e = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            dVar.e = "https";
        } else {
            throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str == null) {
            throw new java.lang.NullPointerException("host == null");
        }
        java.lang.String str3 = (java.lang.String) com.facetec.sdk.mv.d.e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -461853234, new java.lang.Object[]{str, 0, java.lang.Integer.valueOf(str.length())}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 461853234);
        if (str3 == null) {
            throw new java.lang.IllegalArgumentException("unexpected host: ".concat(java.lang.String.valueOf(str)));
        }
        dVar.f3664a = str3;
        if (i <= 0 || i > 65535) {
            throw new java.lang.IllegalArgumentException("unexpected port: ".concat(java.lang.String.valueOf(i)));
        }
        dVar.d = i;
        this.b = dVar.a();
        if (mqVar == null) {
            throw new java.lang.NullPointerException("dns == null");
        }
        this.j = mqVar;
        if (socketFactory == null) {
            throw new java.lang.NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (lxVar == null) {
            throw new java.lang.NullPointerException("proxyAuthenticator == null");
        }
        this.g = lxVar;
        if (list == null) {
            throw new java.lang.NullPointerException("protocols == null");
        }
        this.f = com.facetec.sdk.nh.e(list);
        if (list2 == null) {
            throw new java.lang.NullPointerException("connectionSpecs == null");
        }
        this.d = com.facetec.sdk.nh.e(list2);
        if (proxySelector == null) {
            throw new java.lang.NullPointerException("proxySelector == null");
        }
        this.h = proxySelector;
        this.f3636a = proxy;
        this.e = sSLSocketFactory;
        this.i = hostnameVerifier;
        this.f3637o = meVar;
    }

    public final com.facetec.sdk.mv b() {
        return this.b;
    }

    public final com.facetec.sdk.mq d() {
        return this.j;
    }

    public final com.facetec.sdk.lx a() {
        return this.g;
    }

    public final java.util.List<com.facetec.sdk.na> e() {
        return this.f;
    }

    public final java.net.ProxySelector c() {
        return this.h;
    }

    @javax.annotation.Nullable
    public final javax.net.ssl.SSLSocketFactory i() {
        return this.e;
    }

    @javax.annotation.Nullable
    public final javax.net.ssl.HostnameVerifier j() {
        return this.i;
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.me f() {
        return this.f3637o;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.lz)) {
            return false;
        }
        com.facetec.sdk.lz lzVar = (com.facetec.sdk.lz) obj;
        return this.b.equals(lzVar.b) && d(lzVar);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.j.hashCode();
        int hashCode3 = this.g.hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.d.hashCode();
        int hashCode6 = this.h.hashCode();
        java.net.Proxy proxy = this.f3636a;
        int hashCode7 = proxy != null ? proxy.hashCode() : 0;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.e;
        int hashCode8 = sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0;
        javax.net.ssl.HostnameVerifier hostnameVerifier = this.i;
        int hashCode9 = hostnameVerifier != null ? hostnameVerifier.hashCode() : 0;
        com.facetec.sdk.me meVar = this.f3637o;
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (meVar != null ? meVar.hashCode() : 0);
    }

    final boolean d(com.facetec.sdk.lz lzVar) {
        return this.j.equals(lzVar.j) && this.g.equals(lzVar.g) && this.f.equals(lzVar.f) && this.d.equals(lzVar.d) && this.h.equals(lzVar.h) && com.facetec.sdk.nh.d(this.f3636a, lzVar.f3636a) && com.facetec.sdk.nh.d(this.e, lzVar.e) && com.facetec.sdk.nh.d(this.i, lzVar.i) && com.facetec.sdk.nh.d(this.f3637o, lzVar.f3637o) && b().h() == lzVar.b().h();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Address{");
        sb.append(this.b.g());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.b.h());
        if (this.f3636a != null) {
            sb.append(", proxy=");
            sb.append(this.f3636a);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
