package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class OI implements com.facebook.ads.RewardedVideoAdListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1749ib A00;

    public OI(com.facebook.ads.redexgen.core.C1749ib c1749ib) {
        this.A00 = c1749ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1731iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1731iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        com.facebook.ads.redexgen.core.NQ nq;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        this.A00.A00.A02 = null;
        nq = this.A00.A00.A03;
        ((com.facebook.ads.redexgen.core.AbstractC1801jd) nq).A2J(false);
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1731iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1731iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }
}
