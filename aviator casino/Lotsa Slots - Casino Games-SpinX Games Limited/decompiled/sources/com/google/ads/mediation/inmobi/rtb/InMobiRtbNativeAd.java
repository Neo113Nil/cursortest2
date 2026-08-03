package com.google.ads.mediation.inmobi.rtb;

/* loaded from: classes3.dex */
public class InMobiRtbNativeAd extends com.google.ads.mediation.inmobi.renderers.InMobiNativeAd {
    public InMobiRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void loadAd() {
        createAndLoadNativeAd(this.mediationNativeAdConfiguration.getContext(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(this.mediationNativeAdConfiguration.getServerParameters()));
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void internalLoadAd(com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(this.mediationNativeAdConfiguration.getContext(), this.mediationNativeAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiNativeWrapper.setExtras(build.getParameterMap());
        inMobiNativeWrapper.setKeywords(build.getKeywords());
        inMobiNativeWrapper.load(this.mediationNativeAdConfiguration.getBidResponse().getBytes());
    }
}
