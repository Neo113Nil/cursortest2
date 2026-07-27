package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.r;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpClient.java */
/* loaded from: classes6.dex */
public class v implements Cloneable {
    static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.h, j.j);

    /* renamed from: a, reason: collision with root package name */
    final m f9951a;

    @Nullable
    final Proxy b;
    final List<w> c;
    final List<j> d;
    final List<t> e;
    final List<t> f;
    final o.c g;
    final ProxySelector h;
    final l i;
    final SocketFactory j;
    final SSLSocketFactory k;
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c l;
    final HostnameVerifier m;
    final f n;
    final com.mbridge.msdk.thrid.okhttp.b o;
    final com.mbridge.msdk.thrid.okhttp.b p;
    final i q;
    final n r;
    final boolean s;
    final boolean t;
    final boolean u;
    final int v;
    final int w;
    final int x;
    final int y;
    final int z;

    /* compiled from: OkHttpClient.java */
    static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z) {
            jVar.a(sSLSocket, z);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        @Nullable
        public IOException a(d dVar, @Nullable IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    /* compiled from: OkHttpClient.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        m f9952a;

        @Nullable
        Proxy b;
        List<w> c;
        List<j> d;
        final List<t> e;
        final List<t> f;
        o.c g;
        ProxySelector h;
        l i;
        SocketFactory j;

        @Nullable
        SSLSocketFactory k;

        @Nullable
        com.mbridge.msdk.thrid.okhttp.internal.tls.c l;
        HostnameVerifier m;
        f n;
        com.mbridge.msdk.thrid.okhttp.b o;
        com.mbridge.msdk.thrid.okhttp.b p;
        i q;
        n r;
        boolean s;
        boolean t;
        boolean u;
        int v;
        int w;
        int x;
        int y;
        int z;

        public b() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.f9952a = new m();
            this.c = v.A;
            this.d = v.B;
            this.g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.i = l.f9939a;
            this.j = SocketFactory.getDefault();
            this.m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f9935a;
            this.n = f.c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f9867a;
            this.o = bVar;
            this.p = bVar;
            this.q = new i();
            this.r = n.f9941a;
            this.s = true;
            this.t = true;
            this.u = true;
            this.v = 0;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.z = 0;
        }

        public b a(long j, TimeUnit timeUnit) {
            this.v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j, timeUnit);
            return this;
        }

        public b b(long j, TimeUnit timeUnit) {
            this.w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j, timeUnit);
            return this;
        }

        public b c(long j, TimeUnit timeUnit) {
            this.z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j, timeUnit);
            return this;
        }

        public b d(long j, TimeUnit timeUnit) {
            this.x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j, timeUnit);
            return this;
        }

        public b e(long j, TimeUnit timeUnit) {
            this.y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.r = nVar;
            return this;
        }

        public b b(boolean z) {
            this.u = z;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z) {
            this.t = z;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f9952a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            this.f9952a = vVar.f9951a;
            this.b = vVar.b;
            this.c = vVar.c;
            this.d = vVar.d;
            arrayList.addAll(vVar.e);
            arrayList2.addAll(vVar.f);
            this.g = vVar.g;
            this.h = vVar.h;
            this.i = vVar.i;
            this.j = vVar.j;
            this.k = vVar.k;
            this.l = vVar.l;
            this.m = vVar.m;
            this.n = vVar.n;
            this.o = vVar.o;
            this.p = vVar.p;
            this.q = vVar.q;
            this.r = vVar.r;
            this.s = vVar.s;
            this.t = vVar.t;
            this.u = vVar.u;
            this.v = vVar.v;
            this.w = vVar.w;
            this.x = vVar.x;
            this.y = vVar.y;
            this.z = vVar.z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f9879a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext e = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            e.init(null, new TrustManager[]{x509TrustManager}, null);
            return e.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e2);
        }
    }

    public SocketFactory A() {
        return this.j;
    }

    public SSLSocketFactory B() {
        return this.k;
    }

    public int C() {
        return this.y;
    }

    public int b() {
        return this.v;
    }

    public f c() {
        return this.n;
    }

    public int e() {
        return this.w;
    }

    public i f() {
        return this.q;
    }

    public List<j> g() {
        return this.d;
    }

    public l i() {
        return this.i;
    }

    public m j() {
        return this.f9951a;
    }

    public n k() {
        return this.r;
    }

    public o.c l() {
        return this.g;
    }

    public boolean m() {
        return this.t;
    }

    public boolean n() {
        return this.s;
    }

    public HostnameVerifier o() {
        return this.m;
    }

    public List<t> p() {
        return this.e;
    }

    com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.z;
    }

    public List<w> u() {
        return this.c;
    }

    @Nullable
    public Proxy v() {
        return this.b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.o;
    }

    public ProxySelector x() {
        return this.h;
    }

    public int y() {
        return this.x;
    }

    public boolean z() {
        return this.u;
    }

    v(b bVar) {
        boolean z;
        this.f9951a = bVar.f9952a;
        this.b = bVar.b;
        this.c = bVar.c;
        List<j> list = bVar.d;
        this.d = list;
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.e);
        this.f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f);
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || it.next().b()) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.k;
        if (sSLSocketFactory == null && z) {
            X509TrustManager a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.k = a(a2);
            this.l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(a2);
        } else {
            this.k = sSLSocketFactory;
            this.l = bVar.l;
        }
        if (this.k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.k);
        }
        this.m = bVar.m;
        this.n = bVar.n.a(this.l);
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = bVar.w;
        this.x = bVar.x;
        this.y = bVar.y;
        this.z = bVar.z;
        if (this.e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.e);
        }
        if (this.f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
