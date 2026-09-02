package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface CursorThrottle {
    void detachStream(SharedLoop sharedLoop, SelectionTimer selectionTimer);

    default TextNotifier evictLayout() {
        return null;
    }

    void growPayload(PipelineGateway pipelineGateway, int i);

    void injectMetric(SharedLoop sharedLoop, float f, SelectionTimer selectionTimer);
}
