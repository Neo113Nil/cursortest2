package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public abstract class w extends x {
    public com.fyber.inneractive.sdk.web.v0 g;
    public final v h;

    public w(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(x0Var, rVar);
        this.h = new v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.web.v0 a() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
        return v0Var != null && v0Var.l;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void e() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.R.F;
        if (!hVar.f || (eVar = this.b) == null || !eVar.a() || !hVar.n() || c() || (eVar2 = this.b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.ignite.m mVar = eVar2.E;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (mVar != mVar2) {
            IAlog.a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
            com.fyber.inneractive.sdk.response.e eVar3 = this.b;
            if (mVar2 == null) {
                eVar3.getClass();
            }
            eVar3.E = mVar2;
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            if (v0Var != null) {
                com.fyber.inneractive.sdk.web.n0 n0Var = v0Var.p;
                if (n0Var != null) {
                    com.fyber.inneractive.sdk.util.r.b.removeCallbacks(n0Var);
                    v0Var.p = null;
                }
                if (!v0Var.y) {
                    v0Var.f6019a.stopLoading();
                }
                this.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.g.k, com.fyber.inneractive.sdk.ignite.j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.a(), this.b.E);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void a(String str) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        com.fyber.inneractive.sdk.response.e eVar2 = this.b;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.ignite.m mVar3 = eVar2.E;
            mVar3.getClass();
            mVar = com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
            if (mVar3 != mVar) {
                com.fyber.inneractive.sdk.ignite.m mVar4 = this.b.E;
                mVar4.getClass();
                if (mVar4 != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || isVideoAd()) {
                    mVar = this.b.E;
                } else {
                    this.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                }
            }
        } else {
            mVar = mVar2;
        }
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.R.F;
        if (!hVar.f || (eVar = this.b) == null || !eVar.a() || !hVar.n()) {
            com.fyber.inneractive.sdk.response.e eVar3 = this.b;
            if (eVar3 != null) {
                eVar3.E = mVar2;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar4 = this.b;
        String str2 = eVar4 != null ? eVar4.x : null;
        com.fyber.inneractive.sdk.web.w0 w0Var = new com.fyber.inneractive.sdk.web.w0();
        w0Var.f6021a = str2;
        w0Var.b = mVar;
        w0Var.c = str;
        w0Var.d = this.c;
        w0Var.e = eVar4 != null ? eVar4.D : null;
        w0Var.f = eVar4 != null ? eVar4.F : null;
        w0Var.g = this.h;
        com.fyber.inneractive.sdk.web.v0 v0Var = new com.fyber.inneractive.sdk.web.v0(w0Var);
        this.g = v0Var;
        com.fyber.inneractive.sdk.config.global.features.r rVar = (com.fyber.inneractive.sdk.config.global.features.r) this.c.a(com.fyber.inneractive.sdk.config.global.features.r.class);
        if (rVar == null || str2 == null) {
            return;
        }
        String a2 = rVar.a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
        v0Var.e(a2 == null ? "" : a2.replace("[BUNDLE_ID]", str2));
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean a(boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        if (eVar != null) {
            mVar = eVar.E;
        } else {
            mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
        }
        return !z && mVar != null && mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP && (gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA || gVar == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD);
    }
}
