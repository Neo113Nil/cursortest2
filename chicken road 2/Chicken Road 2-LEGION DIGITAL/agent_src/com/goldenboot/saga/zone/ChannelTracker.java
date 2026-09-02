package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ChannelTracker implements StateManager {
    public final FrameHub reduceScope;

    public ChannelTracker(FrameHub frameHub) {
        this.reduceScope = frameHub;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ChannelTracker) && Intrinsics.areEqual(this.reduceScope, ((ChannelTracker) obj).reduceScope);
    }

    public int hashCode() {
        return this.reduceScope.hashCode() * 31;
    }
}
