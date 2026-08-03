package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class c0 extends com.fyber.inneractive.sdk.player.controller.s {
    public final java.util.concurrent.atomic.AtomicBoolean F;

    public c0(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, com.fyber.inneractive.sdk.config.r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(fVar, sVar, r0Var, rVar, false, null);
        this.F = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A = 0.5f;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean B() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void C() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void H() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        com.fyber.inneractive.sdk.player.controller.q qVar = fVar != null ? fVar.f4138a : null;
        if (this.B < this.A || qVar == null || qVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed || qVar.j == null || (sVar = this.d) == null || !sVar.hasWindowFocus()) {
            return;
        }
        c(0);
        i(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void K() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.player.controller.z
    public final void b(com.fyber.inneractive.sdk.util.g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.web.b0 k() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.flow.storepromo.b n() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void s() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void F() {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%s handle buffering timeout: video paused on last shown frame", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
        if (fVar2 != null && (qVar = fVar2.f4138a) != null) {
            qVar.k();
            this.f3899a.f4138a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
        if (fVar3 == null || (fVar = fVar3.e) == null || fVar.c == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s pause", "OMVideo");
        try {
            fVar.c.pause();
        } catch (java.lang.Throwable th) {
            fVar.a(th);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f) {
        boolean z = f >= 0.01f && this.F.compareAndSet(false, true);
        e(z);
        super.a(f);
        if (z) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Float.valueOf(f * 100.0f));
            ((com.fyber.inneractive.sdk.renderers.q) ((com.fyber.inneractive.sdk.player.controller.a0) this.g)).f4246a.I();
        }
    }
}
