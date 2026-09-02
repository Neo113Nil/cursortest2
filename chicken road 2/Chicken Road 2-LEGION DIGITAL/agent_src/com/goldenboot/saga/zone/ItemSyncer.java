package com.goldenboot.saga.zone;

import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ItemSyncer extends BridgeBuffer {
    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public void applyTask(AbstractBucket abstractBucket, Object obj, StyleTable styleTable, InsetsBuilder insetsBuilder) {
        TransitionMemento.evictLayout(obj);
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public void clipOrigin(Object obj) {
        injectMetric(obj).reduceScope();
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public InsetsBuilder detachStream(Object obj) {
        TransitionMemento.evictLayout(obj);
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public int evictLayout(Map.Entry entry) {
        TransitionMemento.evictLayout(entry.getKey());
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public Object flushSample(Object obj, TouchFactory touchFactory, Object obj2, StyleTable styleTable, InsetsBuilder insetsBuilder, Object obj3, BreadcrumbValve breadcrumbValve) {
        TransitionMemento.evictLayout(obj2);
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public Object growPayload(StyleTable styleTable, GlowFormatter glowFormatter, int i) {
        styleTable.evictLayout(glowFormatter, i);
        return null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public InsetsBuilder injectMetric(Object obj) {
        TransitionMemento.evictLayout(obj);
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public void popBlueprint(ReceiverSaver receiverSaver, Map.Entry entry) {
        TransitionMemento.evictLayout(entry.getKey());
        throw null;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public boolean releaseHeader(GlowFormatter glowFormatter) {
        return false;
    }

    @Override // com.goldenboot.saga.zone.BridgeBuffer
    public void updateTimer(TouchFactory touchFactory, Object obj, StyleTable styleTable, InsetsBuilder insetsBuilder) {
        TransitionMemento.evictLayout(obj);
        throw null;
    }
}
