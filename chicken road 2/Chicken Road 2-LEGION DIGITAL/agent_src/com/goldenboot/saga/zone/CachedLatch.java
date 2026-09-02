package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class CachedLatch {
    public static final Object evictLayout(CursorKeeper cursorKeeper, ServiceRegulator serviceRegulator) {
        Object collect = cursorKeeper.collect(StackMap.reduceScope, serviceRegulator);
        return collect == RotateReceiver.releaseHeader() ? collect : DpadBuilder.evictLayout;
    }

    public static final Object growPayload(CursorKeeper cursorKeeper, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        CursorKeeper growPayload;
        growPayload = GlowMulticaster.growPayload(RailParser.resetDelta(cursorKeeper, iconExporter), 0, null, 2, null);
        Object clipOrigin = RailParser.clipOrigin(growPayload, serviceRegulator);
        return clipOrigin == RotateReceiver.releaseHeader() ? clipOrigin : DpadBuilder.evictLayout;
    }

    public static final Object injectMetric(TriggerModerator triggerModerator, CursorKeeper cursorKeeper, ServiceRegulator serviceRegulator) {
        RailParser.serializeOffset(triggerModerator);
        Object collect = cursorKeeper.collect(triggerModerator, serviceRegulator);
        return collect == RotateReceiver.releaseHeader() ? collect : DpadBuilder.evictLayout;
    }
}
