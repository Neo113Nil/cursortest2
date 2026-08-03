package M1;

/* loaded from: classes.dex */
public final class k extends P1.j {

    /* renamed from: b, reason: collision with root package name */
    public final I1.A f1069b;

    /* renamed from: c, reason: collision with root package name */
    public java.net.Socket f1070c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.Socket f1071d;

    /* renamed from: e, reason: collision with root package name */
    public I1.k f1072e;

    /* renamed from: f, reason: collision with root package name */
    public I1.t f1073f;

    /* renamed from: g, reason: collision with root package name */
    public P1.r f1074g;

    /* renamed from: h, reason: collision with root package name */
    public V1.q f1075h;

    /* renamed from: i, reason: collision with root package name */
    public V1.p f1076i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1077j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1078k;

    /* renamed from: l, reason: collision with root package name */
    public int f1079l;

    /* renamed from: m, reason: collision with root package name */
    public int f1080m;

    /* renamed from: n, reason: collision with root package name */
    public int f1081n;

    /* renamed from: o, reason: collision with root package name */
    public int f1082o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f1083p;

    /* renamed from: q, reason: collision with root package name */
    public long f1084q;

    public k(M1.l connectionPool, I1.A route) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        this.f1069b = route;
        this.f1082o = 1;
        this.f1083p = new java.util.ArrayList();
        this.f1084q = Long.MAX_VALUE;
    }

    public static void d(I1.s client, I1.A failedRoute, java.io.IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f661b.type() != java.net.Proxy.Type.DIRECT) {
            I1.C0026a c0026a = failedRoute.f660a;
            c0026a.f676g.connectFailed(c0026a.f677h.f(), failedRoute.f661b.address(), failure);
        }
        C.j jVar = client.f819y;
        synchronized (jVar) {
            ((java.util.LinkedHashSet) jVar.f88b).add(failedRoute);
        }
    }

    @Override // P1.j
    public final synchronized void a(P1.r connection, P1.E settings) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(settings, "settings");
        this.f1082o = (settings.f1441a & 16) != 0 ? settings.f1442b[4] : Integer.MAX_VALUE;
    }

    @Override // P1.j
    public final void b(P1.z zVar) {
        zVar.c(P1.EnumC0054b.REFUSED_STREAM, null);
    }

    public final void c(int i2, int i3, int i4, boolean z2, M1.i call) {
        I1.A a2;
        kotlin.jvm.internal.i.e(call, "call");
        if (this.f1073f != null) {
            throw new java.lang.IllegalStateException("already connected");
        }
        java.util.List list = this.f1069b.f660a.f679j;
        M1.b bVar = new M1.b(list);
        I1.C0026a c0026a = this.f1069b.f660a;
        if (c0026a.f672c == null) {
            if (!list.contains(I1.i.f728f)) {
                throw new M1.m(new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            java.lang.String str = this.f1069b.f660a.f677h.f764d;
            Q1.n nVar = Q1.n.f1644a;
            if (!Q1.n.f1644a.h(str)) {
                throw new M1.m(new java.net.UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (c0026a.f678i.contains(I1.t.H2_PRIOR_KNOWLEDGE)) {
            throw new M1.m(new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        M1.m mVar = null;
        do {
            try {
                I1.A a3 = this.f1069b;
                if (a3.f660a.f672c != null && a3.f661b.type() == java.net.Proxy.Type.HTTP) {
                    f(i2, i3, i4, call);
                    if (this.f1070c == null) {
                        a2 = this.f1069b;
                        if (a2.f660a.f672c == null && a2.f661b.type() == java.net.Proxy.Type.HTTP && this.f1070c == null) {
                            throw new M1.m(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f1084q = java.lang.System.nanoTime();
                        return;
                    }
                } else {
                    e(i2, i3, call);
                }
                g(bVar, call);
                java.net.InetSocketAddress inetSocketAddress = this.f1069b.f662c;
                kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                a2 = this.f1069b;
                if (a2.f660a.f672c == null) {
                }
                this.f1084q = java.lang.System.nanoTime();
                return;
            } catch (java.io.IOException e2) {
                java.net.Socket socket = this.f1071d;
                if (socket != null) {
                    J1.b.e(socket);
                }
                java.net.Socket socket2 = this.f1070c;
                if (socket2 != null) {
                    J1.b.e(socket2);
                }
                this.f1071d = null;
                this.f1070c = null;
                this.f1075h = null;
                this.f1076i = null;
                this.f1072e = null;
                this.f1073f = null;
                this.f1074g = null;
                this.f1082o = 1;
                java.net.InetSocketAddress inetSocketAddress2 = this.f1069b.f662c;
                kotlin.jvm.internal.i.e(inetSocketAddress2, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new M1.m(e2);
                } else {
                    Q1.d.b(mVar.f1091a, e2);
                    mVar.f1092b = e2;
                }
                if (!z2) {
                    throw mVar;
                }
                bVar.f1023d = true;
                if (!bVar.f1022c) {
                    throw mVar;
                }
                if (e2 instanceof java.net.ProtocolException) {
                    throw mVar;
                }
                if (e2 instanceof java.io.InterruptedIOException) {
                    throw mVar;
                }
                if ((e2 instanceof javax.net.ssl.SSLHandshakeException) && (e2.getCause() instanceof java.security.cert.CertificateException)) {
                    throw mVar;
                }
                if (e2 instanceof javax.net.ssl.SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e2 instanceof javax.net.ssl.SSLException);
        throw mVar;
    }

    public final void e(int i2, int i3, M1.i call) {
        java.net.Socket createSocket;
        I1.A a2 = this.f1069b;
        java.net.Proxy proxy = a2.f661b;
        I1.C0026a c0026a = a2.f660a;
        java.net.Proxy.Type type = proxy.type();
        int i4 = type == null ? -1 : M1.j.f1068a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            createSocket = c0026a.f671b.createSocket();
            kotlin.jvm.internal.i.b(createSocket);
        } else {
            createSocket = new java.net.Socket(proxy);
        }
        this.f1070c = createSocket;
        java.net.InetSocketAddress inetSocketAddress = this.f1069b.f662c;
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i3);
        try {
            Q1.n nVar = Q1.n.f1644a;
            Q1.n.f1644a.e(createSocket, this.f1069b.f662c, i2);
            try {
                this.f1075h = new V1.q(Q1.d.z(createSocket));
                this.f1076i = new V1.p(Q1.d.y(createSocket));
            } catch (java.lang.NullPointerException e2) {
                if (kotlin.jvm.internal.i.a(e2.getMessage(), "throw with null exception")) {
                    throw new java.io.IOException(e2);
                }
            }
        } catch (java.net.ConnectException e3) {
            java.net.ConnectException connectException = new java.net.ConnectException(kotlin.jvm.internal.i.h(this.f1069b.f662c, "Failed to connect to "));
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i2, int i3, int i4, M1.i iVar) {
        I1.u uVar = new I1.u();
        I1.A a2 = this.f1069b;
        I1.o url = a2.f660a.f677h;
        kotlin.jvm.internal.i.e(url, "url");
        uVar.f830c = url;
        uVar.c("CONNECT", null);
        I1.C0026a c0026a = a2.f660a;
        uVar.b("Host", J1.b.v(c0026a.f677h, true));
        uVar.b("Proxy-Connection", "Keep-Alive");
        uVar.b("User-Agent", "okhttp/4.11.0");
        I1.v a3 = uVar.a();
        I1.l lVar = new I1.l(0);
        a.AbstractC0059a.e("Proxy-Authenticate");
        a.AbstractC0059a.g("OkHttp-Preemptive", "Proxy-Authenticate");
        lVar.d("Proxy-Authenticate");
        lVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        lVar.b();
        c0026a.f675f.getClass();
        e(i2, i3, iVar);
        java.lang.String str = "CONNECT " + J1.b.v(a3.f834a, true) + " HTTP/1.1";
        V1.q qVar = this.f1075h;
        kotlin.jvm.internal.i.b(qVar);
        V1.p pVar = this.f1076i;
        kotlin.jvm.internal.i.b(pVar);
        M1.o oVar = new M1.o(null, this, qVar, pVar);
        V1.y d2 = qVar.f1784a.d();
        long j2 = i3;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        d2.g(j2, timeUnit);
        pVar.f1781a.d().g(i4, timeUnit);
        oVar.k(a3.f836c, str);
        oVar.c();
        I1.x f2 = oVar.f(false);
        kotlin.jvm.internal.i.b(f2);
        f2.f844a = a3;
        I1.y a4 = f2.a();
        long k2 = J1.b.k(a4);
        if (k2 != -1) {
            O1.e j3 = oVar.j(k2);
            J1.b.t(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a4.f860d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i5), "Unexpected response code for CONNECT: "));
            }
            c0026a.f675f.getClass();
            throw new java.io.IOException("Failed to authenticate with proxy");
        }
        if (!qVar.f1785b.a() || !pVar.f1782b.a()) {
            throw new java.io.IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(M1.b bVar, M1.i call) {
        int i2 = 1;
        I1.C0026a c0026a = this.f1069b.f660a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = c0026a.f672c;
        I1.t tVar = I1.t.HTTP_1_1;
        if (sSLSocketFactory == null) {
            java.util.List list = c0026a.f678i;
            I1.t tVar2 = I1.t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar2)) {
                this.f1071d = this.f1070c;
                this.f1073f = tVar;
                return;
            } else {
                this.f1071d = this.f1070c;
                this.f1073f = tVar2;
                l();
                return;
            }
        }
        kotlin.jvm.internal.i.e(call, "call");
        I1.C0026a c0026a2 = this.f1069b.f660a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = c0026a2.f672c;
        javax.net.ssl.SSLSocket sSLSocket = null;
        java.lang.String str = null;
        try {
            kotlin.jvm.internal.i.b(sSLSocketFactory2);
            java.net.Socket socket = this.f1070c;
            I1.o oVar = c0026a2.f677h;
            java.net.Socket createSocket = sSLSocketFactory2.createSocket(socket, oVar.f764d, oVar.f765e, true);
            if (createSocket == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            javax.net.ssl.SSLSocket sSLSocket2 = (javax.net.ssl.SSLSocket) createSocket;
            try {
                I1.i a2 = bVar.a(sSLSocket2);
                if (a2.f730b) {
                    Q1.n nVar = Q1.n.f1644a;
                    Q1.n.f1644a.d(sSLSocket2, c0026a2.f677h.f764d, c0026a2.f678i);
                }
                sSLSocket2.startHandshake();
                javax.net.ssl.SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.i.d(sslSocketSession, "sslSocketSession");
                I1.k m2 = Q1.l.m(sslSocketSession);
                U1.c cVar = c0026a2.f673d;
                kotlin.jvm.internal.i.b(cVar);
                if (!cVar.verify(c0026a2.f677h.f764d, sslSocketSession)) {
                    java.util.List a3 = m2.a();
                    if (a3.isEmpty()) {
                        throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + c0026a2.f677h.f764d + " not verified (no certificates)");
                    }
                    java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) a3.get(0);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("\n              |Hostname ");
                    sb.append(c0026a2.f677h.f764d);
                    sb.append(" not verified:\n              |    certificate: ");
                    I1.e eVar = I1.e.f701c;
                    sb.append(u0.AbstractC0995a.v(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((java.lang.Object) x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(i1.AbstractC0190i.T(U1.c.a(x509Certificate, 7), U1.c.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new javax.net.ssl.SSLPeerUnverifiedException(y1.h.E(sb.toString()));
                }
                I1.e eVar2 = c0026a2.f674e;
                kotlin.jvm.internal.i.b(eVar2);
                this.f1072e = new I1.k(m2.f746a, m2.f747b, m2.f748c, new I1.d(eVar2, m2, c0026a2, i2));
                eVar2.a(c0026a2.f677h.f764d, new F.U(4, this));
                if (a2.f730b) {
                    Q1.n nVar2 = Q1.n.f1644a;
                    str = Q1.n.f1644a.f(sSLSocket2);
                }
                this.f1071d = sSLSocket2;
                this.f1075h = new V1.q(Q1.d.z(sSLSocket2));
                this.f1076i = new V1.p(Q1.d.y(sSLSocket2));
                if (str != null) {
                    tVar = Q1.d.k(str);
                }
                this.f1073f = tVar;
                Q1.n nVar3 = Q1.n.f1644a;
                Q1.n.f1644a.a(sSLSocket2);
                if (this.f1073f == I1.t.HTTP_2) {
                    l();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Q1.n nVar4 = Q1.n.f1644a;
                    Q1.n.f1644a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    J1.b.e(sSLSocket);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (U1.c.c(r1, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(I1.C0026a c0026a, java.util.ArrayList arrayList) {
        I1.k kVar;
        int i2 = 0;
        byte[] bArr = J1.b.f932a;
        if (this.f1083p.size() < this.f1082o && !this.f1077j) {
            I1.A a2 = this.f1069b;
            if (!a2.f660a.a(c0026a)) {
                return false;
            }
            I1.o oVar = c0026a.f677h;
            java.lang.String str = oVar.f764d;
            I1.C0026a c0026a2 = a2.f660a;
            if (kotlin.jvm.internal.i.a(str, c0026a2.f677h.f764d)) {
                return true;
            }
            if (this.f1074g != null && arrayList != null && !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    I1.A a3 = (I1.A) it.next();
                    java.net.Proxy.Type type = a3.f661b.type();
                    java.net.Proxy.Type type2 = java.net.Proxy.Type.DIRECT;
                    if (type == type2 && a2.f661b.type() == type2) {
                        if (kotlin.jvm.internal.i.a(a2.f662c, a3.f662c)) {
                            if (c0026a.f673d != U1.c.f1742a) {
                                return false;
                            }
                            byte[] bArr2 = J1.b.f932a;
                            I1.o oVar2 = c0026a2.f677h;
                            if (oVar.f765e == oVar2.f765e) {
                                java.lang.String str2 = oVar2.f764d;
                                java.lang.String hostname = oVar.f764d;
                                if (!kotlin.jvm.internal.i.a(hostname, str2)) {
                                    if (!this.f1078k && (kVar = this.f1072e) != null) {
                                        java.util.List a4 = kVar.a();
                                        if (!a4.isEmpty()) {
                                        }
                                    }
                                }
                                try {
                                    I1.e eVar = c0026a.f674e;
                                    kotlin.jvm.internal.i.b(eVar);
                                    I1.k kVar2 = this.f1072e;
                                    kotlin.jvm.internal.i.b(kVar2);
                                    java.util.List peerCertificates = kVar2.a();
                                    kotlin.jvm.internal.i.e(hostname, "hostname");
                                    kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                                    eVar.a(hostname, new I1.d(eVar, peerCertificates, hostname, i2));
                                    return true;
                                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z2) {
        long j2;
        byte[] bArr = J1.b.f932a;
        long nanoTime = java.lang.System.nanoTime();
        java.net.Socket socket = this.f1070c;
        kotlin.jvm.internal.i.b(socket);
        java.net.Socket socket2 = this.f1071d;
        kotlin.jvm.internal.i.b(socket2);
        V1.q qVar = this.f1075h;
        kotlin.jvm.internal.i.b(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        P1.r rVar = this.f1074g;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f1517f) {
                    return false;
                }
                if (rVar.f1525n < rVar.f1524m) {
                    if (nanoTime >= rVar.f1526o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f1084q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !qVar.a();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (java.lang.Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public final N1.e j(I1.s client, N1.g gVar) {
        kotlin.jvm.internal.i.e(client, "client");
        java.net.Socket socket = this.f1071d;
        kotlin.jvm.internal.i.b(socket);
        V1.q qVar = this.f1075h;
        kotlin.jvm.internal.i.b(qVar);
        V1.p pVar = this.f1076i;
        kotlin.jvm.internal.i.b(pVar);
        P1.r rVar = this.f1074g;
        if (rVar != null) {
            return new P1.s(client, this, gVar, rVar);
        }
        int i2 = gVar.f1156g;
        socket.setSoTimeout(i2);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        qVar.f1784a.d().g(i2, timeUnit);
        pVar.f1781a.d().g(gVar.f1157h, timeUnit);
        return new M1.o(client, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f1077j = true;
    }

    public final void l() {
        java.net.Socket socket = this.f1071d;
        kotlin.jvm.internal.i.b(socket);
        V1.q qVar = this.f1075h;
        kotlin.jvm.internal.i.b(qVar);
        V1.p pVar = this.f1076i;
        kotlin.jvm.internal.i.b(pVar);
        boolean z2 = false;
        socket.setSoTimeout(0);
        L1.d dVar = L1.d.f997h;
        P1.h hVar = new P1.h(dVar);
        java.lang.String peerName = this.f1069b.f660a.f677h.f764d;
        kotlin.jvm.internal.i.e(peerName, "peerName");
        hVar.f1484b = socket;
        java.lang.String str = J1.b.f937f + ' ' + peerName;
        kotlin.jvm.internal.i.e(str, "<set-?>");
        hVar.f1485c = str;
        hVar.f1486d = qVar;
        hVar.f1487e = pVar;
        hVar.f1488f = this;
        P1.r rVar = new P1.r(hVar);
        this.f1074g = rVar;
        P1.E e2 = P1.r.f1511z;
        int i2 = 4;
        this.f1082o = (e2.f1441a & 16) != 0 ? e2.f1442b[4] : Integer.MAX_VALUE;
        P1.A a2 = rVar.f1533w;
        synchronized (a2) {
            try {
                if (a2.f1432d) {
                    throw new java.io.IOException("closed");
                }
                java.util.logging.Logger logger = P1.A.f1428f;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(J1.b.i(kotlin.jvm.internal.i.h(P1.g.f1479a.b(), ">> CONNECTION "), new java.lang.Object[0]));
                }
                V1.p pVar2 = a2.f1429a;
                V1.j byteString = P1.g.f1479a;
                pVar2.getClass();
                kotlin.jvm.internal.i.e(byteString, "byteString");
                if (pVar2.f1783c) {
                    throw new java.lang.IllegalStateException("closed");
                }
                pVar2.f1782b.r(byteString);
                pVar2.a();
                a2.f1429a.flush();
            } finally {
            }
        }
        P1.A a3 = rVar.f1533w;
        P1.E settings = rVar.f1527p;
        synchronized (a3) {
            try {
                kotlin.jvm.internal.i.e(settings, "settings");
                if (a3.f1432d) {
                    throw new java.io.IOException("closed");
                }
                a3.g(0, java.lang.Integer.bitCount(settings.f1441a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i3 + 1;
                    boolean z3 = true;
                    if (((1 << i3) & settings.f1441a) == 0) {
                        z3 = z2;
                    }
                    if (z3) {
                        int i5 = i3 != i2 ? i3 != 7 ? i3 : i2 : 3;
                        V1.p pVar3 = a3.f1429a;
                        if (pVar3.f1783c) {
                            throw new java.lang.IllegalStateException("closed");
                        }
                        V1.g gVar = pVar3.f1782b;
                        V1.r q2 = gVar.q(2);
                        int i6 = q2.f1789c;
                        byte b2 = (byte) ((i5 >>> 8) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                        byte[] bArr = q2.f1787a;
                        bArr[i6] = b2;
                        bArr[i6 + 1] = (byte) (i5 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                        q2.f1789c = i6 + 2;
                        gVar.f1764b += 2;
                        pVar3.a();
                        a3.f1429a.g(settings.f1442b[i3]);
                    }
                    i3 = i4;
                    z2 = false;
                    i2 = 4;
                }
                a3.f1429a.flush();
            } finally {
            }
        }
        if (rVar.f1527p.a() != 65535) {
            rVar.f1533w.n(0, r2 - 65535);
        }
        dVar.e().c(new L1.b(rVar.f1514c, rVar.f1534x, 0), 0L);
    }

    public final java.lang.String toString() {
        I1.g gVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection{");
        I1.A a2 = this.f1069b;
        sb.append(a2.f660a.f677h.f764d);
        sb.append(':');
        sb.append(a2.f660a.f677h.f765e);
        sb.append(", proxy=");
        sb.append(a2.f661b);
        sb.append(" hostAddress=");
        sb.append(a2.f662c);
        sb.append(" cipherSuite=");
        I1.k kVar = this.f1072e;
        java.lang.Object obj = "none";
        if (kVar != null && (gVar = kVar.f747b) != null) {
            obj = gVar;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f1073f);
        sb.append('}');
        return sb.toString();
    }
}
