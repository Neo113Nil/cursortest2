package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class CheggClient extends com.knotapi.knot.webview.KnotViewClient {
    private static final java.lang.String TAG = "Knot:CheggClient";

    public CheggClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        try {
            this.knotView.addCookies(str);
            this.ssoCookieHelper.saveCookiesForDomain(com.knotapi.knot.ui.activities.KnotActivity.activity, str);
            if (!this.knotView.isUserLoggedIn(webView.getUrl())) {
                this.knotView.hideLoader();
            } else if (this.bot.isPaymentUrlSet() && (webView.getUrl().contains("my/payments") || webView.getUrl().startsWith(this.bot.getPaymentUrl()))) {
                this.knotView.finalStep();
            } else {
                this.knotView.loginDone();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
