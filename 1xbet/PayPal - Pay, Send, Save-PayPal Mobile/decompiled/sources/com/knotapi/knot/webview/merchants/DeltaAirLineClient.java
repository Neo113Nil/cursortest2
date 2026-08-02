package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class DeltaAirLineClient extends com.knotapi.knot.webview.KnotViewClient {
    public DeltaAirLineClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.knotView.addCookies(str);
        this.ssoCookieHelper.saveCookiesForDomain(com.knotapi.knot.ui.activities.KnotActivity.activity, str);
        if (!this.knotView.isUserLoggedIn(str)) {
            this.knotView.hideLoader();
            return;
        }
        this.knotView.loginDone();
        if (this.bot.isPaymentUrlSet()) {
            if (this.bot.paymentUrlSameAs(str) || str.equals(this.bot.getLoggedInUrl())) {
                this.knotView.finalStep();
            }
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getLoginUrl())) {
            this.knotView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
            android.webkit.WebStorage.getInstance().deleteAllData();
        }
    }
}
