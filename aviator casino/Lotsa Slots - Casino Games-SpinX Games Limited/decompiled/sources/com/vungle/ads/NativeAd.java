package com.vungle.ads;

/* compiled from: NativeAd.kt */
@kotlin.Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0019\u0018\u0000 D2\u00020\u0001:\u0002CDB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u0010-\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\r\u00102\u001a\u0004\u0018\u000103¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0005J\u0006\u00107\u001a\u000208J\b\u00109\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020;J\u0006\u0010=\u001a\u00020>J0\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eJ\u0006\u0010B\u001a\u00020>R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006E"}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "adContentView", "Lcom/vungle/ads/internal/ui/view/MediaView;", "adIconView", "Landroid/widget/ImageView;", "adOptionsPosition", "", "getAdOptionsPosition$annotations", "()V", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "adOptionsView", "Lcom/vungle/ads/internal/ui/view/NativeAdOptionsView;", "adPlayCallback", "com/vungle/ads/NativeAd$adPlayCallback$1", "Lcom/vungle/ads/NativeAd$adPlayCallback$1;", "adRootView", "Landroid/widget/FrameLayout;", "clickableViews", "", "Landroid/view/View;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayCount", "nativeAdInternal", "Lcom/vungle/ads/internal/NativeAdInternal;", "nativeDisplayDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "getNativeDisplayDurationMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "videoOptions", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "getAdBodyText", "getAdCallToActionText", "getAdSponsoredText", "getAdStarRating", "", "()Ljava/lang/Double;", "getAdTitle", "getAppIcon", "getMediaAspectRatio", "", "getMediaView", "hasCallToAction", "", "hasVideoContent", "performCTA", "", "registerViewForInteraction", "rootView", "mediaView", "unregisterView", "AdOptionsPosition", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAd extends com.vungle.ads.BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    private static final java.lang.String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private com.vungle.ads.internal.ui.view.MediaView adContentView;
    private android.widget.ImageView adIconView;
    private int adOptionsPosition;
    private com.vungle.ads.internal.ui.view.NativeAdOptionsView adOptionsView;
    private final com.vungle.ads.NativeAd$adPlayCallback$1 adPlayCallback;
    private android.widget.FrameLayout adRootView;
    private java.util.Collection<? extends android.view.View> clickableViews;
    private final java.util.concurrent.atomic.AtomicBoolean destroyed;
    private int displayCount;
    private final com.vungle.ads.internal.NativeAdInternal nativeAdInternal;
    private final com.vungle.ads.TimeIntervalMetric nativeDisplayDurationMetric;

    /* compiled from: NativeAd.kt */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    @com.vungle.ads.NativeAd.AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(android.content.Context context, java.lang.String str, com.vungle.ads.AdConfig adConfig) {
        super(context, str, adConfig);
        this.adOptionsPosition = 1;
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.nativeAdInternal = (com.vungle.ads.internal.NativeAdInternal) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.adPlayCallback = new com.vungle.ads.internal.presenter.AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(java.lang.String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(java.lang.String id) {
                com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.PLAYING);
                com.vungle.ads.NativeAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), com.vungle.ads.NativeAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.NativeAd.this.getPresentToDisplayMetric().markStart();
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(com.vungle.ads.NativeAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(java.lang.String id) {
                com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED);
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(com.vungle.ads.NativeAd.this);
                        }
                    }
                });
                com.vungle.ads.NativeAd.this.getPresentToDisplayMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.NativeAd.this.getPresentToDisplayMetric(), com.vungle.ads.NativeAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.NativeAd.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(java.lang.String id) {
                if (com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
                    com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.READY);
                }
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(com.vungle.ads.NativeAd.this);
                        }
                    }
                });
                com.vungle.ads.NativeAd.this.getShowToCloseMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.NativeAd.this.getShowToCloseMetric(), com.vungle.ads.NativeAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(com.vungle.ads.NativeAd.this);
                        }
                    }
                });
                com.vungle.ads.NativeAd.this.getDisplayToClickMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.NativeAd.this.getDisplayToClickMetric(), com.vungle.ads.NativeAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(com.vungle.ads.NativeAd.this);
                        }
                    }
                });
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.NativeAd.this.getLeaveApplicationMetric(), com.vungle.ads.NativeAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.NativeAd.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.NativeAd nativeAd = com.vungle.ads.NativeAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(com.vungle.ads.NativeAd.this, error);
                        }
                    }
                });
                com.vungle.ads.NativeAd.this.getShowToFailMetric().markEnd();
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.NativeAd.this.getShowToFailMetric(), com.vungle.ads.NativeAd.this.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(android.content.Context context, java.lang.String placementId) {
        this(context, placementId, new com.vungle.ads.AdConfig());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.NativeAdInternal constructAdInternal$vungle_ads_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.NativeAdInternal(context);
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    /* renamed from: getNativeDisplayDurationMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.TimeIntervalMetric getNativeDisplayDurationMetric() {
        return this.nativeDisplayDurationMetric;
    }

    public final com.vungle.ads.nativead.NativeVideoOptions getVideoOptions() {
        return this.nativeAdInternal.getVideoOptions$vungle_ads_release();
    }

    public final java.lang.String getAppIcon() {
        return this.nativeAdInternal.getAppIcon();
    }

    public final java.lang.String getAdTitle() {
        return this.nativeAdInternal.getAdTitle();
    }

    public final java.lang.String getAdBodyText() {
        return this.nativeAdInternal.getAdBodyText();
    }

    public final java.lang.String getAdCallToActionText() {
        return this.nativeAdInternal.getAdCallToActionText();
    }

    public final java.lang.Double getAdStarRating() {
        return this.nativeAdInternal.getAdStarRating();
    }

    public final java.lang.String getAdSponsoredText() {
        return this.nativeAdInternal.getAdSponsoredText();
    }

    public final boolean hasCallToAction() {
        return this.nativeAdInternal.hasCallToAction();
    }

    public final float getMediaAspectRatio() {
        return this.nativeAdInternal.getAspectRatio();
    }

    /* renamed from: getMediaView, reason: from getter */
    public final com.vungle.ads.internal.ui.view.MediaView getAdContentView() {
        return this.adContentView;
    }

    public final void unregisterView() {
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "unregisterView  " + hashCode());
        if (this.destroyed.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.markEnd();
        this.nativeDisplayDurationMetric.setMeta(java.lang.String.valueOf(this.displayCount));
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        java.util.Collection<? extends android.view.View> collection = this.clickableViews;
        if (collection != null) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        this.adRootView = null;
        com.vungle.ads.internal.ui.view.MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy$vungle_ads_release();
        }
        this.adContentView = null;
        com.vungle.ads.internal.ui.view.NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        this.nativeAdInternal.destroy();
        try {
            android.widget.ImageView imageView = this.adIconView;
            android.graphics.drawable.Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "error msg: " + e.getLocalizedMessage());
        }
        android.widget.ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
    }

    public final boolean hasVideoContent() {
        return this.nativeAdInternal.hasVideoContent();
    }

    public final void registerViewForInteraction(android.widget.FrameLayout rootView, com.vungle.ads.internal.ui.view.MediaView mediaView, android.widget.ImageView adIconView, java.util.Collection<? extends android.view.View> clickableViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "registerViewForInteraction " + hashCode());
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        this.displayCount = this.displayCount + 1;
        this.nativeDisplayDurationMetric.markStart();
        getResponseToShowMetric().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        if (getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.adRootView, rootView)) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.destroyed.set(false);
        com.vungle.ads.VungleError canPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (canPlayAd != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "registerViewForInteraction can NOT play. " + hashCode() + ' ' + canPlayAd);
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
            }
            com.vungle.ads.BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, canPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = adIconView;
        this.clickableViews = clickableViews;
        this.nativeAdInternal.initPresenter(rootView, this.adPlayCallback);
        if (this.adOptionsView == null) {
            this.adOptionsView = new com.vungle.ads.internal.ui.view.NativeAdOptionsView(getContext());
        }
        com.vungle.ads.internal.ui.view.NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.vungle.ads.NativeAd.m10391registerViewForInteraction$lambda1(com.vungle.ads.NativeAd.this, view);
                }
            });
        }
        if (clickableViews == null) {
            clickableViews = kotlin.collections.CollectionsKt.listOf(mediaView);
        }
        java.util.Iterator<T> it = clickableViews.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.vungle.ads.NativeAd.m10392registerViewForInteraction$lambda3$lambda2(com.vungle.ads.NativeAd.this, view);
                }
            });
        }
        com.vungle.ads.internal.ui.view.NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        this.nativeAdInternal.trySetTouchListener(mediaView);
        mediaView.present$vungle_ads_release(this.nativeAdInternal);
        this.nativeAdInternal.displayAppIcon(adIconView);
        com.vungle.ads.internal.NativeAdInternal nativeAdInternal = this.nativeAdInternal;
        com.vungle.ads.internal.ui.view.NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        nativeAdInternal.displayPrivacyIcon(nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        this.nativeAdInternal.showWatermark(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    public static final void m10391registerViewForInteraction$lambda1(com.vungle.ads.NativeAd this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nativeAdInternal.onPrivacyIconClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-3$lambda-2, reason: not valid java name */
    public static final void m10392registerViewForInteraction$lambda3$lambda2(com.vungle.ads.NativeAd this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nativeAdInternal.openCallToActionUrlByUser();
    }

    public final void performCTA() {
        this.nativeAdInternal.openCallToActionUrl();
    }
}
