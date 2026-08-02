package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a/\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000e\u001a'\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a'\u0010\f\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0007\u001a?\u0010\f\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0016"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "Landroidx/compose/foundation/gestures/Orientation;", "p0", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "p1", "Landroidx/compose/ui/geometry/Offset;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;)J", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)Z", "getHighSpeedVideoFpsRangesFor", "p2", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;Z)J", "(JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;)J", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;", "p3", "p4", "", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;J)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndirectPointerInputDragCycleDetectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return Camera2StreamConfigurationMap(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoFpsRanges(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return Camera2StreamConfigurationMap(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    private static final long Camera2StreamConfigurationMap(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        return (z || !indirectPointerInputChange.getIsConsumed()) ? androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(Camera2StreamConfigurationMap(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis), getHighSpeedVideoSizes(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis)) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Camera2StreamConfigurationMap(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.getPosition();
        }
        int m6761getXnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6761getXnZO2Niw)) {
            int m6762getYnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6762getYnZO2Niw)) {
                return indirectPointerInputChange.getPosition();
            }
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & 4294967295L));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
        }
        if (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    private static final long getHighSpeedVideoFpsRangesFor(long j, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return j;
        }
        int m6761getXnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6761getXnZO2Niw)) {
            int m6762getYnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6762getYnZO2Niw)) {
                return j;
            }
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoSizes(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.getPreviousPosition();
        }
        int m6761getXnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6761getXnZO2Niw)) {
            int m6762getYnZO2Niw = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.m6756equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.getGetHighSpeedVideoSizes(), m6762getYnZO2Niw)) {
                return indirectPointerInputChange.getPreviousPosition();
            }
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() & 4294967295L));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() >> 32));
        }
        if (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother indirectPointerInputEventSmoother, long j) {
        velocityTracker.m7330addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(getHighSpeedVideoFpsRangesFor(indirectPointerInputEventSmoother.m1488smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis), j));
    }
}
