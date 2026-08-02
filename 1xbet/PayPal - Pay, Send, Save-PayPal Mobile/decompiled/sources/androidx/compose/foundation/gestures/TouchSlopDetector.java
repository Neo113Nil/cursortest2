package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\r\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\f\u0010\nJ%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Offset;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "crossAxis-k-4lQ0M", "crossAxis", "currentPosition", "previousPosition", "touchSlop", "addPositions-akrDWew", "(JJF)J", "addPositions", "initialPositionAccumulator", "", "reset-k-4lQ0M", "(J)V", "reset", "p0", "getHighSpeedVideoFpsRangesFor", "(F)J", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;
    private androidx.compose.foundation.gestures.Orientation orientation;

    private TouchSlopDetector(androidx.compose.foundation.gestures.Orientation orientation, long j) {
        this.orientation = orientation;
        this.Camera2StreamConfigurationMap = j;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    public final void setOrientation(androidx.compose.foundation.gestures.Orientation orientation) {
        this.orientation = orientation;
    }

    public /* synthetic */ TouchSlopDetector(androidx.compose.foundation.gestures.Orientation orientation, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j, null);
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m1545mainAxisk4lQ0M(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m1544crossAxisk4lQ0M(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    /* renamed from: addPositions-akrDWew, reason: not valid java name */
    public final long m1543addPositionsakrDWew(long currentPosition, long previousPosition, float touchSlop) {
        float abs;
        long m5757plusMKHz9U = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.Camera2StreamConfigurationMap, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(currentPosition, previousPosition));
        this.Camera2StreamConfigurationMap = m5757plusMKHz9U;
        if (this.orientation == null) {
            abs = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(m5757plusMKHz9U);
        } else {
            abs = java.lang.Math.abs(m1545mainAxisk4lQ0M(m5757plusMKHz9U));
        }
        if (abs >= touchSlop) {
            return getHighSpeedVideoFpsRangesFor(touchSlop);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    /* renamed from: reset-k-4lQ0M$default, reason: not valid java name */
    public static /* synthetic */ void m1542resetk4lQ0M$default(androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        touchSlopDetector.m1546resetk4lQ0M(j);
    }

    /* renamed from: reset-k-4lQ0M, reason: not valid java name */
    public final void m1546resetk4lQ0M(long initialPositionAccumulator) {
        this.Camera2StreamConfigurationMap = initialPositionAccumulator;
    }

    private final long getHighSpeedVideoFpsRangesFor(float p0) {
        if (this.orientation == null) {
            long j = this.Camera2StreamConfigurationMap;
            return androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(this.Camera2StreamConfigurationMap, androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(androidx.compose.ui.geometry.Offset.m5747divtuRUvjQ(j, androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(j)), p0));
        }
        float m1545mainAxisk4lQ0M = m1545mainAxisk4lQ0M(this.Camera2StreamConfigurationMap) - (java.lang.Math.signum(m1545mainAxisk4lQ0M(this.Camera2StreamConfigurationMap)) * p0);
        float m1544crossAxisk4lQ0M = m1544crossAxisk4lQ0M(this.Camera2StreamConfigurationMap);
        if (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m1545mainAxisk4lQ0M) << 32) | (java.lang.Float.floatToRawIntBits(m1544crossAxisk4lQ0M) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m1544crossAxisk4lQ0M) << 32) | (java.lang.Float.floatToRawIntBits(m1545mainAxisk4lQ0M) & 4294967295L));
    }

    public /* synthetic */ TouchSlopDetector(androidx.compose.foundation.gestures.Orientation orientation, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j);
    }
}
