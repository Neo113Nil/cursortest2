package com.iab.omid.library.ironsrc.publisher;

/* loaded from: classes5.dex */
public class a extends com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher {
    public a(java.lang.String str, android.webkit.WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
