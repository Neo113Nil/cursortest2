package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class FigmaClient extends com.knotapi.knot.webview.KnotViewClient {
    public FigmaClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setDomain("www.figma.com");
        buildCookie.setHttpOnly(true);
        buildCookie.setSecure(true);
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.startsWith("https://www.figma.com/files/recents-and-sharing/recently-viewed")) {
            this.knotView.showLoader();
        }
    }
}
