package com.google.ads.mediation.moloco;

/* compiled from: MolocoNativeAd.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002&'B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J8\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0#H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoNativeAd;", "Lcom/moloco/sdk/publisher/AdLoad$Listener;", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "adUnitId", "", "bidResponse", "watermark", "mediationNativeAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "nativeAd", "Lcom/moloco/sdk/publisher/NativeAd;", "getNativeAd$moloco_release$annotations", "()V", "getNativeAd$moloco_release", "()Lcom/moloco/sdk/publisher/NativeAd;", "setNativeAd$moloco_release", "(Lcom/moloco/sdk/publisher/NativeAd;)V", "loadAd", "", "onAdLoadSuccess", "molocoAd", "Lcom/moloco/sdk/publisher/MolocoAd;", com.ironsource.Vf.b, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", "handleClick", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "recordImpression", "trackViews", "containerView", "clickableAssetViews", "", "nonClickableAssetViews", "destroy", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MolocoNativeMappedImage", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MolocoNativeAd extends com.google.android.gms.ads.mediation.NativeAdMapper implements com.moloco.sdk.publisher.AdLoad.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.moloco.MolocoNativeAd.Companion INSTANCE = new com.google.ads.mediation.moloco.MolocoNativeAd.Companion(null);
    public static final java.lang.String MEDIA_VIEW_TAG = "native_ad_media_view";
    private final java.lang.String adUnitId;
    private final java.lang.String bidResponse;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationNativeAdLoadCallback;
    private com.moloco.sdk.publisher.NativeAd nativeAd;
    private final java.lang.String watermark;

    public /* synthetic */ MolocoNativeAd(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, mediationAdLoadCallback);
    }

    public static /* synthetic */ void getNativeAd$moloco_release$annotations() {
    }

    private MolocoNativeAd(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        this.adUnitId = str;
        this.bidResponse = str2;
        this.watermark = str3;
        this.mediationNativeAdLoadCallback = mediationAdLoadCallback;
    }

    /* renamed from: getNativeAd$moloco_release, reason: from getter */
    public final com.moloco.sdk.publisher.NativeAd getNativeAd() {
        return this.nativeAd;
    }

    public final void setNativeAd$moloco_release(com.moloco.sdk.publisher.NativeAd nativeAd) {
        this.nativeAd = nativeAd;
    }

    public final void loadAd() {
        com.moloco.sdk.publisher.Moloco.createNativeAd(new com.moloco.sdk.publisher.MediationInfo(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME), this.adUnitId, this.watermark, new kotlin.jvm.functions.Function2() { // from class: com.google.ads.mediation.moloco.MolocoNativeAd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit loadAd$lambda$0;
                loadAd$lambda$0 = com.google.ads.mediation.moloco.MolocoNativeAd.loadAd$lambda$0(com.google.ads.mediation.moloco.MolocoNativeAd.this, (com.moloco.sdk.publisher.NativeAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return loadAd$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit loadAd$lambda$0(com.google.ads.mediation.moloco.MolocoNativeAd molocoNativeAd, com.moloco.sdk.publisher.NativeAd nativeAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        com.google.android.gms.ads.AdError adError;
        if (nativeAd == null) {
            if (adCreateError != null) {
                adError = new com.google.android.gms.ads.AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk");
            } else {
                adError = new com.google.android.gms.ads.AdError(103, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, "com.google.ads.mediation.moloco");
            }
            molocoNativeAd.mediationNativeAdLoadCallback.onFailure(adError);
            return kotlin.Unit.INSTANCE;
        }
        molocoNativeAd.nativeAd = nativeAd;
        if (nativeAd != null) {
            nativeAd.load(molocoNativeAd.bidResponse, molocoNativeAd);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        com.moloco.sdk.publisher.NativeAd.Assets assets;
        android.graphics.drawable.Drawable createFromPath;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        setOverrideClickHandling(true);
        com.moloco.sdk.publisher.NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null && (assets = nativeAd.getAssets()) != null) {
            if (assets.getRating() != null) {
                setStarRating(java.lang.Double.valueOf(r0.floatValue()));
            }
            java.lang.String sponsorText = assets.getSponsorText();
            if (sponsorText != null) {
                setAdvertiser(sponsorText);
            }
            setStore("Google Play");
            java.lang.String title = assets.getTitle();
            if (title != null) {
                setHeadline(title);
            }
            java.lang.String description = assets.getDescription();
            if (description != null) {
                setBody(description);
            }
            java.lang.String callToActionText = assets.getCallToActionText();
            if (callToActionText != null) {
                setCallToAction(callToActionText);
            }
            android.net.Uri iconUri = assets.getIconUri();
            if (iconUri != null && (createFromPath = android.graphics.drawable.Drawable.createFromPath(iconUri.toString())) != null) {
                setIcon(new com.google.ads.mediation.moloco.MolocoNativeAd.MolocoNativeMappedImage(createFromPath, null, 0.0d, 6, null));
            }
            android.view.View mediaView = assets.getMediaView();
            if (mediaView != null) {
                mediaView.setTag(MEDIA_VIEW_TAG);
                setMediaView(mediaView);
            }
        }
        com.google.android.gms.ads.mediation.MediationNativeAdCallback onSuccess = this.mediationNativeAdLoadCallback.onSuccess(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onSuccess, "onSuccess(...)");
        final com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = onSuccess;
        com.moloco.sdk.publisher.NativeAd nativeAd2 = this.nativeAd;
        if (nativeAd2 != null) {
            nativeAd2.setInteractionListener(new com.moloco.sdk.publisher.NativeAd.InteractionListener() { // from class: com.google.ads.mediation.moloco.MolocoNativeAd$onAdLoadSuccess$2
                @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
                public void onImpressionHandled() {
                }

                @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
                public void onGeneralClickHandled() {
                    com.google.android.gms.ads.mediation.MediationNativeAdCallback.this.reportAdClicked();
                }
            });
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.mediationNativeAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void handleClick(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.moloco.sdk.publisher.NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.handleGeneralAdClick();
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void recordImpression() {
        com.moloco.sdk.publisher.NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.handleImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackViews$lambda$11(com.google.ads.mediation.moloco.MolocoNativeAd molocoNativeAd, android.view.View view) {
        com.moloco.sdk.publisher.NativeAd nativeAd = molocoNativeAd.nativeAd;
        if (nativeAd != null) {
            nativeAd.handleGeneralAdClick();
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(android.view.View containerView, java.util.Map<java.lang.String, android.view.View> clickableAssetViews, java.util.Map<java.lang.String, android.view.View> nonClickableAssetViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        containerView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.ads.mediation.moloco.MolocoNativeAd$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.ads.mediation.moloco.MolocoNativeAd.trackViews$lambda$11(com.google.ads.mediation.moloco.MolocoNativeAd.this, view);
            }
        });
        java.util.Iterator<android.view.View> it = clickableAssetViews.values().iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.ads.mediation.moloco.MolocoNativeAd$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.ads.mediation.moloco.MolocoNativeAd.trackViews$lambda$13$lambda$12(com.google.ads.mediation.moloco.MolocoNativeAd.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackViews$lambda$13$lambda$12(com.google.ads.mediation.moloco.MolocoNativeAd molocoNativeAd, android.view.View view) {
        com.moloco.sdk.publisher.NativeAd nativeAd = molocoNativeAd.nativeAd;
        if (nativeAd != null) {
            nativeAd.handleGeneralAdClick();
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        com.moloco.sdk.publisher.NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.nativeAd = null;
    }

    /* compiled from: MolocoNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoNativeAd$Companion;", "", "<init>", "()V", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/moloco/MolocoNativeAd;", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "mediationNativeAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "MEDIA_VIEW_TAG", "", "getMEDIA_VIEW_TAG$annotations", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMEDIA_VIEW_TAG$annotations() {
        }

        private Companion() {
        }

        /* renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m5290newInstancegIAlus(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationNativeAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdLoadCallback, "mediationNativeAdLoadCallback");
            android.os.Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_MISSING_AD_UNIT, "com.google.ads.mediation.moloco");
                mediationNativeAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            java.lang.String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
            java.lang.String watermark = mediationNativeAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "getWatermark(...)");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(new com.google.ads.mediation.moloco.MolocoNativeAd(string, bidResponse, watermark, mediationNativeAdLoadCallback, null));
        }
    }

    /* compiled from: MolocoNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoNativeAd$MolocoNativeMappedImage;", "Lcom/google/android/gms/ads/nativead/NativeAd$Image;", "drawable", "Landroid/graphics/drawable/Drawable;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "scale", "", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V", "getScale", "getDrawable", "getUri", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MolocoNativeMappedImage extends com.google.android.gms.ads.nativead.NativeAd.Image {
        private final android.graphics.drawable.Drawable drawable;
        private final double scale;
        private final android.net.Uri uri;

        public /* synthetic */ MolocoNativeMappedImage(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(drawable, (i & 2) != 0 ? android.net.Uri.EMPTY : uri, (i & 4) != 0 ? 1.0d : d);
        }

        public MolocoNativeMappedImage(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            this.drawable = drawable;
            this.uri = uri;
            this.scale = d;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return this.scale;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public android.net.Uri getUri() {
            return this.uri;
        }
    }
}
