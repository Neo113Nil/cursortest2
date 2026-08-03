package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class v extends com.fyber.inneractive.sdk.flow.p0 implements com.fyber.inneractive.sdk.rtb.watermark.a {
    public com.fyber.inneractive.sdk.util.v1 F;
    public com.fyber.inneractive.sdk.external.g J;
    public com.fyber.inneractive.sdk.util.viewtime.b K;
    public com.fyber.inneractive.sdk.renderers.u x;
    public com.fyber.inneractive.sdk.ui.IAmraidWebViewController z;
    public boolean y = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType G = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public boolean I = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return !this.C && this.z.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        java.lang.Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        com.fyber.inneractive.sdk.flow.q0 q0Var = (com.fyber.inneractive.sdk.flow.q0) xVar;
        if (q0Var.c == null || q0Var.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.e) ((com.fyber.inneractive.sdk.flow.q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
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
        com.fyber.inneractive.sdk.flow.q0 q0Var = (com.fyber.inneractive.sdk.flow.q0) xVar;
        if (q0Var.c == null || q0Var.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.e) ((com.fyber.inneractive.sdk.flow.q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        int i;
        com.fyber.inneractive.sdk.response.e eVar;
        int i2 = 5;
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
            i = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("rewarded_mraid_delay", 31, 30);
            com.fyber.inneractive.sdk.util.IAlog.a("%sGetting rewarded total delay of %d seconds", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i));
        } else {
            com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
            if (sVar == null) {
                i = 5;
            } else {
                com.fyber.inneractive.sdk.config.o oVar = sVar.b;
                int b = oVar.b("mraid_x_delay_v2", 5, 0);
                com.fyber.inneractive.sdk.config.l a2 = oVar.a("int_configuration");
                if (a2 == null || !a2.f3618a.containsKey("close_d")) {
                    if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL) {
                        com.fyber.inneractive.sdk.config.enums.CreativeType creativeType = com.fyber.inneractive.sdk.config.enums.CreativeType.PLAYABLE;
                        com.fyber.inneractive.sdk.flow.x xVar = this.b;
                        if (creativeType.equals((xVar == null || (eVar = ((com.fyber.inneractive.sdk.flow.q0) xVar).b) == null) ? null : ((com.fyber.inneractive.sdk.response.f) eVar).J)) {
                            i = oVar.b("d_ad_int_pl", b, 5);
                        }
                    }
                    i = b;
                } else {
                    if (a2.f3618a.containsKey("close_d")) {
                        i = java.lang.Integer.parseInt((java.lang.String) a2.f3618a.get("close_d"));
                        if (i >= 0 || i > 30) {
                            i = 5;
                        }
                        this.t = true;
                    }
                    i = 5;
                    if (i >= 0) {
                    }
                    i = 5;
                    this.t = true;
                }
            }
        }
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            if (A()) {
                java.lang.Integer a3 = ((com.fyber.inneractive.sdk.config.global.features.c) ((com.fyber.inneractive.sdk.flow.q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("skip_time_sec");
                int intValue = a3 != null ? a3.intValue() : 5;
                if (intValue >= 0 && intValue <= 8) {
                    i2 = intValue;
                }
            } else {
                i2 = java.lang.Math.min(i, 5);
            }
            i = java.lang.Math.min(i2, i);
        }
        return i * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        return false;
    }

    public final void P() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController;
        if (this.b == null || (iAmraidWebViewController = this.z) == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.b;
        if (mVar != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, android.app.Activity activity) {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.config.l0 l0Var = (xVar == null || (s0Var = ((com.fyber.inneractive.sdk.flow.q0) xVar).d) == null) ? null : ((com.fyber.inneractive.sdk.config.r0) s0Var).c;
        if (l0Var == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", com.fyber.inneractive.sdk.util.IAlog.a(this));
            throw new com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((com.fyber.inneractive.sdk.flow.q0) xVar).i : null;
        this.z = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.b == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", com.fyber.inneractive.sdk.util.IAlog.a(this));
            throw new com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((com.fyber.inneractive.sdk.flow.q0) xVar).e();
        this.G = l0Var.b;
        this.A = false;
        this.B = false;
        this.K = new com.fyber.inneractive.sdk.util.viewtime.b(this.f3675a);
        this.k = eVar;
        if (this.z == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.b);
            return;
        }
        android.view.View closeButton = eVar.getCloseButton();
        if (closeButton != null) {
            this.z.a(closeButton, com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        }
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((com.fyber.inneractive.sdk.flow.q0) this.b).b;
        int i = fVar.e;
        int i2 = fVar.f;
        boolean z = (i == 300 && i2 == 250) || (i == 600 && i2 == 500);
        this.C = z;
        if (z) {
            this.z.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i), com.fyber.inneractive.sdk.util.o.a(i2));
        }
        if (this.x == null) {
            this.x = new com.fyber.inneractive.sdk.renderers.u(this);
        }
        this.z.setListener(this.x);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f3675a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f3765a, adContent.b, adContent.c);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
            com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            com.fyber.inneractive.sdk.ui.IFyberAdIdentifier iFyberAdIdentifier = gVar.d;
            iFyberAdIdentifier.k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.z.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        P();
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController2 = this.z;
        android.view.ViewGroup layout = this.k.getLayout();
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = ((com.fyber.inneractive.sdk.flow.q0) this.b).f3765a;
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.b;
        if (mVar != null) {
            layout.addView(mVar);
            com.fyber.inneractive.sdk.util.l0.f4298a.a(layout.getContext(), iAmraidWebViewController2.b, iAmraidWebViewController2);
            com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.b;
            if (mVar2 != null) {
                mVar2.setTapListener(iAmraidWebViewController2);
            }
        }
        this.A = true;
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
            com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.SECONDS, com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("rewarded_mraid_delay", 31, 30));
            this.F = v1Var;
            v1Var.e = new com.fyber.inneractive.sdk.renderers.t(this);
            v1Var.d = false;
            v1Var.c.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(android.view.View view) {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener;
        if (this.A && !this.B && (eventsListener = this.c) != null) {
            this.B = true;
            ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f3675a);
        }
        this.x = null;
        com.fyber.inneractive.sdk.util.v1 v1Var = this.F;
        if (v1Var != null) {
            v1Var.e = null;
            this.F = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(android.view.View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            com.iab.omid.library.fyber.adsession.AdSession adSession = eVar.f3791a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener;
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED && this.H) {
            O();
        }
        if (!this.B && (eventsListener = this.c) != null) {
            this.B = true;
            ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f3675a);
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null && bVar.c != 0) {
            java.lang.String a2 = com.fyber.inneractive.sdk.util.c0.a(java.lang.System.currentTimeMillis(), bVar.c, bVar.e);
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = bVar.b;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f3765a : null;
            com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.b : null;
            org.json.JSONArray b = (adContent == null || (rVar = adContent.c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.c = uVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
            wVar.a("time", a2);
            wVar.a((java.lang.String) null);
            bVar.c = 0L;
            bVar.d = 0L;
            bVar.e = 0L;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.f3675a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof com.fyber.inneractive.sdk.flow.i0)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        com.fyber.inneractive.sdk.util.v1 v1Var;
        com.fyber.inneractive.sdk.util.v1 v1Var2 = this.m;
        if (v1Var2 != null) {
            v1Var2.d = false;
            v1Var2.a(android.os.SystemClock.uptimeMillis());
        }
        com.fyber.inneractive.sdk.util.v1 v1Var3 = this.o;
        if (v1Var3 != null) {
            v1Var3.d = false;
            v1Var3.a(android.os.SystemClock.uptimeMillis());
        }
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED && (v1Var = this.F) != null) {
            v1Var.d = false;
            v1Var.a(android.os.SystemClock.uptimeMillis());
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null) {
            if (bVar.c == 0) {
                bVar.c = java.lang.System.currentTimeMillis();
            }
            if (bVar.d > 0) {
                bVar.e += java.lang.System.currentTimeMillis() - bVar.d;
                bVar.d = 0L;
            }
        }
        this.v.a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        com.fyber.inneractive.sdk.util.v1 v1Var;
        com.fyber.inneractive.sdk.util.v1 v1Var2 = this.m;
        if (v1Var2 != null) {
            v1Var2.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var = v1Var2.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.v1 v1Var3 = this.o;
        if (v1Var3 != null) {
            v1Var3.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var2 = v1Var3.c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED && (v1Var = this.F) != null) {
            v1Var.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var3 = v1Var.c;
            if (t1Var3 != null) {
                t1Var3.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null) {
            bVar.d = java.lang.System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        if (aVar.b && aVar.e == 0) {
            aVar.e = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        boolean z;
        if (this.k != null) {
            if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
                if (this.H) {
                    O();
                }
                z = this.H;
            } else {
                z = this.p;
            }
            if (!z) {
                return true;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final android.content.Context w() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.z;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.b : null);
    }

    public final void O() {
        java.lang.ref.WeakReference weakReference;
        com.fyber.inneractive.sdk.util.IAlog.a("%sprovide reward called", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.I) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sreward was already provided", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sreward sent", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.J != null) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY;
            com.fyber.inneractive.sdk.cache.session.e eVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f3644a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
            com.fyber.inneractive.sdk.external.g gVar = this.J;
            weakReference = ((com.fyber.inneractive.sdk.flow.s0) gVar.f3663a).mAdSpot;
            com.fyber.inneractive.sdk.flow.i0 i0Var = (com.fyber.inneractive.sdk.flow.i0) com.fyber.inneractive.sdk.util.v.a(weakReference);
            com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f3663a.b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            H();
        }
        this.I = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z) {
        if (!I()) {
            if (z) {
                this.v.a((java.lang.String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.v;
                aVar.d = 0L;
                aVar.e = 0L;
                aVar.f = 0L;
                aVar.b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        P();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        if (this.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.t) {
            return j;
        }
        long j2 = 13;
        try {
            j2 = java.lang.Long.parseLong(com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("mraid_x_fallback_delay", java.lang.Long.toString(13L)));
        } catch (java.lang.Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.J = gVar;
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(android.widget.FrameLayout frameLayout) {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(frameLayout, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
        }
    }
}
