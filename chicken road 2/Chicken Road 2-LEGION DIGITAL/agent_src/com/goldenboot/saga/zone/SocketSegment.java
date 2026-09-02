package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.CachedCreator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SocketSegment {
    public static CachedCreator evictLayout;

    public static final CachedCreator evictLayout(SwipeBenchmark swipeBenchmark) {
        CachedCreator cachedCreator = evictLayout;
        if (cachedCreator != null) {
            Intrinsics.checkNotNull(cachedCreator);
            return cachedCreator;
        }
        CachedCreator.ActivityMutator activityMutator = new CachedCreator.ActivityMutator("Filled.CheckCircle", InsetsEdge.drawField(24.0f), InsetsEdge.drawField(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int injectMetric = SlideBeacon.injectMetric();
        SolidColor solidColor = new SolidColor(ContainerSource.INSTANCE.evictLayout(), null);
        int evictLayout2 = ListMulticaster.INSTANCE.evictLayout();
        int evictLayout3 = RotateFacilitator.INSTANCE.evictLayout();
        IconWorkflow iconWorkflow = new IconWorkflow();
        iconWorkflow.drawField(12.0f, 2.0f);
        iconWorkflow.detachStream(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        iconWorkflow.notifyMessage(4.48f, 10.0f, 10.0f, 10.0f);
        iconWorkflow.notifyMessage(10.0f, -4.48f, 10.0f, -10.0f);
        iconWorkflow.reduceScope(17.52f, 2.0f, 12.0f, 2.0f);
        iconWorkflow.injectMetric();
        iconWorkflow.drawField(10.0f, 17.0f);
        iconWorkflow.popBlueprint(-5.0f, -5.0f);
        iconWorkflow.popBlueprint(1.41f, -1.41f);
        iconWorkflow.applyTask(10.0f, 14.17f);
        iconWorkflow.popBlueprint(7.59f, -7.59f);
        iconWorkflow.applyTask(19.0f, 8.0f);
        iconWorkflow.popBlueprint(-9.0f, 9.0f);
        iconWorkflow.injectMetric();
        CachedCreator clipOrigin = CachedCreator.ActivityMutator.detachStream(activityMutator, iconWorkflow.clipOrigin(), injectMetric, "", solidColor, 1.0f, null, 1.0f, 1.0f, evictLayout2, evictLayout3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).clipOrigin();
        evictLayout = clipOrigin;
        Intrinsics.checkNotNull(clipOrigin);
        return clipOrigin;
    }
}
