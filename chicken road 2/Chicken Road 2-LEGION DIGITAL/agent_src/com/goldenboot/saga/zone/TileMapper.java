package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class TileMapper implements FragmentArray {
    public CompatUpgrade detachStream;
    public final IconExporter evictLayout;
    public long growPayload = SubscriberCache.growPayload(0, 0, 0, 0, 15, null);
    public float injectMetric;

    public TileMapper(IconExporter iconExporter) {
        this.evictLayout = iconExporter;
    }

    @Override // com.goldenboot.saga.zone.FragmentArray
    public CompatUpgrade evictLayout(BackgroundCollection backgroundCollection, long j) {
        if (this.detachStream != null && PagerPlanner.flushSample(this.growPayload, j) && this.injectMetric == backgroundCollection.getDensity()) {
            CompatUpgrade compatUpgrade = this.detachStream;
            Intrinsics.checkNotNull(compatUpgrade);
            return compatUpgrade;
        }
        this.growPayload = j;
        this.injectMetric = backgroundCollection.getDensity();
        CompatUpgrade compatUpgrade2 = (CompatUpgrade) this.evictLayout.invoke(backgroundCollection, PagerPlanner.evictLayout(j));
        this.detachStream = compatUpgrade2;
        return compatUpgrade2;
    }
}
