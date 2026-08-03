package com.google.ads.mediation.inmobi.waterfall;

/* loaded from: classes3.dex */
public class InMobiWaterfallRewardedAd extends com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd {
    public InMobiWaterfallRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    public void loadAd(final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        final android.content.Context context = mediationRewardedAdConfiguration.getContext();
        android.os.Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID);
        com.google.android.gms.ads.AdError validateInMobiAdLoadParams = com.google.ads.mediation.inmobi.InMobiAdapterUtils.validateInMobiAdLoadParams(string, com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(serverParameters));
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new com.google.ads.mediation.inmobi.InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd.this.createAndLoadRewardAd(context, mediationRewardedAdConfiguration);
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, adError.toString());
                    if (com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd.this.mediationAdLoadCallback != null) {
                        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd.this.mediationAdLoadCallback.onFailure(adError);
                    }
                }
            });
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    protected void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiInterstitialWrapper.setExtras(build.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(build.getKeywords());
        inMobiInterstitialWrapper.load();
    }
}
