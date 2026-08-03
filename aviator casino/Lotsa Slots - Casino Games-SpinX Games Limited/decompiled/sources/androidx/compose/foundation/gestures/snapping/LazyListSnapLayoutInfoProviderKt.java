package androidx.compose.foundation.gestures.snapping;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider$default(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            snapPositionInLayout = androidx.compose.foundation.gestures.snapping.SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyListState, snapPositionInLayout);
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.lazy.LazyListState lazyListState, final androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final androidx.compose.foundation.lazy.LazyListLayoutInfo getLayoutInfo() {
                return androidx.compose.foundation.lazy.LazyListState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float initialVelocity) {
                float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((((float) java.lang.Math.floor(java.lang.Math.abs(java.lang.Math.abs(androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(androidx.compose.foundation.lazy.LazyListState.this.getDensity()), 0.0f, initialVelocity))) / averageItemSize())) * averageItemSize()) - averageItemSize(), 0.0f);
                return coerceAtLeast == 0.0f ? coerceAtLeast : coerceAtLeast * java.lang.Math.signum(initialVelocity);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float currentVelocity) {
                java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout2 = snapPositionInLayout;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPositionInLayout2);
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                        f = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m440calculateFinalOffsetFhqu1e0(androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(androidx.compose.foundation.lazy.LazyListState.this.getDensity(), currentVelocity), f, f2);
            }

            public final float averageItemSize() {
                androidx.compose.foundation.lazy.LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
                    return 0.0f;
                }
                java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i += visibleItemsInfo.get(i2).getSize();
                }
                return i / layoutInfo.getVisibleItemsInfo().size();
            }
        };
    }

    public static final androidx.compose.foundation.gestures.FlingBehavior rememberSnapFlingBehavior(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1148456277);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSnapFlingBehavior)126@5074L65,127@5151L41:LazyListSnapLayoutInfoProvider.kt#ppz6w6");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1148456277, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:125)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(lazyListState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior rememberSnapFlingBehavior = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.rememberSnapFlingBehavior((androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapFlingBehavior;
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.IntSize.m4651getHeightimpl(lazyListLayoutInfo.mo673getViewportSizeYbymL2g()) : androidx.compose.ui.unit.IntSize.m4652getWidthimpl(lazyListLayoutInfo.mo673getViewportSizeYbymL2g());
    }

    public static final int calculateFinalSnappingItem(androidx.compose.ui.unit.Density density, float f) {
        if (java.lang.Math.abs(f) < density.mo315toPx0680j_4(androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getMinFlingVelocityDp())) {
            return androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m437getClosestItembbeMdSM();
        }
        return f > 0.0f ? androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m438getNextItembbeMdSM() : androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m439getPreviousItembbeMdSM();
    }
}
