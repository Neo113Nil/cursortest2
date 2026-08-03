package com.google.ads.mediation.fyber;

/* compiled from: DTExchangeNativeAdMapper.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u001a\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "mediationNativeAdCallback", "nativeAdSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "adContent", "Lcom/fyber/inneractive/sdk/external/NativeAdContent;", "loadAd", "", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "trackViews", "containerView", "Landroid/view/View;", "clickableAssetViews", "", "", "nonClickableAssetViews", "mapAssetNameToViewTag", "nativeAdAssetName", "reportErrorAndDestroy", "message", "errorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "mapNativeAd", "context", "Landroid/content/Context;", "nativeAdContent", "destroy", "NativeMappedImage", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DTExchangeNativeAdMapper extends com.google.android.gms.ads.mediation.NativeAdMapper {
    private static final com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.Companion Companion = new com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.Companion(null);
    private static final java.lang.String TAG = "DTExchangeNativeAdMapper";
    private com.fyber.inneractive.sdk.external.NativeAdContent adContent;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot nativeAdSpot;

    public DTExchangeNativeAdMapper(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> adLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.adLoadCallback = adLoadCallback;
    }

    public final void loadAd(final com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(com.google.ads.mediation.fyber.FyberMediationAdapter.MEDIATOR_NAME);
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
        java.lang.String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        com.fyber.inneractive.sdk.external.InneractiveAdSpot createSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
        com.fyber.inneractive.sdk.external.NativeAdUnitController createNativeAdUnitController = com.google.ads.mediation.fyber.FyberFactory.createNativeAdUnitController();
        com.fyber.inneractive.sdk.external.NativeAdVideoContentController createNativeAdVideoContentController = com.google.ads.mediation.fyber.FyberFactory.createNativeAdVideoContentController();
        createNativeAdVideoContentController.setEventsListener(new com.fyber.inneractive.sdk.external.VideoContentListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$1
            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            @kotlin.Deprecated(message = "Deprecated in Java")
            public void onPlayerError() {
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onProgress(int totalDurationInMsec, int positionInMsec) {
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onCompleted() {
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
                mediationNativeAdCallback = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onVideoComplete();
                }
            }
        });
        createNativeAdUnitController.addContentController(createNativeAdVideoContentController);
        createNativeAdUnitController.setEventsListener(new com.fyber.inneractive.sdk.external.NativeAdEventsListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$2
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSpot, "adSpot");
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                mediationNativeAdCallback = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onAdOpened();
                }
                mediationNativeAdCallback2 = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback2 != null) {
                    mediationNativeAdCallback2.reportAdImpression();
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                mediationNativeAdCallback = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.reportAdClicked();
                }
                mediationNativeAdCallback2 = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback2 != null) {
                    mediationNativeAdCallback2.onAdOpened();
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
                com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                mediationNativeAdCallback = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onAdLeftApplication();
                }
            }
        });
        createSpot.addUnitController(createNativeAdUnitController);
        createSpot.setRequestListener(new com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$3
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode errorCode) {
                com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.reportErrorAndDestroy("onInneractiveFailedAdRequest error: " + errorCode, errorCode);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
            public void onInneractiveSuccessfulNativeAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.NativeAdContent content) {
                com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback;
                if (content == null) {
                    com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this.reportErrorAndDestroy("content is NOT NativeAdContent", com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR);
                    return;
                }
                com.google.ads.mediation.fyber.DTExchangeNativeAdMapper dTExchangeNativeAdMapper = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this;
                android.content.Context context = mediationNativeAdConfiguration.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                dTExchangeNativeAdMapper.mapNativeAd(context, content);
                com.google.ads.mediation.fyber.DTExchangeNativeAdMapper dTExchangeNativeAdMapper2 = com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this;
                mediationAdLoadCallback = dTExchangeNativeAdMapper2.adLoadCallback;
                dTExchangeNativeAdMapper2.mediationNativeAdCallback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.this);
            }
        });
        com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(mediationNativeAdConfiguration.getMediationExtras());
        createSpot.loadAd(bidResponse);
        this.nativeAdSpot = createSpot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(android.view.View containerView, java.util.Map<java.lang.String, ? extends android.view.View> clickableAssetViews, java.util.Map<java.lang.String, ? extends android.view.View> nonClickableAssetViews) {
        com.fyber.inneractive.sdk.external.MediaView mediaView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        containerView.setTag("ROOT");
        com.fyber.inneractive.sdk.external.NativeAdContent nativeAdContent = this.adContent;
        if (nativeAdContent != null && (mediaView = nativeAdContent.getMediaView()) != null) {
            mediaView.setTag(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (java.util.Map.Entry<java.lang.String, ? extends android.view.View> entry : clickableAssetViews.entrySet()) {
            entry.getValue().setTag(mapAssetNameToViewTag(entry.getKey()));
        }
        com.fyber.inneractive.sdk.external.NativeAdContent nativeAdContent2 = this.adContent;
        if (nativeAdContent2 != 0) {
            nativeAdContent2.registerViewsForInteraction((android.view.ViewGroup) containerView, nativeAdContent2 != 0 ? nativeAdContent2.getMediaView() : null, null, clickableAssetViews.values());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final java.lang.String mapAssetNameToViewTag(java.lang.String nativeAdAssetName) {
        int hashCode = nativeAdAssetName.hashCode();
        if (hashCode != 1567014) {
            switch (hashCode) {
                case 1567006:
                    if (nativeAdAssetName.equals("3001")) {
                        return "TITLE";
                    }
                    break;
                case 1567007:
                    if (nativeAdAssetName.equals("3002")) {
                        return com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA;
                    }
                    break;
                case 1567008:
                    if (nativeAdAssetName.equals("3003")) {
                        return com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.AD_ICON;
                    }
                    break;
                case 1567009:
                    if (nativeAdAssetName.equals("3004")) {
                        return "DESCRIPTION";
                    }
                    break;
            }
        } else if (nativeAdAssetName.equals("3009")) {
            return com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.RATING;
        }
        return com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndDestroy(java.lang.String message, com.fyber.inneractive.sdk.external.InneractiveErrorCode errorCode) {
        android.util.Log.e(TAG, message);
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback = this.adLoadCallback;
        if (errorCode == null) {
            errorCode = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(errorCode));
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.nativeAdSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.nativeAdSpot = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mapNativeAd(android.content.Context context, com.fyber.inneractive.sdk.external.NativeAdContent nativeAdContent) {
        nativeAdContent.bindMediaView(new com.fyber.inneractive.sdk.external.MediaView(context));
        this.adContent = nativeAdContent;
        java.lang.String adTitle = nativeAdContent.getAdTitle();
        if (adTitle != null) {
            setHeadline(adTitle);
        }
        java.lang.String adDescription = nativeAdContent.getAdDescription();
        if (adDescription != null) {
            setBody(adDescription);
        }
        android.net.Uri appIcon = nativeAdContent.getAppIcon();
        if (appIcon != null) {
            setIcon(new com.google.ads.mediation.fyber.DTExchangeNativeAdMapper.NativeMappedImage(appIcon));
        }
        java.lang.String adCallToAction = nativeAdContent.getAdCallToAction();
        if (adCallToAction != null) {
            setCallToAction(adCallToAction);
        }
        com.fyber.inneractive.sdk.external.MediaView mediaView = nativeAdContent.getMediaView();
        if (mediaView != null) {
            setMediaView(mediaView);
        }
        if (nativeAdContent.getRating() != null) {
            setStarRating(java.lang.Double.valueOf(r3.floatValue()));
        }
        java.lang.Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        if (mediaAspectRatio != null) {
            setMediaContentAspectRatio(mediaAspectRatio.floatValue());
        }
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        super.destroy();
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.nativeAdSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.nativeAdSpot = null;
        com.fyber.inneractive.sdk.external.NativeAdContent nativeAdContent = this.adContent;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.adContent = null;
        this.mediationNativeAdCallback = null;
    }

    /* compiled from: DTExchangeNativeAdMapper.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper$NativeMappedImage;", "Lcom/google/android/gms/ads/nativead/NativeAd$Image;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getDrawable", "", "getUri", "getScale", "", "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NativeMappedImage extends com.google.android.gms.ads.nativead.NativeAd.Image {
        private final android.net.Uri uri;

        /* renamed from: getDrawable, reason: collision with other method in class */
        public java.lang.Void m5267getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public NativeMappedImage(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable() {
            return (android.graphics.drawable.Drawable) m5267getDrawable();
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public android.net.Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: DTExchangeNativeAdMapper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper$Companion;", "", "<init>", "()V", "TAG", "", "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
