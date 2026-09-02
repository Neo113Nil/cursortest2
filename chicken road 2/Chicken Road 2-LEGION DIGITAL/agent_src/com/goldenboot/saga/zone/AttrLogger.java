package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.CachedCreator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class AttrLogger {
    public static CachedCreator evictLayout;

    public static final CachedCreator evictLayout(SwipeBenchmark swipeBenchmark) {
        CachedCreator cachedCreator = evictLayout;
        if (cachedCreator != null) {
            Intrinsics.checkNotNull(cachedCreator);
            return cachedCreator;
        }
        CachedCreator.ActivityMutator activityMutator = new CachedCreator.ActivityMutator("Filled.ShoppingBag", InsetsEdge.drawField(24.0f), InsetsEdge.drawField(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int injectMetric = SlideBeacon.injectMetric();
        SolidColor solidColor = new SolidColor(ContainerSource.INSTANCE.evictLayout(), null);
        int evictLayout2 = ListMulticaster.INSTANCE.evictLayout();
        int evictLayout3 = RotateFacilitator.INSTANCE.evictLayout();
        IconWorkflow iconWorkflow = new IconWorkflow();
        iconWorkflow.drawField(18.0f, 6.0f);
        iconWorkflow.updateTimer(-2.0f);
        iconWorkflow.releaseHeader(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        iconWorkflow.reduceScope(8.0f, 3.79f, 8.0f, 6.0f);
        iconWorkflow.flushSample(6.0f);
        iconWorkflow.detachStream(4.9f, 6.0f, 4.0f, 6.9f, 4.0f, 8.0f);
        iconWorkflow.inflateAdapter(12.0f);
        iconWorkflow.releaseHeader(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        iconWorkflow.updateTimer(12.0f);
        iconWorkflow.releaseHeader(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        iconWorkflow.resetDelta(8.0f);
        iconWorkflow.detachStream(20.0f, 6.9f, 19.1f, 6.0f, 18.0f, 6.0f);
        iconWorkflow.injectMetric();
        iconWorkflow.drawField(10.0f, 10.0f);
        iconWorkflow.releaseHeader(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        iconWorkflow.notifyMessage(-1.0f, -0.45f, -1.0f, -1.0f);
        iconWorkflow.resetDelta(8.0f);
        iconWorkflow.updateTimer(2.0f);
        iconWorkflow.resetDelta(10.0f);
        iconWorkflow.injectMetric();
        iconWorkflow.drawField(12.0f, 4.0f);
        iconWorkflow.releaseHeader(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        iconWorkflow.updateTimer(-4.0f);
        iconWorkflow.detachStream(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        iconWorkflow.injectMetric();
        iconWorkflow.drawField(16.0f, 10.0f);
        iconWorkflow.releaseHeader(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        iconWorkflow.notifyMessage(-1.0f, -0.45f, -1.0f, -1.0f);
        iconWorkflow.resetDelta(8.0f);
        iconWorkflow.updateTimer(2.0f);
        iconWorkflow.resetDelta(10.0f);
        iconWorkflow.injectMetric();
        CachedCreator clipOrigin = CachedCreator.ActivityMutator.detachStream(activityMutator, iconWorkflow.clipOrigin(), injectMetric, "", solidColor, 1.0f, null, 1.0f, 1.0f, evictLayout2, evictLayout3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).clipOrigin();
        evictLayout = clipOrigin;
        Intrinsics.checkNotNull(clipOrigin);
        return clipOrigin;
    }
}
