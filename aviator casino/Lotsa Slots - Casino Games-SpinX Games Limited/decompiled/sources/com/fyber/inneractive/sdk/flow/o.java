package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f3728a;
    public com.fyber.inneractive.sdk.flow.n b;
    public com.fyber.inneractive.sdk.config.global.r c;
    public com.fyber.inneractive.sdk.network.m d;
    public final java.lang.String e;
    public boolean f = false;

    public o(java.lang.String str) {
        this.e = str;
    }

    public void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
            java.lang.Thread.dumpStack();
        }
        com.fyber.inneractive.sdk.util.IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.b != null) {
            if (eVar != null && eVar.i != null) {
                inneractiveInfrastructureError.setCause(new java.lang.Exception(eVar.i + ": " + eVar.j));
            }
            ((com.fyber.inneractive.sdk.flow.e0) this.b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public void b(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f3728a;
        if (cVar == null) {
            return null;
        }
        com.fyber.inneractive.sdk.flow.k kVar = (com.fyber.inneractive.sdk.flow.k) cVar;
        return kVar.c != null ? kVar.c.b : kVar.b;
    }

    public java.lang.String d() {
        return com.fyber.inneractive.sdk.util.IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.flow.s0 s0Var;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.util.IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f3728a;
        if (cVar != null) {
            com.fyber.inneractive.sdk.flow.n nVar = this.b;
            if (nVar == null || (xVar = ((com.fyber.inneractive.sdk.flow.k) cVar).c) == null) {
                com.fyber.inneractive.sdk.util.IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            } else {
                com.fyber.inneractive.sdk.flow.e0 e0Var = (com.fyber.inneractive.sdk.flow.e0) nVar;
                if (e0Var.f3681a.n.get()) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: onAdLoaded: spot is already destroyed", com.fyber.inneractive.sdk.flow.h0.a(e0Var.f3681a));
                    com.fyber.inneractive.sdk.flow.h0 h0Var = e0Var.f3681a;
                    com.fyber.inneractive.sdk.flow.p pVar = h0Var.l;
                    h0Var.a(xVar);
                } else {
                    if (xVar == null) {
                        com.fyber.inneractive.sdk.util.IAlog.b("%sgot onAdLoaded but adContent is null", com.fyber.inneractive.sdk.flow.h0.a(e0Var.f3681a));
                    } else {
                        com.fyber.inneractive.sdk.flow.h0 h0Var2 = e0Var.f3681a;
                        if (!h0Var2.j && (s0Var = h0Var2.f) != null && s0Var.supportsRefresh()) {
                            if (e0Var.f3681a.f.canRefreshAd()) {
                                com.fyber.inneractive.sdk.flow.h0 h0Var3 = e0Var.f3681a;
                                h0Var3.e = xVar;
                                xVar.f3765a = inneractiveAdRequest;
                                com.fyber.inneractive.sdk.flow.g0 g0Var = h0Var3.i;
                                if (g0Var != null) {
                                    g0Var.onAdRefreshed(h0Var3);
                                } else {
                                    com.fyber.inneractive.sdk.flow.s0 s0Var2 = h0Var3.f;
                                    if (s0Var2 instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) {
                                        ((com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                    }
                                }
                            } else {
                                com.fyber.inneractive.sdk.util.IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", com.fyber.inneractive.sdk.flow.h0.a(e0Var.f3681a));
                                com.fyber.inneractive.sdk.flow.h0 h0Var4 = e0Var.f3681a;
                                h0Var4.i.onAdRefreshFailed(h0Var4, com.fyber.inneractive.sdk.external.InneractiveErrorCode.CANCELLED);
                            }
                        } else {
                            com.fyber.inneractive.sdk.flow.h0 h0Var5 = e0Var.f3681a;
                            h0Var5.e = xVar;
                            xVar.f3765a = inneractiveAdRequest;
                            java.util.Iterator it = h0Var5.g.iterator();
                            while (it.hasNext()) {
                                com.fyber.inneractive.sdk.flow.s0 s0Var3 = (com.fyber.inneractive.sdk.flow.s0) it.next();
                                if (s0Var3.supports(h0Var5)) {
                                    h0Var5.f = s0Var3;
                                    com.fyber.inneractive.sdk.flow.h0 h0Var6 = e0Var.f3681a;
                                    com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener = h0Var6.b;
                                    if (requestListener != null) {
                                        if (requestListener instanceof com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener) {
                                            com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                            com.fyber.inneractive.sdk.flow.s0 s0Var4 = h0Var6.f;
                                            if ((xVar instanceof com.fyber.inneractive.sdk.flow.w0) && (s0Var4 instanceof com.fyber.inneractive.sdk.external.NativeAdUnitController)) {
                                                com.fyber.inneractive.sdk.flow.w0 w0Var = (com.fyber.inneractive.sdk.flow.w0) xVar;
                                                w0Var.v = (com.fyber.inneractive.sdk.external.NativeAdUnitController) s0Var4;
                                                nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                            } else {
                                                com.fyber.inneractive.sdk.util.IAlog.b("%s: Invalid native response: controller or/and content mismatch", com.fyber.inneractive.sdk.util.IAlog.a(h0Var6));
                                                nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                            }
                                        } else {
                                            requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                        }
                                    }
                                    e0Var.f3681a.j = false;
                                }
                            }
                            e0Var.f3681a.e.destroy();
                            com.fyber.inneractive.sdk.util.IAlog.a("%sCannot find appropriate unit controller for unit: %s", com.fyber.inneractive.sdk.flow.h0.a(e0Var.f3681a), e0Var.f3681a.e.d);
                            com.fyber.inneractive.sdk.flow.m mVar = e0Var.f3681a.h;
                            com.fyber.inneractive.sdk.response.e c = mVar != null ? mVar.c() : null;
                            e0Var.a(inneractiveAdRequest, c, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT, com.fyber.inneractive.sdk.flow.i.COULD_NOT_SELECT_UNIT_CONTROLLER, new java.lang.Exception("Cannot find appropriate unit controller for unit: " + e0Var.f3681a.e.d)));
                            com.fyber.inneractive.sdk.flow.h0 h0Var7 = e0Var.f3681a;
                            h0Var7.e = null;
                            h0Var7.j = false;
                        }
                    }
                    java.lang.String str = e0Var.f3681a.f3703a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    com.fyber.inneractive.sdk.flow.h0 h0Var8 = e0Var.f3681a;
                    com.fyber.inneractive.sdk.flow.x xVar2 = h0Var8.e;
                    if (xVar2 != null && (eVar = xVar2.b) != null && eVar.n != null) {
                        com.fyber.inneractive.sdk.flow.x xVar3 = h0Var8.e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.c, h0Var8.f3703a, eVar2.n, xVar3.c.b()).a();
                    }
                }
            }
            this.f3728a = null;
        }
        b(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.util.IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f3728a;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((com.fyber.inneractive.sdk.flow.k) cVar).c) == null) ? null : xVar.f3765a;
        com.fyber.inneractive.sdk.response.e c = c();
        com.fyber.inneractive.sdk.util.IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.flow.n nVar = this.b;
        if (nVar != null) {
            ((com.fyber.inneractive.sdk.flow.e0) nVar).a(inneractiveAdRequest, c, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != com.fyber.inneractive.sdk.flow.i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, c);
        }
    }

    public void a(boolean z) {
        this.f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f3728a;
        if (cVar == null || !z) {
            return;
        }
        cVar.cancel();
        com.fyber.inneractive.sdk.flow.k kVar = (com.fyber.inneractive.sdk.flow.k) this.f3728a;
        if (kVar.c != null) {
            kVar.c.destroy();
        }
        this.f3728a = null;
    }
}
