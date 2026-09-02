package com.goldenboot.saga.zone;

import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SurfaceCollector implements BaseMonitor {
    public static final SurfaceCollector evictLayout = new SurfaceCollector();

    @Override // com.goldenboot.saga.zone.BaseMonitor
    public long evictLayout(BackgroundCollection backgroundCollection, DrawableCustodian drawableCustodian, long j) {
        List<PointerInputChange> releaseHeader = drawableCustodian.releaseHeader();
        RuntimeHeap detachStream = RuntimeHeap.detachStream(RuntimeHeap.INSTANCE.releaseHeader());
        int size = releaseHeader.size();
        for (int i = 0; i < size; i++) {
            detachStream = RuntimeHeap.detachStream(RuntimeHeap.gatherAdapter(detachStream.getPackedValue(), releaseHeader.get(i).getScrollDelta()));
        }
        return RuntimeHeap.drawScope(detachStream.getPackedValue(), -backgroundCollection.purgeEdge(InsetsEdge.drawField(64)));
    }
}
