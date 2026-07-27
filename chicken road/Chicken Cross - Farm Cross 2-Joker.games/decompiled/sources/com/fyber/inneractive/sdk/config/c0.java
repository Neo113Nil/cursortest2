package com.fyber.inneractive.sdk.config;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes4.dex */
public final class c0 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAConfigManager iAConfigManager = IAConfigManager.R;
        if (iAConfigManager.N == webView) {
            iAConfigManager.N = null;
        }
        if (webView == null) {
            return true;
        }
        com.fyber.inneractive.sdk.util.v.a(webView);
        webView.destroy();
        return true;
    }
}
