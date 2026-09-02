package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ProducerMaterializer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ResponseBootstrapper {
    public static /* synthetic */ PulseBootstrapper detachStream(DragInspector[] dragInspectorArr, PulseBootstrapper pulseBootstrapper, PulseBootstrapper pulseBootstrapper2, int i, Object obj) {
        if ((i & 4) != 0) {
            pulseBootstrapper2 = ConsumerProfiler.evictLayout();
        }
        return injectMetric(dragInspectorArr, pulseBootstrapper, pulseBootstrapper2);
    }

    public static final boolean evictLayout(PulseBootstrapper pulseBootstrapper, MotionDetector motionDetector) {
        Intrinsics.checkNotNull(motionDetector, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return pulseBootstrapper.containsKey(motionDetector);
    }

    public static final Object growPayload(PulseBootstrapper pulseBootstrapper, MotionDetector motionDetector) {
        Intrinsics.checkNotNull(motionDetector, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = pulseBootstrapper.get(motionDetector);
        if (obj == null) {
            obj = motionDetector.evictLayout();
        }
        return ((CanvasFence) obj).evictLayout(pulseBootstrapper);
    }

    public static final PulseBootstrapper injectMetric(DragInspector[] dragInspectorArr, PulseBootstrapper pulseBootstrapper, PulseBootstrapper pulseBootstrapper2) {
        ProducerMaterializer.ActivityMutator builder = ConsumerProfiler.evictLayout().builder();
        for (DragInspector dragInspector : dragInspectorArr) {
            MotionDetector growPayload = dragInspector.growPayload();
            Intrinsics.checkNotNull(growPayload, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            SelectionHub selectionHub = (SelectionHub) growPayload;
            if (dragInspector.evictLayout() || !evictLayout(pulseBootstrapper, selectionHub)) {
                CanvasFence canvasFence = (CanvasFence) pulseBootstrapper2.get(selectionHub);
                Intrinsics.checkNotNull(dragInspector, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                builder.put(selectionHub, selectionHub.growPayload(dragInspector, canvasFence));
            }
        }
        return builder.build();
    }
}
