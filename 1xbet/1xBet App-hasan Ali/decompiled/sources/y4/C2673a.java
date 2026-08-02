package y4;

import com.google.android.gms.internal.ads.C1234l6;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import n.AbstractC2107A;
import v.w0;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2673a {

    /* renamed from: a, reason: collision with root package name */
    public final C2674b f21292a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f21293b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f21294c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f21295d;

    /* renamed from: e, reason: collision with root package name */
    public final f f21296e;
    public final C2674b f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f21297g;

    /* renamed from: h, reason: collision with root package name */
    public final n f21298h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f21299j;

    public C2673a(String str, int i, C2674b c2674b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, C2674b c2674b2, List list, List list2, ProxySelector proxySelector) {
        kotlin.jvm.internal.l.f("uriHost", str);
        kotlin.jvm.internal.l.f("dns", c2674b);
        kotlin.jvm.internal.l.f("socketFactory", socketFactory);
        kotlin.jvm.internal.l.f("proxyAuthenticator", c2674b2);
        kotlin.jvm.internal.l.f("protocols", list);
        kotlin.jvm.internal.l.f("connectionSpecs", list2);
        kotlin.jvm.internal.l.f("proxySelector", proxySelector);
        this.f21292a = c2674b;
        this.f21293b = socketFactory;
        this.f21294c = sSLSocketFactory;
        this.f21295d = hostnameVerifier;
        this.f21296e = fVar;
        this.f = c2674b2;
        this.f21297g = proxySelector;
        C1234l6 c1234l6 = new C1234l6();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c1234l6.f14323b = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c1234l6.f14323b = "https";
        }
        String f = w0.f(C2674b.e(0, 0, 7, str));
        if (f == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c1234l6.f = f;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC2107A.q("unexpected port: ", i).toString());
        }
        c1234l6.f14324c = i;
        this.f21298h = c1234l6.a();
        this.i = z4.b.v(list);
        this.f21299j = z4.b.v(list2);
    }

    public final boolean a(C2673a c2673a) {
        kotlin.jvm.internal.l.f("that", c2673a);
        return kotlin.jvm.internal.l.a(this.f21292a, c2673a.f21292a) && kotlin.jvm.internal.l.a(this.f, c2673a.f) && kotlin.jvm.internal.l.a(this.i, c2673a.i) && kotlin.jvm.internal.l.a(this.f21299j, c2673a.f21299j) && kotlin.jvm.internal.l.a(this.f21297g, c2673a.f21297g) && kotlin.jvm.internal.l.a(this.f21294c, c2673a.f21294c) && kotlin.jvm.internal.l.a(this.f21295d, c2673a.f21295d) && kotlin.jvm.internal.l.a(this.f21296e, c2673a.f21296e) && this.f21298h.f21366e == c2673a.f21298h.f21366e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2673a)) {
            return false;
        }
        C2673a c2673a = (C2673a) obj;
        return kotlin.jvm.internal.l.a(this.f21298h, c2673a.f21298h) && a(c2673a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f21296e) + ((Objects.hashCode(this.f21295d) + ((Objects.hashCode(this.f21294c) + ((this.f21297g.hashCode() + ((this.f21299j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.f21292a.hashCode() + L1.a.i(527, 31, this.f21298h.i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f21298h;
        sb.append(nVar.f21365d);
        sb.append(':');
        sb.append(nVar.f21366e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f21297g);
        sb.append('}');
        return sb.toString();
    }
}
