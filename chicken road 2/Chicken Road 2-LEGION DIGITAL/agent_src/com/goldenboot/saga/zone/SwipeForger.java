package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class SwipeForger extends ToolbarMutex {
    public static final SwipeForger gatherAdapter = new SwipeForger();

    public SwipeForger() {
        super(MarginAssembler.injectMetric, MarginAssembler.detachStream, MarginAssembler.releaseHeader, MarginAssembler.evictLayout);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.goldenboot.saga.zone.TooltipRunner
    public TooltipRunner formatPosition(int i, String str) {
        CanvasPlanner.evictLayout(i);
        return i >= MarginAssembler.injectMetric ? CanvasPlanner.growPayload(this, str) : super.formatPosition(i, str);
    }

    @Override // com.goldenboot.saga.zone.TooltipRunner
    public String toString() {
        return "Dispatchers.Default";
    }
}
