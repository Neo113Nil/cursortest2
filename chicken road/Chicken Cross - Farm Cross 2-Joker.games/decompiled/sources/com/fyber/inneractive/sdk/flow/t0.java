package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class t0 extends w {
    public com.fyber.inneractive.sdk.player.t i;
    public boolean j;

    public t0(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(x0Var, rVar);
        this.j = false;
        this.b = gVar;
        this.f5418a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.y0 y0Var;
        com.fyber.inneractive.sdk.config.x0 x0Var = this.d;
        if (x0Var == null || (y0Var = ((com.fyber.inneractive.sdk.config.w0) x0Var).f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.d);
            return false;
        }
        UnitDisplayType unitDisplayType = y0Var.j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return this.i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            v0Var.y = true;
            v0Var.D = false;
            v0Var.b.g.remove(v0Var);
            v0Var.i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f5813a;
            if (bVar != null && (nVar = bVar.b) != null) {
                nVar.i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b a2 = nVar.u.b.a();
                if (a2 != null) {
                    a2.destroy();
                }
                if (nVar.f5792a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", "f");
                    nVar.f5792a.a();
                    nVar.f5792a = null;
                }
                nVar.l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.u;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.b;
                    Iterator it = mVar.f5350a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f5350a.clear();
                    mVar.b.clear();
                    mVar.c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.v;
                if (gVar != null) {
                    gVar.f5828a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.w;
                if (bVar2 != null) {
                    bVar2.f5385a.a();
                    bVar2.a();
                    bVar2.e = null;
                    bVar2.h.clear();
                }
            }
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }
}
