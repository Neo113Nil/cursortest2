package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BannerHandler extends SwipeConstructor implements Iterator, KMutableIterator {
    public BannerHandler(LayoutRegulator layoutRegulator, Iterator it) {
        super(layoutRegulator, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry popBlueprint = popBlueprint();
        if (popBlueprint == null) {
            throw new IllegalStateException();
        }
        releaseHeader();
        return popBlueprint.getValue();
    }
}
