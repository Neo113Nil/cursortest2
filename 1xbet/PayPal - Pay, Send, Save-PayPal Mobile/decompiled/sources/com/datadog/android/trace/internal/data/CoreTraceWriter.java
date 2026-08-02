package com.datadog.android.trace.internal.data;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\b\u0000\u0018\u0000 02\u00020\u0001:\u00010BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001f\u001a\u00020\u00122\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lcom/datadog/android/trace/internal/data/CoreTraceWriter;", "Lcom/datadog/trace/common/writer/Writer;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lcom/datadog/trace/core/DDSpan;", "Lcom/datadog/android/trace/model/SpanEvent;", "ddSpanToSpanEventMapper", "Lcom/datadog/android/event/EventMapper;", "eventMapper", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "serializer", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "rumContextPropagator", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/trace/internal/RumContextPropagator;)V", "", "close", "()V", "", "flush", "()Z", "", "p0", "incrementDropCounts", "(I)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "", "trace", "write", "(Ljava/util/List;)V", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "getDdSpanToSpanEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lcom/datadog/android/event/EventMapper;", "getEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/event/EventMapper;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoreTraceWriter implements com.datadog.trace.common.writer.Writer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.internal.data.CoreTraceWriter.Companion INSTANCE = new com.datadog.android.trace.internal.data.CoreTraceWriter.Companion(null);
    private static final java.util.Set<java.lang.Integer> DROP_SAMPLING_PRIORITIES = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{0, -1});
    public static final java.lang.String ERROR_SERIALIZING = "Error serializing %s model";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.storage.ContextAwareSerializer<com.datadog.android.trace.model.SpanEvent> getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.trace.internal.domain.event.ContextAwareMapper<com.datadog.trace.core.DDSpan, com.datadog.android.trace.model.SpanEvent> ddSpanToSpanEventMapper;
    private final com.datadog.android.event.EventMapper<com.datadog.android.trace.model.SpanEvent> eventMapper;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore Camera2StreamConfigurationMap;
    private final com.datadog.android.trace.internal.RumContextPropagator getHighSpeedVideoSizes;

    @Override // com.datadog.trace.common.writer.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final boolean flush() {
        return true;
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final void incrementDropCounts(int p0) {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final void start() {
    }

    public CoreTraceWriter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.trace.internal.domain.event.ContextAwareMapper<com.datadog.trace.core.DDSpan, com.datadog.android.trace.model.SpanEvent> contextAwareMapper, com.datadog.android.event.EventMapper<com.datadog.android.trace.model.SpanEvent> eventMapper, com.datadog.android.trace.internal.storage.ContextAwareSerializer<com.datadog.android.trace.model.SpanEvent> contextAwareSerializer, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextAwareMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextAwareSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextPropagator, "");
        this.Camera2StreamConfigurationMap = featureSdkCore;
        this.ddSpanToSpanEventMapper = contextAwareMapper;
        this.eventMapper = eventMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = contextAwareSerializer;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.getHighSpeedVideoSizes = rumContextPropagator;
    }

    public final com.datadog.android.trace.internal.domain.event.ContextAwareMapper<com.datadog.trace.core.DDSpan, com.datadog.android.trace.model.SpanEvent> getDdSpanToSpanEventMapper$dd_sdk_android_trace_release() {
        return this.ddSpanToSpanEventMapper;
    }

    public /* synthetic */ CoreTraceWriter(final com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.trace.internal.domain.event.ContextAwareMapper contextAwareMapper, com.datadog.android.event.NoOpEventMapper noOpEventMapper, com.datadog.android.trace.internal.storage.ContextAwareSerializer contextAwareSerializer, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, contextAwareMapper, (i & 4) != 0 ? new com.datadog.android.event.NoOpEventMapper() : noOpEventMapper, contextAwareSerializer, internalLogger, (i & 32) != 0 ? new com.datadog.android.trace.internal.RumContextPropagator(new kotlin.jvm.functions.Function0<com.datadog.android.api.feature.FeatureSdkCore>() { // from class: com.datadog.android.trace.internal.data.CoreTraceWriter.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.api.feature.FeatureSdkCore invoke() {
                return com.datadog.android.api.feature.FeatureSdkCore.this;
            }

            {
                super(0);
            }
        }) : rumContextPropagator);
    }

    public final com.datadog.android.event.EventMapper<com.datadog.android.trace.model.SpanEvent> getEventMapper$dd_sdk_android_trace_release() {
        return this.eventMapper;
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final void write(final java.util.List<? extends com.datadog.trace.core.DDSpan> trace) {
        com.datadog.android.api.feature.FeatureScope feature;
        if (trace == null || (feature = this.Camera2StreamConfigurationMap.getFeature("tracing")) == null) {
            return;
        }
        com.datadog.android.api.feature.FeatureScope.DefaultImpls.withWriteContext$default(feature, null, new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.data.CoreTraceWriter$write$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                getHighSpeedVideoSizes(datadogContext, function1);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(final com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                java.util.List<com.datadog.trace.core.DDSpan> list = trace;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!kotlin.collections.CollectionsKt.contains(com.datadog.android.trace.internal.data.CoreTraceWriter.INSTANCE.getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release(), ((com.datadog.trace.core.DDSpan) obj).getTraceSamplingPriority())) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList<com.datadog.trace.core.DDSpan> arrayList2 = arrayList;
                com.datadog.android.trace.internal.data.CoreTraceWriter coreTraceWriter = this;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (com.datadog.trace.core.DDSpan dDSpan : arrayList2) {
                    com.datadog.android.trace.internal.RumContextPropagator.Companion companion = com.datadog.android.trace.internal.RumContextPropagator.INSTANCE;
                    rumContextPropagator = coreTraceWriter.getHighSpeedVideoSizes;
                    arrayList3.add(com.datadog.android.trace.internal.RumContextPropagator.Companion.extractRumContext$dd_sdk_android_trace_release$default(companion, dDSpan, rumContextPropagator, false, 2, null));
                }
                final java.util.ArrayList arrayList4 = arrayList3;
                final com.datadog.android.trace.internal.data.CoreTraceWriter coreTraceWriter2 = this;
                function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.data.CoreTraceWriter$write$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                        getHighSpeedVideoSizes(eventBatchWriter);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                        java.util.List<com.datadog.trace.core.DDSpan> list2 = arrayList4;
                        com.datadog.android.trace.internal.data.CoreTraceWriter coreTraceWriter3 = coreTraceWriter2;
                        com.datadog.android.api.context.DatadogContext datadogContext2 = datadogContext;
                        java.util.Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            com.datadog.android.trace.internal.data.CoreTraceWriter.access$writeSpan(coreTraceWriter3, datadogContext2, eventBatchWriter, (com.datadog.trace.core.DDSpan) it.next());
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                });
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        }, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/internal/data/CoreTraceWriter$Companion;", "", "<init>", "()V", "", "", "DROP_SAMPLING_PRIORITIES", "Ljava/util/Set;", "getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release", "()Ljava/util/Set;", "", "ERROR_SERIALIZING", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.Integer> getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release() {
            return com.datadog.android.trace.internal.data.CoreTraceWriter.DROP_SAMPLING_PRIORITIES;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$writeSpan(com.datadog.android.trace.internal.data.CoreTraceWriter coreTraceWriter, com.datadog.android.api.context.DatadogContext datadogContext, com.datadog.android.api.storage.EventBatchWriter eventBatchWriter, com.datadog.trace.core.DDSpan dDSpan) {
        final com.datadog.android.trace.model.SpanEvent map = coreTraceWriter.eventMapper.map(coreTraceWriter.ddSpanToSpanEventMapper.map(datadogContext, dDSpan));
        if (map != null) {
            try {
                java.lang.String serialize = coreTraceWriter.getHighResolutionOutputSizeshNQ4ISI.serialize(datadogContext, map);
                if (serialize != null) {
                    byte[] bytes = serialize.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                    if (bytes != null) {
                        synchronized (coreTraceWriter) {
                            eventBatchWriter.write(new com.datadog.android.api.storage.RawBatchEvent(bytes, null, 2, null), null, com.datadog.android.api.storage.EventType.DEFAULT);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(coreTraceWriter.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.data.CoreTraceWriter$writeSpan$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, "Error serializing %s model", java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.trace.model.SpanEvent.this.getClass().getSimpleName()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    {
                        super(0);
                    }
                }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }
}
