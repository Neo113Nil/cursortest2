package com.google.android.gms.ads.mediation.rtb;

import L2.a;
import L2.c;
import L2.g;
import L2.h;
import L2.l;
import L2.n;
import L2.q;
import N2.b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(N2.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, c cVar) {
        loadAppOpenAd(gVar, cVar);
    }

    public void loadRtbBannerAd(h hVar, c cVar) {
        loadBannerAd(hVar, cVar);
    }

    public void loadRtbInterstitialAd(l lVar, c cVar) {
        loadInterstitialAd(lVar, cVar);
    }

    @Deprecated
    public void loadRtbNativeAd(n nVar, c cVar) {
        loadNativeAd(nVar, cVar);
    }

    public void loadRtbNativeAdMapper(n nVar, c cVar) {
        loadNativeAdMapper(nVar, cVar);
    }

    public void loadRtbRewardedAd(q qVar, c cVar) {
        loadRewardedAd(qVar, cVar);
    }

    public void loadRtbRewardedInterstitialAd(q qVar, c cVar) {
        loadRewardedInterstitialAd(qVar, cVar);
    }
}
