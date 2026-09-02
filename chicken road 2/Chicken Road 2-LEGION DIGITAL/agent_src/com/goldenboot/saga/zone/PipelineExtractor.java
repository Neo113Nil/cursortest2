package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class PipelineExtractor {
    public static final RowMutex evictLayout = new RowMutex("CLOSED");

    public static final TrackballGate growPayload(TrackballGate trackballGate) {
        while (true) {
            Object flushSample = trackballGate.flushSample();
            if (flushSample == evictLayout) {
                return trackballGate;
            }
            TrackballGate trackballGate2 = (TrackballGate) flushSample;
            if (trackballGate2 != null) {
                trackballGate = trackballGate2;
            } else if (trackballGate.peekRevision()) {
                return trackballGate;
            }
        }
    }

    public static final Object injectMetric(LocalEdge localEdge, long j, IconExporter iconExporter) {
        while (true) {
            if (localEdge.injectMetric >= j && !localEdge.drawField()) {
                return SpacerDetector.evictLayout(localEdge);
            }
            Object flushSample = localEdge.flushSample();
            if (flushSample == evictLayout) {
                return SpacerDetector.evictLayout(evictLayout);
            }
            LocalEdge localEdge2 = (LocalEdge) ((TrackballGate) flushSample);
            if (localEdge2 == null) {
                localEdge2 = (LocalEdge) iconExporter.invoke(Long.valueOf(localEdge.injectMetric + 1), localEdge);
                if (localEdge.reduceScope(localEdge2)) {
                    if (localEdge.drawField()) {
                        localEdge.serializeOffset();
                    }
                }
            }
            localEdge = localEdge2;
        }
    }
}
