package com.google.ads.mediation.inmobi.rtb;

/* loaded from: classes3.dex */
public class InMobiRtbInterstitialAd extends com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd {
    public InMobiRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void loadAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        createAndLoadInterstitialAd(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    protected void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiInterstitialWrapper.setExtras(build.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(build.getKeywords());
        inMobiInterstitialWrapper.load(mediationInterstitialAdConfiguration.getBidResponse().getBytes());
    }
}
