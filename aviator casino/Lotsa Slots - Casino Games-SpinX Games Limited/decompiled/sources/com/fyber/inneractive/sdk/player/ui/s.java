package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public abstract class s extends com.fyber.inneractive.sdk.player.ui.e {
    public final int j;
    public final int k;
    public final int l;
    public android.view.ViewGroup m;
    public android.widget.Button n;
    public int o;
    public int p;
    public boolean q;
    public android.view.ViewGroup r;
    public android.view.ViewGroup s;
    public final com.fyber.inneractive.sdk.util.h1 t;
    public com.fyber.inneractive.sdk.util.h1 u;
    public android.widget.TextView v;
    public final com.fyber.inneractive.sdk.config.global.r w;
    public final java.lang.String x;
    public final com.fyber.inneractive.sdk.util.h1 y;

    public s(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar, java.lang.String str) {
        super(context);
        this.o = -1;
        this.p = -1;
        this.q = false;
        this.t = new com.fyber.inneractive.sdk.util.h1(0, 0);
        this.y = new com.fyber.inneractive.sdk.util.h1(0, 0);
        com.fyber.inneractive.sdk.util.IAlog.a("%sctor called", com.fyber.inneractive.sdk.util.IAlog.a(this));
        int tickFractions = getTickFractions();
        this.k = tickFractions;
        this.j = getMaxTickFactor();
        this.l = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(com.fyber.inneractive.sdk.R.color.ia_video_background_color));
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.w = rVar;
        this.x = str;
    }

    public abstract void a(int i, int i2);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, com.fyber.inneractive.sdk.player.ui.b bVar2);

    public abstract void a(boolean z);

    public void a(boolean z, int i, int i2) {
        this.o = i;
        this.p = i2;
        this.q = z;
    }

    public abstract void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z, java.lang.String str);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean c() {
        return this.r.getVisibility() == 0 || this.s.getChildCount() > 0;
    }

    public abstract void d(boolean z);

    public void destroy() {
        i();
        setVisibility(8);
        if (this.g != null) {
            this.g = null;
        }
        this.i = null;
        com.fyber.inneractive.sdk.util.IAlog.a("%sdestroyed called", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g();

    public abstract void g(boolean z);

    public android.view.ViewGroup getDefaultEndCardContainer() {
        return this.r;
    }

    public abstract android.view.View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public android.view.ViewGroup getTextureHost() {
        return this.m;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract android.view.View[] getTrackingFriendlyView();

    public abstract android.view.View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.p;
    }

    public int getVideoWidth() {
        return this.o;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        a(this.y, size, size2);
        com.fyber.inneractive.sdk.util.h1 h1Var = this.y;
        int i3 = h1Var.f4294a;
        if (i3 <= 0 || h1Var.b <= 0) {
            h1Var.f4294a = size;
            h1Var.b = size2;
        } else {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(this.y.b, 1073741824);
            i = makeMeasureSpec;
        }
        if (!this.t.equals(this.y)) {
            com.fyber.inneractive.sdk.util.h1 h1Var2 = this.t;
            com.fyber.inneractive.sdk.util.h1 h1Var3 = this.y;
            h1Var2.getClass();
            h1Var2.f4294a = h1Var3.f4294a;
            h1Var2.b = h1Var3.b;
            o();
        }
        super.onMeasure(i, i2);
    }

    public abstract void setAppInfoButtonRound(android.widget.TextView textView);

    public abstract void setMuteButtonState(boolean z);

    public abstract void setRemainingTime(java.lang.String str);

    public abstract void setSkipText(java.lang.String str);

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, com.fyber.inneractive.sdk.player.ui.b bVar) {
        android.view.ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            com.fyber.inneractive.sdk.player.ui.n nVar = this.g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            android.view.ViewGroup viewGroup = fVar.c;
            com.fyber.inneractive.sdk.util.v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.e, dVar.c);
        }
    }

    public final void a(android.view.View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new com.fyber.inneractive.sdk.player.ui.r(new android.view.GestureDetector(view.getContext(), new com.fyber.inneractive.sdk.player.ui.q(this, view, new int[2], i))));
        }
    }
}
