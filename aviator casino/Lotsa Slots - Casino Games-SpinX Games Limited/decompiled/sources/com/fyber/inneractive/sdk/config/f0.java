package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3597a;
    public final /* synthetic */ java.lang.String b;

    public f0(java.lang.String str, java.lang.String str2) {
        this.f3597a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        android.webkit.WebView webView;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (iAConfigManager.K == null && (context = iAConfigManager.f) != null) {
            try {
                webView = new android.webkit.WebView(context);
                webView.setWebViewClient(new com.fyber.inneractive.sdk.config.y());
            } catch (java.lang.Throwable unused) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to create a new webview", new java.lang.Object[0]);
                webView = null;
            }
            iAConfigManager.K = webView;
        }
        android.webkit.WebView webView2 = iAConfigManager.K;
        java.lang.String str = this.f3597a;
        java.lang.String str2 = this.b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", com.ironsource.B5.O, null);
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(com.fyber.inneractive.sdk.config.IAConfigManager.P, java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
    }
}
