package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public class m extends android.webkit.WebView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4343a;
    public boolean b;
    public com.fyber.inneractive.sdk.web.l c;
    public com.fyber.inneractive.sdk.web.y0 d;
    public final com.fyber.inneractive.sdk.util.g1 e;
    public int f;
    public int g;

    public m() {
        super(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a());
        this.f4343a = false;
        this.e = new com.fyber.inneractive.sdk.util.g1();
    }

    public final void a(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:".concat(str));
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("Failed to inject JS", th, new java.lang.Object[0]);
            }
        }
    }

    public final void b() {
        boolean z = false;
        com.fyber.inneractive.sdk.util.IAlog.e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", java.lang.Boolean.valueOf(isShown()), java.lang.Boolean.valueOf(hasWindowFocus()), java.lang.Boolean.valueOf(this.f4343a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f4343a) {
                z = true;
            }
            a(z);
            return;
        }
        boolean z2 = isShown() && this.f4343a;
        if (com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a(false, "ignore_w_f")) {
            z = z2;
        } else if (z2 && hasWindowFocus()) {
            z = true;
        }
        a(z);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (java.lang.Throwable unused) {
        }
        this.c = null;
    }

    public int getHeightDp() {
        return this.g;
    }

    public boolean getIsVisible() {
        return this.b;
    }

    public com.fyber.inneractive.sdk.util.g1 getLastClickedLocation() {
        return this.e;
    }

    public int getWidthDp() {
        return this.f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4343a) {
            return;
        }
        this.f4343a = true;
        com.fyber.inneractive.sdk.web.l lVar = this.c;
        if (lVar != null) {
            lVar.b();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        if (this.f4343a) {
            this.f4343a = false;
            com.fyber.inneractive.sdk.web.l lVar = this.c;
            if (lVar != null) {
                lVar.c();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= android.view.ViewConfiguration.getLongPressTimeout()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            dispatchTouchEvent(android.view.MotionEvent.obtain(android.os.SystemClock.uptimeMillis(), android.os.SystemClock.uptimeMillis(), 0, x, y, 0));
            dispatchTouchEvent(android.view.MotionEvent.obtain(android.os.SystemClock.uptimeMillis(), android.os.SystemClock.uptimeMillis(), 1, x, y, 0));
        }
        com.fyber.inneractive.sdk.web.y0 y0Var = this.d;
        if (y0Var != null) {
            y0Var.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            com.fyber.inneractive.sdk.util.g1 g1Var = this.e;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            g1Var.f4292a = x2;
            g1Var.b = y2;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.fyber.inneractive.sdk.util.IAlog.e("onWindowFocusChanged with: %s", java.lang.Boolean.valueOf(z));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            a(false);
        } else {
            a();
        }
    }

    public void setHeightDp(int i) {
        this.g = i;
    }

    public void setListener(com.fyber.inneractive.sdk.web.l lVar) {
        this.c = lVar;
    }

    public void setTapListener(com.fyber.inneractive.sdk.web.x0 x0Var) {
        this.d = new com.fyber.inneractive.sdk.web.y0(x0Var, com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a());
    }

    public void setWidthDp(int i) {
        this.f = i;
    }

    public final void a(boolean z) {
        if (z) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
            if (viewGroup != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    com.fyber.inneractive.sdk.util.IAlog.e("updateVisibility - Cannot find local visible rect. Scrolled out?", new java.lang.Object[0]);
                    z = false;
                }
            } else {
                com.fyber.inneractive.sdk.util.IAlog.e("updateVisibility - No parent available", new java.lang.Object[0]);
            }
        }
        if (this.b != z) {
            this.b = z;
            com.fyber.inneractive.sdk.web.l lVar = this.c;
            if (lVar != null) {
                lVar.a(z);
            }
        }
    }

    public final void a() {
        if (com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a(false, "update_v_mth")) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.k(this));
        } else {
            b();
        }
    }
}
