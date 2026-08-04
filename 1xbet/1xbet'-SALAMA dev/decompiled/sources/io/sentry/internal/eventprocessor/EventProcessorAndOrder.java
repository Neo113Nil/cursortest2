package io.sentry.internal.eventprocessor;

import io.sentry.EventProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class EventProcessorAndOrder implements Comparable<EventProcessorAndOrder> {
    private final EventProcessor eventProcessor;
    private final Long order;

    public EventProcessorAndOrder(EventProcessor eventProcessor, Long l7) {
        this.eventProcessor = eventProcessor;
        if (l7 == null) {
            this.order = Long.valueOf(System.nanoTime());
        } else {
            this.order = l7;
        }
    }

    public EventProcessor getEventProcessor() {
        return this.eventProcessor;
    }

    public Long getOrder() {
        return this.order;
    }

    @Override // java.lang.Comparable
    public int compareTo(EventProcessorAndOrder eventProcessorAndOrder) {
        return this.order.compareTo(eventProcessorAndOrder.order);
    }
}
