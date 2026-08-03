package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class q implements com.fyber.inneractive.sdk.player.controller.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.r f4246a;

    public q(com.fyber.inneractive.sdk.renderers.r rVar) {
        this.f4246a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        this.f4246a.a(new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        this.f4246a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.ignite.m o() {
        return com.fyber.inneractive.sdk.ignite.m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        com.fyber.inneractive.sdk.external.VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        com.fyber.inneractive.sdk.external.VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onProgress(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        this.f4246a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        rVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", com.fyber.inneractive.sdk.util.IAlog.a(rVar));
        android.view.ViewGroup viewGroup = this.f4246a.p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        com.fyber.inneractive.sdk.renderers.r rVar2 = this.f4246a;
        if (!rVar2.u) {
            com.fyber.inneractive.sdk.network.b0.a(rVar2.p.getContext(), str, str2, this.f4246a.b);
            com.fyber.inneractive.sdk.renderers.r rVar3 = this.f4246a;
            rVar3.u = true;
            rVar3.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%s reporting auto redirect", com.fyber.inneractive.sdk.util.IAlog.a(rVar3));
            return;
        }
        rVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s redirect already reported for this ad", com.fyber.inneractive.sdk.util.IAlog.a(rVar2));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view, java.lang.String str) {
        if (view != null) {
            com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f4246a.c(view), str);
            this.f4246a.c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        android.content.Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        if (rVar.m.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f4302a;
        } else {
            context = this.f4246a.m.getContext();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f4246a.b;
        return rVar.a(context, (xVar == null || (eVar = ((com.fyber.inneractive.sdk.flow.t0) xVar).b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).L) == null) ? null : bVar.b, g1Var, gVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var, boolean z) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.renderers.f0 f0Var;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (android.text.TextUtils.isEmpty(str) && (xVar = this.f4246a.b) != null) {
            com.fyber.inneractive.sdk.response.e eVar = ((com.fyber.inneractive.sdk.flow.t0) xVar).b;
            str = (eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).L) == null) ? null : bVar.b;
        }
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        com.fyber.inneractive.sdk.ui.controller.b bVar2 = (com.fyber.inneractive.sdk.player.controller.b) rVar.k;
        if (bVar2 == null && (f0Var = rVar.q) != null) {
            bVar2 = f0Var.f4237a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar2 != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar2).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.b.a() : null;
        if (a2 instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            java.lang.String str3 = ((com.fyber.inneractive.sdk.flow.endcard.c) a2).g.g;
            if (!android.text.TextUtils.isEmpty(str3)) {
                str2 = str3;
                com.fyber.inneractive.sdk.renderers.r rVar2 = this.f4246a;
                return rVar2.a(rVar2.c((android.view.View) rVar2.p), str2, g1Var, !z ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
            }
        }
        str2 = str;
        com.fyber.inneractive.sdk.renderers.r rVar22 = this.f4246a;
        return rVar22.a(rVar22.c((android.view.View) rVar22.p), str2, g1Var, !z ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        com.fyber.inneractive.sdk.external.VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view) {
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4246a;
        if (rVar.c != null) {
            rVar.c(view);
            rVar.c(false);
        }
    }
}
