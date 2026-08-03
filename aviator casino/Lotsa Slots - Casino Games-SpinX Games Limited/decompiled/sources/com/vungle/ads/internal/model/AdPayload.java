package com.vungle.ads.internal.model;

/* compiled from: AdPayload.kt */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u008f\u00012\u00020\u0001:\u0018\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0016J\u0006\u0010A\u001a\u00020\u0003J\u0006\u0010B\u001a\u00020\u0011J\b\u0010C\u001a\u0004\u0018\u00010#J\u0006\u0010D\u001a\u00020\u0003J\b\u0010E\u001a\u0004\u0018\u00010\rJ%\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030G2\b\u0010H\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010IJ\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u0004\u0018\u00010\rJ\b\u0010M\u001a\u0004\u0018\u00010\rJ\b\u0010N\u001a\u0004\u0018\u00010OJ\u0006\u0010P\u001a\u00020\rJ\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020>0\u00052\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u0004\u0018\u00010\rJ\u001e\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020S\u0018\u00010G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010V\u001a\u0004\u0018\u00010>2\u0006\u0010W\u001a\u00020\rJ\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005J\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fJ\b\u0010Z\u001a\u0004\u0018\u00010\rJ\u0015\u0010[\u001a\u00020\u00032\b\u0010\\\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010]J.\u0010^\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\u0006\u0010_\u001a\u00020\r2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\rJ\b\u0010b\u001a\u0004\u0018\u00010\rJ\b\u0010c\u001a\u0004\u0018\u00010dJ\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005J\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005J\r\u0010g\u001a\u0004\u0018\u00010h¢\u0006\u0002\u0010iJ\u0006\u0010j\u001a\u00020\u0011J\u0006\u0010k\u001a\u00020\u0011J\u0006\u0010l\u001a\u00020\u0011J\u000e\u0010m\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\rJ\u0006\u0010o\u001a\u00020\u0011J\u0006\u0010p\u001a\u00020\u0011J\u0006\u0010q\u001a\u00020\u0011J\b\u0010r\u001a\u0004\u0018\u00010\rJ\u0006\u0010s\u001a\u00020tJ\u0006\u0010u\u001a\u00020tJ&\u0010v\u001a\u00020t2\u0006\u0010w\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r2\u0006\u0010y\u001a\u00020\r2\u0006\u0010z\u001a\u00020\rJ\b\u0010{\u001a\u0004\u0018\u00010\rJ\u0016\u0010|\u001a\u00020t2\u0006\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020SJ\u0006\u0010\u007f\u001a\u00020\u0011J\u0013\u0010\u0080\u0001\u001a\u00020\r2\b\u0010`\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0081\u0001\u001a\u00020t2\u0007\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001HÇ\u0001J!\u0010\u0087\u0001\u001a\u00020\r*\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\r2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\rH\u0002R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b+\u0010\u001dR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010,R0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u00102\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R&\u00105\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b<\u0010\u001dR(\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020>0\u000f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\u001d\u001a\u0004\b@\u0010/¨\u0006\u0096\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload;", "", "seen1", "", "ads", "", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/vungle/ads/internal/model/ConfigPayload;", "expiryWindowStart", "", "mraidFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "", "incentivizedTextSettings", "", "assetsFullyDownloaded", "", "indexFilePath", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;Ljava/lang/Long;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "ad", "getAd", "()Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig$annotations", "()V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "setAdConfig", "(Lcom/vungle/ads/AdConfig;)V", "adMarkup", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAds$annotations", "getAssetsFullyDownloaded", "()Z", "setAssetsFullyDownloaded", "(Z)V", "getConfig$annotations", "Ljava/lang/Long;", "getIncentivizedTextSettings$annotations", "getIncentivizedTextSettings", "()Ljava/util/Map;", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "<set-?>", "getIndexFilePath", "()Ljava/lang/String;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release$annotations", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "getMraidFiles$annotations", "partialDownloadAssets", "Lcom/vungle/ads/internal/model/AdAsset;", "getPartialDownloadAssets$vungle_ads_release$annotations", "getPartialDownloadAssets$vungle_ads_release", "adHeight", "adLoadOptimizationEnabled", "adUnit", "adWidth", "advAppId", "computeAssetRequirement", "Lkotlin/Pair;", "percentage", "(Ljava/lang/Integer;)Lkotlin/Pair;", "createMRAIDArgs", "Lkotlinx/serialization/json/JsonObject;", "eventId", "getAdSource", "getCSBResponse", "Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "getCreativeId", "getDownloadableAssets", "dir", "Ljava/io/File;", "getExperiments", "getIndexHtmlFile", "getLocalPartialDownloadAssets", "remoteUrl", "getLossUrls", "getMRAIDArgsInMap", "getMediationName", "getShowCloseDelay", "incentivized", "(Ljava/lang/Boolean;)I", "getTpatUrls", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "value", "secondValue", "getViewMasterVersion", "getWebViewSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWinNotifications", "getWinUrls", "getWinningPrice", "", "()Ljava/lang/Double;", "hasExpired", "isAdPoddingEnabled", "isClickCoordinatesTrackingEnabled", "isCriticalAsset", "failingUrl", "isNativeTemplateType", "isPartialDownloadEnabled", "omEnabled", "placementId", "recordExpiryWindowStart", "", "setAssetFullyDownloaded", "setIncentivizedText", "title", "body", "keepWatching", "close", "templateType", "updateAdAssetPath", "adIdentifier", "localFile", "usePreloading", "valueOrEmpty", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "complexReplace", "oldValue", "newValue", "$serializer", "AdSizeInfo", "AdUnit", "CSBResponse", "CacheableReplacement", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PlacementAdUnit", "TemplateSettings", "TpatSerializer", "ViewAbility", "ViewAbilityInfo", "WebViewSettings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final class AdPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.model.AdPayload.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.Companion(null);
    public static final java.lang.String FILE_SCHEME = "file://";
    public static final java.lang.String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final java.lang.String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final java.lang.String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final java.lang.String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final java.lang.String KEY_VM = "vmURL";
    private static final java.lang.String TAG = "AdPayload";
    private static final java.lang.String UNKNOWN = "unknown";
    private com.vungle.ads.AdConfig adConfig;
    private final java.util.List<com.vungle.ads.internal.model.AdPayload.PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final com.vungle.ads.internal.model.ConfigPayload config;
    private java.lang.Long expiryWindowStart;
    private java.util.Map<java.lang.String, java.lang.String> incentivizedTextSettings;
    private java.lang.String indexFilePath;
    private com.vungle.ads.internal.util.LogEntry logEntry;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> mraidFiles;
    private final java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdAsset> partialDownloadAssets;

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getAdConfig$annotations() {
    }

    @kotlinx.serialization.SerialName("ads")
    private static /* synthetic */ void getAds$annotations() {
    }

    @kotlinx.serialization.SerialName(com.helpshift.proactive.InAppViewConstants.CONFIG)
    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AdPayload(int i, @kotlinx.serialization.SerialName("ads") java.util.List list, @kotlinx.serialization.SerialName("config") com.vungle.ads.internal.model.ConfigPayload configPayload, java.lang.Long l, java.util.concurrent.ConcurrentHashMap concurrentHashMap, java.util.Map map, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l;
        }
        if ((i & 8) == 0) {
            this.mraidFiles = new java.util.concurrent.ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.incentivizedTextSettings = new java.util.HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new java.util.LinkedHashMap();
    }

    public AdPayload(java.util.List<com.vungle.ads.internal.model.AdPayload.PlacementAdUnit> list, com.vungle.ads.internal.model.ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new java.util.concurrent.ConcurrentHashMap<>();
        this.incentivizedTextSettings = new java.util.HashMap();
        this.partialDownloadAssets = new java.util.LinkedHashMap();
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.internal.model.AdPayload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ads != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.AdPayload$PlacementAdUnit$$serializer.INSTANCE), self.ads);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.config != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.vungle.ads.internal.model.ConfigPayload$$serializer.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.expiryWindowStart != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.LongSerializer.INSTANCE, self.expiryWindowStart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.mraidFiles, new java.util.concurrent.ConcurrentHashMap())) {
            output.encodeSerializableElement(serialDesc, 3, new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.concurrent.ConcurrentHashMap.class), null, new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE}), self.mraidFiles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.incentivizedTextSettings, new java.util.HashMap())) {
            output.encodeSerializableElement(serialDesc, 4, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), self.incentivizedTextSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.encodeBooleanElement(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.indexFilePath == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.indexFilePath);
    }

    public /* synthetic */ AdPayload(java.util.List list, com.vungle.ads.internal.model.ConfigPayload configPayload, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : configPayload);
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Companion;", "", "()V", "FILE_SCHEME", "", com.vungle.ads.internal.model.AdPayload.INCENTIVIZED_BODY_TEXT, com.vungle.ads.internal.model.AdPayload.INCENTIVIZED_CLOSE_TEXT, com.vungle.ads.internal.model.AdPayload.INCENTIVIZED_CONTINUE_TEXT, com.vungle.ads.internal.model.AdPayload.INCENTIVIZED_TITLE_TEXT, "KEY_VM", "TAG", "UNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload> serializer() {
            return com.vungle.ads.internal.model.AdPayload$$serializer.INSTANCE;
        }
    }

    private final com.vungle.ads.internal.model.AdPayload.PlacementAdUnit getAd() {
        java.util.List<com.vungle.ads.internal.model.AdPayload.PlacementAdUnit> list = this.ads;
        if (list == null) {
            return null;
        }
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    private final com.vungle.ads.internal.model.AdPayload.AdUnit getAdMarkup() {
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public final java.lang.String placementId() {
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final java.lang.String eventId() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final java.lang.String advAppId() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final int adWidth() {
        com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo;
        java.lang.Integer width;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final int adHeight() {
        com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo;
        java.lang.Integer height;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final com.vungle.ads.internal.model.AdPayload.AdUnit adUnit() {
        return getAdMarkup();
    }

    /* renamed from: config, reason: from getter */
    public final com.vungle.ads.internal.model.ConfigPayload getConfig() {
        return this.config;
    }

    public final boolean adLoadOptimizationEnabled() {
        java.lang.Boolean adLoadOptimizationEnabled;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final boolean isPartialDownloadEnabled() {
        java.lang.Boolean partialDownloadEnabled;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null || !partialDownloadEnabled.booleanValue() || isNativeTemplateType()) ? false : true;
    }

    public final boolean isAdPoddingEnabled() {
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        java.util.Map<java.lang.String, java.lang.String> normalReplacements;
        java.lang.String str;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null || (str = normalReplacements.get(com.vungle.ads.internal.Constants.AD_PODDING_KEY)) == null || !kotlin.text.StringsKt.equals(str, "true", true)) ? false : true;
    }

    public final java.lang.String getExperiments() {
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        java.util.Map<java.lang.String, java.lang.String> normalReplacements;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null) {
            return null;
        }
        return normalReplacements.get(com.vungle.ads.internal.Constants.EXPERIMENTS_KEY);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final void setIncentivizedTextSettings(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final com.vungle.ads.AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final void setAdConfig(com.vungle.ads.AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final void setLogEntry$vungle_ads_release(com.vungle.ads.internal.util.LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final java.lang.String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final boolean omEnabled() {
        com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility;
        com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo om;
        java.lang.Boolean isEnabled;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (isEnabled = om.isEnabled()) == null) {
            return false;
        }
        return isEnabled.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        java.lang.Boolean clickCoordinatesEnabled;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(java.lang.String failingUrl) {
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
            if (kotlin.jvm.internal.Intrinsics.areEqual(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final com.vungle.ads.internal.model.AdAsset getLocalPartialDownloadAssets(java.lang.String remoteUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    private final kotlin.Pair<java.lang.String, java.io.File> getIndexHtmlFile(java.io.File dir) {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup;
        java.lang.String vmURL;
        java.lang.Object m10798constructorimpl;
        java.io.File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        if (!com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(vmURL)) {
            vmURL = null;
        }
        if (vmURL == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.model.AdPayload adPayload = this;
            java.lang.String path = new java.net.URI(vmURL).getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "URI(url).path");
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) kotlin.text.StringsKt.trim(path, kotlinx.io.files.FileSystemKt.UnixPathSeparator), new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(split$default.size() >= 2 ? kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.takeLast(split$default, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) m10798constructorimpl;
        if (str == null || (parentFile = dir.getParentFile()) == null) {
            return null;
        }
        return new kotlin.Pair<>(vmURL, new java.io.File(parentFile, str));
    }

    private final kotlin.Pair<java.lang.Boolean, java.lang.Integer> computeAssetRequirement(java.lang.Integer percentage) {
        if (isNativeTemplateType() || !adLoadOptimizationEnabled()) {
            return kotlin.TuplesKt.to(true, null);
        }
        if (isPartialDownloadEnabled()) {
            return kotlin.TuplesKt.to(true, java.lang.Integer.valueOf(java.lang.Math.max(0, percentage != null ? percentage.intValue() : 0)));
        }
        return kotlin.TuplesKt.to(false, null);
    }

    public final java.util.List<com.vungle.ads.internal.model.AdAsset> getDownloadableAssets(java.io.File dir) {
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.Pair<java.lang.String, java.io.File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            java.lang.String component1 = indexHtmlFile.component1();
            java.io.File component2 = indexHtmlFile.component2();
            this.indexFilePath = component2.getAbsolutePath();
            if (!component2.exists()) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "No cacheable index file found, creating new one: " + component2);
                java.lang.String absolutePath = component2.getAbsolutePath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "indexFile.absolutePath");
                arrayList.add(new com.vungle.ads.internal.model.AdAsset(KEY_VM, component1, absolutePath, true, null, 16, null));
            }
        }
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (java.util.Map.Entry<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                java.lang.String key = entry.getKey();
                com.vungle.ads.internal.model.AdPayload.CacheableReplacement value = entry.getValue();
                java.lang.String url = value.getUrl();
                if (url != null && com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(url)) {
                    java.lang.String filePath = new java.io.File(dir, com.vungle.ads.internal.util.FileUtility.INSTANCE.guessFileName(url, value.getExtension())).getAbsolutePath();
                    kotlin.Pair<java.lang.Boolean, java.lang.Integer> computeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                    boolean booleanValue = computeAssetRequirement.component1().booleanValue();
                    java.lang.Integer component22 = computeAssetRequirement.component2();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                    com.vungle.ads.internal.model.AdAsset adAsset = new com.vungle.ads.internal.model.AdAsset(key, url, filePath, booleanValue, component22);
                    java.lang.String extension = value.getExtension();
                    if (extension != null) {
                        adAsset.setMimeType(extension);
                    }
                    arrayList.add(adAsset);
                    if (booleanValue && component22 != null) {
                        this.partialDownloadAssets.put(url, adAsset);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.vungle.ads.internal.model.AdAsset) t2).getIsRequired()), java.lang.Boolean.valueOf(((com.vungle.ads.internal.model.AdAsset) t).getIsRequired()));
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List getTpatUrls$default(com.vungle.ads.internal.model.AdPayload adPayload, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    public final java.util.List<java.lang.String> getTpatUrls(java.lang.String event, java.lang.String value, java.lang.String secondValue) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> tpat;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> tpat2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup2 = getAdMarkup();
        java.util.List<java.lang.String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        java.util.List<java.lang.String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new com.vungle.ads.TpatError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (!event.equals(com.vungle.ads.internal.Constants.CHECKPOINT_0)) {
                    return list;
                }
                java.util.List<java.lang.String> list3 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((java.lang.String) it.next(), com.vungle.ads.internal.Constants.REMOTE_PLAY_KEY, java.lang.String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.Constants.NETWORK_OPERATOR_KEY, value), com.vungle.ads.internal.Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList;
            case -747709511:
                if (!event.equals(com.vungle.ads.internal.Constants.VIDEO_LENGTH_TPAT)) {
                    return list;
                }
                java.util.List<java.lang.String> list4 = list;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                java.util.Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(complexReplace((java.lang.String) it2.next(), com.vungle.ads.internal.Constants.VIDEO_LENGTH_KEY, value));
                }
                return arrayList2;
            case -132489083:
                if (!event.equals(com.vungle.ads.internal.Constants.AD_LOAD_DURATION)) {
                    return list;
                }
                java.util.List<java.lang.String> list5 = list;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                java.util.Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(complexReplace((java.lang.String) it3.next(), com.vungle.ads.internal.Constants.AD_LOAD_DURATION_KEY, value));
                }
                return arrayList3;
            case 1516630125:
                if (!event.equals(com.vungle.ads.internal.Constants.AD_CLOSE)) {
                    return list;
                }
                java.util.List<java.lang.String> list6 = list;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
                java.util.Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(complexReplace(complexReplace((java.lang.String) it4.next(), com.vungle.ads.internal.Constants.AD_DURATION_KEY, value), com.vungle.ads.internal.Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList4;
            case 1940309120:
                if (!event.equals(com.vungle.ads.internal.Constants.DEEPLINK_CLICK)) {
                    return list;
                }
                java.util.List<java.lang.String> list7 = list;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10));
                java.util.Iterator<T> it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(complexReplace((java.lang.String) it5.next(), com.vungle.ads.internal.Constants.DEEPLINK_SUCCESS_KEY, value));
                }
                return arrayList5;
            default:
                return list;
        }
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }

    public final boolean hasExpired() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        java.lang.Long l = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l != null) {
            if ((java.lang.System.currentTimeMillis() - l.longValue()) / 1000 <= (adMarkup.getExpiryDuration() != null ? java.lang.Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        } else {
            if (adMarkup.getExpiry() == null) {
                return false;
            }
            if (java.lang.System.currentTimeMillis() / 1000 <= (adMarkup.getExpiry() != null ? java.lang.Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        }
        return true;
    }

    public final java.util.List<java.lang.String> getWinNotifications() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean isNativeTemplateType() {
        return kotlin.jvm.internal.Intrinsics.areEqual(templateType(), "native");
    }

    public final java.lang.String templateType() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final void setIncentivizedText(java.lang.String title, java.lang.String body, java.lang.String keepWatching, java.lang.String close) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMRAIDArgsInMap() {
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements;
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings2;
        java.util.Map<java.lang.String, java.lang.String> normalReplacements;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new java.lang.IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (java.util.Map.Entry<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                java.lang.String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final kotlinx.serialization.json.JsonObject createMRAIDArgs() {
        java.util.Map<java.lang.String, java.lang.String> mRAIDArgsInMap = getMRAIDArgsInMap();
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mRAIDArgsInMap.entrySet()) {
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
        }
        return jsonObjectBuilder.build();
    }

    public final int getShowCloseDelay(java.lang.Boolean incentivized) {
        java.lang.Integer showClose;
        java.lang.Integer showCloseIncentivized;
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) incentivized, (java.lang.Object) true)) {
            com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final java.lang.String getCreativeId() {
        java.lang.String creativeId;
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final java.lang.String getAdSource() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final java.lang.String getMediationName() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final java.lang.String getViewMasterVersion() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final com.vungle.ads.internal.model.AdPayload.WebViewSettings getWebViewSettings() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final boolean usePreloading() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) adMarkup.getUsePreloading(), (java.lang.Object) true) || isNativeTemplateType()) ? false : true;
    }

    private final java.lang.String valueOrEmpty(java.lang.String value) {
        return value == null ? "" : value;
    }

    private final java.lang.String complexReplace(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String quote = java.util.regex.Pattern.quote(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quote, "quote(oldValue)");
        return new kotlin.text.Regex(quote).replace(str, valueOrEmpty(str3));
    }

    public final synchronized void updateAdAssetPath(java.lang.String adIdentifier, java.io.File localFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "seen1", "", "placementReferenceId", "", "adMarkup", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "csb", "Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;)V", "getAdMarkup$annotations", "()V", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getCsb$annotations", "getCsb", "()Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "getPlacementReferenceId$annotations", "getPlacementReferenceId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PlacementAdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.PlacementAdUnit.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.PlacementAdUnit.Companion(null);
        private final com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup;
        private final com.vungle.ads.internal.model.AdPayload.CSBResponse csb;
        private final java.lang.String placementReferenceId;

        public PlacementAdUnit() {
            this((java.lang.String) null, (com.vungle.ads.internal.model.AdPayload.AdUnit) null, (com.vungle.ads.internal.model.AdPayload.CSBResponse) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.PlacementAdUnit copy$default(com.vungle.ads.internal.model.AdPayload.PlacementAdUnit placementAdUnit, java.lang.String str, com.vungle.ads.internal.model.AdPayload.AdUnit adUnit, com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            if ((i & 4) != 0) {
                cSBResponse = placementAdUnit.csb;
            }
            return placementAdUnit.copy(str, adUnit, cSBResponse);
        }

        @kotlinx.serialization.SerialName("ad_markup")
        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        @kotlinx.serialization.SerialName("csb")
        public static /* synthetic */ void getCsb$annotations() {
        }

        @kotlinx.serialization.SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        /* renamed from: component3, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.CSBResponse getCsb() {
            return this.csb;
        }

        public final com.vungle.ads.internal.model.AdPayload.PlacementAdUnit copy(java.lang.String placementReferenceId, com.vungle.ads.internal.model.AdPayload.AdUnit adMarkup, com.vungle.ads.internal.model.AdPayload.CSBResponse csb) {
            return new com.vungle.ads.internal.model.AdPayload.PlacementAdUnit(placementReferenceId, adMarkup, csb);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.PlacementAdUnit)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.PlacementAdUnit placementAdUnit = (com.vungle.ads.internal.model.AdPayload.PlacementAdUnit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.placementReferenceId, placementAdUnit.placementReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.adMarkup, placementAdUnit.adMarkup) && kotlin.jvm.internal.Intrinsics.areEqual(this.csb, placementAdUnit.csb);
        }

        public int hashCode() {
            java.lang.String str = this.placementReferenceId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = this.adMarkup;
            int hashCode2 = (hashCode + (adUnit == null ? 0 : adUnit.hashCode())) * 31;
            com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse = this.csb;
            return hashCode2 + (cSBResponse != null ? cSBResponse.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ", csb=" + this.csb + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.PlacementAdUnit> serializer() {
                return com.vungle.ads.internal.model.AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ PlacementAdUnit(int i, @kotlinx.serialization.SerialName("placement_reference_id") java.lang.String str, @kotlinx.serialization.SerialName("ad_markup") com.vungle.ads.internal.model.AdPayload.AdUnit adUnit, @kotlinx.serialization.SerialName("csb") com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
            if ((i & 4) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBResponse;
            }
        }

        public PlacementAdUnit(java.lang.String str, com.vungle.ads.internal.model.AdPayload.AdUnit adUnit, com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
            this.csb = cSBResponse;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.PlacementAdUnit self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placementReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.placementReferenceId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adMarkup != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.vungle.ads.internal.model.AdPayload$AdUnit$$serializer.INSTANCE, self.adMarkup);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.csb == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, com.vungle.ads.internal.model.AdPayload$CSBResponse$$serializer.INSTANCE, self.csb);
        }

        public /* synthetic */ PlacementAdUnit(java.lang.String str, com.vungle.ads.internal.model.AdPayload.AdUnit adUnit, com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adUnit, (i & 4) != 0 ? null : cSBResponse);
        }

        public final java.lang.String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final com.vungle.ads.internal.model.AdPayload.AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final com.vungle.ads.internal.model.AdPayload.CSBResponse getCsb() {
            return this.csb;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bo\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ¢\u00012\u00020\u0001:\u0004¡\u0001¢\u0001B\u009f\u0003\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0001\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010,B\u008b\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010-J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u001d\u0010z\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014HÆ\u0003J\u0011\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00101J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00101J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0096\u0003\u0010\u0094\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0095\u0001J\u0015\u0010\u0096\u0001\u001a\u00020\f2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\u0005HÖ\u0001J(\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00002\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030 \u0001HÇ\u0001R \u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00102\u0012\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010/\u001a\u0004\b4\u00105R\u001e\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010/\u001a\u0004\b7\u00108R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010/\u001a\u0004\b:\u00105R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010/\u001a\u0004\b<\u00105R\u001e\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010/\u001a\u0004\b>\u00105R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00102\u0012\u0004\b?\u0010/\u001a\u0004\b@\u00101R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010/\u001a\u0004\bB\u00105R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010/\u001a\u0004\bD\u00105R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bE\u0010/\u001a\u0004\bF\u0010GR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bI\u0010/\u001a\u0004\bJ\u0010GR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bK\u0010/\u001a\u0004\bL\u0010GR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010/\u001a\u0004\bN\u00105R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010/\u001a\u0004\bP\u00105R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010/\u001a\u0004\bR\u0010SR \u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bT\u0010/\u001a\u0004\bU\u0010GR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010/\u001a\u0004\bW\u00105R$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010/\u001a\u0004\bY\u0010SR \u0010(\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00102\u0012\u0004\bZ\u0010/\u001a\u0004\b[\u00101R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\b\\\u0010/\u001a\u0004\b]\u0010GR \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\b^\u0010/\u001a\u0004\b_\u0010GR \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\b`\u0010/\u001a\u0004\ba\u0010GR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010/\u001a\u0004\bc\u0010dR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010/\u001a\u0004\bf\u00105R0\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u0010/\u001a\u0004\bh\u0010iR \u0010'\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00102\u0012\u0004\bj\u0010/\u001a\u0004\bk\u00101R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u0010/\u001a\u0004\bm\u0010nR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u0010/\u001a\u0004\bp\u00105R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u0010/\u001a\u0004\br\u00105R\u001e\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010/\u001a\u0004\bt\u0010u¨\u0006£\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "", "seen1", "", "id", "", "adType", "adSource", com.helpshift.proactive.InAppViewConstants.EXPIRY, "expiryDuration", "deeplinkUrl", "clickCoordinatesEnabled", "", "adLoadOptimizationEnabled", "mediationName", "info", "sleep", "errorCode", "tpat", "", "", com.vungle.ads.internal.model.AdPayload.KEY_VM, "vmVersion", "adMarketId", com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION, "loadAdUrls", "viewAbility", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "templateType", "templateSettings", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "adSizeInfo", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "webViewSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "usePreloading", "partialDownloadEnabled", "maxDownloadRetryAttempts", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAdLoadOptimizationEnabled$annotations", "()V", "getAdLoadOptimizationEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdMarketId$annotations", "getAdMarketId", "()Ljava/lang/String;", "getAdSizeInfo$annotations", "getAdSizeInfo", "()Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSource$annotations", "getAdSource", "getAdType$annotations", "getAdType", "getAdvAppId$annotations", "getAdvAppId", "getClickCoordinatesEnabled$annotations", "getClickCoordinatesEnabled", "getCreativeId$annotations", "getCreativeId", "getDeeplinkUrl$annotations", "getDeeplinkUrl", "getErrorCode$annotations", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiry$annotations", "getExpiry", "getExpiryDuration$annotations", "getExpiryDuration", "getId$annotations", "getId", "getInfo$annotations", "getInfo", "getLoadAdUrls$annotations", "getLoadAdUrls", "()Ljava/util/List;", "getMaxDownloadRetryAttempts$annotations", "getMaxDownloadRetryAttempts", "getMediationName$annotations", "getMediationName", "getNotification$annotations", "getNotification", "getPartialDownloadEnabled$annotations", "getPartialDownloadEnabled", "getShowClose$annotations", "getShowClose", "getShowCloseIncentivized$annotations", "getShowCloseIncentivized", "getSleep$annotations", "getSleep", "getTemplateSettings$annotations", "getTemplateSettings", "()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateType$annotations", "getTemplateType", "getTpat$annotations", "getTpat", "()Ljava/util/Map;", "getUsePreloading$annotations", "getUsePreloading", "getViewAbility$annotations", "getViewAbility", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getVmURL$annotations", "getVmURL", "getVmVersion$annotations", "getVmVersion", "getWebViewSettings$annotations", "getWebViewSettings", "()Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.AdUnit.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.AdUnit.Companion(null);
        private final java.lang.Boolean adLoadOptimizationEnabled;
        private final java.lang.String adMarketId;
        private final com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo;
        private final java.lang.String adSource;
        private final java.lang.String adType;
        private final java.lang.String advAppId;
        private final java.lang.Boolean clickCoordinatesEnabled;
        private final java.lang.String creativeId;
        private final java.lang.String deeplinkUrl;
        private final java.lang.Integer errorCode;
        private final java.lang.Integer expiry;
        private final java.lang.Integer expiryDuration;
        private final java.lang.String id;
        private final java.lang.String info;
        private final java.util.List<java.lang.String> loadAdUrls;
        private final java.lang.Integer maxDownloadRetryAttempts;
        private final java.lang.String mediationName;
        private final java.util.List<java.lang.String> notification;
        private final java.lang.Boolean partialDownloadEnabled;
        private final java.lang.Integer showClose;
        private final java.lang.Integer showCloseIncentivized;
        private final java.lang.Integer sleep;
        private final com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings;
        private final java.lang.String templateType;
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> tpat;
        private final java.lang.Boolean usePreloading;
        private final com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility;
        private final java.lang.String vmURL;
        private final java.lang.String vmVersion;
        private final com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings;

        public AdUnit() {
            this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (com.vungle.ads.internal.model.AdPayload.ViewAbility) null, (java.lang.String) null, (com.vungle.ads.internal.model.AdPayload.TemplateSettings) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (com.vungle.ads.internal.model.AdPayload.AdSizeInfo) null, (com.vungle.ads.internal.model.AdPayload.WebViewSettings) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlinx.serialization.SerialName("ad_load_optimization")
        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        @kotlinx.serialization.SerialName("ad_market_id")
        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        @kotlinx.serialization.SerialName("ad_size")
        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        @kotlinx.serialization.SerialName(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE)
        public static /* synthetic */ void getAdSource$annotations() {
        }

        @kotlinx.serialization.SerialName(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_AD_TYPE)
        public static /* synthetic */ void getAdType$annotations() {
        }

        @kotlinx.serialization.SerialName("app_id")
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @kotlinx.serialization.SerialName("click_coordinates_enabled")
        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        @kotlinx.serialization.SerialName("creative_id")
        public static /* synthetic */ void getCreativeId$annotations() {
        }

        @kotlinx.serialization.SerialName("deeplink_url")
        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        @kotlinx.serialization.SerialName(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE)
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        @kotlinx.serialization.SerialName(com.helpshift.proactive.InAppViewConstants.EXPIRY)
        public static /* synthetic */ void getExpiry$annotations() {
        }

        @kotlinx.serialization.SerialName("expiry_duration")
        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        @kotlinx.serialization.SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @kotlinx.serialization.SerialName("info")
        public static /* synthetic */ void getInfo$annotations() {
        }

        @kotlinx.serialization.SerialName(com.vungle.ads.internal.Constants.LOAD_AD)
        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        @kotlinx.serialization.SerialName("max_download_retry_attempts")
        public static /* synthetic */ void getMaxDownloadRetryAttempts$annotations() {
        }

        @kotlinx.serialization.SerialName("mediation_name")
        public static /* synthetic */ void getMediationName$annotations() {
        }

        @kotlinx.serialization.SerialName(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION)
        public static /* synthetic */ void getNotification$annotations() {
        }

        @kotlinx.serialization.SerialName("ad_partial_download_enabled")
        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        @kotlinx.serialization.SerialName("show_close")
        public static /* synthetic */ void getShowClose$annotations() {
        }

        @kotlinx.serialization.SerialName("show_close_incentivized")
        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        @kotlinx.serialization.SerialName("sleep")
        public static /* synthetic */ void getSleep$annotations() {
        }

        @kotlinx.serialization.SerialName("template_settings")
        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        @kotlinx.serialization.SerialName("template_type")
        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @kotlinx.serialization.Serializable(with = com.vungle.ads.internal.model.AdPayload.TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        @kotlinx.serialization.SerialName("use_preloading")
        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        @kotlinx.serialization.SerialName("viewability")
        public static /* synthetic */ void getViewAbility$annotations() {
        }

        @kotlinx.serialization.SerialName("vm_url")
        public static /* synthetic */ void getVmURL$annotations() {
        }

        @kotlinx.serialization.SerialName("vm_version")
        public static /* synthetic */ void getVmVersion$annotations() {
        }

        @kotlinx.serialization.SerialName("webview_settings")
        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getInfo() {
            return this.info;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Integer getSleep() {
            return this.sleep;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component13() {
            return this.tpat;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.String getVmURL() {
            return this.vmURL;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getVmVersion() {
            return this.vmVersion;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getAdMarketId() {
            return this.adMarketId;
        }

        public final java.util.List<java.lang.String> component17() {
            return this.notification;
        }

        public final java.util.List<java.lang.String> component18() {
            return this.loadAdUrls;
        }

        /* renamed from: component19, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAdType() {
            return this.adType;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.String getTemplateType() {
            return this.templateType;
        }

        /* renamed from: component21, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        /* renamed from: component22, reason: from getter */
        public final java.lang.String getCreativeId() {
            return this.creativeId;
        }

        /* renamed from: component23, reason: from getter */
        public final java.lang.String getAdvAppId() {
            return this.advAppId;
        }

        /* renamed from: component24, reason: from getter */
        public final java.lang.Integer getShowClose() {
            return this.showClose;
        }

        /* renamed from: component25, reason: from getter */
        public final java.lang.Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        /* renamed from: component26, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        /* renamed from: component27, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        /* renamed from: component28, reason: from getter */
        public final java.lang.Boolean getUsePreloading() {
            return this.usePreloading;
        }

        /* renamed from: component29, reason: from getter */
        public final java.lang.Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAdSource() {
            return this.adSource;
        }

        /* renamed from: component30, reason: from getter */
        public final java.lang.Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getExpiry() {
            return this.expiry;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getMediationName() {
            return this.mediationName;
        }

        public final com.vungle.ads.internal.model.AdPayload.AdUnit copy(java.lang.String id, java.lang.String adType, java.lang.String adSource, java.lang.Integer expiry, java.lang.Integer expiryDuration, java.lang.String deeplinkUrl, java.lang.Boolean clickCoordinatesEnabled, java.lang.Boolean adLoadOptimizationEnabled, java.lang.String mediationName, java.lang.String info, java.lang.Integer sleep, java.lang.Integer errorCode, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> tpat, java.lang.String vmURL, java.lang.String vmVersion, java.lang.String adMarketId, java.util.List<java.lang.String> notification, java.util.List<java.lang.String> loadAdUrls, com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility, java.lang.String templateType, com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings, java.lang.String creativeId, java.lang.String advAppId, java.lang.Integer showClose, java.lang.Integer showCloseIncentivized, com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo, com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings, java.lang.Boolean usePreloading, java.lang.Boolean partialDownloadEnabled, java.lang.Integer maxDownloadRetryAttempts) {
            return new com.vungle.ads.internal.model.AdPayload.AdUnit(id, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled, maxDownloadRetryAttempts);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.AdUnit)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = (com.vungle.ads.internal.model.AdPayload.AdUnit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, adUnit.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.adType, adUnit.adType) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSource, adUnit.adSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiry, adUnit.expiry) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDuration, adUnit.expiryDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkUrl, adUnit.deeplinkUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediationName, adUnit.mediationName) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, adUnit.info) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleep, adUnit.sleep) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, adUnit.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.tpat, adUnit.tpat) && kotlin.jvm.internal.Intrinsics.areEqual(this.vmURL, adUnit.vmURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.vmVersion, adUnit.vmVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.adMarketId, adUnit.adMarketId) && kotlin.jvm.internal.Intrinsics.areEqual(this.notification, adUnit.notification) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadAdUrls, adUnit.loadAdUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewAbility, adUnit.viewAbility) && kotlin.jvm.internal.Intrinsics.areEqual(this.templateType, adUnit.templateType) && kotlin.jvm.internal.Intrinsics.areEqual(this.templateSettings, adUnit.templateSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.creativeId, adUnit.creativeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.advAppId, adUnit.advAppId) && kotlin.jvm.internal.Intrinsics.areEqual(this.showClose, adUnit.showClose) && kotlin.jvm.internal.Intrinsics.areEqual(this.showCloseIncentivized, adUnit.showCloseIncentivized) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSizeInfo, adUnit.adSizeInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewSettings, adUnit.webViewSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.usePreloading, adUnit.usePreloading) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialDownloadEnabled, adUnit.partialDownloadEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxDownloadRetryAttempts, adUnit.maxDownloadRetryAttempts);
        }

        public int hashCode() {
            java.lang.String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.adType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.adSource;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.Integer num = this.expiry;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            java.lang.Integer num2 = this.expiryDuration;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            java.lang.String str4 = this.deeplinkUrl;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            java.lang.Boolean bool = this.clickCoordinatesEnabled;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            java.lang.Boolean bool2 = this.adLoadOptimizationEnabled;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            java.lang.String str5 = this.mediationName;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.info;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.Integer num3 = this.sleep;
            int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            java.lang.Integer num4 = this.errorCode;
            int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.tpat;
            int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
            java.lang.String str7 = this.vmURL;
            int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            java.lang.String str8 = this.vmVersion;
            int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            java.lang.String str9 = this.adMarketId;
            int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            java.util.List<java.lang.String> list = this.notification;
            int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            java.util.List<java.lang.String> list2 = this.loadAdUrls;
            int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility = this.viewAbility;
            int hashCode19 = (hashCode18 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            java.lang.String str10 = this.templateType;
            int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings = this.templateSettings;
            int hashCode21 = (hashCode20 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            java.lang.String str11 = this.creativeId;
            int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            java.lang.String str12 = this.advAppId;
            int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
            java.lang.Integer num5 = this.showClose;
            int hashCode24 = (hashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            java.lang.Integer num6 = this.showCloseIncentivized;
            int hashCode25 = (hashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
            com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo = this.adSizeInfo;
            int hashCode26 = (hashCode25 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings = this.webViewSettings;
            int hashCode27 = (hashCode26 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            java.lang.Boolean bool3 = this.usePreloading;
            int hashCode28 = (hashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            java.lang.Boolean bool4 = this.partialDownloadEnabled;
            int hashCode29 = (hashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            java.lang.Integer num7 = this.maxDownloadRetryAttempts;
            return hashCode29 + (num7 != null ? num7.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", maxDownloadRetryAttempts=" + this.maxDownloadRetryAttempts + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.AdUnit> serializer() {
                return com.vungle.ads.internal.model.AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ AdUnit(int i, @kotlinx.serialization.SerialName("id") java.lang.String str, @kotlinx.serialization.SerialName("ad_type") java.lang.String str2, @kotlinx.serialization.SerialName("ad_source") java.lang.String str3, @kotlinx.serialization.SerialName("expiry") java.lang.Integer num, @kotlinx.serialization.SerialName("expiry_duration") java.lang.Integer num2, @kotlinx.serialization.SerialName("deeplink_url") java.lang.String str4, @kotlinx.serialization.SerialName("click_coordinates_enabled") java.lang.Boolean bool, @kotlinx.serialization.SerialName("ad_load_optimization") java.lang.Boolean bool2, @kotlinx.serialization.SerialName("mediation_name") java.lang.String str5, @kotlinx.serialization.SerialName("info") java.lang.String str6, @kotlinx.serialization.SerialName("sleep") java.lang.Integer num3, @kotlinx.serialization.SerialName("error_code") java.lang.Integer num4, @kotlinx.serialization.Serializable(with = com.vungle.ads.internal.model.AdPayload.TpatSerializer.class) java.util.Map map, @kotlinx.serialization.SerialName("vm_url") java.lang.String str7, @kotlinx.serialization.SerialName("vm_version") java.lang.String str8, @kotlinx.serialization.SerialName("ad_market_id") java.lang.String str9, @kotlinx.serialization.SerialName("notification") java.util.List list, @kotlinx.serialization.SerialName("load_ad") java.util.List list2, @kotlinx.serialization.SerialName("viewability") com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility, @kotlinx.serialization.SerialName("template_type") java.lang.String str10, @kotlinx.serialization.SerialName("template_settings") com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings, @kotlinx.serialization.SerialName("creative_id") java.lang.String str11, @kotlinx.serialization.SerialName("app_id") java.lang.String str12, @kotlinx.serialization.SerialName("show_close") java.lang.Integer num5, @kotlinx.serialization.SerialName("show_close_incentivized") java.lang.Integer num6, @kotlinx.serialization.SerialName("ad_size") com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo, @kotlinx.serialization.SerialName("webview_settings") com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings, @kotlinx.serialization.SerialName("use_preloading") java.lang.Boolean bool3, @kotlinx.serialization.SerialName("ad_partial_download_enabled") java.lang.Boolean bool4, @kotlinx.serialization.SerialName("max_download_retry_attempts") java.lang.Integer num7, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i & 256) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i & 512) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i & 1024) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i & 2048) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i & 4096) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i & 8192) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((i & 16384) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((32768 & i) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((65536 & i) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((131072 & i) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((262144 & i) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((524288 & i) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((1048576 & i) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((2097152 & i) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((4194304 & i) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            this.showClose = (8388608 & i) == 0 ? 0 : num5;
            this.showCloseIncentivized = (16777216 & i) == 0 ? 0 : num6;
            if ((33554432 & i) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((67108864 & i) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (134217728 & i) == 0 ? false : bool3;
            if ((268435456 & i) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool4;
            }
            this.maxDownloadRetryAttempts = (i & 536870912) == 0 ? 0 : num7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str5, java.lang.String str6, java.lang.Integer num3, java.lang.Integer num4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility, java.lang.String str10, com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings, java.lang.String str11, java.lang.String str12, java.lang.Integer num5, java.lang.Integer num6, com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo, com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Integer num7) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool3;
            this.partialDownloadEnabled = bool4;
            this.maxDownloadRetryAttempts = num7;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.AdUnit self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            java.lang.Integer num;
            java.lang.Integer num2;
            java.lang.Integer num3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.id);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adType != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.adType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSource != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.adSource);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiry != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.expiry);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.expiryDuration != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.expiryDuration);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.deeplinkUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.deeplinkUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.clickCoordinatesEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.adLoadOptimizationEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.mediationName != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.mediationName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.info != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.info);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sleep != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.sleep);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || self.errorCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.errorCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.tpat != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, com.vungle.ads.internal.model.AdPayload.TpatSerializer.INSTANCE, self.tpat);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.vmURL != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.vmURL);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.vmVersion != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.vmVersion);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.adMarketId != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.adMarketId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.notification != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.notification);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.loadAdUrls != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.loadAdUrls);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.viewAbility != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, com.vungle.ads.internal.model.AdPayload$ViewAbility$$serializer.INSTANCE, self.viewAbility);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self.templateType != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.templateType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || self.templateSettings != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, com.vungle.ads.internal.model.AdPayload$TemplateSettings$$serializer.INSTANCE, self.templateSettings);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 21) || self.creativeId != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.creativeId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 22) || self.advAppId != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.advAppId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 23) || (num3 = self.showClose) == null || num3.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 23, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.showClose);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 24) || (num2 = self.showCloseIncentivized) == null || num2.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 24, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.showCloseIncentivized);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 25) || self.adSizeInfo != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, com.vungle.ads.internal.model.AdPayload$AdSizeInfo$$serializer.INSTANCE, self.adSizeInfo);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 26) || self.webViewSettings != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, com.vungle.ads.internal.model.AdPayload$WebViewSettings$$serializer.INSTANCE, self.webViewSettings);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 27) || !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) self.usePreloading, (java.lang.Object) false)) {
                output.encodeNullableSerializableElement(serialDesc, 27, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.usePreloading);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 28) || self.partialDownloadEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.partialDownloadEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 29) || (num = self.maxDownloadRetryAttempts) == null || num.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 29, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.maxDownloadRetryAttempts);
            }
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getAdType() {
            return this.adType;
        }

        public final java.lang.String getAdSource() {
            return this.adSource;
        }

        public final java.lang.Integer getExpiry() {
            return this.expiry;
        }

        public final java.lang.Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        public final java.lang.String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final java.lang.Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final java.lang.Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final java.lang.String getMediationName() {
            return this.mediationName;
        }

        public final java.lang.String getInfo() {
            return this.info;
        }

        public final java.lang.Integer getSleep() {
            return this.sleep;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getTpat() {
            return this.tpat;
        }

        public final java.lang.String getVmURL() {
            return this.vmURL;
        }

        public final java.lang.String getVmVersion() {
            return this.vmVersion;
        }

        public final java.lang.String getAdMarketId() {
            return this.adMarketId;
        }

        public final java.util.List<java.lang.String> getNotification() {
            return this.notification;
        }

        public final java.util.List<java.lang.String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final com.vungle.ads.internal.model.AdPayload.ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final java.lang.String getTemplateType() {
            return this.templateType;
        }

        public final com.vungle.ads.internal.model.AdPayload.TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final java.lang.String getCreativeId() {
            return this.creativeId;
        }

        public final java.lang.String getAdvAppId() {
            return this.advAppId;
        }

        public /* synthetic */ AdUnit(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str5, java.lang.String str6, java.lang.Integer num3, java.lang.Integer num4, java.util.Map map, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List list, java.util.List list2, com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility, java.lang.String str10, com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings, java.lang.String str11, java.lang.String str12, java.lang.Integer num5, java.lang.Integer num6, com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo, com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Integer num7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : list, (i & 131072) != 0 ? null : list2, (i & 262144) != 0 ? null : viewAbility, (i & 524288) != 0 ? null : str10, (i & 1048576) != 0 ? null : templateSettings, (i & 2097152) != 0 ? null : str11, (i & 4194304) != 0 ? null : str12, (i & 8388608) != 0 ? 0 : num5, (i & 16777216) != 0 ? 0 : num6, (i & 33554432) != 0 ? null : adSizeInfo, (i & androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : webViewSettings, (i & 134217728) != 0 ? false : bool3, (i & 268435456) != 0 ? null : bool4, (i & 536870912) != 0 ? 0 : num7);
        }

        public final java.lang.Integer getShowClose() {
            return this.showClose;
        }

        public final java.lang.Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final com.vungle.ads.internal.model.AdPayload.AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final com.vungle.ads.internal.model.AdPayload.WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public final java.lang.Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final java.lang.Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final java.lang.Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TpatSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "", "", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TpatSerializer extends kotlinx.serialization.json.JsonTransformingSerializer<java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>> {
        public static final com.vungle.ads.internal.model.AdPayload.TpatSerializer INSTANCE = new com.vungle.ads.internal.model.AdPayload.TpatSerializer();

        private TpatSerializer() {
            super(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE))));
        }

        @Override // kotlinx.serialization.json.JsonTransformingSerializer
        protected kotlinx.serialization.json.JsonElement transformDeserialize(kotlinx.serialization.json.JsonElement element) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
            kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(element);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry : jsonObject.entrySet()) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new kotlinx.serialization.json.JsonObject(linkedHashMap);
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "seen1", "", "normalReplacements", "", "", "cacheableReplacements", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;Ljava/util/Map;)V", "getCacheableReplacements$annotations", "()V", "getCacheableReplacements", "()Ljava/util/Map;", "getNormalReplacements$annotations", "getNormalReplacements", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TemplateSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.TemplateSettings.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.TemplateSettings.Companion(null);
        private final java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements;
        private final java.util.Map<java.lang.String, java.lang.String> normalReplacements;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((java.util.Map) null, (java.util.Map) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.TemplateSettings copy$default(com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        @kotlinx.serialization.SerialName("cacheable_replacements")
        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        @kotlinx.serialization.SerialName("normal_replacements")
        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public final java.util.Map<java.lang.String, java.lang.String> component1() {
            return this.normalReplacements;
        }

        public final java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final com.vungle.ads.internal.model.AdPayload.TemplateSettings copy(java.util.Map<java.lang.String, java.lang.String> normalReplacements, java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements) {
            return new com.vungle.ads.internal.model.AdPayload.TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.TemplateSettings)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings = (com.vungle.ads.internal.model.AdPayload.TemplateSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.normalReplacements, templateSettings.normalReplacements) && kotlin.jvm.internal.Intrinsics.areEqual(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public int hashCode() {
            java.util.Map<java.lang.String, java.lang.String> map = this.normalReplacements;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> map2 = this.cacheableReplacements;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.TemplateSettings> serializer() {
                return com.vungle.ads.internal.model.AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ TemplateSettings(int i, @kotlinx.serialization.SerialName("normal_replacements") java.util.Map map, @kotlinx.serialization.SerialName("cacheable_replacements") java.util.Map map2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.TemplateSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.normalReplacements != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), self.normalReplacements);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.vungle.ads.internal.model.AdPayload$CacheableReplacement$$serializer.INSTANCE), self.cacheableReplacements);
        }

        public /* synthetic */ TemplateSettings(java.util.Map map, java.util.Map map2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public final java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B9\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "", "seen1", "", "url", "", com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, "downloadPercent", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDownloadPercent$annotations", "()V", "getDownloadPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtension", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CacheableReplacement {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.CacheableReplacement.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.CacheableReplacement.Companion(null);
        private final java.lang.Integer downloadPercent;
        private final java.lang.String extension;
        private final java.lang.String url;

        public CacheableReplacement() {
            this((java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.CacheableReplacement copy$default(com.vungle.ads.internal.model.AdPayload.CacheableReplacement cacheableReplacement, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        @kotlinx.serialization.SerialName("download_percent")
        public static /* synthetic */ void getDownloadPercent$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExtension() {
            return this.extension;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final com.vungle.ads.internal.model.AdPayload.CacheableReplacement copy(java.lang.String url, java.lang.String extension, java.lang.Integer downloadPercent) {
            return new com.vungle.ads.internal.model.AdPayload.CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.CacheableReplacement)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.CacheableReplacement cacheableReplacement = (com.vungle.ads.internal.model.AdPayload.CacheableReplacement) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, cacheableReplacement.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.extension, cacheableReplacement.extension) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public int hashCode() {
            java.lang.String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.extension;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.Integer num = this.downloadPercent;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.CacheableReplacement> serializer() {
                return com.vungle.ads.internal.model.AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CacheableReplacement(int i, java.lang.String str, java.lang.String str2, @kotlinx.serialization.SerialName("download_percent") java.lang.Integer num, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.CacheableReplacement self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.url != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.url);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extension != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.extension);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.downloadPercent);
        }

        public /* synthetic */ CacheableReplacement(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getExtension() {
            return this.extension;
        }

        public final java.lang.Integer getDownloadPercent() {
            return this.downloadPercent;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "", "seen1", "", "om", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;)V", "getOm", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ViewAbility {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.ViewAbility.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.ViewAbility.Companion(null);
        private final com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo om;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.ViewAbility copy$default(com.vungle.ads.internal.model.AdPayload.ViewAbility viewAbility, com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo getOm() {
            return this.om;
        }

        public final com.vungle.ads.internal.model.AdPayload.ViewAbility copy(com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo om) {
            return new com.vungle.ads.internal.model.AdPayload.ViewAbility(om);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.vungle.ads.internal.model.AdPayload.ViewAbility) && kotlin.jvm.internal.Intrinsics.areEqual(this.om, ((com.vungle.ads.internal.model.AdPayload.ViewAbility) other).om);
        }

        public int hashCode() {
            com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public java.lang.String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.ViewAbility> serializer() {
                return com.vungle.ads.internal.model.AdPayload$ViewAbility$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ViewAbility(int i, com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.ViewAbility self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.om == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, com.vungle.ads.internal.model.AdPayload$ViewAbilityInfo$$serializer.INSTANCE, self.om);
        }

        public /* synthetic */ ViewAbility(com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewAbilityInfo);
        }

        public final com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo getOm() {
            return this.om;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0004\u0010\u0011¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "", "seen1", "", "isEnabled", "", "extraVast", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getExtraVast$annotations", "()V", "getExtraVast", "()Ljava/lang/String;", "isEnabled$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ViewAbilityInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo.Companion(null);
        private final java.lang.String extraVast;
        private final java.lang.Boolean isEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((java.lang.Boolean) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo copy$default(com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        @kotlinx.serialization.SerialName("extra_vast")
        public static /* synthetic */ void getExtraVast$annotations() {
        }

        @kotlinx.serialization.SerialName("is_enabled")
        public static /* synthetic */ void isEnabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExtraVast() {
            return this.extraVast;
        }

        public final com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo copy(java.lang.Boolean isEnabled, java.lang.String extraVast) {
            return new com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo viewAbilityInfo = (com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.isEnabled, viewAbilityInfo.isEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.extraVast, viewAbilityInfo.extraVast);
        }

        public int hashCode() {
            java.lang.Boolean bool = this.isEnabled;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            java.lang.String str = this.extraVast;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo> serializer() {
                return com.vungle.ads.internal.model.AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ViewAbilityInfo(int i, @kotlinx.serialization.SerialName("is_enabled") java.lang.Boolean bool, @kotlinx.serialization.SerialName("extra_vast") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(java.lang.Boolean bool, java.lang.String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.isEnabled);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.extraVast);
        }

        public /* synthetic */ ViewAbilityInfo(java.lang.Boolean bool, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
        }

        public final java.lang.Boolean isEnabled() {
            return this.isEnabled;
        }

        public final java.lang.String getExtraVast() {
            return this.extraVast;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "seen1", "", "width", "height", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight$annotations", "()V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth$annotations", "getWidth", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AdSizeInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.AdSizeInfo.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.AdSizeInfo.Companion(null);
        private final java.lang.Integer height;
        private final java.lang.Integer width;

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((java.lang.Integer) null, (java.lang.Integer) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.AdSizeInfo copy$default(com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        @kotlinx.serialization.SerialName(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)
        public static /* synthetic */ void getHeight$annotations() {
        }

        @kotlinx.serialization.SerialName("w")
        public static /* synthetic */ void getWidth$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final com.vungle.ads.internal.model.AdPayload.AdSizeInfo copy(java.lang.Integer width, java.lang.Integer height) {
            return new com.vungle.ads.internal.model.AdPayload.AdSizeInfo(width, height);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.AdSizeInfo)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.AdSizeInfo adSizeInfo = (com.vungle.ads.internal.model.AdPayload.AdSizeInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.width, adSizeInfo.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, adSizeInfo.height);
        }

        public int hashCode() {
            java.lang.Integer num = this.width;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            java.lang.Integer num2 = this.height;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.AdSizeInfo> serializer() {
                return com.vungle.ads.internal.model.AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ AdSizeInfo(int i, @kotlinx.serialization.SerialName("w") java.lang.Integer num, @kotlinx.serialization.SerialName("h") java.lang.Integer num2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            this.width = (i & 1) == 0 ? 0 : num;
            if ((i & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public AdSizeInfo(java.lang.Integer num, java.lang.Integer num2) {
            this.width = num;
            this.height = num2;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.AdSizeInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            java.lang.Integer num;
            java.lang.Integer num2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.width);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.height);
            }
        }

        public /* synthetic */ AdSizeInfo(java.lang.Integer num, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "seen1", "", "allowFileAccessFromFileUrls", "", "allowUniversalAccessFromFileUrls", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowFileAccessFromFileUrls", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowUniversalAccessFromFileUrls$annotations", "getAllowUniversalAccessFromFileUrls", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class WebViewSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.WebViewSettings.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.WebViewSettings.Companion(null);
        private final java.lang.Boolean allowFileAccessFromFileUrls;
        private final java.lang.Boolean allowUniversalAccessFromFileUrls;

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((java.lang.Boolean) null, (java.lang.Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.WebViewSettings copy$default(com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        @kotlinx.serialization.SerialName("allow_file_access_from_file_urls")
        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        @kotlinx.serialization.SerialName("allow_universal_access_from_file_urls")
        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final com.vungle.ads.internal.model.AdPayload.WebViewSettings copy(java.lang.Boolean allowFileAccessFromFileUrls, java.lang.Boolean allowUniversalAccessFromFileUrls) {
            return new com.vungle.ads.internal.model.AdPayload.WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.WebViewSettings)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings = (com.vungle.ads.internal.model.AdPayload.WebViewSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public int hashCode() {
            java.lang.Boolean bool = this.allowFileAccessFromFileUrls;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            java.lang.Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.WebViewSettings> serializer() {
                return com.vungle.ads.internal.model.AdPayload$WebViewSettings$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ WebViewSettings(int i, @kotlinx.serialization.SerialName("allow_file_access_from_file_urls") java.lang.Boolean bool, @kotlinx.serialization.SerialName("allow_universal_access_from_file_urls") java.lang.Boolean bool2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.WebViewSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.allowFileAccessFromFileUrls);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.allowUniversalAccessFromFileUrls);
        }

        public /* synthetic */ WebViewSettings(java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
        }

        public final java.lang.Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final java.lang.Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }
    }

    /* compiled from: AdPayload.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0017\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "", "seen1", "", "price", "", "nurls", "", "", "lurls", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)V", "getLurls$annotations", "()V", "getLurls", "()Ljava/util/List;", "getNurls$annotations", "getNurls", "getPrice$annotations", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CSBResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.model.AdPayload.CSBResponse.Companion INSTANCE = new com.vungle.ads.internal.model.AdPayload.CSBResponse.Companion(null);
        private final java.util.List<java.lang.String> lurls;
        private final java.util.List<java.lang.String> nurls;
        private final java.lang.Double price;

        public CSBResponse() {
            this((java.lang.Double) null, (java.util.List) null, (java.util.List) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.vungle.ads.internal.model.AdPayload.CSBResponse copy$default(com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse, java.lang.Double d, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = cSBResponse.price;
            }
            if ((i & 2) != 0) {
                list = cSBResponse.nurls;
            }
            if ((i & 4) != 0) {
                list2 = cSBResponse.lurls;
            }
            return cSBResponse.copy(d, list, list2);
        }

        @kotlinx.serialization.SerialName("lurls")
        public static /* synthetic */ void getLurls$annotations() {
        }

        @kotlinx.serialization.SerialName("nurls")
        public static /* synthetic */ void getNurls$annotations() {
        }

        @kotlinx.serialization.SerialName("price")
        public static /* synthetic */ void getPrice$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Double getPrice() {
            return this.price;
        }

        public final java.util.List<java.lang.String> component2() {
            return this.nurls;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.lurls;
        }

        public final com.vungle.ads.internal.model.AdPayload.CSBResponse copy(java.lang.Double price, java.util.List<java.lang.String> nurls, java.util.List<java.lang.String> lurls) {
            return new com.vungle.ads.internal.model.AdPayload.CSBResponse(price, nurls, lurls);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.model.AdPayload.CSBResponse)) {
                return false;
            }
            com.vungle.ads.internal.model.AdPayload.CSBResponse cSBResponse = (com.vungle.ads.internal.model.AdPayload.CSBResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.price, (java.lang.Object) cSBResponse.price) && kotlin.jvm.internal.Intrinsics.areEqual(this.nurls, cSBResponse.nurls) && kotlin.jvm.internal.Intrinsics.areEqual(this.lurls, cSBResponse.lurls);
        }

        public int hashCode() {
            java.lang.Double d = this.price;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            java.util.List<java.lang.String> list = this.nurls;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            java.util.List<java.lang.String> list2 = this.lurls;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "CSBResponse(price=" + this.price + ", nurls=" + this.nurls + ", lurls=" + this.lurls + ')';
        }

        /* compiled from: AdPayload.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CSBResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$CSBResponse;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AdPayload.CSBResponse> serializer() {
                return com.vungle.ads.internal.model.AdPayload$CSBResponse$$serializer.INSTANCE;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CSBResponse(int i, @kotlinx.serialization.SerialName("price") java.lang.Double d, @kotlinx.serialization.SerialName("nurls") java.util.List list, @kotlinx.serialization.SerialName("lurls") java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.price = null;
            } else {
                this.price = d;
            }
            if ((i & 2) == 0) {
                this.nurls = null;
            } else {
                this.nurls = list;
            }
            if ((i & 4) == 0) {
                this.lurls = null;
            } else {
                this.lurls = list2;
            }
        }

        public CSBResponse(java.lang.Double d, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            this.price = d;
            this.nurls = list;
            this.lurls = list2;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.vungle.ads.internal.model.AdPayload.CSBResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.price != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, self.price);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.nurls != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.nurls);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.lurls == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.lurls);
        }

        public /* synthetic */ CSBResponse(java.lang.Double d, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
        }

        public final java.lang.Double getPrice() {
            return this.price;
        }

        public final java.util.List<java.lang.String> getNurls() {
            return this.nurls;
        }

        public final java.util.List<java.lang.String> getLurls() {
            return this.lurls;
        }
    }

    public final com.vungle.ads.internal.model.AdPayload.CSBResponse getCSBResponse() {
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getCsb();
        }
        return null;
    }

    public final java.lang.Double getWinningPrice() {
        com.vungle.ads.internal.model.AdPayload.CSBResponse csb;
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getPrice();
    }

    public final java.util.List<java.lang.String> getWinUrls() {
        com.vungle.ads.internal.model.AdPayload.CSBResponse csb;
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getNurls();
    }

    public final java.util.List<java.lang.String> getLossUrls() {
        com.vungle.ads.internal.model.AdPayload.CSBResponse csb;
        com.vungle.ads.internal.model.AdPayload.PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getLurls();
    }
}
