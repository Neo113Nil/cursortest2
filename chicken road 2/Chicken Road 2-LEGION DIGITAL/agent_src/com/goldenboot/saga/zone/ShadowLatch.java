package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ShadowLatch implements TriggerModerator {
    public final Throwable reduceScope;

    public ShadowLatch(Throwable th) {
        this.reduceScope = th;
    }

    @Override // com.goldenboot.saga.zone.TriggerModerator
    public Object emit(Object obj, ServiceRegulator serviceRegulator) {
        throw this.reduceScope;
    }
}
