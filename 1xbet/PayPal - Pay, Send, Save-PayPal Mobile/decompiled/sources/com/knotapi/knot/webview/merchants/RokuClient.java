package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class RokuClient extends com.knotapi.knot.webview.KnotViewClient {
    public static final java.lang.String LOGO_CLICK = "(async () => {             var interval = setInterval(() => {\n              var anchorElement = document.querySelector('.mobile-nav-brand a');\n              if (anchorElement) {                   anchorElement.setAttribute('href', 'javascript:void(0)');\n              }\n            }, 50);\n })()";
    private static final java.lang.String TAG = "Knot:RokuClient";

    public RokuClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    public java.lang.String getCheckEmailLink() {
        try {
            return this.bot.getAllSettings().get("checkEmailLink").getAsString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            this.knotView.evaluateJavascript(LOGO_CLICK, null);
            if (str.startsWith(getCheckEmailLink())) {
                this.knotView.openLinkDialog(false);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
