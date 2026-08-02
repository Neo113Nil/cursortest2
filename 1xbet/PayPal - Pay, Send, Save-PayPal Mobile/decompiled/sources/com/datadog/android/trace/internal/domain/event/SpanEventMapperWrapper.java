package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/SpanEventMapperWrapper;", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "Lcom/datadog/android/trace/event/SpanEventMapper;", "wrappedEventMapper", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/trace/event/SpanEventMapper;Lcom/datadog/android/api/InternalLogger;)V", "event", "map", "(Lcom/datadog/android/trace/model/SpanEvent;)Lcom/datadog/android/trace/model/SpanEvent;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/trace/event/SpanEventMapper;", "getWrappedEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/event/SpanEventMapper;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpanEventMapperWrapper implements com.datadog.android.event.EventMapper<com.datadog.android.trace.model.SpanEvent> {
    public static final java.lang.String NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE = "SpanEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.trace.event.SpanEventMapper wrappedEventMapper;

    public SpanEventMapperWrapper(com.datadog.android.trace.event.SpanEventMapper spanEventMapper, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanEventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.wrappedEventMapper = spanEventMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    /* renamed from: getWrappedEventMapper$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.event.SpanEventMapper getWrappedEventMapper() {
        return this.wrappedEventMapper;
    }

    @Override // com.datadog.android.event.EventMapper
    public final com.datadog.android.trace.model.SpanEvent map(final com.datadog.android.trace.model.SpanEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.datadog.android.trace.model.SpanEvent map = this.wrappedEventMapper.map(event);
        if (map == event) {
            return map;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper$map$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper.NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.trace.model.SpanEvent.this}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }
}
