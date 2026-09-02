package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class DialogStack {
    public static final int detachStream(int i) {
        return (i - 1) & (-32);
    }

    public static final int evictLayout(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final DragHub growPayload() {
        return PressReporter.connectPatch.evictLayout();
    }

    public static final Object[] injectMetric(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }
}
