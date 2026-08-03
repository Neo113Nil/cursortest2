package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class p0 extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.f {
    public com.fyber.inneractive.sdk.interfaces.e k;
    public java.lang.Runnable l;
    public com.fyber.inneractive.sdk.util.v1 m;
    public java.lang.Runnable n;
    public com.fyber.inneractive.sdk.util.v1 o;
    public long r;
    public com.fyber.inneractive.sdk.flow.m0 w;
    public boolean p = false;
    public boolean q = false;
    public boolean s = false;
    public boolean t = false;
    public final com.fyber.inneractive.sdk.util.a u = new com.fyber.inneractive.sdk.util.a();
    public final com.fyber.inneractive.sdk.util.a v = new com.fyber.inneractive.sdk.util.a();

    public abstract boolean I();

    public final void J() {
        if (this.l == null) {
            long M = M();
            this.r = M;
            this.l = new com.fyber.inneractive.sdk.flow.l0(this, M);
            com.fyber.inneractive.sdk.util.IAlog.a("%senabling close with delay %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Long.valueOf(this.r));
            com.fyber.inneractive.sdk.flow.x xVar = this.b;
            boolean b = xVar != null ? b(xVar) : false;
            if (!b || I()) {
                if (this.q) {
                    return;
                }
                this.q = true;
                com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.MILLISECONDS, this.r);
                this.m = v1Var;
                v1Var.e = new com.fyber.inneractive.sdk.flow.n0(this);
                v1Var.d = false;
                v1Var.c.sendEmptyMessage(1932593528);
                return;
            }
            if (b) {
                com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
                if (eVar != null) {
                    eVar.showCloseCountdown();
                }
                com.fyber.inneractive.sdk.flow.m0 m0Var = new com.fyber.inneractive.sdk.flow.m0(this, this.r + 100);
                this.w = m0Var;
                m0Var.start();
            }
        }
    }

    public abstract int K();

    public abstract int L();

    public abstract long M();

    public abstract boolean N();

    public abstract long a(long j);

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.interfaces.e eVar, android.app.Activity activity) {
        if (this.f3675a == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sYou must set the spot to render before calling renderAd", com.fyber.inneractive.sdk.util.IAlog.a(this));
            throw new com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (eVar != null) {
            this.k = eVar;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("%srenderAd called with a null activity!", com.fyber.inneractive.sdk.util.IAlog.a(this));
            throw new com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void b(boolean z) {
    }

    public abstract boolean b(com.fyber.inneractive.sdk.flow.x xVar);

    public final void d(boolean z) {
        com.fyber.inneractive.sdk.network.w wVar;
        if (this.b == null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
            wVar.c = uVar;
            wVar.f3860a = null;
            wVar.d = null;
        } else {
            com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            com.fyber.inneractive.sdk.flow.x xVar = this.b;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar.f3765a;
            com.fyber.inneractive.sdk.response.e eVar = xVar.b;
            org.json.JSONArray b = xVar.c.b();
            wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.c = uVar2;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        java.lang.Runnable runnable = this.l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.l = null;
        }
        java.lang.Runnable runnable2 = this.n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable2);
            this.n = null;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar != null) {
            eVar.destroy();
        }
        this.k = null;
        com.fyber.inneractive.sdk.flow.m0 m0Var = this.w;
        if (m0Var != null) {
            m0Var.cancel();
            this.w = null;
        }
        com.fyber.inneractive.sdk.util.v1 v1Var = this.o;
        if (v1Var != null) {
            v1Var.e = null;
            this.o = null;
        }
        com.fyber.inneractive.sdk.util.v1 v1Var2 = this.m;
        if (v1Var2 != null) {
            v1Var2.e = null;
            this.m = null;
        }
        super.destroy();
    }

    public final void e(boolean z) {
        com.fyber.inneractive.sdk.network.w wVar;
        this.p = true;
        if (z) {
            if (this.b == null) {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
                wVar.c = uVar;
                wVar.f3860a = null;
                wVar.d = null;
            } else {
                com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                com.fyber.inneractive.sdk.flow.x xVar = this.b;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar.f3765a;
                com.fyber.inneractive.sdk.response.e eVar = xVar.b;
                org.json.JSONArray b = xVar.c.b();
                wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.c = uVar2;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = b;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(N());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((java.lang.String) null);
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.k;
        if (eVar2 != null) {
            eVar2.showCloseButton(z, L(), K());
            if (z) {
                return;
            }
            com.fyber.inneractive.sdk.util.a aVar = this.v;
            aVar.d = 0L;
            aVar.e = 0L;
            aVar.f = 0L;
            aVar.b = false;
            aVar.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.v.f4284a = inneractiveAdSpot;
        this.u.f4284a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final android.view.View x() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar != null) {
            return eVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int y() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int z() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.k.getLayout().getWidth();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }
}
