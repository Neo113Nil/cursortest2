package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\t"}, d2 = {"Landroidx/compose/material3/BottomAppBarStateImpl;", "Landroidx/compose/material3/BottomAppBarState;", "", "p0", "p1", "p2", "<init>", "(FFF)V", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableFloatState;", "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "getHighResolutionOutputSizeshNQ4ISI", "getHeightOffset", "setHeightOffset", "getHighSpeedVideoFpsRanges", "getContentOffset", "setContentOffset", "getHighSpeedVideoSizes", "getCollapsedFraction", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableFloatState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomAppBarStateImpl implements androidx.compose.material3.BottomAppBarState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;

    public BottomAppBarStateImpl(float f, float f2, float f3) {
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffsetLimit() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffsetLimit(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(f);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffset() {
        return this.Camera2StreamConfigurationMap.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffset(float f) {
        this.Camera2StreamConfigurationMap.setFloatValue(kotlin.ranges.RangesKt.coerceIn(f, getHeightOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getContentOffset() {
        return this.getHighSpeedVideoSizes.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setContentOffset(float f) {
        this.getHighSpeedVideoSizes.setFloatValue(f);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }
}
