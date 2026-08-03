package com.google.ads.mediation.vungle.rtb;

/* loaded from: classes3.dex */
public class VungleRtbBannerAd extends com.google.ads.mediation.vungle.renderers.VungleBannerAd implements com.vungle.ads.BannerAdListener {
    public VungleRtbBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleBannerAd
    protected void loadAd(com.vungle.ads.VungleBannerView vungleBannerView, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        java.lang.String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        java.lang.String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            vungleBannerView.getAdConfig().setWatermark(watermark);
        }
        vungleBannerView.load(bidResponse);
    }
}
