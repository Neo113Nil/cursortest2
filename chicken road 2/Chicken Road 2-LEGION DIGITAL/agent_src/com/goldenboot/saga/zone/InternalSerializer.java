package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "bits", "", "detachStream", "(I)F", "", "", "evictLayout", "(J)D", "injectMetric", "(F)I", "growPayload", "(D)I", "ui-util"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InternalSerializer {
    public static final float detachStream(int i) {
        return Float.intBitsToFloat(i);
    }

    public static final double evictLayout(long j) {
        return Double.longBitsToDouble(j);
    }

    public static final int growPayload(double d) {
        return (int) Math.round(d);
    }

    public static final int injectMetric(float f) {
        return Math.round(f);
    }
}
