package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class g0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        android.webkit.WebView webView;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        android.webkit.WebView webView2 = iAConfigManager.K;
        if (webView2 == null || iAConfigManager.f == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new android.webkit.WebView(iAConfigManager.f);
            webView.setWebViewClient(new com.fyber.inneractive.sdk.config.y());
        } catch (java.lang.Throwable unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed to create a new webview", new java.lang.Object[0]);
            webView = null;
        }
        iAConfigManager.K = webView;
    }
}
