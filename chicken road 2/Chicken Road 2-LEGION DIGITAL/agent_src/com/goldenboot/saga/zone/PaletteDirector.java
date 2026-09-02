package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0015\u001a3\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/ContextStage;", "image", "Lcom/goldenboot/saga/zone/PulseCounter;", "evictLayout", "(Lcom/goldenboot/saga/zone/ContextStage;)Lcom/goldenboot/saga/zone/PulseCounter;", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "block", "flushSample", "(Lcom/goldenboot/saga/zone/PulseCounter;Lcom/goldenboot/saga/zone/ElevationNode;)V", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "bounds", "Lcom/goldenboot/saga/zone/ScopedProcess;", "paint", "updateTimer", "(Lcom/goldenboot/saga/zone/PulseCounter;Lcom/goldenboot/saga/zone/ChipSnapshot;Lcom/goldenboot/saga/zone/ScopedProcess;Lcom/goldenboot/saga/zone/ElevationNode;)V", "", "degrees", "pivotX", "pivotY", "growPayload", "(Lcom/goldenboot/saga/zone/PulseCounter;FFF)V", "radians", "injectMetric", "sx", "sy", "releaseHeader", "(Lcom/goldenboot/saga/zone/PulseCounter;FFFF)V", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaletteDirector {
    public static /* synthetic */ void clipOrigin(PulseCounter pulseCounter, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        releaseHeader(pulseCounter, f, f2, f3, f4);
    }

    public static /* synthetic */ void detachStream(PulseCounter pulseCounter, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        injectMetric(pulseCounter, f, f2, f3);
    }

    public static final PulseCounter evictLayout(ContextStage contextStage) {
        return EmitterHook.evictLayout(contextStage);
    }

    public static final void flushSample(PulseCounter pulseCounter, ElevationNode elevationNode) {
        try {
            pulseCounter.reduceScope();
            elevationNode.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            pulseCounter.queryModel();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void growPayload(PulseCounter pulseCounter, float f, float f2, float f3) {
        if (f == 0.0f) {
            return;
        }
        pulseCounter.detachStream(f2, f3);
        pulseCounter.applyTask(f);
        pulseCounter.detachStream(-f2, -f3);
    }

    public static final void injectMetric(PulseCounter pulseCounter, float f, float f2, float f3) {
        growPayload(pulseCounter, PrimaryCoordinator.evictLayout(f), f2, f3);
    }

    public static final void releaseHeader(PulseCounter pulseCounter, float f, float f2, float f3, float f4) {
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        pulseCounter.detachStream(f3, f4);
        pulseCounter.clipOrigin(f, f2);
        pulseCounter.detachStream(-f3, -f4);
    }

    public static final void updateTimer(PulseCounter pulseCounter, ChipSnapshot chipSnapshot, ScopedProcess scopedProcess, ElevationNode elevationNode) {
        try {
            pulseCounter.filterPayload(chipSnapshot, scopedProcess);
            elevationNode.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            pulseCounter.queryModel();
            InlineMarker.finallyEnd(1);
        }
    }
}
