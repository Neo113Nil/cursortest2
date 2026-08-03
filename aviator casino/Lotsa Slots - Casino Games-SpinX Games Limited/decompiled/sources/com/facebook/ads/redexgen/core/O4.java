package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class O4 extends android.webkit.WebViewClient {
    public boolean A00 = false;
    public final com.facebook.ads.redexgen.core.C0908No A01;
    public final com.facebook.ads.redexgen.core.O3 A02;
    public final boolean A03;

    public O4(com.facebook.ads.redexgen.core.C0908No c0908No, com.facebook.ads.redexgen.core.O3 o3, boolean z) {
        this.A01 = c0908No;
        this.A02 = o3;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.AFF(com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        if (this.A02 != null) {
            this.A02.AFG();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.C1776j5(this), this.A01.A0F());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A03();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC1282ay.A0D(com.facebook.ads.redexgen.core.AbstractC1048Td.A2g);
        A00();
        return true;
    }
}
