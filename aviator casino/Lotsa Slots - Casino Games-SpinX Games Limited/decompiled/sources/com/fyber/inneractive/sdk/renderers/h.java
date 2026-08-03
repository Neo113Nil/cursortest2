package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.web.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.n f4239a;

    public h(com.fyber.inneractive.sdk.renderers.n nVar) {
        this.f4239a = nVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        java.lang.String str2;
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClicked", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
        android.view.ViewGroup viewGroup = this.f4239a.p;
        android.content.Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f4302a : this.f4239a.p.getContext();
        if (context != null) {
            com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
            if (nVar2.f) {
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((com.fyber.inneractive.sdk.flow.q0) xVar).b : null;
                if (eVar != null && (str2 = eVar.l) != null && str2.trim().length() > 0) {
                    com.fyber.inneractive.sdk.util.IAlog.d("AD_CLICKED", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.network.z0.b(str2);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f4239a.b;
                if (xVar2 != null && (s0Var = ((com.fyber.inneractive.sdk.flow.q0) xVar2).d) != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    if (r0Var.c != null) {
                        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                        com.fyber.inneractive.sdk.cache.session.enums.c cVar = r0Var.c.b == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                        com.fyber.inneractive.sdk.cache.session.e eVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f3644a;
                        if (eVar2 != null) {
                            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                        }
                    }
                }
                return this.f4239a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        this.f4239a.d(true);
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onResize", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
        com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) eventsListener).onAdResized(nVar2.f3675a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onExpand", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
        com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) eventsListener).onAdExpanded(nVar2.f3675a);
        }
        com.fyber.inneractive.sdk.renderers.n nVar3 = this.f4239a;
        nVar3.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onExpand", com.fyber.inneractive.sdk.util.IAlog.a(nVar3));
        this.f4239a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.w();
        nVar.c(false);
        this.f4239a.F();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClose", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
        com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(nVar2.f3675a);
        }
        this.f4239a.N();
        com.fyber.inneractive.sdk.renderers.n nVar3 = this.f4239a;
        nVar3.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClose", com.fyber.inneractive.sdk.util.IAlog.a(nVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.f4239a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f4239a.a(new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
        android.view.ViewGroup viewGroup = this.f4239a.p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
        if (!nVar2.v) {
            com.fyber.inneractive.sdk.network.b0.a(nVar2.p.getContext(), str, str2, this.f4239a.b);
            com.fyber.inneractive.sdk.renderers.n nVar3 = this.f4239a;
            nVar3.v = true;
            nVar3.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sreporting auto redirect", com.fyber.inneractive.sdk.util.IAlog.a(nVar3));
            return;
        }
        nVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sredirect already reported for this ad", com.fyber.inneractive.sdk.util.IAlog.a(nVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z) {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        com.fyber.inneractive.sdk.config.l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        nVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onVisibilityChanged: %s", com.fyber.inneractive.sdk.util.IAlog.a(nVar), java.lang.Boolean.valueOf(z));
        if (z) {
            com.fyber.inneractive.sdk.renderers.n nVar2 = this.f4239a;
            if (!nVar2.o) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sonShownForTheFirstTime called", com.fyber.inneractive.sdk.util.IAlog.a(nVar2));
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((com.fyber.inneractive.sdk.flow.q0) xVar).b : null;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = nVar2.m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    java.lang.String str = eVar.k;
                    if (str != null && str.trim().length() > 0) {
                        com.fyber.inneractive.sdk.util.IAlog.e("%sfiring impression!", com.fyber.inneractive.sdk.util.IAlog.a(nVar2));
                        com.fyber.inneractive.sdk.util.IAlog.d("AD_IMPRESSION", new java.lang.Object[0]);
                        com.fyber.inneractive.sdk.network.z0.b(str);
                    }
                    nVar2.E();
                }
                long K = nVar2.K();
                nVar2.k = K;
                if (K != 0) {
                    nVar2.a(true, K);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = nVar2.b;
                if (xVar2 != null && (s0Var = ((com.fyber.inneractive.sdk.flow.q0) xVar2).d) != null && (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (l0Var.b == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f3644a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                }
                this.f4239a.o = true;
                return;
            }
            com.fyber.inneractive.sdk.renderers.d dVar = nVar2.y;
            if (dVar != null && !dVar.h && !dVar.g && dVar.f != 0) {
                dVar.f = 0L;
                dVar.g = true;
                dVar.a();
            }
            this.f4239a.N();
            return;
        }
        com.fyber.inneractive.sdk.renderers.d dVar2 = this.f4239a.y;
        if (dVar2 != null && dVar2.g) {
            dVar2.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar2.j);
        }
        this.f4239a.d(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(java.lang.String str) {
        boolean startRichMediaIntent = com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(com.fyber.inneractive.sdk.util.o.a(this.f4239a.x()), str);
        if (startRichMediaIntent) {
            com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
            if (nVar.c != null) {
                nVar.c(false);
            }
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(com.fyber.inneractive.sdk.ui.IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        com.fyber.inneractive.sdk.renderers.n nVar = this.f4239a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = nVar.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(nVar.f3675a, mraidVideoFailedToDisplayError);
        }
    }
}
