package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SingletonFacilitator {
    public final TouchRecord evictLayout;
    public final TouchRecord growPayload;

    public SingletonFacilitator(TouchRecord touchRecord, TouchRecord touchRecord2) {
        this.evictLayout = touchRecord;
        this.growPayload = touchRecord2;
    }

    public final TouchRecord evictLayout() {
        return this.evictLayout;
    }

    public final TouchRecord growPayload() {
        return this.growPayload;
    }
}
