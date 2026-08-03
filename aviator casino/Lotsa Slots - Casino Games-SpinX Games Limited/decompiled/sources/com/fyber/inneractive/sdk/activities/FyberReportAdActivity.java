package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class FyberReportAdActivity extends com.fyber.inneractive.sdk.activities.InneractiveBaseActivity {
    public static com.fyber.inneractive.sdk.flow.h f;
    public android.webkit.WebView b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;

    public static android.content.Intent createIntent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Long l) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.FyberReportAdActivity.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("advertiser_domain", str);
        bundle.putString("dsp_name", str2);
        bundle.putString("dsp_id", l != null ? java.lang.Long.toString(l.longValue()) : null);
        intent.putExtras(bundle);
        return intent;
    }

    public static void disableWebviewZoomControls(android.webkit.WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new com.fyber.inneractive.sdk.util.o0(webView).run();
    }

    public static com.fyber.inneractive.sdk.flow.h getAdReporter() {
        return f;
    }

    public static void start(android.content.Context context, com.fyber.inneractive.sdk.flow.h hVar, java.lang.String str, java.lang.String str2, java.lang.Long l) {
        f = hVar;
        try {
            context.startActivity(createIntent(context, str, str2, l));
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed starting fyber report ad activity", e, new java.lang.Object[0]);
        }
    }

    public final android.widget.FrameLayout a() {
        android.webkit.WebView webView;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        try {
            webView = new android.webkit.WebView(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a());
            webView.setWebViewClient(new com.fyber.inneractive.sdk.activities.a(this));
            webView.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_webview_report_ad);
            android.webkit.WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(webView);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(this.c)) {
                hashMap.put("advertiser_domain", this.c);
            }
            if (!android.text.TextUtils.isEmpty(this.d)) {
                hashMap.put("dsp_name", this.d);
            }
            if (!android.text.TextUtils.isEmpty(this.e)) {
                hashMap.put("dsp_id", this.e);
            }
            webView.loadUrl(com.fyber.inneractive.sdk.util.f1.a("https://cdn2.inner-active.mobi/client/fyber-i-icon/index.html", hashMap));
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.b("failed creating webivew for report ad", new java.lang.Object[0]);
            finish();
            webView = null;
        }
        this.b = webView;
        frameLayout.addView(webView, -1, -1);
        return frameLayout;
    }

    public java.lang.String getAdDomain() {
        return this.c;
    }

    public java.lang.String getAdNetwork() {
        return this.d;
    }

    public java.lang.String getAdNetworkId() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.c = extras.getString("advertiser_domain");
                this.d = extras.getString("dsp_name");
                this.e = extras.getString("dsp_id");
            }
            setContentView(a());
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed creating fyber report ad activity", e, new java.lang.Object[0]);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        android.webkit.WebView webView = this.b;
        if (webView != null) {
            webView.removeAllViews();
            com.fyber.inneractive.sdk.util.v.a(this.b);
            this.b.destroy();
            this.b = null;
        }
        f = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }
}
