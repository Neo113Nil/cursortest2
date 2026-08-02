package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "", "<init>", "()V", "", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "", "getHighSpeedVideoFpsRanges", "(JJ)V", "Landroidx/compose/ui/unit/Velocity;", "getHighResolutionOutputSizeshNQ4ISI", "()J", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MouseWheelVelocityTracker {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D getHighSpeedVideoFpsRanges = new androidx.compose.ui.input.pointer.util.VelocityTracker1D(true);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.input.pointer.util.VelocityTracker1D(true);

    public final void getHighSpeedVideoFpsRanges(long p0, long p1) {
        this.getHighSpeedVideoFpsRanges.addDataPoint(p0, java.lang.Float.intBitsToFloat((int) (p1 >> 32)));
        this.getHighSpeedVideoFpsRangesFor.addDataPoint(p0, java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)));
    }

    public final long getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.ui.unit.VelocityKt.Velocity(this.getHighSpeedVideoFpsRanges.calculateVelocity(Float.MAX_VALUE), this.getHighSpeedVideoFpsRangesFor.calculateVelocity(Float.MAX_VALUE));
    }
}
