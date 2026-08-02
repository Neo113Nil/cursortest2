package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class NotionClient extends com.knotapi.knot.webview.KnotViewClient {
    public NotionClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        if (str.equals("https://www.notion.so/login")) {
            this.knotView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
            android.webkit.WebStorage.getInstance().deleteAllData();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        this.knotView.getMerchantViewListener().sendRunningEvent("{}", "{}");
    }
}
