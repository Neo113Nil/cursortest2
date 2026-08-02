package com.facetec.sdk;

/* loaded from: classes8.dex */
public class ms implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final java.util.List<com.facetec.sdk.na> f3657a = com.facetec.sdk.nh.c(com.facetec.sdk.na.HTTP_2, com.facetec.sdk.na.HTTP_1_1);
    static final java.util.List<com.facetec.sdk.mj> c = com.facetec.sdk.nh.c(com.facetec.sdk.mj.f3647a, com.facetec.sdk.mj.e);
    private com.facetec.sdk.lx A;
    private boolean B;
    private com.facetec.sdk.mk C;
    private com.facetec.sdk.mq D;
    final java.util.List<com.facetec.sdk.mu> b;
    final java.util.List<com.facetec.sdk.mu> d;
    final com.facetec.sdk.mo.c e;

    @javax.annotation.Nullable
    final com.facetec.sdk.ly f;
    public final com.facetec.sdk.lx g;

    @javax.annotation.Nullable
    final com.facetec.sdk.no h;
    public final boolean i;
    public final boolean j;
    final int k;
    final int l;
    final int m;
    final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3658o;
    private java.util.List<com.facetec.sdk.mj> p;

    @javax.annotation.Nullable
    private java.net.Proxy q;
    private com.facetec.sdk.mh r;
    private java.net.ProxySelector s;
    private java.util.List<com.facetec.sdk.na> t;
    private javax.net.ssl.SSLSocketFactory u;
    private javax.net.ssl.HostnameVerifier v;
    private com.facetec.sdk.mi w;
    private com.facetec.sdk.pg x;
    private javax.net.SocketFactory y;
    private com.facetec.sdk.me z;

    static {
        com.facetec.sdk.nd.d = new com.facetec.sdk.nd() { // from class: com.facetec.sdk.ms.5
            @Override // com.facetec.sdk.nd
            public final void c(com.facetec.sdk.mm.b bVar, java.lang.String str, java.lang.String str2) {
                bVar.a(str, str2);
            }

            @Override // com.facetec.sdk.nd
            public final boolean e(com.facetec.sdk.lz lzVar, com.facetec.sdk.lz lzVar2) {
                return lzVar.d(lzVar2);
            }

            @Override // com.facetec.sdk.nd
            public final com.facetec.sdk.nr c(com.facetec.sdk.mk mkVar) {
                return mkVar.c;
            }

            @Override // com.facetec.sdk.nd
            public final int d(com.facetec.sdk.mw.c cVar) {
                return cVar.d;
            }

            @Override // com.facetec.sdk.nd
            @javax.annotation.Nullable
            public final java.io.IOException a(com.facetec.sdk.md mdVar, @javax.annotation.Nullable java.io.IOException iOException) {
                return ((com.facetec.sdk.mz) mdVar).a(iOException);
            }

            @Override // com.facetec.sdk.nd
            public final void c(com.facetec.sdk.mm.b bVar, java.lang.String str) {
                int indexOf = str.indexOf(io.ktor.sse.ServerSentEventKt.COLON, 1);
                if (indexOf != -1) {
                    bVar.a(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(io.ktor.sse.ServerSentEventKt.COLON)) {
                    bVar.a("", str.substring(1));
                } else {
                    bVar.a("", str);
                }
            }

            @Override // com.facetec.sdk.nd
            public final boolean c(com.facetec.sdk.mk mkVar, com.facetec.sdk.nl nlVar) {
                if (!com.facetec.sdk.mk.i && !java.lang.Thread.holdsLock(mkVar)) {
                    throw new java.lang.AssertionError();
                }
                if (nlVar.g || mkVar.d == 0) {
                    mkVar.f3649a.remove(nlVar);
                    return true;
                }
                mkVar.notifyAll();
                return false;
            }

            @Override // com.facetec.sdk.nd
            public final com.facetec.sdk.nl a(com.facetec.sdk.mk mkVar, com.facetec.sdk.lz lzVar, com.facetec.sdk.nu nuVar, com.facetec.sdk.nc ncVar) {
                if (!com.facetec.sdk.mk.i && !java.lang.Thread.holdsLock(mkVar)) {
                    throw new java.lang.AssertionError();
                }
                for (com.facetec.sdk.nl nlVar : mkVar.f3649a) {
                    if (nlVar.a(lzVar, ncVar)) {
                        nuVar.e(nlVar, true);
                        return nlVar;
                    }
                }
                return null;
            }

            @Override // com.facetec.sdk.nd
            public final java.net.Socket e(com.facetec.sdk.mk mkVar, com.facetec.sdk.lz lzVar, com.facetec.sdk.nu nuVar) {
                if (!com.facetec.sdk.mk.i && !java.lang.Thread.holdsLock(mkVar)) {
                    throw new java.lang.AssertionError();
                }
                for (com.facetec.sdk.nl nlVar : mkVar.f3649a) {
                    if (nlVar.a(lzVar, null) && nlVar.b() && nlVar != nuVar.a()) {
                        if (!com.facetec.sdk.nu.g && !java.lang.Thread.holdsLock(nuVar.e)) {
                            throw new java.lang.AssertionError();
                        }
                        if (nuVar.j != null || nuVar.f3692a.f3684o.size() != 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        java.lang.ref.Reference<com.facetec.sdk.nu> reference = nuVar.f3692a.f3684o.get(0);
                        java.net.Socket d = nuVar.d(true, false, false);
                        nuVar.f3692a = nlVar;
                        nlVar.f3684o.add(reference);
                        return d;
                    }
                }
                return null;
            }

            @Override // com.facetec.sdk.nd
            public final void d(com.facetec.sdk.mk mkVar, com.facetec.sdk.nl nlVar) {
                if (!com.facetec.sdk.mk.i && !java.lang.Thread.holdsLock(mkVar)) {
                    throw new java.lang.AssertionError();
                }
                if (!mkVar.h) {
                    mkVar.h = true;
                    com.facetec.sdk.mk.e.execute(mkVar.b);
                }
                mkVar.f3649a.add(nlVar);
            }

            @Override // com.facetec.sdk.nd
            public final void b(com.facetec.sdk.mj mjVar, javax.net.ssl.SSLSocket sSLSocket, boolean z) {
                java.lang.String[] enabledCipherSuites;
                java.lang.String[] enabledProtocols;
                if (mjVar.b != null) {
                    enabledCipherSuites = com.facetec.sdk.nh.c(com.facetec.sdk.mc.e, sSLSocket.getEnabledCipherSuites(), mjVar.b);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (mjVar.h != null) {
                    enabledProtocols = com.facetec.sdk.nh.c(com.facetec.sdk.nh.i, sSLSocket.getEnabledProtocols(), mjVar.h);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a2 = com.facetec.sdk.nh.a(com.facetec.sdk.mc.e, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && a2 != -1) {
                    enabledCipherSuites = com.facetec.sdk.nh.c(enabledCipherSuites, supportedCipherSuites[a2]);
                }
                com.facetec.sdk.mj e = new com.facetec.sdk.mj.b(mjVar).c(enabledCipherSuites).b(enabledProtocols).e();
                if (e.h != null) {
                    sSLSocket.setEnabledProtocols(e.h);
                }
                if (e.b != null) {
                    sSLSocket.setEnabledCipherSuites(e.b);
                }
            }
        };
    }

    public ms() {
        this(new com.facetec.sdk.ms.a());
    }

    ms(com.facetec.sdk.ms.a aVar) {
        boolean z;
        this.r = aVar.f3659a;
        this.q = aVar.d;
        this.t = aVar.b;
        this.p = aVar.c;
        this.b = com.facetec.sdk.nh.e(aVar.e);
        this.d = com.facetec.sdk.nh.e(aVar.f);
        this.e = aVar.j;
        this.s = aVar.i;
        this.w = aVar.g;
        this.f = aVar.h;
        this.h = aVar.k;
        this.y = aVar.f3660o;
        java.util.Iterator<com.facetec.sdk.mj> it = this.p.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().d;
            }
        }
        if (aVar.n != null || !z) {
            this.u = aVar.n;
            this.x = aVar.m;
        } else {
            javax.net.ssl.X509TrustManager e = com.facetec.sdk.nh.e();
            this.u = a(e);
            this.x = com.facetec.sdk.pa.d().a(e);
        }
        if (this.u != null) {
            com.facetec.sdk.pa.d().e(this.u);
        }
        this.v = aVar.l;
        com.facetec.sdk.me meVar = aVar.t;
        com.facetec.sdk.pg pgVar = this.x;
        this.z = com.facetec.sdk.nh.d(meVar.d, pgVar) ? meVar : new com.facetec.sdk.me(meVar.e, pgVar);
        this.A = aVar.p;
        this.g = aVar.r;
        this.C = aVar.q;
        this.D = aVar.s;
        this.i = aVar.v;
        this.j = aVar.w;
        this.B = aVar.x;
        this.l = aVar.y;
        this.n = aVar.u;
        this.m = aVar.C;
        this.k = aVar.A;
        this.f3658o = aVar.B;
        if (this.b.contains(null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Null interceptor: ");
            sb.append(this.b);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.d.contains(null)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Null network interceptor: ");
            sb2.append(this.d);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    private static javax.net.ssl.SSLSocketFactory a(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            javax.net.ssl.SSLContext b = com.facetec.sdk.pa.d().b();
            b.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (java.security.GeneralSecurityException e) {
            throw com.facetec.sdk.nh.d("No System TLS", (java.lang.Exception) e);
        }
    }

    @javax.annotation.Nullable
    public final java.net.Proxy e() {
        return this.q;
    }

    public final java.net.ProxySelector b() {
        return this.s;
    }

    public final com.facetec.sdk.mi c() {
        return this.w;
    }

    public final com.facetec.sdk.mq d() {
        return this.D;
    }

    public final javax.net.SocketFactory a() {
        return this.y;
    }

    public final javax.net.ssl.SSLSocketFactory i() {
        return this.u;
    }

    public final javax.net.ssl.HostnameVerifier f() {
        return this.v;
    }

    public final com.facetec.sdk.me h() {
        return this.z;
    }

    public final com.facetec.sdk.lx g() {
        return this.A;
    }

    public final com.facetec.sdk.mk j() {
        return this.C;
    }

    public final boolean l() {
        return this.B;
    }

    public final com.facetec.sdk.mh m() {
        return this.r;
    }

    public final java.util.List<com.facetec.sdk.na> k() {
        return this.t;
    }

    public final java.util.List<com.facetec.sdk.mj> o() {
        return this.p;
    }

    public final com.facetec.sdk.md d(com.facetec.sdk.mx mxVar) {
        return com.facetec.sdk.mz.a(this, mxVar, false);
    }

    public static final class a {
        public int A;
        int B;
        public int C;

        @javax.annotation.Nullable
        java.net.Proxy d;
        com.facetec.sdk.mi g;

        @javax.annotation.Nullable
        com.facetec.sdk.ly h;
        java.net.ProxySelector i;

        @javax.annotation.Nullable
        com.facetec.sdk.no k;
        javax.net.ssl.HostnameVerifier l;

        @javax.annotation.Nullable
        com.facetec.sdk.pg m;

        @javax.annotation.Nullable
        javax.net.ssl.SSLSocketFactory n;

        /* renamed from: o, reason: collision with root package name */
        javax.net.SocketFactory f3660o;
        com.facetec.sdk.lx p;
        com.facetec.sdk.mk q;
        com.facetec.sdk.lx r;
        com.facetec.sdk.mq s;
        public com.facetec.sdk.me t;
        public int u;
        boolean v;
        boolean w;
        boolean x;
        int y;
        final java.util.List<com.facetec.sdk.mu> e = new java.util.ArrayList();
        final java.util.List<com.facetec.sdk.mu> f = new java.util.ArrayList();

        /* renamed from: a, reason: collision with root package name */
        com.facetec.sdk.mh f3659a = new com.facetec.sdk.mh();
        java.util.List<com.facetec.sdk.na> b = com.facetec.sdk.ms.f3657a;
        java.util.List<com.facetec.sdk.mj> c = com.facetec.sdk.ms.c;
        com.facetec.sdk.mo.c j = com.facetec.sdk.mo.a(com.facetec.sdk.mo.c);

        public a() {
            java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
            this.i = proxySelector;
            if (proxySelector == null) {
                this.i = new com.facetec.sdk.pc();
            }
            this.g = com.facetec.sdk.mi.f3646a;
            this.f3660o = javax.net.SocketFactory.getDefault();
            this.l = com.facetec.sdk.pf.d;
            this.t = com.facetec.sdk.me.c;
            this.p = com.facetec.sdk.lx.c;
            this.r = com.facetec.sdk.lx.c;
            this.q = new com.facetec.sdk.mk();
            this.s = com.facetec.sdk.mq.b;
            this.v = true;
            this.w = true;
            this.x = true;
            this.y = 0;
            this.u = 10000;
            this.C = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public final com.facetec.sdk.ms b() {
            return new com.facetec.sdk.ms(this);
        }
    }
}
