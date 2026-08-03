package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements com.facebook.ads.InterstitialAdListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1801jd A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Cif A01;

    public OH(com.facebook.ads.redexgen.core.Cif cif, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        this.A01 = cif;
        this.A00 = abstractC1801jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1746iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1746iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1746iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1746iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        com.facebook.ads.redexgen.core.C05097j c05097j;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        com.facebook.ads.redexgen.core.C05097j c05097j2;
        com.facebook.ads.redexgen.core.C05097j c05097j3;
        com.facebook.ads.redexgen.core.C05097j c05097j4;
        this.A01.A00.A04 = false;
        c05097j = this.A01.A00.A03;
        if (c05097j != null) {
            c05097j2 = this.A01.A00.A03;
            c05097j2.A0S(new com.facebook.ads.redexgen.core.C1753ih(this));
            c05097j3 = this.A01.A00.A03;
            c05097j3.A0N();
            c05097j4 = this.A01.A00.A03;
            c05097j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1746iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1746iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
    }
}
