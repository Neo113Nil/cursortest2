package com.google.ads.mediation.inmobi.waterfall;

/* loaded from: classes3.dex */
public class InMobiWaterfallInterstitialAd extends com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd {
    public InMobiWaterfallInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void loadAd(final com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        final android.content.Context context = mediationInterstitialAdConfiguration.getContext();
        android.os.Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID);
        com.google.android.gms.ads.AdError validateInMobiAdLoadParams = com.google.ads.mediation.inmobi.InMobiAdapterUtils.validateInMobiAdLoadParams(string, com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(serverParameters));
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new com.google.ads.mediation.inmobi.InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd.this.createAndLoadInterstitialAd(context, mediationInterstitialAdConfiguration);
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, adError.toString());
                    if (com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd.this.mediationAdLoadCallback != null) {
                        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd.this.mediationAdLoadCallback.onFailure(adError);
                    }
                }
            });
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    protected void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiInterstitialWrapper.setExtras(build.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(build.getKeywords());
        inMobiInterstitialWrapper.load();
    }
}
