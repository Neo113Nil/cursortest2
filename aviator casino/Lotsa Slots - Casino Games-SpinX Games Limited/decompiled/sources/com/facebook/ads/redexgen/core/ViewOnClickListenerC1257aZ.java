package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1257aZ implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.M8 A00;

    public ViewOnClickListenerC1257aZ(com.facebook.ads.redexgen.core.M8 m8) {
        this.A00 = m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.webkit.WebView webView;
        android.webkit.WebView webView2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A07;
            if (webView.canGoBack()) {
                webView2 = this.A00.A07;
                webView2.goBack();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
