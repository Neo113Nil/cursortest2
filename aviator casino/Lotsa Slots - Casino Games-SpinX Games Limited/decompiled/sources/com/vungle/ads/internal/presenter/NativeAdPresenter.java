package com.vungle.ads.internal.presenter;

/* compiled from: NativeAdPresenter.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u00105\u001a\u000206J\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001fJ\b\u0010;\u001a\u00020\u001dH\u0002J\u0012\u0010<\u001a\u0002062\b\u0010=\u001a\u0004\u0018\u00010\u001fH\u0002J&\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020\u001c2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010'J\u0012\u0010A\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010C\u001a\u0002062\b\u0010?\u001a\u0004\u0018\u00010DJ\u0006\u0010E\u001a\u000206J&\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\u001f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010I\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010\u000fJ\b\u0010K\u001a\u000206H\u0002J\b\u0010L\u001a\u000206H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0'X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010)\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b2\u00103¨\u0006N²\u0006\n\u0010O\u001a\u00020PX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "", "context", "Landroid/content/Context;", "delegate", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "(Landroid/content/Context;Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "Ljava/lang/Long;", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "()V", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "setClickCoordinateTracker$vungle_ads_release", "(Lcom/vungle/ads/internal/ClickCoordinateTracker;)V", "currentDialog", "Landroid/app/Dialog;", "firedOMEventMap", "", "", "", "firedTpatMap", "", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "Lkotlin/Lazy;", "multipleOMEventEnabledMap", "", "multipleTpatEnabledMap", "omTracker", "Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "getOmTracker$vungle_ads_release$annotations", "getOmTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "setOmTracker$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/NativeOMTracker;)V", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "detach", "", "initAndStartOMTracker", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "omSdkData", "needShowGdpr", "onDownload", "ctaUrl", "onOMEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "args", "onPrivacy", "privacyUrl", "onViewTouched", "Landroid/view/MotionEvent;", "prepare", "processCommand", "action", "value", "setEventListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showGdpr", "start", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAdPresenter {
    public static final java.lang.String DOWNLOAD = "download";
    public static final java.lang.String OPEN_PRIVACY = "openPrivacy";
    private static final java.lang.String TAG = "NativeAdPresenter";
    public static final java.lang.String TPAT = "tpat";
    private java.lang.Long adStartTime;
    private final com.vungle.ads.internal.model.AdPayload advertisement;
    private com.vungle.ads.internal.presenter.AdEventListener bus;
    private com.vungle.ads.internal.ClickCoordinateTracker clickCoordinateTracker;
    private final android.content.Context context;
    private android.app.Dialog currentDialog;
    private final com.vungle.ads.internal.presenter.NativePresenterDelegate delegate;
    private final java.util.Map<java.lang.Integer, java.lang.Boolean> firedOMEventMap;
    private final java.util.Map<java.lang.String, java.lang.Boolean> firedTpatMap;

    /* renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy logEntry;
    private final java.util.Map<java.lang.Integer, java.lang.Boolean> multipleOMEventEnabledMap;
    private final java.util.Map<java.lang.String, java.lang.Boolean> multipleTpatEnabledMap;
    private com.vungle.ads.internal.omsdk.NativeOMTracker omTracker;
    private final com.vungle.ads.internal.platform.Platform platform;

    /* renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy tpatSender;

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOmTracker$vungle_ads_release$annotations() {
    }

    public NativeAdPresenter(final android.content.Context context, com.vungle.ads.internal.presenter.NativePresenterDelegate delegate, com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.platform.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = advertisement;
        this.platform = platform;
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.tpatSender = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.TpatSender invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.TpatSender.class);
            }
        });
        this.logEntry = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.LogEntry>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.LogEntry invoke() {
                com.vungle.ads.internal.model.AdPayload adPayload;
                adPayload = com.vungle.ads.internal.presenter.NativeAdPresenter.this.advertisement;
                return adPayload.getLogEntry();
            }
        });
        this.firedTpatMap = new java.util.LinkedHashMap();
        this.multipleTpatEnabledMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.vungle.ads.internal.Constants.TPAT_VIDEO_MUTE, true), kotlin.TuplesKt.to(com.vungle.ads.internal.Constants.TPAT_VIDEO_UNMUTE, true));
        this.firedOMEventMap = new java.util.LinkedHashMap();
        this.multipleOMEventEnabledMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(8, true), kotlin.TuplesKt.to(9, true), kotlin.TuplesKt.to(10, true));
        this.clickCoordinateTracker = new com.vungle.ads.internal.ClickCoordinateTracker(context, advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.TpatSender getTpatSender() {
        return (com.vungle.ads.internal.network.TpatSender) this.tpatSender.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return (com.vungle.ads.internal.util.LogEntry) this.logEntry.getValue();
    }

    /* renamed from: getOmTracker$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.omsdk.NativeOMTracker getOmTracker() {
        return this.omTracker;
    }

    public final void setOmTracker$vungle_ads_release(com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker) {
        this.omTracker = nativeOMTracker;
    }

    /* renamed from: getClickCoordinateTracker$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ClickCoordinateTracker getClickCoordinateTracker() {
        return this.clickCoordinateTracker;
    }

    public final void setClickCoordinateTracker$vungle_ads_release(com.vungle.ads.internal.ClickCoordinateTracker clickCoordinateTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickCoordinateTracker, "<set-?>");
        this.clickCoordinateTracker = clickCoordinateTracker;
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.AdEventListener listener) {
        this.bus = listener;
    }

    public static /* synthetic */ void processCommand$default(com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        nativeAdPresenter.processCommand(str, str2, str3);
    }

    public final void processCommand(java.lang.String action, java.lang.String event, java.lang.String value) {
        java.util.List<java.lang.String> tpatUrls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "processCommand: action=" + action + " event=" + event + " value=" + value);
        int hashCode = action.hashCode();
        if (hashCode != -511324706) {
            if (hashCode != 3566511) {
                if (hashCode == 1427818632 && action.equals(DOWNLOAD)) {
                    onDownload(value);
                    return;
                }
            } else if (action.equals("tpat")) {
                java.lang.String str = event;
                if (str == null || str.length() == 0) {
                    new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.multipleTpatEnabledMap.get(event), (java.lang.Object) true) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.firedTpatMap.get(event), (java.lang.Object) true)) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Ignore this already fired TPAT: " + event);
                    return;
                }
                this.firedTpatMap.put(event, true);
                int hashCode2 = event.hashCode();
                if (hashCode2 == -2125915830) {
                    if (event.equals(com.vungle.ads.internal.Constants.CHECKPOINT_0)) {
                        tpatUrls = this.advertisement.getTpatUrls(event, this.platform.getCarrierName(), java.lang.String.valueOf(this.platform.getVolumeLevel()));
                    }
                    tpatUrls = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, event, null, null, 6, null);
                } else if (hashCode2 == -747709511) {
                    if (event.equals(com.vungle.ads.internal.Constants.VIDEO_LENGTH_TPAT)) {
                        tpatUrls = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, event, value, null, 4, null);
                    }
                    tpatUrls = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, event, null, null, 6, null);
                } else {
                    if (hashCode2 == 1082060480 && event.equals(com.vungle.ads.internal.Constants.CTA_URL)) {
                        tpatUrls = value != null ? kotlin.collections.CollectionsKt.listOf(value) : null;
                    }
                    tpatUrls = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, event, null, null, 6, null);
                }
                java.util.List<java.lang.String> list = tpatUrls;
                if (list == null || list.isEmpty()) {
                    new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Empty urls for tpat: " + event + " value=" + value).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    java.util.Iterator<T> it = tpatUrls.iterator();
                    while (it.hasNext()) {
                        com.vungle.ads.internal.network.TpatSender.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(event).withLogEntry(getLogEntry()).build(), false, 2, null);
                    }
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.vungle.ads.internal.Constants.CHECKPOINT_0)) {
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                    com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (action.equals("openPrivacy")) {
            onPrivacy(value);
            return;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Unknown native ad action: " + action);
    }

    public final void onViewTouched(android.view.MotionEvent event) {
        if (event != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "user interaction on Native ad");
            this.clickCoordinateTracker.trackCoordinate(event);
        }
    }

    private final void onDownload(java.lang.String ctaUrl) {
        com.vungle.ads.internal.presenter.AdEventListener adEventListener;
        processCommand$default(this, "tpat", com.vungle.ads.internal.Constants.CLICK_URL, null, 4, null);
        processCommand("tpat", com.vungle.ads.internal.Constants.CTA_URL, ctaUrl);
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = this.advertisement.adUnit();
        final java.lang.String deeplinkUrl = adUnit != null ? adUnit.getDeeplinkUrl() : null;
        boolean launch$vungle_ads_release = com.vungle.ads.internal.util.ExternalRouter.INSTANCE.launch$vungle_ads_release(deeplinkUrl, ctaUrl, this.context, getLogEntry(), new com.vungle.ads.internal.ui.PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean opened) {
                com.vungle.ads.internal.model.AdPayload adPayload;
                com.vungle.ads.internal.util.LogEntry logEntry;
                com.vungle.ads.internal.network.TpatSender tpatSender;
                com.vungle.ads.internal.util.LogEntry logEntry2;
                if (!opened) {
                    com.vungle.ads.LinkError linkError = new com.vungle.ads.LinkError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl);
                    logEntry2 = this.getLogEntry();
                    linkError.setLogEntry$vungle_ads_release(logEntry2).logErrorNoReturnValue$vungle_ads_release();
                }
                adPayload = this.advertisement;
                java.util.List tpatUrls$default = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(adPayload, com.vungle.ads.internal.Constants.DEEPLINK_CLICK, java.lang.String.valueOf(opened), null, 4, null);
                if (tpatUrls$default != null) {
                    com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this;
                    java.util.Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        com.vungle.ads.internal.network.TpatRequest.Builder tpatKey = new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.DEEPLINK_CLICK);
                        logEntry = nativeAdPresenter.getLogEntry();
                        com.vungle.ads.internal.network.TpatRequest build = tpatKey.withLogEntry(logEntry).build();
                        tpatSender = nativeAdPresenter.getTpatSender();
                        com.vungle.ads.internal.network.TpatSender.sendTpat$default(tpatSender, build, false, 2, null);
                    }
                }
            }
        });
        com.vungle.ads.internal.presenter.AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext("open", "adClick", this.delegate.getPlacementRefId());
        }
        if (!launch$vungle_ads_release || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
    }

    private final void onPrivacy(java.lang.String privacyUrl) {
        boolean launch$vungle_ads_release;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        if (privacyUrl != null) {
            if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(privacyUrl)) {
                launch$vungle_ads_release = com.vungle.ads.internal.util.ExternalRouter.INSTANCE.launch$vungle_ads_release((r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : privacyUrl, this.context, (r13 & 8) != 0 ? null : getLogEntry(), (r13 & 16) != 0 ? null : null);
                if (launch$vungle_ads_release) {
                    com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
                        return;
                    }
                    return;
                }
                new com.vungle.ads.PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            new com.vungle.ads.PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public final void prepare() {
        start();
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        android.app.Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        java.lang.Long l = this.adStartTime;
        if (l != null) {
            java.util.List<java.lang.String> tpatUrls = this.advertisement.getTpatUrls(com.vungle.ads.internal.Constants.AD_CLOSE, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - l.longValue()), java.lang.String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                java.util.Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.TpatSender.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    private final boolean needShowGdpr() {
        return com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.Intrinsics.areEqual("unknown", com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void showGdpr() {
        com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof android.app.Activity)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.vungle.ads.internal.presenter.NativeAdPresenter.m10460showGdpr$lambda7(com.vungle.ads.internal.presenter.NativeAdPresenter.this, dialogInterface, i);
            }
        };
        java.lang.String gDPRConsentTitle = com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentTitle();
        java.lang.String gDPRConsentMessage = com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentMessage();
        java.lang.String gDPRButtonAccept = com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonAccept();
        java.lang.String gDPRButtonDeny = com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonDeny();
        android.content.Context context = this.context;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(new android.view.ContextThemeWrapper(context, ((android.app.Activity) context).getApplicationInfo().theme));
        java.lang.String str = gDPRConsentTitle;
        if (str != null && str.length() != 0) {
            builder.setTitle(str);
        }
        java.lang.String str2 = gDPRConsentMessage;
        if (str2 != null && str2.length() != 0) {
            builder.setMessage(str2);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        android.app.AlertDialog create = builder.create();
        create.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                com.vungle.ads.internal.presenter.NativeAdPresenter.m10461showGdpr$lambda8(com.vungle.ads.internal.presenter.NativeAdPresenter.this, dialogInterface);
            }
        });
        this.currentDialog = create;
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-7, reason: not valid java name */
    public static final void m10460showGdpr$lambda7(com.vungle.ads.internal.presenter.NativeAdPresenter this$0, android.content.DialogInterface dialogInterface, int i) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -2) {
            value = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_OUT.getValue();
        } else if (i != -1) {
            value = "opted_out_by_timeout";
        } else {
            value = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_IN.getValue();
        }
        com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m10461showGdpr$lambda8(com.vungle.ads.internal.presenter.NativeAdPresenter this$0, android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentDialog = null;
    }

    public final void initAndStartOMTracker(android.view.View view, java.lang.String omSdkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        boolean omEnabled = this.advertisement.omEnabled();
        if (omSdkData.length() <= 0 || !omEnabled) {
            return;
        }
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        java.lang.String oMSDKJS$vungle_ads_release = m10459initAndStartOMTracker$lambda9(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.omsdk.OMInjector>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$initAndStartOMTracker$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.omsdk.OMInjector invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.omsdk.OMInjector.class);
            }
        })).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = new com.vungle.ads.internal.omsdk.NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release, this.delegate.isNativeVideo());
            nativeOMTracker.start(view);
            this.omTracker = nativeOMTracker;
        }
    }

    /* renamed from: initAndStartOMTracker$lambda-9, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.OMInjector m10459initAndStartOMTracker$lambda9(kotlin.Lazy<com.vungle.ads.internal.omsdk.OMInjector> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onOMEvent$default(com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        nativeAdPresenter.onOMEvent(i, map);
    }

    public final void onOMEvent(int event, java.util.Map<java.lang.String, ? extends java.lang.Object> args) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onOMEvent: event=" + event + " value=" + args);
        if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.multipleOMEventEnabledMap.get(java.lang.Integer.valueOf(event)), (java.lang.Object) true) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.firedOMEventMap.get(java.lang.Integer.valueOf(event)), (java.lang.Object) true)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Ignore this already fired om event: " + event);
        }
        this.firedOMEventMap.put(java.lang.Integer.valueOf(event), true);
        switch (event) {
            case 1:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this.omTracker;
                if (nativeOMTracker != null) {
                    nativeOMTracker.onStatePlay();
                    break;
                }
                break;
            case 2:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker2 = this.omTracker;
                if (nativeOMTracker2 != null) {
                    nativeOMTracker2.onStatePaused();
                    break;
                }
                break;
            case 3:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker3 = this.omTracker;
                if (nativeOMTracker3 != null) {
                    nativeOMTracker3.onStateCompleted();
                    break;
                }
                break;
            case 4:
                java.lang.Object obj = args != null ? args.get(com.vungle.ads.internal.NativeAdInternal.QUARTILE_START_KEY_DURATION) : null;
                java.lang.Number number = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
                float floatValue = number != null ? number.floatValue() : 0.0f;
                java.lang.Object obj2 = args != null ? args.get(com.vungle.ads.internal.NativeAdInternal.QUARTILE_START_KEY_VOLUME) : null;
                java.lang.Number number2 = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
                float floatValue2 = number2 != null ? number2.floatValue() : 0.0f;
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker4 = this.omTracker;
                if (nativeOMTracker4 != null) {
                    nativeOMTracker4.onQuartileStart(floatValue, floatValue2);
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker5 = this.omTracker;
                if (nativeOMTracker5 != null) {
                    nativeOMTracker5.onQuartileChanged(event);
                    break;
                }
                break;
            case 8:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker6 = this.omTracker;
                if (nativeOMTracker6 != null) {
                    nativeOMTracker6.onUserInteraction();
                    break;
                }
                break;
            case 9:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker7 = this.omTracker;
                if (nativeOMTracker7 != null) {
                    nativeOMTracker7.onMuteChanged(true);
                    break;
                }
                break;
            case 10:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker8 = this.omTracker;
                if (nativeOMTracker8 != null) {
                    nativeOMTracker8.onMuteChanged(false);
                    break;
                }
                break;
            case 11:
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker9 = this.omTracker;
                if (nativeOMTracker9 != null) {
                    nativeOMTracker9.impressionOccurred();
                    break;
                }
                break;
        }
    }
}
