package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class TransitionEdge {
    public final boolean detachStream;
    public final BoxConductor evictLayout;
    public final int growPayload;
    public final byte[] injectMetric;

    public TransitionEdge(BoxConductor boxConductor, int i, byte[] bArr, boolean z) {
        this.evictLayout = boxConductor;
        this.growPayload = i;
        this.injectMetric = bArr;
        this.detachStream = z;
    }
}
