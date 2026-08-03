package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public abstract class e extends android.widget.RelativeLayout implements com.fyber.inneractive.sdk.player.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f4163a;
    public final int b;
    public com.fyber.inneractive.sdk.config.s0 c;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType d;
    public boolean e;
    public boolean f;
    public com.fyber.inneractive.sdk.player.ui.n g;
    public boolean h;
    public android.view.View i;

    public e(android.content.Context context) {
        super(context, null, 0);
        this.f4163a = new com.fyber.inneractive.sdk.util.g1();
        this.b = 0;
        this.e = false;
        this.f = false;
        this.h = false;
        this.b = java.lang.Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(com.fyber.inneractive.sdk.util.h1 h1Var, int i, int i2);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return false;
    }

    public void d() {
        this.h = true;
    }

    public void e() {
        this.h = false;
    }

    public final void f() {
        boolean z = isShown() && hasWindowFocus() && this.f && !this.h;
        if (z) {
            z = getGlobalVisibleRect(new android.graphics.Rect());
        }
        if (z == this.e || this.g == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%supdateVisibility changing to %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z));
        this.e = z;
        this.g.a(z);
    }

    public android.view.View getWatermarkView() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.fyber.inneractive.sdk.util.IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(this.f));
        this.f = true;
        com.fyber.inneractive.sdk.player.ui.n nVar = this.g;
        if (nVar != null) {
            nVar.a();
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.fyber.inneractive.sdk.util.IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(this.f));
        this.f = false;
        com.fyber.inneractive.sdk.player.ui.n nVar = this.g;
        if (nVar != null) {
            nVar.c();
        }
        f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sgot onVisibilityChanged with %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i));
            f();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.fyber.inneractive.sdk.util.IAlog.a("%sgot onWindowFocusChanged with: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z));
        com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(this, z), 500L);
    }

    public void setListener(com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.g = nVar;
    }

    public void setUnitConfig(com.fyber.inneractive.sdk.config.s0 s0Var) {
        this.c = s0Var;
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
        this.d = r0Var.e == null ? r0Var.f.j : com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT;
    }

    public void setWatermarkView(android.view.View view) {
        this.i = view;
    }
}
