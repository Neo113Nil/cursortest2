package com.vungle.ads;

/* compiled from: VungleBannerView.kt */
@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010A\u001a\u00020BH\u0002J\u0006\u0010C\u001a\u00020BJ\u0010\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u000205H\u0002J\u0006\u0010F\u001a\u00020\bJ\u0006\u0010G\u001a\u00020BJ\u000e\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020IJ\u0012\u0010G\u001a\u00020B2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020BH\u0002J\b\u0010M\u001a\u00020BH\u0014J\u0010\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020BH\u0014J\u0010\u0010R\u001a\u00020B2\u0006\u0010S\u001a\u00020!H\u0014J\b\u0010T\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u000205H\u0002J \u0010W\u001a\u00020B2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\bH\u0002R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010'\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u000e\u00101\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001dR\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010a\u001a\u00020bX\u008a\u0084\u0002²\u0006\n\u0010c\u001a\u00020dX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/VungleBannerView;", "Landroid/widget/RelativeLayout;", "Lcom/vungle/ads/VungleAdType;", "context", "Landroid/content/Context;", "placementId", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adListener", "Lcom/vungle/ads/BannerAdListener;", "getAdListener", "()Lcom/vungle/ads/BannerAdListener;", "setAdListener", "(Lcom/vungle/ads/BannerAdListener;)V", "getAdSize", "()Lcom/vungle/ads/VungleAdSize;", "adViewImpl", "Lcom/vungle/ads/internal/BannerAdImpl;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "value", "adapterAdFormat", "getAdapterAdFormat", "()Ljava/lang/String;", "setAdapterAdFormat", "(Ljava/lang/String;)V", "calculatedPixelHeight", "", "calculatedPixelWidth", "creativeId", "getCreativeId", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "eventId", "getEventId", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lkotlin/Lazy;", "isAdAttachedToWindow", "isAdDownloaded", "isInvisibleLogged", "isOnImpressionCalled", "", "isReceiverRegistered", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getPlacementId", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenterStarted", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "checkHardwareAcceleration", "", "finishAd", "finishAdInternal", "isFinishedByApi", "getAdViewSize", "load", "csbData", "Lcom/vungle/ads/VungleCSBData;", "adMarkup", "logViewInvisibleOnPlay", "logViewVisibleOnPlay", "onAttachedToWindow", "onBannerAdLoaded", "baseAd", "Lcom/vungle/ads/BaseAd;", "onDetachedFromWindow", "onWindowVisibilityChanged", "visibility", "renderAd", "setAdVisibility", com.ironsource.C3023e8.k, "willPresentAdView", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "fixedAdSize", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "omTrackerFactory", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleBannerView extends android.widget.RelativeLayout implements com.vungle.ads.VungleAdType {
    private static final java.lang.String TAG = "VungleBannerView";
    private com.vungle.ads.BannerAdListener adListener;
    private final com.vungle.ads.VungleAdSize adSize;
    private final com.vungle.ads.internal.BannerAdImpl adViewImpl;
    private com.vungle.ads.internal.ui.view.MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final java.util.concurrent.atomic.AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.WatermarkView imageView;

    /* renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy impressionTracker;
    private final java.util.concurrent.atomic.AtomicBoolean isAdAttachedToWindow;
    private final java.util.concurrent.atomic.AtomicBoolean isAdDownloaded;
    private final java.util.concurrent.atomic.AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final java.lang.String placementId;
    private com.vungle.ads.internal.presenter.MRAIDPresenter presenter;
    private final java.util.concurrent.atomic.AtomicBoolean presenterStarted;
    private final com.vungle.ads.internal.util.RingerModeReceiver ringerModeReceiver;

    public final com.vungle.ads.VungleAdSize getAdSize() {
        return this.adSize;
    }

    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(final android.content.Context context, java.lang.String placementId, com.vungle.ads.VungleAdSize adSize) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new com.vungle.ads.internal.util.RingerModeReceiver();
        com.vungle.ads.internal.BannerAdImpl bannerAdImpl = new com.vungle.ads.internal.BannerAdImpl(context, placementId, adSize, new com.vungle.ads.AdConfig());
        this.adViewImpl = bannerAdImpl;
        this.destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.presenterStarted = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isAdDownloaded = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isAdAttachedToWindow = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isInvisibleLogged = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.impressionTracker = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.ImpressionTracker>() { // from class: com.vungle.ads.VungleBannerView$impressionTracker$2
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
        bannerAdImpl.setAdListener(new com.vungle.ads.BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.VungleBannerView.this.onBannerAdLoaded(baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError adError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adError, "adError");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError adError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adError, "adError");
                com.vungle.ads.BannerAdListener adListener = com.vungle.ads.VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, adError);
                }
            }
        });
    }

    public final com.vungle.ads.BannerAdListener getAdListener() {
        return this.adListener;
    }

    public final void setAdListener(com.vungle.ads.BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    public final com.vungle.ads.AdConfig getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final java.lang.String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final java.lang.String getEventId() {
        return this.adViewImpl.getEventId();
    }

    @Override // com.vungle.ads.VungleAdType
    public java.lang.String getAdapterAdFormat() {
        return this.adViewImpl.getAdapterAdFormat();
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(java.lang.String str) {
        this.adViewImpl.setAdapterAdFormat(str);
    }

    public final com.vungle.ads.internal.util.LogEntry getLogEntry$vungle_ads_release() {
        return this.adViewImpl.getLogEntry();
    }

    private final com.vungle.ads.internal.ImpressionTracker getImpressionTracker() {
        return (com.vungle.ads.internal.ImpressionTracker) this.impressionTracker.getValue();
    }

    public final com.vungle.ads.VungleAdSize getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    public final void load() {
        this.adViewImpl.load();
    }

    public static /* synthetic */ void load$default(com.vungle.ads.VungleBannerView vungleBannerView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    public final void load(java.lang.String adMarkup) {
        this.adViewImpl.load(adMarkup);
    }

    public final void load(com.vungle.ads.VungleCSBData csbData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(csbData, "csbData");
        this.adViewImpl.load(csbData);
    }

    public final void finishAd() {
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.VungleBannerView$finishAd$1
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
                com.vungle.ads.VungleBannerView.this.finishAdInternal(true);
            }
        });
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        setAdVisibility(visibility == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new android.content.IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "registerReceiver error: " + e.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "unregisterReceiver error: " + e.getLocalizedMessage());
            }
        }
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
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j = this.isInvisibleLogged.get() ? 3L : 2L;
        com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(java.lang.Long.valueOf(j));
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(1L);
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        if (this.destroyed.get()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new com.vungle.ads.internal.ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.VungleBannerView$renderAd$1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(android.view.View view) {
                    com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter2;
                    com.vungle.ads.internal.util.Logger.INSTANCE.d("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
                    com.vungle.ads.VungleBannerView.this.isOnImpressionCalled = true;
                    com.vungle.ads.VungleBannerView.this.logViewVisibleOnPlay();
                    com.vungle.ads.VungleBannerView.this.checkHardwareAcceleration();
                    mRAIDPresenter2 = com.vungle.ads.VungleBannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(android.view.View view) {
                    com.vungle.ads.VungleBannerView.this.logViewInvisibleOnPlay();
                }
            });
        }
        com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null && !kotlin.jvm.internal.Intrinsics.areEqual(mRAIDAdWidget.getParent(), this)) {
            android.view.ViewParent parent = mRAIDAdWidget.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mRAIDAdWidget);
            }
            addView(mRAIDAdWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        com.vungle.ads.internal.ui.WatermarkView watermarkView = this.imageView;
        if (watermarkView != null && !kotlin.jvm.internal.Intrinsics.areEqual(watermarkView.getParent(), this)) {
            android.view.ViewParent parent2 = watermarkView.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(watermarkView);
            }
            addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
            watermarkView.bringToFront();
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(com.vungle.ads.BaseAd baseAd) {
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), this.adViewImpl.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        this.adViewImpl.getResponseToShowMetric().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.adViewImpl.getResponseToShowMetric(), this.adViewImpl.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToCloseMetric().markStart();
        this.adViewImpl.getShowToFailMetric().markStart();
        com.vungle.ads.VungleError canPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (canPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
            }
            com.vungle.ads.BannerAdListener bannerAdListener = this.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, canPlayAd);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.AdPayload advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        com.vungle.ads.internal.model.Placement placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            com.vungle.ads.BannerAdListener bannerAdListener2 = this.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new com.vungle.ads.AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.adViewImpl.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            com.vungle.ads.BannerAdListener bannerAdListener3 = this.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            renderAd();
        } catch (java.lang.InstantiationException unused) {
        }
    }

    private final void willPresentAdView(com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.VungleAdSize fixedAdSize) throws java.lang.InstantiationException {
        com.vungle.ads.internal.util.ViewUtility viewUtility = com.vungle.ads.internal.util.ViewUtility.INSTANCE;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, fixedAdSize.getHeight());
        com.vungle.ads.internal.util.ViewUtility viewUtility2 = com.vungle.ads.internal.util.ViewUtility.INSTANCE;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.calculatedPixelWidth = viewUtility2.dpToPixels(context2, fixedAdSize.getWidth());
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = new com.vungle.ads.internal.presenter.AdEventListener(this.adViewImpl.getAdPlayCallback(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "context");
            com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget = new com.vungle.ads.internal.ui.view.MRAIDAdWidget(context3, advertisement.eventId());
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    com.vungle.ads.VungleBannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(android.view.MotionEvent event) {
                    com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter;
                    mRAIDPresenter = com.vungle.ads.VungleBannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(event);
                    return false;
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context4 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context4, "context");
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.Executors invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context4).getService(com.vungle.ads.internal.executor.Executors.class);
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context5 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context5, "context");
            com.vungle.ads.internal.omsdk.OMTracker make = m10395willPresentAdView$lambda6(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.omsdk.OMTracker.Factory>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.omsdk.OMTracker.Factory invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context5).getService(com.vungle.ads.internal.omsdk.OMTracker.Factory.class);
                }
            })).make(advertisement.omEnabled());
            com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context6 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context6, "context");
            kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.platform.Platform invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context6).getService(com.vungle.ads.internal.platform.Platform.class);
                }
            });
            com.vungle.ads.internal.ui.VungleWebClient orCreateWebViewClient = com.vungle.ads.internal.presenter.WebViewManager.INSTANCE.getOrCreateWebViewClient(advertisement, placement, m10394willPresentAdView$lambda5(lazy).getOFFLOAD_EXECUTOR(), m10396willPresentAdView$lambda7(lazy2));
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(make);
            com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = new com.vungle.ads.internal.presenter.MRAIDPresenter(mRAIDAdWidget, advertisement, placement, orCreateWebViewClient, m10394willPresentAdView$lambda5(lazy).getJOB_EXECUTOR(), make, m10396willPresentAdView$lambda7(lazy2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            java.lang.String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                android.content.Context context7 = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context7, "context");
                this.imageView = new com.vungle.ads.internal.ui.WatermarkView(context7, watermark$vungle_ads_release);
            }
        } catch (java.lang.InstantiationException e) {
            adEventListener.onError(new com.vungle.ads.AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release(), this.placementId);
            throw e;
        }
    }

    /* renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10394willPresentAdView$lambda5(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.OMTracker.Factory m10395willPresentAdView$lambda6(kotlin.Lazy<com.vungle.ads.internal.omsdk.OMTracker.Factory> lazy) {
        return lazy.getValue();
    }

    /* renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.Platform m10396willPresentAdView$lambda7(kotlin.Lazy<? extends com.vungle.ads.internal.platform.Platform> lazy) {
        return lazy.getValue();
    }
}
