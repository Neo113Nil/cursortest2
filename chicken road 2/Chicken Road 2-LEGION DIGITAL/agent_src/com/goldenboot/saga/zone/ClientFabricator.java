package com.goldenboot.saga.zone;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ClientFabricator implements Iterator, KMappedMarker {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(nextFloat());
    }

    public abstract float nextFloat();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Float next() {
        return Float.valueOf(nextFloat());
    }
}
