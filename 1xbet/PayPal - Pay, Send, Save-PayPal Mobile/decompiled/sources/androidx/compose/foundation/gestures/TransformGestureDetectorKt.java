package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aX\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000128\u0010\b\u001a4\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0006*\u00020\u000b¢\u0006\u0004\b\u0010\u0010\r\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0004*\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "", "", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "getHighSpeedVideoFpsRanges", "(J)F", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformGestureDetectorKt {
    public static /* synthetic */ java.lang.Object detectTransformGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.jvm.functions.Function4 function4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, function4, continuation);
    }

    public static final java.lang.Object detectTransformGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.jvm.functions.Function4<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> function4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2(z, function4, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    public static final float calculateRotation(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange2.getPreviousPosition(), calculateCentroid2);
                long m5756minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(position, calculateCentroid);
                float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(m5756minusMKHz9U2) - getHighSpeedVideoFpsRanges(m5756minusMKHz9U);
                float m5750getDistanceimpl = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5756minusMKHz9U2, m5756minusMKHz9U)) / 2.0f;
                if (highSpeedVideoFpsRanges > 180.0f) {
                    highSpeedVideoFpsRanges -= 360.0f;
                } else if (highSpeedVideoFpsRanges < -180.0f) {
                    highSpeedVideoFpsRanges += 360.0f;
                }
                f2 += highSpeedVideoFpsRanges * m5750getDistanceimpl;
                f += m5750getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    public static final float calculateZoom(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final long calculatePan(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(calculateCentroid, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static /* synthetic */ float calculateCentroidSize$default(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final float calculateCentroidSize(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z) {
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f = 0.0f;
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(calculateCentroid, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                f += androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), calculateCentroid));
                i++;
            }
        }
        return f / i;
    }

    public static /* synthetic */ long calculateCentroid$default(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final long calculateCentroid(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z) {
        long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5768getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        if (i == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m5747divtuRUvjQ(m5768getZeroF1C5BW0, i);
    }

    private static final float getHighSpeedVideoFpsRanges(long j) {
        if (java.lang.Float.intBitsToFloat((int) (j >> 32)) == 0.0f && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) java.lang.Math.atan2(java.lang.Float.intBitsToFloat(r0), java.lang.Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }
}
