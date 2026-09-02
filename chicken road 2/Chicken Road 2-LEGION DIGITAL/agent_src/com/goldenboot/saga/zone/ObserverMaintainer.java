package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0001\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "nativeKeyCode", "Lcom/goldenboot/saga/zone/RuntimeCreator;", "evictLayout", "(I)J", "growPayload", "(J)I", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObserverMaintainer {
    public static final long evictLayout(int i) {
        return RuntimeCreator.startBounds((i << 32) | (0 & 4294967295L));
    }

    public static final int growPayload(long j) {
        return (int) (j >> 32);
    }
}
