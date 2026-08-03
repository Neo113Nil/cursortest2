package com.vungle.ads.internal.ui;

/* compiled from: VungleWebClient.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0097\u0001\u0098\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ \u0010c\u001a\u00020`2\u0006\u0010d\u001a\u00020'2\u0006\u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020\u0018H\u0002J\u0010\u0010g\u001a\u00020\u00182\u0006\u0010e\u001a\u00020'H\u0002J\u0018\u0010h\u001a\u00020`2\u0006\u0010i\u001a\u00020b2\b\b\u0002\u0010j\u001a\u00020'J\u0016\u0010k\u001a\u00020`2\u0006\u0010l\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\u000fJ\u0006\u0010n\u001a\u00020`J\u0010\u0010o\u001a\u00020`2\u0006\u0010p\u001a\u00020\u0018H\u0016J\u0010\u0010q\u001a\u00020`2\u0006\u0010r\u001a\u00020\u0018H\u0016J\u001c\u0010s\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0016J&\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J*\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\u0006\u0010z\u001a\u00020b2\u0006\u0010{\u001a\u00020'2\u0006\u0010|\u001a\u00020'H\u0017J&\u0010}\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u001f\u0010\u0080\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0016J2\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010'2\u0007\u0010\u0086\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u0087\u0001J\u001d\u0010\u0088\u0001\u001a\u00020`2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010B2\u0007\u0010\u008a\u0001\u001a\u00020'H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020`2\u0006\u00109\u001a\u00020\u0018H\u0016J>\u0010\u008c\u0001\u001a\u00020`2\u0007\u0010\u008d\u0001\u001a\u00020\u00182\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010'H\u0016J\u0011\u0010\u0092\u0001\u001a\u00020`2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010\u0093\u0001\u001a\u00020`2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0013\u0010\u0094\u0001\u001a\u00020`2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u001f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u001d\u0010\u0096\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R&\u00101\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R&\u00105\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R(\u00109\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010?\u0012\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@R&\u0010A\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u0004\u0018\u00010I8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u001a\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010R\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bS\u0010\u001a\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010X\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bZ\u0010\u001a\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006\u0099\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "blackScreenDetector", "Lcom/vungle/ads/internal/util/BlackScreenDetector;", "getBlackScreenDetector", "()Lcom/vungle/ads/internal/util/BlackScreenDetector;", "blackScreenDetector$delegate", "Lkotlin/Lazy;", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", com.ironsource.X3.i.o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", com.ironsource.X3.i.s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleBlackScreenDetection", "", "samplingFactor", "", "handleWebViewError", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyBlackScreenResult", "percentage", "errorMessage", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPresentAppStoreFailed", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", "message", "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleWebClient extends android.webkit.WebViewClient implements com.vungle.ads.internal.ui.view.WebViewAPI, com.vungle.ads.internal.util.OnSilentModeChangeListener {
    private static final java.lang.String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final java.lang.String TAG = "VungleWebClient";
    private final com.vungle.ads.internal.model.AdPayload advertisement;

    /* renamed from: blackScreenDetector$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy blackScreenDetector;
    private boolean collectConsent;
    private final com.vungle.ads.internal.presenter.PreloadDelegate delegate;
    private com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler errorHandler;
    private java.lang.String gdprAccept;
    private java.lang.String gdprBody;
    private java.lang.String gdprDeny;
    private java.lang.String gdprTitle;
    private java.lang.Boolean isViewable;
    private final java.lang.Long loadDuration;
    private android.webkit.WebView loadedWebView;
    private com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate mraidDelegate;
    private final java.util.concurrent.ExecutorService offloadExecutor;
    private final com.vungle.ads.OneShotSingleValueMetric partialDownloadErrorMetric;
    private final com.vungle.ads.OneShotSingleValueMetric partialDownloadMetric;
    private final com.vungle.ads.internal.model.Placement placement;
    private final com.vungle.ads.internal.platform.Platform platform;
    private boolean ready;
    private final com.vungle.ads.SingleValueMetric skippedUrlMetric;
    private com.vungle.ads.internal.omsdk.WebViewObserver webViewObserver;

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    public /* synthetic */ VungleWebClient(com.vungle.ads.internal.model.AdPayload adPayload, com.vungle.ads.internal.model.Placement placement, java.util.concurrent.ExecutorService executorService, com.vungle.ads.internal.platform.Platform platform, com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i & 8) != 0 ? null : platform, (i & 16) != 0 ? null : preloadDelegate, (i & 32) != 0 ? null : l);
    }

    public VungleWebClient(com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.model.Placement placement, java.util.concurrent.ExecutorService offloadExecutor, com.vungle.ads.internal.platform.Platform platform, com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l;
        this.blackScreenDetector = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.BlackScreenDetector>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$blackScreenDetector$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.BlackScreenDetector invoke() {
                return new com.vungle.ads.internal.util.BlackScreenDetector();
            }
        });
        this.partialDownloadMetric = new com.vungle.ads.OneShotSingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.partialDownloadErrorMetric = new com.vungle.ads.OneShotSingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.skippedUrlMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    private final com.vungle.ads.internal.util.BlackScreenDetector getBlackScreenDetector() {
        return (com.vungle.ads.internal.util.BlackScreenDetector) this.blackScreenDetector.getValue();
    }

    /* renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    /* renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final java.lang.String getGdprTitle() {
        return this.gdprTitle;
    }

    public final void setGdprTitle$vungle_ads_release(java.lang.String str) {
        this.gdprTitle = str;
    }

    /* renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final java.lang.String getGdprBody() {
        return this.gdprBody;
    }

    public final void setGdprBody$vungle_ads_release(java.lang.String str) {
        this.gdprBody = str;
    }

    /* renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final java.lang.String getGdprAccept() {
        return this.gdprAccept;
    }

    public final void setGdprAccept$vungle_ads_release(java.lang.String str) {
        this.gdprAccept = str;
    }

    /* renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final java.lang.String getGdprDeny() {
        return this.gdprDeny;
    }

    public final void setGdprDeny$vungle_ads_release(java.lang.String str) {
        this.gdprDeny = str;
    }

    /* renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final android.webkit.WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    public final void setLoadedWebView$vungle_ads_release(android.webkit.WebView webView) {
        this.loadedWebView = webView;
    }

    /* renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    /* renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    /* renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    /* renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.omsdk.WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(com.vungle.ads.internal.omsdk.WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    /* renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final java.lang.Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void setViewable$vungle_ads_release(java.lang.Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, java.lang.String title, java.lang.String message, java.lang.String accept, java.lang.String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        long j;
        com.vungle.ads.internal.ui.VungleWebClient vungleWebClient;
        android.net.Uri url = request != null ? request.getUrl() : null;
        if (url == null) {
            return null;
        }
        java.lang.String scheme = url.getScheme();
        if (scheme != null) {
            java.util.Locale ROOT = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase = scheme.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, androidx.webkit.ProxyConfig.MATCH_HTTP) && !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.String invoke() {
                            return "shouldInterceptRequest called but partial download is disabled.";
                        }
                    });
                    return null;
                }
                java.lang.String uri = url.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                com.vungle.ads.internal.model.AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(uri);
                java.lang.String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                java.lang.String str = localPath;
                if (str == null || str.length() == 0) {
                    return null;
                }
                java.io.File file = new java.io.File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                final java.lang.String str2 = request.getRequestHeaders().get(com.google.common.net.HttpHeaders.RANGE);
                this.partialDownloadMetric.setMeta(str2 + " cached:" + length + ' ' + uri);
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                kotlin.Pair<java.lang.Long, java.lang.Long> parseRange$vungle_ads_release = parseRange$vungle_ads_release(str2, contentLength);
                localPartialDownloadAssets.setRangeStart(parseRange$vungle_ads_release.getFirst().longValue());
                localPartialDownloadAssets.setRangeEnd(parseRange$vungle_ads_release.getSecond());
                long longValue = parseRange$vungle_ads_release.component1().longValue();
                java.lang.Long component2 = parseRange$vungle_ads_release.component2();
                long j2 = length - longValue;
                com.vungle.ads.internal.util.Logger.INSTANCE.i(TAG, ">>request: " + url + " rangeStart=" + longValue + " rangeEnd=" + component2 + " cachedFileLength=" + length + " availableBytes=" + j2 + " contentLength=" + contentLength + ' ');
                if (j2 <= 0) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldInterceptRequest$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.String invoke() {
                            return "Requested range exceeds cached file: " + str2;
                        }
                    });
                    localPartialDownloadAssets.waitForDownload();
                    j = file.length();
                } else {
                    j = length;
                }
                long longValue2 = component2 != null ? component2.longValue() : j - 1;
                long j3 = (longValue2 - longValue) + 1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    vungleWebClient = this;
                    try {
                        com.vungle.ads.internal.ui.VungleWebClient vungleWebClient2 = vungleWebClient;
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(localPartialDownloadAssets.getMimeType(), "UTF-8", 206, "Partial Content", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Content-Type", localPartialDownloadAssets.getMimeType()), kotlin.TuplesKt.to(com.google.common.net.HttpHeaders.ACCEPT_RANGES, "bytes"), kotlin.TuplesKt.to(com.google.common.net.HttpHeaders.CONTENT_LENGTH, java.lang.String.valueOf(j3)), kotlin.TuplesKt.to(com.google.common.net.HttpHeaders.CONTENT_RANGE, "bytes " + longValue + '-' + longValue2 + kotlinx.io.files.FileSystemKt.UnixPathSeparator + contentLength)), new java.io.BufferedInputStream(fileInputStream, 1024));
                        com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("<<Return:");
                        sb.append(webResourceResponse.getResponseHeaders());
                        companion2.i(TAG, sb.toString());
                        return webResourceResponse;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th)));
                        if (m10801exceptionOrNullimpl == null) {
                            return null;
                        }
                        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error serving local range video: " + m10801exceptionOrNullimpl.getMessage(), m10801exceptionOrNullimpl);
                        vungleWebClient.partialDownloadErrorMetric.setMeta(uri + ' ' + m10801exceptionOrNullimpl.getMessage());
                        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, vungleWebClient.partialDownloadErrorMetric, vungleWebClient.advertisement.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                        return null;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    vungleWebClient = this;
                }
            }
        }
        return null;
    }

    public final kotlin.Pair<java.lang.Long, java.lang.Long> parseRange$vungle_ads_release(java.lang.String rangeHeader, long contentLength) {
        java.lang.Object m10798constructorimpl;
        kotlin.Pair pair;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.VungleWebClient vungleWebClient = this;
            if (rangeHeader != null && kotlin.text.StringsKt.startsWith$default(rangeHeader, "bytes=", false, 2, (java.lang.Object) null)) {
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) kotlin.text.StringsKt.removePrefix(rangeHeader, (java.lang.CharSequence) "bytes="), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 0);
                java.lang.Long longOrNull = str != null ? kotlin.text.StringsKt.toLongOrNull(str) : null;
                java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1);
                java.lang.Long longOrNull2 = str2 != null ? kotlin.text.StringsKt.toLongOrNull(str2) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = java.lang.Long.valueOf(contentLength - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                pair = new kotlin.Pair(longOrNull, longOrNull2);
            } else {
                pair = new kotlin.Pair(0L, null);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(pair);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            m10798constructorimpl = new kotlin.Pair(0L, null);
        }
        return (kotlin.Pair) m10798constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: all -> 0x0167, TryCatch #0 {all -> 0x0167, blocks: (B:3:0x000f, B:5:0x0025, B:8:0x002d, B:10:0x003e, B:13:0x0046, B:15:0x0053, B:17:0x0059, B:24:0x00af, B:26:0x00b3, B:30:0x00bb, B:31:0x00c8, B:33:0x00ce, B:35:0x00e1, B:37:0x006d, B:40:0x0076, B:41:0x0082, B:44:0x008b, B:45:0x0096, B:47:0x009e, B:49:0x00a2, B:50:0x0107, B:52:0x00f6, B:54:0x00fe, B:57:0x0135, B:59:0x014a, B:62:0x015f), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(final android.webkit.WebView view, final java.lang.String url) {
        final com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate mraidDelegate;
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "MRAID Command " + url);
            java.lang.String str = url;
            if (str != null && str.length() != 0) {
                android.net.Uri parse = android.net.Uri.parse(url);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                java.lang.String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    java.lang.String scheme2 = parse.getScheme();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(scheme2, "mraid")) {
                        if (!kotlin.text.StringsKt.equals(androidx.webkit.ProxyConfig.MATCH_HTTP, scheme2, true)) {
                            if (kotlin.text.StringsKt.equals("https", scheme2, true)) {
                            }
                        }
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Open URL" + url);
                        com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                        if (mraidDelegate2 != null) {
                            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
                            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "url", url);
                            mraidDelegate2.processCommand("openNonMraid", jsonObjectBuilder.build());
                        }
                        return true;
                    }
                    final java.lang.String host = parse.getHost();
                    if (host != null) {
                        int hashCode = host.hashCode();
                        if (hashCode == -1943542072) {
                            if (host.equals("propertiesChangeCompleted")) {
                                if (!this.ready) {
                                    this.ready = true;
                                    this.offloadExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.vungle.ads.internal.ui.VungleWebClient.m10483shouldOverrideUrlLoading$lambda11$lambda5(com.vungle.ads.internal.ui.VungleWebClient.this, view);
                                        }
                                    });
                                }
                                return true;
                            }
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                            }
                        } else {
                            if (hashCode != 88409791) {
                                if (hashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.offloadExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.vungle.ads.internal.ui.VungleWebClient.m10484shouldOverrideUrlLoading$lambda11$lambda6(com.vungle.ads.internal.ui.VungleWebClient.this, view);
                                        }
                                    });
                                    return true;
                                }
                                mraidDelegate = this.mraidDelegate;
                                if (mraidDelegate == null) {
                                    runJavascriptOnWebView(view, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (mraidDelegate != null) {
                                    kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder2 = new kotlinx.serialization.json.JsonObjectBuilder();
                                    for (java.lang.String param : parse.getQueryParameterNames()) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(param, "param");
                                        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder2, param, parse.getQueryParameter(param));
                                    }
                                    final kotlinx.serialization.json.JsonObject build = jsonObjectBuilder2.build();
                                    this.offloadExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.vungle.ads.internal.ui.VungleWebClient.m10482shouldOverrideUrlLoading$lambda11$lambda10$lambda9(com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate.this, host, build, this, view);
                                        }
                                    });
                                }
                                return true;
                            }
                            if (host.equals("failToLoad")) {
                                this.offloadExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.vungle.ads.internal.ui.VungleWebClient.m10485shouldOverrideUrlLoading$lambda11$lambda7(com.vungle.ads.internal.ui.VungleWebClient.this, view);
                                    }
                                });
                                return true;
                            }
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                            }
                        }
                    }
                    this.skippedUrlMetric.setMeta("url: " + url);
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$shouldOverrideUrlLoading$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.String invoke() {
                            return "skipped url: " + url;
                        }
                    });
                    return false;
                }
                return false;
            }
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Invalid URL ");
            return false;
        } catch (java.lang.Throwable th) {
            if (th instanceof java.lang.OutOfMemoryError) {
                new com.vungle.ads.OutOfMemory("mraid:" + url).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-5, reason: not valid java name */
    public static final void m10483shouldOverrideUrlLoading$lambda11$lambda5(com.vungle.ads.internal.ui.VungleWebClient this$0, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-6, reason: not valid java name */
    public static final void m10484shouldOverrideUrlLoading$lambda11$lambda6(com.vungle.ads.internal.ui.VungleWebClient this$0, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-7, reason: not valid java name */
    public static final void m10485shouldOverrideUrlLoading$lambda11$lambda7(com.vungle.ads.internal.ui.VungleWebClient this$0, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final void m10482shouldOverrideUrlLoading$lambda11$lambda10$lambda9(com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate it, java.lang.String command, kotlinx.serialization.json.JsonObject args, com.vungle.ads.internal.ui.VungleWebClient this$0, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "$args");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        super.onPageFinished(view, url);
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onPageFinished$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                return "onPageFinished.";
            }
        });
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        if (view != null) {
            view.setVisibility(0);
        }
        notifyPropertiesChange(true);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(new com.vungle.ads.internal.ui.VungleWebClient.VungleWebViewRenderProcessClient(this.errorHandler));
        }
        com.vungle.ads.internal.omsdk.WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean skipCmdQueue) {
        this.offloadExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.ui.VungleWebClient.m10481notifyPropertiesChange$lambda19(skipCmdQueue, this);
            }
        });
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        android.webkit.WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + availableDiskSize + '-' + appFolderSize + ')');
        }
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(com.vungle.ads.internal.ui.VungleWebClient vungleWebClient, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i, str);
    }

    public final void notifyBlackScreenResult(int percentage, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        android.webkit.WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + percentage + ')');
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Returning black screen result: " + percentage + '%');
        if (percentage >= 0) {
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, percentage, this.advertisement.getLogEntry(), null, 8, null);
        } else {
            com.vungle.ads.AnalyticsClient.INSTANCE.logError$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry());
        }
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean silentModeEnabled) {
        android.webkit.WebView webView = this.loadedWebView;
        if (webView != null) {
            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", java.lang.Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void handleBlackScreenDetection(int samplingFactor) {
        getBlackScreenDetector().start(this.loadedWebView, samplingFactor, new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$handleBlackScreenDetection$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.String str) {
                invoke(num.intValue(), str);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i, java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                com.vungle.ads.internal.ui.VungleWebClient.this.notifyBlackScreenResult(i, errorMessage);
            }
        });
    }

    public final void notifyPresentAppStoreFailed() {
        android.webkit.WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = java.lang.Boolean.valueOf(isViewable);
        android.webkit.WebView webView = this.loadedWebView;
        if (webView != null) {
            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.ironsource.X3.i.o, java.lang.Boolean.valueOf(isViewable));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler errorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(com.vungle.ads.internal.omsdk.WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Java")
    public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
        if (android.os.Build.VERSION.SDK_INT < 23) {
            boolean isCriticalAsset = isCriticalAsset(failingUrl);
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error desc " + description + " for URL " + failingUrl);
            handleWebViewError(description, failingUrl, isCriticalAsset);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        java.lang.String valueOf = java.lang.String.valueOf(errorResponse != null ? java.lang.Integer.valueOf(errorResponse.getStatusCode()) : null);
        java.lang.String valueOf2 = java.lang.String.valueOf(request != null ? request.getUrl() : null);
        boolean z = request != null && request.isForMainFrame();
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Http Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        super.onReceivedError(view, request, error);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            java.lang.String valueOf = java.lang.String.valueOf(error != null ? error.getDescription() : null);
            java.lang.String valueOf2 = java.lang.String.valueOf(request != null ? request.getUrl() : null);
            boolean z = request != null && request.isForMainFrame();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
            handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(final android.webkit.WebView view, final android.webkit.RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("onRenderProcessGone url: ");
                    android.webkit.WebView webView = view;
                    sb.append(webView != null ? webView.getUrl() : null);
                    return sb.toString();
                }
            });
            com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, true);
            }
            return true;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$onRenderProcessGone$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("onRenderProcessGone url: ");
                android.webkit.WebView webView = view;
                sb.append(webView != null ? webView.getUrl() : null);
                sb.append(", did crash: ");
                android.webkit.RenderProcessGoneDetail renderProcessGoneDetail = detail;
                sb.append(renderProcessGoneDetail != null ? java.lang.Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                return sb.toString();
            }
        });
        com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? java.lang.Boolean.valueOf(detail.didCrash()) : null);
        }
        return true;
    }

    private final void handleWebViewError(java.lang.String errorMsg, java.lang.String url, boolean didCrash) {
        java.lang.String str = url + ' ' + errorMsg;
        com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(java.lang.String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    private final void runJavascriptOnWebView(final android.webkit.WebView webView, final java.lang.String injectJs) {
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    return "mraid Injecting JS " + injectJs;
                }
            });
            com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$runJavascriptOnWebView$2
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
                    android.webkit.WebView webView2 = webView;
                    if (webView2 != null) {
                        webView2.evaluateJavascript(injectJs, null);
                    }
                }
            });
        } catch (java.lang.Throwable th) {
            new com.vungle.ads.EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* compiled from: VungleWebClient.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends android.webkit.WebViewRenderProcessClient {
        private com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler errorHandler;

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public VungleWebViewRenderProcessClient(com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(final android.webkit.WebView webView, final android.webkit.WebViewRenderProcess webViewRenderProcess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            com.vungle.ads.internal.util.Logger.INSTANCE.w(com.vungle.ads.internal.ui.VungleWebClient.TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("onRenderProcessUnresponsive(Title = ");
                    sb.append(webView.getTitle());
                    sb.append(", URL = ");
                    sb.append(webView.getOriginalUrl());
                    sb.append(", (webViewRenderProcess != null) = ");
                    sb.append(webViewRenderProcess != null);
                    return sb.toString();
                }
            });
            com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-19, reason: not valid java name */
    public static final void m10481notifyPropertiesChange$lambda19(boolean z, com.vungle.ads.internal.ui.VungleWebClient this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.advertisement.templateType());
        java.lang.Boolean bool = this$0.isViewable;
        if (bool != null) {
            bool.booleanValue();
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.ironsource.X3.i.o, bool);
        }
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.ironsource.M6.F, "android");
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", java.lang.Boolean.valueOf(this$0.placement.isRewardedVideo()));
        com.vungle.ads.internal.platform.Platform platform = this$0.platform;
        if (platform != null) {
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", java.lang.Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        java.lang.Long l = this$0.loadDuration;
        if (l != null) {
            l.longValue();
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (java.lang.Boolean) true);
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.gdprTitle);
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.gdprBody);
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.gdprAccept);
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (java.lang.Boolean) false);
        }
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", com.vungle.ads.BuildConfig.VERSION_NAME);
        java.lang.String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + z + ')';
        android.webkit.WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, str);
        }
    }
}
