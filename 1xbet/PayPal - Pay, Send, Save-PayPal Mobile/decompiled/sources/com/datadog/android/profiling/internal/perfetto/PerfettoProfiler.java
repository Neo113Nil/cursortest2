package com.datadog.android.profiling.internal.perfetto;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 H2\u00020\u0001:\u0002HIB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0017@WX\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0012028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0!0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u00108\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010ER\u0014\u0010A\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Lcom/datadog/android/profiling/internal/perfetto/PerfettoProfiler;", "Lcom/datadog/android/profiling/internal/Profiler;", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Ljava/util/concurrent/ExecutorService;", "profilingExecutor", "<init>", "(Lcom/datadog/android/internal/time/TimeProvider;Ljava/util/concurrent/ExecutorService;)V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)J", "sdkInstanceName", "", "isRunning", "(Ljava/lang/String;)Z", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoProfiler$TelemetryData;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/profiling/internal/perfetto/PerfettoProfiler$TelemetryData;)V", "Lcom/datadog/android/profiling/internal/ProfilerCallback;", com.sun.jna.Callback.METHOD_NAME, "registerProfilingCallback", "(Ljava/lang/String;Lcom/datadog/android/profiling/internal/ProfilerCallback;)V", "Landroid/content/Context;", "appContext", "Lcom/datadog/android/profiling/internal/ProfilingStartReason;", "startReason", "", "additionalAttributes", "", "sdkInstanceNames", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Landroid/content/Context;Lcom/datadog/android/profiling/internal/ProfilingStartReason;Ljava/util/Map;Ljava/util/Set;)V", "stop", "(Ljava/lang/String;)V", "unregisterProfilingCallback", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "setInternalLogger", "(Lcom/datadog/android/api/InternalLogger;)V", "", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ExecutorService;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/profiling/internal/ProfilingStartReason;", "getInputFormats", "J", "Ljava/util/function/Consumer;", "Landroid/os/ProfilingResult;", "getOutputMinFrameDuration", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getOutputFormats", "Landroid/os/CancellationSignal;", "Landroid/os/CancellationSignal;", "getOutputSizes", "Lcom/datadog/android/internal/time/TimeProvider;", "Companion", "TelemetryData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PerfettoProfiler implements com.datadog.android.profiling.internal.Profiler {
    public static final int PROFILING_SAMPLING_RATE = 201;
    public static final java.lang.String TELEMETRY_KEY_APP_START_INFO = "app_start_info";
    private final java.util.Map<java.lang.String, com.datadog.android.profiling.internal.ProfilerCallback> Camera2StreamConfigurationMap;
    private volatile java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.util.Set<java.lang.String>> getOutputFormats;
    private volatile long getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile com.datadog.android.profiling.internal.ProfilingStartReason getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private android.os.CancellationSignal getInputSizeshNQ4ISI;
    private final java.util.function.Consumer<android.os.ProfilingResult> getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getHighSpeedVideoSizesFor;
    private volatile com.datadog.android.api.InternalLogger internalLogger;
    private static final int getHighSpeedVideoFpsRanges = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    public PerfettoProfiler(com.datadog.android.internal.time.TimeProvider timeProvider, java.util.concurrent.ExecutorService executorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        this.getHighSpeedVideoSizesFor = timeProvider;
        this.getHighSpeedVideoFpsRangesFor = executorService;
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>(kotlin.collections.SetsKt.emptySet());
        this.getHighSpeedVideoSizes = com.datadog.android.profiling.internal.ProfilingStartReason.UNKNOWN;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
        this.Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();
        this.getOutputMinFrameDuration = new java.util.function.Consumer() { // from class: com.datadog.android.profiling.internal.perfetto.PerfettoProfiler$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.$r8$lambda$b_AoPriBHTHG43VVuyKSmtStbEc(com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.this, (android.os.ProfilingResult) obj);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PerfettoProfiler(com.datadog.android.internal.time.TimeProvider timeProvider, java.util.concurrent.ExecutorService executorService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, executorService);
        if ((i & 2) != 0) {
            executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executorService, "");
        }
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void setInternalLogger(com.datadog.android.api.InternalLogger internalLogger) {
        this.internalLogger = internalLogger;
        if (internalLogger != null) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
                while (it.hasNext()) {
                    getHighSpeedVideoFpsRangesFor(internalLogger, (com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData) it.next());
                }
                this.getHighSpeedVideoFpsRanges.clear();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void start(android.content.Context appContext, com.datadog.android.profiling.internal.ProfilingStartReason startReason, java.util.Map<java.lang.String, java.lang.String> additionalAttributes, java.util.Set<java.lang.String> sdkInstanceNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceNames, "");
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, kotlin.collections.SetsKt.emptySet(), sdkInstanceNames)) {
            this.getInputFormats = this.getHighSpeedVideoSizesFor.getDeviceTimestampMillis();
            this.getHighSpeedVideoSizes = startReason;
            this.getHighResolutionOutputSizeshNQ4ISI = additionalAttributes.get(TELEMETRY_KEY_APP_START_INFO);
            java.lang.String value = startReason.getValue();
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            this.getInputSizeshNQ4ISI = cancellationSignal;
            androidx.core.os.Profiling.requestProfiling(appContext, new androidx.core.os.StackSamplingRequestBuilder().setCancellationSignal(cancellationSignal).setTag(value).setSamplingFrequencyHz(201).setBufferSizeKb(5120).setDurationMs(getHighSpeedVideoFpsRanges).build(), this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration);
        }
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void stop(java.lang.String sdkInstanceName) {
        android.os.CancellationSignal cancellationSignal;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        if (!this.getOutputFormats.get().contains(sdkInstanceName) || (cancellationSignal = this.getInputSizeshNQ4ISI) == null) {
            return;
        }
        cancellationSignal.cancel();
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final boolean isRunning(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        return this.getOutputFormats.get().contains(sdkInstanceName);
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void registerProfilingCallback(java.lang.String sdkInstanceName, com.datadog.android.profiling.internal.ProfilerCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.Camera2StreamConfigurationMap.put(sdkInstanceName, callback);
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void unregisterProfilingCallback(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        this.Camera2StreamConfigurationMap.remove(sdkInstanceName);
    }

    private final void getHighSpeedVideoFpsRangesFor(com.datadog.android.api.InternalLogger p0, com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData p1) {
        com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(p0, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.profiling.internal.perfetto.PerfettoProfiler$performLogMetric$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "[Mobile Metric] Profiling Session";
            }
        }, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("metric_type", "profiling session"), kotlin.TuplesKt.to("profiling_session", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, java.lang.Integer.valueOf(p1.getHighSpeedVideoFpsRanges)), kotlin.TuplesKt.to("start_reason", p1.getHighSpeedVideoSizesFor), kotlin.TuplesKt.to("duration", java.lang.Long.valueOf(p1.Camera2StreamConfigurationMap)), kotlin.TuplesKt.to("error_message", p1.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("file_size", java.lang.Long.valueOf(getHighResolutionOutputSizeshNQ4ISI(p1.getHighSpeedVideoSizes))), kotlin.TuplesKt.to("stopped_reason", p1.getInputSizeshNQ4ISI), kotlin.TuplesKt.to(TELEMETRY_KEY_APP_START_INFO, p1.getHighResolutionOutputSizeshNQ4ISI))), kotlin.TuplesKt.to("profiling_config", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("buffer_size", 5120), kotlin.TuplesKt.to("sampling_frequency", 201)))), com.datadog.android.core.metrics.MethodCallSamplingRate.ALL.getRate(), null, 8, null);
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        com.datadog.android.api.InternalLogger internalLogger = getInternalLogger();
        if (internalLogger == null) {
            return 0L;
        }
        java.lang.Long valueOf = p0 != null ? java.lang.Long.valueOf(com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(new java.io.File(p0), internalLogger)) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0015\u001a\u00020\t8\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016"}, d2 = {"Lcom/datadog/android/profiling/internal/perfetto/PerfettoProfiler$TelemetryData;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class TelemetryData {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final long Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final int getHighSpeedVideoFpsRanges;
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        final java.lang.String getInputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizesFor;

        public TelemetryData(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, long j, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.getHighSpeedVideoSizesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = str3;
            this.getHighSpeedVideoSizes = str4;
            this.Camera2StreamConfigurationMap = j;
            this.getInputSizeshNQ4ISI = str5;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizesFor;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoFpsRanges;
            java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str4 = this.getHighSpeedVideoSizes;
            long j = this.Camera2StreamConfigurationMap;
            java.lang.String str5 = this.getInputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TelemetryData(getHighSpeedVideoSizesFor=");
            sb.append(str);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(str2);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(i);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(str3);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(str4);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(j);
            sb.append(", getInputSizeshNQ4ISI=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoSizesFor.hashCode();
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.getHighSpeedVideoSizes;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getInputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData)) {
                return false;
            }
            com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData telemetryData = (com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, telemetryData.getHighSpeedVideoSizesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, telemetryData.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == telemetryData.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, telemetryData.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, telemetryData.getHighSpeedVideoSizes) && this.Camera2StreamConfigurationMap == telemetryData.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, telemetryData.getInputSizeshNQ4ISI);
        }
    }

    public static /* synthetic */ void $r8$lambda$b_AoPriBHTHG43VVuyKSmtStbEc(com.datadog.android.profiling.internal.perfetto.PerfettoProfiler perfettoProfiler, android.os.ProfilingResult profilingResult) {
        java.lang.String str;
        java.lang.String resultFilePath;
        long deviceTimestampMillis = perfettoProfiler.getHighSpeedVideoSizesFor.getDeviceTimestampMillis();
        long j = perfettoProfiler.getInputFormats;
        if (profilingResult.getErrorCode() == 0 && (resultFilePath = profilingResult.getResultFilePath()) != null) {
            long j2 = perfettoProfiler.getInputFormats;
            java.lang.String tag = profilingResult.getTag();
            if (tag == null) {
                tag = "";
            }
            com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult = new com.datadog.android.profiling.internal.perfetto.PerfettoResult(j2, deviceTimestampMillis, tag, resultFilePath);
            java.util.Map<java.lang.String, com.datadog.android.profiling.internal.ProfilerCallback> map = perfettoProfiler.Camera2StreamConfigurationMap;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, com.datadog.android.profiling.internal.ProfilerCallback> entry : map.entrySet()) {
                if (perfettoProfiler.getOutputFormats.get().contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((com.datadog.android.profiling.internal.ProfilerCallback) ((java.util.Map.Entry) it.next()).getValue()).onSuccess(perfettoResult);
            }
        }
        perfettoProfiler.getOutputFormats.set(kotlin.collections.SetsKt.emptySet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(profilingResult, "");
        com.datadog.android.profiling.internal.ProfilingStartReason profilingStartReason = perfettoProfiler.getHighSpeedVideoSizes;
        java.lang.String str2 = perfettoProfiler.getHighResolutionOutputSizeshNQ4ISI;
        long j3 = deviceTimestampMillis - j;
        java.lang.String value = profilingStartReason.getValue();
        int errorCode = profilingResult.getErrorCode();
        java.lang.String errorMessage = profilingResult.getErrorMessage();
        java.lang.String resultFilePath2 = profilingResult.getResultFilePath();
        int errorCode2 = profilingResult.getErrorCode();
        android.os.CancellationSignal cancellationSignal = perfettoProfiler.getInputSizeshNQ4ISI;
        if (cancellationSignal != null && cancellationSignal.isCanceled()) {
            str = "manual";
        } else if (errorCode2 == 0) {
            str = com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT;
        } else {
            str = "error";
        }
        com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData telemetryData = new com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TelemetryData(value, str2, errorCode, errorMessage, resultFilePath2, j3, str);
        com.datadog.android.api.InternalLogger internalLogger = perfettoProfiler.getInternalLogger();
        if (internalLogger != null) {
            perfettoProfiler.getHighSpeedVideoFpsRangesFor(internalLogger, telemetryData);
        } else {
            synchronized (perfettoProfiler.getHighSpeedVideoFpsRanges) {
                perfettoProfiler.getHighSpeedVideoFpsRanges.add(telemetryData);
            }
        }
    }
}
