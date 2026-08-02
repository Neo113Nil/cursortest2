package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class SiriusXMClient extends com.knotapi.knot.webview.KnotViewClient {
    public SiriusXMClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public boolean isUserLoggedIn(java.lang.String str) {
        if (str.contains("/accountcenter")) {
            if (this.knotView.isLoggedIn) {
                return true;
            }
            boolean equals = str.equals(this.bot.getAndroidLoggedInUrl());
            if (equals) {
                this.knotView.loginDone();
            }
            return equals;
        }
        if (this.knotView.isLoggedIn) {
            return true;
        }
        if (this.bot.loggedInUrlSameAs(str) && this.bot.hasLoggedInPredicate()) {
            return com.knotapi.knot.utilities.CookiePredicate.isUserLoggedIn(this.bot, this.knotView.getCookies()).booleanValue();
        }
        return false;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        if (str.contains("/accountcenter") && this.knotView.isUserLoggedIn(str)) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.finalStep();
        }
    }
}
