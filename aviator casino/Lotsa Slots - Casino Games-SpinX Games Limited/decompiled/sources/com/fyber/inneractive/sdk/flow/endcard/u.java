package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public class u extends com.fyber.inneractive.sdk.flow.endcard.a implements android.webkit.ValueCallback {
    public final com.fyber.inneractive.sdk.flow.vast.a c;
    public com.fyber.inneractive.sdk.player.controller.d d;
    public java.lang.String e;
    public boolean f;
    public android.view.ViewGroup g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public final com.fyber.inneractive.sdk.flow.endcard.s i;

    public u(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        super(bVar);
        this.f = false;
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = new com.fyber.inneractive.sdk.flow.endcard.s(this);
        com.fyber.inneractive.sdk.flow.x0 x0Var = bVar.c;
        com.fyber.inneractive.sdk.flow.t0 t0Var = x0Var.b;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
        this.c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.n, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.e, gVar.f, t0Var.d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        com.fyber.inneractive.sdk.web.i1 i1Var = e().f3879a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final android.view.View b() {
        android.view.ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f) {
            return null;
        }
        com.fyber.inneractive.sdk.web.i1 i1Var = e().f3879a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.b;
        if (mVar == null) {
            return null;
        }
        android.view.ViewGroup a2 = com.fyber.inneractive.sdk.flow.endcard.a.a(mVar);
        this.g = a2;
        return a2;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d e = e();
        com.fyber.inneractive.sdk.web.i1 i1Var = e.f3879a;
        if (i1Var != null) {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = e.c;
            if (!com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    public com.fyber.inneractive.sdk.flow.endcard.q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d e = e();
        com.fyber.inneractive.sdk.web.i1 i1Var = e.f3879a;
        if (i1Var != null) {
            i1Var.e();
            e.f3879a = null;
        }
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.d;
        if (dVar == null) {
            com.fyber.inneractive.sdk.flow.endcard.b bVar = this.b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.c.f3766a, this.c, bVar.i(), d());
            com.fyber.inneractive.sdk.flow.x0 x0Var = this.b.c;
            com.fyber.inneractive.sdk.web.i1 i1Var = dVar.f3879a;
            if (i1Var != null) {
                if (i1Var.s == null) {
                    i1Var.setAdContent(x0Var.b);
                }
                if (i1Var.r == null) {
                    i1Var.setAdRequest(x0Var.c);
                }
                if (i1Var.t == null) {
                    i1Var.setAdResponse(x0Var.d);
                }
            }
            this.d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        return sVar != null && sVar.b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s Playable detected: %s", this.f3682a, str);
            try {
                this.b.a(new org.json.JSONArray(str));
            } catch (org.json.JSONException e) {
                com.fyber.inneractive.sdk.util.IAlog.f("%s invalid playable detection method: %s", this.f3682a, e.getMessage());
            }
        }
        this.b.m();
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        com.fyber.inneractive.sdk.web.g tVar;
        java.lang.String str = this.e;
        if (!android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.player.controller.d e = e();
            if (aVar == null) {
                tVar = this.i;
            } else {
                tVar = new com.fyber.inneractive.sdk.flow.endcard.t(this, aVar);
            }
            e.a(str, tVar, !(this instanceof com.fyber.inneractive.sdk.flow.endcard.p));
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
    }
}
