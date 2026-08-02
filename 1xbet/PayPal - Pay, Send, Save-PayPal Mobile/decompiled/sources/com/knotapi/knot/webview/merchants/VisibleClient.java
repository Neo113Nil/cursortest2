package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class VisibleClient extends com.knotapi.knot.webview.KnotViewClient {
    public VisibleClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    public java.lang.String getAdditionalUrl() {
        try {
            return this.bot.getAllSettings().get("additionalUrl").getAsString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        if (this.knotView.isUserLoggedIn(str) || str.equals(getAdditionalUrl()) || str.contains("/payment/getPaymentMethod")) {
            this.knotView.finalStep();
        }
    }
}
