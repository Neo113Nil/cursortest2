package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0622Ne implements RewardedVideoAdListener {
    public final /* synthetic */ C1373gy A00;

    public C0622Ne(C1373gy c1373gy) {
        this.A00 = c1373gy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1361gm c1361gm;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        c1361gm = this.A00.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1361gm.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        AbstractC0606Mo abstractC0606Mo;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1361gm c1361gm;
        this.A00.A00.A03 = null;
        abstractC0606Mo = this.A00.A00.A04;
        ((AbstractC1428hy) abstractC0606Mo).A2A(false);
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        c1361gm = this.A00.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1361gm.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }
}
