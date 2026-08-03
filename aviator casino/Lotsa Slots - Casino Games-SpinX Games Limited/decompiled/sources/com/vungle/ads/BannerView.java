package com.vungle.ads;

/* compiled from: BannerView.kt */
@kotlin.Deprecated(message = "This class is deprecated and will be removed in a future release.")
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\"J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0014J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0014H\u0014J\b\u00100\u001a\u00020)H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\"H\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/BannerView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "adConfig", "Lcom/vungle/ads/AdConfig;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;Lcom/vungle/ads/internal/presenter/AdPlayCallback;)V", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "calculatedPixelHeight", "", "calculatedPixelWidth", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lkotlin/Lazy;", "isInvisibleLogged", "isOnImpressionCalled", "", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenterStarted", "checkHardwareAcceleration", "", "finishAdInternal", "isFinishedByApi", "logViewVisibleOnPlay", "onAttachedToWindow", "onWindowVisibilityChanged", "visibility", "renderAd", "setAdVisibility", com.ironsource.C3023e8.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "omTrackerFactory", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerView extends android.widget.RelativeLayout {
    private static final java.lang.String TAG = "BannerView";
    private com.vungle.ads.internal.ui.view.MRAIDAdWidget adWidget;
    private final com.vungle.ads.internal.model.AdPayload advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final java.util.concurrent.atomic.AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.WatermarkView imageView;

    /* renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy impressionTracker;
    private final java.util.concurrent.atomic.AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private final com.vungle.ads.internal.model.Placement placement;
    private com.vungle.ads.internal.presenter.MRAIDPresenter presenter;
    private final java.util.concurrent.atomic.AtomicBoolean presenterStarted;

    public final com.vungle.ads.internal.model.Placement getPlacement() {
        return this.placement;
    }

    public final com.vungle.ads.internal.model.AdPayload getAdvertisement() {
        return this.advertisement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(final android.content.Context context, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.VungleAdSize adSize, com.vungle.ads.AdConfig adConfig, com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback) throws java.lang.InstantiationException {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = advertisement;
        this.destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.presenterStarted = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isInvisibleLogged = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.impressionTracker = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.ImpressionTracker>() { // from class: com.vungle.ads.BannerView$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.ImpressionTracker invoke() {
                return new com.vungle.ads.internal.ImpressionTracker(context);
            }
        });
        this.calculatedPixelHeight = com.vungle.ads.internal.util.ViewUtility.INSTANCE.dpToPixels(context, adSize.getHeight());
        this.calculatedPixelWidth = com.vungle.ads.internal.util.ViewUtility.INSTANCE.dpToPixels(context, adSize.getWidth());
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = new com.vungle.ads.internal.presenter.AdEventListener(adPlayCallback, placement);
        try {
            com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget = new com.vungle.ads.internal.ui.view.MRAIDAdWidget(context, null, 2, null);
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    com.vungle.ads.BannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(android.view.MotionEvent event) {
                    com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = com.vungle.ads.BannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(event);
                    return false;
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.Executors invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
            com.vungle.ads.internal.omsdk.OMTracker make = m10388_init_$lambda3(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.omsdk.OMTracker.Factory>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.omsdk.OMTracker.Factory invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.omsdk.OMTracker.Factory.class);
                }
            })).make(advertisement.omEnabled());
            com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
            kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.platform.Platform invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.platform.Platform.class);
                }
            });
            com.vungle.ads.internal.ui.VungleWebClient vungleWebClient = new com.vungle.ads.internal.ui.VungleWebClient(advertisement, placement, m10387_init_$lambda2(lazy).getOFFLOAD_EXECUTOR(), m10389_init_$lambda4(lazy2), null, null, 48, null);
            vungleWebClient.setWebViewObserver(make);
            com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = new com.vungle.ads.internal.presenter.MRAIDPresenter(mRAIDAdWidget, advertisement, placement, vungleWebClient, m10387_init_$lambda2(lazy).getJOB_EXECUTOR(), make, m10389_init_$lambda4(lazy2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            java.lang.String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new com.vungle.ads.internal.ui.WatermarkView(context, watermark$vungle_ads_release);
            }
        } catch (java.lang.InstantiationException e) {
            adEventListener.onError(new com.vungle.ads.AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e;
        }
    }

    private final com.vungle.ads.internal.ImpressionTracker getImpressionTracker() {
        return (com.vungle.ads.internal.ImpressionTracker) this.impressionTracker.getValue();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        setAdVisibility(visibility == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onAttachedToWindow()");
        if (!this.presenterStarted.getAndSet(true)) {
            com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new com.vungle.ads.internal.ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.BannerView$onAttachedToWindow$1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(android.view.View view) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.d("BannerView", "ImpressionTracker checked the banner view become visible.");
                    com.vungle.ads.BannerView.this.isOnImpressionCalled = true;
                    com.vungle.ads.BannerView.this.logViewVisibleOnPlay();
                    com.vungle.ads.BannerView.this.checkHardwareAcceleration();
                    com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter2 = com.vungle.ads.BannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(android.view.View view) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                    atomicBoolean = com.vungle.ads.BannerView.this.isInvisibleLogged;
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    com.vungle.ads.internal.util.Logger.INSTANCE.d("BannerView", "ImpressionTracker checked the banner view invisible on play.");
                    com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                    com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    singleValueMetric.setValue(1L);
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, com.vungle.ads.BannerView.this.getAdvertisement().getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                }
            });
        }
        renderAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j = this.isInvisibleLogged.get() ? 3L : 2L;
        com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(java.lang.Long.valueOf(j));
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.advertisement.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j);
    }

    private final void setAdVisibility(boolean isVisible) {
        com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(isVisible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.advertisement.getLogEntry(), null, 10, null);
    }

    public final void finishAdInternal(boolean isFinishedByApi) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i = (isFinishedByApi ? 4 : 0) | 2;
        com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i);
        }
        getImpressionTracker().destroy();
        try {
            android.view.ViewParent parent = getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Removing webView error: " + e);
        }
    }

    private final void renderAd() {
        com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mRAIDAdWidget != null ? mRAIDAdWidget.getParent() : null, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                com.vungle.ads.internal.ui.WatermarkView watermarkView = this.imageView;
                if (watermarkView != null) {
                    addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    com.vungle.ads.internal.ui.WatermarkView watermarkView2 = this.imageView;
                    if (watermarkView2 != null) {
                        watermarkView2.bringToFront();
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    /* renamed from: _init_$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10387_init_$lambda2(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.OMTracker.Factory m10388_init_$lambda3(kotlin.Lazy<com.vungle.ads.internal.omsdk.OMTracker.Factory> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.Platform m10389_init_$lambda4(kotlin.Lazy<? extends com.vungle.ads.internal.platform.Platform> lazy) {
        return lazy.getValue();
    }
}
