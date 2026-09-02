package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PulseMolder implements Iterator, KMutableIterator {
    public final SnackbarSpawner reduceScope;

    public PulseMolder(PaddingGraph paddingGraph) {
        SwipeMemento[] swipeMementoArr = new SwipeMemento[8];
        for (int i = 0; i < 8; i++) {
            swipeMementoArr[i] = new ServerPlanner(this);
        }
        this.reduceScope = new SnackbarSpawner(paddingGraph, swipeMementoArr);
    }

    public final void detachStream(Object obj, Object obj2) {
        this.reduceScope.inflateAdapter(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.reduceScope.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.reduceScope.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.reduceScope.remove();
    }
}
