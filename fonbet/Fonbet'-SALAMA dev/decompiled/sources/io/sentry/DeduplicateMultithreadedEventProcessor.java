package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EventDropReason;
import io.sentry.protocol.SentryException;
import io.sentry.util.HintUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DeduplicateMultithreadedEventProcessor implements EventProcessor {
    private final SentryOptions options;
    private final Map<String, Long> processedEvents = Collections.synchronizedMap(new HashMap());

    public DeduplicateMultithreadedEventProcessor(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 7000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        if (!HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            return sentryEvent;
        }
        SentryException unhandledException = sentryEvent.getUnhandledException();
        if (unhandledException == null) {
            return sentryEvent;
        }
        String type = unhandledException.getType();
        if (type == null) {
            return sentryEvent;
        }
        Long threadId = unhandledException.getThreadId();
        if (threadId == null) {
            return sentryEvent;
        }
        Long l7 = this.processedEvents.get(type);
        if (l7 == null || l7.equals(threadId)) {
            this.processedEvents.put(type, threadId);
            return sentryEvent;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", sentryEvent.getEventId());
        HintUtils.setEventDropReason(hint, EventDropReason.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
