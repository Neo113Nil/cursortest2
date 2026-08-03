package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class g extends com.fyber.inneractive.sdk.player.controller.z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {
    public boolean A;
    public final boolean B;
    public final boolean z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, boolean z2, java.lang.String str) {
        super(fVar, sVar, s0Var, rVar, z, str);
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        this.z = false;
        this.A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
        if (fVar2 != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar2).v) != null) {
            bVar.e = this;
        }
        this.z = false;
        this.B = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null || qVar.e != com.fyber.inneractive.sdk.player.enums.b.Completed || !this.z) {
            return;
        }
        this.d.m();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() {
        if (!this.h) {
            f();
            return;
        }
        if (this.d.c()) {
            return;
        }
        this.d.a(false);
        java.lang.Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        E();
        D();
        this.k = false;
        this.h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z) {
        super.b(z);
        if (this.z) {
            this.d.m();
            this.d.g(false);
            this.f = 0;
        }
        C();
        this.d.e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        int i;
        int i2;
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && fVar.f4138a != null && !this.A) {
            try {
                android.media.AudioManager audioManager = (android.media.AudioManager) this.d.getContext().getSystemService("audio");
                i = audioManager.getRingerMode();
                try {
                    i2 = audioManager.getStreamVolume(2);
                } catch (java.lang.Throwable unused) {
                    i2 = 0;
                    if (this.z) {
                    }
                    if (i2 > 0) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%s setting default volume. unmuting player", com.fyber.inneractive.sdk.util.IAlog.a(this));
                        i(false);
                    }
                    this.d.setMuteButtonState(p());
                    this.A = true;
                    h(false);
                }
            } catch (java.lang.Throwable unused2) {
                i = 0;
            }
            if ((this.z && ((com.fyber.inneractive.sdk.config.r0) this.b).f.d.booleanValue()) || this.B || p()) {
                f(false);
            } else if (i2 > 0 && i == 2) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s setting default volume. unmuting player", com.fyber.inneractive.sdk.util.IAlog.a(this));
                i(false);
            }
            this.d.setMuteButtonState(p());
            this.A = true;
        }
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|(3:8|(1:10)(1:52)|(1:51))(1:53)|13|14|15|(6:17|18|(1:23)|(1:(1:(2:34|(1:39)(2:37|38)))(2:27|28))(1:(2:43|(1:45)(2:46|47)))|32|33)|49|18|(2:21|23)|(0)(0)|32|33))|54|6|(0)(0)|13|14|15|(0)|49|18|(0)|(0)(0)|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #0 {Exception -> 0x0076, blocks: (B:15:0x0061, B:17:0x0069), top: B:14:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o() {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        int i;
        com.fyber.inneractive.sdk.config.enums.Skip skip;
        boolean isCurrentUserAChild;
        com.fyber.inneractive.sdk.config.l a2;
        int i2;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new java.util.ArrayList(cVar2.c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
                if (cVar == null) {
                    java.lang.Integer a3 = cVar.a("skip_time_sec");
                    i = a3 != null ? a3.intValue() : 5;
                    if (i < 0 || i > 8) {
                        i = 5;
                    }
                } else {
                    i = -1;
                }
                com.fyber.inneractive.sdk.config.o oVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
                com.fyber.inneractive.sdk.config.s0 s0Var = this.b;
                skip = this.x;
                isCurrentUserAChild = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild();
                a2 = oVar.a("vast_configuration");
                a2.getClass();
                if (a2.f3618a.containsKey("skip_d")) {
                    i2 = java.lang.Integer.parseInt((java.lang.String) a2.f3618a.get("skip_d"));
                    int max = java.lang.Math.max(i2, -1);
                    if (skip == null && s0Var != null && (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f) != null) {
                        skip = t0Var.h;
                    }
                    if (isCurrentUserAChild) {
                        if (i > -1 && i <= 8) {
                            return i;
                        }
                        if (max <= -1 || max > 8) {
                            int intValue = skip.value().intValue();
                            if (intValue <= -1 || intValue > 8) {
                                return 5;
                            }
                            return skip.value().intValue();
                        }
                    } else if (max <= -1 || max > 5) {
                        return skip == com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT ? androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : skip.value().intValue();
                    }
                    return max;
                }
                i2 = -1;
                int max2 = java.lang.Math.max(i2, -1);
                if (skip == null) {
                    skip = t0Var.h;
                }
                if (isCurrentUserAChild) {
                }
                return max2;
            }
        }
        cVar = null;
        if (cVar == null) {
        }
        com.fyber.inneractive.sdk.config.o oVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
        com.fyber.inneractive.sdk.config.s0 s0Var2 = this.b;
        skip = this.x;
        isCurrentUserAChild = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild();
        a2 = oVar2.a("vast_configuration");
        a2.getClass();
        if (a2.f3618a.containsKey("skip_d")) {
        }
        i2 = -1;
        int max22 = java.lang.Math.max(i2, -1);
        if (skip == null) {
        }
        if (isCurrentUserAChild) {
        }
        return max22;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.g();
        }
        this.r = true;
        com.fyber.inneractive.sdk.util.IAlog.a("%s onBufferingTimeout reached. Skipping to end card", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.z) {
            this.d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z) {
        e(z);
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.config.enums.TapAction tapAction = ((com.fyber.inneractive.sdk.config.r0) this.b).f.i;
        if (tapAction == com.fyber.inneractive.sdk.config.enums.TapAction.CTR) {
            a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN && tapAction != com.fyber.inneractive.sdk.config.enums.TapAction.DO_NOTHING) {
            com.fyber.inneractive.sdk.util.IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", com.fyber.inneractive.sdk.util.IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.v) this.c.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.u.OPEN) || ((this.t != com.fyber.inneractive.sdk.ignite.m.NONE && com.fyber.inneractive.sdk.config.IAConfigManager.N.D.n()) || ((sVar = this.d) != null && sVar.b()))) {
            a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(com.fyber.inneractive.sdk.util.g1 g1Var) {
        a(11, g1Var);
    }
}
