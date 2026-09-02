package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class SingletonAnnouncer implements CompatCache {
    public final CompatCache evictLayout;
    public final TouchRecord growPayload;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements Iterator, KMappedMarker {
        public Object connectPatch;
        public int notifyMessage = -1;
        public final Iterator reduceScope;

        public ActivityMutator() {
            this.reduceScope = SingletonAnnouncer.this.evictLayout.iterator();
        }

        private final void injectMetric() {
            if (this.reduceScope.hasNext()) {
                Object next = this.reduceScope.next();
                if (((Boolean) SingletonAnnouncer.this.growPayload.invoke(next)).booleanValue()) {
                    this.notifyMessage = 1;
                    this.connectPatch = next;
                    return;
                }
            }
            this.notifyMessage = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.notifyMessage == -1) {
                injectMetric();
            }
            return this.notifyMessage == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.notifyMessage == -1) {
                injectMetric();
            }
            if (this.notifyMessage == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.connectPatch;
            this.connectPatch = null;
            this.notifyMessage = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SingletonAnnouncer(CompatCache sequence, TouchRecord predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.evictLayout = sequence;
        this.growPayload = predicate;
    }

    @Override // com.goldenboot.saga.zone.CompatCache
    public Iterator iterator() {
        return new ActivityMutator();
    }
}
