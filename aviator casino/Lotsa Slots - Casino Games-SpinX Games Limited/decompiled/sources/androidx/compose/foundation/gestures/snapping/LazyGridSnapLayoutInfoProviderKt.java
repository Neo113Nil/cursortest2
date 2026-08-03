package androidx.compose.foundation.gestures.snapping;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            snapPositionInLayout = androidx.compose.foundation.gestures.snapping.SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, final androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo getLayoutInfo() {
                return androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float initialVelocity) {
                float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((((float) java.lang.Math.floor(java.lang.Math.abs(java.lang.Math.abs(androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(androidx.compose.foundation.lazy.grid.LazyGridState.this.getDensity()), 0.0f, initialVelocity))) / averageItemSize())) * averageItemSize()) - averageItemSize(), 0.0f);
                return coerceAtLeast == 0.0f ? coerceAtLeast : coerceAtLeast * java.lang.Math.signum(initialVelocity);
            }

            private final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> singleAxisItems() {
                int i;
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = androidx.compose.foundation.lazy.grid.LazyGridState.this.getLayoutInfo().getVisibleItemsInfo();
                androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2 = androidx.compose.foundation.lazy.grid.LazyGridState.this;
                java.util.ArrayList arrayList = new java.util.ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                while (i < size) {
                    androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    if (lazyGridState2.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal) {
                        i = lazyGridItemInfo2.getRow() != 0 ? i + 1 : 0;
                        arrayList.add(lazyGridItemInfo);
                    } else {
                        if (lazyGridItemInfo2.getColumn() != 0) {
                        }
                        arrayList.add(lazyGridItemInfo);
                    }
                }
                return arrayList;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float currentVelocity) {
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout2 = snapPositionInLayout;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout2);
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                        f = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m440calculateFinalOffsetFhqu1e0(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(androidx.compose.foundation.lazy.grid.LazyGridState.this.getDensity(), currentVelocity), f, f2);
            }

            public final float averageItemSize() {
                int i;
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> singleAxisItems = singleAxisItems();
                if (!(!singleAxisItems.isEmpty())) {
                    return 0.0f;
                }
                int i2 = 0;
                if (getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                    int size = singleAxisItems.size();
                    i = 0;
                    while (i2 < size) {
                        i += androidx.compose.ui.unit.IntSize.m4651getHeightimpl(singleAxisItems.get(i2).getSize());
                        i2++;
                    }
                } else {
                    int size2 = singleAxisItems.size();
                    i = 0;
                    while (i2 < size2) {
                        i += androidx.compose.ui.unit.IntSize.m4652getWidthimpl(singleAxisItems.get(i2).getSize());
                        i2++;
                    }
                }
                return i / singleAxisItems.size();
            }
        };
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.IntSize.m4651getHeightimpl(lazyGridLayoutInfo.mo705getViewportSizeYbymL2g());
        }
        return androidx.compose.ui.unit.IntSize.m4652getWidthimpl(lazyGridLayoutInfo.mo705getViewportSizeYbymL2g());
    }

    public static final int sizeOnMainAxis(androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.IntSize.m4651getHeightimpl(lazyGridItemInfo.getSize());
        }
        return androidx.compose.ui.unit.IntSize.m4652getWidthimpl(lazyGridItemInfo.getSize());
    }

    public static final int offsetOnMainAxis(androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.IntOffset.m4611getYimpl(lazyGridItemInfo.getOffset());
        }
        return androidx.compose.ui.unit.IntOffset.m4610getXimpl(lazyGridItemInfo.getOffset());
    }
}
