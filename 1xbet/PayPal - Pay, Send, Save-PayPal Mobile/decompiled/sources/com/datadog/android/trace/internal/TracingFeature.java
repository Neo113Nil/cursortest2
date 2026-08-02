package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:"}, d2 = {"Lcom/datadog/android/trace/internal/TracingFeature;", "Lcom/datadog/android/trace/InternalCoreWriterProvider;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "customEndpointUrl", "Lcom/datadog/android/trace/event/SpanEventMapper;", "spanEventMapper", "", "networkInfoEnabled", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/trace/event/SpanEventMapper;Z)V", "Lcom/datadog/android/trace/internal/DatadogSpanWriterWrapper;", "getCoreTracerWriter", "()Lcom/datadog/android/trace/internal/DatadogSpanWriterWrapper;", "Landroid/content/Context;", "appContext", "", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "Lcom/datadog/trace/common/writer/Writer;", "coreTracerDataWriter", "Lcom/datadog/trace/common/writer/Writer;", "getCoreTracerDataWriter$dd_sdk_android_trace_release", "()Lcom/datadog/trace/common/writer/Writer;", "setCoreTracerDataWriter$dd_sdk_android_trace_release", "(Lcom/datadog/trace/common/writer/Writer;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_trace_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "()Z", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory$delegate", "Lkotlin/Lazy;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/trace/event/SpanEventMapper;", "getSpanEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/event/SpanEventMapper;", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TracingFeature implements com.datadog.android.trace.InternalCoreWriterProvider, com.datadog.android.api.feature.StorageBackedFeature {
    private com.datadog.trace.common.writer.Writer coreTracerDataWriter;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private final java.lang.String name;
    private final boolean networkInfoEnabled;

    /* renamed from: requestFactory$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy requestFactory;
    private final com.datadog.android.trace.event.SpanEventMapper spanEventMapper;
    private final com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration;

    public TracingFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, final java.lang.String str, com.datadog.android.trace.event.SpanEventMapper spanEventMapper, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanEventMapper, "");
        this.getHighSpeedVideoFpsRangesFor = featureSdkCore;
        this.spanEventMapper = spanEventMapper;
        this.networkInfoEnabled = z;
        this.coreTracerDataWriter = new com.datadog.trace.common.writer.NoOpWriter();
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.name = "tracing";
        this.requestFactory = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.trace.internal.net.TracesRequestFactory>() { // from class: com.datadog.android.trace.internal.TracingFeature$requestFactory$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.trace.internal.net.TracesRequestFactory invoke() {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2;
                java.lang.String str2 = str;
                featureSdkCore2 = this.getHighSpeedVideoFpsRangesFor;
                return new com.datadog.android.trace.internal.net.TracesRequestFactory(str2, featureSdkCore2.getInternalLogger());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.storageConfiguration = com.datadog.android.api.storage.FeatureStorageConfiguration.INSTANCE.getDEFAULT();
    }

    /* renamed from: getSpanEventMapper$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.event.SpanEventMapper getSpanEventMapper() {
        return this.spanEventMapper;
    }

    /* renamed from: getNetworkInfoEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    /* renamed from: getCoreTracerDataWriter$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.common.writer.Writer getCoreTracerDataWriter() {
        return this.coreTracerDataWriter;
    }

    public final void setCoreTracerDataWriter$dd_sdk_android_trace_release(com.datadog.trace.common.writer.Writer writer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        this.coreTracerDataWriter = writer;
    }

    /* renamed from: getInitialized$dd_sdk_android_trace_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getHighSpeedVideoFpsRangesFor;
        com.datadog.android.api.InternalLogger internalLogger = featureSdkCore.getInternalLogger();
        this.coreTracerDataWriter = new com.datadog.android.trace.internal.data.CoreTraceWriter(featureSdkCore, new com.datadog.android.trace.internal.domain.event.CoreTracerSpanToSpanEventMapper(this.networkInfoEnabled), new com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper(this.spanEventMapper, internalLogger), new com.datadog.android.trace.internal.domain.event.SpanEventSerializer(internalLogger, null, 2, 0 == true ? 1 : 0), internalLogger, null, 32, null);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return (com.datadog.android.api.net.RequestFactory) this.requestFactory.getValue();
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        this.initialized.set(false);
    }

    @Override // com.datadog.android.trace.InternalCoreWriterProvider
    public final com.datadog.android.trace.internal.DatadogSpanWriterWrapper getCoreTracerWriter() {
        return new com.datadog.android.trace.internal.DatadogSpanWriterWrapper(this.coreTracerDataWriter);
    }
}
