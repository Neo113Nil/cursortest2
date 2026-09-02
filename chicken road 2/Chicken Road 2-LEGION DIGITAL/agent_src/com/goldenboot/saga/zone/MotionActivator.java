package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ChipSnapshot;
import com.goldenboot.saga.zone.FontReporter;
import com.goldenboot.saga.zone.InsetsEdge;
import com.goldenboot.saga.zone.RuntimeHeap;
import com.goldenboot.saga.zone.ScaleSaver;
import com.goldenboot.saga.zone.ShapeSender;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class MotionActivator {
    public static final ChipSnapshot evictLayout;
    public static final Map growPayload;

    static {
        Float valueOf = Float.valueOf(0.5f);
        evictLayout = new ChipSnapshot(0.5f, 0.5f, 0.5f, 0.5f);
        GestureInitializer popBlueprint = LocalProcessor.popBlueprint(IntCompanionObject.INSTANCE);
        Float valueOf2 = Float.valueOf(1.0f);
        AlarmFacilitator evictLayout2 = PagerValidator.evictLayout(popBlueprint, valueOf2);
        AlarmFacilitator evictLayout3 = PagerValidator.evictLayout(LocalProcessor.releaseHeader(ScaleSaver.INSTANCE), valueOf2);
        AlarmFacilitator evictLayout4 = PagerValidator.evictLayout(LocalProcessor.detachStream(FontReporter.INSTANCE), valueOf2);
        AlarmFacilitator evictLayout5 = PagerValidator.evictLayout(LocalProcessor.applyTask(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
        AlarmFacilitator evictLayout6 = PagerValidator.evictLayout(LocalProcessor.flushSample(ChipSnapshot.INSTANCE), valueOf);
        AlarmFacilitator evictLayout7 = PagerValidator.evictLayout(LocalProcessor.updateTimer(ShapeSender.INSTANCE), valueOf);
        AlarmFacilitator evictLayout8 = PagerValidator.evictLayout(LocalProcessor.clipOrigin(RuntimeHeap.INSTANCE), valueOf);
        GestureInitializer growPayload2 = LocalProcessor.growPayload(InsetsEdge.INSTANCE);
        Float valueOf3 = Float.valueOf(0.1f);
        growPayload = AttrConductor.drawField(evictLayout2, evictLayout3, evictLayout4, evictLayout5, evictLayout6, evictLayout7, evictLayout8, PagerValidator.evictLayout(growPayload2, valueOf3), PagerValidator.evictLayout(LocalProcessor.injectMetric(CorePump.INSTANCE), valueOf3));
    }

    public static final long clipOrigin(ShapeSender.Companion companion) {
        return FocusCounter.evictLayout(0.5f, 0.5f);
    }

    public static final long detachStream(ScaleSaver.Companion companion) {
        return ProgressPatch.evictLayout(1, 1);
    }

    public static final float evictLayout(InsetsEdge.Companion companion) {
        return InsetsEdge.drawField(0.1f);
    }

    public static final ChipSnapshot flushSample(ChipSnapshot.Companion companion) {
        return evictLayout;
    }

    public static final int growPayload(IntCompanionObject intCompanionObject) {
        return 1;
    }

    public static final long injectMetric(FontReporter.Companion companion) {
        return RegionListener.evictLayout(1, 1);
    }

    public static final long releaseHeader(RuntimeHeap.Companion companion) {
        return FadeDispatcher.evictLayout(0.5f, 0.5f);
    }

    public static final Map updateTimer() {
        return growPayload;
    }
}
