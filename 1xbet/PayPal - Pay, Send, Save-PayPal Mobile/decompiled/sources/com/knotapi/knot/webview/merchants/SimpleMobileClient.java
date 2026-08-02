package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class SimpleMobileClient extends com.knotapi.knot.webview.KnotViewClient {
    public SimpleMobileClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        super.onPageCommitVisible(webView, str);
        this.knotView.hideLoader();
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.addCookies(str);
            this.knotView.finalStep();
        }
    }
}
