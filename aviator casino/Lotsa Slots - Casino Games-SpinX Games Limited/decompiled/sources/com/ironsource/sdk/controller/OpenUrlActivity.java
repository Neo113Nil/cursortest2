package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class OpenUrlActivity extends android.app.Activity {
    private static final java.lang.String j = "OpenUrlActivity";
    private static final int k = com.ironsource.sdk.utils.SDKUtils.generateViewId();
    private static final int l = com.ironsource.sdk.utils.SDKUtils.generateViewId();
    private com.ironsource.sdk.controller.v b;
    private android.widget.ProgressBar c;
    boolean d;
    private android.widget.RelativeLayout e;
    private java.lang.String f;

    /* renamed from: a, reason: collision with root package name */
    private android.webkit.WebView f6598a = null;
    private final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean h = false;
    private final java.lang.Runnable i = new com.ironsource.sdk.controller.OpenUrlActivity.b();

    class a implements android.view.View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                com.ironsource.sdk.controller.OpenUrlActivity openUrlActivity = com.ironsource.sdk.controller.OpenUrlActivity.this;
                openUrlActivity.g.removeCallbacks(openUrlActivity.i);
                com.ironsource.sdk.controller.OpenUrlActivity openUrlActivity2 = com.ironsource.sdk.controller.OpenUrlActivity.this;
                openUrlActivity2.g.postDelayed(openUrlActivity2.i, 500L);
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.ironsource.sdk.utils.SDKUtils.getActivityUIFlags(com.ironsource.sdk.controller.OpenUrlActivity.this.h));
        }
    }

    private class c extends android.webkit.WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.ironsource.sdk.controller.OpenUrlActivity.this.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.ironsource.sdk.controller.OpenUrlActivity.this.c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            com.ironsource.sdk.controller.v vVar;
            super.onReceivedError(webView, i, str, str2);
            try {
                com.ironsource.J3 featureFlagCatchUrlError = com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = com.ironsource.sdk.controller.OpenUrlActivity.this.b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        com.ironsource.sdk.controller.OpenUrlActivity.this.finish();
                    }
                }
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(com.ironsource.sdk.controller.OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            com.ironsource.sdk.controller.OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            if (!new com.ironsource.Pe(str, com.ironsource.C2989ca.e().d(), com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                com.ironsource.C3210og.a(com.ironsource.sdk.controller.OpenUrlActivity.this, str);
                com.ironsource.sdk.controller.OpenUrlActivity.this.b.A();
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (e instanceof android.content.ActivityNotFoundException) {
                    sb.append(com.ironsource.X3.c.x);
                } else {
                    sb.append(com.ironsource.X3.c.y);
                }
                com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.OpenUrlActivity.this.b;
                if (vVar != null) {
                    vVar.d(sb.toString(), str);
                }
            }
            com.ironsource.sdk.controller.OpenUrlActivity.this.finish();
            return true;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        static final java.lang.String f6602a = "is_store";
        static final java.lang.String b = "external_url";
        static final java.lang.String c = "secondary_web_view";
        static final java.lang.String d = "immersive";
        static final java.lang.String e = "no activity to handle url";
        static final java.lang.String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.InterfaceC3068h f6603a;
        private int b;
        private java.lang.String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        public e(com.ironsource.InterfaceC3068h interfaceC3068h) {
            this.f6603a = interfaceC3068h;
        }

        com.ironsource.sdk.controller.OpenUrlActivity.e a(int i) {
            this.b = i;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e b(boolean z) {
            this.d = z;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e c(boolean z) {
            this.e = z;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e a(java.lang.String str) {
            this.c = str;
            return this;
        }

        com.ironsource.sdk.controller.OpenUrlActivity.e a(boolean z) {
            this.f = z;
            return this;
        }

        public android.content.Intent a(android.content.Context context) {
            android.content.Intent a2 = this.f6603a.a(context);
            a2.putExtra("external_url", this.c);
            a2.putExtra("secondary_web_view", this.d);
            a2.putExtra("is_store", this.e);
            a2.putExtra(com.ironsource.X3.i.v, this.f);
            if (!(context instanceof android.app.Activity)) {
                a2.setFlags(this.b);
            }
            return a2;
        }
    }

    private void a() {
        if (this.c == null) {
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(new android.view.ContextThemeWrapper(this, android.R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    private void b() {
        if (this.f6598a == null) {
            android.webkit.WebView webView = new android.webkit.WebView(getApplicationContext());
            this.f6598a = webView;
            webView.setId(k);
            this.f6598a.getSettings().setJavaScriptEnabled(true);
            this.f6598a.setWebViewClient(new com.ironsource.sdk.controller.OpenUrlActivity.c());
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.f6598a, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.b(true, com.ironsource.X3.i.Y);
        }
    }

    private void c() {
        android.webkit.WebView webView = this.f6598a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        android.view.ViewGroup viewGroup;
        com.ironsource.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.b(false, com.ironsource.X3.i.Y);
            if (this.e == null || (viewGroup = (android.view.ViewGroup) this.f6598a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.f6598a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        com.ironsource.sdk.controller.v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(com.ironsource.X3.i.j);
        }
        super.finish();
    }

    public void loadUrl(java.lang.String str) {
        this.f6598a.stopLoading();
        this.f6598a.clearHistory();
        try {
            this.f6598a.loadUrl(str);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.sdk.utils.Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f6598a.canGoBack()) {
            this.f6598a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(j, "onCreate()");
        try {
            this.b = (com.ironsource.sdk.controller.v) com.ironsource.O9.b((android.content.Context) this).a().k();
            e();
            f();
            android.os.Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(com.ironsource.X3.i.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new com.ironsource.sdk.controller.OpenUrlActivity.a());
                runOnUiThread(this.i);
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}
