package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* loaded from: classes4.dex */
public final class q0 extends w {
    public IAmraidWebViewController i;

    public q0(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(x0Var, rVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.x0 x0Var = this.d;
        if (x0Var == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.w0 w0Var = (com.fyber.inneractive.sdk.config.w0) x0Var;
        if (w0Var.c == null || w0Var.c.b == null) {
            return false;
        }
        return w0Var.c.b.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        AdSession adSession;
        if (this.g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            v0Var.y = true;
            v0Var.D = false;
            v0Var.b.g.remove(v0Var);
            v0Var.i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f5445a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f5445a = null;
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
