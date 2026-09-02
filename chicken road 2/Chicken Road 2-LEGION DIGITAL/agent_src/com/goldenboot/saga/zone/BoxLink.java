package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BoxLink extends FlingStore {
    public final ElevationStack growPayload;

    public BoxLink(ElevationStack elevationStack) {
        this.growPayload = elevationStack;
    }

    @Override // com.goldenboot.saga.zone.FlingStore
    public int detachStream(TouchEvaluator touchEvaluator) {
        ElevationStack elevationStack = this.growPayload;
        return elevationStack.emitStrategy(elevationStack.syncScope(touchEvaluator));
    }

    @Override // com.goldenboot.saga.zone.FlingStore
    public AccentPatch flushSample(TouchEvaluator touchEvaluator) {
        ElevationStack elevationStack = this.growPayload;
        return elevationStack.updateRule(elevationStack.syncScope(touchEvaluator));
    }
}
