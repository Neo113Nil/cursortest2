package com.google.ads.mediation.moloco;

/* compiled from: MolocoMediationAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0016J$\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0!H\u0016J$\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0!H\u0016J$\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u0002002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoMediationAdapter;", "Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;", "<init>", "()V", "bannerAd", "Lcom/google/ads/mediation/moloco/MolocoBannerAd;", "interstitialAd", "Lcom/google/ads/mediation/moloco/MolocoInterstitialAd;", "rewardedAd", "Lcom/google/ads/mediation/moloco/MolocoRewardedAd;", "nativeAd", "Lcom/google/ads/mediation/moloco/MolocoNativeAd;", "getSDKVersionInfo", "Lcom/google/android/gms/ads/VersionInfo;", "getVersionInfo", "configurePrivacy", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", "initializationCompleteCallback", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "mediationConfigurations", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "collectSignals", "signalData", "Lcom/google/android/gms/ads/mediation/rtb/RtbSignalData;", "callback", "Lcom/google/android/gms/ads/mediation/rtb/SignalCallbacks;", "loadRtbBannerAd", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "loadRtbInterstitialAd", "mediationInterstitialAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadRtbRewardedAd", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRtbNativeAdMapper", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MolocoMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.moloco";
    public static final int ERROR_CODE_AD_IS_NULL = 103;
    public static final int ERROR_CODE_MISSING_AD_UNIT = 102;
    public static final int ERROR_CODE_MISSING_APP_KEY = 101;
    public static final java.lang.String ERROR_MSG_AD_IS_NULL = "Moloco ad object returned was null.";
    public static final java.lang.String ERROR_MSG_MISSING_AD_UNIT = "Missing or invalid Ad Unit configured for this ad source instance in the AdMob or Ad Manager UI.";
    public static final java.lang.String ERROR_MSG_MISSING_APP_KEY = "Missing or invalid App Key configured for this ad source instance in the AdMob or Ad Manager UI.";
    public static final java.lang.String KEY_AD_UNIT_ID = "ad_unit_id";
    public static final java.lang.String KEY_APP_KEY = "app_key";
    public static final java.lang.String MEDIATION_PLATFORM_NAME = "AdMob";
    public static final java.lang.String SDK_ERROR_DOMAIN = "com.moloco.sdk";
    private com.google.ads.mediation.moloco.MolocoBannerAd bannerAd;
    private com.google.ads.mediation.moloco.MolocoInterstitialAd interstitialAd;
    private com.google.ads.mediation.moloco.MolocoNativeAd nativeAd;
    private com.google.ads.mediation.moloco.MolocoRewardedAd rewardedAd;
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.moloco.MolocoMediationAdapter.class).getSimpleName();

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        return new com.google.android.gms.ads.VersionInfo(4, 7, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.util.List emptyList;
        java.lang.String adapterVersion = com.google.ads.mediation.moloco.MolocoAdapterUtils.getAdapterVersion();
        java.util.List<java.lang.String> split = new kotlin.text.Regex("\\.").split(adapterVersion, 0);
        if (!split.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.lang.String[] strArr = (java.lang.String[]) emptyList.toArray(new java.lang.String[0]);
        if (strArr.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArr[0]), java.lang.Integer.parseInt(strArr[1]), (java.lang.Integer.parseInt(strArr[2]) * 100) + java.lang.Integer.parseInt(strArr[3]));
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", java.util.Arrays.copyOf(new java.lang.Object[]{adapterVersion}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        android.util.Log.w(TAG, format);
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    private final void configurePrivacy() {
        boolean z = true;
        if (com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() != 1 && com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForUnderAgeOfConsent() != 1) {
            z = false;
        }
        com.google.ads.mediation.moloco.MolocoAdapterUtils.setMolocoIsAgeRestricted(z);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<? extends com.google.android.gms.ads.mediation.MediationConfiguration> mediationConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationCompleteCallback, "initializationCompleteCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationConfigurations, "mediationConfigurations");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = mediationConfigurations.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((com.google.android.gms.ads.mediation.MediationConfiguration) it.next()).getServerParameters().getString(KEY_APP_KEY);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed(ERROR_MSG_MISSING_APP_KEY);
            return;
        }
        java.lang.String str2 = (java.lang.String) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            android.util.Log.w(TAG, "Multiple app_key entries found: " + arrayList2 + ". Using '" + str2 + "' to initialize the Moloco SDK");
        }
        com.moloco.sdk.publisher.Moloco.initialize(new com.moloco.sdk.publisher.init.MolocoInitParams(context, str2, new com.moloco.sdk.publisher.MediationInfo(MEDIATION_PLATFORM_NAME)), new com.moloco.sdk.publisher.MolocoInitializationListener() { // from class: com.google.ads.mediation.moloco.MolocoMediationAdapter$$ExternalSyntheticLambda1
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus) {
                com.google.ads.mediation.moloco.MolocoMediationAdapter.initialize$lambda$2(com.google.ads.mediation.moloco.MolocoMediationAdapter.this, initializationCompleteCallback, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$2(com.google.ads.mediation.moloco.MolocoMediationAdapter molocoMediationAdapter, com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, com.moloco.sdk.publisher.MolocoInitStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        if (status.getInitialization() == com.moloco.sdk.publisher.Initialization.SUCCESS) {
            molocoMediationAdapter.configurePrivacy();
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        initializationCompleteCallback.onInitializationFailed("Moloco SDK failed to initialize: " + status.getDescription() + ".");
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData signalData, final com.google.android.gms.ads.mediation.rtb.SignalCallbacks callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalData, "signalData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.moloco.sdk.publisher.MediationInfo mediationInfo = new com.moloco.sdk.publisher.MediationInfo(MEDIATION_PLATFORM_NAME);
        android.content.Context context = signalData.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.moloco.sdk.publisher.Moloco.getBidToken(mediationInfo, context, new com.moloco.sdk.publisher.MolocoBidTokenListener() { // from class: com.google.ads.mediation.moloco.MolocoMediationAdapter$$ExternalSyntheticLambda0
            @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
            public final void onBidTokenResult(java.lang.String str, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType) {
                com.google.ads.mediation.moloco.MolocoMediationAdapter.collectSignals$lambda$3(com.google.android.gms.ads.mediation.rtb.SignalCallbacks.this, str, errorType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectSignals$lambda$3(com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks, java.lang.String bidToken, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        if (errorType != null) {
            signalCallbacks.onFailure(new com.google.android.gms.ads.AdError(errorType.getErrorCode(), errorType.getDescription(), "com.moloco.sdk"));
        } else {
            signalCallbacks.onSuccess(bidToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object m5288newInstancegIAlus = com.google.ads.mediation.moloco.MolocoBannerAd.INSTANCE.m5288newInstancegIAlus(mediationBannerAdConfiguration, callback);
        if (kotlin.Result.m10805isSuccessimpl(m5288newInstancegIAlus)) {
            com.google.ads.mediation.moloco.MolocoBannerAd molocoBannerAd = (com.google.ads.mediation.moloco.MolocoBannerAd) m5288newInstancegIAlus;
            this.bannerAd = molocoBannerAd;
            if (molocoBannerAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerAd");
                molocoBannerAd = null;
            }
            molocoBannerAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object m5289newInstancegIAlus = com.google.ads.mediation.moloco.MolocoInterstitialAd.INSTANCE.m5289newInstancegIAlus(mediationInterstitialAdConfiguration, callback);
        if (kotlin.Result.m10805isSuccessimpl(m5289newInstancegIAlus)) {
            com.google.ads.mediation.moloco.MolocoInterstitialAd molocoInterstitialAd = (com.google.ads.mediation.moloco.MolocoInterstitialAd) m5289newInstancegIAlus;
            this.interstitialAd = molocoInterstitialAd;
            if (molocoInterstitialAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                molocoInterstitialAd = null;
            }
            molocoInterstitialAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object m5292newInstancegIAlus = com.google.ads.mediation.moloco.MolocoRewardedAd.INSTANCE.m5292newInstancegIAlus(mediationRewardedAdConfiguration, callback);
        if (kotlin.Result.m10805isSuccessimpl(m5292newInstancegIAlus)) {
            com.google.ads.mediation.moloco.MolocoRewardedAd molocoRewardedAd = (com.google.ads.mediation.moloco.MolocoRewardedAd) m5292newInstancegIAlus;
            this.rewardedAd = molocoRewardedAd;
            if (molocoRewardedAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                molocoRewardedAd = null;
            }
            molocoRewardedAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object m5290newInstancegIAlus = com.google.ads.mediation.moloco.MolocoNativeAd.INSTANCE.m5290newInstancegIAlus(mediationNativeAdConfiguration, callback);
        if (kotlin.Result.m10805isSuccessimpl(m5290newInstancegIAlus)) {
            com.google.ads.mediation.moloco.MolocoNativeAd molocoNativeAd = (com.google.ads.mediation.moloco.MolocoNativeAd) m5290newInstancegIAlus;
            this.nativeAd = molocoNativeAd;
            if (molocoNativeAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                molocoNativeAd = null;
            }
            molocoNativeAd.loadAd();
        }
    }
}
