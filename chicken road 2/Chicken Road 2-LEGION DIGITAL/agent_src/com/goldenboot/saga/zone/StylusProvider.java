package com.goldenboot.saga.zone;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class StylusProvider {
    public static final RowMutex evictLayout = new RowMutex("REMOVED_TASK");
    public static final RowMutex growPayload = new RowMutex("CLOSED_EMPTY");

    public static final long injectMetric(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : j * 1000000;
    }
}
