package com.vungle.ads.internal;

/* compiled from: AdInternal.kt */
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b \u0018\u0000 h2\u00020\u0001:\u0002ghB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u00107\u001a\u0002082\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b9J\u0012\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=J\r\u0010>\u001a\u000208H\u0000¢\u0006\u0002\b?J\n\u0010@\u001a\u0004\u0018\u00010AH&J\r\u0010B\u001a\u00020=H\u0000¢\u0006\u0002\bCJ\n\u0010D\u001a\u0004\u0018\u00010;H\u0016J\u0015\u0010E\u001a\u00020=2\u0006\u0010F\u001a\u00020GH\u0000¢\u0006\u0002\bHJ\u0012\u0010I\u001a\u00020=2\b\u0010J\u001a\u0004\u0018\u00010AH&J\u0010\u0010K\u001a\u00020=2\u0006\u0010#\u001a\u00020$H&J,\u0010L\u001a\u0002082\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0005\u001a\u00020\u0001J\u0015\u0010R\u001a\u0002082\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\bSJ\u0010\u0010T\u001a\u0002082\u0006\u0010U\u001a\u00020;H\u0016J\u0010\u0010V\u001a\u0002082\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010W\u001a\u000208J\u0006\u0010X\u001a\u000208J\u0012\u0010Y\u001a\u0004\u0018\u00010;2\u0006\u0010Z\u001a\u00020[H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010;2\u0006\u0010P\u001a\u00020QH\u0002J \u0010]\u001a\u0004\u0018\u00010;2\u0014\u0010^\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020N\u0018\u00010_H\u0002J\u001e\u0010`\u001a\u0004\u0018\u00010;2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020N0_H\u0002J\u0012\u0010a\u001a\u0004\u0018\u00010;2\u0006\u0010b\u001a\u00020GH\u0002J\u0012\u0010c\u001a\u0004\u0018\u00010;2\u0006\u0010P\u001a\u00020QH\u0002J\"\u0010d\u001a\u0004\u0018\u00010;2\u0006\u0010\u0006\u001a\u00020N2\u0006\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020NH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u000e\u00106\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i²\u0006\n\u0010j\u001a\u00020kX\u008a\u0084\u0002²\u0006\n\u0010l\u001a\u00020mX\u008a\u0084\u0002²\u0006\n\u0010n\u001a\u00020oX\u008a\u0084\u0002²\u0006\n\u0010p\u001a\u00020qX\u008a\u0084\u0002²\u0006\n\u0010r\u001a\u00020sX\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020uX\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020uX\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020uX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adLoaderCallback", "value", "Lcom/vungle/ads/internal/AdInternal$AdState;", "adState", "getAdState", "()Lcom/vungle/ads/internal/AdInternal$AdState;", "setAdState", "(Lcom/vungle/ads/internal/AdInternal$AdState;)V", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "baseAdLoader", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getContext", "()Landroid/content/Context;", "loadMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "lossUrlSent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "setPlacement", "(Lcom/vungle/ads/internal/model/Placement;)V", "requestMetric", "showToValidationMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "getShowToValidationMetric$vungle_ads_release", "()Lcom/vungle/ads/OneShotTimeIntervalMetric;", "validationToPresentMetric", "getValidationToPresentMetric$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "Lkotlin/Lazy;", "winUrlSent", "adLoadedAndUpdateConfigure", "", "adLoadedAndUpdateConfigure$vungle_ads_release", "canPlayAd", "Lcom/vungle/ads/VungleError;", "onPlay", "", "cancelDownload", "cancelDownload$vungle_ads_release", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "isAdPlaying", "isAdPlaying$vungle_ads_release", "isAdStateValidOnCanPlay", "isErrorTerminal", "errorCode", "", "isErrorTerminal$vungle_ads_release", "isValidAdSize", com.ironsource.X3.i.O, "isValidAdTypeForPlacement", "loadAd", "placementId", "", "adMarkup", "csbData", "Lcom/vungle/ads/VungleCSBData;", com.ironsource.Vf.j, "onAdLoaded$vungle_ads_release", "onFailure", "error", "onSuccess", "sendLossURL", "sendWinURL", "validateBidFloor", "bidFloor", "", "validateCSBData", "validateExtras", "extras", "", "validateExtrasEntries", "validatePhase", "phase", "validateStringFields", "validateStringLength", "maxLength", "fieldName", "AdState", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/SDKExecutors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AdInternal implements com.vungle.ads.internal.load.AdLoaderCallback {
    private static final long AD_LOAD_BIDDING = 2;
    public static final long AD_LOAD_POST_BID = 3;
    public static final long AD_LOAD_PRIORITY_ACCESS = 4;
    private static final long AD_LOAD_WATERFALL = 1;
    private static final int CSB_DATA_PHASE_PREBID = 2;
    private static final int MAX_CSB_STRING_LENGTH = 500;
    private static final int MAX_EXTRAS_ENTRIES = 50;
    private static final int MAX_EXTRAS_KEY_LENGTH = 100;
    private static final java.lang.String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback;
    private volatile com.vungle.ads.internal.AdInternal.AdState adState;
    private com.vungle.ads.internal.model.AdPayload advertisement;
    private com.vungle.ads.internal.load.BaseAdLoader baseAdLoader;
    private com.vungle.ads.internal.model.BidPayload bidPayload;
    private final android.content.Context context;
    private com.vungle.ads.TimeIntervalMetric loadMetric;
    private com.vungle.ads.internal.util.LogEntry logEntry;
    private final java.util.concurrent.atomic.AtomicBoolean lossUrlSent;
    private com.vungle.ads.internal.model.Placement placement;
    private com.vungle.ads.TimeIntervalMetric requestMetric;
    private final com.vungle.ads.OneShotTimeIntervalMetric showToValidationMetric;
    private final com.vungle.ads.OneShotTimeIntervalMetric validationToPresentMetric;
    private final kotlin.Lazy vungleApiClient$delegate;
    private final java.util.concurrent.atomic.AtomicBoolean winUrlSent;
    public static final com.vungle.ads.internal.AdInternal.Companion Companion = new com.vungle.ads.internal.AdInternal.Companion(null);
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.AdInternal$Companion$json$1
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

    /* compiled from: AdInternal.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.vungle.ads.internal.AdInternal.AdState.values().length];
            iArr[com.vungle.ads.internal.AdInternal.AdState.NEW.ordinal()] = 1;
            iArr[com.vungle.ads.internal.AdInternal.AdState.LOADING.ordinal()] = 2;
            iArr[com.vungle.ads.internal.AdInternal.AdState.READY.ordinal()] = 3;
            iArr[com.vungle.ads.internal.AdInternal.AdState.PLAYING.ordinal()] = 4;
            iArr[com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED.ordinal()] = 5;
            iArr[com.vungle.ads.internal.AdInternal.AdState.FINISHED.ordinal()] = 6;
            iArr[com.vungle.ads.internal.AdInternal.AdState.ERROR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public abstract com.vungle.ads.VungleAdSize getAdSizeForAdRequest();

    public abstract boolean isValidAdSize(com.vungle.ads.VungleAdSize adSize);

    public abstract boolean isValidAdTypeForPlacement(com.vungle.ads.internal.model.Placement placement);

    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    /* compiled from: AdInternal.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$Companion;", "", "()V", "AD_LOAD_BIDDING", "", "AD_LOAD_POST_BID", "AD_LOAD_PRIORITY_ACCESS", "AD_LOAD_WATERFALL", "CSB_DATA_PHASE_PREBID", "", "MAX_CSB_STRING_LENGTH", "MAX_EXTRAS_ENTRIES", "MAX_EXTRAS_KEY_LENGTH", "TAG", "", "THROW_ON_ILLEGAL_TRANSITION", "", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        private Companion() {
        }
    }

    public AdInternal(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = com.vungle.ads.internal.AdInternal.AdState.NEW;
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.vungleApiClient$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$1
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
        this.showToValidationMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new com.vungle.ads.OneShotTimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.winUrlSent = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.lossUrlSent = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.AdInternal.AdState getAdState() {
        return this.adState;
    }

    public final void setAdState(com.vungle.ads.internal.AdInternal.AdState value) {
        com.vungle.ads.internal.model.AdPayload adPayload;
        java.lang.String eventId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (value.isTerminalState() && (adPayload = this.advertisement) != null && (eventId = adPayload.eventId()) != null) {
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context = this.context;
            m10397_set_adState_$lambda1$lambda0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.task.JobRunner>() { // from class: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.task.JobRunner invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.task.JobRunner.class);
                }
            })).execute(com.vungle.ads.internal.task.CleanupJob.INSTANCE.makeJobInfo(eventId));
        }
        this.adState = this.adState.transitionTo(value);
        com.vungle.ads.internal.util.LogEntry logEntry = this.logEntry;
        if (logEntry == null) {
            return;
        }
        logEntry.setAdState$vungle_ads_release(this.adState);
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.task.JobRunner m10397_set_adState_$lambda1$lambda0(kotlin.Lazy<? extends com.vungle.ads.internal.task.JobRunner> lazy) {
        return lazy.getValue();
    }

    public final com.vungle.ads.internal.model.AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final void setAdvertisement(com.vungle.ads.internal.model.AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final com.vungle.ads.internal.model.Placement getPlacement() {
        return this.placement;
    }

    public final void setPlacement(com.vungle.ads.internal.model.Placement placement) {
        this.placement = placement;
    }

    private final com.vungle.ads.internal.network.VungleApiClient getVungleApiClient() {
        return (com.vungle.ads.internal.network.VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    public final com.vungle.ads.OneShotTimeIntervalMetric getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    public final com.vungle.ads.OneShotTimeIntervalMetric getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final com.vungle.ads.internal.util.LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final void setLogEntry$vungle_ads_release(com.vungle.ads.internal.util.LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public static /* synthetic */ com.vungle.ads.VungleError canPlayAd$default(com.vungle.ads.internal.AdInternal adInternal, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return adInternal.canPlayAd(z);
    }

    public final com.vungle.ads.VungleError canPlayAd(boolean onPlay) {
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit;
        com.vungle.ads.AdExpiredError isAdStateValidOnCanPlay = isAdStateValidOnCanPlay();
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            isAdStateValidOnCanPlay = new com.vungle.ads.AdNotLoadedCantPlay("adv is null on onPlay=" + onPlay);
        } else if (isAdStateValidOnCanPlay == null) {
            java.lang.Integer num = null;
            if (adPayload == null || !adPayload.hasExpired()) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ad expiry: ");
            com.vungle.ads.internal.model.AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
                num = adUnit.getExpiry();
            }
            sb.append(num);
            sb.append(", device: ");
            sb.append(java.lang.System.currentTimeMillis());
            java.lang.String sb2 = sb.toString();
            if (onPlay) {
                isAdStateValidOnCanPlay = new com.vungle.ads.AdExpiredOnPlayError(sb2);
            } else {
                isAdStateValidOnCanPlay = new com.vungle.ads.AdExpiredError(sb2);
            }
        }
        if (onPlay) {
            isAdStateValidOnCanPlay.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return isAdStateValidOnCanPlay;
    }

    public final boolean isAdPlaying$vungle_ads_release() {
        return this.adState == com.vungle.ads.internal.AdInternal.AdState.PLAYING || this.adState == com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED;
    }

    public com.vungle.ads.VungleError isAdStateValidOnCanPlay() {
        if (this.adState == com.vungle.ads.internal.AdInternal.AdState.PLAYING) {
            return new com.vungle.ads.InvalidAdStateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.adState == com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED) {
            return new com.vungle.ads.InvalidAdStateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.adState == com.vungle.ads.internal.AdInternal.AdState.READY) {
            return null;
        }
        return new com.vungle.ads.InvalidAdStateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
    }

    private final com.vungle.ads.VungleError validateCSBData(com.vungle.ads.VungleCSBData vungleCSBData) {
        com.vungle.ads.VungleError validateBidFloor = validateBidFloor(vungleCSBData.getBidFloor());
        if (validateBidFloor != null) {
            return validateBidFloor;
        }
        com.vungle.ads.VungleError validatePhase = validatePhase(vungleCSBData.getPhase());
        if (validatePhase != null) {
            return validatePhase;
        }
        com.vungle.ads.VungleError validateStringFields = validateStringFields(vungleCSBData);
        return validateStringFields == null ? validateExtras(vungleCSBData.getExtras()) : validateStringFields;
    }

    private final com.vungle.ads.VungleError validateBidFloor(double d) {
        if (d >= 0.0d) {
            return null;
        }
        return new com.vungle.ads.InvalidCSBDataError("bidFloor must be >= 0, got: " + d);
    }

    private final com.vungle.ads.VungleError validatePhase(int i) {
        if (1 <= i && i < 3) {
            return null;
        }
        return new com.vungle.ads.InvalidCSBDataError("phase must be 1 or 2, got: " + i);
    }

    private final com.vungle.ads.VungleError validateStringFields(com.vungle.ads.VungleCSBData vungleCSBData) {
        com.vungle.ads.VungleError validateStringLength = validateStringLength(vungleCSBData.getAuctionId(), 500, "auctionId");
        if (validateStringLength != null) {
            return validateStringLength;
        }
        com.vungle.ads.VungleError validateStringLength2 = validateStringLength(vungleCSBData.getCreativeId(), 500, "creativeId");
        return validateStringLength2 == null ? validateStringLength(vungleCSBData.getAdUnitId(), 500, "adUnitId") : validateStringLength2;
    }

    private final com.vungle.ads.VungleError validateStringLength(java.lang.String str, int i, java.lang.String str2) {
        if (str.length() <= i) {
            return null;
        }
        return new com.vungle.ads.InvalidCSBDataError(str2 + " exceeds maximum length of " + i);
    }

    private final com.vungle.ads.VungleError validateExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return null;
        }
        if (map.size() > 50) {
            return new com.vungle.ads.InvalidCSBDataError("extras map exceeds maximum of 50 entries, got: " + map.size());
        }
        return validateExtrasEntries(map);
    }

    private final com.vungle.ads.VungleError validateExtrasEntries(java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.length() == 0) {
                return new com.vungle.ads.InvalidCSBDataError("extras contains empty key");
            }
            if (key.length() > 100) {
                return new com.vungle.ads.InvalidCSBDataError("extras key exceeds maximum length of 100: " + key);
            }
            if (value.length() > 500) {
                return new com.vungle.ads.InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
            }
        }
        return null;
    }

    public static /* synthetic */ void loadAd$default(com.vungle.ads.internal.AdInternal adInternal, java.lang.String str, java.lang.String str2, com.vungle.ads.VungleCSBData vungleCSBData, com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
        }
        if ((i & 4) != 0) {
            vungleCSBData = null;
        }
        adInternal.loadAd(str, str2, vungleCSBData, adLoaderCallback);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v1 ??, still in use, count: 1, list:
          (r11v1 ?? I:com.vungle.ads.internal.model.Placement) from 0x00bd: IPUT 
          (r11v1 ?? I:com.vungle.ads.internal.model.Placement)
          (r19v0 'this' ?? I:com.vungle.ads.internal.AdInternal A[IMMUTABLE_TYPE, THIS])
         (LINE:276) com.vungle.ads.internal.AdInternal.placement com.vungle.ads.internal.model.Placement
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void loadAd(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v1 ??, still in use, count: 1, list:
          (r11v1 ?? I:com.vungle.ads.internal.model.Placement) from 0x00bd: IPUT 
          (r11v1 ?? I:com.vungle.ads.internal.model.Placement)
          (r19v0 'this' ?? I:com.vungle.ads.internal.AdInternal A[IMMUTABLE_TYPE, THIS])
         (LINE:276) com.vungle.ads.internal.AdInternal.placement com.vungle.ads.internal.model.Placement
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.OMInjector m10398loadAd$lambda2(kotlin.Lazy<com.vungle.ads.internal.omsdk.OMInjector> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.SDKExecutors m10399loadAd$lambda3(kotlin.Lazy<com.vungle.ads.internal.executor.SDKExecutors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.util.PathProvider m10400loadAd$lambda4(kotlin.Lazy<com.vungle.ads.internal.util.PathProvider> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.downloader.Downloader m10401loadAd$lambda5(kotlin.Lazy<? extends com.vungle.ads.internal.downloader.Downloader> lazy) {
        return lazy.getValue();
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload != null && adPayload.isPartialDownloadEnabled()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        com.vungle.ads.internal.load.BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(com.vungle.ads.internal.AdInternal.AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        onAdLoaded$vungle_ads_release(advertisement);
        com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(advertisement);
        }
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric.markEnd();
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, timeIntervalMetric, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
        }
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        if (timeIntervalMetric2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric2.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric2.markEnd();
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, timeIntervalMetric2, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context = this.context;
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-9$$inlined$inject$1
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
            java.util.List tpatUrls$default = com.vungle.ads.internal.model.AdPayload.getTpatUrls$default(advertisement, com.vungle.ads.internal.Constants.AD_LOAD_DURATION, java.lang.String.valueOf(timeIntervalMetric2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                java.util.Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10402onSuccess$lambda9$lambda7(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    /* renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10402onSuccess$lambda9$lambda7(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(com.vungle.ads.VungleError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            timeIntervalMetric.markEnd();
            com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(error);
        }
    }

    public final boolean isErrorTerminal$vungle_ads_release(int errorCode) {
        return this.adState == com.vungle.ads.internal.AdInternal.AdState.READY && errorCode == 304;
    }

    public final void sendWinURL() {
        java.util.List<java.lang.String> winUrls;
        if (!this.winUrlSent.compareAndSet(false, true)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Win URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload == null || (winUrls = adPayload.getWinUrls()) == null) {
            return;
        }
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$sendWinURL$$inlined$inject$1
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
        for (java.lang.String str : winUrls) {
            if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(str)) {
                com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10404sendWinURL$lambda11(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Invalid win URL skipped: " + str);
            }
        }
    }

    /* renamed from: sendWinURL$lambda-11, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10404sendWinURL$lambda11(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    public final void sendLossURL() {
        java.util.List<java.lang.String> lossUrls;
        if (!this.lossUrlSent.compareAndSet(false, true)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Loss URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload == null || (lossUrls = adPayload.getLossUrls()) == null) {
            return;
        }
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$sendLossURL$$inlined$inject$1
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
        for (java.lang.String str : lossUrls) {
            if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(str)) {
                com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10403sendLossURL$lambda13(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Invalid loss URL skipped: " + str);
            }
        }
    }

    /* renamed from: sendLossURL$lambda-13, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10403sendLossURL$lambda13(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdInternal.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H&J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState;", "", "(Ljava/lang/String;I)V", "canTransitionTo", "", "adState", "isTerminalState", "transitionTo", "NEW", "LOADING", "READY", "PLAYING", "IMPRESSION_LOGGED", "FINISHED", "ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AdState {
        public static final com.vungle.ads.internal.AdInternal.AdState NEW = new com.vungle.ads.internal.AdInternal.AdState.NEW("NEW", 0);
        public static final com.vungle.ads.internal.AdInternal.AdState LOADING = new com.vungle.ads.internal.AdInternal.AdState.LOADING("LOADING", 1);
        public static final com.vungle.ads.internal.AdInternal.AdState READY = new com.vungle.ads.internal.AdInternal.AdState.READY("READY", 2);
        public static final com.vungle.ads.internal.AdInternal.AdState PLAYING = new com.vungle.ads.internal.AdInternal.AdState.PLAYING("PLAYING", 3);
        public static final com.vungle.ads.internal.AdInternal.AdState IMPRESSION_LOGGED = new com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED("IMPRESSION_LOGGED", 4);
        public static final com.vungle.ads.internal.AdInternal.AdState FINISHED = new com.vungle.ads.internal.AdInternal.AdState.FINISHED("FINISHED", 5);
        public static final com.vungle.ads.internal.AdInternal.AdState ERROR = new com.vungle.ads.internal.AdInternal.AdState.ERROR("ERROR", 6);
        private static final /* synthetic */ com.vungle.ads.internal.AdInternal.AdState[] $VALUES = $values();

        private static final /* synthetic */ com.vungle.ads.internal.AdInternal.AdState[] $values() {
            return new com.vungle.ads.internal.AdInternal.AdState[]{NEW, LOADING, READY, PLAYING, IMPRESSION_LOGGED, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static com.vungle.ads.internal.AdInternal.AdState valueOf(java.lang.String str) {
            return (com.vungle.ads.internal.AdInternal.AdState) java.lang.Enum.valueOf(com.vungle.ads.internal.AdInternal.AdState.class, str);
        }

        public static com.vungle.ads.internal.AdInternal.AdState[] values() {
            return (com.vungle.ads.internal.AdInternal.AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState);

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$NEW;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class NEW extends com.vungle.ads.internal.AdInternal.AdState {
            NEW(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.LOADING || adState == com.vungle.ads.internal.AdInternal.AdState.READY || adState == com.vungle.ads.internal.AdInternal.AdState.ERROR;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "idle";
            }
        }

        private AdState(java.lang.String str, int i) {
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$LOADING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class LOADING extends com.vungle.ads.internal.AdInternal.AdState {
            LOADING(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.READY || adState == com.vungle.ads.internal.AdInternal.AdState.ERROR;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "loading";
            }
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$READY;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class READY extends com.vungle.ads.internal.AdInternal.AdState {
            READY(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.PLAYING || adState == com.vungle.ads.internal.AdInternal.AdState.FINISHED || adState == com.vungle.ads.internal.AdInternal.AdState.ERROR;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return com.ironsource.X3.i.s;
            }
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$PLAYING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class PLAYING extends com.vungle.ads.internal.AdInternal.AdState {
            PLAYING(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED || adState == com.vungle.ads.internal.AdInternal.AdState.FINISHED || adState == com.vungle.ads.internal.AdInternal.AdState.ERROR || adState == com.vungle.ads.internal.AdInternal.AdState.READY;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return com.ironsource.X3.i.f0;
            }
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$IMPRESSION_LOGGED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class IMPRESSION_LOGGED extends com.vungle.ads.internal.AdInternal.AdState {
            IMPRESSION_LOGGED(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.FINISHED || adState == com.vungle.ads.internal.AdInternal.AdState.ERROR || adState == com.vungle.ads.internal.AdInternal.AdState.READY;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "impressionLogged";
            }
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$FINISHED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class FINISHED extends com.vungle.ads.internal.AdInternal.AdState {
            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return false;
            }

            FINISHED(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "completed";
            }
        }

        /* compiled from: AdInternal.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$ERROR;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class ERROR extends com.vungle.ads.internal.AdInternal.AdState {
            ERROR(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == com.vungle.ads.internal.AdInternal.AdState.FINISHED;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return com.ironsource.X3.i.t;
            }
        }

        public final com.vungle.ads.internal.AdInternal.AdState transitionTo(com.vungle.ads.internal.AdInternal.AdState adState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adState, "adState");
            if (this != adState && !canTransitionTo(adState)) {
                java.lang.String str = "Cannot transition from " + name() + " to " + adState.name();
                if (com.vungle.ads.internal.AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                    throw new java.lang.IllegalStateException(str);
                }
                com.vungle.ads.internal.util.Logger.INSTANCE.e(com.vungle.ads.internal.AdInternal.TAG, "Illegal state transition", new java.lang.IllegalStateException(str));
            }
            return adState;
        }

        public final boolean isTerminalState() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.vungle.ads.internal.AdInternal.AdState[]{FINISHED, ERROR}).contains(this);
        }
    }
}
