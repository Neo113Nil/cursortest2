package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TileRunner {
    public static final long[] evictLayout = {-9187201950435737345L, -1};
    public static final ParallelHeap growPayload = new ParallelHeap(0);

    public static final int detachStream(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int evictLayout(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final ParallelHeap growPayload() {
        return new ParallelHeap(0, 1, null);
    }

    public static final int injectMetric(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int releaseHeader(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }
}
