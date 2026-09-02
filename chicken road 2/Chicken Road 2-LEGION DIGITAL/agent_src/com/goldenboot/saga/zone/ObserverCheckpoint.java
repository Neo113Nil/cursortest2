package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ObserverCheckpoint extends MenuHub {
    public final String injectMetric;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserverCheckpoint(ScaleMutator primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.injectMetric = primitive.evictLayout() + "Array";
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public String evictLayout() {
        return this.injectMetric;
    }
}
