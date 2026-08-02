package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class EVCSClient extends com.knotapi.knot.webview.KnotViewClient {
    public EVCSClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        if (str.equals(this.bot.getLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.hideLoader();
            this.knotView.finalStep();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }
}
