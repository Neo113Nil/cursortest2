package com.datadog.android.trace.event;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/trace/event/NoOpSpanEventMapper;", "Lcom/datadog/android/trace/event/SpanEventMapper;", "<init>", "()V", "Lcom/datadog/android/trace/model/SpanEvent;", "event", "map", "(Lcom/datadog/android/trace/model/SpanEvent;)Lcom/datadog/android/trace/model/SpanEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpSpanEventMapper implements com.datadog.android.trace.event.SpanEventMapper {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.datadog.android.event.EventMapper
    public final com.datadog.android.trace.model.SpanEvent map(com.datadog.android.trace.model.SpanEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return event;
    }
}
