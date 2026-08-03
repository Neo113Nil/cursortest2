package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class ControllerActivity extends android.app.Activity implements com.ironsource.Pc, com.ironsource.InterfaceC3371xg {
    private static final java.lang.String o = "ControllerActivity";
    private static final int p = 1;
    private static java.lang.String q = "removeWebViewContainerView | mContainer is null";
    private static java.lang.String r = "removeWebViewContainerView | view is null";

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6591a;
    private com.ironsource.sdk.controller.v b;
    private android.widget.RelativeLayout c;
    private android.widget.FrameLayout d;
    private com.ironsource.InterfaceC3362x7 e;
    private android.window.OnBackInvokedCallback f;
    private java.lang.String h;
    private com.ironsource.C2980c1 l;
    private boolean m;
    private boolean n;
    public int currentRequestedRotation = -1;
    private boolean g = false;
    private android.os.Handler i = new android.os.Handler();
    private final java.lang.Runnable j = new com.ironsource.sdk.controller.ControllerActivity.a();
    final android.widget.RelativeLayout.LayoutParams k = new android.widget.RelativeLayout.LayoutParams(-1, -1);

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.ironsource.sdk.utils.SDKUtils.getActivityUIFlags(com.ironsource.sdk.controller.ControllerActivity.this.g));
        }
    }

    class b implements android.view.View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                com.ironsource.sdk.controller.ControllerActivity controllerActivity = com.ironsource.sdk.controller.ControllerActivity.this;
                controllerActivity.i.removeCallbacks(controllerActivity.j);
                com.ironsource.sdk.controller.ControllerActivity controllerActivity2 = com.ironsource.sdk.controller.ControllerActivity.this;
                controllerActivity2.i.postDelayed(controllerActivity2.j, 500L);
            }
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private boolean b(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || str.equals(java.lang.Integer.toString(1))) ? false : true;
    }

    private void c() {
        java.lang.String str = o;
        com.ironsource.sdk.utils.Logger.i(str, "clearWebviewController");
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar == null) {
            com.ironsource.sdk.utils.Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(com.ironsource.sdk.controller.v.EnumC0167v.Gone);
        this.b.F();
        this.b.G();
        this.b.g(this.h, "onDestroy");
    }

    private void d() {
        android.content.Intent intent = getIntent();
        a(intent.getStringExtra(com.ironsource.X3.i.A), intent.getIntExtra(com.ironsource.X3.i.B, 0));
    }

    private boolean e() {
        return this.f6591a == null;
    }

    private void f() {
        runOnUiThread(new com.ironsource.sdk.controller.ControllerActivity.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        com.ironsource.sdk.utils.Logger.i(o, "OnBackInvokedCallback");
        if (com.ironsource.C3375y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (android.os.Build.VERSION.SDK_INT < 33 || this.f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f);
            com.ironsource.sdk.utils.Logger.i(o, "OnBackInvokedCallback unregistered");
            this.f = null;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private void i() {
        android.view.ViewGroup viewGroup;
        try {
            if (this.c == null) {
                throw new java.lang.Exception(q);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.d.getParent();
            android.view.View a2 = a(viewGroup2);
            if (a2 == null) {
                throw new java.lang.Exception(r);
            }
            if (isFinishing() && (viewGroup = (android.view.ViewGroup) a2.getParent()) != null) {
                viewGroup.removeView(a2);
            }
            viewGroup2.removeView(this.d);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.C3327v8.a(com.ironsource.C3083he.s, new com.ironsource.C3238q8().a(com.ironsource.B5.A, e.getMessage()).a());
            com.ironsource.sdk.utils.Logger.i(o, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    private void j() {
        int L = this.e.L(this);
        java.lang.String str = o;
        com.ironsource.sdk.utils.Logger.i(str, "setInitiateLandscapeOrientation");
        if (L == 0) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (L == 2) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (L == 3) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (L != 1) {
            com.ironsource.sdk.utils.Logger.i(str, "No Rotation");
        } else {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void k() {
        int L = this.e.L(this);
        java.lang.String str = o;
        com.ironsource.sdk.utils.Logger.i(str, "setInitiatePortraitOrientation");
        if (L == 0) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (L == 2) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (L == 1) {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (L != 3) {
            com.ironsource.sdk.utils.Logger.i(str, "No Rotation");
        } else {
            com.ironsource.sdk.utils.Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.Pc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.ironsource.sdk.utils.Logger.i(o, "onBackPressed");
        if (com.ironsource.C3375y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Pc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.e = com.ironsource.Jb.Y().a();
        try {
            new com.ironsource.C3139l(this).a();
            new com.ironsource.C3121k(this).a();
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) com.ironsource.O9.b((android.content.Context) this).a().k();
            this.b = vVar;
            vVar.s().setId(1);
            this.b.a((com.ironsource.Pc) this);
            this.b.a((com.ironsource.InterfaceC3371xg) this);
            android.content.Intent intent = getIntent();
            this.h = intent.getStringExtra(com.ironsource.X3.i.m);
            this.g = intent.getBooleanExtra(com.ironsource.X3.i.v, false);
            this.f6591a = intent.getStringExtra("adViewId");
            this.m = false;
            this.n = intent.getBooleanExtra(com.ironsource.X3.i.z0, false);
            if (this.g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new com.ironsource.sdk.controller.ControllerActivity.b());
                runOnUiThread(this.j);
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
            this.c = relativeLayout;
            setContentView(relativeLayout, this.k);
            this.d = a(this.f6591a);
            if (this.c.findViewById(1) == null && this.d.getParent() != null) {
                finish();
            }
            d();
            this.c.addView(this.d, this.k);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        java.lang.String str = o;
        com.ironsource.sdk.utils.Logger.i(str, "onDestroy");
        h();
        i();
        if (this.m) {
            return;
        }
        com.ironsource.sdk.utils.Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && this.b.y()) {
            this.b.x();
            return true;
        }
        if (this.g && (i == 25 || i == 24)) {
            this.i.removeCallbacks(this.j);
            this.i.postDelayed(this.j, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.Pc
    public void onOrientationChanged(java.lang.String str, int i) {
        a(str, i);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ironsource.sdk.utils.Logger.i(o, "onPause, isFinishing=" + isFinishing());
        com.ironsource.sdk.controller.t.a(this);
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a((android.content.Context) this);
            if (!this.n) {
                this.b.E();
            }
            this.b.b(false, com.ironsource.X3.i.Z);
            this.b.g(this.h, com.ironsource.X3.i.t0);
        }
        if (isFinishing()) {
            this.m = true;
            c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.ironsource.sdk.utils.Logger.i(o, com.ironsource.X3.i.u0);
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.n) {
                this.b.I();
            }
            this.b.b(true, com.ironsource.X3.i.Z);
            this.b.g(this.h, com.ironsource.X3.i.u0);
        }
        com.ironsource.sdk.controller.t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.ironsource.sdk.utils.Logger.i(o, "onStart");
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.ironsource.sdk.utils.Logger.i(o, "onStop");
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        com.ironsource.sdk.utils.Logger.i(o, "onUserLeaveHint");
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC3371xg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3371xg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3371xg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3371xg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3371xg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.g && z) {
            runOnUiThread(this.j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            com.ironsource.sdk.utils.Logger.i(o, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            f();
        } else {
            b();
        }
    }

    private void a() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.f = new android.window.OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.ControllerActivity$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    com.ironsource.sdk.controller.ControllerActivity.this.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f);
        }
    }

    private void b() {
        runOnUiThread(new com.ironsource.sdk.controller.ControllerActivity.d());
    }

    private android.widget.FrameLayout a(java.lang.String str) {
        if (!b(str)) {
            return this.b.s();
        }
        return com.ironsource.bh.a(getApplicationContext(), com.ironsource.C3148l8.a().a(str).getPresentingView());
    }

    private void a(java.lang.String str, int i) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                j();
                return;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                k();
                return;
            }
            if ("device".equalsIgnoreCase(str)) {
                if (this.e.x(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private android.view.View a(android.view.ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return com.ironsource.C3148l8.a().a(this.f6591a).getPresentingView();
    }
}
