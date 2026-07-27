package T4;

import b2.AbstractC0279e;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: T4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151a {

    /* renamed from: a, reason: collision with root package name */
    public final C0152b f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2818b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2819c;

    /* renamed from: d, reason: collision with root package name */
    public final h5.c f2820d;

    /* renamed from: e, reason: collision with root package name */
    public final C0154d f2821e;

    /* renamed from: f, reason: collision with root package name */
    public final C0152b f2822f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2823g;

    /* renamed from: h, reason: collision with root package name */
    public final q f2824h;

    /* renamed from: i, reason: collision with root package name */
    public final List f2825i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2826j;

    public C0151a(String uriHost, int i2, C0152b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, h5.c cVar, C0154d c0154d, C0152b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f2817a = dns;
        this.f2818b = socketFactory;
        this.f2819c = sSLSocketFactory;
        this.f2820d = cVar;
        this.f2821e = c0154d;
        this.f2822f = proxyAuthenticator;
        this.f2823g = proxySelector;
        p pVar = new p();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            pVar.f2915a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            pVar.f2915a = "https";
        }
        String b6 = U4.b.b(i5.a.c(uriHost, 0, 0, false, 7));
        if (b6 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        pVar.f2918d = b6;
        if (1 > i2 || i2 >= 65536) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "unexpected port: ").toString());
        }
        pVar.f2919e = i2;
        this.f2824h = pVar.a();
        this.f2825i = U4.e.j(protocols);
        this.f2826j = U4.e.j(connectionSpecs);
    }

    public final boolean a(C0151a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f2817a, that.f2817a) && kotlin.jvm.internal.i.a(this.f2822f, that.f2822f) && kotlin.jvm.internal.i.a(this.f2825i, that.f2825i) && kotlin.jvm.internal.i.a(this.f2826j, that.f2826j) && kotlin.jvm.internal.i.a(this.f2823g, that.f2823g) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f2819c, that.f2819c) && kotlin.jvm.internal.i.a(this.f2820d, that.f2820d) && kotlin.jvm.internal.i.a(this.f2821e, that.f2821e) && this.f2824h.f2927e == that.f2824h.f2927e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0151a) {
            C0151a c0151a = (C0151a) obj;
            if (kotlin.jvm.internal.i.a(this.f2824h, c0151a.f2824h) && a(c0151a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2821e) + ((Objects.hashCode(this.f2820d) + ((Objects.hashCode(this.f2819c) + ((this.f2823g.hashCode() + ((this.f2826j.hashCode() + ((this.f2825i.hashCode() + ((this.f2822f.hashCode() + ((this.f2817a.hashCode() + B0.o.f(this.f2824h.f2930h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.f2824h;
        sb.append(qVar.f2926d);
        sb.append(':');
        sb.append(qVar.f2927e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2823g);
        sb.append('}');
        return sb.toString();
    }
}
