package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class q0 extends com.fyber.inneractive.sdk.flow.w {
    public com.fyber.inneractive.sdk.ui.IAmraidWebViewController i;

    public q0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.d;
        if (s0Var == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
        if (r0Var.c == null || r0Var.c.b == null) {
            return false;
        }
        return r0Var.c.b.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.iab.omid.library.fyber.adsession.AdSession adSession;
        if (this.g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            v0Var.y = true;
            v0Var.D = false;
            v0Var.b.h.remove(v0Var);
            v0Var.i = null;
            com.fyber.inneractive.sdk.util.IAlog.a("destroy internalStoreWebpageController", new java.lang.Object[0]);
            this.g = null;
        }
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f3791a) != null) {
                try {
                    adSession.finish();
                } catch (java.lang.Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f3791a = null;
                eVar.b = null;
            }
            this.i.e();
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }
}
