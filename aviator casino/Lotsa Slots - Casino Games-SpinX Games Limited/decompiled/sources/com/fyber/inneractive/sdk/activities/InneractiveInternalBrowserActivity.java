package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class InneractiveInternalBrowserActivity extends com.fyber.inneractive.sdk.activities.InneractiveBaseActivity {
    public static final java.lang.String EXTRA_KEY_SPOT_ID = "spotId";
    public static final java.lang.String URL_EXTRA = "extra_url";
    public static java.lang.String j;
    public static com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener k;
    public com.fyber.inneractive.sdk.flow.x b;
    public java.lang.String c;
    public android.widget.LinearLayout d;
    public android.webkit.WebView e;
    public android.widget.ImageButton f;
    public android.widget.ImageButton g;
    public android.widget.ImageButton h;
    public android.widget.ImageButton i;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, com.fyber.inneractive.sdk.click.b bVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.flow.x xVar = inneractiveInternalBrowserActivity.b;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f3765a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        org.json.JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long j2 = bVar.e;
        if (j2 != 0) {
            java.lang.Object valueOf = java.lang.Long.valueOf(j2);
            try {
                jSONObject.put("time_passed", valueOf);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
            }
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bVar.f.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("url", jVar.f3577a);
                jSONObject2.put("success", jVar.b);
                jSONObject2.put("opened_by", jVar.c);
                jSONObject2.put("reason", jVar.d);
            } catch (java.lang.Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        java.lang.Object obj = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (java.lang.Exception unused4) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }

    public static void disableWebviewZoomControls(android.webkit.WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new com.fyber.inneractive.sdk.util.o0(webView).run();
    }

    public static void setHtmlExtra(java.lang.String str) {
        j = str;
    }

    public static void setInternalBrowserListener(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener) {
        k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            java.lang.String stringExtra = getIntent().getStringExtra("spotId");
            this.c = stringExtra;
            if (!android.text.TextUtils.isEmpty(stringExtra) && (spot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().getSpot(this.c)) != null) {
                this.b = spot.getAdContent();
            }
            android.content.Intent intent = getIntent();
            android.webkit.WebSettings settings = this.e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.e);
            this.e.setWebChromeClient(new com.fyber.inneractive.sdk.activities.f(this));
            java.lang.String stringExtra2 = intent.getStringExtra(URL_EXTRA);
            if (!android.text.TextUtils.isEmpty(j)) {
                java.lang.String str = j + "<title>DigitalTurbine Internal Browser</title>";
                j = str;
                this.e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (android.text.TextUtils.isEmpty(stringExtra2)) {
                com.fyber.inneractive.sdk.util.IAlog.f("Empty url", new java.lang.Object[0]);
                finish();
            } else if (!com.fyber.inneractive.sdk.util.h0.d(stringExtra2)) {
                this.e.loadUrl(stringExtra2);
            } else if (com.fyber.inneractive.sdk.util.h0.c(stringExtra2)) {
                try {
                    stringExtra2 = java.net.URLDecoder.decode(stringExtra2, com.ironsource.B5.O);
                    this.e.loadUrl(stringExtra2);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (android.content.ActivityNotFoundException unused2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f.setBackgroundColor(0);
            this.f.setOnClickListener(new com.fyber.inneractive.sdk.activities.j(this));
            this.f.setContentDescription("IABackButton");
            this.g.setBackgroundColor(0);
            this.g.setOnClickListener(new com.fyber.inneractive.sdk.activities.k(this));
            this.g.setContentDescription("IAForwardButton");
            this.h.setBackgroundColor(0);
            this.h.setOnClickListener(new com.fyber.inneractive.sdk.activities.l(this));
            this.h.setContentDescription("IARefreshButton");
            this.i.setBackgroundColor(0);
            this.i.setOnClickListener(new com.fyber.inneractive.sdk.activities.m(this));
            this.i.setContentDescription("IACloseButton");
            com.fyber.inneractive.sdk.util.o.a();
            com.fyber.inneractive.sdk.util.o.f();
        } catch (java.lang.Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        android.widget.LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        android.webkit.WebView webView = this.e;
        if (webView != null) {
            webView.removeAllViews();
            com.fyber.inneractive.sdk.util.v.a(this.e);
            this.e.destroy();
            this.e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.fyber.inneractive.sdk.util.o.g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.util.o.f();
    }

    public final android.widget.LinearLayout a() {
        this.d = new android.widget.LinearLayout(this);
        this.d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.d.setOrientation(1);
        this.d.setContentDescription("IAInternalBrowserView");
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
        relativeLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.d.addView(relativeLayout);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setId(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(com.fyber.inneractive.sdk.R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.util.o.a(linearLayout, com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f = a(com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_left_arrow));
        this.g = a(com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_right_arrow));
        this.h = a(com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_refresh));
        this.i = a(com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_close));
        linearLayout.addView(this.f);
        linearLayout.addView(this.g);
        linearLayout.addView(this.h);
        linearLayout.addView(this.i);
        android.webkit.WebView webView = new android.webkit.WebView(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a());
        this.e = webView;
        webView.setWebViewClient(new com.fyber.inneractive.sdk.activities.g(this));
        this.e.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_webview_internal_browser);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.e);
        return this.d;
    }

    public final android.widget.ImageButton a(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageButton imageButton = new android.widget.ImageButton(this);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(com.fyber.inneractive.sdk.R.integer.ia_ib_button_size_dp)), com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(com.fyber.inneractive.sdk.R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
