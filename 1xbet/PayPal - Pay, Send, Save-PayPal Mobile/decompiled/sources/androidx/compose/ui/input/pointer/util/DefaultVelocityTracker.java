package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\"\u0010 \u001a\u00020\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%"}, d2 = {"Landroidx/compose/ui/input/pointer/util/DefaultVelocityTracker;", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "calculateVelocity", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "offset", "addPointerInputChange-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "addPointerInputChange", "resetTracking", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "currentPointerPositionAccumulator", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui", "(J)V", "lastMoveEventTimeStamp", "getLastMoveEventTimeStamp$ui", "setLastMoveEventTimeStamp$ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultVelocityTracker implements androidx.compose.ui.input.pointer.util.PlatformVelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D getHighSpeedVideoSizes;
    private long lastMoveEventTimeStamp;

    public DefaultVelocityTracker() {
        androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy strategy = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2;
        this.getHighSpeedVideoFpsRanges = strategy;
        boolean z = false;
        int i = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.getHighSpeedVideoSizes = new androidx.compose.ui.input.pointer.util.VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.input.pointer.util.VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui, reason: not valid java name and from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui, reason: not valid java name */
    public final void m7324setCurrentPointerPositionAccumulatork4lQ0M$ui(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    /* renamed from: getLastMoveEventTimeStamp$ui, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void setLastMoveEventTimeStamp$ui(long j) {
        this.lastMoveEventTimeStamp = j;
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void mo7321addPositionUv8p0NA(long timeMillis, long position) {
        this.getHighSpeedVideoSizes.addDataPoint(timeMillis, java.lang.Float.intBitsToFloat((int) (position >> 32)));
        this.getHighSpeedVideoFpsRangesFor.addDataPoint(timeMillis, java.lang.Float.intBitsToFloat((int) (position & 4294967295L)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long mo7322calculateVelocityAH228Gc(long maximumVelocity) {
        if (androidx.compose.ui.unit.Velocity.m8839getXimpl(maximumVelocity) <= 0.0f || androidx.compose.ui.unit.Velocity.m8840getYimpl(maximumVelocity) <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("maximumVelocity should be a positive value. You specified=");
            sb.append((java.lang.Object) androidx.compose.ui.unit.Velocity.m8846toStringimpl(maximumVelocity));
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return androidx.compose.ui.unit.VelocityKt.Velocity(this.getHighSpeedVideoSizes.calculateVelocity(androidx.compose.ui.unit.Velocity.m8839getXimpl(maximumVelocity)), this.getHighSpeedVideoFpsRangesFor.calculateVelocity(androidx.compose.ui.unit.Velocity.m8840getYimpl(maximumVelocity)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPointerInputChange-Uv8p0NA, reason: not valid java name */
    public final void mo7320addPointerInputChangeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange event, long offset) {
        int i = 0;
        if (androidx.compose.ui.input.pointer.util.VelocityTrackerKt.getVelocityTrackerAddPointsFix()) {
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(event)) {
                resetTracking();
            }
            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(event)) {
                java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical = event.getHistorical();
                int size = historical.size();
                while (i < size) {
                    androidx.compose.ui.input.pointer.HistoricalChange historicalChange = historical.get(i);
                    mo7321addPositionUv8p0NA(historicalChange.getUptimeMillis(), androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(historicalChange.getOriginalEventPosition(), offset));
                    i++;
                }
                mo7321addPositionUv8p0NA(event.getUptimeMillis(), androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(event.getOriginalEventPosition(), offset));
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(event) && event.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
                resetTracking();
            }
            this.lastMoveEventTimeStamp = event.getUptimeMillis();
            return;
        }
        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(event)) {
            this.currentPointerPositionAccumulator = event.getPosition();
            resetTracking();
        }
        long previousPosition = event.getPreviousPosition();
        java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical2 = event.getHistorical();
        int size2 = historical2.size();
        while (i < size2) {
            androidx.compose.ui.input.pointer.HistoricalChange historicalChange2 = historical2.get(i);
            long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(historicalChange2.getPosition(), previousPosition);
            long position = historicalChange2.getPosition();
            this.currentPointerPositionAccumulator = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.currentPointerPositionAccumulator, m5756minusMKHz9U);
            mo7321addPositionUv8p0NA(historicalChange2.getUptimeMillis(), androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.currentPointerPositionAccumulator, offset));
            i++;
            previousPosition = position;
        }
        this.currentPointerPositionAccumulator = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.currentPointerPositionAccumulator, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(event.getPosition(), previousPosition));
        mo7321addPositionUv8p0NA(event.getUptimeMillis(), androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.currentPointerPositionAccumulator, offset));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public final void resetTracking() {
        this.getHighSpeedVideoSizes.resetTracking();
        this.getHighSpeedVideoFpsRangesFor.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }
}
