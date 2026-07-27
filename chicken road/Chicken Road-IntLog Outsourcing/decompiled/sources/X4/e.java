package X4;

import T4.C;
import T4.C0151a;
import T4.C0152b;
import T4.C0154d;
import a.AbstractC0169a;
import b2.AbstractC0279e;
import g4.AbstractC0465j;
import i4.C0494a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class e implements x, Y4.f {

    /* renamed from: a, reason: collision with root package name */
    public final W4.d f3531a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3537g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3538h;

    /* renamed from: i, reason: collision with root package name */
    public final a f3539i;

    /* renamed from: j, reason: collision with root package name */
    public final u f3540j;

    /* renamed from: k, reason: collision with root package name */
    public final C f3541k;

    /* renamed from: l, reason: collision with root package name */
    public final List f3542l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3543m;

    /* renamed from: n, reason: collision with root package name */
    public final M0.e f3544n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3545o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3546p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f3547q;

    /* renamed from: r, reason: collision with root package name */
    public Socket f3548r;

    /* renamed from: s, reason: collision with root package name */
    public Socket f3549s;

    /* renamed from: t, reason: collision with root package name */
    public T4.n f3550t;

    /* renamed from: u, reason: collision with root package name */
    public T4.v f3551u;

    /* renamed from: v, reason: collision with root package name */
    public B4.i f3552v;

    /* renamed from: w, reason: collision with root package name */
    public s f3553w;

    public e(W4.d taskRunner, t connectionPool, int i2, int i3, int i6, int i7, int i8, boolean z, a user, u routePlanner, C route, List list, int i9, M0.e eVar, int i10, boolean z5) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(user, "user");
        kotlin.jvm.internal.i.e(routePlanner, "routePlanner");
        kotlin.jvm.internal.i.e(route, "route");
        this.f3531a = taskRunner;
        this.f3532b = connectionPool;
        this.f3533c = i2;
        this.f3534d = i3;
        this.f3535e = i6;
        this.f3536f = i7;
        this.f3537g = i8;
        this.f3538h = z;
        this.f3539i = user;
        this.f3540j = routePlanner;
        this.f3541k = route;
        this.f3542l = list;
        this.f3543m = i9;
        this.f3544n = eVar;
        this.f3545o = i10;
        this.f3546p = z5;
    }

    @Override // X4.x
    public final x a() {
        return new e(this.f3531a, this.f3532b, this.f3533c, this.f3534d, this.f3535e, this.f3536f, this.f3537g, this.f3538h, this.f3539i, this.f3540j, this.f3541k, this.f3542l, this.f3543m, this.f3544n, this.f3545o, this.f3546p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:41:0x0101, B:49:0x0138, B:51:0x013f, B:54:0x0144, B:57:0x0149, B:59:0x014d, B:62:0x0156, B:65:0x015b, B:68:0x0161, B:88:0x012f, B:89:0x0132), top: B:6:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Type inference failed for: r13v5 */
    @Override // X4.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w b() {
        Socket socket;
        e eVar;
        e eVar2;
        W4.d dVar;
        t tVar;
        C c2;
        Socket socket2;
        T4.n nVar;
        T4.v vVar;
        B4.i iVar;
        Socket socket3 = this.f3548r;
        if (socket3 == 0) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (e()) {
            throw new IllegalStateException("already connected");
        }
        C c6 = this.f3541k;
        C0151a c0151a = c6.f2805a;
        C0151a c0151a2 = c6.f2805a;
        List list = c0151a.f2826j;
        a aVar = this.f3539i;
        aVar.b(this);
        e eVar3 = null;
        boolean z = false;
        try {
            try {
                try {
                    if (this.f3544n != null) {
                        w k3 = k();
                        if (k3.f3649b != null || k3.f3650c != null) {
                            aVar.n(this);
                            Socket socket4 = this.f3549s;
                            if (socket4 != null) {
                                U4.e.c(socket4);
                            }
                            U4.e.c(socket3);
                            return k3;
                        }
                    }
                    try {
                        if (c0151a2.f2819c != null) {
                            B4.i iVar2 = this.f3552v;
                            if (iVar2 == null) {
                                kotlin.jvm.internal.i.l("socket");
                                throw null;
                            }
                            if (((j5.q) iVar2.f312c).f10519b.a()) {
                                B4.i iVar3 = this.f3552v;
                                if (iVar3 == null) {
                                    kotlin.jvm.internal.i.l("socket");
                                    throw null;
                                }
                                if (((j5.p) iVar3.f313d).f10516b.a()) {
                                    aVar.f3523a.getClass();
                                    SSLSocketFactory sSLSocketFactory = c0151a2.f2819c;
                                    T4.q qVar = c0151a2.f2824h;
                                    Socket createSocket = sSLSocketFactory.createSocket(socket3, qVar.f2926d, qVar.f2927e, true);
                                    kotlin.jvm.internal.i.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                    SSLSocket sSLSocket = (SSLSocket) createSocket;
                                    e m6 = m(list, sSLSocket);
                                    T4.i iVar4 = (T4.i) list.get(m6.f3545o);
                                    e l2 = m6.l(list, sSLSocket);
                                    try {
                                        iVar4.a(sSLSocket, m6.f3546p);
                                        j(sSLSocket, iVar4);
                                        aVar.f3523a.getClass();
                                        eVar2 = l2;
                                    } catch (IOException e3) {
                                        e = e3;
                                        socket = socket3;
                                        eVar = null;
                                        eVar3 = l2;
                                        aVar.e(c6, e);
                                        if (this.f3538h) {
                                            w wVar = new w(this, eVar3, e);
                                            aVar.n(this);
                                            if (!z) {
                                            }
                                            return wVar;
                                        }
                                        eVar3 = eVar;
                                        w wVar2 = new w(this, eVar3, e);
                                        aVar.n(this);
                                        if (!z) {
                                        }
                                        return wVar2;
                                    }
                                }
                            }
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                        this.f3549s = socket3;
                        List list2 = c0151a2.f2825i;
                        T4.v vVar2 = T4.v.f2990g;
                        if (!list2.contains(vVar2)) {
                            vVar2 = T4.v.f2987d;
                        }
                        this.f3551u = vVar2;
                        eVar2 = null;
                        try {
                            dVar = this.f3531a;
                            tVar = this.f3532b;
                            c2 = this.f3541k;
                            socket2 = this.f3549s;
                            kotlin.jvm.internal.i.b(socket2);
                            nVar = this.f3550t;
                            vVar = this.f3551u;
                            kotlin.jvm.internal.i.b(vVar);
                            iVar = this.f3552v;
                        } catch (IOException e6) {
                            e = e6;
                            socket = socket3;
                            socket3 = 0;
                        }
                        try {
                            if (iVar == null) {
                                kotlin.jvm.internal.i.l("socket");
                                throw null;
                            }
                            socket = socket3;
                            eVar = null;
                            s sVar = new s(dVar, tVar, c2, socket3, socket2, nVar, vVar, iVar, this.f3537g, this.f3532b.f3625b);
                            this.f3553w = sVar;
                            sVar.i();
                            aVar.c(c6);
                            try {
                                w wVar3 = new w(this, (Throwable) null, 6);
                                aVar.n(this);
                                return wVar3;
                            } catch (IOException e7) {
                                e = e7;
                                eVar3 = eVar2;
                                z = true;
                                aVar.e(c6, e);
                                if (this.f3538h) {
                                }
                                eVar3 = eVar;
                                w wVar22 = new w(this, eVar3, e);
                                aVar.n(this);
                                if (!z) {
                                }
                                return wVar22;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                aVar.n(this);
                                if (!z) {
                                    Socket socket5 = this.f3549s;
                                    if (socket5 != null) {
                                        U4.e.c(socket5);
                                    }
                                    U4.e.c(socket);
                                }
                                throw th;
                            }
                        } catch (IOException e8) {
                            e = e8;
                            eVar3 = eVar2;
                            eVar = socket3;
                            aVar.e(c6, e);
                            if (this.f3538h && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                w wVar222 = new w(this, eVar3, e);
                                aVar.n(this);
                                if (!z) {
                                    Socket socket6 = this.f3549s;
                                    if (socket6 != null) {
                                        U4.e.c(socket6);
                                    }
                                    U4.e.c(socket);
                                }
                                return wVar222;
                            }
                            eVar3 = eVar;
                            w wVar2222 = new w(this, eVar3, e);
                            aVar.n(this);
                            if (!z) {
                            }
                            return wVar2222;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        socket = socket3;
                        eVar = null;
                        eVar3 = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                socket = socket3;
            }
        } catch (IOException e10) {
            e = e10;
            socket = socket3;
            eVar = null;
        }
    }

    @Override // X4.x
    public final s c() {
        a aVar = this.f3539i;
        C route = this.f3541k;
        aVar.getClass();
        kotlin.jvm.internal.i.e(route, "route");
        V0.j jVar = aVar.f3523a.f3589a.z;
        synchronized (jVar) {
            ((LinkedHashSet) jVar.f3212b).remove(route);
        }
        s connection = this.f3553w;
        kotlin.jvm.internal.i.b(connection);
        a aVar2 = this.f3539i;
        C route2 = this.f3541k;
        aVar2.getClass();
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(route2, "route");
        aVar2.f3524b.getClass();
        r call = aVar2.f3523a;
        kotlin.jvm.internal.i.e(call, "call");
        v i2 = this.f3540j.i(this, this.f3542l);
        if (i2 != null) {
            return i2.f3647a;
        }
        synchronized (connection) {
            t tVar = this.f3532b;
            tVar.getClass();
            TimeZone timeZone = U4.e.f3179a;
            tVar.f3630g.add(connection);
            tVar.f3628e.d(tVar.f3629f, 0L);
            this.f3539i.a(connection);
        }
        this.f3539i.g(connection);
        this.f3539i.h(connection);
        return connection;
    }

    @Override // X4.x, Y4.f
    public final void cancel() {
        this.f3547q = true;
        Socket socket = this.f3548r;
        if (socket != null) {
            U4.e.c(socket);
        }
    }

    @Override // Y4.f
    public final void d(r call, IOException iOException) {
        kotlin.jvm.internal.i.e(call, "call");
    }

    @Override // X4.x
    public final boolean e() {
        return this.f3551u != null;
    }

    @Override // Y4.f
    public final C f() {
        return this.f3541k;
    }

    @Override // X4.x
    public final w g() {
        Socket socket;
        Socket socket2;
        C c2 = this.f3541k;
        if (this.f3548r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f3539i;
        aVar.b(this);
        boolean z = false;
        try {
            try {
                aVar.f(c2);
                i();
                z = true;
                w wVar = new w(this, (Throwable) null, 6);
                aVar.n(this);
                return wVar;
            } catch (IOException e3) {
                c2.f2805a.getClass();
                Proxy proxy = c2.f2806b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    C0151a c0151a = c2.f2805a;
                    c0151a.f2823g.connectFailed(c0151a.f2824h.g(), proxy.address(), e3);
                }
                aVar.e(c2, e3);
                w wVar2 = new w(this, e3, 2);
                aVar.n(this);
                if (!z && (socket2 = this.f3548r) != null) {
                    U4.e.c(socket2);
                }
                return wVar2;
            }
        } catch (Throwable th) {
            aVar.n(this);
            if (!z && (socket = this.f3548r) != null) {
                U4.e.c(socket);
            }
            throw th;
        }
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.f3541k.f2806b.type();
        int i2 = type == null ? -1 : d.f3530a[type.ordinal()];
        if (i2 == 1 || i2 == 2) {
            createSocket = this.f3541k.f2805a.f2818b.createSocket();
            kotlin.jvm.internal.i.b(createSocket);
        } else {
            createSocket = new Socket(this.f3541k.f2806b);
        }
        this.f3548r = createSocket;
        if (this.f3547q) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f3536f);
        try {
            d5.e eVar = d5.e.f5492a;
            d5.e.f5492a.f(createSocket, this.f3541k.f2807c, this.f3535e);
            try {
                this.f3552v = new B4.i(new B0.i(createSocket));
            } catch (NullPointerException e3) {
                if (kotlin.jvm.internal.i.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3541k.f2807c);
            connectException.initCause(e6);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, T4.i iVar) {
        String str;
        T4.v vVar;
        final C0151a c0151a = this.f3541k.f2805a;
        try {
            if (iVar.f2883b) {
                d5.e eVar = d5.e.f5492a;
                d5.e.f5492a.e(sSLSocket, c0151a.f2824h.f2926d, c0151a.f2825i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.i.b(session);
            final T4.n o2 = e5.g.o(session);
            h5.c cVar = c0151a.f2820d;
            kotlin.jvm.internal.i.b(cVar);
            if (!cVar.verify(c0151a.f2824h.f2926d, session)) {
                List a6 = o2.a();
                if (a6.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0151a.f2824h.f2926d + " not verified (no certificates)");
                }
                Object obj = a6.get(0);
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c0151a.f2824h.f2926d);
                sb.append(" not verified:\n            |    certificate: ");
                C0154d c0154d = C0154d.f2844c;
                sb.append(K1.b.a0(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC0465j.N0(h5.c.a(x509Certificate, 7), h5.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(B4.l.F(sb.toString()));
            }
            final C0154d c0154d2 = c0151a.f2821e;
            kotlin.jvm.internal.i.b(c0154d2);
            this.f3550t = new T4.n(o2.f2909a, o2.f2910b, o2.f2911c, new InterfaceC1430a() { // from class: X4.c
                @Override // t4.InterfaceC1430a
                public final Object invoke() {
                    AbstractC0169a abstractC0169a = C0154d.this.f2846b;
                    kotlin.jvm.internal.i.b(abstractC0169a);
                    return abstractC0169a.c(c0151a.f2824h.f2926d, o2.a());
                }
            });
            String hostname = c0151a.f2824h.f2926d;
            kotlin.jvm.internal.i.e(hostname, "hostname");
            Iterator it = c0154d2.f2845a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f2883b) {
                d5.e eVar2 = d5.e.f5492a;
                str = d5.e.f5492a.g(sSLSocket);
            } else {
                str = null;
            }
            this.f3549s = sSLSocket;
            this.f3552v = new B4.i(new B0.i(sSLSocket));
            if (str != null) {
                T4.v.f2985b.getClass();
                vVar = C0152b.d(str);
            } else {
                vVar = T4.v.f2987d;
            }
            this.f3551u = vVar;
            d5.e eVar3 = d5.e.f5492a;
            d5.e.f5492a.getClass();
        } catch (Throwable th) {
            d5.e eVar4 = d5.e.f5492a;
            d5.e.f5492a.getClass();
            U4.e.c(sSLSocket);
            throw th;
        }
    }

    public final w k() {
        M0.e eVar = this.f3544n;
        kotlin.jvm.internal.i.b(eVar);
        C c2 = this.f3541k;
        String str = "CONNECT " + U4.e.i(c2.f2805a.f2824h, true) + " HTTP/1.1";
        B4.i iVar = this.f3552v;
        if (iVar == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        Z4.g gVar = new Z4.g(null, this, iVar);
        B4.i iVar2 = this.f3552v;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        j5.y d6 = ((j5.q) iVar2.f312c).f10518a.d();
        long j2 = this.f3533c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d6.g(j2, timeUnit);
        B4.i iVar3 = this.f3552v;
        if (iVar3 == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        ((j5.p) iVar3.f313d).f10515a.d().g(this.f3534d, timeUnit);
        gVar.l((T4.o) eVar.f1785e, str);
        gVar.b();
        T4.y j6 = gVar.j(false);
        kotlin.jvm.internal.i.b(j6);
        j6.f3000a = eVar;
        T4.z a6 = j6.a();
        long f3 = U4.e.f(a6);
        if (f3 != -1) {
            Z4.d k3 = gVar.k((T4.q) a6.f3015a.f1783c, f3);
            U4.e.g(k3, Integer.MAX_VALUE, timeUnit);
            k3.close();
        }
        int i2 = a6.f3018d;
        if (i2 == 200) {
            return new w(this, (Throwable) null, 6);
        }
        if (i2 != 407) {
            throw new IOException(AbstractC0279e.d(i2, "Unexpected response code for CONNECT: "));
        }
        c2.f2805a.f2822f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final e l(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        int i2 = this.f3545o;
        int size = connectionSpecs.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            T4.i iVar = (T4.i) connectionSpecs.get(i3);
            iVar.getClass();
            if (iVar.f2882a && (((strArr = iVar.f2885d) == null || U4.c.e(strArr, sSLSocket.getEnabledProtocols(), C0494a.f5832b)) && ((strArr2 = iVar.f2884c) == null || U4.c.e(strArr2, sSLSocket.getEnabledCipherSuites(), T4.f.f2848c)))) {
                return new e(this.f3531a, this.f3532b, this.f3533c, this.f3534d, this.f3535e, this.f3536f, this.f3537g, this.f3538h, this.f3539i, this.f3540j, this.f3541k, this.f3542l, this.f3543m, this.f3544n, i3, i2 != -1);
            }
        }
        return null;
    }

    public final e m(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        if (this.f3545o != -1) {
            return this;
        }
        e l2 = l(connectionSpecs, sSLSocket);
        if (l2 != null) {
            return l2;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f3546p);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.i.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.i.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // Y4.f
    public final void h() {
    }
}
