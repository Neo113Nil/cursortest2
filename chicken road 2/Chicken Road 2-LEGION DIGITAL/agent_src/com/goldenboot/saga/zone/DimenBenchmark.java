package com.goldenboot.saga.zone;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class DimenBenchmark implements Iterator, KMappedMarker {
    public int connectPatch;
    public final Map notifyMessage;
    public Object reduceScope;

    public DimenBenchmark(Object obj, Map map) {
        this.reduceScope = obj;
        this.notifyMessage = map;
    }

    private final void injectMetric() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.connectPatch < this.notifyMessage.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        injectMetric();
        Object obj = this.reduceScope;
        this.connectPatch++;
        Object obj2 = this.notifyMessage.get(obj);
        if (obj2 != null) {
            this.reduceScope = ((TouchScheduler) obj2).injectMetric();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
