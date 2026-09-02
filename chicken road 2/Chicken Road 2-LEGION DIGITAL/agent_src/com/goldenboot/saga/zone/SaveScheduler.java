package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.CachedCreator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SaveScheduler {
    public static CachedCreator evictLayout;

    public static final CachedCreator evictLayout(SwipeBenchmark swipeBenchmark) {
        CachedCreator cachedCreator = evictLayout;
        if (cachedCreator != null) {
            Intrinsics.checkNotNull(cachedCreator);
            return cachedCreator;
        }
        CachedCreator.ActivityMutator activityMutator = new CachedCreator.ActivityMutator("Filled.ArrowBack", InsetsEdge.drawField(24.0f), InsetsEdge.drawField(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int injectMetric = SlideBeacon.injectMetric();
        SolidColor solidColor = new SolidColor(ContainerSource.INSTANCE.evictLayout(), null);
        int evictLayout2 = ListMulticaster.INSTANCE.evictLayout();
        int evictLayout3 = RotateFacilitator.INSTANCE.evictLayout();
        IconWorkflow iconWorkflow = new IconWorkflow();
        iconWorkflow.drawField(20.0f, 11.0f);
        iconWorkflow.flushSample(7.83f);
        iconWorkflow.popBlueprint(5.59f, -5.59f);
        iconWorkflow.applyTask(12.0f, 4.0f);
        iconWorkflow.popBlueprint(-8.0f, 8.0f);
        iconWorkflow.popBlueprint(8.0f, 8.0f);
        iconWorkflow.popBlueprint(1.41f, -1.41f);
        iconWorkflow.applyTask(7.83f, 13.0f);
        iconWorkflow.flushSample(20.0f);
        iconWorkflow.inflateAdapter(-2.0f);
        iconWorkflow.injectMetric();
        CachedCreator clipOrigin = CachedCreator.ActivityMutator.detachStream(activityMutator, iconWorkflow.clipOrigin(), injectMetric, "", solidColor, 1.0f, null, 1.0f, 1.0f, evictLayout2, evictLayout3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).clipOrigin();
        evictLayout = clipOrigin;
        Intrinsics.checkNotNull(clipOrigin);
        return clipOrigin;
    }
}
