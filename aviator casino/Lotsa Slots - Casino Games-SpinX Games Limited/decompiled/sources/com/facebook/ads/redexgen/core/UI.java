package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class UI implements java.util.concurrent.Callable<java.lang.String> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.T8 A00;

    public UI(com.facebook.ads.redexgen.core.T8 t8) {
        this.A00 = t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.String call() {
        java.lang.String browserUserAgent = com.facebook.ads.redexgen.core.UJ.A03.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        android.webkit.WebView webView = new android.webkit.WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new com.facebook.ads.redexgen.core.UH(this));
        java.lang.String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            com.facebook.ads.redexgen.core.UJ.A03.set(userAgentString);
        }
        return userAgentString;
    }
}
