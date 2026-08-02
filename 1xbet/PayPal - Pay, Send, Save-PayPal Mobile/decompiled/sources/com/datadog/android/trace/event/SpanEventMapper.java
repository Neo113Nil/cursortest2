package com.datadog.android.trace.event;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/trace/event/SpanEventMapper;", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "event", "map", "(Lcom/datadog/android/trace/model/SpanEvent;)Lcom/datadog/android/trace/model/SpanEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SpanEventMapper extends com.datadog.android.event.EventMapper<com.datadog.android.trace.model.SpanEvent> {
    com.datadog.android.trace.model.SpanEvent map(com.datadog.android.trace.model.SpanEvent event);
}
