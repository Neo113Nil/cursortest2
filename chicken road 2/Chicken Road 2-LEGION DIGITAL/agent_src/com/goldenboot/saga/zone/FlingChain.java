package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class FlingChain {
    public static final boolean detachStream(long j, long j2) {
        return j == j2;
    }

    public static long evictLayout(int i, int i2) {
        return growPayload(i * i2);
    }

    public static /* synthetic */ long injectMetric(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = PointerArranger.evictLayout.evictLayout();
        }
        return evictLayout(i, i2);
    }

    public static int releaseHeader(long j) {
        return Long.hashCode(j);
    }

    public static long growPayload(long j) {
        return j;
    }
}
