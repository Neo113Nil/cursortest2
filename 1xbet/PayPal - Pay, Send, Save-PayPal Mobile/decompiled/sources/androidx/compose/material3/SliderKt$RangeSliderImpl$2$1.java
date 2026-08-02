package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material3.RangeSliderState getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int roundToInt;
        int roundToInt2;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable) == androidx.compose.material3.RangeSliderComponents.getHighResolutionOutputSizeshNQ4ISI) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2) == androidx.compose.material3.RangeSliderComponents.getHighSpeedVideoFpsRangesFor) {
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(j);
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            androidx.compose.ui.layout.Measurable measurable3 = list.get(i3);
                            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3) == androidx.compose.material3.RangeSliderComponents.Camera2StreamConfigurationMap) {
                                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(j, (-(mo7353measureBRTryo0.getWidth() + mo7353measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                int width = mo7353measureBRTryo03.getWidth() + ((mo7353measureBRTryo0.getWidth() + mo7353measureBRTryo02.getWidth()) / 2);
                                int max = java.lang.Math.max(mo7353measureBRTryo03.getHeight(), java.lang.Math.max(mo7353measureBRTryo0.getHeight(), mo7353measureBRTryo02.getHeight()));
                                this.getHighSpeedVideoFpsRangesFor.setTotalWidth$material3(width);
                                this.getHighSpeedVideoFpsRangesFor.updateMinMaxPx$material3();
                                float coercedActiveRangeStartAsFraction$material3 = this.getHighSpeedVideoFpsRangesFor.getCoercedActiveRangeStartAsFraction$material3();
                                boolean z = true;
                                boolean z2 = kotlin.jvm.internal.Intrinsics.areEqual(coercedActiveRangeStartAsFraction$material3, kotlin.collections.ArraysKt.firstOrNull(this.getHighSpeedVideoFpsRangesFor.getTickFractions())) || kotlin.jvm.internal.Intrinsics.areEqual(coercedActiveRangeStartAsFraction$material3, kotlin.collections.ArraysKt.lastOrNull(this.getHighSpeedVideoFpsRangesFor.getTickFractions()));
                                float coercedActiveRangeEndAsFraction$material3 = this.getHighSpeedVideoFpsRangesFor.getCoercedActiveRangeEndAsFraction$material3();
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(coercedActiveRangeEndAsFraction$material3, kotlin.collections.ArraysKt.firstOrNull(this.getHighSpeedVideoFpsRangesFor.getTickFractions())) && !kotlin.jvm.internal.Intrinsics.areEqual(coercedActiveRangeEndAsFraction$material3, kotlin.collections.ArraysKt.lastOrNull(this.getHighSpeedVideoFpsRangesFor.getTickFractions()))) {
                                    z = false;
                                }
                                final int width2 = mo7353measureBRTryo0.getWidth() / 2;
                                int i4 = mo7353measureBRTryo03.get(androidx.compose.material3.SliderKt.getCornerSizeAlignmentLine());
                                int i5 = i4 != Integer.MIN_VALUE ? i4 : 0;
                                if (this.getHighSpeedVideoFpsRangesFor.getSteps() > 0 && !z2) {
                                    roundToInt = kotlin.math.MathKt.roundToInt((mo7353measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeStartAsFraction$material3) + i5;
                                } else {
                                    roundToInt = kotlin.math.MathKt.roundToInt(mo7353measureBRTryo03.getWidth() * coercedActiveRangeStartAsFraction$material3);
                                }
                                final int i6 = roundToInt;
                                int width3 = (mo7353measureBRTryo0.getWidth() - mo7353measureBRTryo02.getWidth()) / 2;
                                if (this.getHighSpeedVideoFpsRangesFor.getSteps() > 0 && !z) {
                                    roundToInt2 = kotlin.math.MathKt.roundToInt(((mo7353measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeEndAsFraction$material3) + width3) + i5;
                                } else {
                                    roundToInt2 = kotlin.math.MathKt.roundToInt((mo7353measureBRTryo03.getWidth() * coercedActiveRangeEndAsFraction$material3) + width3);
                                }
                                final int i7 = roundToInt2;
                                final int height = (max - mo7353measureBRTryo03.getHeight()) / 2;
                                final int height2 = (max - mo7353measureBRTryo0.getHeight()) / 2;
                                final int height3 = (max - mo7353measureBRTryo02.getHeight()) / 2;
                                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, max, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.this, width2, height, mo7353measureBRTryo0, i6, height2, mo7353measureBRTryo02, i7, height3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                        }
                        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable placeable2, int i3, int i4, androidx.compose.ui.layout.Placeable placeable3, int i5, int i6, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    SliderKt$RangeSliderImpl$2$1(androidx.compose.material3.RangeSliderState rangeSliderState) {
        this.getHighSpeedVideoFpsRangesFor = rangeSliderState;
    }
}
