package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f3857a;
    public final com.fyber.inneractive.sdk.network.f0 b;
    public final com.fyber.inneractive.sdk.network.h c;
    public com.fyber.inneractive.sdk.network.p0 d;
    public com.fyber.inneractive.sdk.network.l e;
    public volatile com.fyber.inneractive.sdk.network.i1 f;
    public final java.lang.String g;
    public final com.fyber.inneractive.sdk.config.global.r h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public final java.lang.Object n;
    public boolean o;

    public t0(com.fyber.inneractive.sdk.network.f0 f0Var, com.fyber.inneractive.sdk.network.h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f3857a = false;
        this.f = com.fyber.inneractive.sdk.network.i1.INITIAL;
        this.i = 0L;
        this.j = 0L;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = new java.lang.Object();
        this.o = false;
        this.b = f0Var;
        this.c = hVar;
        this.g = java.util.UUID.randomUUID().toString();
        this.h = rVar;
    }

    public abstract com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i);

    public void a(com.fyber.inneractive.sdk.network.o0 o0Var, java.lang.String str, java.lang.String str2) {
    }

    public void b(long j) {
        synchronized (this.n) {
            if (this.m) {
                this.k = (int) ((j - this.i) + this.k);
                this.m = false;
            }
        }
    }

    public void c() {
        this.f3857a = true;
    }

    public void d() {
        boolean z;
        synchronized (this.n) {
            z = this.l;
        }
        if (z) {
            a(java.lang.System.currentTimeMillis());
        } else if (t()) {
            b(java.lang.System.currentTimeMillis());
        }
    }

    public void e() {
        try {
            com.fyber.inneractive.sdk.network.l lVar = this.e;
            if (lVar != null) {
                lVar.a();
            }
            this.c.getClass();
        } catch (java.lang.Exception unused) {
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public java.lang.String h() {
        return null;
    }

    public com.fyber.inneractive.sdk.network.a i() {
        return null;
    }

    public int j() {
        return this.k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.h;
    }

    public java.util.Map l() {
        return null;
    }

    public abstract com.fyber.inneractive.sdk.network.m0 m();

    public java.lang.String n() {
        return "application/json; charset=utf-8";
    }

    public abstract com.fyber.inneractive.sdk.network.g1 o();

    public com.fyber.inneractive.sdk.network.l1 p() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        return new com.fyber.inneractive.sdk.network.l1(iAConfigManager.t.b.a("connect_timeout", 5000, 1), iAConfigManager.t.b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i;
        synchronized (this.n) {
            i = this.k;
        }
        return i;
    }

    public abstract java.lang.String r();

    public int s() {
        java.lang.Integer a2;
        com.fyber.inneractive.sdk.config.global.r rVar = this.h;
        if (rVar == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.l) rVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return a2.intValue();
    }

    public final boolean t() {
        boolean z;
        synchronized (this.n) {
            z = this.m;
        }
        return z;
    }

    public abstract boolean u();

    public final boolean v() {
        com.fyber.inneractive.sdk.config.global.features.l lVar;
        java.lang.Boolean c;
        java.lang.Boolean c2;
        return this.o && (((c = (lVar = (com.fyber.inneractive.sdk.config.global.features.l) com.fyber.inneractive.sdk.config.IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_add_request_watchdog")) != null && c.booleanValue()) || ((c2 = lVar.c("should_report_request_watchdog")) != null && c2.booleanValue()));
    }

    public com.fyber.inneractive.sdk.network.l a(java.lang.String str) {
        try {
            com.fyber.inneractive.sdk.network.p0 p0Var = this.d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.e = this.c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            com.fyber.inneractive.sdk.network.p0 p0Var2 = this.d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.e;
        } catch (com.fyber.inneractive.sdk.network.b e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed start network request for url: %s msg: %s", r(), e.getMessage());
            throw e;
        } catch (com.fyber.inneractive.sdk.network.q1 e2) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed read network response for url: %s msg: %s", r(), e2.getMessage());
            throw e2;
        } catch (java.lang.Exception e3) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed start network request for url: %s msg: %s", r(), e3.getMessage());
            throw e3;
        }
    }

    public void c(long j) {
        synchronized (this.n) {
            if (!this.l) {
                this.l = true;
                this.j = j;
            }
        }
    }

    public void d(long j) {
        synchronized (this.n) {
            if (!this.m) {
                this.m = true;
                this.i = j;
            }
        }
    }

    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.network.p0 p0Var;
        if (!z) {
            com.fyber.inneractive.sdk.network.i1 i1Var = com.fyber.inneractive.sdk.network.i1.RESOLVED;
            this.f = i1Var;
            if (i1Var == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY && (p0Var = this.d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.network.s0(this, obj, exc, z));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i, com.fyber.inneractive.sdk.network.o oVar, com.fyber.inneractive.sdk.response.j jVar) {
        try {
            com.fyber.inneractive.sdk.response.a a2 = com.fyber.inneractive.sdk.response.a.a(i);
            if (a2 == null) {
                a2 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f3667a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f3668a.get(a2);
            com.fyber.inneractive.sdk.response.b b = eVar != null ? eVar.b() : null;
            if (b == null) {
                com.fyber.inneractive.sdk.util.IAlog.f("Received ad type %s does not have an appropriate parser!", java.lang.Integer.valueOf(i));
                if (fVar.f3668a.size() == 0) {
                    android.util.Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new com.fyber.inneractive.sdk.network.n0("Could not find parser for ad type " + i);
            }
            com.fyber.inneractive.sdk.util.IAlog.a("Received ad type %s - Got parser! %s", java.lang.Integer.valueOf(i), b);
            if (jVar != null) {
                b.c = jVar;
            }
            b.f4250a = b.a();
            if (oVar != null) {
                b.c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e a3 = b.a(null);
            a3.H = j();
            com.fyber.inneractive.sdk.network.p0 p0Var = this.d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return a3;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse ad network request url: %s msg: %s", r(), e.getMessage());
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }

    public t0(com.fyber.inneractive.sdk.network.t0 t0Var) {
        this.f3857a = false;
        this.f = com.fyber.inneractive.sdk.network.i1.INITIAL;
        this.i = 0L;
        this.j = 0L;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = new java.lang.Object();
        this.o = false;
        this.b = t0Var.b;
        this.c = t0Var.c;
        this.g = java.util.UUID.randomUUID().toString();
        this.h = t0Var.h;
        this.k = t0Var.k;
        this.i = t0Var.i;
        this.j = t0Var.j;
    }

    public static int a(java.util.Map map) {
        java.util.List list = map != null ? (java.util.List) map.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH) : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((java.lang.String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j) {
        synchronized (this.n) {
            if (this.l) {
                this.k = (int) ((j - this.j) + this.k);
                this.l = false;
            }
        }
    }
}
