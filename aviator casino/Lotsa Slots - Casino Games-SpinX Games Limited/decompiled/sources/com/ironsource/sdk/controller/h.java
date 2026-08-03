package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class h extends android.widget.FrameLayout implements com.ironsource.Pc {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f6636a;
    private com.ironsource.sdk.controller.v b;
    private final com.ironsource.InterfaceC3362x7 c;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewGroup windowDecorViewGroup = com.ironsource.sdk.controller.h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(com.ironsource.sdk.controller.h.this);
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewGroup windowDecorViewGroup = com.ironsource.sdk.controller.h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(com.ironsource.sdk.controller.h.this);
            }
        }
    }

    public h(android.content.Context context) {
        super(context);
        this.c = com.ironsource.Jb.Y().a();
        this.f6636a = context;
        setClickable(true);
    }

    private void b() {
        ((android.app.Activity) this.f6636a).runOnUiThread(new com.ironsource.sdk.controller.h.b());
    }

    private int getNavigationBarPadding() {
        android.app.Activity activity = (android.app.Activity) this.f6636a;
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.c.A(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            android.content.Context context = this.f6636a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f6636a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((android.app.Activity) this.f6636a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.ViewGroup getWindowDecorViewGroup() {
        android.app.Activity activity = (android.app.Activity) this.f6636a;
        if (activity != null) {
            return (android.view.ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(com.ironsource.sdk.controller.v vVar) {
        this.b = vVar;
        vVar.a(this);
        this.b.H();
        this.f6636a = this.b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
        this.b.b(true, com.ironsource.X3.i.Z);
    }

    @Override // com.ironsource.Pc
    public boolean onBackButtonPressed() {
        return com.ironsource.C3375y2.a().a((android.app.Activity) this.f6636a);
    }

    @Override // com.ironsource.Pc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.E();
        this.b.b(false, com.ironsource.X3.i.Z);
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a(com.ironsource.sdk.controller.v.EnumC0167v.Gone);
            this.b.F();
            this.b.G();
        }
        removeAllViews();
    }

    @Override // com.ironsource.Pc
    public void onOrientationChanged(java.lang.String str, int i) {
    }

    private void a() {
        ((android.app.Activity) this.f6636a).runOnUiThread(new com.ironsource.sdk.controller.h.a());
    }

    private void a(int i, int i2) {
        try {
            android.content.Context context = this.f6636a;
            if (context != null) {
                int A = this.c.A(context);
                if (A == 1) {
                    setPadding(0, i, 0, i2);
                } else if (A == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }
}
