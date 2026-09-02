package com.goldenboot.saga.zone;

import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BridgeBuffer {
    public abstract void applyTask(AbstractBucket abstractBucket, Object obj, StyleTable styleTable, InsetsBuilder insetsBuilder);

    public abstract void clipOrigin(Object obj);

    public abstract InsetsBuilder detachStream(Object obj);

    public abstract int evictLayout(Map.Entry entry);

    public abstract Object flushSample(Object obj, TouchFactory touchFactory, Object obj2, StyleTable styleTable, InsetsBuilder insetsBuilder, Object obj3, BreadcrumbValve breadcrumbValve);

    public abstract Object growPayload(StyleTable styleTable, GlowFormatter glowFormatter, int i);

    public abstract InsetsBuilder injectMetric(Object obj);

    public abstract void popBlueprint(ReceiverSaver receiverSaver, Map.Entry entry);

    public abstract boolean releaseHeader(GlowFormatter glowFormatter);

    public abstract void updateTimer(TouchFactory touchFactory, Object obj, StyleTable styleTable, InsetsBuilder insetsBuilder);
}
