package io.ktor.events;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a?\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\n*(\u0010\f\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000b2\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000b"}, d2 = {"T", "Lio/ktor/events/Events;", "Lio/ktor/events/EventDefinition;", "definition", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "logger", "", "raiseCatching", "(Lio/ktor/events/Events;Lio/ktor/events/EventDefinition;Ljava/lang/Object;Lorg/slf4j/Logger;)V", "Lkotlin/Function1;", "EventHandler"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EventsKt {
    public static /* synthetic */ void raiseCatching$default(io.ktor.events.Events events, io.ktor.events.EventDefinition eventDefinition, java.lang.Object obj, org.slf4j.Logger logger, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            logger = null;
        }
        raiseCatching(events, eventDefinition, obj, logger);
    }

    public static final <T> void raiseCatching(io.ktor.events.Events events, io.ktor.events.EventDefinition<T> eventDefinition, T t, org.slf4j.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDefinition, "");
        try {
            events.raise(eventDefinition, t);
        } catch (java.lang.Throwable th) {
            if (logger != null) {
                logger.error("Some handlers have thrown an exception", th);
            }
        }
    }
}
