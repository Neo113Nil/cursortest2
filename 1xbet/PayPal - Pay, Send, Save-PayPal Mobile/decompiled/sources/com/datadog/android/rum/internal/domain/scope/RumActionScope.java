package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#JS\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\"\u0010,\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020*0(j\u0002`+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020*2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u00106JQ\u00109\u001a\u00020*2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020&2\"\u00107\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020*0(j\u0002`+2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0-H\u0002¢\u0006\u0004\b9\u0010:R(\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0;8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010 R\u001a\u0010?\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u001a\u0010L\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010FR\u0014\u0010P\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u00109\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010DR\u0014\u00105\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010RR\u0016\u0010Q\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010DR\"\u0010S\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bS\u0010D\u001a\u0004\bT\u0010F\"\u0004\bU\u0010HR\u0014\u0010N\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010DR\"\u0010V\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bV\u0010@\u001a\u0004\bW\u0010B\"\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0_0^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010`R\u001a\u0010\u0002\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010b\u001a\u0004\bc\u0010dR\"\u0010e\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\be\u0010D\u001a\u0004\bf\u0010F\"\u0004\bg\u0010HR\u0016\u0010[\u001a\u0004\u0018\u00010\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010\u0018\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010h\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010m\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010oR\u001a\u0010p\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\bp\u0010D\u001a\u0004\bq\u0010FR\"\u0010r\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\br\u0010o\u001a\u0004\bs\u00102\"\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010DR\u0014\u0010x\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bw\u0010oR\"\u0010y\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010o\u001a\u0004\b\u007f\u00102"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumActionScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "", "waitForStop", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "Lcom/datadog/android/rum/RumActionType;", "initialType", "", "initialName", "", "", "initialAttributes", "", "serverTimeOffsetInMs", "inactivityThresholdMs", "maxDurationMs", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "trackFrustrations", "", "sampleRate", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;ZLcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;JJJLcom/datadog/android/rum/internal/FeaturesContextResolver;ZFLcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "getCustomAttributes", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;J)V", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(JLcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)V", "", "actionAttributes", "Ljava/util/Map;", "getActionAttributes$dd_sdk_android_rum_release", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "crashCount", "J", "getCrashCount$dd_sdk_android_rum_release", "()J", "setCrashCount$dd_sdk_android_rum_release", "(J)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, "getErrorCount$dd_sdk_android_rum_release", "setErrorCount$dd_sdk_android_rum_release", "eventTimestamp", "getEventTimestamp$dd_sdk_android_rum_release", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "longTaskCount", "getLongTaskCount$dd_sdk_android_rum_release", "setLongTaskCount$dd_sdk_android_rum_release", "name", "getName$dd_sdk_android_rum_release", "setName$dd_sdk_android_rum_release", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/context/NetworkInfo;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/api/context/NetworkInfo;", "getOutputMinFrameDuration", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "resourceCount", "getResourceCount$dd_sdk_android_rum_release", "setResourceCount$dd_sdk_android_rum_release", "getOutputFormats", "Lcom/datadog/android/rum/RumSessionType;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_rum_release", "()F", "getInputFormats", "Lcom/datadog/android/core/InternalSdkCore;", "Z", "startedNanos", "getStartedNanos$dd_sdk_android_rum_release", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "(Z)V", "getOutputSizes", "getOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "type", "Lcom/datadog/android/rum/RumActionType;", "getType$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumActionType;", "setType$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumActionType;)V", "getWaitForStop", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumActionScope implements com.datadog.android.rum.internal.domain.scope.RumScope {
    public static final long ACTION_INACTIVITY_MS = 100;
    public static final long ACTION_MAX_DURATION_MS = 5000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumActionScope.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumActionScope.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;
    private final java.util.Map<java.lang.String, java.lang.Object> actionAttributes;
    private final java.lang.String actionId;
    private long crashCount;
    private long errorCount;
    private final long eventTimestamp;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.FeaturesContextResolver Camera2StreamConfigurationMap;
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.context.NetworkInfo getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionType getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.List<java.lang.ref.WeakReference<java.lang.Object>> getHighSpeedVideoSizesFor;
    private long getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getOutputStallDurationlomOqCM;
    private long longTaskCount;
    private java.lang.String name;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private long resourceCount;
    private final float sampleRate;
    private final long startedNanos;
    private boolean stopped;
    private com.datadog.android.rum.RumActionType type;
    private final boolean waitForStop;

    public RumActionScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, boolean z, com.datadog.android.rum.internal.domain.Time time, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j, long j2, long j3, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, boolean z2, float f, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContextResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.parentScope = rumScope;
        this.getOutputFormats = internalSdkCore;
        this.waitForStop = z;
        this.Camera2StreamConfigurationMap = featuresContextResolver;
        this.getOutputStallDurationlomOqCM = z2;
        this.sampleRate = f;
        this.getInputSizeshNQ4ISI = rumSessionType;
        this.getHighSpeedVideoFpsRangesFor = insightsCollector;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j2);
        this.getHighSpeedVideoFpsRanges = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j3);
        this.eventTimestamp = time.getTimestamp() + j;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.actionId = obj;
        this.type = rumActionType;
        this.name = str;
        long nanoTime = time.getNanoTime();
        this.startedNanos = nanoTime;
        this.getOutputSizes = nanoTime;
        this.getHighSpeedVideoSizes = nanoTime;
        this.getOutputMinFrameDuration = internalSdkCore.getNetworkInfo();
        this.actionAttributes = kotlin.collections.MapsKt.toMutableMap(map);
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    public final boolean getWaitForStop() {
        return this.waitForStop;
    }

    public /* synthetic */ RumActionScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, boolean z, com.datadog.android.rum.internal.domain.Time time, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, long j, long j2, long j3, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, boolean z2, float f, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, z, time, rumActionType, str, map, j, (i & 256) != 0 ? 100L : j2, (i & 512) != 0 ? 5000L : j3, (i & 1024) != 0 ? new com.datadog.android.rum.internal.FeaturesContextResolver() : featuresContextResolver, z2, f, rumSessionType, insightsCollector);
    }

    /* renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* renamed from: getActionId$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getActionId() {
        return this.actionId;
    }

    /* renamed from: getType$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.RumActionType getType() {
        return this.type;
    }

    public final void setType$dd_sdk_android_rum_release(com.datadog.android.rum.RumActionType rumActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumActionType, "");
        this.type = rumActionType;
    }

    /* renamed from: getName$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final void setName$dd_sdk_android_rum_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* renamed from: getStartedNanos$dd_sdk_android_rum_release, reason: from getter */
    public final long getStartedNanos() {
        return this.startedNanos;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getActionAttributes$dd_sdk_android_rum_release() {
        return this.actionAttributes;
    }

    /* renamed from: getResourceCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getResourceCount() {
        return this.resourceCount;
    }

    public final void setResourceCount$dd_sdk_android_rum_release(long j) {
        this.resourceCount = j;
    }

    /* renamed from: getErrorCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getErrorCount() {
        return this.errorCount;
    }

    public final void setErrorCount$dd_sdk_android_rum_release(long j) {
        this.errorCount = j;
    }

    /* renamed from: getCrashCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getCrashCount() {
        return this.crashCount;
    }

    public final void setCrashCount$dd_sdk_android_rum_release(long j) {
        this.crashCount = j;
    }

    /* renamed from: getLongTaskCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getLongTaskCount() {
        return this.longTaskCount;
    }

    public final void setLongTaskCount$dd_sdk_android_rum_release(long j) {
        this.longTaskCount = j;
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
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        long nanoTime = event.getEventTime().getNanoTime();
        boolean z = false;
        boolean z2 = nanoTime - this.getHighSpeedVideoSizes > this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z3 = nanoTime - this.startedNanos > this.getHighSpeedVideoFpsRanges;
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoSizesFor, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.ref.WeakReference<java.lang.Object>, java.lang.Boolean>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$handleEvent$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.lang.ref.WeakReference<java.lang.Object> weakReference) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                return java.lang.Boolean.valueOf(weakReference.get() == null);
            }
        });
        if (this.waitForStop && !this.stopped) {
            z = true;
        }
        if (z2 && this.getHighSpeedVideoSizesFor.isEmpty() && !z) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, datadogContext, writeScope, writer);
        } else if (z3) {
            getHighResolutionOutputSizeshNQ4ISI(nanoTime, datadogContext, writeScope, writer);
        } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, datadogContext, writeScope, writer);
        } else if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView)) {
            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView)) {
                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession)) {
                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction)) {
                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource)) {
                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource)) {
                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError)) {
                                    if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError) {
                                        getHighSpeedVideoFpsRangesFor(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError) event).getKey(), nanoTime);
                                    } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace) {
                                        getHighSpeedVideoFpsRangesFor(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace) event).getKey(), nanoTime);
                                    } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask) {
                                        this.getHighSpeedVideoSizes = nanoTime;
                                        this.longTaskCount++;
                                    }
                                } else {
                                    this.getHighSpeedVideoSizes = nanoTime;
                                    this.errorCount++;
                                    if (((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) event).isFatal()) {
                                        this.crashCount++;
                                        getHighResolutionOutputSizeshNQ4ISI(nanoTime, datadogContext, writeScope, writer);
                                    }
                                }
                            } else {
                                com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource stopResource = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource) event;
                                java.util.Iterator<T> it = this.getHighSpeedVideoSizesFor.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), stopResource.getKey())) {
                                        break;
                                    }
                                }
                                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                                if (weakReference != null) {
                                    this.getHighSpeedVideoSizesFor.remove(weakReference);
                                    this.getHighSpeedVideoSizes = nanoTime;
                                }
                            }
                        } else {
                            this.getHighSpeedVideoSizes = nanoTime;
                            this.resourceCount++;
                            this.getHighSpeedVideoSizesFor.add(new java.lang.ref.WeakReference<>(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource) event).getKey()));
                        }
                    } else {
                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction stopAction = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction) event;
                        com.datadog.android.rum.RumActionType type = stopAction.getType();
                        if (type != null) {
                            this.type = type;
                        }
                        java.lang.String name2 = stopAction.getName();
                        if (name2 != null) {
                            this.name = name2;
                        }
                        this.actionAttributes.putAll(stopAction.getAttributes());
                        this.stopped = true;
                        this.getOutputSizes = nanoTime;
                        this.getHighSpeedVideoSizes = nanoTime;
                    }
                } else {
                    this.getHighSpeedVideoSizesFor.clear();
                    getHighResolutionOutputSizeshNQ4ISI(nanoTime, datadogContext, writeScope, writer);
                }
            } else {
                this.getHighSpeedVideoSizesFor.clear();
                getHighResolutionOutputSizeshNQ4ISI(nanoTime, datadogContext, writeScope, writer);
            }
        } else {
            this.getHighSpeedVideoSizesFor.clear();
            getHighResolutionOutputSizeshNQ4ISI(nanoTime, datadogContext, writeScope, writer);
        }
        if (this.getInputFormats) {
            return null;
        }
        return this;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: getRumContext */
    public final com.datadog.android.rum.internal.domain.RumContext getGetOutputSizes() {
        return getParentScope().getGetOutputSizes();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return kotlin.collections.MapsKt.plus(getParentScope().getCustomAttributes(), this.actionAttributes);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive */
    public final boolean getIsActive() {
        return !this.stopped;
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.Object p0, long p1) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.getHighSpeedVideoSizesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), p0)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference != null) {
            this.getHighSpeedVideoSizesFor.remove(weakReference);
            this.getHighSpeedVideoSizes = p1;
            this.resourceCount--;
            this.errorCount++;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(long p0, final com.datadog.android.api.context.DatadogContext p1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p2, com.datadog.android.api.storage.DataWriter<java.lang.Object> p3) {
        com.datadog.android.rum.model.ActionEvent.ActionEventSessionType actionEventSessionType;
        java.lang.String syntheticsResultId;
        if (this.getInputFormats) {
            return;
        }
        final com.datadog.android.rum.RumActionType rumActionType = this.type;
        final com.datadog.android.rum.internal.domain.RumContext getOutputSizes = getGetOutputSizes();
        final java.lang.String str = this.name;
        final long j = this.errorCount;
        final long j2 = this.crashCount;
        final long j3 = this.longTaskCount;
        final long j4 = this.resourceCount;
        final long max = java.lang.Math.max(p0 - this.startedNanos, 1L);
        java.lang.String syntheticsTestId = getOutputSizes.getSyntheticsTestId();
        com.datadog.android.rum.model.ActionEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getOutputSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ActionEvent.Synthetics(getOutputSizes.getSyntheticsTestId(), getOutputSizes.getSyntheticsResultId(), null, 4, null);
        com.datadog.android.rum.RumSessionType rumSessionType = this.getInputSizeshNQ4ISI;
        if (rumSessionType != null) {
            actionEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toAction(rumSessionType);
        } else if (synthetics == null) {
            actionEventSessionType = com.datadog.android.rum.model.ActionEvent.ActionEventSessionType.USER;
        } else {
            actionEventSessionType = com.datadog.android.rum.model.ActionEvent.ActionEventSessionType.SYNTHETICS;
        }
        final com.datadog.android.rum.model.ActionEvent.ActionEventSessionType actionEventSessionType2 = actionEventSessionType;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.getOutputStallDurationlomOqCM && j > 0 && rumActionType == com.datadog.android.rum.RumActionType.TAP) {
            arrayList.add(com.datadog.android.rum.model.ActionEvent.Type.ERROR_TAP);
        }
        final com.datadog.android.rum.model.ActionEvent.Synthetics synthetics2 = synthetics;
        com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation$default = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.getOutputFormats, p1, p2, p3, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver;
                com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector;
                com.datadog.android.core.InternalSdkCore internalSdkCore;
                com.datadog.android.api.context.NetworkInfo networkInfo;
                com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                featuresContextResolver = this.Camera2StreamConfigurationMap;
                com.datadog.android.api.context.DatadogContext datadogContext = com.datadog.android.api.context.DatadogContext.this;
                java.lang.String viewId = getOutputSizes.getViewId();
                if (viewId == null) {
                    viewId = "";
                }
                boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
                insightsCollector = this.getHighSpeedVideoFpsRangesFor;
                insightsCollector.onAction();
                long eventTimestamp = this.getEventTimestamp();
                com.datadog.android.rum.model.ActionEvent.ActionEventAction actionEventAction = new com.datadog.android.rum.model.ActionEvent.ActionEventAction(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaType(rumActionType), this.getActionId(), java.lang.Long.valueOf(max), new com.datadog.android.rum.model.ActionEvent.ActionEventActionTarget(str), !arrayList.isEmpty() ? new com.datadog.android.rum.model.ActionEvent.Frustration(arrayList) : null, new com.datadog.android.rum.model.ActionEvent.Error(j), new com.datadog.android.rum.model.ActionEvent.Crash(j2), new com.datadog.android.rum.model.ActionEvent.LongTask(j3), new com.datadog.android.rum.model.ActionEvent.Resource(j4));
                java.lang.String viewId2 = getOutputSizes.getViewId();
                java.lang.String str2 = viewId2 == null ? "" : viewId2;
                java.lang.String viewName = getOutputSizes.getViewName();
                java.lang.String viewUrl = getOutputSizes.getViewUrl();
                com.datadog.android.rum.model.ActionEvent.ActionEventView actionEventView = new com.datadog.android.rum.model.ActionEvent.ActionEventView(str2, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null);
                com.datadog.android.rum.model.ActionEvent.Application application = new com.datadog.android.rum.model.ActionEvent.Application(getOutputSizes.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                com.datadog.android.rum.model.ActionEvent.ActionEventSession actionEventSession = new com.datadog.android.rum.model.ActionEvent.ActionEventSession(getOutputSizes.getSessionId(), actionEventSessionType2, java.lang.Boolean.valueOf(resolveViewHasReplay));
                com.datadog.android.rum.model.ActionEvent.ActionEventSource.Companion companion = com.datadog.android.rum.model.ActionEvent.ActionEventSource.INSTANCE;
                java.lang.String source = com.datadog.android.api.context.DatadogContext.this.getSource();
                internalSdkCore = this.getOutputFormats;
                com.datadog.android.rum.model.ActionEvent.ActionEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion, source, internalSdkCore.getInternalLogger());
                com.datadog.android.rum.model.ActionEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ActionEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                com.datadog.android.rum.model.ActionEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ActionEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                com.datadog.android.rum.model.ActionEvent.Os os = new com.datadog.android.rum.model.ActionEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                com.datadog.android.rum.model.ActionEvent.Device device = new com.datadog.android.rum.model.ActionEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toActionSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 1824, null);
                com.datadog.android.rum.model.ActionEvent.Context context = new com.datadog.android.rum.model.ActionEvent.Context(kotlin.collections.MapsKt.toMutableMap(this.getCustomAttributes()));
                com.datadog.android.rum.model.ActionEvent.Dd dd = new com.datadog.android.rum.model.ActionEvent.Dd(new com.datadog.android.rum.model.ActionEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toActionSessionPrecondition(getOutputSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ActionEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, null, 28, null);
                networkInfo = this.getOutputMinFrameDuration;
                com.datadog.android.rum.model.ActionEvent.Connectivity actionConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toActionConnectivity(networkInfo);
                return new com.datadog.android.rum.model.ActionEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), actionEventSession, tryFromSource, actionEventView, usr, account, actionConnectivity, null, synthetics2, null, os, device, dd, context, null, actionEventAction, 1089536, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, 8, null);
        final com.datadog.android.rum.internal.monitor.StorageEvent.Action action = new com.datadog.android.rum.internal.monitor.StorageEvent.Action(arrayList.size(), com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaType(rumActionType), this.getOutputSizes);
        newRumEventWriteOperation$default.onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                Camera2StreamConfigurationMap(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventDropped(viewId != null ? viewId : "", action);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        newRumEventWriteOperation$default.onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                java.lang.String viewId = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                advancedRumMonitor.eventSent(viewId != null ? viewId : "", action);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        newRumEventWriteOperation$default.submit();
        this.getInputFormats = true;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumActionScope$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "event", "", "timestampOffset", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "", "trackFrustrations", "", "sampleRate", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "fromEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;JLcom/datadog/android/rum/internal/FeaturesContextResolver;ZFLcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "ACTION_INACTIVITY_MS", "J", "ACTION_MAX_DURATION_MS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.internal.domain.scope.RumScope fromEvent(com.datadog.android.rum.internal.domain.scope.RumScope parentScope, com.datadog.android.core.InternalSdkCore sdkCore, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction event, long timestampOffset, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, boolean trackFrustrations, float sampleRate, com.datadog.android.rum.RumSessionType rumSessionTypeOverride, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContextResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            return new com.datadog.android.rum.internal.domain.scope.RumActionScope(parentScope, sdkCore, event.getWaitForStop(), event.getEventTime(), event.getType(), event.getName(), event.getAttributes(), timestampOffset, 0L, 0L, featuresContextResolver, trackFrustrations, sampleRate, rumSessionTypeOverride, insightsCollector, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
