package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class u implements com.fyber.inneractive.sdk.web.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.v f4248a;

    public u(com.fyber.inneractive.sdk.renderers.v vVar) {
        this.f4248a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClicked", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
        android.content.Context w = this.f4248a.w();
        com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
        com.fyber.inneractive.sdk.interfaces.e eVar = vVar2.k;
        if (eVar != null) {
            w = vVar2.c(eVar.getLayout());
        }
        android.content.Context context = w;
        com.fyber.inneractive.sdk.renderers.v vVar3 = this.f4248a;
        if (!vVar3.f) {
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("No context or no native click detected"));
        }
        com.fyber.inneractive.sdk.flow.x xVar = vVar3.b;
        com.fyber.inneractive.sdk.response.e eVar2 = xVar == null ? null : ((com.fyber.inneractive.sdk.flow.q0) xVar).b;
        if (eVar2 != null && (str2 = eVar2.l) != null && str2.trim().length() > 0) {
            com.fyber.inneractive.sdk.util.IAlog.d("AD_CLICKED", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.network.z0.b(str2);
        }
        com.fyber.inneractive.sdk.renderers.v vVar4 = this.f4248a;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar4.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
        com.fyber.inneractive.sdk.cache.session.e eVar3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f3644a;
        if (eVar3 != null) {
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar3, aVar, cVar));
        }
        return this.f4248a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
        if (z) {
            com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
            if (!vVar.s) {
                vVar.s = true;
                com.fyber.inneractive.sdk.interfaces.e eVar = vVar.k;
                if (eVar != null) {
                    vVar.d(eVar.isCloseButtonDisplay());
                }
            }
            com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
            if (!vVar2.q) {
                vVar2.q = true;
                com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.MILLISECONDS, vVar2.r);
                vVar2.m = v1Var;
                v1Var.e = new com.fyber.inneractive.sdk.flow.n0(vVar2);
                v1Var.d = false;
                v1Var.c.sendEmptyMessage(1932593528);
            }
            com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f4248a.k;
            if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
                return;
            }
            com.fyber.inneractive.sdk.renderers.v vVar3 = this.f4248a;
            vVar3.p = false;
            com.fyber.inneractive.sdk.interfaces.e eVar3 = vVar3.k;
            if (eVar3 != null) {
                eVar3.disableCloseButton();
            }
            com.fyber.inneractive.sdk.util.a aVar = vVar3.v;
            aVar.d = 0L;
            aVar.e = 0L;
            aVar.f = 0L;
            aVar.b = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onResize", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onExpand", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
        com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
        vVar2.D = true;
        vVar2.P();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.w();
        vVar.c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClose", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
        com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
        if (vVar2.D) {
            vVar2.D = false;
            vVar2.P();
            return;
        }
        if (vVar2.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
            vVar2.O();
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f4248a.k;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.f4248a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f4248a.a(new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError());
        this.f4248a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        vVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f4248a.k;
        if (eVar == null || eVar.getLayout() == null) {
            return;
        }
        com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
        if (!vVar2.E) {
            com.fyber.inneractive.sdk.network.b0.a(vVar2.k.getLayout().getContext(), str, str2, this.f4248a.b);
            com.fyber.inneractive.sdk.renderers.v vVar3 = this.f4248a;
            vVar3.E = true;
            vVar3.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sreporting auto redirect", com.fyber.inneractive.sdk.util.IAlog.a(vVar3));
            return;
        }
        vVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sredirect already reported for this ad", com.fyber.inneractive.sdk.util.IAlog.a(vVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z) {
        java.lang.String str;
        if (z) {
            com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
            if (!vVar.y) {
                vVar.y = true;
                if (vVar.b != null) {
                    com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = vVar.z;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    com.fyber.inneractive.sdk.response.e eVar = ((com.fyber.inneractive.sdk.flow.q0) vVar.b).b;
                    if (eVar != null && (str = eVar.k) != null && str.trim().length() > 0) {
                        com.fyber.inneractive.sdk.util.IAlog.e("%sfiring impression!", com.fyber.inneractive.sdk.util.IAlog.a(vVar));
                        com.fyber.inneractive.sdk.util.IAlog.d("AD_IMPRESSION", new java.lang.Object[0]);
                        com.fyber.inneractive.sdk.network.z0.b(str);
                    }
                    com.fyber.inneractive.sdk.web.m mVar = vVar.z.b;
                    if (mVar != null) {
                        mVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar.G == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f3644a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                    vVar.E();
                    vVar.J();
                }
            }
        }
        com.fyber.inneractive.sdk.renderers.v vVar2 = this.f4248a;
        vVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onVisibilityChanged: %s", com.fyber.inneractive.sdk.util.IAlog.a(vVar2), java.lang.Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f4248a.k;
        if (eVar != null) {
            eVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(java.lang.String str) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f4248a.k;
        if (eVar == null || eVar.getLayout() == null) {
            return false;
        }
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        boolean startRichMediaIntent = com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(vVar.c(vVar.k.getLayout()), str);
        if (startRichMediaIntent) {
            this.f4248a.c(false);
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(com.fyber.inneractive.sdk.ui.IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        this.f4248a.e(false);
        com.fyber.inneractive.sdk.renderers.v vVar = this.f4248a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = vVar.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(vVar.f3675a, mraidVideoFailedToDisplayError);
        }
    }
}
