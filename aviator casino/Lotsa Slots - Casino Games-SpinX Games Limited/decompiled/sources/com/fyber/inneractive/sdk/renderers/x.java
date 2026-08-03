package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class x extends com.fyber.inneractive.sdk.flow.p0 implements com.fyber.inneractive.sdk.player.controller.g0, com.fyber.inneractive.sdk.flow.storepromo.observer.a, com.fyber.inneractive.sdk.rtb.watermark.a {
    public java.lang.ref.WeakReference A;
    public com.fyber.inneractive.sdk.external.g E;
    public com.fyber.inneractive.sdk.renderers.f0 G;
    public com.fyber.inneractive.sdk.util.viewtime.c M;
    public com.fyber.inneractive.sdk.interfaces.e x;
    public com.fyber.inneractive.sdk.player.ui.m y;
    public com.fyber.inneractive.sdk.player.controller.b z;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType F = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public final com.fyber.inneractive.sdk.renderers.w I = new com.fyber.inneractive.sdk.renderers.w(this);
    public final android.widget.RelativeLayout.LayoutParams J = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public boolean K = false;
    public boolean L = false;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean B() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        return mVar != null && mVar.b();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void G() {
        android.view.View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return this.K;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        java.lang.Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) xVar;
        if (t0Var.c == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.s) t0Var.c.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        java.lang.Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) xVar;
        if (t0Var.c == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.s) t0Var.c.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        int a2;
        long j;
        com.fyber.inneractive.sdk.renderers.f0 f0Var;
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            if (A()) {
                java.lang.Integer a3 = ((com.fyber.inneractive.sdk.config.global.features.c) ((com.fyber.inneractive.sdk.flow.t0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("end_card_skip_time_sec");
                int intValue = a3 != null ? a3.intValue() : 0;
                if (intValue < 0 || intValue > 5) {
                    intValue = 0;
                }
                if (intValue > 0) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: overriding endcard dismiss time with child mode with %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(intValue));
                    return intValue;
                }
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s: overriding endcard dismiss time with child mode with %d", com.fyber.inneractive.sdk.util.IAlog.a(this), 0);
            return 0L;
        }
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.config.l a4 = iAConfigManager.t.b.a("endcard");
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f4237a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j2 = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        if (j2 != null) {
            com.fyber.inneractive.sdk.flow.endcard.b a5 = j2.b.a();
            a2 = a5 != null ? a5.f : j2.f;
        } else {
            a2 = iAConfigManager.t.b.a("vast_endcard_x_delay", 5, 0);
        }
        long j3 = a2;
        if (a4.f3618a.containsKey("endcard_cr") || a4.f3618a.containsKey("endcard_ci")) {
            java.lang.String str = this.F != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED ? "endcard_ci" : "endcard_cr";
            if (a4.f3618a.containsKey(str)) {
                j = java.lang.Long.parseLong((java.lang.String) a4.f3618a.get(str));
                if (j >= 0 && j <= 5) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", com.fyber.inneractive.sdk.util.IAlog.a(this), this.F, java.lang.Long.valueOf(j));
                    this.t = true;
                    j3 = j;
                }
            }
            j = j3;
            if (j >= 0) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", com.fyber.inneractive.sdk.util.IAlog.a(this), this.F, java.lang.Long.valueOf(j));
                this.t = true;
                j3 = j;
            }
        }
        return j3 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        return mVar != null && mVar.c();
    }

    public final void O() {
        if (this.C || this.c == null) {
            return;
        }
        this.C = true;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null && (eVar.wasDismissedByUser() || com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("endcard").a())) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            if (xVar2 != null) {
                com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) xVar2;
                if (t0Var.i != null) {
                    java.lang.String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar = t0Var.i;
                    if (tVar != null) {
                        tVar.a("EVENT_TRACKING", strArr);
                    }
                }
            }
            com.fyber.inneractive.sdk.model.vast.x xVar3 = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE_LINEAR;
            com.fyber.inneractive.sdk.flow.x xVar4 = this.b;
            if (xVar4 != null) {
                com.fyber.inneractive.sdk.flow.t0 t0Var2 = (com.fyber.inneractive.sdk.flow.t0) xVar4;
                if (t0Var2.i != null) {
                    java.lang.String[] strArr2 = {xVar3.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var2.i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr2);
                    }
                }
            }
        }
        ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.f3675a);
    }

    public final void P() {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (s0Var = ((com.fyber.inneractive.sdk.flow.t0) xVar).d) == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
        if (r0Var.c != null) {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = r0Var.c.b;
            com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
            com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f3644a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        boolean booleanValue;
        java.lang.Boolean c;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.renderers.f0 f0Var;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.t.b;
        oVar.getClass();
        java.lang.String str = iAConfigManager.d;
        if ((oVar.b.containsKey(str) ? (com.fyber.inneractive.sdk.config.m) oVar.b.get(str) : new com.fyber.inneractive.sdk.config.m()).f3620a.containsKey("endcard")) {
            return false;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f4237a;
        }
        com.fyber.inneractive.sdk.config.global.features.v vVar = null;
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.b.a() : null;
        if (a2 == null || a2.i() != com.fyber.inneractive.sdk.model.vast.i.Static) {
            return false;
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        if (xVar2 != null && (rVar = ((com.fyber.inneractive.sdk.flow.t0) xVar2).c) != null) {
            vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
        }
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = this.F;
        vVar.getClass();
        int i = com.fyber.inneractive.sdk.config.global.features.t.f3604a[unitDisplayType.ordinal()];
        if (i == 1) {
            java.lang.Boolean c2 = vVar.c("countdown_rv");
            if (c2 == null) {
                return false;
            }
            booleanValue = c2.booleanValue();
        } else {
            if (i != 2 || (c = vVar.c("countdown_iv")) == null) {
                return false;
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
        if (!this.D) {
            this.u.a(true);
        }
        this.D = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.destroy();
        }
        if (this.B) {
            O();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(this);
            this.z.destroy();
            this.z = null;
        }
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if (mVar != null) {
            mVar.destroy();
            this.y = null;
        }
        this.x = null;
        this.A = null;
        this.M = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
        P();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        this.K = true;
        com.fyber.inneractive.sdk.flow.m0 m0Var = this.w;
        if (m0Var != null) {
            m0Var.cancel();
            this.w = null;
        }
        if (!this.s) {
            this.s = true;
            com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
            if (eVar != null) {
                d(eVar.isCloseButtonDisplay());
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.x;
        if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
            return;
        }
        e(true ^ this.t);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null) {
            com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
            cVar.d = mVar != null && mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        a(new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = this.F == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f3644a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        O();
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof com.fyber.inneractive.sdk.flow.i0)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.i0) inneractiveAdSpot).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        com.fyber.inneractive.sdk.util.v1 v1Var = this.m;
        if (v1Var != null) {
            v1Var.d = false;
            v1Var.a(android.os.SystemClock.uptimeMillis());
        }
        com.fyber.inneractive.sdk.util.v1 v1Var2 = this.o;
        if (v1Var2 != null) {
            v1Var2.d = false;
            v1Var2.a(android.os.SystemClock.uptimeMillis());
        }
        this.v.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null && i2 > -1) {
            cVar.f4318a = i2;
        }
        this.u.a();
        com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        com.fyber.inneractive.sdk.util.v1 v1Var = this.m;
        if (v1Var != null) {
            v1Var.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var = v1Var.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.v1 v1Var2 = this.o;
        if (v1Var2 != null) {
            v1Var2.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var2 = v1Var2.c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.u;
        if (aVar.b && aVar.e == 0) {
            aVar.e = java.lang.System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar2 = this.v;
        if (aVar2.b && aVar2.e == 0) {
            aVar2.e = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.player.controller.b bVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        android.view.View view;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        android.view.View view2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (tVar = ((com.fyber.inneractive.sdk.flow.t0) xVar).i) == null || (bVar = this.z) == null || (eVar = this.x) == null || (mVar = this.y) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) tVar.f;
        com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = nVar.v;
        if (bVar3 != null && (bVar2 = bVar3.d) != null && (cVar = bVar2.d) != null && cVar.b != null && (view = cVar.f3755a) != null && view.getParent() != null && cVar.b.getVisibility() == 0) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVar4 = nVar.v;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar5 = bVar4.d;
            if (bVar5 == null || (cVar2 = bVar5.d) == null || cVar2.b == null || (view2 = cVar2.f3755a) == null || view2.getParent() == null || cVar2.b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.util.IAlog.f("StorePromoManager: hidePromo: unable hide promo: controller null or not ready", new java.lang.Object[0]);
            } else {
                bVar4.d.a();
            }
        } else if (mVar.c()) {
            if (this.p) {
                eVar.dismissAd(true);
            }
        } else if (bVar.b()) {
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) bVar;
            if (zVar.B()) {
                zVar.g(true);
            } else {
                zVar.d(true);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void v() {
        android.view.View view = this.j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, android.app.Activity activity) {
        com.fyber.inneractive.sdk.player.n nVar;
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        super.a(eVar, activity);
        this.x = eVar;
        boolean z = false;
        this.B = false;
        this.C = false;
        this.L = false;
        com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = this.f3675a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (selectedUnitController instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController) {
                com.fyber.inneractive.sdk.external.InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) {
                        this.A = new java.lang.ref.WeakReference((com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        com.fyber.inneractive.sdk.util.IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", com.fyber.inneractive.sdk.util.IAlog.a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            } else {
                com.fyber.inneractive.sdk.util.IAlog.f("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", com.fyber.inneractive.sdk.util.IAlog.a(this));
            }
        }
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f3675a.getAdContent().d;
        if (s0Var != null && (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f) != null) {
            this.F = t0Var.j;
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            ((com.fyber.inneractive.sdk.flow.t0) xVar).e();
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        com.fyber.inneractive.sdk.util.viewtime.c cVar = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar2 != null ? ((com.fyber.inneractive.sdk.flow.t0) xVar2).i : null;
        android.content.Context context = this.x.getLayout().getContext();
        if (tVar2 != null) {
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f;
            if (aVar == null || ((com.fyber.inneractive.sdk.player.n) aVar).f4138a == null) {
                com.fyber.inneractive.sdk.util.IAlog.f("%sFull screen video ad renderer is not valid.", com.fyber.inneractive.sdk.util.IAlog.a(this));
                throw new com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            com.fyber.inneractive.sdk.renderers.f fVar = aVar != null ? new com.fyber.inneractive.sdk.renderers.f(tVar2) : null;
            this.G = fVar;
            this.y = fVar.a(context, ((com.fyber.inneractive.sdk.flow.t0) this.b).c);
            com.fyber.inneractive.sdk.player.controller.b a2 = this.G.a(this.f3675a, (com.fyber.inneractive.sdk.flow.t0) this.b);
            this.z = a2;
            this.G.b();
            a2.b(false);
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) this.z;
            zVar.getClass();
            zVar.g = this;
            ((com.fyber.inneractive.sdk.player.controller.z) this.z).a(this);
            ((com.fyber.inneractive.sdk.player.ui.e) this.y).f();
            this.J.addRule(13);
            this.x.getLayout().addView((android.view.View) this.y, this.J);
            this.j = ((android.view.View) this.y).findViewById(com.fyber.inneractive.sdk.R.id.ia_click_overlay);
            this.G.a(this.I);
            this.B = true;
            com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
            if (xVar3 != null && (tVar = ((com.fyber.inneractive.sdk.flow.t0) xVar3).i) != null) {
                com.fyber.inneractive.sdk.player.a aVar2 = tVar.f;
                if (aVar2 instanceof com.fyber.inneractive.sdk.player.n) {
                    nVar = (com.fyber.inneractive.sdk.player.n) aVar2;
                    if (nVar != null || this.z == null) {
                        com.fyber.inneractive.sdk.util.IAlog.b("%s%s is null, cannot create VideoViewTime", com.fyber.inneractive.sdk.util.IAlog.a(this), nVar != null ? "mediaPlayerFlowManager" : "mUIController");
                    } else {
                        int c = nVar.f4138a.c();
                        com.fyber.inneractive.sdk.flow.x xVar4 = this.b;
                        com.fyber.inneractive.sdk.util.a aVar3 = this.u;
                        int l = ((com.fyber.inneractive.sdk.player.controller.z) this.z).l() * 1000;
                        boolean a3 = com.fyber.inneractive.sdk.player.f.a(c, com.fyber.inneractive.sdk.player.f.a(nVar), ((com.fyber.inneractive.sdk.flow.t0) this.b).d);
                        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild() || this.F != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
                            z = a3;
                        } else if (c > l) {
                            z = true;
                        }
                        cVar = new com.fyber.inneractive.sdk.util.viewtime.c(xVar4, aVar3, z);
                    }
                    this.M = cVar;
                }
            }
            nVar = null;
            if (nVar != null) {
            }
            com.fyber.inneractive.sdk.util.IAlog.b("%s%s is null, cannot create VideoViewTime", com.fyber.inneractive.sdk.util.IAlog.a(this), nVar != null ? "mediaPlayerFlowManager" : "mUIController");
            this.M = cVar;
        }
    }

    public final void f(boolean z) {
        if (N() && this.K) {
            return;
        }
        if (z) {
            com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
            com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.o oVar = j != null ? (com.fyber.inneractive.sdk.flow.endcard.o) j.b.a(com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) : null;
            this.v.a(oVar != null ? oVar.g().toString() : null);
            return;
        }
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        aVar.d = 0L;
        aVar.e = 0L;
        aVar.f = 0L;
        aVar.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if ((!((r2 == null || (r2 = r2.B) == null || !android.text.TextUtils.equals(r2, "1")) ? false : true)) == false) goto L51;
     */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.model.vast.o oVar;
        android.view.ViewGroup viewGroup;
        f(z);
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if ((mVar == null || (viewGroup = ((com.fyber.inneractive.sdk.player.ui.s) mVar).r) == null || viewGroup.getVisibility() != 0) && !this.H) {
            if (j != null) {
                com.fyber.inneractive.sdk.response.g gVar = j.f3688a.d;
            }
            com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.a() : null;
            if (a2 != null && (oVar = a2.c.e.f) != null && oVar.d) {
                this.K = false;
                this.p = false;
                com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
                if (eVar != null) {
                    eVar.disableCloseButton();
                }
                com.fyber.inneractive.sdk.util.a aVar = this.v;
                aVar.d = 0L;
                aVar.e = 0L;
                aVar.f = 0L;
                aVar.b = false;
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
                J();
                this.G.f4237a.a(a2);
                com.fyber.inneractive.sdk.interfaces.e eVar2 = this.x;
                if (eVar2 != null) {
                    eVar2.secondEndCardWasDisplayed();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.interfaces.e eVar3 = this.x;
            if (eVar3 != null) {
                eVar3.destroy();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar4 = this.x;
        if (eVar4 != null) {
            eVar4.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("Unable to register store promo observer - ui controller unavailable", new java.lang.Object[0]);
            return false;
        }
        return ((com.fyber.inneractive.sdk.player.controller.z) bVar).a(aVar);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.E = gVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        android.content.Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        P();
        if (this.y.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f4302a;
        } else {
            context = this.y.getContext();
        }
        android.content.Context context2 = context;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        return a(context2, (xVar == null || (eVar = ((com.fyber.inneractive.sdk.flow.t0) xVar).b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).L) == null) ? null : bVar.b, g1Var, gVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar == null || eVar.getLayout() == null || this.x.getLayout().getContext() == null) {
            return;
        }
        if (!this.L) {
            com.fyber.inneractive.sdk.network.b0.a(this.x.getLayout().getContext(), str, str2, this.b);
            this.L = true;
            com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.IAlog.a(this) + "reporting auto redirect", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.IAlog.a(this) + "redirect already reported for this ad", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var, boolean z) {
        com.fyber.inneractive.sdk.renderers.f0 f0Var;
        if (this.F == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL) {
            this.H = true;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f4237a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.b.a() : null;
        if (a2 != null) {
            P();
            com.fyber.inneractive.sdk.util.d0 a3 = a(a2.c.f3766a, str, g1Var, a2.g(), false, null);
            if (a3.f4288a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                com.fyber.inneractive.sdk.flow.t0 t0Var = a2.c.b;
                java.lang.String[] strArr = {com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK.toString()};
                com.fyber.inneractive.sdk.player.t tVar = t0Var.i;
                if (tVar != null) {
                    tVar.a("EVENT_TRACKING", strArr);
                }
            }
            return a3;
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
        java.lang.ref.WeakReference weakReference;
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null && i > -1) {
            cVar.f4318a = i;
        }
        if (cVar != null) {
            cVar.a(z);
            this.M = null;
        }
        com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = this.F;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar2 = unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f3644a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar2));
        }
        if (this.F == unitDisplayType2) {
            com.fyber.inneractive.sdk.external.g gVar = this.E;
            if (gVar != null) {
                weakReference = ((com.fyber.inneractive.sdk.flow.s0) gVar.f3663a).mAdSpot;
                com.fyber.inneractive.sdk.flow.i0 i0Var = (com.fyber.inneractive.sdk.flow.i0) com.fyber.inneractive.sdk.util.v.a(weakReference);
                com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f3663a.b;
                if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                    inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
                }
            }
            H();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || ((com.fyber.inneractive.sdk.flow.t0) xVar).i == null) {
            return;
        }
        J();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z) {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        if (z) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_SKIP;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            if (xVar2 != null) {
                com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) xVar2;
                if (t0Var.i != null) {
                    java.lang.String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var.i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr);
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
        if (xVar3 == null || (tVar = ((com.fyber.inneractive.sdk.flow.t0) xVar3).i) == null) {
            return;
        }
        tVar.a("TRACKING_COMPLETED", new java.lang.String[0]);
        J();
        java.lang.String[] strArr2 = new java.lang.String[0];
        com.fyber.inneractive.sdk.player.t tVar3 = ((com.fyber.inneractive.sdk.flow.t0) this.b).i;
        if (tVar3 != null) {
            tVar3.a("TRACKING_COMPLETED", strArr2);
        }
        if (com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("endcard").a() && z && (eVar = this.x) != null) {
            eVar.destroy();
        }
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null) {
            cVar.a(z);
            this.M = null;
        }
        f(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view, java.lang.String str) {
        if (view != null) {
            com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(c(view), str);
            c(view);
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view) {
        c(view);
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        if (this.t) {
            return j;
        }
        long j2 = 12;
        try {
            j2 = java.lang.Long.parseLong(com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("vast_endcard_x_fallback_delay", java.lang.Long.toString(12L)));
        } catch (java.lang.Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("Unable to unregister store promo observer - ui controller unavailable", new java.lang.Object[0]);
        } else {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        if (this.F == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveFullscreenVideoAdRenderer: update: StorePromo isClicked: %s", java.lang.Boolean.valueOf(bVar.b));
            this.H = bVar.b;
        }
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(android.widget.FrameLayout frameLayout) {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if (mVar != null) {
            ((com.fyber.inneractive.sdk.player.ui.e) mVar).setWatermarkView(frameLayout);
        }
    }
}
