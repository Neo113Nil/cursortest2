package com.goldenboot.saga.zone;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class PagerThread implements DrawerBroadcaster {
    public static final PagerThread evictLayout = new PagerThread();
    public static final ScaleMutator growPayload = ParallelStage.evictLayout("kotlin.ULong", TriggerMaker.findTask(LongCompanionObject.INSTANCE));

    @Override // com.goldenboot.saga.zone.DrawerBroadcaster, com.goldenboot.saga.zone.InterpolatorBeacon
    public ScaleMutator evictLayout() {
        return growPayload;
    }

    @Override // com.goldenboot.saga.zone.InterpolatorBeacon
    public /* bridge */ /* synthetic */ void injectMetric(RemoteEmitter remoteEmitter, Object obj) {
        TransitionMemento.evictLayout(obj);
        throw null;
    }
}
