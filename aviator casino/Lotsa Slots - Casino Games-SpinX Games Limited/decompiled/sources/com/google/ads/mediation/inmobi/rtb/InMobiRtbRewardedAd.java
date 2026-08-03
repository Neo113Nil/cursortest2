package com.google.ads.mediation.inmobi.rtb;

/* loaded from: classes3.dex */
public class InMobiRtbRewardedAd extends com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd {
    public InMobiRtbRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    public void loadAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        createAndLoadRewardAd(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    protected void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiInterstitialWrapper.setExtras(build.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(build.getKeywords());
        inMobiInterstitialWrapper.load(mediationRewardedAdConfiguration.getBidResponse().getBytes());
    }
}
