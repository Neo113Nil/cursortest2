package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class StarzClient extends com.knotapi.knot.webview.KnotViewClient {
    public StarzClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.contains("login")) {
            this.knotView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
            android.webkit.WebStorage.getInstance().deleteAllData();
        }
    }
}
