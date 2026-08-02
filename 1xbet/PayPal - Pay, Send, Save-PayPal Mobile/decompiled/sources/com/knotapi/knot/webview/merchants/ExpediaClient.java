package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class ExpediaClient extends com.knotapi.knot.webview.KnotViewClient {
    public ExpediaClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        com.knotapi.knot.models.Bot bot = this.bot;
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        com.knotapi.knot.utilities.RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.knotapi.knot.utilities.SsoLoginHelper.processSSO(str, this.bot, this.knotView, this.ssoCookieHelper, null, false);
        this.knotView.listenToDOMChanges();
        this.knotView.trackNativeMerchantEvents();
        this.knotView.getMerchantViewListener().sendPageUrl(str);
        if (this.bot.hasCheckLoginScript()) {
            this.knotView.evaluateJavascript(this.bot.getCheckLoginScript(), null);
        }
        if (!this.bot.isPaymentUrlSet()) {
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            if (knotView.isUserLoggedIn(knotView.getUrl())) {
                this.knotView.getStorageDetails();
            }
        }
        if (str.equals(this.bot.getLoginUrl()) && this.bot.hasLoginScript()) {
            this.knotView.evaluateJavascript(this.bot.getLoginScript(), null);
        }
    }
}
