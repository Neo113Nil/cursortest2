package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nBe\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0011\u00108\u001a\u000209H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\t\u0010;\u001a\u000209H\u0096\u0001J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0019\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020BH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u0019\u0010D\u001a\u0002092\u0006\u0010A\u001a\u00020EH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010MJ)\u0010N\u001a\u0002092\u0016\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010PH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010RJ\u0011\u0010S\u001a\u000209H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010T\u001a\u0002092\u0006\u0010U\u001a\u00020VH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010X\u001a\u0002092\u0006\u0010L\u001a\u00020YH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010ZJ\u0019\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020VH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010]\u001a\u0002092\u0006\u0010L\u001a\u00020^H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010_J\u0019\u0010`\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010a\u001a\u0002092\u0006\u0010L\u001a\u00020bH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010cJ\u0019\u0010d\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010e\u001a\u0002092\u0006\u0010f\u001a\u00020VH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010g\u001a\u0002092\u0006\u0010h\u001a\u00020iH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010jJ\u0010\u0010k\u001a\u0002092\u0006\u0010l\u001a\u00020mH\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020+0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010&R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u000201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "orientationRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "context", "Landroid/content/Context;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "wasDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "displayEventsRouter", "Lkotlinx/coroutines/Job;", "displayMessage", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "handleSessionChange", "change", "Lcom/unity3d/ads/core/data/model/SessionChange;", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleVolumeSettingsChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGmaEvent", "Lcom/unity3d/scar/adapter/common/GMAEvent;", "(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendScarBannerEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "sendVisibilityChange", com.ironsource.C3023e8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.ironsource.C3232q2.v, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidFullscreenWebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.FullscreenAdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion INSTANCE = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion(null);
    private static final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> displayMessages = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy adObject;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final java.lang.String opportunityId;
    private final com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository;
    private final com.unity3d.ads.core.data.manager.ScarManager scarManager;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final java.util.concurrent.atomic.AtomicBoolean wasDestroyed;
    private final com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
    private final com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onAllowedPiiChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onBroadcastEvent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendFocusChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendGmaEvent(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendGmaEvent(gMAEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendMuteChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendOfferwallEvent(com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendPrivacyFsmChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendScarBannerEvent(com.unity3d.services.banners.bridge.BannerBridge.BannerEvent bannerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendUserConsentChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVisibilityChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVolumeChange(double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidFullscreenWebViewAdPlayer(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, java.lang.String opportunityId, com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.data.manager.ScarManager scarManager, com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationRepository, "orientationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.model.AdObject>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$adObject$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.data.model.AdObject invoke() {
                java.lang.Object m10798constructorimpl;
                com.unity3d.ads.core.data.repository.AdRepository adRepository2;
                java.lang.String str;
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    adRepository2 = androidFullscreenWebViewAdPlayer.adRepository;
                    str = androidFullscreenWebViewAdPlayer.opportunityId;
                    java.util.UUID fromString = java.util.UUID.fromString(str);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(adRepository2.getAd(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString)));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                    m10798constructorimpl = null;
                }
                return (com.unity3d.ads.core.data.model.AdObject) m10798constructorimpl;
            }
        });
        this.wasDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    private final com.unity3d.ads.core.data.model.AdObject getAdObject() {
        return (com.unity3d.ads.core.data.model.AdObject) this.adObject.getValue();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(com.unity3d.ads.adplayer.ShowOptions showOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof com.unity3d.ads.adplayer.AndroidShowOptions)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        com.unity3d.ads.adplayer.AndroidShowOptions androidShowOptions = (com.unity3d.ads.adplayer.AndroidShowOptions) showOptions;
        boolean isScarAd = androidShowOptions.isScarAd();
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(displayMessages, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1(CompletableDeferred$default, null));
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.String str;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                java.lang.String opportunityId = ((com.unity3d.ads.adplayer.DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(opportunityId, str)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.DisplayMessage> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4(this)), getScope());
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                com.unity3d.ads.core.data.model.ShowEvent showEvent = (com.unity3d.ads.core.data.model.ShowEvent) obj;
                                if ((showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) || (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6(this, null)), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.sessionRepository.getOnChange(), new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7(this)), getScope());
        kotlinx.coroutines.JobKt.getJob(getScope().getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8.AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.destroy(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                if (th != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this.getScope().getCoroutineContext().plus(kotlinx.coroutines.NonCancellable.INSTANCE)), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8.AnonymousClass1(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this, null), 3, null);
                }
            }
        });
        if (isScarAd || isOfferwallAd) {
            if (!isScarAd) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11(CompletableDeferred$default, this, showOptions, null), 3, null);
                return;
            }
            com.unity3d.ads.core.data.manager.ScarManager scarManager = this.scarManager;
            java.lang.String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            java.lang.String scarQueryId = androidShowOptions.getScarQueryId();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10(CompletableDeferred$default, this, kotlinx.coroutines.flow.FlowKt.shareIn(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), 10), showOptions, null), 3, null);
            return;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.unity3d.ads.adplayer.FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        java.util.Map<java.lang.String, java.lang.Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new org.json.JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", this.orientationRepository.getResumedActivityOrientation().getValue().intValue());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9(CompletableDeferred$default, this, intent, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object show$displayEventsRouter(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, com.unity3d.ads.adplayer.DisplayMessage displayMessage, kotlin.coroutines.Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object handleVolumeSettingsChange(com.unity3d.ads.core.data.datasource.VolumeSettingsChange volumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (volumeSettingsChange instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) {
            java.lang.Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return sendMuteChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendMuteChange : kotlin.Unit.INSTANCE;
        }
        if (!(volumeSettingsChange instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return sendVolumeChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendVolumeChange : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object handleSessionChange(com.unity3d.ads.core.data.model.SessionChange sessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (sessionChange instanceof com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) {
            com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            java.lang.Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return sendUserConsentChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendUserConsentChange : kotlin.Unit.INSTANCE;
        }
        if (!(sessionChange instanceof com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange)) {
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
        java.lang.Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return sendPrivacyFsmChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendPrivacyFsmChange : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 androidFullscreenWebViewAdPlayer$destroy$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer;
        com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) {
            androidFullscreenWebViewAdPlayer$destroy$1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) continuation;
            if ((androidFullscreenWebViewAdPlayer$destroy$1.label & Integer.MIN_VALUE) != 0) {
                androidFullscreenWebViewAdPlayer$destroy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidFullscreenWebViewAdPlayer$destroy$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFullscreenWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.wasDestroyed.getAndSet(true)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.webViewAdPlayer.dispatchShowCompleted();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> mutableSharedFlow = displayMessages;
                    com.unity3d.ads.adplayer.DisplayMessage.DisplayFinishRequest displayFinishRequest = new com.unity3d.ads.adplayer.DisplayMessage.DisplayFinishRequest(this.opportunityId);
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = this;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 1;
                    if (mutableSharedFlow.emit(displayFinishRequest, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidFullscreenWebViewAdPlayer = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                            androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                            androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                            if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidFullscreenWebViewAdPlayer$destroy$1.L$0 = null;
                            androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                            if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidFullscreenWebViewAdPlayer$destroy$1.L$0 = null;
                        androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 2;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                androidFullscreenWebViewAdPlayer$destroy$1.L$0 = null;
                androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1(this, continuation);
        java.lang.Object obj2 = androidFullscreenWebViewAdPlayer$destroy$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFullscreenWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
        }
        webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
        androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
        androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
        if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        androidFullscreenWebViewAdPlayer$destroy$1.L$0 = null;
        androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private final kotlinx.coroutines.Job displayEventsRouter(com.unity3d.ads.adplayer.DisplayMessage displayMessage) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3, null);
        return launch$default;
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> getDisplayMessages() {
            return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }
}
