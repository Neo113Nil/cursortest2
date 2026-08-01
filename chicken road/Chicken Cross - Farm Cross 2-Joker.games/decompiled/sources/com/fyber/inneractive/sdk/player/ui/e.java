package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;

/* loaded from: classes4.dex */
public abstract class e extends RelativeLayout implements m {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f5817a;
    public final int b;
    public x0 c;
    public UnitDisplayType d;
    public boolean e;
    public boolean f;
    public n g;
    public boolean h;
    public View i;

    public e(Context context) {
        super(context, null, 0);
        this.f5817a = new g1();
        this.b = 0;
        this.e = false;
        this.f = false;
        this.h = false;
        this.b = Math.min(com.fyber.inneractive.sdk.util.o.d(), com.fyber.inneractive.sdk.util.o.c());
    }

    public abstract void a(h1 h1Var, int i, int i2);

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
            z = getGlobalVisibleRect(new Rect());
        }
        if (z == this.e || this.g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(z));
        this.e = z;
        this.g.a(z);
    }

    public View getWatermarkView() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = true;
        n nVar = this.g;
        if (nVar != null) {
            nVar.a();
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = false;
        n nVar = this.g;
        if (nVar != null) {
            nVar.c();
        }
        f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i));
            f();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        com.fyber.inneractive.sdk.util.r.b.postDelayed(new d(this, z), 500L);
    }

    public void setListener(n nVar) {
        this.g = nVar;
    }

    public void setUnitConfig(x0 x0Var) {
        this.c = x0Var;
        w0 w0Var = (w0) x0Var;
        this.d = w0Var.e == null ? w0Var.f.j : UnitDisplayType.DEFAULT;
    }

    public void setWatermarkView(View view) {
        this.i = view;
    }
}
