package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3073jA implements InterfaceC2328Sp {
    public final C2202No A00;
    public final O3 A01;
    public final C2336Sx A02;
    public final C2930gi A03;
    public final boolean A04;

    public C3073jA(C2930gi c2930gi, O3 o3, C2336Sx c2336Sx, C2202No c2202No, boolean z) {
        this.A03 = c2930gi;
        this.A01 = o3;
        this.A02 = c2336Sx;
        this.A00 = c2202No;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0G() == EnumC2203Np.A05) {
            A00();
            return;
        }
        String A0L = this.A00.A0L();
        if (z) {
            C2336Sx c2336Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            A0L = c2336Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(A0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADT() {
        A01(true);
    }
}
