package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC3095jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC3095jd abstractC3095jd) {
        this.A01 = cif;
        this.A00 = abstractC3095jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3040iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c3040iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3040iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c3040iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C18037j c18037j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        C18037j c18037j2;
        C18037j c18037j3;
        C18037j c18037j4;
        this.A01.A00.A04 = false;
        c18037j = this.A01.A00.A03;
        if (c18037j != null) {
            c18037j2 = this.A01.A00.A03;
            c18037j2.A0S(new C3047ih(this));
            c18037j3 = this.A01.A00.A03;
            c18037j3.A0N();
            c18037j4 = this.A01.A00.A03;
            c18037j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3040iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c3040iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
