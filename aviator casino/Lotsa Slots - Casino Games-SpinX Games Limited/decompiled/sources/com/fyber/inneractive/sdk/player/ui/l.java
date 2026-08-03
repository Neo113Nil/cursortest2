package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public abstract class l extends com.fyber.inneractive.sdk.player.ui.s {
    public static final com.fyber.inneractive.sdk.util.g1 J;
    public final android.view.LayoutInflater A;
    public final com.fyber.inneractive.sdk.flow.g B;
    public boolean C;
    public com.fyber.inneractive.sdk.util.v1 D;
    public com.fyber.inneractive.sdk.player.ui.k E;
    public int F;
    public int G;
    public android.view.View H;
    public boolean I;
    public final com.fyber.inneractive.sdk.player.ui.a z;

    static {
        com.fyber.inneractive.sdk.util.g1 g1Var = new com.fyber.inneractive.sdk.util.g1();
        g1Var.c = true;
        J = g1Var;
    }

    public l(android.content.Context context, com.fyber.inneractive.sdk.flow.g gVar, com.fyber.inneractive.sdk.player.ui.a aVar, com.fyber.inneractive.sdk.config.global.r rVar, java.lang.String str) {
        super(context, rVar, str);
        this.C = false;
        this.I = true;
        this.B = gVar;
        this.A = android.view.LayoutInflater.from(context);
        this.z = aVar;
    }

    public abstract void a(int i);

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, com.fyber.inneractive.sdk.player.ui.b bVar2) {
        java.lang.Integer num;
        this.H = bVar2.e;
        android.view.ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            bVar.a(viewGroup, bVar2);
            this.s.setVisibility(0);
            com.fyber.inneractive.sdk.model.vast.i iVar = bVar2.f;
            com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Static;
            if (iVar2 == iVar) {
                a(getEndCardView(), 4);
            }
            if ((iVar2 == iVar || iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) && (num = bVar2.d) != null) {
                b(iVar != iVar2 ? 8 : 4, num.intValue());
            }
        }
    }

    public void b(int i, int i2) {
        if (this.C || this.D != null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("Start Autoclick timer - %d seconds", java.lang.Integer.valueOf(i2));
        com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.SECONDS, i2);
        this.D = v1Var;
        v1Var.e = new com.fyber.inneractive.sdk.player.ui.j(this, i);
        v1Var.d = false;
        v1Var.c.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        p();
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View getEndCardView() {
        return this.H;
    }

    public java.lang.String getLocalizedCtaButtonText() {
        com.fyber.inneractive.sdk.config.global.r rVar = this.w;
        com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
        if (dVar == null) {
            return null;
        }
        dVar.d(com.fyber.inneractive.sdk.config.IAConfigManager.N.o);
        com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
        if (aVar == null || !aVar.d) {
            return null;
        }
        return aVar.f3798a;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    public void h(boolean z) {
        java.lang.String string = getContext().getString(com.fyber.inneractive.sdk.R.string.ia_video_app_info_text);
        com.fyber.inneractive.sdk.config.global.r rVar = this.w;
        if (rVar != null) {
            java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c("show_ad_identifier_original_design");
            this.I = c != null ? c.booleanValue() : true;
            string = ((com.fyber.inneractive.sdk.config.global.features.o) this.w.a(com.fyber.inneractive.sdk.config.global.features.o.class)).a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z && this.I) {
            b(false);
            a(true, string);
            c(true);
        } else if (z) {
            b(false);
            a(true, string);
            c(false);
        } else if (!this.I) {
            b(true);
            c(false);
        } else {
            a(false, (java.lang.String) null);
            b(false);
            c(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        if (this.D != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Autoclick paused", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.v1 v1Var = this.D;
            v1Var.d = true;
            com.fyber.inneractive.sdk.util.t1 t1Var = v1Var.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        if (this.D != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Autoclick resumed", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.v1 v1Var = this.D;
            v1Var.d = false;
            v1Var.a(android.os.SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.u = this.z.a(this.d, this.o, this.p, this.t, this.b, this.m);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    public final void p() {
        if (this.D != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Autoclick is removed ", new java.lang.Object[0]);
            this.D.e = null;
            this.D = null;
        }
    }

    public void setEndCardView(android.view.View view) {
        this.H = view;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(com.fyber.inneractive.sdk.util.h1 h1Var, int i, int i2) {
        this.z.a(this.d, this.o, this.p, this.q, h1Var, i, i2, this.b, ((com.fyber.inneractive.sdk.config.r0) this.c).f.f.intValue());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void a(int i, int i2) {
        java.lang.Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.E = null;
        }
        this.G = getMaxTickFactor() + i2;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i2;
        int i3 = this.G;
        if (i3 <= 0 || i3 > i) {
            return;
        }
        int i4 = this.F;
        if (maxTickFactor < i4 && i4 > 0) {
            a(i3);
            return;
        }
        this.F = maxTickFactor;
        a(maxTickFactor);
        com.fyber.inneractive.sdk.player.ui.k kVar = new com.fyber.inneractive.sdk.player.ui.k(this);
        this.E = kVar;
        postDelayed(kVar, this.l);
    }
}
