package com.google.ads.mediation.inmobi.waterfall;

/* loaded from: classes3.dex */
public class InMobiWaterfallBannerAd extends com.google.ads.mediation.inmobi.renderers.InMobiBannerAd {
    public InMobiWaterfallBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void loadAd(final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtilsWrapper) {
        final android.content.Context context = mediationBannerAdConfiguration.getContext();
        final com.google.android.gms.ads.AdSize findClosestBannerSize = com.google.ads.mediation.inmobi.InMobiAdapterUtils.findClosestBannerSize(context, mediationBannerAdConfiguration.getAdSize(), mediationUtilsWrapper);
        if (findClosestBannerSize == null) {
            com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(102, java.lang.String.format("The requested banner size: %s is not supported by InMobi SDK.", mediationBannerAdConfiguration.getAdSize()));
            android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
            this.mediationAdLoadCallback.onFailure(createAdapterError);
            return;
        }
        android.os.Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID);
        com.google.android.gms.ads.AdError validateInMobiAdLoadParams = com.google.ads.mediation.inmobi.InMobiAdapterUtils.validateInMobiAdLoadParams(string, com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(serverParameters));
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new com.google.ads.mediation.inmobi.InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd.this.createAndLoadBannerAd(context, findClosestBannerSize, mediationBannerAdConfiguration);
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, adError.toString());
                    com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd.this.mediationAdLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void internalLoadAd(com.google.ads.mediation.inmobi.InMobiBannerWrapper inMobiBannerWrapper, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiBannerWrapper.setExtras(build.getParameterMap());
        inMobiBannerWrapper.setKeywords(build.getKeywords());
        inMobiBannerWrapper.load();
    }
}
