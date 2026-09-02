package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SlotVersion {
    public static final long applyTask(long j, long j2, float f) {
        return NavBarMaker.growPayload(ActivitySupervisor.applyTask(flushSample(j), flushSample(j2), f), ActivitySupervisor.applyTask(updateTimer(j), updateTimer(j2), f));
    }

    public static final float clipOrigin(long j) {
        return (float) Math.sqrt((flushSample(j) * flushSample(j)) + (updateTimer(j) * updateTimer(j)));
    }

    public static final long connectJob(long j, float f) {
        return NavBarMaker.growPayload(flushSample(j) * f, updateTimer(j) * f);
    }

    public static final float detachStream(long j, long j2) {
        return (flushSample(j) * flushSample(j2)) + (updateTimer(j) * updateTimer(j2));
    }

    public static final long drawField(long j, long j2) {
        return NavBarMaker.growPayload(flushSample(j) + flushSample(j2), updateTimer(j) + updateTimer(j2));
    }

    public static final boolean evictLayout(long j, long j2) {
        return (flushSample(j) * updateTimer(j2)) - (updateTimer(j) * flushSample(j2)) > 0.0f;
    }

    public static final float flushSample(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long growPayload(long j, float f) {
        return NavBarMaker.growPayload(flushSample(j) / f, updateTimer(j) / f);
    }

    public static final float injectMetric(long j, float f, float f2) {
        return (flushSample(j) * f) + (updateTimer(j) * f2);
    }

    public static final long peekRevision(long j, ParallelPartition f) {
        Intrinsics.checkNotNullParameter(f, "f");
        long evictLayout = f.evictLayout(flushSample(j), updateTimer(j));
        return NavBarMaker.growPayload(Float.intBitsToFloat((int) (evictLayout >> 32)), Float.intBitsToFloat((int) (evictLayout & 4294967295L)));
    }

    public static final long popBlueprint(long j, long j2) {
        return NavBarMaker.growPayload(flushSample(j) - flushSample(j2), updateTimer(j) - updateTimer(j2));
    }

    public static final long releaseHeader(long j) {
        float clipOrigin = clipOrigin(j);
        if (clipOrigin > 0.0f) {
            return growPayload(j, clipOrigin);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final float updateTimer(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
