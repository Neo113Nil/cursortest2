package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class SystemOperation {
    public static final DragBridge growPayload(CachedDeserializer cachedDeserializer) {
        if (!cachedDeserializer.getNode().getIsAttached()) {
            return null;
        }
        DragBridge dragBridge = (DragBridge) GlowToggle.evictLayout(cachedDeserializer, ProxyFactory.filterPayload);
        return dragBridge == null ? NotificationConstructor.growPayload(cachedDeserializer) : dragBridge;
    }

    public static final ChipSnapshot injectMetric(PagerReducer pagerReducer, PagerReducer pagerReducer2, ChipSnapshot chipSnapshot) {
        return chipSnapshot.startResource(pagerReducer.compressVersion(pagerReducer2, false).injectConstraint());
    }
}
