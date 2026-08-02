package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\u0014\u0010\u000e\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "sizeOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "offsetOnMainAxis", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            snapPosition = androidx.compose.foundation.gestures.snapping.SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPosition);
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo getHighSpeedVideoSizes() {
                return androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo();
            }

            private final int getHighSpeedVideoFpsRangesFor() {
                androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo highSpeedVideoSizes = getHighSpeedVideoSizes();
                int i = 0;
                if (highSpeedVideoSizes.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = highSpeedVideoSizes.getVisibleItemsInfo().size();
                java.util.Iterator<T> it = highSpeedVideoSizes.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    i += androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) it.next(), highSpeedVideoSizes.getOrientation());
                }
                return i / size;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateApproachOffset(float velocity, float decayOffset) {
                return kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.abs(decayOffset) - getHighSpeedVideoFpsRangesFor(), 0.0f) * java.lang.Math.signum(decayOffset);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateSnapOffset(float velocity) {
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = getHighSpeedVideoSizes().getVisibleItemsInfo();
                androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getHighSpeedVideoSizes()), getHighSpeedVideoSizes().getBeforeContentPadding(), getHighSpeedVideoSizes().getAfterContentPadding(), androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getHighSpeedVideoSizes().getOrientation()), androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getHighSpeedVideoSizes().getOrientation()), lazyGridItemInfo.getIndex(), snapPosition2, getHighSpeedVideoSizes().getTotalItemsCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                        f = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m1567calculateFinalOffsetFhqu1e0(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(androidx.compose.foundation.lazy.grid.LazyGridState.this.getDensity$foundation(), velocity), f, f2);
            }
        };
    }

    public static final androidx.compose.foundation.gestures.FlingBehavior rememberSnapFlingBehavior(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            snapPosition = androidx.compose.foundation.gestures.snapping.SnapPosition.Center.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-234434234, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:114)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider(lazyGridState, snapPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior rememberSnapFlingBehavior = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.rememberSnapFlingBehavior((androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        long mo1826getViewportSizeYbymL2g;
        if (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            mo1826getViewportSizeYbymL2g = lazyGridLayoutInfo.mo1826getViewportSizeYbymL2g() & 4294967295L;
        } else {
            mo1826getViewportSizeYbymL2g = lazyGridLayoutInfo.mo1826getViewportSizeYbymL2g() >> 32;
        }
        return (int) mo1826getViewportSizeYbymL2g;
    }

    public static final int sizeOnMainAxis(androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo, androidx.compose.foundation.gestures.Orientation orientation) {
        long size;
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            size = lazyGridItemInfo.getSize() & 4294967295L;
        } else {
            size = lazyGridItemInfo.getSize() >> 32;
        }
        return (int) size;
    }

    public static final int offsetOnMainAxis(androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.IntOffset.m8730getYimpl(lazyGridItemInfo.getOffset());
        }
        return androidx.compose.ui.unit.IntOffset.m8729getXimpl(lazyGridItemInfo.getOffset());
    }
}
