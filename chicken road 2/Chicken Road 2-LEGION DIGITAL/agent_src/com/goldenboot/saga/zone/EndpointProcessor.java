package com.goldenboot.saga.zone;

import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class EndpointProcessor {
    public static final ProxySteward evictLayout(List list, ConnectionFactory connectionFactory, List list2, int i, int i2, int i3) {
        int index = ((ProxySteward) CursorCollector.formatPosition(list)).getIndex();
        int size = list2.size();
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size && ((Number) list2.get(i6)).intValue() <= index) {
            i5 = ((Number) list2.get(i6)).intValue();
            i6++;
            i4 = ((Number) ((i6 < 0 || i6 > CursorBuilder.reduceScope(list2)) ? -1 : list2.get(i6))).intValue();
        }
        int size2 = list.size();
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < size2; i10++) {
            ProxySteward proxySteward = (ProxySteward) list.get(i10);
            if (proxySteward.getIndex() == i5) {
                i7 = proxySteward.getOffset();
                i9 = i10;
            } else if (proxySteward.getIndex() == i4) {
                i8 = proxySteward.getOffset();
            }
        }
        if (i5 == -1) {
            return null;
        }
        ProxySteward releaseHeader = ConnectionFactory.releaseHeader(connectionFactory, i5, 0L, 2, null);
        releaseHeader.injectMetric(true);
        int max = i7 != Integer.MIN_VALUE ? Math.max(-i, i7) : -i;
        if (i8 != Integer.MIN_VALUE) {
            max = Math.min(max, i8 - releaseHeader.evictLayout());
        }
        releaseHeader.attachConfig(max, i2, i3);
        if (i9 != -1) {
            list.set(i9, releaseHeader);
            return releaseHeader;
        }
        list.add(0, releaseHeader);
        return releaseHeader;
    }
}
