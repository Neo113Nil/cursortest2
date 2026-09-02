package com.goldenboot.saga.zone;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class AbstractEmitter implements Iterable, KMappedMarker {
    public final ElevationNode reduceScope;

    public AbstractEmitter(ElevationNode iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.reduceScope = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new WidgetOrchestrator((Iterator) this.reduceScope.invoke());
    }
}
