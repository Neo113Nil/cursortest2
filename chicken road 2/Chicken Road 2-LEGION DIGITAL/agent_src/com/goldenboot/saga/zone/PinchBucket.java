package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class PinchBucket implements ProgressValve {
    public final LongPressGateway reduceScope;

    public PinchBucket(LongPressGateway longPressGateway) {
        this.reduceScope = longPressGateway;
    }

    @Override // com.goldenboot.saga.zone.ProgressValve
    public LongPressGateway getCoroutineContext() {
        return this.reduceScope;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
