package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#JS\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\"\u0010,\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020*0(j\u0002`+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b9\u0010:J\u0089\u0001\u0010F\u001a\u00020*2\u0006\u00104\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u00052\b\u0010?\u001a\u0004\u0018\u00010\u00052\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u00020&2\"\u0010C\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020*0(j\u0002`+2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010E\u001a\u00020\u000fH\u0002¢\u0006\u0004\bF\u0010GJm\u00109\u001a\u00020*2\u0006\u00104\u001a\u00020H2\b\u0010<\u001a\u0004\u0018\u00010\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u000f2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020&2\"\u0010A\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020*0(j\u0002`+2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0-H\u0002¢\u0006\u0004\b9\u0010IR\u001a\u0010J\u001a\u00020\u000f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010NR\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010F\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u001c\u001a\u00020\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010S\u001a\u00020H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010[R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\\\u001a\u0004\b]\u0010^R\u0014\u00109\u001a\u00020_8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010`R\u001a\u0010\u0002\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010a\u001a\u0004\bb\u0010cR(\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010 R\u001a\u0010h\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0016\u00107\u001a\u0004\u0018\u00010\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010lR\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010p\u001a\u0004\bq\u0010rR\u0016\u0010s\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bw\u0010KR\u0018\u0010w\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\by\u0010vR\"\u0010z\u001a\u0002018\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bz\u0010t\u001a\u0004\b{\u00103\"\u0004\b|\u0010}R\u0018\u0010y\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bx\u0010\u007fR\u001b\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\r\n\u0004\b\u0006\u0010i\u001a\u0005\b\u0080\u0001\u0010kR\u0018\u0010\u0082\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumResourceScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "url", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "", "key", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "", "initialAttributes", "", "serverTimeOffsetInMs", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "networkSettledMetricResolver", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;Ljava/util/Map;JLcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/FeaturesContextResolver;FLcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "getCustomAttributes", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "isActive", "()Z", "p0", "", "Lcom/datadog/android/rum/model/ResourceEvent$Error;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/util/List;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/rum/RumErrorSource;", "p1", "p2", "p3", "p4", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "p5", "p6", "p7", "p8", "p9", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;J)V", "Lcom/datadog/android/rum/RumResourceKind;", "(Lcom/datadog/android/rum/RumResourceKind;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)V", "eventTimestamp", "J", "getEventTimestamp$dd_sdk_android_rum_release", "()J", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getInsightsCollector$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "Ljava/lang/Object;", "getKey$dd_sdk_android_rum_release", "()Ljava/lang/Object;", "Lcom/datadog/android/rum/RumResourceKind;", "Lcom/datadog/android/rum/RumResourceMethod;", "getMethod$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumResourceMethod;", "Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "resourceAttributes", "Ljava/util/Map;", "getResourceAttributes$dd_sdk_android_rum_release", "resourceId", "Ljava/lang/String;", "getResourceId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "Lcom/datadog/android/rum/RumSessionType;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_rum_release", "()F", "Lcom/datadog/android/core/InternalSdkCore;", "getSdkCore$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/InternalSdkCore;", "getHighSpeedVideoSizesFor", "Z", "getInputFormats", "Ljava/lang/Long;", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "getOutputFormats", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "(Z)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "getUrl$dd_sdk_android_rum_release", "getOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumResourceScope implements com.datadog.android.rum.internal.domain.scope.RumScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumResourceScope.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumResourceScope.Companion(null);
    public static final int MAX_GRAPHQL_PAYLOAD_SIZE_BYTES = 30720;
    public static final java.lang.String NEGATIVE_DURATION_WARNING_MESSAGE = "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.";
    private final com.datadog.android.api.context.NetworkInfo Camera2StreamConfigurationMap;
    private final long eventTimestamp;
    private final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.datadog.android.rum.RumResourceKind getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.rum.RumSessionType getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.FeaturesContextResolver getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizesFor;
    private java.lang.Long getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.domain.event.ResourceTiming getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.lang.Long getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final long getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputStallDurationlomOqCM;
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector;
    private final java.lang.Object key;
    private final com.datadog.android.rum.RumResourceMethod method;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private final java.util.Map<java.lang.String, java.lang.Object> resourceAttributes;
    private final java.lang.String resourceId;
    private final float sampleRate;
    private final com.datadog.android.core.InternalSdkCore sdkCore;
    private boolean stopped;
    private final java.lang.String url;

    public RumResourceScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, java.lang.String str, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, float f, com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver networkSettledMetricResolver, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContextResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettledMetricResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.url = str;
        this.method = rumResourceMethod;
        this.key = obj;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.getHighSpeedVideoFpsRanges = featuresContextResolver;
        this.sampleRate = f;
        this.getHighSpeedVideoFpsRangesFor = rumSessionType;
        this.insightsCollector = insightsCollector;
        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        this.resourceId = obj2;
        this.resourceAttributes = kotlin.collections.MapsKt.toMutableMap(map);
        this.getHighSpeedVideoSizes = getParentScope().getGetHighSpeedVideoSizes();
        this.eventTimestamp = time.getTimestamp() + j;
        this.getInputSizeshNQ4ISI = time.getNanoTime();
        this.Camera2StreamConfigurationMap = internalSdkCore.getNetworkInfo();
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.rum.RumResourceKind.UNKNOWN;
        networkSettledMetricResolver.resourceWasStarted(new com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext(obj2, time.getNanoTime()));
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    /* renamed from: getSdkCore$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.InternalSdkCore getSdkCore() {
        return this.sdkCore;
    }

    /* renamed from: getUrl$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: getMethod$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.RumResourceMethod getMethod() {
        return this.method;
    }

    /* renamed from: getKey$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.Object getKey() {
        return this.key;
    }

    /* renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: getInsightsCollector$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInsightsCollector() {
        return this.insightsCollector;
    }

    /* renamed from: getResourceId$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getResourceId() {
        return this.resourceId;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getResourceAttributes$dd_sdk_android_rum_release() {
        return this.resourceAttributes;
    }

    /* renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming) event).getKey())) {
                this.getOutputStallDurationlomOqCM = true;
            }
        } else if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming)) {
            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource)) {
                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError)) {
                    if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace) {
                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace stopResourceWithStackTrace = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace) event;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResourceWithStackTrace.getKey())) {
                            this.resourceAttributes.putAll(stopResourceWithStackTrace.getAttributes());
                            getHighSpeedVideoSizes(stopResourceWithStackTrace.getMessage(), stopResourceWithStackTrace.getSource(), stopResourceWithStackTrace.getStatusCode(), stopResourceWithStackTrace.getStackTrace(), stopResourceWithStackTrace.getErrorType(), stopResourceWithStackTrace.getStackTrace().length() > 0 ? com.datadog.android.rum.model.ErrorEvent.Category.EXCEPTION : null, datadogContext, writeScope, writer, stopResourceWithStackTrace.getEventTime().getNanoTime());
                        }
                    }
                } else {
                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError stopResourceWithError = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError) event;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResourceWithError.getKey())) {
                        this.resourceAttributes.putAll(stopResourceWithError.getAttributes());
                        getHighSpeedVideoSizes(stopResourceWithError.getMessage(), stopResourceWithError.getSource(), stopResourceWithError.getStatusCode(), com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(stopResourceWithError.getThrowable()), stopResourceWithError.getThrowable().getClass().getCanonicalName(), com.datadog.android.rum.model.ErrorEvent.Category.EXCEPTION, datadogContext, writeScope, writer, stopResourceWithError.getEventTime().getNanoTime());
                    }
                }
            } else {
                com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource stopResource = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource) event;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResource.getKey())) {
                    this.stopped = true;
                    this.resourceAttributes.putAll(stopResource.getAttributes());
                    this.getHighResolutionOutputSizeshNQ4ISI = stopResource.getKind();
                    this.getOutputMinFrameDuration = stopResource.getStatusCode();
                    this.getInputFormats = stopResource.getSize();
                    if (!this.getOutputStallDurationlomOqCM || this.getOutputFormats != null) {
                        Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, stopResource.getStatusCode(), stopResource.getSize(), stopResource.getEventTime(), datadogContext, writeScope, writer);
                    }
                }
            }
        } else {
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming addResourceTiming = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, addResourceTiming.getKey())) {
                this.getOutputFormats = addResourceTiming.getTiming();
                if (this.stopped && !this.getHighSpeedVideoSizesFor) {
                    Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, addResourceTiming.getEventTime(), datadogContext, writeScope, writer);
                }
            }
        }
        if (this.getHighSpeedVideoSizesFor) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: getRumContext, reason: from getter */
    public final com.datadog.android.rum.internal.domain.RumContext getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return kotlin.collections.MapsKt.plus(getParentScope().getCustomAttributes(), this.resourceAttributes);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive */
    public final boolean getIsActive() {
        return !this.stopped;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Camera2StreamConfigurationMap(final com.datadog.android.rum.RumResourceKind p0, final java.lang.Long p1, final java.lang.Long p2, final com.datadog.android.rum.internal.domain.Time p3, final com.datadog.android.api.context.DatadogContext p4, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p5, com.datadog.android.api.storage.DataWriter<java.lang.Object> p6) {
        com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType;
        final com.datadog.android.rum.model.ResourceEvent.Graphql graphql;
        final com.datadog.android.rum.model.ResourceEvent.Request request;
        final com.datadog.android.rum.model.ResourceEvent.Response response;
        com.datadog.android.rum.model.ResourceEvent.OperationType operationType;
        kotlin.Pair<java.lang.String, java.lang.Integer> truncateToUtf8ByteSize;
        java.lang.String syntheticsResultId;
        java.lang.Object remove = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.TRACE_ID);
        java.lang.String obj = remove != null ? remove.toString() : null;
        java.lang.Object remove2 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.SPAN_ID);
        final java.lang.String obj2 = remove2 != null ? remove2.toString() : null;
        java.lang.Object remove3 = this.resourceAttributes.remove("_dd.rule_psr");
        java.lang.Number number = remove3 instanceof java.lang.Number ? (java.lang.Number) remove3 : null;
        final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
        com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ResourceEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
        com.datadog.android.rum.RumSessionType rumSessionType = this.getHighSpeedVideoFpsRangesFor;
        if (rumSessionType != null) {
            resourceEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toResource(rumSessionType);
        } else if (synthetics == null) {
            resourceEventSessionType = com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.USER;
        } else {
            resourceEventSessionType = com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.SYNTHETICS;
        }
        final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType2 = resourceEventSessionType;
        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming = this.getOutputFormats;
        if (resourceTiming == null) {
            java.lang.Object remove4 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.RESOURCE_TIMINGS);
            resourceTiming = com.datadog.android.rum.internal.domain.scope.ExternalResourceTimingsKt.extractResourceTiming(remove4 instanceof java.util.Map ? (java.util.Map) remove4 : null);
        }
        final com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming2 = resourceTiming;
        java.lang.Object remove5 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.GRAPHQL_OPERATION_NAME);
        java.lang.String str = remove5 instanceof java.lang.String ? (java.lang.String) remove5 : null;
        java.lang.Object remove6 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.GRAPHQL_OPERATION_TYPE);
        java.lang.String str2 = remove6 instanceof java.lang.String ? (java.lang.String) remove6 : null;
        java.lang.Object remove7 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.GRAPHQL_VARIABLES);
        java.lang.String str3 = remove7 instanceof java.lang.String ? (java.lang.String) remove7 : null;
        java.lang.Object remove8 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.GRAPHQL_PAYLOAD);
        java.lang.String str4 = remove8 instanceof java.lang.String ? (java.lang.String) remove8 : null;
        java.lang.String first = (str4 == null || (truncateToUtf8ByteSize = com.datadog.android.rum.internal.utils.StringExtKt.truncateToUtf8ByteSize(str4, MAX_GRAPHQL_PAYLOAD_SIZE_BYTES, this.sdkCore.getInternalLogger())) == null) ? null : truncateToUtf8ByteSize.getFirst();
        java.lang.Object remove9 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.GRAPHQL_ERRORS);
        java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(remove9 instanceof java.lang.String ? (java.lang.String) remove9 : null);
        if (str2 == null || (operationType = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toOperationType(str2, this.sdkCore.getInternalLogger())) == null) {
            graphql = null;
        } else {
            graphql = new com.datadog.android.rum.model.ResourceEvent.Graphql(operationType, str, first, str3, highSpeedVideoFpsRangesFor != null ? java.lang.Long.valueOf(highSpeedVideoFpsRangesFor.size()) : null, highSpeedVideoFpsRangesFor);
        }
        java.lang.Object remove10 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.REQUEST_HEADERS);
        java.util.Map map = remove10 instanceof java.util.Map ? (java.util.Map) remove10 : null;
        java.lang.Object remove11 = this.resourceAttributes.remove(com.datadog.android.rum.RumAttributes.RESPONSE_HEADERS);
        java.util.Map map2 = remove11 instanceof java.util.Map ? (java.util.Map) remove11 : null;
        if (map != null) {
            if (map.isEmpty()) {
                map = null;
            }
            if (map != null) {
                request = new com.datadog.android.rum.model.ResourceEvent.Request(null, null, new com.datadog.android.rum.model.ResourceEvent.RequestHeaders(kotlin.collections.MapsKt.toMutableMap(map)), 3, null);
                if (map2 != null) {
                    if (map2.isEmpty()) {
                        map2 = null;
                    }
                    if (map2 != null) {
                        response = new com.datadog.android.rum.model.ResourceEvent.Response(new com.datadog.android.rum.model.ResourceEvent.RequestHeaders(kotlin.collections.MapsKt.toMutableMap(map2)));
                        final java.lang.String str5 = obj;
                        final java.lang.Number number2 = number;
                        final com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics2 = synthetics;
                        com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, p4, p5, p6, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver;
                                com.datadog.android.api.context.NetworkInfo networkInfo;
                                com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                featuresContextResolver = this.getHighSpeedVideoFpsRanges;
                                com.datadog.android.api.context.DatadogContext datadogContext = com.datadog.android.api.context.DatadogContext.this;
                                java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
                                if (viewId == null) {
                                    viewId = "";
                                }
                                boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
                                long access$resolveResourceDuration = com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceDuration(this, p3);
                                this.getInsightsCollector().onNetworkRequest(access$resolveResourceDuration);
                                long eventTimestamp = this.getEventTimestamp();
                                java.lang.String resourceId = this.getResourceId();
                                com.datadog.android.rum.model.ResourceEvent.ResourceType schemaType = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaType(p0);
                                java.lang.String url = this.getUrl();
                                com.datadog.android.rum.model.ResourceEvent.Method resourceMethod = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceMethod(this.getMethod());
                                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming3 = resourceTiming2;
                                com.datadog.android.rum.model.ResourceEvent.Dns dns = resourceTiming3 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.dns(resourceTiming3) : null;
                                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming4 = resourceTiming2;
                                com.datadog.android.rum.model.ResourceEvent.Connect connect = resourceTiming4 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.connect(resourceTiming4) : null;
                                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming5 = resourceTiming2;
                                com.datadog.android.rum.model.ResourceEvent.Ssl ssl = resourceTiming5 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.ssl(resourceTiming5) : null;
                                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming6 = resourceTiming2;
                                com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = resourceTiming6 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.firstByte(resourceTiming6) : null;
                                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming7 = resourceTiming2;
                                com.datadog.android.rum.model.ResourceEvent.Download download = resourceTiming7 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.download(resourceTiming7) : null;
                                com.datadog.android.rum.model.ResourceEvent.Resource resource = new com.datadog.android.rum.model.ResourceEvent.Resource(resourceId, schemaType, resourceMethod, url, p1, java.lang.Long.valueOf(access$resolveResourceDuration), p2, null, null, null, null, null, null, dns, connect, ssl, firstByte, download, null, null, com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceProvider(this), request, response, graphql, 794496, null);
                                java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                                com.datadog.android.rum.model.ResourceEvent.Action action = actionId != null ? new com.datadog.android.rum.model.ResourceEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                                java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                                java.lang.String str6 = viewId2 == null ? "" : viewId2;
                                java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                                java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                                com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView = new com.datadog.android.rum.model.ResourceEvent.ResourceEventView(str6, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
                                com.datadog.android.rum.model.ResourceEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ResourceEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                com.datadog.android.rum.model.ResourceEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ResourceEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                                networkInfo = this.Camera2StreamConfigurationMap;
                                com.datadog.android.rum.model.ResourceEvent.Connectivity resourceConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceConnectivity(networkInfo);
                                com.datadog.android.rum.model.ResourceEvent.Application application = new com.datadog.android.rum.model.ResourceEvent.Application(getHighSpeedVideoSizes.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession(getHighSpeedVideoSizes.getSessionId(), resourceEventSessionType2, java.lang.Boolean.valueOf(resolveViewHasReplay));
                                com.datadog.android.rum.model.ResourceEvent.ResourceEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.INSTANCE, com.datadog.android.api.context.DatadogContext.this.getSource(), this.getSdkCore().getInternalLogger());
                                com.datadog.android.rum.model.ResourceEvent.Os os = new com.datadog.android.rum.model.ResourceEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                                com.datadog.android.rum.model.ResourceEvent.Device device = new com.datadog.android.rum.model.ResourceEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 1824, null);
                                com.datadog.android.rum.model.ResourceEvent.Context context = new com.datadog.android.rum.model.ResourceEvent.Context(kotlin.collections.MapsKt.toMutableMap(this.getCustomAttributes()));
                                com.datadog.android.rum.model.ResourceEvent.Dd dd = new com.datadog.android.rum.model.ResourceEvent.Dd(new com.datadog.android.rum.model.ResourceEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ResourceEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, obj2, null, str5, number2, null, 300, null);
                                return new com.datadog.android.rum.model.ResourceEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), resourceEventSession, tryFromSource, resourceEventView, usr, account, resourceConnectivity, null, synthetics2, null, os, device, dd, context, action, null, resource, 2138112, null);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, 8, null).onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                getHighSpeedVideoFpsRanges(advancedRumMonitor);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void getHighSpeedVideoFpsRanges(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                advancedRumMonitor.eventDropped(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }).onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                advancedRumMonitor.eventSent(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }).submit();
                        this.getHighSpeedVideoSizesFor = true;
                    }
                }
                response = null;
                final java.lang.String str52 = obj;
                final java.lang.Number number22 = number;
                final com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics22 = synthetics;
                com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, p4, p5, p6, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver;
                        com.datadog.android.api.context.NetworkInfo networkInfo;
                        com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                        featuresContextResolver = this.getHighSpeedVideoFpsRanges;
                        com.datadog.android.api.context.DatadogContext datadogContext = com.datadog.android.api.context.DatadogContext.this;
                        java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
                        if (viewId == null) {
                            viewId = "";
                        }
                        boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
                        long access$resolveResourceDuration = com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceDuration(this, p3);
                        this.getInsightsCollector().onNetworkRequest(access$resolveResourceDuration);
                        long eventTimestamp = this.getEventTimestamp();
                        java.lang.String resourceId = this.getResourceId();
                        com.datadog.android.rum.model.ResourceEvent.ResourceType schemaType = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaType(p0);
                        java.lang.String url = this.getUrl();
                        com.datadog.android.rum.model.ResourceEvent.Method resourceMethod = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceMethod(this.getMethod());
                        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming3 = resourceTiming2;
                        com.datadog.android.rum.model.ResourceEvent.Dns dns = resourceTiming3 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.dns(resourceTiming3) : null;
                        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming4 = resourceTiming2;
                        com.datadog.android.rum.model.ResourceEvent.Connect connect = resourceTiming4 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.connect(resourceTiming4) : null;
                        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming5 = resourceTiming2;
                        com.datadog.android.rum.model.ResourceEvent.Ssl ssl = resourceTiming5 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.ssl(resourceTiming5) : null;
                        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming6 = resourceTiming2;
                        com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = resourceTiming6 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.firstByte(resourceTiming6) : null;
                        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming7 = resourceTiming2;
                        com.datadog.android.rum.model.ResourceEvent.Download download = resourceTiming7 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.download(resourceTiming7) : null;
                        com.datadog.android.rum.model.ResourceEvent.Resource resource = new com.datadog.android.rum.model.ResourceEvent.Resource(resourceId, schemaType, resourceMethod, url, p1, java.lang.Long.valueOf(access$resolveResourceDuration), p2, null, null, null, null, null, null, dns, connect, ssl, firstByte, download, null, null, com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceProvider(this), request, response, graphql, 794496, null);
                        java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                        com.datadog.android.rum.model.ResourceEvent.Action action = actionId != null ? new com.datadog.android.rum.model.ResourceEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                        java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                        java.lang.String str6 = viewId2 == null ? "" : viewId2;
                        java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                        java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                        com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView = new com.datadog.android.rum.model.ResourceEvent.ResourceEventView(str6, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
                        com.datadog.android.rum.model.ResourceEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ResourceEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                        com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                        com.datadog.android.rum.model.ResourceEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ResourceEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                        networkInfo = this.Camera2StreamConfigurationMap;
                        com.datadog.android.rum.model.ResourceEvent.Connectivity resourceConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceConnectivity(networkInfo);
                        com.datadog.android.rum.model.ResourceEvent.Application application = new com.datadog.android.rum.model.ResourceEvent.Application(getHighSpeedVideoSizes.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                        com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession(getHighSpeedVideoSizes.getSessionId(), resourceEventSessionType2, java.lang.Boolean.valueOf(resolveViewHasReplay));
                        com.datadog.android.rum.model.ResourceEvent.ResourceEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.INSTANCE, com.datadog.android.api.context.DatadogContext.this.getSource(), this.getSdkCore().getInternalLogger());
                        com.datadog.android.rum.model.ResourceEvent.Os os = new com.datadog.android.rum.model.ResourceEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                        com.datadog.android.rum.model.ResourceEvent.Device device = new com.datadog.android.rum.model.ResourceEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 1824, null);
                        com.datadog.android.rum.model.ResourceEvent.Context context = new com.datadog.android.rum.model.ResourceEvent.Context(kotlin.collections.MapsKt.toMutableMap(this.getCustomAttributes()));
                        com.datadog.android.rum.model.ResourceEvent.Dd dd = new com.datadog.android.rum.model.ResourceEvent.Dd(new com.datadog.android.rum.model.ResourceEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ResourceEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, obj2, null, str52, number22, null, 300, null);
                        return new com.datadog.android.rum.model.ResourceEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), resourceEventSession, tryFromSource, resourceEventView, usr, account, resourceConnectivity, null, synthetics22, null, os, device, dd, context, action, null, resource, 2138112, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, 8, null).onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                        getHighSpeedVideoFpsRanges(advancedRumMonitor);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                        java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                        advancedRumMonitor.eventDropped(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }).onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$3
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                        getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                        java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                        advancedRumMonitor.eventSent(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }).submit();
                this.getHighSpeedVideoSizesFor = true;
            }
        }
        request = null;
        if (map2 != null) {
        }
        response = null;
        final java.lang.String str522 = obj;
        final java.lang.Number number222 = number;
        final com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics222 = synthetics;
        com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, p4, p5, p6, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver;
                com.datadog.android.api.context.NetworkInfo networkInfo;
                com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                featuresContextResolver = this.getHighSpeedVideoFpsRanges;
                com.datadog.android.api.context.DatadogContext datadogContext = com.datadog.android.api.context.DatadogContext.this;
                java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
                if (viewId == null) {
                    viewId = "";
                }
                boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
                long access$resolveResourceDuration = com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceDuration(this, p3);
                this.getInsightsCollector().onNetworkRequest(access$resolveResourceDuration);
                long eventTimestamp = this.getEventTimestamp();
                java.lang.String resourceId = this.getResourceId();
                com.datadog.android.rum.model.ResourceEvent.ResourceType schemaType = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaType(p0);
                java.lang.String url = this.getUrl();
                com.datadog.android.rum.model.ResourceEvent.Method resourceMethod = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceMethod(this.getMethod());
                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming3 = resourceTiming2;
                com.datadog.android.rum.model.ResourceEvent.Dns dns = resourceTiming3 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.dns(resourceTiming3) : null;
                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming4 = resourceTiming2;
                com.datadog.android.rum.model.ResourceEvent.Connect connect = resourceTiming4 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.connect(resourceTiming4) : null;
                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming5 = resourceTiming2;
                com.datadog.android.rum.model.ResourceEvent.Ssl ssl = resourceTiming5 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.ssl(resourceTiming5) : null;
                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming6 = resourceTiming2;
                com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = resourceTiming6 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.firstByte(resourceTiming6) : null;
                com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming7 = resourceTiming2;
                com.datadog.android.rum.model.ResourceEvent.Download download = resourceTiming7 != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.download(resourceTiming7) : null;
                com.datadog.android.rum.model.ResourceEvent.Resource resource = new com.datadog.android.rum.model.ResourceEvent.Resource(resourceId, schemaType, resourceMethod, url, p1, java.lang.Long.valueOf(access$resolveResourceDuration), p2, null, null, null, null, null, null, dns, connect, ssl, firstByte, download, null, null, com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveResourceProvider(this), request, response, graphql, 794496, null);
                java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                com.datadog.android.rum.model.ResourceEvent.Action action = actionId != null ? new com.datadog.android.rum.model.ResourceEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                java.lang.String str6 = viewId2 == null ? "" : viewId2;
                java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView = new com.datadog.android.rum.model.ResourceEvent.ResourceEventView(str6, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
                com.datadog.android.rum.model.ResourceEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ResourceEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                com.datadog.android.rum.model.ResourceEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ResourceEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                networkInfo = this.Camera2StreamConfigurationMap;
                com.datadog.android.rum.model.ResourceEvent.Connectivity resourceConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceConnectivity(networkInfo);
                com.datadog.android.rum.model.ResourceEvent.Application application = new com.datadog.android.rum.model.ResourceEvent.Application(getHighSpeedVideoSizes.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession(getHighSpeedVideoSizes.getSessionId(), resourceEventSessionType2, java.lang.Boolean.valueOf(resolveViewHasReplay));
                com.datadog.android.rum.model.ResourceEvent.ResourceEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.INSTANCE, com.datadog.android.api.context.DatadogContext.this.getSource(), this.getSdkCore().getInternalLogger());
                com.datadog.android.rum.model.ResourceEvent.Os os = new com.datadog.android.rum.model.ResourceEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                com.datadog.android.rum.model.ResourceEvent.Device device = new com.datadog.android.rum.model.ResourceEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 1824, null);
                com.datadog.android.rum.model.ResourceEvent.Context context = new com.datadog.android.rum.model.ResourceEvent.Context(kotlin.collections.MapsKt.toMutableMap(this.getCustomAttributes()));
                com.datadog.android.rum.model.ResourceEvent.Dd dd = new com.datadog.android.rum.model.ResourceEvent.Dd(new com.datadog.android.rum.model.ResourceEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toResourceSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ResourceEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, obj2, null, str522, number222, null, 300, null);
                return new com.datadog.android.rum.model.ResourceEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), resourceEventSession, tryFromSource, resourceEventView, usr, account, resourceConnectivity, null, synthetics222, null, os, device, dd, context, action, null, resource, 2138112, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, 8, null).onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                getHighSpeedVideoFpsRanges(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventDropped(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventSent(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(this.getResourceId(), p3.getNanoTime()));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).submit();
        this.getHighSpeedVideoSizesFor = true;
    }

    private final void getHighSpeedVideoSizes(final java.lang.String p0, final com.datadog.android.rum.RumErrorSource p1, final java.lang.Long p2, final java.lang.String p3, final java.lang.String p4, final com.datadog.android.rum.model.ErrorEvent.Category p5, final com.datadog.android.api.context.DatadogContext p6, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p7, com.datadog.android.api.storage.DataWriter<java.lang.Object> p8, final long p9) {
        com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType errorEventSessionType;
        java.lang.String syntheticsResultId;
        java.lang.Object remove = this.resourceAttributes.remove("_dd.error.fingerprint");
        final java.lang.String str = remove instanceof java.lang.String ? (java.lang.String) remove : null;
        final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
        com.datadog.android.rum.model.ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ErrorEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
        com.datadog.android.rum.RumSessionType rumSessionType = this.getHighSpeedVideoFpsRangesFor;
        if (rumSessionType != null) {
            errorEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toError(rumSessionType);
        } else if (synthetics == null) {
            errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER;
        } else {
            errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.SYNTHETICS;
        }
        final com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType errorEventSessionType2 = errorEventSessionType;
        final com.datadog.android.rum.model.ErrorEvent.Synthetics synthetics2 = synthetics;
        com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, p6, p7, p8, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver;
                com.datadog.android.api.context.NetworkInfo networkInfo;
                com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                featuresContextResolver = this.getHighSpeedVideoFpsRanges;
                com.datadog.android.api.context.DatadogContext datadogContext = com.datadog.android.api.context.DatadogContext.this;
                java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
                if (viewId == null) {
                    viewId = "";
                }
                boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
                java.lang.String appBuildId = com.datadog.android.api.context.DatadogContext.this.getAppBuildId();
                long eventTimestamp = this.getEventTimestamp();
                java.lang.String obj = java.util.UUID.randomUUID().toString();
                com.datadog.android.rum.model.ErrorEvent.ErrorSource schemaSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSource(p1);
                java.lang.String url = this.getUrl();
                com.datadog.android.rum.model.ErrorEvent.Method errorMethod = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorMethod(this.getMethod());
                java.lang.Long l = p2;
                com.datadog.android.rum.model.ErrorEvent.Resource resource = new com.datadog.android.rum.model.ErrorEvent.Resource(errorMethod, l != null ? l.longValue() : 0L, url, com.datadog.android.rum.internal.domain.scope.RumResourceScope.access$resolveErrorProvider(this));
                com.datadog.android.rum.model.ErrorEvent.Error error = new com.datadog.android.rum.model.ErrorEvent.Error(obj, p0, schemaSource, p3, null, java.lang.Boolean.FALSE, str, p4, p5, null, null, com.datadog.android.rum.model.ErrorEvent.SourceType.ANDROID, resource, null, null, null, null, null, null, 517648, null);
                java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                com.datadog.android.rum.model.ErrorEvent.Action action = actionId != null ? new com.datadog.android.rum.model.ErrorEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                java.lang.String str2 = viewId2 == null ? "" : viewId2;
                java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str2, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null);
                com.datadog.android.rum.model.ErrorEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ErrorEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                com.datadog.android.rum.model.ErrorEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ErrorEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                networkInfo = this.Camera2StreamConfigurationMap;
                com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(networkInfo);
                com.datadog.android.rum.model.ErrorEvent.Application application = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes.getApplicationId(), null, 2, null);
                com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes.getSessionId(), errorEventSessionType2, java.lang.Boolean.valueOf(resolveViewHasReplay));
                com.datadog.android.rum.model.ErrorEvent.ErrorEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE, com.datadog.android.api.context.DatadogContext.this.getSource(), this.getSdkCore().getInternalLogger());
                com.datadog.android.rum.model.ErrorEvent.Os os = new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                com.datadog.android.rum.model.ErrorEvent.Device device = new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 2016, null);
                com.datadog.android.rum.model.ErrorEvent.Context context = new com.datadog.android.rum.model.ErrorEvent.Context(kotlin.collections.MapsKt.toMutableMap(this.getCustomAttributes()));
                com.datadog.android.rum.model.ErrorEvent.Dd dd = new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null);
                return new com.datadog.android.rum.model.ErrorEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession, tryFromSource, errorEventView, usr, account, errorConnectivity, null, synthetics2, null, os, device, dd, context, action, null, error, null, null, 27303936, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, 8, null).onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                Camera2StreamConfigurationMap(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventDropped(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Error(this.getResourceId(), java.lang.Long.valueOf(p9)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                Camera2StreamConfigurationMap(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventSent(viewId != null ? viewId : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Error(this.getResourceId(), java.lang.Long.valueOf(p9)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).submit();
        this.getHighSpeedVideoSizesFor = true;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String p0) {
        try {
            java.lang.String host = new java.net.URL(p0).getHost();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
            return host;
        } catch (java.net.MalformedURLException unused) {
            return p0;
        }
    }

    private final java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.String str = p0;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            com.google.gson.JsonArray asJsonArray = com.google.gson.JsonParser.parseString(p0).getAsJsonArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
            com.google.gson.JsonArray jsonArray = asJsonArray;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
            for (com.google.gson.JsonElement jsonElement : jsonArray) {
                com.datadog.android.rum.model.ResourceEvent.Error.Companion companion = com.datadog.android.rum.model.ResourceEvent.Error.INSTANCE;
                com.google.gson.JsonObject asJsonObject = jsonElement.getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                arrayList.add(companion.fromJsonObject(asJsonObject));
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$parseGraphQLErrors$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to parse GraphQL errors from attribute";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumResourceScope$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "event", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "", "timestampOffset", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "networkSettledMetricResolver", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "fromEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;JLcom/datadog/android/rum/internal/FeaturesContextResolver;FLcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "MAX_GRAPHQL_PAYLOAD_SIZE_BYTES", com.visa.cbp.getEncExpo.warmup, "", "NEGATIVE_DURATION_WARNING_MESSAGE", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.internal.domain.scope.RumScope fromEvent(com.datadog.android.rum.internal.domain.scope.RumScope parentScope, com.datadog.android.core.InternalSdkCore sdkCore, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource event, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, long timestampOffset, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, float sampleRate, com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver networkSettledMetricResolver, com.datadog.android.rum.RumSessionType rumSessionTypeOverride, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContextResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettledMetricResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            return new com.datadog.android.rum.internal.domain.scope.RumResourceScope(parentScope, sdkCore, event.getUrl(), event.getMethod(), event.getKey(), event.getEventTime(), event.getAttributes(), timestampOffset, firstPartyHostHeaderTypeResolver, featuresContextResolver, sampleRate, networkSettledMetricResolver, rumSessionTypeOverride, insightsCollector);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ com.datadog.android.rum.model.ErrorEvent.Provider access$resolveErrorProvider(com.datadog.android.rum.internal.domain.scope.RumResourceScope rumResourceScope) {
        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(rumResourceScope.url)) {
            return new com.datadog.android.rum.model.ErrorEvent.Provider(Camera2StreamConfigurationMap(rumResourceScope.url), null, com.datadog.android.rum.model.ErrorEvent.ProviderType.FIRST_PARTY, 2, null);
        }
        return null;
    }

    public static final /* synthetic */ long access$resolveResourceDuration(final com.datadog.android.rum.internal.domain.scope.RumResourceScope rumResourceScope, com.datadog.android.rum.internal.domain.Time time) {
        long nanoTime = time.getNanoTime() - rumResourceScope.getInputSizeshNQ4ISI;
        if (nanoTime > 0) {
            return nanoTime;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(rumResourceScope.sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$resolveResourceDuration$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.scope.RumResourceScope.NEGATIVE_DURATION_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.rum.internal.domain.scope.RumResourceScope.this.getUrl()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return 1L;
    }

    public static final /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Provider access$resolveResourceProvider(com.datadog.android.rum.internal.domain.scope.RumResourceScope rumResourceScope) {
        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(rumResourceScope.url)) {
            return new com.datadog.android.rum.model.ResourceEvent.Provider(Camera2StreamConfigurationMap(rumResourceScope.url), null, com.datadog.android.rum.model.ResourceEvent.ProviderType.FIRST_PARTY, 2, null);
        }
        return null;
    }
}
