package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SharedSerializer implements BaseBucket {
    public static final SharedSerializer reduceScope = new SharedSerializer();

    @Override // com.goldenboot.saga.zone.BaseBucket
    public void evictLayout(PublisherSegment publisherSegment) {
        publisherSegment.compressPrefs();
    }
}
