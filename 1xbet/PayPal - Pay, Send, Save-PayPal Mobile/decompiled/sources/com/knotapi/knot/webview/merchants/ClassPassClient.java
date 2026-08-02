package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class ClassPassClient extends com.knotapi.knot.webview.KnotViewClient {
    public ClassPassClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getAndroidLoggedInUrl())) {
            this.knotView.finalStep();
        }
    }
}
