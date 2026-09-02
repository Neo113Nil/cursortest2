package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SequenceRecovery implements Iterator, KMutableIterator {
    public boolean connectPatch;
    public int notifyMessage;
    public int reduceScope;

    public SequenceRecovery(int i) {
        this.reduceScope = i;
    }

    public abstract void detachStream(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.notifyMessage < this.reduceScope;
    }

    public abstract Object injectMetric(int i);

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object injectMetric = injectMetric(this.notifyMessage);
        this.notifyMessage++;
        this.connectPatch = true;
        return injectMetric;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.connectPatch) {
            LifecycleCreator.growPayload("Call next() before removing an element.");
        }
        int i = this.notifyMessage - 1;
        this.notifyMessage = i;
        detachStream(i);
        this.reduceScope--;
        this.connectPatch = false;
    }
}
