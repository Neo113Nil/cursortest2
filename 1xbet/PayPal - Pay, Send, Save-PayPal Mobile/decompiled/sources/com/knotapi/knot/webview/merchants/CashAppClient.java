package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class CashAppClient extends com.knotapi.knot.webview.KnotViewClient {
    public CashAppClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        com.knotapi.knot.models.Bot bot = this.bot;
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        com.knotapi.knot.utilities.RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
    }
}
