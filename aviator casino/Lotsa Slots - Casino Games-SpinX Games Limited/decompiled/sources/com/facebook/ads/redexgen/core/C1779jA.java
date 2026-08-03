package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1779jA implements com.facebook.ads.redexgen.core.InterfaceC1034Sp {
    public final com.facebook.ads.redexgen.core.C0908No A00;
    public final com.facebook.ads.redexgen.core.O3 A01;
    public final com.facebook.ads.redexgen.core.C1042Sx A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final boolean A04;

    public C1779jA(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O3 o3, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C0908No c0908No, boolean z) {
        this.A03 = c1636gi;
        this.A01 = o3;
        this.A02 = c1042Sx;
        this.A00 = c0908No;
        this.A04 = z;
    }

    private final void A00() {
        android.webkit.WebView webView = new android.webkit.WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        com.facebook.ads.redexgen.core.O4 playableWebViewClient = new com.facebook.ads.redexgen.core.O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0G() == com.facebook.ads.redexgen.core.EnumC0909Np.A05) {
            A00();
            return;
        }
        java.lang.String A0L = this.A00.A0L();
        if (z) {
            com.facebook.ads.redexgen.core.C1042Sx c1042Sx = this.A02;
            java.lang.String markupUrlResult = this.A00.A0L();
            A0L = c1042Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(A0L);
        this.A01.AFG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADT() {
        A01(true);
    }
}
