package com.google.ads.mediation.vungle.renderers;

/* compiled from: VungleAppOpenAd.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/google/ads/mediation/vungle/renderers/VungleAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/vungle/ads/InterstitialAdListener;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "vungleFactory", "Lcom/google/ads/mediation/vungle/VungleFactory;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "appOpenAd", "Lcom/vungle/ads/InterstitialAd;", "mediationAppOpenAdCallback", "render", "", "mediationAppOpenAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "getAdMarkup", "", "maybeAddWatermarkToVungleAdConfig", "adConfig", "Lcom/vungle/ads/AdConfig;", "showAd", "context", "Landroid/content/Context;", com.ironsource.Vf.j, "baseAd", "Lcom/vungle/ads/BaseAd;", "onAdStart", "onAdEnd", com.ironsource.Vf.f, com.ironsource.Vf.k, "onAdFailedToPlay", "adError", "Lcom/vungle/ads/VungleError;", "onAdFailedToLoad", "onAdImpression", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VungleAppOpenAd implements com.google.android.gms.ads.mediation.MediationAppOpenAd, com.vungle.ads.InterstitialAdListener {
    private com.vungle.ads.InterstitialAd appOpenAd;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;

    public abstract java.lang.String getAdMarkup(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void maybeAddWatermarkToVungleAdConfig(com.vungle.ads.AdConfig adConfig, com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    public VungleAppOpenAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public final void render(final com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        final android.os.Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediationExtras, "getMediationExtras(...)");
        android.os.Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        java.lang.String str2 = string2;
        if (str2 == null || str2.length() == 0) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
            this.mediationAdLoadCallback.onFailure(adError2);
        } else {
            final android.content.Context context = mediationAppOpenAdConfiguration.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.google.ads.mediation.vungle.VungleInitializer vungleInitializer = com.google.ads.mediation.vungle.VungleInitializer.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            vungleInitializer.initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.renderers.VungleAppOpenAd$render$1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.vungle.VungleFactory vungleFactory;
                    com.google.ads.mediation.vungle.VungleFactory vungleFactory2;
                    com.vungle.ads.InterstitialAd interstitialAd;
                    com.vungle.ads.InterstitialAd interstitialAd2;
                    com.vungle.ads.InterstitialAd interstitialAd3;
                    vungleFactory = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.vungleFactory;
                    com.vungle.ads.AdConfig createAdConfig = vungleFactory.createAdConfig();
                    if (mediationExtras.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION)) {
                        createAdConfig.setAdOrientation(mediationExtras.getInt(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION, 2));
                    }
                    if (mediationExtras.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_BACK_BUTTON_IMMEDIATELY_ENABLED)) {
                        createAdConfig.setBackButtonImmediatelyEnabled(mediationExtras.getBoolean(com.google.ads.mediation.vungle.VungleConstants.KEY_BACK_BUTTON_IMMEDIATELY_ENABLED, false));
                    }
                    com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.maybeAddWatermarkToVungleAdConfig(createAdConfig, mediationAppOpenAdConfiguration);
                    com.google.ads.mediation.vungle.renderers.VungleAppOpenAd vungleAppOpenAd = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this;
                    vungleFactory2 = vungleAppOpenAd.vungleFactory;
                    android.content.Context context2 = context;
                    java.lang.String str3 = string2;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                    vungleAppOpenAd.appOpenAd = vungleFactory2.createInterstitialAd(context2, str3, createAdConfig);
                    interstitialAd = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.appOpenAd;
                    com.vungle.ads.InterstitialAd interstitialAd4 = null;
                    if (interstitialAd == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                        interstitialAd = null;
                    }
                    interstitialAd.setAdListener(com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this);
                    interstitialAd2 = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.appOpenAd;
                    if (interstitialAd2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                        interstitialAd2 = null;
                    }
                    interstitialAd2.setAdapterAdFormat("VungleAppOpenAd");
                    interstitialAd3 = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.appOpenAd;
                    if (interstitialAd3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                    } else {
                        interstitialAd4 = interstitialAd3;
                    }
                    interstitialAd4.load(com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.getAdMarkup(mediationAppOpenAdConfiguration));
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(com.google.android.gms.ads.AdError error) {
                    com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                    android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, error.toString());
                    mediationAdLoadCallback = com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.this.mediationAdLoadCallback;
                    mediationAdLoadCallback.onFailure(error);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.vungle.ads.InterstitialAd interstitialAd = this.appOpenAd;
        com.vungle.ads.InterstitialAd interstitialAd2 = null;
        if (interstitialAd == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            interstitialAd = null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            com.vungle.ads.InterstitialAd interstitialAd3 = this.appOpenAd;
            if (interstitialAd3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.play(context);
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(107, "Failed to show app open ad from Liftoff Monetize.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.mediationAppOpenAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError adError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adError, "adError");
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(adError);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError adError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adError, "adError");
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(adError);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
        this.mediationAdLoadCallback.onFailure(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }
}
