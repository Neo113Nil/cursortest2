package com.google.ads.mediation.inmobi.rtb;

/* loaded from: classes3.dex */
public class InMobiRtbBannerAd extends com.google.ads.mediation.inmobi.renderers.InMobiBannerAd {
    public InMobiRtbBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void loadAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtilsWrapper) {
        android.content.Context context = mediationBannerAdConfiguration.getContext();
        com.google.android.gms.ads.AdSize findClosestBannerSize = com.google.ads.mediation.inmobi.InMobiAdapterUtils.findClosestBannerSize(context, mediationBannerAdConfiguration.getAdSize(), mediationUtilsWrapper);
        if (findClosestBannerSize == null) {
            findClosestBannerSize = mediationBannerAdConfiguration.getAdSize();
        }
        createAndLoadBannerAd(context, findClosestBannerSize, mediationBannerAdConfiguration);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void internalLoadAd(com.google.ads.mediation.inmobi.InMobiBannerWrapper inMobiBannerWrapper, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiBannerWrapper.setExtras(build.getParameterMap());
        inMobiBannerWrapper.setKeywords(build.getKeywords());
        inMobiBannerWrapper.load(mediationBannerAdConfiguration.getBidResponse().getBytes());
    }
}
