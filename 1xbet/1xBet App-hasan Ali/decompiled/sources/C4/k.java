package C4;

import F4.o;
import F4.p;
import F4.w;
import F4.x;
import G4.n;
import L4.B;
import L4.K;
import Q2.C0375o;
import com.google.android.gms.internal.ads.C1386of;
import e2.C1930k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import n.AbstractC2107A;
import o0.C2202f;
import o4.AbstractC2228f;
import t3.AbstractC2425d;
import v.AbstractC2527w;
import v.AbstractC2529y;
import v.r;
import y4.C;
import y4.C2673a;
import y4.u;
import y4.v;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class k extends F4.h {

    /* renamed from: b, reason: collision with root package name */
    public final C f892b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f893c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f894d;

    /* renamed from: e, reason: collision with root package name */
    public y4.l f895e;
    public v f;

    /* renamed from: g, reason: collision with root package name */
    public o f896g;

    /* renamed from: h, reason: collision with root package name */
    public L4.C f897h;
    public B i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f898j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f899k;

    /* renamed from: l, reason: collision with root package name */
    public int f900l;

    /* renamed from: m, reason: collision with root package name */
    public int f901m;

    /* renamed from: n, reason: collision with root package name */
    public int f902n;

    /* renamed from: o, reason: collision with root package name */
    public int f903o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f904p;

    /* renamed from: q, reason: collision with root package name */
    public long f905q;

    public k(C1386of c1386of, C c5) {
        kotlin.jvm.internal.l.f("connectionPool", c1386of);
        kotlin.jvm.internal.l.f("route", c5);
        this.f892b = c5;
        this.f903o = 1;
        this.f904p = new ArrayList();
        this.f905q = Long.MAX_VALUE;
    }

    public static void d(u uVar, C c5, IOException iOException) {
        kotlin.jvm.internal.l.f("client", uVar);
        kotlin.jvm.internal.l.f("failedRoute", c5);
        kotlin.jvm.internal.l.f("failure", iOException);
        if (c5.f21283b.type() != Proxy.Type.DIRECT) {
            C2673a c2673a = c5.f21282a;
            c2673a.f21297g.connectFailed(c2673a.f21298h.h(), c5.f21283b.address(), iOException);
        }
        C1930k c1930k = uVar.f21410I;
        synchronized (c1930k) {
            ((LinkedHashSet) c1930k.f16910l).add(c5);
        }
    }

    @Override // F4.h
    public final synchronized void a(o oVar, F4.B b3) {
        kotlin.jvm.internal.l.f("connection", oVar);
        kotlin.jvm.internal.l.f("settings", b3);
        this.f903o = (b3.f1565a & 16) != 0 ? b3.f1566b[4] : Integer.MAX_VALUE;
    }

    @Override // F4.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i5, int i6, boolean z3, i iVar) {
        C c5;
        kotlin.jvm.internal.l.f("call", iVar);
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f892b.f21282a.f21299j;
        b bVar = new b(list);
        C2673a c2673a = this.f892b.f21282a;
        if (c2673a.f21294c == null) {
            if (!list.contains(y4.i.f)) {
                throw new l(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f892b.f21282a.f21298h.f21365d;
            n nVar = n.f2016a;
            if (!n.f2016a.h(str)) {
                throw new l(new UnknownServiceException(L1.a.n("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c2673a.i.contains(v.f21431p)) {
            throw new l(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        l lVar = null;
        do {
            try {
                C c6 = this.f892b;
                if (c6.f21282a.f21294c != null && c6.f21283b.type() == Proxy.Type.HTTP) {
                    f(i, i5, i6, iVar);
                    if (this.f893c == null) {
                        c5 = this.f892b;
                        if (c5.f21282a.f21294c == null && c5.f21283b.type() == Proxy.Type.HTTP && this.f893c == null) {
                            throw new l(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f905q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i5, iVar);
                }
                g(bVar, iVar);
                kotlin.jvm.internal.l.f("inetSocketAddress", this.f892b.f21284c);
                c5 = this.f892b;
                if (c5.f21282a.f21294c == null) {
                }
                this.f905q = System.nanoTime();
                return;
            } catch (IOException e3) {
                Socket socket = this.f894d;
                if (socket != null) {
                    z4.b.d(socket);
                }
                Socket socket2 = this.f893c;
                if (socket2 != null) {
                    z4.b.d(socket2);
                }
                this.f894d = null;
                this.f893c = null;
                this.f897h = null;
                this.i = null;
                this.f895e = null;
                this.f = null;
                this.f896g = null;
                this.f903o = 1;
                kotlin.jvm.internal.l.f("inetSocketAddress", this.f892b.f21284c);
                if (lVar == null) {
                    lVar = new l(e3);
                } else {
                    AbstractC2425d.j(lVar.f906k, e3);
                    lVar.f907l = e3;
                }
                if (!z3) {
                    throw lVar;
                }
                bVar.f851c = true;
                if (!bVar.f849a) {
                    throw lVar;
                }
                if (e3 instanceof ProtocolException) {
                    throw lVar;
                }
                if (e3 instanceof InterruptedIOException) {
                    throw lVar;
                }
                if ((e3 instanceof SSLHandshakeException) && (e3.getCause() instanceof CertificateException)) {
                    throw lVar;
                }
                if (e3 instanceof SSLPeerUnverifiedException) {
                    throw lVar;
                }
            }
        } while (e3 instanceof SSLException);
        throw lVar;
    }

    public final void e(int i, int i5, i iVar) {
        Socket createSocket;
        C c5 = this.f892b;
        Proxy proxy = c5.f21283b;
        C2673a c2673a = c5.f21282a;
        Proxy.Type type = proxy.type();
        int i6 = type == null ? -1 : j.f891a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            createSocket = c2673a.f21293b.createSocket();
            kotlin.jvm.internal.l.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f893c = createSocket;
        InetSocketAddress inetSocketAddress = this.f892b.f21284c;
        kotlin.jvm.internal.l.f("call", iVar);
        kotlin.jvm.internal.l.f("inetSocketAddress", inetSocketAddress);
        createSocket.setSoTimeout(i5);
        try {
            n nVar = n.f2016a;
            n.f2016a.e(createSocket, this.f892b.f21284c, i);
            try {
                this.f897h = N4.b.k(N4.b.X(createSocket));
                this.i = N4.b.j(N4.b.V(createSocket));
            } catch (NullPointerException e3) {
                if (kotlin.jvm.internal.l.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f892b.f21284c);
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i, int i5, int i6, i iVar) {
        C0375o c0375o = new C0375o();
        C c5 = this.f892b;
        y4.n nVar = c5.f21282a.f21298h;
        kotlin.jvm.internal.l.f("url", nVar);
        c0375o.f5042l = nVar;
        c0375o.x("CONNECT", null);
        C2673a c2673a = c5.f21282a;
        c0375o.v("Host", z4.b.u(c2673a.f21298h, true));
        c0375o.v("Proxy-Connection", "Keep-Alive");
        c0375o.v("User-Agent", "okhttp/4.12.0");
        C0.c m5 = c0375o.m();
        C2202f c2202f = new C2202f(1);
        AbstractC2527w.b("Proxy-Authenticate");
        AbstractC2527w.c("OkHttp-Preemptive", "Proxy-Authenticate");
        c2202f.p("Proxy-Authenticate");
        c2202f.b("Proxy-Authenticate", "OkHttp-Preemptive");
        c2202f.d();
        c2673a.f.getClass();
        e(i, i5, iVar);
        String str = "CONNECT " + z4.b.u((y4.n) m5.f811b, true) + " HTTP/1.1";
        L4.C c6 = this.f897h;
        kotlin.jvm.internal.l.c(c6);
        B b3 = this.i;
        kotlin.jvm.internal.l.c(b3);
        m mVar = new m((u) null, this, c6, b3);
        K c7 = c6.f3050k.c();
        long j5 = i5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7.g(j5);
        b3.f3047k.c().g(i6);
        mVar.l((y4.m) m5.f813d, str);
        mVar.c();
        y f = mVar.f(false);
        kotlin.jvm.internal.l.c(f);
        f.f21437a = m5;
        z a5 = f.a();
        long j6 = z4.b.j(a5);
        if (j6 != -1) {
            E4.e j7 = mVar.j(j6);
            z4.b.s(j7, Integer.MAX_VALUE);
            j7.close();
        }
        int i7 = a5.f21451n;
        if (i7 != 200) {
            if (i7 != 407) {
                throw new IOException(AbstractC2107A.q("Unexpected response code for CONNECT: ", i7));
            }
            c2673a.f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c6.f3051l.l() || !b3.f3048l.l()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar) {
        SSLSocket sSLSocket;
        C2673a c2673a = this.f892b.f21282a;
        SSLSocketFactory sSLSocketFactory = c2673a.f21294c;
        v vVar = v.f21428m;
        if (sSLSocketFactory == null) {
            List list = c2673a.i;
            v vVar2 = v.f21431p;
            if (!list.contains(vVar2)) {
                this.f894d = this.f893c;
                this.f = vVar;
                return;
            } else {
                this.f894d = this.f893c;
                this.f = vVar2;
                m();
                return;
            }
        }
        kotlin.jvm.internal.l.f("call", iVar);
        C2673a c2673a2 = this.f892b.f21282a;
        SSLSocketFactory sSLSocketFactory2 = c2673a2.f21294c;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            kotlin.jvm.internal.l.c(sSLSocketFactory2);
            Socket socket = this.f893c;
            y4.n nVar = c2673a2.f21298h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, nVar.f21365d, nVar.f21366e, true);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type javax.net.ssl.SSLSocket", createSocket);
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            y4.i e3 = bVar.e(sSLSocket);
            if (e3.f21339b) {
                n nVar2 = n.f2016a;
                n.f2016a.d(sSLSocket, c2673a2.f21298h.f21365d, c2673a2.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.l.e("sslSocketSession", session);
            y4.l c5 = r.c(session);
            HostnameVerifier hostnameVerifier = c2673a2.f21295d;
            kotlin.jvm.internal.l.c(hostnameVerifier);
            if (!hostnameVerifier.verify(c2673a2.f21298h.f21365d, session)) {
                List a5 = c5.a();
                if (a5.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c2673a2.f21298h.f21365d + " not verified (no certificates)");
                }
                Object obj = a5.get(0);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c2673a2.f21298h.f21365d);
                sb.append(" not verified:\n              |    certificate: ");
                y4.f fVar = y4.f.f21316c;
                sb.append(v1.d.c(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(X3.m.i0(K4.c.a(x509Certificate, 7), K4.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC2228f.p0(sb.toString()));
            }
            y4.f fVar2 = c2673a2.f21296e;
            kotlin.jvm.internal.l.c(fVar2);
            this.f895e = new y4.l(c5.f21356a, c5.f21357b, c5.f21358c, new A.n(fVar2, c5, c2673a2, 3));
            kotlin.jvm.internal.l.f("hostname", c2673a2.f21298h.f21365d);
            Iterator it = fVar2.f21317a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (e3.f21339b) {
                n nVar3 = n.f2016a;
                str = n.f2016a.f(sSLSocket);
            }
            this.f894d = sSLSocket;
            this.f897h = N4.b.k(N4.b.X(sSLSocket));
            this.i = N4.b.j(N4.b.V(sSLSocket));
            if (str != null) {
                vVar = AbstractC2529y.c(str);
            }
            this.f = vVar;
            n nVar4 = n.f2016a;
            n.f2016a.a(sSLSocket);
            if (this.f == v.f21430o) {
                m();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                n nVar5 = n.f2016a;
                n.f2016a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                z4.b.d(sSLSocket2);
            }
            throw th;
        }
    }

    public final synchronized void h() {
        this.f901m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (K4.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(C2673a c2673a, List list) {
        y4.l lVar;
        byte[] bArr = z4.b.f21979a;
        if (this.f904p.size() < this.f903o && !this.f898j) {
            C c5 = this.f892b;
            if (c5.f21282a.a(c2673a)) {
                y4.n nVar = c2673a.f21298h;
                String str = nVar.f21365d;
                C2673a c2673a2 = c5.f21282a;
                if (kotlin.jvm.internal.l.a(str, c2673a2.f21298h.f21365d)) {
                    return true;
                }
                if (this.f896g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C c6 = (C) it.next();
                        Proxy.Type type = c6.f21283b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c5.f21283b.type() == type2) {
                            if (kotlin.jvm.internal.l.a(c5.f21284c, c6.f21284c)) {
                                if (c2673a.f21295d == K4.c.f2895a) {
                                    byte[] bArr2 = z4.b.f21979a;
                                    y4.n nVar2 = c2673a2.f21298h;
                                    if (nVar.f21366e == nVar2.f21366e) {
                                        String str2 = nVar2.f21365d;
                                        String str3 = nVar.f21365d;
                                        if (!kotlin.jvm.internal.l.a(str3, str2)) {
                                            if (!this.f899k && (lVar = this.f895e) != null) {
                                                List a5 = lVar.a();
                                                if (!a5.isEmpty()) {
                                                    Object obj = a5.get(0);
                                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
                                                }
                                            }
                                        }
                                        try {
                                            y4.f fVar = c2673a.f21296e;
                                            kotlin.jvm.internal.l.c(fVar);
                                            y4.l lVar2 = this.f895e;
                                            kotlin.jvm.internal.l.c(lVar2);
                                            List a6 = lVar2.a();
                                            kotlin.jvm.internal.l.f("hostname", str3);
                                            kotlin.jvm.internal.l.f("peerCertificates", a6);
                                            Iterator it2 = fVar.f21317a.iterator();
                                            if (!it2.hasNext()) {
                                                return true;
                                            }
                                            it2.next().getClass();
                                            throw new ClassCastException();
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z3) {
        long j5;
        byte[] bArr = z4.b.f21979a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f893c;
        kotlin.jvm.internal.l.c(socket);
        Socket socket2 = this.f894d;
        kotlin.jvm.internal.l.c(socket2);
        kotlin.jvm.internal.l.c(this.f897h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f896g;
        if (oVar != null) {
            return oVar.f(nanoTime);
        }
        synchronized (this) {
            j5 = nanoTime - this.f905q;
        }
        if (j5 < 10000000000L || !z3) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final D4.d k(u uVar, D4.f fVar) {
        kotlin.jvm.internal.l.f("client", uVar);
        Socket socket = this.f894d;
        kotlin.jvm.internal.l.c(socket);
        L4.C c5 = this.f897h;
        kotlin.jvm.internal.l.c(c5);
        B b3 = this.i;
        kotlin.jvm.internal.l.c(b3);
        o oVar = this.f896g;
        if (oVar != null) {
            return new p(uVar, this, fVar, oVar);
        }
        int i = fVar.f981g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5.f3050k.c().g(i);
        b3.f3047k.c().g(fVar.f982h);
        return new m(uVar, this, c5, b3);
    }

    public final synchronized void l() {
        this.f898j = true;
    }

    public final void m() {
        Socket socket = this.f894d;
        kotlin.jvm.internal.l.c(socket);
        L4.C c5 = this.f897h;
        kotlin.jvm.internal.l.c(c5);
        B b3 = this.i;
        kotlin.jvm.internal.l.c(b3);
        socket.setSoTimeout(0);
        B4.d dVar = B4.d.i;
        C0.c cVar = new C0.c(dVar);
        String str = this.f892b.f21282a.f21298h.f21365d;
        kotlin.jvm.internal.l.f("peerName", str);
        cVar.f812c = socket;
        String str2 = z4.b.f21984g + ' ' + str;
        kotlin.jvm.internal.l.f("<set-?>", str2);
        cVar.f813d = str2;
        cVar.f814e = c5;
        cVar.f = b3;
        cVar.f815g = this;
        o oVar = new o(cVar);
        this.f896g = oVar;
        F4.B b5 = o.J;
        this.f903o = (b5.f1565a & 16) != 0 ? b5.f1566b[4] : Integer.MAX_VALUE;
        x xVar = oVar.f1616G;
        synchronized (xVar) {
            try {
                if (xVar.f1679n) {
                    throw new IOException("closed");
                }
                Logger logger = x.f1675p;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(z4.b.h(">> CONNECTION " + F4.f.f1590a.d(), new Object[0]));
                }
                xVar.f1676k.g(F4.f.f1590a);
                xVar.f1676k.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        oVar.f1616G.m(oVar.f1634z);
        if (oVar.f1634z.a() != 65535) {
            oVar.f1616G.n(0, r1 - 65535);
        }
        dVar.e().c(new B4.b(0, oVar.f1617H, oVar.f1621m), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C c5 = this.f892b;
        sb.append(c5.f21282a.f21298h.f21365d);
        sb.append(':');
        sb.append(c5.f21282a.f21298h.f21366e);
        sb.append(", proxy=");
        sb.append(c5.f21283b);
        sb.append(" hostAddress=");
        sb.append(c5.f21284c);
        sb.append(" cipherSuite=");
        y4.l lVar = this.f895e;
        if (lVar == null || (obj = lVar.f21357b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
