package com.ironsource.mediationsdk.testSuite;

/* loaded from: classes5.dex */
public final class TestSuiteActivity extends android.app.Activity implements com.ironsource.R8 {

    /* renamed from: a, reason: collision with root package name */
    private android.widget.RelativeLayout f6468a;
    private com.ironsource.Zf b;
    private com.ironsource.Uf c;
    private android.window.OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.WindowInsets a(android.view.View view, android.view.WindowInsets insets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        android.graphics.Insets insets2 = insets.getInsets(android.view.WindowInsets.Type.systemBars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final java.lang.String c() {
        android.os.Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final org.json.JSONObject d() {
        org.json.JSONObject jSONObject;
        java.lang.String b = new com.ironsource.Lf().b(this);
        if (b != null) {
            try {
                if (b.length() != 0) {
                    jSONObject = new org.json.JSONObject(b);
                    return jSONObject;
                }
            } catch (java.lang.Exception unused) {
                return new org.json.JSONObject();
            }
        }
        jSONObject = new org.json.JSONObject();
        return jSONObject;
    }

    private final android.widget.RelativeLayout.LayoutParams e() {
        return new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        if (android.os.Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            android.widget.RelativeLayout relativeLayout = this.f6468a;
            android.widget.RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    android.view.WindowInsets a2;
                    a2 = com.ironsource.mediationsdk.testSuite.TestSuiteActivity.a(view, windowInsets);
                    return a2;
                }
            });
            android.widget.RelativeLayout relativeLayout3 = this.f6468a;
            if (relativeLayout3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            } else {
                relativeLayout2 = relativeLayout3;
            }
            relativeLayout2.requestApplyInsets();
        }
    }

    public final android.widget.RelativeLayout getContainer() {
        android.widget.RelativeLayout relativeLayout = this.f6468a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.R8
    public void onClosed() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.testSuite.TestSuiteActivity.a(com.ironsource.mediationsdk.testSuite.TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
        this.f6468a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        com.ironsource.Zf zf = new com.ironsource.Zf(this, this, d(), c());
        this.b = zf;
        com.ironsource.Uf uf = new com.ironsource.Uf(zf);
        this.c = uf;
        uf.d();
        android.widget.RelativeLayout relativeLayout2 = this.f6468a;
        com.ironsource.Zf zf2 = null;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        com.ironsource.Zf zf3 = this.b;
        if (zf3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            zf2 = zf3;
        }
        relativeLayout2.addView(zf2.d(), e());
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f();
        com.ironsource.Uf uf = this.c;
        com.ironsource.Zf zf = null;
        if (uf == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            uf = null;
        }
        uf.a();
        android.widget.RelativeLayout relativeLayout = this.f6468a;
        if (relativeLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        com.ironsource.Zf zf2 = this.b;
        if (zf2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            zf = zf2;
        }
        zf.a();
        super.onDestroy();
    }

    @Override // com.ironsource.R8
    public void onUIReady() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.testSuite.TestSuiteActivity.b(com.ironsource.mediationsdk.testSuite.TestSuiteActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.mediationsdk.testSuite.TestSuiteActivity this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Zf zf = this$0.b;
        com.ironsource.Zf zf2 = null;
        if (zf == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            zf = null;
        }
        if (zf.c().getParent() == null) {
            android.widget.RelativeLayout relativeLayout = this$0.f6468a;
            if (relativeLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            com.ironsource.Zf zf3 = this$0.b;
            if (zf3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                zf3 = null;
            }
            relativeLayout.removeView(zf3.d());
            android.widget.RelativeLayout relativeLayout2 = this$0.f6468a;
            if (relativeLayout2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            com.ironsource.Zf zf4 = this$0.b;
            if (zf4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                zf4 = null;
            }
            relativeLayout2.addView(zf4.c(), this$0.e());
            com.ironsource.Zf zf5 = this$0.b;
            if (zf5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                zf2 = zf5;
            }
            zf2.b();
        }
    }

    private final void a() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedCallback onBackInvokedCallback = new android.window.OnBackInvokedCallback() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    com.ironsource.mediationsdk.testSuite.TestSuiteActivity.b();
                }
            };
            this.d = onBackInvokedCallback;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.testSuite.TestSuiteActivity this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }
}
