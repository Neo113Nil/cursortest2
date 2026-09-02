package com.goldenboot.saga.zone;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ProxyRollback extends WidgetUtil implements Set, Serializable, KMutableSet {
    public final StartupGateway reduceScope;
    public static final ActivityMutator notifyMessage = new ActivityMutator(null);
    public static final ProxyRollback connectPatch = new ProxyRollback(StartupGateway.mergeLocale.releaseHeader());

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    public ProxyRollback(StartupGateway backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.reduceScope = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.reduceScope.resetDelta(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.reduceScope.gatherAdapter();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.reduceScope.clear();
    }

    public final Set clipOrigin() {
        this.reduceScope.drawRequest();
        return size() > 0 ? this : connectPatch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.reduceScope.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.reduceScope.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.reduceScope.parseAsset();
    }

    @Override // com.goldenboot.saga.zone.WidgetUtil
    public int releaseHeader() {
        return this.reduceScope.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.reduceScope.groupArchive(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.reduceScope.gatherAdapter();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.reduceScope.gatherAdapter();
        return super.retainAll(elements);
    }

    public ProxyRollback(int i) {
        this(new StartupGateway(i));
    }
}
