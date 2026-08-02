package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$SliderImpl$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material3.SliderState getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.ui.layout.Placeable mo7353measureBRTryo0;
        int width;
        int max;
        int roundToInt;
        final int i;
        final int i2;
        final int i3;
        int roundToInt2;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i4);
            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable) == androidx.compose.material3.SliderComponents.getHighSpeedVideoFpsRangesFor) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable.mo7353measureBRTryo0(j);
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i5);
                    if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2) == androidx.compose.material3.SliderComponents.Camera2StreamConfigurationMap) {
                        if (this.getHighSpeedVideoSizes.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                            mo7353measureBRTryo0 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(j, 0, -mo7353measureBRTryo02.getHeight(), 1, null), 0, 0, 0, 0, 14, null));
                        } else {
                            mo7353measureBRTryo0 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(j, -mo7353measureBRTryo02.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                        }
                        final androidx.compose.ui.layout.Placeable placeable = mo7353measureBRTryo0;
                        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                        float coercedValueAsFraction = this.getHighSpeedVideoSizes.getCoercedValueAsFraction();
                        boolean z = kotlin.jvm.internal.Intrinsics.areEqual(coercedValueAsFraction, kotlin.collections.ArraysKt.firstOrNull(this.getHighSpeedVideoSizes.getTickFractions())) || kotlin.jvm.internal.Intrinsics.areEqual(coercedValueAsFraction, kotlin.collections.ArraysKt.lastOrNull(this.getHighSpeedVideoSizes.getTickFractions()));
                        int i6 = placeable.get(androidx.compose.material3.SliderKt.getCornerSizeAlignmentLine());
                        int i7 = i6 != Integer.MIN_VALUE ? i6 : 0;
                        if (this.getHighSpeedVideoSizes.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                            width = java.lang.Math.max(placeable.getWidth(), mo7353measureBRTryo02.getWidth());
                            max = mo7353measureBRTryo02.getHeight() + placeable.getHeight();
                            int width2 = (width - placeable.getWidth()) / 2;
                            int height = mo7353measureBRTryo02.getHeight() / 2;
                            int width3 = (width - mo7353measureBRTryo02.getWidth()) / 2;
                            if (this.getHighSpeedVideoSizes.getSteps() > 0 && !z) {
                                roundToInt2 = kotlin.math.MathKt.roundToInt((placeable.getHeight() - (i7 * 2)) * coercedValueAsFraction) + i7;
                            } else {
                                roundToInt2 = kotlin.math.MathKt.roundToInt(placeable.getHeight() * coercedValueAsFraction);
                            }
                            intRef.element = roundToInt2;
                            if (this.getHighSpeedVideoSizes.getReverseVerticalDirection()) {
                                intRef.element = placeable.getHeight() - intRef.element;
                            }
                            i3 = height;
                            i = width3;
                            i2 = width2;
                        } else {
                            width = mo7353measureBRTryo02.getWidth() + placeable.getWidth();
                            max = java.lang.Math.max(placeable.getHeight(), mo7353measureBRTryo02.getHeight());
                            int width4 = mo7353measureBRTryo02.getWidth() / 2;
                            int height2 = (max - placeable.getHeight()) / 2;
                            if (this.getHighSpeedVideoSizes.getSteps() > 0 && !z) {
                                roundToInt = kotlin.math.MathKt.roundToInt((placeable.getWidth() - (i7 * 2)) * coercedValueAsFraction) + i7;
                            } else {
                                roundToInt = kotlin.math.MathKt.roundToInt(placeable.getWidth() * coercedValueAsFraction);
                            }
                            intRef.element = (max - mo7353measureBRTryo02.getHeight()) / 2;
                            i = roundToInt;
                            i2 = width4;
                            i3 = height2;
                        }
                        this.getHighSpeedVideoSizes.updateDimensions$material3(width, max);
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, max, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.SliderKt$SliderImpl$2$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.this, i2, i3, mo7353measureBRTryo02, i, intRef, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
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

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable placeable2, int i3, kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, intRef.element, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    SliderKt$SliderImpl$2$1(androidx.compose.material3.SliderState sliderState) {
        this.getHighSpeedVideoSizes = sliderState;
    }
}
