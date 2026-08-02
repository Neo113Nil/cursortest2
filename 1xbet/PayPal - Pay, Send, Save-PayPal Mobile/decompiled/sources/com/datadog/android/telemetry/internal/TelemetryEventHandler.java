package com.datadog.android.telemetry.internal;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 72\u00020\u0001:\u000278B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e*\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b,\u0010'R\u0014\u0010#\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u001f\u001a\u0004\u0018\u00010/8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0014\u0010-\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010.R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u00105"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "Lcom/datadog/android/rum/RumSessionListener;", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "eventSampler", "configurationExtraSampler", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "", "maxEventCountPerSession", "<init>", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;I)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "wrappedEvent", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;Lcom/datadog/android/api/storage/DataWriter;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "", "sessionId", "isDiscarded", "onSessionStarted", "(Ljava/lang/String;Z)V", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/datadog/android/api/context/DatadogContext;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getHighSpeedVideoSizes", "(Lcom/datadog/android/api/context/DatadogContext;)Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/core/sampling/Sampler;", "getConfigurationExtraSampler$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/sampling/Sampler;", "", "Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "getEventSampler$dd_sdk_android_rum_release", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "Lcom/datadog/android/core/InternalSdkCore;", "getSdkCore$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Z", "getOutputMinFrameDuration", "Companion", "TracerApi"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TelemetryEventHandler implements com.datadog.android.rum.RumSessionListener {
    public static final java.lang.String ALREADY_SEEN_EVENT_MESSAGE = "Already seen telemetry event with identity=%s, rejecting.";
    public static final float DEFAULT_CONFIGURATION_SAMPLE_RATE = 20.0f;
    public static final java.lang.String DIAGNOSTICS_PROCESS_UPTIME = "process_uptime";
    public static final java.lang.String IS_OPENTELEMETRY_ENABLED_CONTEXT_KEY = "is_opentelemetry_enabled";
    public static final int MAX_EVENTS_PER_SESSION = 100;
    public static final java.lang.String MAX_EVENT_NUMBER_REACHED_MESSAGE = "Max number of telemetry events per session reached, rejecting.";
    public static final java.lang.String OKHTTP_INTERCEPTOR_HEADER_TYPES = "okhttp_interceptor_header_types";
    public static final java.lang.String OKHTTP_INTERCEPTOR_SAMPLE_RATE = "okhttp_interceptor_sample_rate";
    public static final java.lang.String OPENTELEMETRY_API_VERSION_CONTEXT_KEY = "opentelemetry_api_version";
    public static final java.lang.String SESSION_REPLAY_IMAGE_PRIVACY_KEY = "session_replay_image_privacy";
    public static final java.lang.String SESSION_REPLAY_SAMPLE_RATE_KEY = "session_replay_sample_rate";
    public static final java.lang.String SESSION_REPLAY_START_IMMEDIATE_RECORDING_KEY = "session_replay_start_immediate_recording";
    public static final java.lang.String SESSION_REPLAY_TEXT_AND_INPUT_PRIVACY_KEY = "session_replay_text_and_input_privacy";
    public static final java.lang.String SESSION_REPLAY_TOUCH_PRIVACY_KEY = "session_replay_touch_privacy";
    public static final java.lang.String TELEMETRY_SERVICE_NAME = "dd-sdk-android";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> configurationExtraSampler;
    private final com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> eventSampler;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<com.datadog.android.telemetry.internal.TelemetryEventId> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;
    private final com.datadog.android.core.InternalSdkCore sdkCore;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventHandler$TracerApi;", "", "<init>", "(Ljava/lang/String;I)V", "OpenTelemetry", "OpenTracing"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TracerApi {
        OpenTelemetry,
        OpenTracing
    }

    public TelemetryEventHandler(com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> sampler, com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> sampler2, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        this.sdkCore = internalSdkCore;
        this.eventSampler = sampler;
        this.configurationExtraSampler = sampler2;
        this.getHighSpeedVideoFpsRangesFor = sessionMetricDispatcher;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    }

    /* renamed from: getSdkCore$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.InternalSdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> getEventSampler$dd_sdk_android_rum_release() {
        return this.eventSampler;
    }

    public final com.datadog.android.core.sampling.Sampler<com.datadog.android.internal.telemetry.InternalTelemetryEvent> getConfigurationExtraSampler$dd_sdk_android_rum_release() {
        return this.configurationExtraSampler;
    }

    public /* synthetic */ TelemetryEventHandler(com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.sampling.Sampler sampler, com.datadog.android.core.sampling.RateBasedSampler rateBasedSampler, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalSdkCore, sampler, (i2 & 4) != 0 ? new com.datadog.android.core.sampling.RateBasedSampler(20.0f) : rateBasedSampler, sessionMetricDispatcher, (i2 & 16) != 0 ? 100 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.datadog.android.rum.internal.RumFeature.Configuration getHighSpeedVideoFpsRanges() {
        com.datadog.android.rum.internal.RumFeature rumFeature;
        com.datadog.android.api.feature.FeatureScope feature = this.sdkCore.getFeature("rum");
        if (feature == null || (rumFeature = (com.datadog.android.rum.internal.RumFeature) feature.unwrap()) == null) {
            return null;
        }
        return rumFeature.getConfiguration();
    }

    public final void handleEvent(final com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper wrappedEvent, final com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wrappedEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        final com.datadog.android.internal.telemetry.InternalTelemetryEvent event = wrappedEvent.getEvent();
        if (this.eventSampler.sample(event)) {
            if (event instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration) {
                if (!this.configurationExtraSampler.sample(event)) {
                    return;
                }
            } else {
                final com.datadog.android.telemetry.internal.TelemetryEventId identity = com.datadog.android.telemetry.internal.TelemetryEventIdKt.getIdentity(event);
                if ((event instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log) && this.Camera2StreamConfigurationMap.contains(identity)) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.telemetry.internal.TelemetryEventHandler.ALREADY_SEEN_EVENT_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.telemetry.internal.TelemetryEventId.this}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    return;
                } else if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoSizes) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.telemetry.internal.TelemetryEventHandler.MAX_EVENT_NUMBER_REACHED_MESSAGE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    return;
                }
            }
            this.Camera2StreamConfigurationMap.add(com.datadog.android.telemetry.internal.TelemetryEventIdKt.getIdentity(event));
            if (!(event instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration)) {
                this.getHighResolutionOutputSizeshNQ4ISI++;
            }
            com.datadog.android.api.feature.FeatureScope feature = this.sdkCore.getFeature("rum");
            if (feature != null) {
                feature.withWriteContext(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"session-replay", "tracing", "rum"}), new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$handleEvent$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                        getHighResolutionOutputSizeshNQ4ISI(datadogContext, function1);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges;
                        com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher;
                        com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                        long timestamp = com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper.this.getEventTime().getTimestamp() + datadogContext.getTime().getServerTimeOffsetMs();
                        com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent = event;
                        final java.lang.Object obj = null;
                        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) {
                            obj = com.datadog.android.telemetry.internal.TelemetryEventHandler.access$createDebugEvent(this, datadogContext, timestamp, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) internalTelemetryEvent).getMessage(), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) event).getAdditionalProperties(), com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(this, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) event).getAdditionalProperties(), null, 2));
                        } else if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) {
                            obj = com.datadog.android.telemetry.internal.TelemetryEventHandler.access$createDebugEvent(this, datadogContext, timestamp, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) internalTelemetryEvent).getMessage(), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) event).getAdditionalProperties(), com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(this, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) event).getAdditionalProperties(), null, 2));
                        } else if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) {
                            sessionMetricDispatcher = this.getHighSpeedVideoFpsRangesFor;
                            com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler = this;
                            highSpeedVideoSizes = com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(datadogContext);
                            sessionMetricDispatcher.onSdkErrorTracked(highSpeedVideoSizes.getSessionId(), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).getKind());
                            obj = com.datadog.android.telemetry.internal.TelemetryEventHandler.access$createErrorEvent(this, datadogContext, timestamp, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).getMessage(), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).resolveStacktrace(), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).resolveKind(), com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(this, ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).getAdditionalProperties(), null, 2), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) event).getAdditionalProperties());
                        } else if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration) {
                            com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler2 = this;
                            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration configuration = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration) internalTelemetryEvent;
                            highSpeedVideoFpsRanges = telemetryEventHandler2.getHighSpeedVideoFpsRanges();
                            obj = com.datadog.android.telemetry.internal.TelemetryEventHandler.access$createConfigurationEvent(telemetryEventHandler2, datadogContext, timestamp, configuration, com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(telemetryEventHandler2, null, highSpeedVideoFpsRanges != null ? java.lang.Float.valueOf(highSpeedVideoFpsRanges.getTelemetryConfigurationSampleRate()) : null, 1));
                        } else if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage) {
                            com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler3 = this;
                            com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage apiUsage = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage) internalTelemetryEvent;
                            obj = com.datadog.android.telemetry.internal.TelemetryEventHandler.access$createApiUsageEvent(telemetryEventHandler3, datadogContext, timestamp, apiUsage, com.datadog.android.telemetry.internal.TelemetryEventHandler.getHighSpeedVideoSizes(telemetryEventHandler3, apiUsage.getAdditionalProperties(), null, 2));
                        } else if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.InterceptorInstantiated) {
                            this.getOutputMinFrameDuration = true;
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (obj != null) {
                            final com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter = writer;
                            function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$handleEvent$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                    getHighSpeedVideoFpsRanges(eventBatchWriter);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                                    dataWriter.write(eventBatchWriter, obj, com.datadog.android.api.storage.EventType.TELEMETRY);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                });
            }
        }
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public final void onSessionStarted(java.lang.String sessionId, boolean isDiscarded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        this.Camera2StreamConfigurationMap.clear();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.datadog.android.trace.GlobalDatadogTracer");
            try {
                return cls.getDeclaredMethod("getOrNull", new java.lang.Class[0]).invoke(cls.getDeclaredField("INSTANCE").get(null), new java.lang.Object[0]) != null;
            } catch (java.lang.Throwable th) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$isGlobalTracerRegistered$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "GlobalDatadogTracer class exists in the runtime classpath, but there is an error invoking getOrNull method";
                    }
                }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
                return false;
            }
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes(com.datadog.android.api.context.DatadogContext datadogContext) {
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = datadogContext.getFeaturesContext().get("rum");
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return com.datadog.android.rum.internal.domain.RumContext.INSTANCE.fromFeatureContext(map);
    }

    private static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        for (com.datadog.android.internal.attributes.LocalAttribute.Key key : com.datadog.android.internal.attributes.LocalAttribute.Key.values()) {
            mutableMap.remove(key.toString());
        }
        return mutableMap;
    }

    public static final /* synthetic */ com.datadog.android.telemetry.model.TelemetryUsageEvent access$createApiUsageEvent(com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, com.datadog.android.api.context.DatadogContext datadogContext, long j, com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage apiUsage, float f) {
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Type type;
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage.AndroidNetworkInstrumentation androidNetworkInstrumentation;
        com.datadog.android.telemetry.model.TelemetryUsageEvent.ActionType actionType;
        com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes = getHighSpeedVideoSizes(datadogContext);
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(apiUsage.getAdditionalProperties());
        if (apiUsage instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital) {
            int i = com.datadog.android.telemetry.internal.TelemetryEventHandler.WhenMappings.$EnumSwitchMapping$0[((com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital) apiUsage).getActionType().ordinal()];
            if (i == 1) {
                actionType = com.datadog.android.telemetry.model.TelemetryUsageEvent.ActionType.START;
            } else if (i == 2) {
                actionType = com.datadog.android.telemetry.model.TelemetryUsageEvent.ActionType.SUCCEED;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                actionType = com.datadog.android.telemetry.model.TelemetryUsageEvent.ActionType.FAIL;
            }
            androidNetworkInstrumentation = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage.AddOperationStepVital(actionType);
        } else if (apiUsage instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime) {
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime addViewLoadingTime = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime) apiUsage;
            androidNetworkInstrumentation = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage.AddViewLoadingTime(addViewLoadingTime.getNoView(), addViewLoadingTime.getNoActiveView(), addViewLoadingTime.getOverwrite());
        } else if (apiUsage instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.TrackWebView) {
            androidNetworkInstrumentation = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage.TrackWebView();
        } else if (apiUsage instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation) {
            int i2 = com.datadog.android.telemetry.internal.TelemetryEventHandler.WhenMappings.$EnumSwitchMapping$1[((com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation) apiUsage).getType().ordinal()];
            if (i2 == 1) {
                type = com.datadog.android.telemetry.model.TelemetryUsageEvent.Type.CRONET;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                type = com.datadog.android.telemetry.model.TelemetryUsageEvent.Type.OKHTTP;
            }
            androidNetworkInstrumentation = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage.AndroidNetworkInstrumentation(type);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Dd dd = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Dd();
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Source tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryUsageEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
        if (tryFromSource == null) {
            tryFromSource = com.datadog.android.telemetry.model.TelemetryUsageEvent.Source.ANDROID;
        }
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Source source = tryFromSource;
        java.lang.String sdkVersion = datadogContext.getSdkVersion();
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Application application = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Application(highSpeedVideoSizes.getApplicationId());
        com.datadog.android.telemetry.model.TelemetryUsageEvent.Session session = new com.datadog.android.telemetry.model.TelemetryUsageEvent.Session(highSpeedVideoSizes.getSessionId());
        java.lang.String viewId = highSpeedVideoSizes.getViewId();
        com.datadog.android.telemetry.model.TelemetryUsageEvent.View view = viewId != null ? new com.datadog.android.telemetry.model.TelemetryUsageEvent.View(viewId) : null;
        java.lang.String actionId = highSpeedVideoSizes.getActionId();
        return new com.datadog.android.telemetry.model.TelemetryUsageEvent(dd, j, "dd-sdk-android", source, sdkVersion, application, session, view, actionId != null ? new com.datadog.android.telemetry.model.TelemetryUsageEvent.Action(actionId) : null, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryUsageEvent.Telemetry(new com.datadog.android.telemetry.model.TelemetryUsageEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam()), new com.datadog.android.telemetry.model.TelemetryUsageEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), androidNetworkInstrumentation, highSpeedVideoFpsRanges), 1024, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.datadog.android.telemetry.model.TelemetryConfigurationEvent access$createConfigurationEvent(com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, com.datadog.android.api.context.DatadogContext datadogContext, long j, com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration configuration, float f) {
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy viewTrackingStrategy;
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy viewTrackingStrategy2;
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.Boolean bool;
        com.datadog.android.telemetry.internal.TelemetryEventHandler.TracerApi tracerApi;
        java.lang.String str;
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source tryFromSource;
        com.datadog.android.rum.configuration.VitalsUpdateFrequency vitalsMonitorUpdateFrequency;
        com.datadog.android.api.feature.FeatureScope feature = telemetryEventHandler.sdkCore.getFeature("tracing");
        java.util.Map<java.lang.String, java.lang.Object> map2 = datadogContext.getFeaturesContext().get("session-replay");
        if (map2 == null) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.Object obj = map2.get("session_replay_sample_rate");
        java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
        java.lang.Object obj2 = map2.get("session_replay_start_immediate_recording");
        java.lang.Boolean bool2 = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        java.lang.Object obj3 = map2.get("session_replay_image_privacy");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map2.get("session_replay_touch_privacy");
        java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.Object obj5 = map2.get("session_replay_text_and_input_privacy");
        java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        com.datadog.android.rum.tracking.ViewTrackingStrategy viewTrackingStrategy3 = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getViewTrackingStrategy() : null;
        if (viewTrackingStrategy3 instanceof com.datadog.android.rum.tracking.ActivityViewTrackingStrategy) {
            viewTrackingStrategy2 = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy.ACTIVITYVIEWTRACKINGSTRATEGY;
        } else if (viewTrackingStrategy3 instanceof com.datadog.android.rum.tracking.FragmentViewTrackingStrategy) {
            viewTrackingStrategy2 = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy.FRAGMENTVIEWTRACKINGSTRATEGY;
        } else if (viewTrackingStrategy3 instanceof com.datadog.android.rum.tracking.MixedViewTrackingStrategy) {
            viewTrackingStrategy2 = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy.MIXEDVIEWTRACKINGSTRATEGY;
        } else {
            if (!(viewTrackingStrategy3 instanceof com.datadog.android.rum.tracking.NavigationViewTrackingStrategy)) {
                viewTrackingStrategy = null;
                com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes = getHighSpeedVideoSizes(datadogContext);
                map = datadogContext.getFeaturesContext().get("tracing");
                if (map == null) {
                    map = kotlin.collections.MapsKt.emptyMap();
                }
                java.lang.Object obj6 = map.get(IS_OPENTELEMETRY_ENABLED_CONTEXT_KEY);
                bool = !(obj6 instanceof java.lang.Boolean) ? (java.lang.Boolean) obj6 : null;
                if (bool == null && bool.booleanValue()) {
                    tracerApi = com.datadog.android.telemetry.internal.TelemetryEventHandler.TracerApi.OpenTelemetry;
                } else {
                    tracerApi = !telemetryEventHandler.getHighResolutionOutputSizeshNQ4ISI() ? com.datadog.android.telemetry.internal.TelemetryEventHandler.TracerApi.OpenTracing : null;
                }
                if (tracerApi == com.datadog.android.telemetry.internal.TelemetryEventHandler.TracerApi.OpenTelemetry) {
                    java.lang.Object obj7 = map.get(OPENTELEMETRY_API_VERSION_CONTEXT_KEY);
                    if (obj7 instanceof java.lang.String) {
                        str = (java.lang.String) obj7;
                        boolean z = feature == null && tracerApi != null;
                        java.lang.Object obj8 = map.get("okhttp_interceptor_sample_rate");
                        java.lang.Float f2 = obj8 instanceof java.lang.Float ? (java.lang.Float) obj8 : null;
                        java.lang.Object obj9 = map.get("okhttp_interceptor_header_types");
                        com.datadog.android.internal.telemetry.TracingHeaderTypesSet tracingHeaderTypesSet = obj9 instanceof com.datadog.android.internal.telemetry.TracingHeaderTypesSet ? (com.datadog.android.internal.telemetry.TracingHeaderTypesSet) obj9 : null;
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges2 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier = highSpeedVideoFpsRanges2 != null ? highSpeedVideoFpsRanges2.getLastInteractionIdentifier() : null;
                        com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier timeBasedInteractionIdentifier = lastInteractionIdentifier instanceof com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier ? (com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier) lastInteractionIdentifier : null;
                        java.lang.Long valueOf = timeBasedInteractionIdentifier != null ? java.lang.Long.valueOf(timeBasedInteractionIdentifier.getTimeThresholdInMilliseconds()) : null;
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges3 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier = highSpeedVideoFpsRanges3 != null ? highSpeedVideoFpsRanges3.getInitialResourceIdentifier() : null;
                        com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier timeBasedInitialResourceIdentifier = initialResourceIdentifier instanceof com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier ? (com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier) initialResourceIdentifier : null;
                        java.lang.Long valueOf2 = timeBasedInitialResourceIdentifier != null ? java.lang.Long.valueOf(timeBasedInitialResourceIdentifier.getTimeThresholdInMilliseconds()) : null;
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd dd = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd();
                        tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
                        if (tryFromSource == null) {
                            tryFromSource = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source.ANDROID;
                        }
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source source = tryFromSource;
                        java.lang.String sdkVersion = datadogContext.getSdkVersion();
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application application = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application(highSpeedVideoSizes.getApplicationId());
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session session = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session(highSpeedVideoSizes.getSessionId());
                        java.lang.String viewId = highSpeedVideoSizes.getViewId();
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.View view = viewId != null ? new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.View(viewId) : null;
                        java.lang.String actionId = highSpeedVideoSizes.getActionId();
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Action action = actionId != null ? new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Action(actionId) : null;
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device device = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam());
                        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os os = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion());
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges4 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        java.lang.Long valueOf3 = highSpeedVideoFpsRanges4 != null ? java.lang.Long.valueOf((long) highSpeedVideoFpsRanges4.getSampleRate()) : null;
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges5 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        java.lang.Long valueOf4 = highSpeedVideoFpsRanges5 != null ? java.lang.Long.valueOf((long) highSpeedVideoFpsRanges5.getTelemetrySampleRate()) : null;
                        boolean useProxy = configuration.getUseProxy();
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges6 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        java.lang.Boolean valueOf5 = highSpeedVideoFpsRanges6 != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges6.getTrackFrustrations()) : null;
                        boolean useLocalEncryption = configuration.getUseLocalEncryption();
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges7 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        java.lang.Boolean valueOf6 = highSpeedVideoFpsRanges7 != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges7.getBackgroundEventTracking()) : null;
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges8 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        boolean z2 = (highSpeedVideoFpsRanges8 != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges8.getUserActionTracking()) : null) != null;
                        boolean trackErrors = configuration.getTrackErrors();
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges9 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        boolean z3 = (highSpeedVideoFpsRanges9 != null ? highSpeedVideoFpsRanges9.getLongTaskTrackingStrategy() : null) != null;
                        long batchSize = configuration.getBatchSize();
                        long batchUploadFrequency = configuration.getBatchUploadFrequency();
                        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges10 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                        java.lang.Long valueOf7 = (highSpeedVideoFpsRanges10 != null || (vitalsMonitorUpdateFrequency = highSpeedVideoFpsRanges10.getVitalsMonitorUpdateFrequency()) == null) ? null : java.lang.Long.valueOf(vitalsMonitorUpdateFrequency.getPeriodInMs());
                        java.lang.String name2 = tracerApi != null ? tracerApi.name() : null;
                        boolean z4 = telemetryEventHandler.getOutputMinFrameDuration;
                        long batchProcessingLevel = configuration.getBatchProcessingLevel();
                        boolean isMainProcess = datadogContext.getProcessInfo().isMainProcess();
                        return new com.datadog.android.telemetry.model.TelemetryConfigurationEvent(dd, j, "dd-sdk-android", source, sdkVersion, application, session, view, action, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Telemetry(device, os, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Configuration(valueOf3, valueOf4, null, null, f2 != null ? java.lang.Long.valueOf((long) f2.floatValue()) : null, null, null, null, l, null, null, bool2, java.lang.Boolean.valueOf(useProxy), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, tracingHeaderTypesSet != null ? com.datadog.android.telemetry.internal.TracingHeaderTypesSetUtilsKt.toSelectedTracingPropagators(tracingHeaderTypesSet) : null, null, str4, str2, str3, null, null, null, null, valueOf5, null, java.lang.Boolean.valueOf(z2), null, null, datadogContext.getDeviceInfo().getNumberOfDisplays() != null ? java.lang.Long.valueOf(r7.intValue()) : null, null, null, java.lang.Boolean.valueOf(useLocalEncryption), viewTrackingStrategy, null, null, valueOf6, valueOf7, java.lang.Boolean.valueOf(trackErrors), java.lang.Boolean.valueOf(z4), java.lang.Boolean.valueOf(z), null, null, java.lang.Boolean.valueOf(z3), null, null, null, null, java.lang.Long.valueOf(batchSize), java.lang.Long.valueOf(batchUploadFrequency), java.lang.Long.valueOf(batchProcessingLevel), null, null, null, null, null, null, null, name2, str, null, null, java.lang.Boolean.valueOf(isMainProcess), valueOf, valueOf2, null, null, null, null, null, null, null, null, null, null, null, -6420, -667718715, 1073270755, null), null, 8, null));
                    }
                }
                str = null;
                if (feature == null) {
                }
                java.lang.Object obj82 = map.get("okhttp_interceptor_sample_rate");
                if (obj82 instanceof java.lang.Float) {
                }
                java.lang.Object obj92 = map.get("okhttp_interceptor_header_types");
                if (obj92 instanceof com.datadog.android.internal.telemetry.TracingHeaderTypesSet) {
                }
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges22 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges22 != null) {
                }
                if (lastInteractionIdentifier instanceof com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier) {
                }
                if (timeBasedInteractionIdentifier != null) {
                }
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges32 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges32 != null) {
                }
                if (initialResourceIdentifier instanceof com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier) {
                }
                if (timeBasedInitialResourceIdentifier != null) {
                }
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd dd2 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd();
                tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
                if (tryFromSource == null) {
                }
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source source2 = tryFromSource;
                java.lang.String sdkVersion2 = datadogContext.getSdkVersion();
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application application2 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application(highSpeedVideoSizes.getApplicationId());
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session session2 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session(highSpeedVideoSizes.getSessionId());
                java.lang.String viewId2 = highSpeedVideoSizes.getViewId();
                if (viewId2 != null) {
                }
                java.lang.String actionId2 = highSpeedVideoSizes.getActionId();
                if (actionId2 != null) {
                }
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device device2 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam());
                com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os os2 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion());
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges42 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges42 != null) {
                }
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges52 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges52 != null) {
                }
                boolean useProxy2 = configuration.getUseProxy();
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges62 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges62 != null) {
                }
                boolean useLocalEncryption2 = configuration.getUseLocalEncryption();
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges72 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges72 != null) {
                }
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges82 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if ((highSpeedVideoFpsRanges82 != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges82.getUserActionTracking()) : null) != null) {
                }
                boolean trackErrors2 = configuration.getTrackErrors();
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges92 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if ((highSpeedVideoFpsRanges92 != null ? highSpeedVideoFpsRanges92.getLongTaskTrackingStrategy() : null) != null) {
                }
                long batchSize2 = configuration.getBatchSize();
                long batchUploadFrequency2 = configuration.getBatchUploadFrequency();
                com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges102 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges102 != null) {
                }
                if (tracerApi != null) {
                }
                boolean z42 = telemetryEventHandler.getOutputMinFrameDuration;
                long batchProcessingLevel2 = configuration.getBatchProcessingLevel();
                boolean isMainProcess2 = datadogContext.getProcessInfo().isMainProcess();
                if (datadogContext.getDeviceInfo().getNumberOfDisplays() != null) {
                }
                return new com.datadog.android.telemetry.model.TelemetryConfigurationEvent(dd2, j, "dd-sdk-android", source2, sdkVersion2, application2, session2, view, action, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Telemetry(device2, os2, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Configuration(valueOf3, valueOf4, null, null, f2 != null ? java.lang.Long.valueOf((long) f2.floatValue()) : null, null, null, null, l, null, null, bool2, java.lang.Boolean.valueOf(useProxy2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, tracingHeaderTypesSet != null ? com.datadog.android.telemetry.internal.TracingHeaderTypesSetUtilsKt.toSelectedTracingPropagators(tracingHeaderTypesSet) : null, null, str4, str2, str3, null, null, null, null, valueOf5, null, java.lang.Boolean.valueOf(z2), null, null, datadogContext.getDeviceInfo().getNumberOfDisplays() != null ? java.lang.Long.valueOf(r7.intValue()) : null, null, null, java.lang.Boolean.valueOf(useLocalEncryption2), viewTrackingStrategy, null, null, valueOf6, valueOf7, java.lang.Boolean.valueOf(trackErrors2), java.lang.Boolean.valueOf(z42), java.lang.Boolean.valueOf(z), null, null, java.lang.Boolean.valueOf(z3), null, null, null, null, java.lang.Long.valueOf(batchSize2), java.lang.Long.valueOf(batchUploadFrequency2), java.lang.Long.valueOf(batchProcessingLevel2), null, null, null, null, null, null, null, name2, str, null, null, java.lang.Boolean.valueOf(isMainProcess2), valueOf, valueOf2, null, null, null, null, null, null, null, null, null, null, null, -6420, -667718715, 1073270755, null), null, 8, null));
            }
            viewTrackingStrategy2 = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.ViewTrackingStrategy.NAVIGATIONVIEWTRACKINGSTRATEGY;
        }
        viewTrackingStrategy = viewTrackingStrategy2;
        com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes2 = getHighSpeedVideoSizes(datadogContext);
        map = datadogContext.getFeaturesContext().get("tracing");
        if (map == null) {
        }
        java.lang.Object obj62 = map.get(IS_OPENTELEMETRY_ENABLED_CONTEXT_KEY);
        if (!(obj62 instanceof java.lang.Boolean)) {
        }
        if (bool == null) {
        }
        if (!telemetryEventHandler.getHighResolutionOutputSizeshNQ4ISI()) {
        }
        if (tracerApi == com.datadog.android.telemetry.internal.TelemetryEventHandler.TracerApi.OpenTelemetry) {
        }
        str = null;
        if (feature == null) {
        }
        java.lang.Object obj822 = map.get("okhttp_interceptor_sample_rate");
        if (obj822 instanceof java.lang.Float) {
        }
        java.lang.Object obj922 = map.get("okhttp_interceptor_header_types");
        if (obj922 instanceof com.datadog.android.internal.telemetry.TracingHeaderTypesSet) {
        }
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges222 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges222 != null) {
        }
        if (lastInteractionIdentifier instanceof com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier) {
        }
        if (timeBasedInteractionIdentifier != null) {
        }
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges322 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges322 != null) {
        }
        if (initialResourceIdentifier instanceof com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier) {
        }
        if (timeBasedInitialResourceIdentifier != null) {
        }
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd dd22 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Dd();
        tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
        if (tryFromSource == null) {
        }
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source source22 = tryFromSource;
        java.lang.String sdkVersion22 = datadogContext.getSdkVersion();
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application application22 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Application(highSpeedVideoSizes2.getApplicationId());
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session session22 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Session(highSpeedVideoSizes2.getSessionId());
        java.lang.String viewId22 = highSpeedVideoSizes2.getViewId();
        if (viewId22 != null) {
        }
        java.lang.String actionId22 = highSpeedVideoSizes2.getActionId();
        if (actionId22 != null) {
        }
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device device22 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam());
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os os22 = new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion());
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges422 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges422 != null) {
        }
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges522 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges522 != null) {
        }
        boolean useProxy22 = configuration.getUseProxy();
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges622 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges622 != null) {
        }
        boolean useLocalEncryption22 = configuration.getUseLocalEncryption();
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges722 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges722 != null) {
        }
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges822 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if ((highSpeedVideoFpsRanges822 != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges822.getUserActionTracking()) : null) != null) {
        }
        boolean trackErrors22 = configuration.getTrackErrors();
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges922 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if ((highSpeedVideoFpsRanges922 != null ? highSpeedVideoFpsRanges922.getLongTaskTrackingStrategy() : null) != null) {
        }
        long batchSize22 = configuration.getBatchSize();
        long batchUploadFrequency22 = configuration.getBatchUploadFrequency();
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges1022 = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges1022 != null) {
        }
        if (tracerApi != null) {
        }
        boolean z422 = telemetryEventHandler.getOutputMinFrameDuration;
        long batchProcessingLevel22 = configuration.getBatchProcessingLevel();
        boolean isMainProcess22 = datadogContext.getProcessInfo().isMainProcess();
        if (datadogContext.getDeviceInfo().getNumberOfDisplays() != null) {
        }
        return new com.datadog.android.telemetry.model.TelemetryConfigurationEvent(dd22, j, "dd-sdk-android", source22, sdkVersion22, application22, session22, view, action, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Telemetry(device22, os22, new com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Configuration(valueOf3, valueOf4, null, null, f2 != null ? java.lang.Long.valueOf((long) f2.floatValue()) : null, null, null, null, l, null, null, bool2, java.lang.Boolean.valueOf(useProxy22), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, tracingHeaderTypesSet != null ? com.datadog.android.telemetry.internal.TracingHeaderTypesSetUtilsKt.toSelectedTracingPropagators(tracingHeaderTypesSet) : null, null, str4, str2, str3, null, null, null, null, valueOf5, null, java.lang.Boolean.valueOf(z2), null, null, datadogContext.getDeviceInfo().getNumberOfDisplays() != null ? java.lang.Long.valueOf(r7.intValue()) : null, null, null, java.lang.Boolean.valueOf(useLocalEncryption22), viewTrackingStrategy, null, null, valueOf6, valueOf7, java.lang.Boolean.valueOf(trackErrors22), java.lang.Boolean.valueOf(z422), java.lang.Boolean.valueOf(z), null, null, java.lang.Boolean.valueOf(z3), null, null, null, null, java.lang.Long.valueOf(batchSize22), java.lang.Long.valueOf(batchUploadFrequency22), java.lang.Long.valueOf(batchProcessingLevel22), null, null, null, null, null, null, null, name2, str, null, null, java.lang.Boolean.valueOf(isMainProcess22), valueOf, valueOf2, null, null, null, null, null, null, null, null, null, null, null, -6420, -667718715, 1073270755, null), null, 8, null));
    }

    public static final /* synthetic */ com.datadog.android.telemetry.model.TelemetryDebugEvent access$createDebugEvent(com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, com.datadog.android.api.context.DatadogContext datadogContext, long j, java.lang.String str, java.util.Map map, float f) {
        com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes = getHighSpeedVideoSizes(datadogContext);
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlin.collections.MapsKt.toMutableMap(map == null ? kotlin.collections.MapsKt.emptyMap() : map));
        highSpeedVideoFpsRanges.put(DIAGNOSTICS_PROCESS_UPTIME, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(telemetryEventHandler.sdkCore.getAppUptimeNs())));
        com.datadog.android.telemetry.model.TelemetryDebugEvent.Dd dd = new com.datadog.android.telemetry.model.TelemetryDebugEvent.Dd();
        com.datadog.android.telemetry.model.TelemetryDebugEvent.Source tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryDebugEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
        if (tryFromSource == null) {
            tryFromSource = com.datadog.android.telemetry.model.TelemetryDebugEvent.Source.ANDROID;
        }
        com.datadog.android.telemetry.model.TelemetryDebugEvent.Source source = tryFromSource;
        java.lang.String sdkVersion = datadogContext.getSdkVersion();
        com.datadog.android.telemetry.model.TelemetryDebugEvent.Application application = new com.datadog.android.telemetry.model.TelemetryDebugEvent.Application(highSpeedVideoSizes.getApplicationId());
        com.datadog.android.telemetry.model.TelemetryDebugEvent.Session session = new com.datadog.android.telemetry.model.TelemetryDebugEvent.Session(highSpeedVideoSizes.getSessionId());
        java.lang.String viewId = highSpeedVideoSizes.getViewId();
        com.datadog.android.telemetry.model.TelemetryDebugEvent.View view = viewId != null ? new com.datadog.android.telemetry.model.TelemetryDebugEvent.View(viewId) : null;
        java.lang.String actionId = highSpeedVideoSizes.getActionId();
        return new com.datadog.android.telemetry.model.TelemetryDebugEvent(dd, j, "dd-sdk-android", source, sdkVersion, application, session, view, actionId != null ? new com.datadog.android.telemetry.model.TelemetryDebugEvent.Action(actionId) : null, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryDebugEvent.Telemetry(new com.datadog.android.telemetry.model.TelemetryDebugEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam()), new com.datadog.android.telemetry.model.TelemetryDebugEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), str, highSpeedVideoFpsRanges), 1024, null);
    }

    public static final /* synthetic */ com.datadog.android.telemetry.model.TelemetryErrorEvent access$createErrorEvent(com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, com.datadog.android.api.context.DatadogContext datadogContext, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, float f, java.util.Map map) {
        com.datadog.android.rum.internal.domain.RumContext highSpeedVideoSizes = getHighSpeedVideoSizes(datadogContext);
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlin.collections.MapsKt.toMutableMap(map == null ? kotlin.collections.MapsKt.emptyMap() : map));
        highSpeedVideoFpsRanges.put(DIAGNOSTICS_PROCESS_UPTIME, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(telemetryEventHandler.sdkCore.getAppUptimeNs())));
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd dd = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Dd();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Source tryFromSource = com.datadog.android.telemetry.internal.TelemetryEventExtKt.tryFromSource(com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.INSTANCE, datadogContext.getSource(), telemetryEventHandler.sdkCore.getInternalLogger());
        if (tryFromSource == null) {
            tryFromSource = com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.ANDROID;
        }
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Source source = tryFromSource;
        java.lang.String sdkVersion = datadogContext.getSdkVersion();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Application application = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Application(highSpeedVideoSizes.getApplicationId());
        com.datadog.android.telemetry.model.TelemetryErrorEvent.Session session = new com.datadog.android.telemetry.model.TelemetryErrorEvent.Session(highSpeedVideoSizes.getSessionId());
        java.lang.String viewId = highSpeedVideoSizes.getViewId();
        com.datadog.android.telemetry.model.TelemetryErrorEvent.View view = viewId != null ? new com.datadog.android.telemetry.model.TelemetryErrorEvent.View(viewId) : null;
        java.lang.String actionId = highSpeedVideoSizes.getActionId();
        return new com.datadog.android.telemetry.model.TelemetryErrorEvent(dd, j, "dd-sdk-android", source, sdkVersion, application, session, view, actionId != null ? new com.datadog.android.telemetry.model.TelemetryErrorEvent.Action(actionId) : null, java.lang.Float.valueOf(f), null, new com.datadog.android.telemetry.model.TelemetryErrorEvent.Telemetry(new com.datadog.android.telemetry.model.TelemetryErrorEvent.Device(datadogContext.getDeviceInfo().getArchitecture(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getDeviceModel(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam()), new com.datadog.android.telemetry.model.TelemetryErrorEvent.Os(datadogContext.getDeviceInfo().getDeviceBuildId(), datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion()), str, (str2 == null && str3 == null) ? null : new com.datadog.android.telemetry.model.TelemetryErrorEvent.Error(str2, str3), highSpeedVideoFpsRanges), 1024, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ float getHighSpeedVideoSizes(com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, java.util.Map map, java.lang.Float f, int i) {
        double d;
        double d2;
        if ((i & 1) != 0) {
            map = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        com.datadog.android.rum.internal.RumFeature.Configuration highSpeedVideoFpsRanges = telemetryEventHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == null) {
            return 0.0f;
        }
        double percent = com.datadog.android.rum.internal.utils.NumberExtKt.percent(highSpeedVideoFpsRanges.getTelemetrySampleRate());
        if (map != null) {
            java.lang.Object obj = map.get(com.datadog.android.internal.attributes.LocalAttribute.Key.CREATION_SAMPLING_RATE.toString());
            java.lang.Float f2 = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
            if (f2 != null) {
                d = com.datadog.android.rum.internal.utils.NumberExtKt.percent(f2.floatValue());
                if (map != null) {
                    java.lang.Object obj2 = map.get(com.datadog.android.internal.attributes.LocalAttribute.Key.REPORTING_SAMPLING_RATE.toString());
                    java.lang.Float f3 = obj2 instanceof java.lang.Float ? (java.lang.Float) obj2 : null;
                    if (f3 != null) {
                        d2 = com.datadog.android.rum.internal.utils.NumberExtKt.percent(f3.floatValue());
                        return (float) (percent * d * d2 * (f != null ? com.datadog.android.rum.internal.utils.NumberExtKt.percent(f.floatValue()) : 1.0d) * 100.0d);
                    }
                }
                d2 = 1.0d;
                return (float) (percent * d * d2 * (f != null ? com.datadog.android.rum.internal.utils.NumberExtKt.percent(f.floatValue()) : 1.0d) * 100.0d);
            }
        }
        d = 1.0d;
        if (map != null) {
        }
        d2 = 1.0d;
        return (float) (percent * d * d2 * (f != null ? com.datadog.android.rum.internal.utils.NumberExtKt.percent(f.floatValue()) : 1.0d) * 100.0d);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.values().length];
            try {
                iArr[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.SUCCEED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.FAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType.values().length];
            try {
                iArr2[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType.CRONET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType.OKHTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
