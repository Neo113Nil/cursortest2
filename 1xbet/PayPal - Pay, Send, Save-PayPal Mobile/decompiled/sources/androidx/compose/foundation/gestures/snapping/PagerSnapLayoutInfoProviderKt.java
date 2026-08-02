package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/pager/PagerState;F)Z", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/pager/PagerState;)F", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/unit/LayoutDirection;FFFF)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.pager.PagerState pagerState, final androidx.compose.foundation.pager.PagerSnapDistance pagerSnapDistance, final kotlin.jvm.functions.Function3<? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Float, java.lang.Float> function3) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            public final boolean isValidDistance(float f) {
                return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
            }

            public final androidx.compose.foundation.pager.PagerLayoutInfo getLayoutInfo() {
                return androidx.compose.foundation.pager.PagerState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateSnapOffset(float velocity) {
                kotlin.Pair<java.lang.Float, java.lang.Float> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState.this.getLayoutInfo().getSnapPosition(), velocity);
                float floatValue = Camera2StreamConfigurationMap.component1().floatValue();
                float floatValue2 = Camera2StreamConfigurationMap.component2().floatValue();
                float floatValue3 = function3.invoke(java.lang.Float.valueOf(velocity), java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue2)).floatValue();
                if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Final Snapping Offset Should Be one of ");
                    sb.append(floatValue);
                    sb.append(", ");
                    sb.append(floatValue2);
                    sb.append(" or 0.0");
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
                }
                if (isValidDistance(floatValue3)) {
                    return floatValue3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateApproachOffset(float velocity, float decayOffset) {
                int firstVisiblePage;
                int pageSize$foundation = androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation() + androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation();
                if (pageSize$foundation == 0) {
                    return 0.0f;
                }
                if (velocity < 0.0f) {
                    firstVisiblePage = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage() + 1;
                } else {
                    firstVisiblePage = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage();
                }
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.abs((kotlin.ranges.RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage, kotlin.ranges.RangesKt.coerceIn(((int) (decayOffset / pageSize$foundation)) + firstVisiblePage, 0, androidx.compose.foundation.pager.PagerState.this.getPageCount()), velocity, androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation(), androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation()), 0, androidx.compose.foundation.pager.PagerState.this.getPageCount()) - firstVisiblePage) * pageSize$foundation) - pageSize$foundation, 0);
                if (coerceAtLeast == 0) {
                    return coerceAtLeast;
                }
                return java.lang.Math.signum(velocity) * coerceAtLeast;
            }

            private final kotlin.Pair<java.lang.Float, java.lang.Float> Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.snapping.SnapPosition p0, float p1) {
                float f;
                boolean highResolutionOutputSizeshNQ4ISI;
                boolean highResolutionOutputSizeshNQ4ISI2;
                java.util.List<androidx.compose.foundation.pager.PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                androidx.compose.foundation.pager.PagerState pagerState2 = androidx.compose.foundation.pager.PagerState.this;
                int size = visiblePagesInfo.size();
                int i = 0;
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                while (true) {
                    f = 0.0f;
                    if (i >= size) {
                        break;
                    }
                    androidx.compose.foundation.pager.PageInfo pageInfo = visiblePagesInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), p0, pagerState2.getPageCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f3) {
                        f3 = calculateDistanceToDesiredSnapPosition;
                    }
                    i++;
                }
                if (f2 == Float.NEGATIVE_INFINITY) {
                    f2 = f3;
                }
                if (f3 == Float.POSITIVE_INFINITY) {
                    f3 = f2;
                }
                if (!androidx.compose.foundation.pager.PagerState.this.getCanScrollForward()) {
                    highResolutionOutputSizeshNQ4ISI2 = androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this, p1);
                    if (highResolutionOutputSizeshNQ4ISI2) {
                        f2 = 0.0f;
                        f3 = 0.0f;
                    } else {
                        f3 = 0.0f;
                    }
                }
                if (androidx.compose.foundation.pager.PagerState.this.getCanScrollBackward()) {
                    f = f2;
                } else {
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this, p1);
                    if (!highResolutionOutputSizeshNQ4ISI) {
                        f3 = 0.0f;
                    }
                }
                return kotlin.TuplesKt.to(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f3));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, float f) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z = (pagerState.isNotGestureAction$foundation() ? -f : getHighSpeedVideoFpsRanges(pagerState)) > 0.0f;
        return (z && reverseLayout) || !(z || reverseLayout);
    }

    private static final float getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerState pagerState) {
        if (pagerState.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return java.lang.Float.intBitsToFloat((int) (pagerState.m1935getUpDownDifferenceF1C5BW0$foundation() >> 32));
        }
        return java.lang.Float.intBitsToFloat((int) (pagerState.m1935getUpDownDifferenceF1C5BW0$foundation() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.unit.LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(pagerState, f2);
        if (pagerState.getLayoutInfo().getOrientation() != androidx.compose.foundation.gestures.Orientation.Vertical && layoutDirection != androidx.compose.ui.unit.LayoutDirection.Ltr) {
            highResolutionOutputSizeshNQ4ISI = !highResolutionOutputSizeshNQ4ISI;
        }
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        float highSpeedVideoFpsRanges = pageSize == 0 ? 0.0f : getHighSpeedVideoFpsRanges(pagerState) / pageSize;
        float f5 = (int) highSpeedVideoFpsRanges;
        int calculateFinalSnappingItem = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState.getDensity(), f2);
        if (androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1563getClosestItembbeMdSM())) {
            return (java.lang.Math.abs(highSpeedVideoFpsRanges - f5) <= f ? java.lang.Math.abs(highSpeedVideoFpsRanges) < java.lang.Math.abs(pagerState.getPositionThresholdFraction$foundation()) ? java.lang.Math.abs(f3) >= java.lang.Math.abs(f4) : !highResolutionOutputSizeshNQ4ISI : highResolutionOutputSizeshNQ4ISI) ? f4 : f3;
        }
        if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1564getNextItembbeMdSM())) {
            if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1565getPreviousItembbeMdSM())) {
                return 0.0f;
            }
        }
    }
}
