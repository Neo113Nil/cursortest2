package com.vungle.ads;

/* compiled from: BaseAd.kt */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010G\u001a\u00020HH\u0016¢\u0006\u0002\u0010IJ\u0015\u0010J\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H ¢\u0006\u0002\bKJ\r\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020PH\u0016J\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010O\u001a\u00020P2\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020VH\u0010¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020PH\u0002J\u001d\u0010Y\u001a\u00020P2\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\\H\u0010¢\u0006\u0002\b]J\u001f\u0010^\u001a\u00020P2\u0006\u0010Z\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0010¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020PJ\u0006\u0010a\u001a\u00020PR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0014\u00102\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0014\u00104\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0014\u00106\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0014\u00108\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0014\u0010:\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u001b\u0010<\u001a\u00020=8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0011\u001a\u0004\b>\u0010?R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006b"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lcom/vungle/ads/VungleAdType;", "context", "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adInternal", "Lcom/vungle/ads/internal/AdInternal;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/AdInternal;", "adInternal$delegate", "Lkotlin/Lazy;", "adListener", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "value", "adapterAdFormat", "getAdapterAdFormat", "()Ljava/lang/String;", "setAdapterAdFormat", "(Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "creativeId", "getCreativeId", "displayToClickMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "getDisplayToClickMetric$vungle_ads_release", "()Lcom/vungle/ads/OneShotTimeIntervalMetric;", "eventId", "getEventId", "leaveApplicationMetric", "Lcom/vungle/ads/SingleValueMetric;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/SingleValueMetric;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getPlacementId", "presentToDisplayMetric", "getPresentToDisplayMetric$vungle_ads_release", "responseToShowMetric", "getResponseToShowMetric$vungle_ads_release", "rewardedMetric", "getRewardedMetric$vungle_ads_release", "showToCloseMetric", "getShowToCloseMetric$vungle_ads_release", "showToFailMetric", "getShowToFailMetric$vungle_ads_release", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "signaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignaledAd;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SignaledAd;)V", "canPlayAd", "", "()Ljava/lang/Boolean;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "getWinningPrice", "", "()Ljava/lang/Double;", "load", "", "csbData", "Lcom/vungle/ads/VungleCSBData;", "adMarkup", com.ironsource.Vf.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onLoadEnd", "onLoadFailure", "baseAd", "vungleError", "Lcom/vungle/ads/VungleError;", "onLoadFailure$vungle_ads_release", com.ironsource.Ad.f, "onLoadSuccess$vungle_ads_release", "sendLossURL", "sendWinURL", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseAd implements com.vungle.ads.Ad, com.vungle.ads.VungleAdType {
    private final com.vungle.ads.AdConfig adConfig;

    /* renamed from: adInternal$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy adInternal;
    private com.vungle.ads.BaseAdListener adListener;
    private java.lang.String adapterAdFormat;
    private final android.content.Context context;
    private java.lang.String creativeId;
    private final com.vungle.ads.OneShotTimeIntervalMetric displayToClickMetric;
    private java.lang.String eventId;
    private final com.vungle.ads.SingleValueMetric leaveApplicationMetric;
    private final com.vungle.ads.internal.util.LogEntry logEntry;
    private final java.lang.String placementId;
    private final com.vungle.ads.OneShotTimeIntervalMetric presentToDisplayMetric;
    private final com.vungle.ads.OneShotTimeIntervalMetric responseToShowMetric;
    private final com.vungle.ads.SingleValueMetric rewardedMetric;
    private final com.vungle.ads.OneShotTimeIntervalMetric showToCloseMetric;
    private final com.vungle.ads.OneShotTimeIntervalMetric showToFailMetric;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy signalManager;
    private com.vungle.ads.internal.signals.SignaledAd signaledAd;

    public abstract com.vungle.ads.internal.AdInternal constructAdInternal$vungle_ads_release(android.content.Context context);

    public BaseAd(final android.content.Context context, java.lang.String placementId, com.vungle.ads.AdConfig adConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.AdInternal>() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.AdInternal invoke() {
                com.vungle.ads.BaseAd baseAd = com.vungle.ads.BaseAd.this;
                com.vungle.ads.internal.AdInternal constructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                constructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(com.vungle.ads.BaseAd.this.getLogEntry());
                return constructAdInternal$vungle_ads_release;
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.signalManager = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.signals.SignalManager>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.signals.SignalManager invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.signals.SignalManager.class);
            }
        });
        com.vungle.ads.internal.util.LogEntry logEntry = new com.vungle.ads.internal.util.LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = logEntry;
        this.responseToShowMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    public final com.vungle.ads.AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.BaseAdListener getAdListener() {
        return this.adListener;
    }

    public final void setAdListener(com.vungle.ads.BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final com.vungle.ads.internal.AdInternal getAdInternal$vungle_ads_release() {
        return (com.vungle.ads.internal.AdInternal) this.adInternal.getValue();
    }

    public final com.vungle.ads.internal.signals.SignalManager getSignalManager$vungle_ads_release() {
        return (com.vungle.ads.internal.signals.SignalManager) this.signalManager.getValue();
    }

    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return this.logEntry;
    }

    /* renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.OneShotTimeIntervalMetric getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    /* renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.OneShotTimeIntervalMetric getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    /* renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.OneShotTimeIntervalMetric getShowToFailMetric() {
        return this.showToFailMetric;
    }

    /* renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.OneShotTimeIntervalMetric getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    /* renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.SingleValueMetric getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    /* renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.SingleValueMetric getRewardedMetric() {
        return this.rewardedMetric;
    }

    /* renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.OneShotTimeIntervalMetric getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    /* renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.signals.SignaledAd getSignaledAd() {
        return this.signaledAd;
    }

    public final void setSignaledAd$vungle_ads_release(com.vungle.ads.internal.signals.SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public java.lang.Boolean canPlayAd() {
        return java.lang.Boolean.valueOf(com.vungle.ads.internal.AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final java.lang.String getEventId() {
        return this.eventId;
    }

    @Override // com.vungle.ads.VungleAdType
    public java.lang.String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(java.lang.String str) {
        this.adapterAdFormat = str;
        this.logEntry.setAdapterAdFormat$vungle_ads_release(str);
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((java.lang.String) null);
    }

    @Override // com.vungle.ads.Ad
    public void load(final java.lang.String adMarkup) {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, adMarkup, null, new com.vungle.ads.internal.load.AdLoaderCallback() { // from class: com.vungle.ads.BaseAd$load$1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(com.vungle.ads.internal.model.AdPayload advertisement) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                com.vungle.ads.BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                com.vungle.ads.BaseAd baseAd = com.vungle.ads.BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.BaseAd baseAd = com.vungle.ads.BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        java.lang.String eventId = advertisement.eventId();
        this.eventId = eventId;
        com.vungle.ads.internal.signals.SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(eventId);
    }

    public void onLoadSuccess$vungle_ads_release(com.vungle.ads.BaseAd baseAd, java.lang.String adMarkup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        onLoadEnd();
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
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
                com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(com.vungle.ads.BaseAd.this);
                }
            }
        });
    }

    public void onLoadFailure$vungle_ads_release(com.vungle.ads.BaseAd baseAd, final com.vungle.ads.VungleError vungleError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        onLoadEnd();
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
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
                com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(com.vungle.ads.BaseAd.this, vungleError);
                }
            }
        });
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.Ad
    public void load(com.vungle.ads.VungleCSBData csbData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(csbData, "csbData");
        getAdInternal$vungle_ads_release().loadAd(this.placementId, null, csbData, new com.vungle.ads.internal.load.AdLoaderCallback() { // from class: com.vungle.ads.BaseAd$load$2
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(com.vungle.ads.internal.model.AdPayload advertisement) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                com.vungle.ads.BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                com.vungle.ads.BaseAd baseAd = com.vungle.ads.BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.BaseAd baseAd = com.vungle.ads.BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }
        });
    }

    public final java.lang.Double getWinningPrice() {
        com.vungle.ads.internal.model.AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement != null) {
            return advertisement.getWinningPrice();
        }
        return null;
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().sendWinURL();
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().sendLossURL();
    }
}
