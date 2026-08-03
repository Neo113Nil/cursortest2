package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class i extends com.fyber.inneractive.sdk.player.ui.s {
    public com.fyber.inneractive.sdk.player.ui.p A;
    public final com.fyber.inneractive.sdk.flow.t0 B;
    public final com.fyber.inneractive.sdk.player.ui.o z;

    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(android.content.Context context, com.fyber.inneractive.sdk.player.ui.a aVar, com.fyber.inneractive.sdk.player.n nVar, com.fyber.inneractive.sdk.config.global.r rVar, java.lang.String str) {
        super(context, rVar, null);
        boolean z;
        com.fyber.inneractive.sdk.player.ui.p pVar;
        com.fyber.inneractive.sdk.flow.t0 t0Var;
        com.fyber.inneractive.sdk.flow.t0 t0Var2;
        this.B = null;
        this.B = nVar != null ? nVar.b : null;
        com.fyber.inneractive.sdk.flow.g gVar = (context == null || nVar == null || (t0Var2 = nVar.b) == null) ? null : new com.fyber.inneractive.sdk.flow.g(context, false, t0Var2.f3765a, t0Var2.b, rVar);
        if (nVar == null || (t0Var = nVar.b) == null) {
            z = false;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = t0Var.b;
            z = com.fyber.inneractive.sdk.player.f.a(rVar, eVar != null ? ((com.fyber.inneractive.sdk.response.g) eVar).E : com.fyber.inneractive.sdk.ignite.m.NONE);
        }
        com.fyber.inneractive.sdk.player.ui.o oVar = new com.fyber.inneractive.sdk.player.ui.o(context, gVar, aVar, rVar, z, str);
        this.z = oVar;
        if (nVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : flow manager is missing, unexpected and dynamic controls status are unknown", "IAVideoViewComposition");
            com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR, getAdRequest(), getAdResponse(), "Missing flow manager", "", (java.lang.Boolean) null);
        } else {
            if (nVar.p != null && (!android.text.TextUtils.isEmpty(r3.n))) {
                com.fyber.inneractive.sdk.player.ui.remote.g gVar2 = nVar.u;
                if ((gVar2 != null ? gVar2.f4174a : null) != null) {
                    com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVar2 != null ? gVar2.f4174a : null;
                    if (dVar.h) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%s : dynamic controls are already destroyed", "IAVideoViewComposition");
                    } else if (dVar.g) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%s : dynamic controls load process timed out", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar3 = nVar.u;
                        (gVar3 != null ? gVar3.f4174a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Template loading is timed out", true, null);
                    } else {
                        if (dVar.b.j) {
                            pVar = new com.fyber.inneractive.sdk.player.ui.p(getContext().getApplicationContext(), aVar, dVar, oVar);
                            this.A = pVar;
                            this.m = oVar.m;
                            this.r = oVar.r;
                            this.s = oVar.s;
                            this.n = oVar.n;
                            android.widget.TextView textView = oVar.v;
                            this.v = textView;
                            a(textView, 10);
                            a(this.n, 8);
                            a(this.m, 7);
                            a(this.r, -1);
                            if (b()) {
                                com.fyber.inneractive.sdk.player.ui.p pVar2 = this.A;
                                com.fyber.inneractive.sdk.ui.IAsmoothProgressBar iAsmoothProgressBar = oVar.P;
                                f(iAsmoothProgressBar != null && iAsmoothProgressBar.getVisibility() == 0);
                                android.widget.ImageView imageView = oVar.N;
                                d(imageView != null && imageView.getVisibility() == 0);
                                oVar.i();
                                attachViewToParent(pVar2, 0, new android.widget.RelativeLayout.LayoutParams(-1, -1));
                                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_IMPRESSION;
                                com.fyber.inneractive.sdk.external.InneractiveAdRequest adRequest = getAdRequest();
                                com.fyber.inneractive.sdk.response.e adResponse = getAdResponse();
                                com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = pVar2.M;
                                java.lang.String str2 = dVar2.f;
                                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(dVar2.i);
                                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, adRequest, adResponse);
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("loaded_from_cache", valueOf);
                                } catch (java.lang.Exception unused) {
                                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", valueOf);
                                }
                                try {
                                    jSONObject.put("templateURL", str2);
                                } catch (java.lang.Exception unused2) {
                                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                                }
                                wVar.f.put(jSONObject);
                                wVar.a((java.lang.String) null);
                            }
                            android.view.View view = this.z;
                            attachViewToParent(view, 0, view.getLayoutParams());
                        }
                        com.fyber.inneractive.sdk.util.IAlog.a("%s : dynamic controls are not ready, yet", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar4 = nVar.u;
                        (gVar4 != null ? gVar4.f4174a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, "Template isn't loaded yet", true, null);
                    }
                }
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s : dynamic controls are not available", "IAVideoViewComposition");
        }
        pVar = null;
        this.A = pVar;
        this.m = oVar.m;
        this.r = oVar.r;
        this.s = oVar.s;
        this.n = oVar.n;
        android.widget.TextView textView2 = oVar.v;
        this.v = textView2;
        a(textView2, 10);
        a(this.n, 8);
        a(this.m, 7);
        a(this.r, -1);
        if (b()) {
        }
        android.view.View view2 = this.z;
        attachViewToParent(view2, 0, view2.getLayoutParams());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, com.fyber.inneractive.sdk.player.ui.b bVar) {
        android.view.ViewGroup viewGroup;
        com.fyber.inneractive.sdk.player.ui.p pVar;
        this.z.a(dVar, bVar);
        if (!a(this.A) || (viewGroup = this.r) == null || viewGroup.getVisibility() != 0 || (pVar = this.A) == null) {
            return;
        }
        pVar.destroy();
        this.A = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean b() {
        com.fyber.inneractive.sdk.player.ui.p pVar = this.A;
        return pVar != null && pVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z) {
        this.z.c(z);
        if (a(this.A)) {
            this.A.c(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z) {
        this.z.d(z);
        if (a(this.A)) {
            this.A.d(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z) {
        if (a(this.A)) {
            this.A.e(z);
        } else {
            this.z.e(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z) {
        this.z.f(z);
        if (a(this.A)) {
            this.A.f(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z) {
        if (a(this.A)) {
            this.A.g(z);
        } else {
            this.z.g(z);
        }
    }

    public com.fyber.inneractive.sdk.external.InneractiveAdRequest getAdRequest() {
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.B;
        if (t0Var != null) {
            return t0Var.f3765a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.B;
        if (t0Var != null) {
            return t0Var.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View getEndCardView() {
        return this.z.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyView() {
        return a(this.A) ? this.A.getTrackingFriendlyView() : this.z.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.A) ? this.A.getTrackingFriendlyViewObstructionPurposeOther() : this.z.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.z.h();
        if (a(this.A)) {
            this.A.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        this.z.i();
        if (a(this.A)) {
            this.A.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.z.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.z.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.A) ? this.A.M.m : this.z.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.z.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.z.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.z.o();
        this.u = this.z.u;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(android.widget.TextView textView) {
        this.z.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(com.fyber.inneractive.sdk.player.ui.n nVar) {
        super.setListener(nVar);
        this.z.setListener(nVar);
        if (a(this.A)) {
            this.A.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z) {
        this.z.setMuteButtonState(z);
        if (a(this.A)) {
            this.A.setMuteButtonState(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(java.lang.String str) {
        this.z.setRemainingTime(str);
        if (a(this.A)) {
            this.A.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(java.lang.String str) {
        this.z.setSkipText(str);
        if (a(this.A)) {
            this.A.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(com.fyber.inneractive.sdk.config.s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.z.setUnitConfig(s0Var);
        if (a(this.A)) {
            this.A.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z) {
        this.z.b(z);
        if (a(this.A)) {
            this.A.b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        com.fyber.inneractive.sdk.player.ui.o oVar = this.z;
        oVar.p();
        oVar.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.A)) {
            this.z.a(z, mVar);
        } else {
            this.A.a(z, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, java.lang.String str) {
        this.z.a(z, str);
        if (a(this.A)) {
            this.A.a(z, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, int i, int i2) {
        this.o = i;
        this.p = i2;
        this.q = z;
        com.fyber.inneractive.sdk.player.ui.o oVar = this.z;
        oVar.o = i;
        oVar.p = i2;
        oVar.q = z;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        if (a(this.A)) {
            return this.A.M.n;
        }
        return this.z.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, com.fyber.inneractive.sdk.player.ui.b bVar2) {
        this.z.a(bVar, bVar2);
        com.fyber.inneractive.sdk.player.ui.p pVar = this.A;
        if (pVar != null) {
            pVar.destroy();
            this.A = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z) {
        if (a(this.A)) {
            this.A.a(z);
        } else {
            this.z.a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i, int i2) {
        this.z.a(i, i2);
        if (a(this.A)) {
            this.A.a(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(com.fyber.inneractive.sdk.util.h1 h1Var, int i, int i2) {
        this.z.a(h1Var, i, i2);
    }

    public static boolean a(com.fyber.inneractive.sdk.player.ui.p pVar) {
        return (pVar == null || pVar.M.h || !pVar.b()) ? false : true;
    }
}
