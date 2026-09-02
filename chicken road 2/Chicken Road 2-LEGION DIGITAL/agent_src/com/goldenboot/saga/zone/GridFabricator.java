package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class GridFabricator implements TapRepository {
    public final TapRepository evictLayout;
    public final TapRepository growPayload;

    public GridFabricator(TapRepository tapRepository, TapRepository tapRepository2) {
        this.evictLayout = tapRepository;
        this.growPayload = tapRepository2;
    }

    @Override // com.goldenboot.saga.zone.TapRepository
    public int detachStream(BackgroundCollection backgroundCollection) {
        return Math.max(this.evictLayout.detachStream(backgroundCollection), this.growPayload.detachStream(backgroundCollection));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridFabricator)) {
            return false;
        }
        GridFabricator gridFabricator = (GridFabricator) obj;
        return Intrinsics.areEqual(gridFabricator.evictLayout, this.evictLayout) && Intrinsics.areEqual(gridFabricator.growPayload, this.growPayload);
    }

    @Override // com.goldenboot.saga.zone.TapRepository
    public int evictLayout(BackgroundCollection backgroundCollection) {
        return Math.max(this.evictLayout.evictLayout(backgroundCollection), this.growPayload.evictLayout(backgroundCollection));
    }

    @Override // com.goldenboot.saga.zone.TapRepository
    public int growPayload(BackgroundCollection backgroundCollection, LabelCache labelCache) {
        return Math.max(this.evictLayout.growPayload(backgroundCollection, labelCache), this.growPayload.growPayload(backgroundCollection, labelCache));
    }

    public int hashCode() {
        return this.evictLayout.hashCode() + (this.growPayload.hashCode() * 31);
    }

    @Override // com.goldenboot.saga.zone.TapRepository
    public int injectMetric(BackgroundCollection backgroundCollection, LabelCache labelCache) {
        return Math.max(this.evictLayout.injectMetric(backgroundCollection, labelCache), this.growPayload.injectMetric(backgroundCollection, labelCache));
    }

    public String toString() {
        return '(' + this.evictLayout + " ∪ " + this.growPayload + ')';
    }
}
