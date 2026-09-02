package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CanvasSender {
    public int evictLayout;
    public int growPayload;
    public int injectMetric;

    public CanvasSender(int i, int i2, int i3) {
        this.evictLayout = i;
        this.growPayload = i2;
        this.injectMetric = i3;
    }

    public final void clipOrigin(int i) {
        this.evictLayout = i;
    }

    public final void detachStream(int i) {
        this.injectMetric = i;
    }

    public final int evictLayout() {
        return this.injectMetric;
    }

    public final int growPayload() {
        return this.growPayload;
    }

    public final int injectMetric() {
        return this.evictLayout;
    }

    public final void releaseHeader(int i) {
        this.growPayload = i;
    }
}
