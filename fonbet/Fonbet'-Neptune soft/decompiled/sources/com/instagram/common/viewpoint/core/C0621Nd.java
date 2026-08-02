package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0621Nd implements InterstitialAdListener {
    public final /* synthetic */ AbstractC1428hy A00;
    public final /* synthetic */ C1378h4 A01;

    public C0621Nd(C1378h4 c1378h4, AbstractC1428hy abstractC1428hy) {
        this.A01 = c1378h4;
        this.A00 = abstractC1428hy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1370gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1370gv.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        this.A01.A00.A01 = null;
        this.A00.A2A(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1370gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1370gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C02186y c02186y;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        C02186y c02186y2;
        C02186y c02186y3;
        C02186y c02186y4;
        this.A01.A00.A04 = false;
        c02186y = this.A01.A00.A03;
        if (c02186y != null) {
            c02186y2 = this.A01.A00.A03;
            c02186y2.A0S(new C1380h6(this));
            c02186y3 = this.A01.A00.A03;
            c02186y3.A0N();
            c02186y4 = this.A01.A00.A03;
            c02186y4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1370gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1370gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
