package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider$default(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            snapPosition = androidx.compose.foundation.gestures.snapping.SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, snapPosition);
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.lazy.LazyListState lazyListState, final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final androidx.compose.foundation.lazy.LazyListLayoutInfo getHighSpeedVideoFpsRanges() {
                return androidx.compose.foundation.lazy.LazyListState.this.getLayoutInfo();
            }

            private final int Camera2StreamConfigurationMap() {
                androidx.compose.foundation.lazy.LazyListLayoutInfo highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                int i = 0;
                if (highSpeedVideoFpsRanges.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = highSpeedVideoFpsRanges.getVisibleItemsInfo().size();
                java.util.Iterator<T> it = highSpeedVideoFpsRanges.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    i += ((androidx.compose.foundation.lazy.LazyListItemInfo) it.next()).getSize();
                }
                return i / size;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateApproachOffset(float velocity, float decayOffset) {
                return kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.abs(decayOffset) - Camera2StreamConfigurationMap(), 0.0f) * java.lang.Math.signum(decayOffset);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateSnapOffset(float velocity) {
                java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = getHighSpeedVideoFpsRanges().getVisibleItemsInfo();
                androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i);
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem ? (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) lazyListItemInfo : null;
                    if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.getNonScrollableItem()) {
                        float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getHighSpeedVideoFpsRanges()), getHighSpeedVideoFpsRanges().getBeforeContentPadding(), getHighSpeedVideoFpsRanges().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, getHighSpeedVideoFpsRanges().getTotalItemsCount());
                        if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                            f = calculateDistanceToDesiredSnapPosition;
                        }
                        if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                            f2 = calculateDistanceToDesiredSnapPosition;
                        }
                    }
                }
                return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m1567calculateFinalOffsetFhqu1e0(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(androidx.compose.foundation.lazy.LazyListState.this.getDensity$foundation(), velocity), f, f2);
            }
        };
    }

    public static final androidx.compose.foundation.gestures.FlingBehavior rememberSnapFlingBehavior(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            snapPosition = androidx.compose.foundation.gestures.snapping.SnapPosition.Center.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-338621290, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider(lazyListState, snapPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior rememberSnapFlingBehavior = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.rememberSnapFlingBehavior((androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? lazyListLayoutInfo.mo1788getViewportSizeYbymL2g() & 4294967295L : lazyListLayoutInfo.mo1788getViewportSizeYbymL2g() >> 32);
    }

    public static final int calculateFinalSnappingItem(androidx.compose.ui.unit.Density density, float f) {
        if (java.lang.Math.abs(f) < density.mo1418toPx0680j_4(androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getMinFlingVelocityDp())) {
            return androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1563getClosestItembbeMdSM();
        }
        return f > 0.0f ? androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1564getNextItembbeMdSM() : androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1565getPreviousItembbeMdSM();
    }
}
