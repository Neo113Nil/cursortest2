package com.vungle.ads.internal.presenter;

/* compiled from: MRAIDPresenter.kt */
@kotlin.Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 ª\u00012\u00020\u00012\u00020\u0002:\u0002ª\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J#\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010[0k2\u0006\u0010l\u001a\u00020mH\u0001¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020pH\u0002J\u0012\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010[H\u0002J\u0010\u0010t\u001a\u00020p2\b\b\u0001\u0010u\u001a\u00020vJ\r\u0010w\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\u0006\u0010x\u001a\u00020pJ$\u0010y\u001a\u00020p2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u001e2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010[H\u0002J\u0012\u0010~\u001a\u00020\u001e2\b\u0010\u007f\u001a\u0004\u0018\u00010[H\u0002J\u000b\u0010\u0080\u0001\u001a\u0004\u0018\u00010{H\u0002J\u0016\u0010\u0081\u0001\u001a\u00020p2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010[H\u0002J\u001c\u0010\u0083\u0001\u001a\u00020p2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010[H\u0000¢\u0006\u0003\b\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020{H\u0002J\u001b\u0010\u0086\u0001\u001a\u00020p2\u0007\u0010\u0087\u0001\u001a\u00020[2\u0007\u0010\u0088\u0001\u001a\u00020\u001eH\u0016J!\u0010\u0089\u0001\u001a\u00020p2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0007\u0010\u008e\u0001\u001a\u00020pJ\u0013\u0010\u008f\u0001\u001a\u00020p2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001J&\u0010\u0092\u0001\u001a\u00020\u001e2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0003\u0010\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020pJ\u001c\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0097\u0001\u001a\u00020[2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0011\u0010\u009a\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020{H\u0002J\t\u0010\u009b\u0001\u001a\u00020pH\u0002J\u0010\u0010\u009c\u0001\u001a\u00020p2\u0007\u0010\u009d\u0001\u001a\u00020\u001eJ\u0012\u0010\u009e\u0001\u001a\u00020p2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010%J\u0019\u0010 \u0001\u001a\u00020p2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0003\b¡\u0001J\u0019\u0010¢\u0001\u001a\u00020p2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0003\b£\u0001J\u000f\u0010¤\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0003\b¥\u0001J\u0007\u0010¦\u0001\u001a\u00020pJ\u0007\u0010§\u0001\u001a\u00020pJ\u0012\u0010¨\u0001\u001a\u00020p2\u0007\u0010©\u0001\u001a\u00020[H\u0002R(\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u001a\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R!\u0010+\u001a\u00020,8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010/R\u000e\u00102\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00103\u001a\u0002048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u0015\u001a\u0004\b6\u00107R$\u00108\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010>\u001a\u0004\u0018\u00010?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\b@\u0010AR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bE\u0010FR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bL\u0010MR\u000e\u0010O\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010P\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00101\u001a\u0004\bW\u0010XR&\u0010Z\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\\\u0010\u0015\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bb\u0010\u0015\u001a\u0004\bc\u0010;\"\u0004\bd\u0010=R\u001b\u0010e\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00101\u001a\u0004\bg\u0010hR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006«\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "vungleWebClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "executor", "Ljava/util/concurrent/Executor;", "omTracker", "Lcom/vungle/ads/internal/omsdk/OMTracker;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "getAdStartTime$vungle_ads_release$annotations", "()V", "getAdStartTime$vungle_ads_release", "()Ljava/lang/Long;", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "appStoreDelegate", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "backEnabled", "", "getBackEnabled$vungle_ads_release$annotations", "getBackEnabled$vungle_ads_release", "()Z", "setBackEnabled$vungle_ads_release", "(Z)V", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus$annotations", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "Lkotlin/Lazy;", "cp0Fired", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lastUserInteractionTimestamp", "getLastUserInteractionTimestamp$vungle_ads_release$annotations", "getLastUserInteractionTimestamp$vungle_ads_release", "()J", "setLastUserInteractionTimestamp$vungle_ads_release", "(J)V", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "scheduler", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "sendReportIncentivized", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "userId", "", "getUserId$vungle_ads_release$annotations", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "(Ljava/lang/String;)V", "videoLength", "getVideoLength$vungle_ads_release$annotations", "getVideoLength$vungle_ads_release", "setVideoLength$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "checkInlineInstallIntent", "Lkotlin/Pair;", "intent", "Landroid/content/Intent;", "checkInlineInstallIntent$vungle_ads_release", "closeView", "", "createDeeplinkCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "deeplinkUrl", "detach", "stopReason", "", "getViewStatus", "handleExit", "handleWebViewException", "reason", "Lcom/vungle/ads/VungleError;", "fatal", "errorMessage", "launchInlineInstall", "url", "loadMraidAd", "logInlineInstallFailure", "message", "logInlineInstallSuccess", "logInlineInstallSuccess$vungle_ads_release", "makeBusError", "onReceivedError", "errorDesc", "didCrash", "onRenderProcessUnresponsive", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onViewConfigurationChanged", "onViewTouched", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onWebRenderingProcessGone", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "prepare", "processCommand", com.ironsource.sdk.controller.f.b.g, "arguments", "Lkotlinx/serialization/json/JsonObject;", "reportErrorAndCloseAd", "sendAdCloseEvent", "setAdVisibility", com.ironsource.X3.i.o, "setEventListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOpenActivityDelegate", "setOpenActivityDelegate$vungle_ads_release", "setPresenterDelegate", "setPresenterDelegate$vungle_ads_release", "shouldBlockAutoRedirect", "shouldBlockAutoRedirect$vungle_ads_release", "start", "stop", "triggerEventMetricForTpat", com.ironsource.X3.i.W, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MRAIDPresenter implements com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate, com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler {
    private static final java.lang.String ACTION = "action";
    public static final java.lang.String ACTION_WITH_VALUE = "actionWithValue";
    public static final java.lang.String CLOSE = "close";
    public static final java.lang.String CONSENT_ACTION = "consentAction";
    public static final java.lang.String DETECT_BLACK_SCREEN = "detectBlackScreen";
    public static final java.lang.String ERROR = "error";
    public static final java.lang.String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    public static final java.lang.String OPEN = "open";
    private static final java.lang.String OPEN_APP_STORE = "openAppStore";
    private static final java.lang.String OPEN_NON_MRAID = "openNonMraid";
    public static final java.lang.String OPEN_PRIVACY = "openPrivacy";
    public static final java.lang.String PING_URL = "pingUrl";
    public static final java.lang.String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final java.lang.String SUCCESSFUL_VIEW = "successfulView";
    private static final java.lang.String TAG = "MRAIDPresenter";
    public static final java.lang.String TPAT = "tpat";
    public static final java.lang.String UPDATE_SIGNALS = "updateSignals";
    private static final java.lang.String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final java.lang.String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final java.lang.String VIDEO_LENGTH = "videoLength";
    private java.lang.Long adStartTime;
    private final com.vungle.ads.internal.ui.view.MRAIDAdWidget adWidget;
    private final com.vungle.ads.internal.model.AdPayload advertisement;
    private com.vungle.ads.internal.presenter.OpenActivityDelegate appStoreDelegate;
    private boolean backEnabled;
    private com.vungle.ads.internal.presenter.AdEventListener bus;

    /* renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy clickCoordinateTracker;
    private boolean cp0Fired;
    private java.util.concurrent.Executor executor;
    private final java.util.concurrent.atomic.AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    /* renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy logEntry;
    private final com.vungle.ads.internal.omsdk.OMTracker omTracker;

    /* renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy pathProvider;
    private final com.vungle.ads.internal.model.Placement placement;
    private final com.vungle.ads.internal.platform.Platform platform;
    private com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate;

    /* renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy scheduler;
    private final java.util.concurrent.atomic.AtomicBoolean sendReportIncentivized;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy signalManager;

    /* renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy tpatSender;
    private java.lang.String userId;
    private long videoLength;

    /* renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy vungleApiClient;
    private final com.vungle.ads.internal.ui.VungleWebClient vungleWebClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.presenter.MRAIDPresenter.Companion INSTANCE = new com.vungle.ads.internal.presenter.MRAIDPresenter.Companion(null);
    private static final java.util.Map<java.lang.String, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType> eventMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.vungle.ads.internal.Constants.CHECKPOINT_0, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), kotlin.TuplesKt.to(com.vungle.ads.internal.Constants.CLICK_URL, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    public MRAIDPresenter(com.vungle.ads.internal.ui.view.MRAIDAdWidget adWidget, com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.ui.VungleWebClient vungleWebClient, java.util.concurrent.Executor executor, com.vungle.ads.internal.omsdk.OMTracker omTracker, com.vungle.ads.internal.platform.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.sendReportIncentivized = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        this.vungleApiClient = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context2 = adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.pathProvider = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.PathProvider invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context2).getService(com.vungle.ads.internal.util.PathProvider.class);
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context3 = adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.signalManager = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.signals.SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.signals.SignalManager invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context3).getService(com.vungle.ads.internal.signals.SignalManager.class);
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion4 = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context4 = adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.tpatSender = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.TpatSender invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context4).getService(com.vungle.ads.internal.network.TpatSender.class);
            }
        });
        this.scheduler = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.HandlerScheduler invoke() {
                return new com.vungle.ads.internal.util.HandlerScheduler();
            }
        });
        this.logEntry = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.LogEntry>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.LogEntry invoke() {
                com.vungle.ads.internal.model.AdPayload adPayload;
                adPayload = com.vungle.ads.internal.presenter.MRAIDPresenter.this.advertisement;
                return adPayload.getLogEntry();
            }
        });
        this.clickCoordinateTracker = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.ClickCoordinateTracker invoke() {
                com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget;
                com.vungle.ads.internal.model.AdPayload adPayload;
                mRAIDAdWidget = com.vungle.ads.internal.presenter.MRAIDPresenter.this.adWidget;
                android.content.Context context5 = mRAIDAdWidget.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context5, "adWidget.context");
                adPayload = com.vungle.ads.internal.presenter.MRAIDPresenter.this.advertisement;
                return new com.vungle.ads.internal.ClickCoordinateTracker(context5, adPayload);
            }
        });
    }

    /* renamed from: getLastUserInteractionTimestamp$vungle_ads_release, reason: from getter */
    public final long getLastUserInteractionTimestamp() {
        return this.lastUserInteractionTimestamp;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j) {
        this.lastUserInteractionTimestamp = j;
    }

    public final com.vungle.ads.internal.presenter.AdEventListener getBus() {
        return this.bus;
    }

    public final void setBus(com.vungle.ads.internal.presenter.AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    /* renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    /* renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final java.lang.Long getAdStartTime() {
        return this.adStartTime;
    }

    public final void setAdStartTime$vungle_ads_release(java.lang.Long l) {
        this.adStartTime = l;
    }

    /* renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final void setUserId$vungle_ads_release(java.lang.String str) {
        this.userId = str;
    }

    private final com.vungle.ads.internal.network.VungleApiClient getVungleApiClient() {
        return (com.vungle.ads.internal.network.VungleApiClient) this.vungleApiClient.getValue();
    }

    private final com.vungle.ads.internal.util.PathProvider getPathProvider() {
        return (com.vungle.ads.internal.util.PathProvider) this.pathProvider.getValue();
    }

    private final com.vungle.ads.internal.signals.SignalManager getSignalManager() {
        return (com.vungle.ads.internal.signals.SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.TpatSender getTpatSender() {
        return (com.vungle.ads.internal.network.TpatSender) this.tpatSender.getValue();
    }

    private final com.vungle.ads.internal.util.HandlerScheduler getScheduler() {
        return (com.vungle.ads.internal.util.HandlerScheduler) this.scheduler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return (com.vungle.ads.internal.util.LogEntry) this.logEntry.getValue();
    }

    /* renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final com.vungle.ads.internal.ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (com.vungle.ads.internal.ClickCoordinateTracker) this.clickCoordinateTracker.getValue();
    }

    /* renamed from: getVideoLength$vungle_ads_release, reason: from getter */
    public final long getVideoLength() {
        return this.videoLength;
    }

    public final void setVideoLength$vungle_ads_release(long j) {
        this.videoLength = j;
    }

    /* compiled from: MRAIDPresenter.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0002R\u0016\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0002R\u0016\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0002R\u0016\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u0016\u0010 \u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0002R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0002R(\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(0'8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", com.facebook.share.internal.ShareConstants.ACTION, "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "DETECT_BLACK_SCREEN", "getDETECT_BLACK_SCREEN$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_APP_STORE", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "PING_URL", "getPING_URL$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        private Companion() {
        }

        public final java.util.Map<java.lang.String, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return com.vungle.ads.internal.presenter.MRAIDPresenter.eventMap;
        }
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.AdEventListener listener) {
        this.bus = listener;
    }

    public final void setPresenterDelegate$vungle_ads_release(com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(com.vungle.ads.internal.presenter.OpenActivityDelegate appStoreDelegate) {
        this.appStoreDelegate = appStoreDelegate;
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void start() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    public final void detach(@com.vungle.ads.internal.ui.view.MRAIDAdWidget.AdStopReason int stopReason) {
        com.vungle.ads.internal.presenter.AdEventListener adEventListener;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "detach()");
        boolean z = (stopReason & 1) != 0;
        boolean z2 = (stopReason & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z && z2 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
    }

    public final void setAdVisibility(boolean isViewable) {
        this.vungleWebClient.setAdVisibility(isViewable);
    }

    public final void onViewTouched(android.view.MotionEvent event) {
        if (event != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = java.lang.System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(event);
        }
    }

    private final void sendAdCloseEvent() {
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
    }

    private final void closeView() {
        if (com.vungle.ads.internal.util.ThreadUtil.INSTANCE.isMainThread()) {
            this.executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.presenter.MRAIDPresenter.m10455closeView$lambda3(com.vungle.ads.internal.presenter.MRAIDPresenter.this);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$closeView$2
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
                com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget;
                mRAIDAdWidget = com.vungle.ads.internal.presenter.MRAIDPresenter.this.adWidget;
                mRAIDAdWidget.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m10455closeView$lambda3(com.vungle.ads.internal.presenter.MRAIDPresenter this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sendAdCloseEvent();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    private final com.vungle.ads.internal.ui.PresenterAdOpenCallback createDeeplinkCallback(final java.lang.String deeplinkUrl) {
        return new com.vungle.ads.internal.ui.PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$createDeeplinkCallback$1
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
                    com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = this;
                    java.util.Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        com.vungle.ads.internal.network.TpatRequest.Builder tpatKey = new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.DEEPLINK_CLICK);
                        logEntry = mRAIDPresenter.getLogEntry();
                        com.vungle.ads.internal.network.TpatRequest build = tpatKey.withLogEntry(logEntry).build();
                        tpatSender = mRAIDPresenter.getTpatSender();
                        com.vungle.ads.internal.network.TpatSender.sendTpat$default(tpatSender, build, false, 2, null);
                    }
                }
            }
        };
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> checkInlineInstallIntent$vungle_ads_release(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.content.ComponentName resolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        java.lang.String packageName = resolveActivity != null ? resolveActivity.getPackageName() : null;
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(packageName, "com.android.vending")), packageName);
    }

    private final boolean launchInlineInstall(java.lang.String url) {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pair;
        com.vungle.ads.internal.util.ExternalRouter externalRouter = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        android.content.Context context = this.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        android.content.Intent intentFromUrl$vungle_ads_release = externalRouter.getIntentFromUrl$vungle_ads_release(context, url);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + url + ", message: intent is null");
            return false;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> checkInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean booleanValue = checkInlineInstallIntent$vungle_ads_release.component1().booleanValue();
        java.lang.String component2 = checkInlineInstallIntent$vungle_ads_release.component2();
        if (!booleanValue) {
            logInlineInstallFailure("url: " + url + ", message: resolveInfo " + component2);
            return false;
        }
        com.vungle.ads.internal.presenter.OpenActivityDelegate openActivityDelegate = this.appStoreDelegate;
        if (openActivityDelegate == null || (pair = openActivityDelegate.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            pair = new kotlin.Pair<>(false, null);
        }
        boolean booleanValue2 = pair.component1().booleanValue();
        java.lang.String component22 = pair.component2();
        if (!booleanValue2) {
            logInlineInstallFailure("url: " + url + ", message: " + component22);
            return false;
        }
        logInlineInstallSuccess$vungle_ads_release("url: " + url);
        return true;
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    public final void logInlineInstallSuccess$vungle_ads_release(java.lang.String message) {
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(1L);
        com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
    }

    static /* synthetic */ void logInlineInstallFailure$default(com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    private final void logInlineInstallFailure(java.lang.String message) {
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logInlineInstallFailure$1
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
                com.vungle.ads.internal.ui.VungleWebClient vungleWebClient;
                vungleWebClient = com.vungle.ads.internal.presenter.MRAIDPresenter.this.vungleWebClient;
                vungleWebClient.notifyPresentAppStoreFailed();
            }
        });
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(2L);
        com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
        com.vungle.ads.AnalyticsClient.INSTANCE.logError$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, java.lang.String.valueOf(message), getLogEntry());
    }

    private final void triggerEventMetricForTpat(java.lang.String key) {
        com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(key);
        if (sDKMetricType != null) {
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(sDKMetricType), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        }
    }

    public final java.lang.Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0259, code lost:
    
        if (r25.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0244, code lost:
    
        if (r25.equals("open") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025d, code lost:
    
        r0 = r24.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0263, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0265, code lost:
    
        r10 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0269, code lost:
    
        r0 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r26, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0275, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r0) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0277, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029c, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x029e, code lost:
    
        r24.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02bb, code lost:
    
        r24.lastUserInteractionTimestamp = 0;
        r18 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        r1 = r24.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "adWidget.context");
        r0 = r18.launch$vungle_ads_release(r10, r0, r1, getLogEntry(), createDeeplinkCallback(r10));
        r1 = r24.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02de, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        r1.onNext("open", "adClick", r24.placement.getReferenceId());
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02eb, code lost:
    
        if (r0 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r0 = r24.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f1, code lost:
    
        r0.onNext("open", "adLeftApplication", r24.placement.getReferenceId());
        r0 = kotlin.Unit.INSTANCE;
     */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean processCommand(java.lang.String command, kotlinx.serialization.json.JsonObject arguments) {
        int i;
        java.lang.Integer intOrNull;
        java.lang.Object m10798constructorimpl;
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map;
        boolean launch$vungle_ads_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arguments, "arguments");
        java.lang.String str2 = null;
        switch (command.hashCode()) {
            case -1988620632:
                if (command.equals(DETECT_BLACK_SCREEN)) {
                    java.lang.String contentStringValue = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "samplingFactor");
                    if (contentStringValue != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(contentStringValue)) != null) {
                        java.lang.Integer num = intOrNull.intValue() > 0 ? intOrNull : null;
                        if (num != null) {
                            i = num.intValue();
                            this.vungleWebClient.handleBlackScreenDetection(i);
                            break;
                        }
                    }
                    i = 100;
                    this.vungleWebClient.handleBlackScreenDetection(i);
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1912374177:
                if (command.equals(SUCCESSFUL_VIEW)) {
                    com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext(SUCCESSFUL_VIEW, null, this.placement.getReferenceId());
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    if (this.placement.isRewardedVideo() && com.vungle.ads.internal.ConfigManager.INSTANCE.isReportIncentivizedEnabled() && !this.sendReportIncentivized.getAndSet(true)) {
                        this.executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.vungle.ads.internal.presenter.MRAIDPresenter.m10457processCommand$lambda11(com.vungle.ads.internal.presenter.MRAIDPresenter.this);
                            }
                        });
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1422950858:
                if (command.equals("action")) {
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -735200587:
                if (command.equals(ACTION_WITH_VALUE)) {
                    java.lang.String contentStringValue2 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    java.lang.String contentStringValue3 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "value");
                    if (kotlin.text.StringsKt.equals("videoLength", contentStringValue2, true)) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter = this;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(contentStringValue3 != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(contentStringValue3)) : null);
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        java.lang.Long l = (java.lang.Long) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
                        this.videoLength = l != null ? l.longValue() : 0L;
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -660787472:
                if (command.equals(CONSENT_ACTION)) {
                    com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateGdprConsent((kotlin.jvm.internal.Intrinsics.areEqual(com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, androidx.core.app.NotificationCompat.CATEGORY_EVENT), com.vungle.ads.internal.privacy.PrivacyConsent.OPT_OUT.getValue()) ? com.vungle.ads.internal.privacy.PrivacyConsent.OPT_OUT : com.vungle.ads.internal.privacy.PrivacyConsent.OPT_IN).getValue(), "vungle_modal", null);
                    break;
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -649897046:
                if (command.equals(OPEN_APP_STORE)) {
                    com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = this.advertisement.adUnit();
                    java.lang.String deeplinkUrl = adUnit != null ? adUnit.getDeeplinkUrl() : null;
                    java.lang.String contentStringValue4 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    if (!com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(contentStringValue4)) {
                        new com.vungle.ads.InvalidCTAUrl("Invalid InlineInstall Url (" + contentStringValue4 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.lastUserInteractionTimestamp = java.lang.System.currentTimeMillis();
                    com.vungle.ads.internal.util.ExternalRouter externalRouter = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
                    android.content.Context context = this.adWidget.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
                    boolean launch$vungle_ads_release2 = externalRouter.launch$vungle_ads_release(deeplinkUrl, null, context, getLogEntry(), createDeeplinkCallback(deeplinkUrl));
                    if (!launch$vungle_ads_release2) {
                        launch$vungle_ads_release2 = launchInlineInstall(contentStringValue4);
                    }
                    if (launch$vungle_ads_release2) {
                        com.vungle.ads.internal.presenter.AdEventListener adEventListener2 = this.bus;
                        if (adEventListener2 != null) {
                            adEventListener2.onNext("open", "adClick", this.placement.getReferenceId());
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                        com.vungle.ads.internal.presenter.AdEventListener adEventListener3 = this.bus;
                        if (adEventListener3 != null) {
                            adEventListener3.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            break;
                        }
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -568000867:
                if (command.equals(PING_URL)) {
                    java.lang.String contentStringValue5 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "requestType");
                    if (contentStringValue5 != null) {
                        str = contentStringValue5.toUpperCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    } else {
                        str = null;
                    }
                    if (!kotlin.collections.CollectionsKt.contains(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"GET", "POST"}), str)) {
                        new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR, "Invalid request type: " + str + ". Only 'GET' and 'POST' are supported").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        java.lang.String contentStringValue6 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                        java.lang.String contentStringValue7 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "requestData");
                        boolean parseBoolean = java.lang.Boolean.parseBoolean(com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "retry"));
                        java.lang.String contentStringValue8 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "headers");
                        if (contentStringValue8 != null) {
                            try {
                                kotlinx.serialization.json.Json.Companion companion3 = kotlinx.serialization.json.Json.INSTANCE;
                                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(companion3.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class))));
                                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                                map = (java.util.Map) companion3.decodeFromString(serializer, contentStringValue8);
                            } catch (java.lang.Exception unused) {
                                new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR, "Failed to decode header: " + contentStringValue8).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                return true;
                            }
                        } else {
                            map = null;
                        }
                        if (!com.vungle.ads.internal.util.Utils.INSTANCE.isUrlValid(contentStringValue6)) {
                            new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else if (contentStringValue6 != null) {
                            com.vungle.ads.internal.network.TpatRequest.Builder withLogEntry = new com.vungle.ads.internal.network.TpatRequest.Builder(contentStringValue6).headers(map).body(contentStringValue7).regularRetry(parseBoolean).tpatKey(PING_URL).withLogEntry(getLogEntry());
                            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "GET")) {
                                withLogEntry.get();
                            } else {
                                withLogEntry.post();
                            }
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            com.vungle.ads.internal.network.TpatSender.sendTpat$default(getTpatSender(), withLogEntry.build(), false, 2, null);
                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            break;
                        }
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -511324706:
                if (command.equals("openPrivacy")) {
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                    java.lang.String contentStringValue9 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    java.lang.String str3 = contentStringValue9;
                    if (str3 != null && str3.length() != 0 && com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(contentStringValue9)) {
                        com.vungle.ads.internal.util.ExternalRouter externalRouter2 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
                        android.content.Context context2 = this.adWidget.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
                        launch$vungle_ads_release = externalRouter2.launch$vungle_ads_release((r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : contentStringValue9, context2, (r13 & 8) != 0 ? null : getLogEntry(), (r13 & 16) != 0 ? null : null);
                        if (!launch$vungle_ads_release) {
                            new com.vungle.ads.PrivacyUrlError(contentStringValue9).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else {
                            com.vungle.ads.internal.presenter.AdEventListener adEventListener4 = this.bus;
                            if (adEventListener4 != null) {
                                adEventListener4.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                break;
                            }
                        }
                    } else {
                        if (contentStringValue9 == null) {
                            contentStringValue9 = "nonePrivacyUrl";
                        }
                        new com.vungle.ads.PrivacyUrlError(contentStringValue9).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -418575596:
                break;
            case -348095344:
                if (command.equals(USE_CUSTOM_PRIVACY)) {
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 3417674:
                break;
            case 3566511:
                if (command.equals("tpat")) {
                    java.lang.String contentStringValue10 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    java.lang.String str4 = contentStringValue10;
                    if (str4 != null && str4.length() != 0) {
                        triggerEventMetricForTpat(contentStringValue10);
                        java.util.List<java.lang.String> tpatUrls = kotlin.jvm.internal.Intrinsics.areEqual(contentStringValue10, com.vungle.ads.internal.Constants.CHECKPOINT_0) ? this.advertisement.getTpatUrls(contentStringValue10, this.platform.getCarrierName(), java.lang.String.valueOf(this.platform.getVolumeLevel())) : kotlin.jvm.internal.Intrinsics.areEqual(contentStringValue10, com.vungle.ads.internal.Constants.VIDEO_LENGTH_TPAT) ? com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, contentStringValue10, java.lang.String.valueOf(this.videoLength), null, 4, null) : com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(this.advertisement, contentStringValue10, null, null, 6, null);
                        if (tpatUrls != null) {
                            java.util.Iterator<T> it = tpatUrls.iterator();
                            while (it.hasNext()) {
                                com.vungle.ads.internal.network.TpatSender.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(contentStringValue10).withLogEntry(getLogEntry()).build(), false, 2, null);
                            }
                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(contentStringValue10, com.vungle.ads.internal.Constants.CHECKPOINT_0) && !this.cp0Fired) {
                            this.cp0Fired = true;
                            com.vungle.ads.internal.presenter.AdEventListener adEventListener5 = this.bus;
                            if (adEventListener5 != null) {
                                adEventListener5.onNext("adViewed", null, this.placement.getReferenceId());
                                kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                            }
                            com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$3
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
                                    com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget;
                                    mRAIDAdWidget = com.vungle.ads.internal.presenter.MRAIDPresenter.this.adWidget;
                                    mRAIDAdWidget.setVisibility(0);
                                }
                            });
                            break;
                        }
                    } else {
                        new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 94756344:
                if (command.equals("close")) {
                    closeView();
                    break;
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 96784904:
                if (command.equals("error")) {
                    java.lang.String contentStringValue11 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "code");
                    final boolean parseBoolean2 = java.lang.Boolean.parseBoolean(com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "fatal"));
                    java.lang.String contentStringValue12 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "errorMessage");
                    final java.lang.String str5 = contentStringValue11 + " : " + contentStringValue12;
                    final com.vungle.ads.MraidTemplateError mraidTemplateError = new com.vungle.ads.MraidTemplateError(parseBoolean2 ? com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR : com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR, str5);
                    com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$7
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
                            com.vungle.ads.internal.presenter.MRAIDPresenter.this.handleWebViewException(mraidTemplateError, parseBoolean2, str5);
                        }
                    });
                    break;
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 133423073:
                if (command.equals("setOrientationProperties")) {
                    java.lang.String contentStringValue13 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "forceOrientation");
                    java.lang.String str6 = contentStringValue13;
                    if (str6 != null && str6.length() != 0) {
                        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        java.lang.String lowerCase = contentStringValue13.toLowerCase(ENGLISH);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "landscape")) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "portrait")) {
                                this.adWidget.setOrientation(7);
                                break;
                            }
                        } else {
                            this.adWidget.setOrientation(6);
                            break;
                        }
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 592314818:
                if (command.equals(UPDATE_SIGNALS)) {
                    java.lang.String contentStringValue14 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(arguments, "signals");
                    java.lang.String str7 = contentStringValue14;
                    if (str7 != null && str7.length() != 0) {
                        getSignalManager().updateTemplateSignals(contentStringValue14);
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1496446614:
                if (command.equals(GET_AVAILABLE_DISK_SPACE)) {
                    try {
                        android.content.Context context3 = this.adWidget.getContext();
                        java.io.File noBackupFilesDir = context3.getNoBackupFilesDir();
                        com.vungle.ads.internal.util.PathProvider pathProvider = getPathProvider();
                        java.lang.String path = noBackupFilesDir.getPath();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "dir.path");
                        final long availableBytes = pathProvider.getAvailableBytes(path);
                        com.vungle.ads.internal.util.Utils utils = com.vungle.ads.internal.util.Utils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "context");
                        final long webViewDataSize = utils.getWebViewDataSize(context3);
                        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$8
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
                                com.vungle.ads.internal.ui.VungleWebClient vungleWebClient;
                                vungleWebClient = com.vungle.ads.internal.presenter.MRAIDPresenter.this.vungleWebClient;
                                vungleWebClient.notifyDiskAvailableSize(availableBytes, webViewDataSize);
                            }
                        });
                        break;
                    } catch (java.lang.Exception e) {
                        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to get available disk space: " + e.getMessage());
                        break;
                    }
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1614272768:
                if (command.equals(USE_CUSTOM_CLOSE)) {
                }
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            default:
                new com.vungle.ads.MraidTemplateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
        }
        return true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m10457processCommand$lambda11(final com.vungle.ads.internal.presenter.MRAIDPresenter this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.List list = null;
        com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam adSizeParam = null;
        com.vungle.ads.internal.network.Call<java.lang.Void> ri = this$0.getVungleApiClient().ri(new com.vungle.ads.internal.model.CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, (com.vungle.ads.internal.model.CommonRequestBody.CSBParam) null, 67, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (ri == null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Invalid ri call.");
            new com.vungle.ads.NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        ri.enqueue(new com.vungle.ads.internal.network.Callback<java.lang.Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(com.vungle.ads.internal.network.Call<java.lang.Void> call, com.vungle.ads.internal.network.Response<java.lang.Void> response) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(com.vungle.ads.internal.network.Call<java.lang.Void> call, java.lang.Throwable t) {
                com.vungle.ads.internal.util.LogEntry logEntry;
                com.vungle.ads.internal.util.Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error RI API calls: ");
                sb.append(t != null ? t.getLocalizedMessage() : null);
                com.vungle.ads.NetworkUnreachable networkUnreachable = new com.vungle.ads.NetworkUnreachable(sb.toString());
                logEntry = com.vungle.ads.internal.presenter.MRAIDPresenter.this.getLogEntry();
                networkUnreachable.setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        });
    }

    private final void makeBusError(com.vungle.ads.VungleError reason) {
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(reason, this.placement.getReferenceId());
        }
    }

    private final void reportErrorAndCloseAd(com.vungle.ads.VungleError reason) {
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(reason);
        closeView();
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(java.lang.String errorDesc, boolean didCrash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (didCrash) {
            reportErrorAndCloseAd(new com.vungle.ads.WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(android.webkit.WebView view, java.lang.Boolean didCrash) {
        boolean booleanValue = didCrash != null ? didCrash.booleanValue() : true;
        handleWebViewException$default(this, new com.vungle.ads.WebViewRenderingProcessGone("didCrash=" + booleanValue), booleanValue, null, 4, null);
        return true;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new com.vungle.ads.WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    static /* synthetic */ void handleWebViewException$default(com.vungle.ads.internal.presenter.MRAIDPresenter mRAIDPresenter, com.vungle.ads.VungleError vungleError, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(com.vungle.ads.VungleError reason, boolean fatal, java.lang.String errorMessage) {
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "handleWebViewException: " + reason.getLocalizedMessage() + ", fatal: " + fatal + ", errorMsg: " + errorMessage);
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (fatal) {
            makeBusError(reason);
            closeView();
        }
    }

    private final com.vungle.ads.VungleError loadMraidAd() {
        java.lang.String indexFilePath = this.advertisement.getIndexFilePath();
        java.io.File file = indexFilePath != null ? new java.io.File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fail to load html ");
            sb.append(file != null ? file.getPath() : null);
            return new com.vungle.ads.IndexHtmlError(reason, sb.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(com.vungle.ads.internal.model.AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    public final void prepare() {
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.vungle.ads.VungleError loadMraidAd;
        int settings;
        boolean z = false;
        this.isDestroying.set(false);
        com.vungle.ads.AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        com.vungle.ads.AdConfig adConfig2 = this.advertisement.getAdConfig();
        java.lang.Integer valueOf = adConfig2 != null ? java.lang.Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            i = 7;
        } else {
            i = (valueOf != null && valueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (loadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(loadMraidAd);
            return;
        }
        this.adStartTime = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (str = presenterDelegate2.getAlertTitleText()) == null) {
            str = "";
        }
        com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (str2 = presenterDelegate3.getAlertBodyText()) == null) {
            str2 = "";
        }
        com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (str3 = presenterDelegate4.getAlertContinueButtonText()) == null) {
            str3 = "";
        }
        com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (str4 = presenterDelegate5.getAlertCloseButtonText()) == null) {
            str4 = "";
        }
        this.advertisement.setIncentivizedText(str, str2, str3, str4);
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.Intrinsics.areEqual("unknown", com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentStatus())) {
            z = true;
        }
        this.vungleWebClient.setConsentStatus(z, com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentTitle(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentMessage(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonAccept(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonDeny());
        if (z) {
            com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(java.lang.Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new java.lang.Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.presenter.MRAIDPresenter.m10456prepare$lambda15(com.vungle.ads.internal.presenter.MRAIDPresenter.this);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m10456prepare$lambda15(com.vungle.ads.internal.presenter.MRAIDPresenter this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || java.lang.System.currentTimeMillis() - this.lastUserInteractionTimestamp > com.vungle.ads.internal.ConfigManager.INSTANCE.afterClickDuration();
    }
}
