package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class FeatureStreamer implements Iterator, KMappedMarker {
    public Object notifyMessage;
    public int reduceScope;

    public final boolean clipOrigin() {
        this.reduceScope = 3;
        injectMetric();
        return this.reduceScope == 1;
    }

    public final void detachStream() {
        this.reduceScope = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.reduceScope;
        if (i == 0) {
            return clipOrigin();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public abstract void injectMetric();

    @Override // java.util.Iterator
    public Object next() {
        int i = this.reduceScope;
        if (i == 1) {
            this.reduceScope = 0;
            return this.notifyMessage;
        }
        if (i == 2 || !clipOrigin()) {
            throw new NoSuchElementException();
        }
        this.reduceScope = 0;
        return this.notifyMessage;
    }

    public final void releaseHeader(Object obj) {
        this.notifyMessage = obj;
        this.reduceScope = 1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
