package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class f1 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;
    public final com.fyber.inneractive.sdk.bidder.adm.y q;
    public int r;
    public final com.fyber.inneractive.sdk.response.e s;
    public final com.fyber.inneractive.sdk.config.global.r t;
    public final com.fyber.inneractive.sdk.network.timeouts.request.a u;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, java.lang.String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        super(vVar, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        this.r = 0;
        this.o = true;
        this.p = str;
        this.q = yVar;
        this.s = eVar;
        this.t = rVar;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER;
        java.lang.String name = unitDisplayType2.name();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String lowerCase = name.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.n) == null) {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f3542a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.n1.a(java.lang.String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        java.lang.String str2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.l;
        com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
        this.u = android.text.TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            java.io.InputStream inputStream = lVar.c;
            if (inputStream != null) {
                d(java.lang.System.currentTimeMillis());
                java.lang.StringBuffer b = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(java.lang.System.currentTimeMillis());
                java.lang.String stringBuffer = b.toString();
                com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.q.f3542a;
                int a2 = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.q;
                yVar.c = stringBuffer;
                com.fyber.inneractive.sdk.response.e a3 = a(a2, (com.fyber.inneractive.sdk.network.o) null, yVar);
                a3.h = stringBuffer;
                o0Var.f3851a = a3;
            }
            return o0Var;
        } catch (com.fyber.inneractive.sdk.network.b e) {
            e = e;
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.p, e.getMessage());
            b(java.lang.System.currentTimeMillis());
            throw new com.fyber.inneractive.sdk.network.t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e2) {
            b(java.lang.System.currentTimeMillis());
            throw new com.fyber.inneractive.sdk.network.n0(e2.getMessage(), e2);
        } catch (java.net.SocketTimeoutException e3) {
            e = e3;
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.p, e.getMessage());
            b(java.lang.System.currentTimeMillis());
            throw new com.fyber.inneractive.sdk.network.t1(e);
        } catch (java.net.UnknownHostException e4) {
            e = e4;
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.p, e.getMessage());
            b(java.lang.System.currentTimeMillis());
            throw new com.fyber.inneractive.sdk.network.t1(e);
        } catch (java.lang.Exception e5) {
            b(java.lang.System.currentTimeMillis());
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request url: %s msg: %s", this.p, e5.getMessage());
            throw new com.fyber.inneractive.sdk.network.n0(e5);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j) {
        super.b(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j) {
        super.c(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.r));
        com.fyber.inneractive.sdk.network.l0 l0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.r;
        this.f3857a = true;
        com.fyber.inneractive.sdk.network.f1 f1Var = new com.fyber.inneractive.sdk.network.f1(this);
        if ((l0Var instanceof com.fyber.inneractive.sdk.network.l0) && l0Var.c(f1Var)) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.r));
        a((java.lang.Object) null, new java.lang.Exception("Bidding ad request passed allowed time"), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.u.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int q = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.u;
        return ((aVar.c() + aVar.f) * this.r) + q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.t;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.u;
        return new com.fyber.inneractive.sdk.network.l1(aVar.i, aVar.h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.u.f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f3857a) {
            return false;
        }
        int i = this.r + 1;
        this.r = i;
        if (i > this.u.b()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.r - 1), java.lang.Integer.valueOf(this.u.b()), this.g);
            return false;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.r - 1), java.lang.Integer.valueOf(this.u.b()), this.g);
        this.u.a(this.r);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j) {
        super.d(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.l a(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.r), java.lang.Integer.valueOf(p().f3847a), java.lang.Integer.valueOf(p().b));
        return super.a(str);
    }

    public f1(com.fyber.inneractive.sdk.network.f1 f1Var) {
        super(f1Var);
        this.r = 0;
        this.o = true;
        this.p = f1Var.p;
        this.q = f1Var.q;
        this.s = f1Var.s;
        this.t = f1Var.t;
        this.u = f1Var.u;
        this.r = f1Var.r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j) {
        super.a(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(super.q()));
    }
}
