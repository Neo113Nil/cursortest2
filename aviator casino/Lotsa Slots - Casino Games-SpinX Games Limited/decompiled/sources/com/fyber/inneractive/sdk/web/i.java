package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public abstract class i implements com.fyber.inneractive.sdk.web.j, com.fyber.inneractive.sdk.util.m0, com.fyber.inneractive.sdk.web.l, com.fyber.inneractive.sdk.web.x0 {
    public com.fyber.inneractive.sdk.web.m b;
    public com.fyber.inneractive.sdk.web.j0 c;
    public com.fyber.inneractive.sdk.web.k0 d;
    public com.fyber.inneractive.sdk.web.g f;
    public com.fyber.inneractive.sdk.web.j1 g;
    public boolean j;
    public final boolean k;
    public com.fyber.inneractive.sdk.web.f l;
    public final com.fyber.inneractive.sdk.web.d m;
    public final com.fyber.inneractive.sdk.web.c n;
    public com.fyber.inneractive.sdk.web.e o;
    public java.lang.String p;
    public java.lang.String q;
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest r;
    public com.fyber.inneractive.sdk.flow.x s;
    public com.fyber.inneractive.sdk.response.e t;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4339a = false;
    public float h = 0.0f;
    public final android.graphics.Rect i = new android.graphics.Rect();
    public final boolean e = false;

    public i(boolean z, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.k = z;
        this.b = a(rVar);
        com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) this;
        this.n = new com.fyber.inneractive.sdk.web.c(i1Var);
        this.m = new com.fyber.inneractive.sdk.web.d(i1Var);
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(android.webkit.WebView webView) {
    }

    public abstract boolean a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    public void b(boolean z) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s destroy is fatal: %b", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z));
        com.fyber.inneractive.sdk.web.e eVar = this.o;
        if (eVar != null && !eVar.f4331a.isTerminated() && !eVar.f4331a.isShutdown()) {
            com.fyber.inneractive.sdk.web.e eVar2 = this.o;
            eVar2.f = true;
            eVar2.f4331a.shutdownNow();
            android.os.Handler handler = eVar2.b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.c;
                if (eVar3 != null) {
                    eVar2.b.removeCallbacks(eVar3);
                }
                eVar2.b = null;
            }
            this.o = null;
        }
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f4298a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.b);
            this.b.setWebChromeClient(null);
            if (f() == null) {
                this.b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e f = f();
                com.iab.omid.library.fyber.adsession.AdSession adSession = f.f3791a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (java.lang.Throwable unused) {
                    }
                    com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(f), z ? 0 : 1000);
                    f.f3791a = null;
                    f.b = null;
                }
            }
        }
        com.fyber.inneractive.sdk.web.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.e = null;
        }
        com.fyber.inneractive.sdk.web.c cVar = this.n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(cVar);
        }
        com.fyber.inneractive.sdk.web.d dVar2 = this.m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar2);
        }
        this.g = null;
        if (!z) {
            this.f = null;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.s = null;
        this.r = null;
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public com.fyber.inneractive.sdk.util.g1 g() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar == null) {
            return;
        }
        android.webkit.WebSettings settings = mVar.getSettings();
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!com.fyber.inneractive.sdk.config.IAConfigManager.N.q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        com.fyber.inneractive.sdk.web.m mVar2 = this.b;
        mVar2.setHorizontalScrollBarEnabled(false);
        mVar2.setHorizontalScrollbarOverlay(false);
        mVar2.setVerticalScrollBarEnabled(false);
        mVar2.setVerticalScrollbarOverlay(false);
        mVar2.getSettings().setSupportZoom(false);
        this.b.setFocusable(true);
        this.b.setBackgroundColor(0);
        com.fyber.inneractive.sdk.web.j0 j0Var = new com.fyber.inneractive.sdk.web.j0();
        this.c = j0Var;
        this.b.setWebChromeClient(j0Var);
        try {
            android.content.Context context = this.b.getContext();
            android.content.pm.ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z = false;
            }
            android.webkit.WebView.setWebContentsDebuggingEnabled(z);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Could not set web contents debugging flag", new java.lang.Object[0]);
        }
        this.b.setListener(this);
    }

    public final void i() {
        com.fyber.inneractive.sdk.util.IAlog.a("IAWebViewController resetClick()", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.web.c cVar = this.n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(cVar);
        }
        com.fyber.inneractive.sdk.web.d dVar = this.m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
        }
        this.j = false;
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.s = xVar;
    }

    public void setAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        this.r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.t = eVar;
    }

    public void setListener(com.fyber.inneractive.sdk.web.j1 j1Var) {
        this.g = j1Var;
    }

    public final com.fyber.inneractive.sdk.web.m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        com.fyber.inneractive.sdk.web.m mVar = new com.fyber.inneractive.sdk.web.m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            java.lang.Boolean c = fVar.c("agg_res");
            boolean booleanValue = c != null ? c.booleanValue() : false;
            java.lang.Integer a2 = fVar.a("agg_res_ct");
            int max = java.lang.Math.max(a2 != null ? a2.intValue() : 500, 50);
            java.lang.Integer a3 = fVar.a("agg_res_rt");
            int max2 = java.lang.Math.max(a3 != null ? a3.intValue() : 500, 50);
            java.lang.Integer a4 = fVar.a("agg_res_retries");
            z = booleanValue;
            i2 = max2;
            i3 = java.lang.Math.max(a4 != null ? a4.intValue() : 2, 1);
            i = max;
        } else {
            z = false;
            i = 500;
            i2 = 500;
            i3 = 2;
        }
        com.fyber.inneractive.sdk.web.k0 k0Var = new com.fyber.inneractive.sdk.web.k0(this, z, i, i2, i3);
        this.d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.web.g gVar = this.f;
        if (gVar != null) {
            gVar.a(this, inneractiveInfrastructureError);
        }
        b(true);
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f, android.graphics.Rect rect) {
        if (f == this.h && rect.equals(this.i)) {
            return;
        }
        this.h = f;
        this.i.set(rect);
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(android.webkit.WebView webView, java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("%shandleUrl called with: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), str);
        if (this.b == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new java.lang.Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            this.b.loadUrl("chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g = g();
        if (a(str, g)) {
            return true;
        }
        a(new com.fyber.inneractive.sdk.web.h(this, str, g));
        return true;
    }

    public void a(boolean z) {
        com.fyber.inneractive.sdk.util.IAlog.a("%sonWebViewVisibilityChanged called with: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z));
        com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
        if (j1Var != null) {
            j1Var.a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    public final void a(com.fyber.inneractive.sdk.web.f fVar) {
        com.fyber.inneractive.sdk.util.IAlog.e("IAWebViewController Web view click detected", new java.lang.Object[0]);
        if (this.j) {
            com.fyber.inneractive.sdk.util.IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new java.lang.Object[0]);
            fVar.d();
            i();
            return;
        }
        if (this.k) {
            com.fyber.inneractive.sdk.util.IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.web.d dVar = this.m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
            }
            this.l = fVar;
            if (this.m != null) {
                com.fyber.inneractive.sdk.util.r.b.postDelayed(this.m, com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("click_timeout", 1000, 1000));
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.web.d dVar2 = this.m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar2);
        }
        this.l = null;
        fVar.d();
    }
}
