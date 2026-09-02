package com.goldenboot.saga.zone;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ConnectionDeserializer extends TooltipRunner {
    public boolean attachConfig;
    public long connectPatch;
    public CursorMaker resetDelta;

    public static /* synthetic */ void computeTarget(ConnectionDeserializer connectionDeserializer, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        connectionDeserializer.appendKey(z);
    }

    public static /* synthetic */ void resolveDelta(ConnectionDeserializer connectionDeserializer, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        connectionDeserializer.cancelArchive(z);
    }

    public final void appendKey(boolean z) {
        this.connectPatch += resetValue(z);
        if (z) {
            return;
        }
        this.attachConfig = true;
    }

    public final void cancelArchive(boolean z) {
        long resetValue = this.connectPatch - resetValue(z);
        this.connectPatch = resetValue;
        if (resetValue <= 0 && this.attachConfig) {
            shutdown();
        }
    }

    public final boolean emitStrategy() {
        CursorMaker cursorMaker = this.resetDelta;
        if (cursorMaker != null) {
            return cursorMaker.isEmpty();
        }
        return true;
    }

    @Override // com.goldenboot.saga.zone.TooltipRunner
    public final TooltipRunner formatPosition(int i, String str) {
        CanvasPlanner.evictLayout(i);
        return CanvasPlanner.growPayload(this, str);
    }

    public abstract long handleFooter();

    public long injectField() {
        CursorMaker cursorMaker = this.resetDelta;
        if (cursorMaker == null || cursorMaker.isEmpty()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean locateSignal() {
        return this.connectPatch >= resetValue(true);
    }

    public final boolean purgeMetric() {
        ContextPartition contextPartition;
        CursorMaker cursorMaker = this.resetDelta;
        if (cursorMaker == null || (contextPartition = (ContextPartition) cursorMaker.storeCharset()) == null) {
            return false;
        }
        contextPartition.run();
        return true;
    }

    public boolean removeCount() {
        return false;
    }

    public final long resetValue(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void serializeTask(ContextPartition contextPartition) {
        CursorMaker cursorMaker = this.resetDelta;
        if (cursorMaker == null) {
            cursorMaker = new CursorMaker();
            this.resetDelta = cursorMaker;
        }
        cursorMaker.addLast(contextPartition);
    }

    public abstract void shutdown();
}
