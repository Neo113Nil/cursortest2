package com.vungle.ads.internal.network;

/* compiled from: VungleApiClient.kt */
@kotlin.Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0081\u00012\u00020\u0001:\u0006\u0081\u0001\u0082\u0001\u0083\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001eH\u0007J\u0012\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u000e\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020)J\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@J\u0010\u0010B\u001a\u00020C2\u0006\u0010;\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u0003H\u0002J\n\u0010G\u001a\u0004\u0018\u00010)H\u0002J\u000f\u0010H\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0002\bIJ\u000e\u0010H\u001a\u00020)2\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u00020\u0016H\u0002J\u0015\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u001eH\u0001¢\u0006\u0002\bNJ\u0014\u0010O\u001a\u0004\u0018\u00010P2\b\b\u0002\u0010Q\u001a\u00020\u001eH\u0002J\u0012\u0010R\u001a\u00020)2\b\u0010S\u001a\u0004\u0018\u00010<H\u0002J\u000f\u0010T\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010UJ\u000f\u0010V\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010UJ\u000e\u0010W\u001a\u00020*2\u0006\u0010>\u001a\u00020)J\u0012\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020\u001eH\u0002J\b\u0010[\u001a\u000208H\u0002J\u000e\u0010\\\u001a\u0002082\u0006\u0010]\u001a\u00020)J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010UJJ\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020)2\u0016\b\u0002\u0010a\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0018\u00010b2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010d\u001a\u00020e2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010gJ\u001c\u0010h\u001a\u0002082\f\u0010i\u001a\b\u0012\u0004\u0012\u00020k0j2\u0006\u0010l\u001a\u00020mJ\u001c\u0010n\u001a\u0002082\f\u0010o\u001a\b\u0012\u0004\u0012\u00020p0j2\u0006\u0010l\u001a\u00020mJ \u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010@2\u0006\u0010s\u001a\u00020)2\b\u0010t\u001a\u0004\u0018\u00010uJ\u001a\u0010c\u001a\u00020v2\b\b\u0002\u0010Q\u001a\u00020\u001e2\b\b\u0002\u0010Z\u001a\u00020\u001eJ*\u0010w\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010@2\u0006\u0010s\u001a\u00020)2\b\u0010t\u001a\u0004\u0018\u00010u2\b\u0010x\u001a\u0004\u0018\u00010yJ\u0016\u0010z\u001a\n\u0012\u0004\u0012\u00020{\u0018\u00010@2\u0006\u0010;\u001a\u00020|J\u0010\u0010}\u001a\u00020C2\u0006\u0010;\u001a\u00020DH\u0002J\u0017\u0010~\u001a\u0002082\u0006\u0010\u007f\u001a\u00020)2\u0007\u0010\u0080\u0001\u001a\u00020)R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u0010\u00106\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "applicationContext", "Landroid/content/Context;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "(Landroid/content/Context;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/persistence/FilePreferences;)V", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "api", "Lcom/vungle/ads/internal/network/VungleApi;", "appBody", "Lcom/vungle/ads/internal/model/AppNode;", "getAppBody$vungle_ads_release$annotations", "()V", "getAppBody$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AppNode;", "setAppBody$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AppNode;)V", "baseDeviceInfo", "Lcom/vungle/ads/internal/model/DeviceNode;", "gzipApi", "getGzipApi$vungle_ads_release$annotations", "getGzipApi$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApi;", "setGzipApi$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApi;)V", "isGooglePlayServicesAvailable", "", "Ljava/lang/Boolean;", "responseInterceptor", "Lokhttp3/Interceptor;", "getResponseInterceptor$vungle_ads_release$annotations", "getResponseInterceptor$vungle_ads_release", "()Lokhttp3/Interceptor;", "setResponseInterceptor$vungle_ads_release", "(Lokhttp3/Interceptor;)V", "retryAfterDataMap", "", "", "", "getRetryAfterDataMap$vungle_ads_release$annotations", "getRetryAfterDataMap$vungle_ads_release", "()Ljava/util/Map;", "setRetryAfterDataMap$vungle_ads_release", "(Ljava/util/Map;)V", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "Lkotlin/Lazy;", "uaString", "addPlaySvcAvailabilityInCookie", "", com.vungle.ads.internal.model.Cookie.IS_PLAY_SERVICE_AVAILABLE, "bodyToString", "request", "Lokhttp3/RequestBody;", "checkIsRetryAfterActive", com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID, com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "defaultErrorResponse", "Lokhttp3/Response;", "Lokhttp3/Request;", "getBasicDeviceBody", "context", "getConnectionType", "getConnectionTypeDetail", "getConnectionTypeDetail$vungle_ads_release", "type", "", "getDeviceBody", "explicitBlock", "getDeviceBody$vungle_ads_release", "getExtBody", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "withSignals", "getPlacementID", "body", "getPlayServicesAvailabilityFromAPI", "()Ljava/lang/Boolean;", "getPlayServicesAvailabilityFromCookie", "getRetryAfterHeaderValue", "getUserBody", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "withFirstPartyData", "initUserAgentLazy", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "pingTPAT", "Lcom/vungle/ads/internal/model/ErrorInfo;", "url", "headers", "", "requestBody", "requestType", "Lcom/vungle/ads/internal/network/HttpMethod;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "reportErrors", "errors", "Ljava/util/concurrent/BlockingQueue;", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "requestListener", "Lcom/vungle/ads/AnalyticsClient$RequestListener;", "reportMetrics", "metrics", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "requestAd", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "requestCSBAd", "csbData", "Lcom/vungle/ads/VungleCSBData;", "ri", "Ljava/lang/Void;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "safeErrorResponse", "sendAdMarkup", "adMarkup", com.ironsource.B5.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ConnectionTypeDetail", "GzipRequestInterceptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleApiClient {
    private static final java.lang.String TAG = "VungleApiClient";
    private com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo;
    private com.vungle.ads.internal.network.VungleApi api;
    private com.vungle.ads.internal.model.AppNode appBody;
    private final android.content.Context applicationContext;
    private com.vungle.ads.internal.model.DeviceNode baseDeviceInfo;
    private final com.vungle.ads.internal.persistence.FilePreferences filePreferences;
    private com.vungle.ads.internal.network.VungleApi gzipApi;
    private java.lang.Boolean isGooglePlayServicesAvailable;
    private final com.vungle.ads.internal.platform.Platform platform;
    private okhttp3.Interceptor responseInterceptor;
    private java.util.Map<java.lang.String, java.lang.Long> retryAfterDataMap;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy signalManager;
    private java.lang.String uaString;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.network.VungleApiClient.Companion INSTANCE = new com.vungle.ads.internal.network.VungleApiClient.Companion(null);
    private static final java.lang.String BASE_URL = "https://config.ads.vungle.com/";
    private static final java.util.Set<okhttp3.Interceptor> networkInterceptors = new java.util.HashSet();
    private static final java.util.Set<okhttp3.Interceptor> logInterceptors = new java.util.HashSet();
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.network.VungleApiClient$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
        }
    }, 1, null);

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    public VungleApiClient(final android.content.Context applicationContext, com.vungle.ads.internal.platform.Platform platform, com.vungle.ads.internal.persistence.FilePreferences filePreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = java.lang.System.getProperty("http.agent");
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.signalManager = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.signals.SignalManager>() { // from class: com.vungle.ads.internal.network.VungleApiClient$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.signals.SignalManager invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(applicationContext).getService(com.vungle.ads.internal.signals.SignalManager.class);
            }
        });
        this.retryAfterDataMap = new java.util.concurrent.ConcurrentHashMap();
        this.responseInterceptor = new okhttp3.Interceptor() { // from class: com.vungle.ads.internal.network.VungleApiClient$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                okhttp3.Response m10445responseInterceptor$lambda0;
                m10445responseInterceptor$lambda0 = com.vungle.ads.internal.network.VungleApiClient.m10445responseInterceptor$lambda0(com.vungle.ads.internal.network.VungleApiClient.this, chain);
                return m10445responseInterceptor$lambda0;
            }
        };
        okhttp3.OkHttpClient.Builder proxySelector = new okhttp3.OkHttpClient.Builder().readTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).connectTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).addInterceptor(this.responseInterceptor).proxySelector(new java.net.ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public java.util.List<java.net.Proxy> select(java.net.URI uri) {
                try {
                    java.util.List<java.net.Proxy> select = java.net.ProxySelector.getDefault().select(uri);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(select, "{\n                      …ri)\n                    }");
                    return select;
                } catch (java.lang.Exception unused) {
                    return kotlin.collections.CollectionsKt.listOf(java.net.Proxy.NO_PROXY);
                }
            }

            @Override // java.net.ProxySelector
            public void connectFailed(java.net.URI uri, java.net.SocketAddress sa, java.io.IOException ioe) {
                try {
                    java.net.ProxySelector.getDefault().connectFailed(uri, sa, ioe);
                } catch (java.lang.Exception unused) {
                }
            }
        });
        okhttp3.OkHttpClient build = proxySelector.build();
        okhttp3.OkHttpClient build2 = proxySelector.addInterceptor(new com.vungle.ads.internal.network.VungleApiClient.GzipRequestInterceptor()).build();
        this.api = new com.vungle.ads.internal.network.VungleApiImpl(build);
        this.gzipApi = new com.vungle.ads.internal.network.VungleApiImpl(build2);
    }

    /* compiled from: VungleApiClient.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL$vungle_ads_release", "()Ljava/lang/String;", "TAG", "json", "Lkotlinx/serialization/json/Json;", "logInterceptors", "", "Lokhttp3/Interceptor;", "networkInterceptors", "reset", "", "reset$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getBASE_URL$vungle_ads_release() {
            return com.vungle.ads.internal.network.VungleApiClient.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            com.vungle.ads.internal.network.VungleHeader.INSTANCE.reset();
        }
    }

    /* renamed from: getGzipApi$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.network.VungleApi getGzipApi() {
        return this.gzipApi;
    }

    public final void setGzipApi$vungle_ads_release(com.vungle.ads.internal.network.VungleApi vungleApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    /* renamed from: getAppBody$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.model.AppNode getAppBody() {
        return this.appBody;
    }

    public final void setAppBody$vungle_ads_release(com.vungle.ads.internal.model.AppNode appNode) {
        this.appBody = appNode;
    }

    private final com.vungle.ads.internal.signals.SignalManager getSignalManager() {
        return (com.vungle.ads.internal.signals.SignalManager) this.signalManager.getValue();
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(java.util.Map<java.lang.String, java.lang.Long> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    /* renamed from: getResponseInterceptor$vungle_ads_release, reason: from getter */
    public final okhttp3.Interceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public final void setResponseInterceptor$vungle_ads_release(okhttp3.Interceptor interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "<set-?>");
        this.responseInterceptor = interceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final okhttp3.Response m10445responseInterceptor$lambda0(com.vungle.ads.internal.network.VungleApiClient this$0, okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Request request = chain.request();
        try {
            try {
                okhttp3.Response proceed = chain.proceed(request);
                java.lang.String str = proceed.headers().get("Retry-After");
                java.lang.String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    return proceed;
                }
                try {
                    long parseLong = java.lang.Long.parseLong(str);
                    if (parseLong <= 0) {
                        return proceed;
                    }
                    java.lang.String encodedPath = request.url().encodedPath();
                    long currentTimeMillis = (parseLong * 1000) + java.lang.System.currentTimeMillis();
                    if (!kotlin.text.StringsKt.endsWith$default(encodedPath, "ads", false, 2, (java.lang.Object) null)) {
                        return proceed;
                    }
                    java.lang.String placementID = this$0.getPlacementID(request.body());
                    if (placementID.length() <= 0) {
                        return proceed;
                    }
                    this$0.retryAfterDataMap.put(placementID, java.lang.Long.valueOf(currentTimeMillis));
                    return proceed;
                } catch (java.lang.Exception unused) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Retry-After value is not an valid value");
                    return proceed;
                }
            } catch (java.lang.OutOfMemoryError unused2) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "OOM for " + request.url());
                return this$0.safeErrorResponse(request);
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Exception: " + e.getMessage() + " for " + request.url());
            return this$0.defaultErrorResponse(request);
        }
    }

    private final okhttp3.Response defaultErrorResponse(okhttp3.Request request) {
        return new okhttp3.Response.Builder().request(request).code(500).protocol(okhttp3.Protocol.HTTP_1_1).message("Server is busy").body(okhttp3.ResponseBody.INSTANCE.create("{\"Error\":\"Server is busy\"}", okhttp3.MediaType.INSTANCE.parse(com.ironsource.B5.M))).build();
    }

    private final okhttp3.Response safeErrorResponse(okhttp3.Request request) {
        return new okhttp3.Response.Builder().request(request).code(500).protocol(okhttp3.Protocol.HTTP_1_1).message("OOM").body(okhttp3.ResponseBody.INSTANCE.create(new byte[0], (okhttp3.MediaType) null)).build();
    }

    private final java.lang.String getPlacementID(okhttp3.RequestBody body) {
        java.util.List<java.lang.String> placements;
        try {
            kotlinx.serialization.json.Json json2 = json;
            java.lang.String bodyToString = bodyToString(body);
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.CommonRequestBody.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            com.vungle.ads.internal.model.CommonRequestBody.RequestParam request = ((com.vungle.ads.internal.model.CommonRequestBody) json2.decodeFromString(serializer, bodyToString)).getRequest();
            if (request == null || (placements = request.getPlacements()) == null) {
                return "";
            }
            java.lang.String str = placements.get(0);
            return str == null ? "" : str;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private final java.lang.String bodyToString(okhttp3.RequestBody request) {
        try {
            okio.Buffer buffer = new okio.Buffer();
            if (request == null) {
                return "";
            }
            request.writeTo(buffer);
            return buffer.readUtf8();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final boolean checkIsRetryAfterActive(java.lang.String placementID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementID, "placementID");
        java.lang.Long l = this.retryAfterDataMap.get(placementID);
        if ((l != null ? l.longValue() : 0L) > java.lang.System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final long getRetryAfterHeaderValue(java.lang.String placementID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementID, "placementID");
        java.lang.Long l = this.retryAfterDataMap.get(placementID);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* compiled from: VungleApiClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "()V", com.vungle.ads.internal.network.VungleApiClient.GzipRequestInterceptor.GZIP, "Lokhttp3/RequestBody;", "requestBody", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GzipRequestInterceptor implements okhttp3.Interceptor {
        private static final java.lang.String CONTENT_ENCODING = "Content-Encoding";
        private static final java.lang.String GZIP = "gzip";

        @Override // okhttp3.Interceptor
        public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
            okhttp3.Request request = chain.request();
            okhttp3.RequestBody body = request.body();
            if (body == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header("Content-Encoding", GZIP).method(request.method(), gzip(body)).build());
        }

        private final okhttp3.RequestBody gzip(final okhttp3.RequestBody requestBody) throws java.io.IOException {
            final okio.Buffer buffer = new okio.Buffer();
            okio.BufferedSink buffer2 = okio.Okio.buffer(new okio.GzipSink(buffer));
            requestBody.writeTo(buffer2);
            buffer2.close();
            return new okhttp3.RequestBody() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                /* renamed from: contentType */
                public okhttp3.MediaType get$contentType() {
                    return okhttp3.RequestBody.this.get$contentType();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return buffer.size();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.BufferedSink sink) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(buffer.snapshot());
                }
            };
        }
    }

    public final synchronized void initialize(java.lang.String appId) {
        android.content.pm.PackageInfo packageInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        com.vungle.ads.internal.network.VungleHeader.INSTANCE.setAppId(appId);
        java.lang.String str = "1.0";
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            }
            java.lang.String str2 = packageInfo.versionName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
            str = str2;
        } catch (java.lang.Exception unused) {
        }
        com.vungle.ads.internal.network.VungleHeader.INSTANCE.setAppVersion(str);
        this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
        java.lang.String packageName = this.applicationContext.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
        this.appBody = new com.vungle.ads.internal.model.AppNode(packageName, str, appId);
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    public final com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> config() throws java.io.IOException {
        com.vungle.ads.internal.model.AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        com.vungle.ads.internal.model.CommonRequestBody commonRequestBody = new com.vungle.ads.internal.model.CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (com.vungle.ads.internal.model.CommonRequestBody.RequestExt) null, (com.vungle.ads.internal.model.CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.vungle.ads.internal.model.CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.FileUtility fileUtility = com.vungle.ads.internal.util.FileUtility.INSTANCE;
        java.lang.String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!kotlin.text.StringsKt.endsWith$default(str, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 2, (java.lang.Object) null)) {
            str = str + kotlinx.io.files.FileSystemKt.UnixPathSeparator;
        }
        return this.api.config(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), str + com.helpshift.proactive.InAppViewConstants.CONFIG, commonRequestBody);
    }

    public final com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> requestAd(java.lang.String placement, com.vungle.ads.VungleAdSize adSize) throws java.lang.IllegalStateException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        java.lang.String adsEndpoint = com.vungle.ads.internal.ConfigManager.INSTANCE.getAdsEndpoint();
        com.vungle.ads.internal.model.CommonRequestBody requestBody = requestBody(!com.vungle.ads.internal.ConfigManager.INSTANCE.signalsDisabled(), com.vungle.ads.internal.ConfigManager.INSTANCE.fpdEnabled());
        com.vungle.ads.internal.model.CommonRequestBody.RequestParam requestParam = new com.vungle.ads.internal.model.CommonRequestBody.RequestParam(kotlin.collections.CollectionsKt.listOf(placement), (com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.vungle.ads.internal.model.CommonRequestBody.CSBParam) null, 126, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (adSize != null) {
            requestParam.setAdSize(new com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam(adSize.getWidth(), adSize.getHeight()));
        }
        requestBody.setRequest(requestParam);
        return this.gzipApi.ads(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), adsEndpoint, requestBody);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> requestCSBAd(java.lang.String placement, com.vungle.ads.VungleAdSize adSize, com.vungle.ads.VungleCSBData csbData) throws java.lang.IllegalStateException {
        com.vungle.ads.internal.model.CommonRequestBody.CSBParam cSBParam;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        java.lang.String cSBEndpoint = com.vungle.ads.internal.ConfigManager.INSTANCE.getCSBEndpoint();
        com.vungle.ads.internal.model.CommonRequestBody requestBody = requestBody(!com.vungle.ads.internal.ConfigManager.INSTANCE.signalsDisabled(), com.vungle.ads.internal.ConfigManager.INSTANCE.fpdEnabled());
        if (csbData != null) {
            java.util.Map<java.lang.String, java.lang.String> extras = csbData.getExtras();
            if (extras != null) {
                if (!(!extras.isEmpty())) {
                    extras = null;
                }
                if (extras != null) {
                    kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extras.entrySet()) {
                        jsonObjectBuilder.put(entry.getKey(), kotlinx.serialization.json.JsonElementKt.JsonPrimitive(entry.getValue()));
                    }
                    jsonObject = jsonObjectBuilder.build();
                    cSBParam = new com.vungle.ads.internal.model.CommonRequestBody.CSBParam(csbData.getBidFloor(), csbData.getPhase(), csbData.getIsVXWinner(), csbData.getAuctionId(), csbData.getCreativeId(), csbData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
                }
            }
            jsonObject = null;
            cSBParam = new com.vungle.ads.internal.model.CommonRequestBody.CSBParam(csbData.getBidFloor(), csbData.getPhase(), csbData.getIsVXWinner(), csbData.getAuctionId(), csbData.getCreativeId(), csbData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
        } else {
            cSBParam = null;
        }
        com.vungle.ads.internal.model.CommonRequestBody.RequestParam requestParam = new com.vungle.ads.internal.model.CommonRequestBody.RequestParam(kotlin.collections.CollectionsKt.listOf(placement), (com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cSBParam, 62, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (adSize != null) {
            requestParam.setAdSize(new com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam(adSize.getWidth(), adSize.getHeight()));
        }
        requestBody.setRequest(requestParam);
        return this.gzipApi.ads(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), cSBEndpoint, requestBody);
    }

    public final com.vungle.ads.internal.network.Call<java.lang.Void> ri(com.vungle.ads.internal.model.CommonRequestBody.RequestParam request) {
        com.vungle.ads.internal.model.AppNode appNode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.lang.String riEndpoint = com.vungle.ads.internal.ConfigManager.INSTANCE.getRiEndpoint();
        java.lang.String str = riEndpoint;
        if (str == null || str.length() == 0 || (appNode = this.appBody) == null) {
            return null;
        }
        com.vungle.ads.internal.model.CommonRequestBody commonRequestBody = new com.vungle.ads.internal.model.CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (com.vungle.ads.internal.model.CommonRequestBody.RequestExt) null, (com.vungle.ads.internal.model.CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        commonRequestBody.setRequest(request);
        com.vungle.ads.internal.model.CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public static /* synthetic */ com.vungle.ads.internal.model.ErrorInfo pingTPAT$default(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, java.lang.String str, java.util.Map map, java.lang.String str2, com.vungle.ads.internal.network.HttpMethod httpMethod, com.vungle.ads.internal.util.LogEntry logEntry, int i, java.lang.Object obj) {
        java.util.Map map2 = (i & 2) != 0 ? null : map;
        java.lang.String str3 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            httpMethod = com.vungle.ads.internal.network.HttpMethod.GET;
        }
        return vungleApiClient.pingTPAT(str, map2, str3, httpMethod, (i & 16) != 0 ? null : logEntry);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r3 = r2.getRawResponse();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.code());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:17:0x0064, B:22:0x006d, B:23:0x007e, B:25:0x0090, B:30:0x009a, B:32:0x00a0, B:33:0x00aa, B:35:0x00dd, B:37:0x00ed, B:39:0x00f8, B:42:0x0105, B:44:0x0116, B:45:0x011a), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:17:0x0064, B:22:0x006d, B:23:0x007e, B:25:0x0090, B:30:0x009a, B:32:0x00a0, B:33:0x00aa, B:35:0x00dd, B:37:0x00ed, B:39:0x00f8, B:42:0x0105, B:44:0x0116, B:45:0x011a), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:17:0x0064, B:22:0x006d, B:23:0x007e, B:25:0x0090, B:30:0x009a, B:32:0x00a0, B:33:0x00aa, B:35:0x00dd, B:37:0x00ed, B:39:0x00f8, B:42:0x0105, B:44:0x0116, B:45:0x011a), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vungle.ads.internal.model.ErrorInfo pingTPAT(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String requestBody, com.vungle.ads.internal.network.HttpMethod requestType, com.vungle.ads.internal.util.LogEntry logEntry) {
        boolean isCleartextTrafficPermitted;
        java.lang.String str;
        com.vungle.ads.internal.network.Response<java.lang.Void> execute;
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (!com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(url)) {
            return new com.vungle.ads.internal.model.ErrorInfo("Invalid URL", true, false, 4, null);
        }
        try {
            java.lang.String host = new java.net.URL(url).getHost();
            try {
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    isCleartextTrafficPermitted = android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
                } else {
                    if (android.os.Build.VERSION.SDK_INT >= 23) {
                        isCleartextTrafficPermitted = android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    str = this.uaString;
                    if (str == null) {
                        str = "";
                    }
                    execute = this.api.pingTPAT(str, url, requestType, headers, requestBody == null ? okhttp3.RequestBody.INSTANCE.create(requestBody, okhttp3.MediaType.INSTANCE.parse(com.ironsource.B5.M)) : null).execute();
                    if (execute != null && execute.isSuccessful()) {
                        return null;
                    }
                    num = null;
                    if (!kotlin.collections.CollectionsKt.contains(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE), java.lang.Integer.valueOf(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308}), num)) {
                        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, logEntry, url, 2, null);
                        return null;
                    }
                    boolean z = num != null && new kotlin.ranges.IntRange(500, com.unity3d.ads.gatewayclient.CommonGatewayClient.CODE_599).contains(num.intValue());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsuccessful response, error code: ");
                    sb.append(num);
                    sb.append(", message: ");
                    sb.append(execute != null ? execute.message() : null);
                    return new com.vungle.ads.internal.model.ErrorInfo(sb.toString(), false, z, 2, null);
                }
                str = this.uaString;
                if (str == null) {
                }
                execute = this.api.pingTPAT(str, url, requestType, headers, requestBody == null ? okhttp3.RequestBody.INSTANCE.create(requestBody, okhttp3.MediaType.INSTANCE.parse(com.ironsource.B5.M)) : null).execute();
                if (execute != null) {
                    return null;
                }
                num = null;
                if (!kotlin.collections.CollectionsKt.contains(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE), java.lang.Integer.valueOf(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308}), num)) {
                }
            } catch (java.lang.Throwable th) {
                java.lang.String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new com.vungle.ads.internal.model.ErrorInfo(localizedMessage, false, true, 2, null);
            }
            if (!isCleartextTrafficPermitted && android.webkit.URLUtil.isHttpUrl(url)) {
                return new com.vungle.ads.internal.model.ErrorInfo("Clear Text Traffic is blocked", false, false, 6, null);
            }
        } catch (java.net.MalformedURLException e) {
            java.lang.String localizedMessage2 = e.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new com.vungle.ads.internal.model.ErrorInfo(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportMetrics(java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> metrics, final com.vungle.ads.AnalyticsClient.RequestListener requestListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        java.lang.String metricsEndpoint = com.vungle.ads.internal.ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        for (com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder builder : metrics) {
            builder.setSessionId(getSignalManager().getUuid());
            com.vungle.ads.internal.model.Placement placement = com.vungle.ads.internal.ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                java.lang.String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            java.lang.String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            java.lang.String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            com.vungle.ads.internal.protos.Sdk.SDKMetric build = builder.build();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Sending Metric: " + build.getType());
            linkedBlockingQueue.add(build);
        }
        com.vungle.ads.internal.protos.Sdk.MetricBatch build2 = com.vungle.ads.internal.protos.Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.INSTANCE;
        okhttp3.MediaType parse = okhttp3.MediaType.INSTANCE.parse(com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = build2.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), metricsEndpoint, okhttp3.RequestBody.Companion.create$default(companion, parse, byteArray, 0, 0, 12, (java.lang.Object) null)).enqueue(new com.vungle.ads.internal.network.Callback<java.lang.Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient$reportMetrics$2
            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(com.vungle.ads.internal.network.Call<java.lang.Void> call, com.vungle.ads.internal.network.Response<java.lang.Void> response) {
                com.vungle.ads.AnalyticsClient.RequestListener.this.onSuccess();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(com.vungle.ads.internal.network.Call<java.lang.Void> call, java.lang.Throwable t) {
                com.vungle.ads.AnalyticsClient.RequestListener.this.onFailure();
            }
        });
    }

    public final void reportErrors(java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> errors, final com.vungle.ads.AnalyticsClient.RequestListener requestListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "errors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        java.lang.String errorLoggingEndpoint = com.vungle.ads.internal.ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        for (com.vungle.ads.internal.protos.Sdk.SDKError.Builder builder : errors) {
            builder.setSessionId(getSignalManager().getUuid());
            com.vungle.ads.internal.model.Placement placement = com.vungle.ads.internal.ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                java.lang.String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            java.lang.String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            java.lang.String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            com.vungle.ads.internal.protos.Sdk.SDKError build = builder.build();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Sending Error: " + build.getReason());
            linkedBlockingQueue.add(build);
        }
        com.vungle.ads.internal.protos.Sdk.SDKErrorBatch build2 = com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.INSTANCE;
        byte[] byteArray = build2.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendErrors(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa(), errorLoggingEndpoint, companion.create(byteArray, okhttp3.MediaType.INSTANCE.parse(com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF), 0, build2.toByteArray().length)).enqueue(new com.vungle.ads.internal.network.Callback<java.lang.Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient$reportErrors$2
            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(com.vungle.ads.internal.network.Call<java.lang.Void> call, com.vungle.ads.internal.network.Response<java.lang.Void> response) {
                com.vungle.ads.AnalyticsClient.RequestListener.this.onSuccess();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(com.vungle.ads.internal.network.Call<java.lang.Void> call, java.lang.Throwable t) {
                com.vungle.ads.AnalyticsClient.RequestListener.this.onFailure();
            }
        });
    }

    public final void sendAdMarkup(java.lang.String adMarkup, java.lang.String endpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, okhttp3.RequestBody.INSTANCE.create(adMarkup, okhttp3.MediaType.INSTANCE.parse(com.ironsource.B5.M))).enqueue(new com.vungle.ads.internal.network.Callback<java.lang.Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient$sendAdMarkup$1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(com.vungle.ads.internal.network.Call<java.lang.Void> call, java.lang.Throwable t) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(com.vungle.ads.internal.network.Call<java.lang.Void> call, com.vungle.ads.internal.network.Response<java.lang.Void> response) {
            }
        });
    }

    private final void initUserAgentLazy() {
        final com.vungle.ads.TimeIntervalMetric timeIntervalMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new androidx.core.util.Consumer<java.lang.String>() { // from class: com.vungle.ads.internal.network.VungleApiClient$initUserAgentLazy$1
            @Override // androidx.core.util.Consumer
            public void accept(java.lang.String uaString) {
                java.lang.String str;
                com.vungle.ads.internal.platform.Platform platform;
                java.lang.String str2 = uaString;
                if (str2 == null || str2.length() == 0) {
                    str = com.vungle.ads.internal.network.VungleApiClient.this.uaString;
                    java.lang.String str3 = str;
                    if (str3 == null || str3.length() == 0) {
                        platform = com.vungle.ads.internal.network.VungleApiClient.this.platform;
                        uaString = platform.getUserAgent();
                    }
                }
                java.lang.String str4 = uaString;
                if (str4 == null || str4.length() == 0) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.e("VungleApiClient", "All UA sources failed, logging USER_AGENT_ERROR");
                    new com.vungle.ads.UserAgentError().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    timeIntervalMetric.markEnd();
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, timeIntervalMetric, (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
                    com.vungle.ads.internal.network.VungleApiClient.this.uaString = uaString;
                }
            }
        });
    }

    public final void addPlaySvcAvailabilityInCookie(boolean isPlaySvcAvailable) {
        this.filePreferences.put(com.vungle.ads.internal.model.Cookie.IS_PLAY_SERVICE_AVAILABLE, isPlaySvcAvailable).apply();
    }

    public final java.lang.Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(com.vungle.ads.internal.model.Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    public final java.lang.Boolean getPlayServicesAvailabilityFromAPI() {
        java.lang.Boolean bool = null;
        try {
            com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
            boolean z = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            bool = java.lang.Boolean.valueOf(z);
            bool.getClass();
            addPlaySvcAvailabilityInCookie(z);
            return bool;
        } catch (java.lang.Exception unused) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Unexpected exception from Play services lib.");
            return bool;
        } catch (java.lang.NoClassDefFoundError unused2) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Play services Not available");
            java.lang.Boolean bool2 = false;
            try {
                bool2.getClass();
                addPlaySvcAvailabilityInCookie(false);
                return bool2;
            } catch (java.lang.Exception unused3) {
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Failure to write GPS availability to DB");
                return bool2;
            }
        }
    }

    private final com.vungle.ads.internal.model.DeviceNode getBasicDeviceBody(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        java.lang.String MODEL = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        com.vungle.ads.internal.model.DeviceNode deviceNode = new com.vungle.ads.internal.model.DeviceNode(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.AndroidPlatform.INSTANCE.getCarrierName$vungle_ads_release(context), kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (java.lang.String) null, (java.lang.Integer) null, (com.vungle.ads.internal.model.DeviceNode.VungleExt) null, 1792, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        try {
            java.lang.String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        return deviceNode;
    }

    public static /* synthetic */ com.vungle.ads.internal.model.CommonRequestBody requestBody$default(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, boolean z, boolean z2, int i, java.lang.Object obj) throws java.lang.IllegalStateException {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return vungleApiClient.requestBody(z, z2);
    }

    public final com.vungle.ads.internal.model.CommonRequestBody requestBody(boolean withSignals, boolean withFirstPartyData) throws java.lang.IllegalStateException {
        com.vungle.ads.internal.model.CommonRequestBody commonRequestBody = new com.vungle.ads.internal.model.CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(withFirstPartyData), (com.vungle.ads.internal.model.CommonRequestBody.RequestExt) null, (com.vungle.ads.internal.model.CommonRequestBody.RequestParam) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.vungle.ads.internal.model.CommonRequestBody.RequestExt extBody = getExtBody(withSignals);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    private final com.vungle.ads.internal.model.DeviceNode getDeviceBody() throws java.lang.IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x021d, code lost:
    
        if (r29.applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen") != false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.vungle.ads.internal.model.DeviceNode getDeviceBody$vungle_ads_release(boolean explicitBlock) throws java.lang.IllegalStateException {
        com.vungle.ads.internal.model.DeviceNode copy;
        com.vungle.ads.internal.model.DeviceNode.VungleExt vungleExt;
        java.lang.String str;
        com.vungle.ads.internal.model.DeviceNode deviceNode = this.baseDeviceInfo;
        if (deviceNode == null) {
            deviceNode = getBasicDeviceBody(this.applicationContext);
            this.baseDeviceInfo = deviceNode;
        }
        copy = r2.copy((r24 & 1) != 0 ? r2.make : null, (r24 & 2) != 0 ? r2.model : null, (r24 & 4) != 0 ? r2.osv : null, (r24 & 8) != 0 ? r2.carrier : null, (r24 & 16) != 0 ? r2.os : null, (r24 & 32) != 0 ? r2.w : 0, (r24 & 64) != 0 ? r2.h : 0, (r24 & 128) != 0 ? r2.ua : null, (r24 & 256) != 0 ? r2.ifa : null, (r24 & 512) != 0 ? r2.lmt : null, (r24 & 1024) != 0 ? deviceNode.ext : null);
        com.vungle.ads.internal.model.DeviceNode.VungleExt vungleExt2 = new com.vungle.ads.internal.model.DeviceNode.VungleExt(false, (java.lang.String) null, (java.lang.Integer) null, 0.0f, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0.0f, 0, false, 0, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, 8388607, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        java.lang.Object systemService = this.applicationContext.getSystemService("window");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        copy.setH(displayMetrics.heightPixels);
        copy.setW(displayMetrics.widthPixels);
        com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo == null) {
            advertisingInfo = this.platform.getAdvertisingInfo();
        }
        this.advertisingInfo = advertisingInfo;
        java.lang.String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
        com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
        java.lang.Boolean valueOf = advertisingInfo2 != null ? java.lang.Boolean.valueOf(advertisingInfo2.getLimitAdTracking()) : null;
        if (!com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.shouldSendAdIds()) {
            vungleExt = vungleExt2;
        } else if (advertisingId != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER)) {
                vungleExt = vungleExt2;
                vungleExt.setAmazonAdvertisingId(advertisingId);
            } else {
                vungleExt = vungleExt2;
                vungleExt.setGaid(advertisingId);
            }
            copy.setIfa(advertisingId);
        } else {
            vungleExt = vungleExt2;
            copy.setIfa("");
        }
        if (explicitBlock || !com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.shouldSendAdIds()) {
            copy.setIfa(null);
            vungleExt.setGaid(null);
            vungleExt.setAmazonAdvertisingId(null);
        }
        boolean z = true;
        copy.setLmt(kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) valueOf, (java.lang.Object) true) ? 1 : 0);
        vungleExt.setGooglePlayServicesAvailable(kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.TRUE, isGooglePlayServicesAvailable()));
        if (com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.allowDeviceIDFromTCF() != com.vungle.ads.internal.privacy.PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
            java.lang.String appSetId = this.platform.getAppSetId();
            if (appSetId != null) {
                vungleExt.setAppSetId(appSetId);
            }
            java.lang.Integer appSetIdScope = this.platform.getAppSetIdScope();
            if (appSetIdScope != null) {
                vungleExt.setAppSetIdScope(java.lang.Integer.valueOf(appSetIdScope.intValue()));
            }
        }
        android.content.Intent registerReceiver = this.applicationContext.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                vungleExt.setBatteryLevel(intExtra / intExtra2);
            }
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 == 2 || intExtra3 == 5) {
                int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                if (intExtra4 == 1) {
                    str = "BATTERY_PLUGGED_AC";
                } else if (intExtra4 == 2) {
                    str = "BATTERY_PLUGGED_USB";
                } else if (intExtra4 == 4) {
                    str = "BATTERY_PLUGGED_WIRELESS";
                } else {
                    str = "BATTERY_PLUGGED_OTHERS";
                }
            } else {
                str = "NOT_CHARGING";
            }
        } else {
            str = "UNKNOWN";
        }
        vungleExt.setBatteryState(str);
        vungleExt.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
        java.lang.String connectionType = getConnectionType();
        if (connectionType != null) {
            vungleExt.setConnectionType(connectionType);
        }
        java.lang.String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
        if (connectionTypeDetail$vungle_ads_release != null) {
            vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
        }
        vungleExt.setLocale(java.util.Locale.getDefault().toString());
        vungleExt.setLanguage(java.util.Locale.getDefault().getLanguage());
        vungleExt.setTimeZone(java.util.TimeZone.getDefault().getID());
        vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
        vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
        if (kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER)) {
            z = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            java.lang.Object systemService2 = this.applicationContext.getSystemService("uimode");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((android.app.UiModeManager) systemService2).getCurrentModeType() == 4) {
            }
            z = false;
        } else if (!this.applicationContext.getPackageManager().hasSystemFeature("com.google.android.tv")) {
        }
        vungleExt.setTv(z);
        vungleExt.setSideloadEnabled(this.platform.getIsSideLoaded());
        vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.otEnabled()) {
            vungleExt.setSit(java.lang.Long.valueOf(this.platform.getSDKInstallationTime()));
            vungleExt.setOit(java.lang.Long.valueOf(this.platform.getOSInstallationTime()));
            vungleExt.setOrt(java.lang.Long.valueOf(this.platform.getLastBootTime()));
            vungleExt.setObt(java.lang.Long.valueOf(this.platform.getBuildTime()));
        }
        vungleExt.setGpVersion(this.platform.getGPVersion());
        copy.setUa(this.uaString);
        copy.setExt(vungleExt);
        return copy;
    }

    static /* synthetic */ com.vungle.ads.internal.model.CommonRequestBody.User getUserBody$default(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.getUserBody(z);
    }

    private final com.vungle.ads.internal.model.CommonRequestBody.User getUserBody(boolean withFirstPartyData) {
        com.vungle.ads.internal.model.CommonRequestBody.User user = new com.vungle.ads.internal.model.CommonRequestBody.User((com.vungle.ads.internal.model.CommonRequestBody.GDPR) null, (com.vungle.ads.internal.model.CommonRequestBody.CCPA) null, (com.vungle.ads.internal.model.CommonRequestBody.COPPA) null, (com.vungle.ads.fpd.FirstPartyData) null, (com.vungle.ads.internal.model.CommonRequestBody.IAB) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        user.setGdpr(new com.vungle.ads.internal.model.CommonRequestBody.GDPR(com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentStatus(), com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentSource(), com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentTimestamp(), com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentMessageVersion()));
        user.setCcpa(new com.vungle.ads.internal.model.CommonRequestBody.CCPA(com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getCcpaStatus()));
        if (com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getCoppaStatus() != com.vungle.ads.internal.privacy.COPPA.COPPA_NOTSET) {
            user.setCoppa(new com.vungle.ads.internal.model.CommonRequestBody.COPPA(com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getCoppaStatus().getValue()));
        }
        if (com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.shouldSendTCFString()) {
            user.setIab(new com.vungle.ads.internal.model.CommonRequestBody.IAB(com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getIABTCFString()));
        }
        if (withFirstPartyData) {
            user.setFpd(com.vungle.ads.VungleAds.firstPartyData);
        }
        return user;
    }

    static /* synthetic */ com.vungle.ads.internal.model.CommonRequestBody.RequestExt getExtBody$default(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.getExtBody(z);
    }

    private final com.vungle.ads.internal.model.CommonRequestBody.RequestExt getExtBody(boolean withSignals) {
        java.lang.String generateSignals;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String configExtension = com.vungle.ads.internal.ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString(com.vungle.ads.internal.model.Cookie.CONFIG_EXTENSION);
        }
        if (withSignals) {
            try {
                generateSignals = getSignalManager().generateSignals();
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Couldn't convert signals for sending. Error: " + e.getMessage());
            }
            str = configExtension;
            if ((str != null || str.length() == 0) && ((str2 = generateSignals) == null || str2.length() == 0)) {
                return null;
            }
            return new com.vungle.ads.internal.model.CommonRequestBody.RequestExt(configExtension, generateSignals, java.lang.Long.valueOf(com.vungle.ads.internal.ConfigManager.INSTANCE.configLastValidatedTimestamp()));
        }
        generateSignals = null;
        str = configExtension;
        if (str != null) {
        }
        return null;
    }

    public final java.lang.String getConnectionTypeDetail(int type) {
        if (type == 1) {
            return "gprs";
        }
        if (type == 2) {
            return "edge";
        }
        if (type != 20) {
            switch (type) {
                case 4:
                    return "wcdma";
                case 5:
                    return "cdma_evdo_0";
                case 6:
                    return "cdma_evdo_a";
                case 7:
                    return "cdma_1xrtt";
                case 8:
                    return "hsdpa";
                case 9:
                    return "hsupa";
                default:
                    switch (type) {
                        case 12:
                            return "cdma_evdo_b";
                        case 13:
                            return "lte";
                        case 14:
                            return "hrpd";
                        default:
                            return "unknown";
                    }
            }
        }
        return "5g";
    }

    /* compiled from: VungleApiClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final java.lang.String CDMA_1XRTT = "cdma_1xrtt";
        public static final java.lang.String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final java.lang.String CDMA_EVDO_A = "cdma_evdo_a";
        public static final java.lang.String CDMA_EVDO_B = "cdma_evdo_b";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.network.VungleApiClient.ConnectionTypeDetail.Companion INSTANCE = com.vungle.ads.internal.network.VungleApiClient.ConnectionTypeDetail.Companion.$$INSTANCE;
        public static final java.lang.String EDGE = "edge";
        public static final java.lang.String FIFTH_G = "5g";
        public static final java.lang.String GPRS = "gprs";
        public static final java.lang.String HRPD = "hrpd";
        public static final java.lang.String HSDPA = "hsdpa";
        public static final java.lang.String HSUPA = "hsupa";
        public static final java.lang.String LTE = "lte";
        public static final java.lang.String UNKNOWN = "unknown";
        public static final java.lang.String WCDMA = "wcdma";

        /* compiled from: VungleApiClient.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail$Companion;", "", "()V", "CDMA_1XRTT", "", "CDMA_EVDO_0", "CDMA_EVDO_A", "CDMA_EVDO_B", "EDGE", "FIFTH_G", "GPRS", "HRPD", "HSDPA", "HSUPA", "LTE", "UNKNOWN", "WCDMA", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.vungle.ads.internal.network.VungleApiClient.ConnectionTypeDetail.Companion $$INSTANCE = new com.vungle.ads.internal.network.VungleApiClient.ConnectionTypeDetail.Companion();
            public static final java.lang.String CDMA_1XRTT = "cdma_1xrtt";
            public static final java.lang.String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final java.lang.String CDMA_EVDO_A = "cdma_evdo_a";
            public static final java.lang.String CDMA_EVDO_B = "cdma_evdo_b";
            public static final java.lang.String EDGE = "edge";
            public static final java.lang.String FIFTH_G = "5g";
            public static final java.lang.String GPRS = "gprs";
            public static final java.lang.String HRPD = "hrpd";
            public static final java.lang.String HSDPA = "hsdpa";
            public static final java.lang.String HSUPA = "hsupa";
            public static final java.lang.String LTE = "lte";
            public static final java.lang.String UNKNOWN = "unknown";
            public static final java.lang.String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    public final java.lang.Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    private final java.lang.String getConnectionType() {
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        java.lang.Object systemService = this.applicationContext.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type == 9) {
                return "ETHERNET";
            }
            return "UNKNOWN";
        }
        return "NONE";
    }

    public final java.lang.String getConnectionTypeDetail$vungle_ads_release() {
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        java.lang.Object systemService = this.applicationContext.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return getConnectionTypeDetail(activeNetworkInfo.getSubtype());
        }
        return "unknown";
    }
}
