package i1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070a {

    /* renamed from: a, reason: collision with root package name */
    public final o f1279a;

    /* renamed from: b, reason: collision with root package name */
    public final C0071b f1280b;

    /* renamed from: c, reason: collision with root package name */
    public final SocketFactory f1281c;

    /* renamed from: d, reason: collision with root package name */
    public final C0071b f1282d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1283e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1284f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f1285g;

    /* renamed from: h, reason: collision with root package name */
    public final SSLSocketFactory f1286h;

    /* renamed from: i, reason: collision with root package name */
    public final r1.c f1287i;

    /* renamed from: j, reason: collision with root package name */
    public final d f1288j;

    public C0070a(String str, int i2, C0071b c0071b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, r1.c cVar, d dVar, C0071b c0071b2, ProxySelector proxySelector) {
        List list = r.f1386v;
        List list2 = r.f1387w;
        n nVar = new n();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            nVar.f1367a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            nVar.f1367a = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String b2 = j1.d.b(o.g(str, 0, str.length(), false));
        if (b2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        nVar.f1370d = b2;
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException(C0.g.g(i2, "unexpected port: "));
        }
        nVar.f1371e = i2;
        this.f1279a = nVar.a();
        if (c0071b == null) {
            throw new NullPointerException("dns == null");
        }
        this.f1280b = c0071b;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f1281c = socketFactory;
        if (c0071b2 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f1282d = c0071b2;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f1283e = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f1284f = Collections.unmodifiableList(new ArrayList(list2));
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f1285g = proxySelector;
        this.f1286h = sSLSocketFactory;
        this.f1287i = cVar;
        this.f1288j = dVar;
    }

    public final boolean a(C0070a c0070a) {
        return this.f1280b.equals(c0070a.f1280b) && this.f1282d.equals(c0070a.f1282d) && this.f1283e.equals(c0070a.f1283e) && this.f1284f.equals(c0070a.f1284f) && this.f1285g.equals(c0070a.f1285g) && j1.d.i(null, null) && j1.d.i(this.f1286h, c0070a.f1286h) && j1.d.i(this.f1287i, c0070a.f1287i) && j1.d.i(this.f1288j, c0070a.f1288j) && this.f1279a.f1380e == c0070a.f1279a.f1380e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0070a) {
            C0070a c0070a = (C0070a) obj;
            if (this.f1279a.equals(c0070a.f1279a) && a(c0070a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1285g.hashCode() + ((this.f1284f.hashCode() + ((this.f1283e.hashCode() + ((this.f1282d.hashCode() + ((this.f1280b.hashCode() + C0.g.f(this.f1279a.f1383h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        SSLSocketFactory sSLSocketFactory = this.f1286h;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        r1.c cVar = this.f1287i;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f1288j;
        return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f1279a;
        sb.append(oVar.f1379d);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(oVar.f1380e);
        sb.append(", proxySelector=");
        sb.append(this.f1285g);
        sb.append("}");
        return sb.toString();
    }
}
