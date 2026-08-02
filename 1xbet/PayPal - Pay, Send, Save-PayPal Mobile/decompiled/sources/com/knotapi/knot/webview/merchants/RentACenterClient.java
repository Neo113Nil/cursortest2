package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class RentACenterClient extends com.knotapi.knot.webview.KnotViewClient {
    private static final java.lang.String TAG = "Knot:RentACenterClient";

    public RentACenterClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        try {
            this.knotView.addCookies(str);
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            knotView.performAllBulkActions(knotView, false);
            this.knotView.defaultAction(webView);
            if (this.knotView.isUserLoggedIn(webView.getUrl())) {
                com.knotapi.knot.webview.KnotView knotView2 = this.knotView;
                if (knotView2.showErrorPage) {
                    knotView2.hideLoader();
                } else {
                    knotView2.showLoader();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
