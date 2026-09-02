package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ElevationTree {
    static /* synthetic */ void injectMetric(ElevationTree elevationTree, Object obj, Object obj2, ConfigListener configListener, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        elevationTree.evictLayout(obj, obj2, configListener);
    }

    void evictLayout(Object obj, Object obj2, ConfigListener configListener);

    void growPayload(int i, TouchRecord touchRecord, TouchRecord touchRecord2, BoxSteward boxSteward);
}
