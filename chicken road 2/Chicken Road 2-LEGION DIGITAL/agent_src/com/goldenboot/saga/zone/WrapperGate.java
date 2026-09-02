package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class WrapperGate {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements CompatCache {
        public final /* synthetic */ ViewGroup evictLayout;

        public ActivityMutator(ViewGroup viewGroup) {
            this.evictLayout = viewGroup;
        }

        @Override // com.goldenboot.saga.zone.CompatCache
        public Iterator iterator() {
            return WrapperGate.growPayload(this.evictLayout);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements Iterator, KMutableIterator {
        public final /* synthetic */ ViewGroup notifyMessage;
        public int reduceScope;

        public BounceHandler(ViewGroup viewGroup) {
            this.notifyMessage = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.reduceScope < this.notifyMessage.getChildCount();
        }

        @Override // java.util.Iterator
        /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.notifyMessage;
            int i = this.reduceScope;
            this.reduceScope = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.notifyMessage;
            int i = this.reduceScope - 1;
            this.reduceScope = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final CompatCache evictLayout(ViewGroup viewGroup) {
        return new ActivityMutator(viewGroup);
    }

    public static final Iterator growPayload(ViewGroup viewGroup) {
        return new BounceHandler(viewGroup);
    }
}
