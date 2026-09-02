package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class PlatformLoader {
    public int detachStream;
    public final LongPressGateway evictLayout;
    public final Object[] growPayload;
    public final CellBroadcaster[] injectMetric;

    public PlatformLoader(LongPressGateway longPressGateway, int i) {
        this.evictLayout = longPressGateway;
        this.growPayload = new Object[i];
        this.injectMetric = new CellBroadcaster[i];
    }

    public final void evictLayout(CellBroadcaster cellBroadcaster, Object obj) {
        Object[] objArr = this.growPayload;
        int i = this.detachStream;
        objArr[i] = obj;
        CellBroadcaster[] cellBroadcasterArr = this.injectMetric;
        this.detachStream = i + 1;
        Intrinsics.checkNotNull(cellBroadcaster, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        cellBroadcasterArr[i] = cellBroadcaster;
    }

    public final void growPayload(LongPressGateway longPressGateway) {
        int length = this.injectMetric.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            CellBroadcaster cellBroadcaster = this.injectMetric[length];
            Intrinsics.checkNotNull(cellBroadcaster);
            cellBroadcaster.mapJob(longPressGateway, this.growPayload[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
