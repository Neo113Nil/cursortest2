package androidx.compose.foundation.gestures;

/* compiled from: TransformGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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
                long m1875minusMKHz9U = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPreviousPosition(), calculateCentroid2);
                long m1875minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(position, calculateCentroid);
                float m421anglek4lQ0M = m421anglek4lQ0M(m1875minusMKHz9U2) - m421anglek4lQ0M(m1875minusMKHz9U);
                float m1869getDistanceimpl = androidx.compose.ui.geometry.Offset.m1869getDistanceimpl(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m1875minusMKHz9U2, m1875minusMKHz9U)) / 2.0f;
                if (m421anglek4lQ0M > 180.0f) {
                    m421anglek4lQ0M -= 360.0f;
                } else if (m421anglek4lQ0M < -180.0f) {
                    m421anglek4lQ0M += 360.0f;
                }
                f2 += m421anglek4lQ0M * m1869getDistanceimpl;
                f += m1869getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m421anglek4lQ0M(long j) {
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(j) == 0.0f && androidx.compose.ui.geometry.Offset.m1872getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) java.lang.Math.atan2(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j)))) * 180.0f) / 3.1415927f;
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
        if (androidx.compose.ui.geometry.Offset.m1868equalsimpl0(calculateCentroid, androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
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
        if (androidx.compose.ui.geometry.Offset.m1868equalsimpl0(calculateCentroid, androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                f += androidx.compose.ui.geometry.Offset.m1869getDistanceimpl(androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), calculateCentroid));
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
        long m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m1887getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        if (i == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m1866divtuRUvjQ(m1887getZeroF1C5BW0, i);
    }
}
