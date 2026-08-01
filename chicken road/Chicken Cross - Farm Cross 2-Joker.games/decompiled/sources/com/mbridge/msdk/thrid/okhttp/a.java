package com.mbridge.msdk.thrid.okhttp;

import androidx.webkit.ProxyConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.s;
import io.ktor.sse.ServerSentEventKt;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final s f9864a;
    final n b;
    final SocketFactory c;
    final b d;
    final List<w> e;
    final List<j> f;
    final ProxySelector g;

    @Nullable
    final Proxy h;

    @Nullable
    final SSLSocketFactory i;

    @Nullable
    final HostnameVerifier j;

    @Nullable
    final f k;

    public a(String str, int i, n nVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f9864a = new s.a().f(sSLSocketFactory != null ? "https" : ProxyConfig.MATCH_HTTP).b(str).a(i).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = fVar;
    }

    @Nullable
    public f a() {
        return this.k;
    }

    public List<j> b() {
        return this.f;
    }

    public n c() {
        return this.b;
    }

    @Nullable
    public HostnameVerifier d() {
        return this.j;
    }

    public List<w> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9864a.equals(aVar.f9864a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Proxy f() {
        return this.h;
    }

    public b g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f9864a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.k;
        return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.c;
    }

    @Nullable
    public SSLSocketFactory j() {
        return this.i;
    }

    public s k() {
        return this.f9864a;
    }

    public String toString() {
        StringBuilder append = new StringBuilder("Address{").append(this.f9864a.g()).append(ServerSentEventKt.COLON).append(this.f9864a.j());
        if (this.h != null) {
            append.append(", proxy=").append(this.h);
        } else {
            append.append(", proxySelector=").append(this.g);
        }
        append.append("}");
        return append.toString();
    }

    boolean a(a aVar) {
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.h, aVar.h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.i, aVar.i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.j, aVar.j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.k, aVar.k) && k().j() == aVar.k().j();
    }
}
