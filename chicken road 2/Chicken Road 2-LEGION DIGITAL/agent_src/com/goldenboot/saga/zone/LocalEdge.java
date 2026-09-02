package com.goldenboot.saga.zone;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class LocalEdge extends TrackballGate implements BorderEdge {
    public static final /* synthetic */ AtomicIntegerFieldUpdater detachStream = AtomicIntegerFieldUpdater.newUpdater(LocalEdge.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long injectMetric;

    public LocalEdge(long j, LocalEdge localEdge, int i) {
        super(localEdge);
        this.injectMetric = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public abstract int attachConfig();

    @Override // com.goldenboot.saga.zone.TrackballGate
    public boolean drawField() {
        return detachStream.get(this) == attachConfig() && !connectJob();
    }

    public final void inflateAdapter() {
        if (detachStream.incrementAndGet(this) == attachConfig()) {
            serializeOffset();
        }
    }

    public final boolean notifyMessage() {
        return detachStream.addAndGet(this, -65536) == attachConfig() && !connectJob();
    }

    public final boolean purgeNode() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = detachStream;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == attachConfig() && !connectJob()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract void resetDelta(int i, Throwable th, LongPressGateway longPressGateway);
}
