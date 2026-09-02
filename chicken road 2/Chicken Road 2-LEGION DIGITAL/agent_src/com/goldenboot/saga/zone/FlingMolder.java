package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class FlingMolder {
    public static final float evictLayout = InsetsEdge.drawField(10);

    public static final float evictLayout(BackgroundCollection backgroundCollection, boolean z, long j) {
        float peekRevision = RuntimeHeap.peekRevision(FadeDispatcher.evictLayout(ShapeSender.inflateAdapter(j), ShapeSender.peekRevision(j))) / 2.0f;
        return z ? peekRevision + backgroundCollection.purgeEdge(evictLayout) : peekRevision;
    }

    public static final float growPayload(long j) {
        return Math.max(ShapeSender.inflateAdapter(j), ShapeSender.peekRevision(j)) * 0.3f;
    }
}
