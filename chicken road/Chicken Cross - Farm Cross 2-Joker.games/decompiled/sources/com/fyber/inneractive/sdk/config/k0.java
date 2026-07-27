package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class k0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        WebView webView2 = iAConfigManager.N;
        if (webView2 == null || iAConfigManager.g == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new WebView(iAConfigManager.g);
            webView.setWebViewClient(new c0());
        } catch (Throwable unused) {
            IAlog.a("failed to create a new webview", new Object[0]);
            webView = null;
        }
        iAConfigManager.N = webView;
    }
}
