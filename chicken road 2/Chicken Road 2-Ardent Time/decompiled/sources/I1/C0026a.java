package I1;

/* renamed from: I1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026a {

    /* renamed from: a, reason: collision with root package name */
    public final I1.C0027b f670a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.net.SocketFactory f671b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f672c;

    /* renamed from: d, reason: collision with root package name */
    public final U1.c f673d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.e f674e;

    /* renamed from: f, reason: collision with root package name */
    public final I1.C0027b f675f;

    /* renamed from: g, reason: collision with root package name */
    public final java.net.ProxySelector f676g;

    /* renamed from: h, reason: collision with root package name */
    public final I1.o f677h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f678i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f679j;

    public C0026a(java.lang.String uriHost, int i2, I1.C0027b dns, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, U1.c cVar, I1.e eVar, I1.C0027b proxyAuthenticator, java.util.List protocols, java.util.List connectionSpecs, java.net.ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f670a = dns;
        this.f671b = socketFactory;
        this.f672c = sSLSocketFactory;
        this.f673d = cVar;
        this.f674e = eVar;
        this.f675f = proxyAuthenticator;
        this.f676g = proxySelector;
        I1.n nVar = new I1.n();
        java.lang.String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            nVar.f752a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(str, "unexpected scheme: "));
            }
            nVar.f752a = "https";
        }
        java.lang.String E2 = u0.AbstractC0995a.E(I1.C0027b.e(uriHost, 0, 0, false, 7));
        if (E2 == null) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(uriHost, "unexpected host: "));
        }
        nVar.f755d = E2;
        if (1 > i2 || i2 >= 65536) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "unexpected port: ").toString());
        }
        nVar.f756e = i2;
        this.f677h = nVar.a();
        this.f678i = J1.b.w(protocols);
        this.f679j = J1.b.w(connectionSpecs);
    }

    public final boolean a(I1.C0026a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f670a, that.f670a) && kotlin.jvm.internal.i.a(this.f675f, that.f675f) && kotlin.jvm.internal.i.a(this.f678i, that.f678i) && kotlin.jvm.internal.i.a(this.f679j, that.f679j) && kotlin.jvm.internal.i.a(this.f676g, that.f676g) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f672c, that.f672c) && kotlin.jvm.internal.i.a(this.f673d, that.f673d) && kotlin.jvm.internal.i.a(this.f674e, that.f674e) && this.f677h.f765e == that.f677h.f765e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.C0026a) {
            I1.C0026a c0026a = (I1.C0026a) obj;
            if (kotlin.jvm.internal.i.a(this.f677h, c0026a.f677h) && a(c0026a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hashCode(this.f674e) + ((java.util.Objects.hashCode(this.f673d) + ((java.util.Objects.hashCode(this.f672c) + ((this.f676g.hashCode() + ((this.f679j.hashCode() + ((this.f678i.hashCode() + ((this.f675f.hashCode() + ((this.f670a.hashCode() + B1.a.e(this.f677h.f768h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Address{");
        I1.o oVar = this.f677h;
        sb.append(oVar.f764d);
        sb.append(':');
        sb.append(oVar.f765e);
        sb.append(", ");
        sb.append(kotlin.jvm.internal.i.h(this.f676g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
