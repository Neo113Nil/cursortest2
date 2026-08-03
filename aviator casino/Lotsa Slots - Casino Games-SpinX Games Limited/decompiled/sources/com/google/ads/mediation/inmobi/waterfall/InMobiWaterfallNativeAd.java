package com.google.ads.mediation.inmobi.waterfall;

/* loaded from: classes3.dex */
public class InMobiWaterfallNativeAd extends com.google.ads.mediation.inmobi.renderers.InMobiNativeAd {
    public InMobiWaterfallNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void loadAd() {
        final android.content.Context context = this.mediationNativeAdConfiguration.getContext();
        android.os.Bundle serverParameters = this.mediationNativeAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID);
        final long placementId = com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(serverParameters);
        com.google.android.gms.ads.AdError validateInMobiAdLoadParams = com.google.ads.mediation.inmobi.InMobiAdapterUtils.validateInMobiAdLoadParams(string, placementId);
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new com.google.ads.mediation.inmobi.InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd.this.createAndLoadNativeAd(context, placementId);
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, adError.toString());
                    if (com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd.this.mediationAdLoadCallback != null) {
                        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd.this.mediationAdLoadCallback.onFailure(adError);
                    }
                }
            });
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void internalLoadAd(com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(this.mediationNativeAdConfiguration.getContext(), this.mediationNativeAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiNativeWrapper.setExtras(build.getParameterMap());
        inMobiNativeWrapper.setKeywords(build.getKeywords());
        inMobiNativeWrapper.load();
    }
}
