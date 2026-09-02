package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.CachedCreator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ImageMutator {
    public static CachedCreator evictLayout;

    public static final CachedCreator evictLayout(SwipeBenchmark swipeBenchmark) {
        CachedCreator cachedCreator = evictLayout;
        if (cachedCreator != null) {
            Intrinsics.checkNotNull(cachedCreator);
            return cachedCreator;
        }
        CachedCreator.ActivityMutator activityMutator = new CachedCreator.ActivityMutator("Filled.Undo", InsetsEdge.drawField(24.0f), InsetsEdge.drawField(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int injectMetric = SlideBeacon.injectMetric();
        SolidColor solidColor = new SolidColor(ContainerSource.INSTANCE.evictLayout(), null);
        int evictLayout2 = ListMulticaster.INSTANCE.evictLayout();
        int evictLayout3 = RotateFacilitator.INSTANCE.evictLayout();
        IconWorkflow iconWorkflow = new IconWorkflow();
        iconWorkflow.drawField(12.5f, 8.0f);
        iconWorkflow.releaseHeader(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
        iconWorkflow.applyTask(2.0f, 7.0f);
        iconWorkflow.inflateAdapter(9.0f);
        iconWorkflow.updateTimer(9.0f);
        iconWorkflow.popBlueprint(-3.62f, -3.62f);
        iconWorkflow.releaseHeader(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        iconWorkflow.releaseHeader(3.54f, 0.0f, 6.55f, 2.31f, 7.6f, 5.5f);
        iconWorkflow.popBlueprint(2.37f, -0.78f);
        iconWorkflow.detachStream(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f);
        iconWorkflow.injectMetric();
        CachedCreator clipOrigin = CachedCreator.ActivityMutator.detachStream(activityMutator, iconWorkflow.clipOrigin(), injectMetric, "", solidColor, 1.0f, null, 1.0f, 1.0f, evictLayout2, evictLayout3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).clipOrigin();
        evictLayout = clipOrigin;
        Intrinsics.checkNotNull(clipOrigin);
        return clipOrigin;
    }
}
