package com.google.ads.mediation.moloco;

/* compiled from: MolocoBannerAd.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB=\b\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u001aH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/moloco/sdk/publisher/AdLoad$Listener;", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", com.ironsource.X3.i.O, "Lcom/google/android/gms/ads/AdSize;", "adUnitId", "", "bidResponse", "watermark", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/android/gms/ads/AdSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "molocoAd", "Lcom/moloco/sdk/publisher/Banner;", "bannerAdCallback", "loadAd", "", "getView", "Landroid/view/View;", com.ironsource.Vf.b, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", "onAdLoadSuccess", "Lcom/moloco/sdk/publisher/MolocoAd;", com.ironsource.Vf.f, "onAdHidden", com.ironsource.Vf.e, "onAdShowSuccess", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MolocoBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.moloco.sdk.publisher.AdLoad.Listener, com.moloco.sdk.publisher.BannerAdShowListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.moloco.MolocoBannerAd.Companion INSTANCE = new com.google.ads.mediation.moloco.MolocoBannerAd.Companion(null);
    private final com.google.android.gms.ads.AdSize adSize;
    private final java.lang.String adUnitId;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private final java.lang.String bidResponse;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private com.moloco.sdk.publisher.Banner molocoAd;
    private final java.lang.String watermark;

    public /* synthetic */ MolocoBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, com.google.android.gms.ads.AdSize adSize, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mediationAdLoadCallback, adSize, str, str2, str3);
    }

    private MolocoBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.android.gms.ads.AdSize adSize, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.adSize = adSize;
        this.adUnitId = str;
        this.bidResponse = str2;
        this.watermark = str3;
    }

    public final void loadAd() {
        kotlin.jvm.functions.Function2<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<com.moloco.sdk.publisher.Banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError, kotlin.Unit>() { // from class: com.google.ads.mediation.moloco.MolocoBannerAd$loadAd$createBannerCallback$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
                invoke2(banner, adCreateError);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError molocoError) {
                com.moloco.sdk.publisher.Banner banner2;
                com.moloco.sdk.publisher.Banner banner3;
                java.lang.String str;
                com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback;
                com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback2;
                if (molocoError != null) {
                    com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(molocoError.getErrorCode(), molocoError.getDescription(), "com.moloco.sdk");
                    mediationAdLoadCallback2 = com.google.ads.mediation.moloco.MolocoBannerAd.this.mediationAdLoadCallback;
                    mediationAdLoadCallback2.onFailure(adError);
                    return;
                }
                if (banner != null) {
                    com.google.ads.mediation.moloco.MolocoBannerAd.this.molocoAd = banner;
                    banner2 = com.google.ads.mediation.moloco.MolocoBannerAd.this.molocoAd;
                    com.moloco.sdk.publisher.Banner banner4 = null;
                    if (banner2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("molocoAd");
                        banner2 = null;
                    }
                    banner2.setAdShowListener(com.google.ads.mediation.moloco.MolocoBannerAd.this);
                    banner3 = com.google.ads.mediation.moloco.MolocoBannerAd.this.molocoAd;
                    if (banner3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("molocoAd");
                    } else {
                        banner4 = banner3;
                    }
                    str = com.google.ads.mediation.moloco.MolocoBannerAd.this.bidResponse;
                    banner4.load(str, com.google.ads.mediation.moloco.MolocoBannerAd.this);
                    return;
                }
                com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(103, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, "com.google.ads.mediation.moloco");
                mediationAdLoadCallback = com.google.ads.mediation.moloco.MolocoBannerAd.this.mediationAdLoadCallback;
                mediationAdLoadCallback.onFailure(adError2);
            }
        };
        com.moloco.sdk.publisher.MediationInfo mediationInfo = new com.moloco.sdk.publisher.MediationInfo(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME);
        com.google.android.gms.ads.AdSize adSize = this.adSize;
        if (kotlin.jvm.internal.Intrinsics.areEqual(adSize, com.google.android.gms.ads.AdSize.LEADERBOARD)) {
            com.moloco.sdk.publisher.Moloco.createBannerTablet(mediationInfo, this.adUnitId, this.watermark, function2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(adSize, com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE)) {
            com.moloco.sdk.publisher.Moloco.createMREC(mediationInfo, this.adUnitId, this.watermark, function2);
        } else {
            com.moloco.sdk.publisher.Moloco.createBanner(mediationInfo, this.adUnitId, this.watermark, function2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        com.moloco.sdk.publisher.Banner banner = this.molocoAd;
        if (banner == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("molocoAd");
            banner = null;
        }
        return banner;
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.bannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    /* compiled from: MolocoBannerAd.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoBannerAd$Companion;", "", "<init>", "()V", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/moloco/MolocoBannerAd;", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m5288newInstancegIAlus(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
            android.os.Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
            com.google.android.gms.ads.AdSize adSize = mediationBannerAdConfiguration.getAdSize();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSize, "getAdSize(...)");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_MISSING_AD_UNIT, "com.google.ads.mediation.moloco");
                mediationAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            java.lang.String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
            java.lang.String watermark = mediationBannerAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "getWatermark(...)");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(new com.google.ads.mediation.moloco.MolocoBannerAd(mediationAdLoadCallback, adSize, string, bidResponse, watermark, null));
        }
    }
}
