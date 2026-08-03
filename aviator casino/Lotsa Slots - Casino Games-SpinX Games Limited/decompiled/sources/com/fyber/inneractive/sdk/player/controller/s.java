package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public class s extends com.fyber.inneractive.sdk.player.controller.z {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public com.fyber.inneractive.sdk.player.controller.r z;

    public s(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, com.fyber.inneractive.sdk.config.r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, java.lang.String str) {
        super(fVar, sVar, r0Var, rVar, z, str);
        this.B = 0.0f;
        this.C = false;
        this.D = false;
        this.E = false;
        this.A = ((com.fyber.inneractive.sdk.config.r0) this.b).g.b.intValue() / 100.0f;
        J();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public boolean A() {
        return false;
    }

    public final void G() {
        android.content.Context context;
        if (this.g == null || this.E) {
            return;
        }
        I();
        super.g();
        com.fyber.inneractive.sdk.renderers.q qVar = (com.fyber.inneractive.sdk.renderers.q) ((com.fyber.inneractive.sdk.player.controller.a0) this.g);
        com.fyber.inneractive.sdk.renderers.r rVar = qVar.f4246a;
        com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = rVar.c;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) eventsListener).onAdExpanded(rVar.f3675a);
        }
        com.fyber.inneractive.sdk.renderers.r rVar2 = qVar.f4246a;
        android.view.ViewGroup viewGroup = rVar2.p;
        if (viewGroup != null && rVar2.f3675a != null && (context = viewGroup.getContext()) != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = qVar.f4246a.f3675a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.class);
            intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            try {
                com.fyber.inneractive.sdk.util.IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", com.fyber.inneractive.sdk.util.IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                context.startActivity(intent);
            } catch (android.content.ActivityNotFoundException unused) {
                com.fyber.inneractive.sdk.util.IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", com.fyber.inneractive.sdk.util.IAlog.a(context));
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sopening fullscreen", com.fyber.inneractive.sdk.util.IAlog.a(this));
        this.E = true;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.x.EVENT_EXPAND);
        }
    }

    public void H() {
        com.fyber.inneractive.sdk.player.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        if (this.B < this.A || (fVar = this.f3899a) == null || (qVar = fVar.f4138a) == null || qVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed || (sVar = this.d) == null || sVar.c() || this.f3899a.f4138a.j == null) {
            return;
        }
        if (((com.fyber.inneractive.sdk.config.r0) this.b).f.f3638a.booleanValue() || this.C) {
            c(com.fyber.inneractive.sdk.config.IAConfigManager.N.i.f3617a);
        }
    }

    public final void I() {
        if (this.z != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCancelling play runnable", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.d.removeCallbacks(this.z);
            this.z = null;
        }
    }

    public final void J() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null || qVar.n) {
            return;
        }
        if (((com.fyber.inneractive.sdk.config.r0) this.b).f.d.booleanValue()) {
            this.f3899a.f4138a.b(false);
        } else {
            if (p()) {
                return;
            }
            this.f3899a.f4138a.d(false);
        }
    }

    public void K() {
        if (((com.fyber.inneractive.sdk.config.r0) this.b).f.i != com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN) {
            this.d.n();
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z) {
        if (z) {
            a(this.B);
        }
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        return !(this instanceof com.fyber.inneractive.sdk.player.controller.c0);
    }

    public final void c(int i) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null || qVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.z != null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%splayVideo %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.d);
        if (i == 0) {
            h(false);
            return;
        }
        com.fyber.inneractive.sdk.player.controller.r rVar = new com.fyber.inneractive.sdk.player.controller.r(this);
        this.z = rVar;
        this.d.postDelayed(rVar, i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        I();
        this.g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && fVar.f4138a != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sconnectToTextureView playing state = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.f3899a.f4138a.e);
            if (this.f3899a.f4138a.h()) {
                this.d.e(true ^ this.f3899a.g);
                J();
            }
        }
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g() {
        I();
        super.g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || fVar.f4138a == null) {
            return;
        }
        J();
        super.h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    public final void j(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        this.D = z;
        if (!z || (fVar = this.f3899a) == null || (qVar = fVar.f4138a) == null || qVar.j != null || !this.d.e || qVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        f();
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void u() {
        super.u();
        I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || fVar.f4138a == null) {
            return;
        }
        f();
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void w() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        K();
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void z() {
        I();
        super.z();
    }

    public void F() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s handle buffering timeout: Skipping to end card", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && (qVar = fVar.f4138a) != null && qVar.e != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            K();
        }
        super.b(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onBufferingTimeout reached", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.d.e) {
            this.r = true;
            F();
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void a(float f) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        this.B = f;
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a >= 3) {
            com.fyber.inneractive.sdk.util.IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Float.valueOf(f), java.lang.Float.valueOf(this.A), java.lang.Float.valueOf(1.0f - this.A));
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null) {
            return;
        }
        if (qVar.e != com.fyber.inneractive.sdk.player.enums.b.Playing) {
            H();
            return;
        }
        if (f <= this.A) {
            com.fyber.inneractive.sdk.util.IAlog.e("%sonVisibilityChanged pausing player", com.fyber.inneractive.sdk.util.IAlog.a(this));
            if (this.f3899a.f4138a.j != null) {
                this.C = false;
                I();
                super.z();
                f(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public void b(com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.config.enums.TapAction tapAction = ((com.fyber.inneractive.sdk.config.r0) this.b).f.i;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || fVar.f4138a == null || this.B >= this.A) {
            if (tapAction == com.fyber.inneractive.sdk.config.enums.TapAction.CTR) {
                a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.CTA, g1Var);
                return;
            }
            if (tapAction == com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN) {
                G();
                return;
            }
            if (tapAction != com.fyber.inneractive.sdk.config.enums.TapAction.DO_NOTHING) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", com.fyber.inneractive.sdk.util.IAlog.a(this), tapAction);
                return;
            }
            if (fVar == null || (qVar = fVar.f4138a) == null) {
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = qVar.e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                qVar.j();
            } else {
                qVar.a(1, true);
            }
        }
    }
}
