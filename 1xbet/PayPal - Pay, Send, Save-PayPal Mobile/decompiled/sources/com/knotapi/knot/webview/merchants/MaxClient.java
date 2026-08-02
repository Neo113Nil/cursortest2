package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class MaxClient extends com.knotapi.knot.webview.KnotViewClient {
    public MaxClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (this.knotView.isUserLoggedIn(str) || str.equals(this.bot.getAndroidLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }
}
