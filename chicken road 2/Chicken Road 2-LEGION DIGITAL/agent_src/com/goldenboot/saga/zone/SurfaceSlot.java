package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SurfaceSlot {
    public static final SurfaceSlot evictLayout = new SurfaceSlot();

    /* JADX WARN: Multi-variable type inference failed */
    public final InterpolatorSnapshot evictLayout(NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        ScrollCollection growPayload = AttrCheckpoint.growPayload(notificationFence, 0);
        boolean formatPosition = notificationFence.formatPosition(growPayload);
        Object clipOrigin = notificationFence.clipOrigin();
        if (formatPosition || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new GlowInstantiator(growPayload, null, 2, 0 == true ? 1 : 0);
            notificationFence.bindBody(clipOrigin);
        }
        GlowInstantiator glowInstantiator = (GlowInstantiator) clipOrigin;
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return glowInstantiator;
    }

    public final ProducerRollback growPayload(NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        ProducerRollback evictLayout2 = MenuAction.evictLayout(notificationFence, 0);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return evictLayout2;
    }

    public final boolean injectMetric(LabelCache labelCache, BounceSplitter bounceSplitter, boolean z) {
        return (labelCache != LabelCache.notifyMessage || bounceSplitter == BounceSplitter.Vertical) ? !z : z;
    }
}
