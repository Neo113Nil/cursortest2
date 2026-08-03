package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class s extends com.fyber.inneractive.sdk.flow.p0 implements com.fyber.inneractive.sdk.player.controller.g0 {
    public boolean x = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (!this.x) {
            k();
        }
        this.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        a(new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        this.x = true;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sunit controller is null!", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        com.fyber.inneractive.sdk.util.IAlog.a("%snShownCloseButton", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var, boolean z) {
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        com.fyber.inneractive.sdk.config.l0 l0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null && (s0Var = ((com.fyber.inneractive.sdk.flow.t0) xVar).d) != null && (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).c) != null) {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = l0Var.b;
            com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
            com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f3644a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
        }
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view, java.lang.String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        c(view);
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(android.view.View view) {
        c(view);
        c(false);
    }
}
