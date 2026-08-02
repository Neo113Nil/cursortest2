package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class CalmClient extends com.knotapi.knot.webview.KnotViewClient {
    public static final java.lang.String TAG = "Knot:CalmClient";

    public CalmClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        try {
            if (str.startsWith(this.bot.getAndroidLoggedInUrl())) {
                com.knotapi.knot.models.Bot bot = this.bot;
                com.knotapi.knot.webview.KnotView knotView = this.knotView;
                com.knotapi.knot.utilities.RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, true);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!str.equals(this.bot.getLoginUrl()) || this.knotView.isLoggedIn) {
            this.knotView.showLoader();
        }
    }
}
