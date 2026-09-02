package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class EmbeddedDispatcher {
    public final boolean detachStream;
    public final int evictLayout;
    public final int growPayload;
    public final int injectMetric;

    public EmbeddedDispatcher(int i, int i2, int i3, boolean z) {
        this.evictLayout = i;
        this.growPayload = i2;
        this.injectMetric = i3;
        this.detachStream = z;
    }

    public final int evictLayout() {
        return this.evictLayout;
    }
}
