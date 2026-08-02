package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$SearchBarLayout$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.internal.MutableWindowInsets getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, final long j) {
        androidx.compose.ui.layout.Measurable measurable;
        androidx.compose.ui.layout.Placeable placeable;
        int i;
        int m8553getMaxHeightimpl;
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        long j2 = j;
        final float floatValue = this.getHighSpeedVideoFpsRanges.getValue().floatValue();
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    androidx.compose.ui.layout.Measurable measurable3 = list.get(i3);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                        int size3 = list2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i4);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "Content")) {
                                break;
                            }
                            i4++;
                        }
                        androidx.compose.ui.layout.Measurable measurable4 = measurable;
                        final int top = this.getHighSpeedVideoFpsRangesFor.getTop(measureScope2) + measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarKt.getSearchBarVerticalPadding());
                        int i5 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarKt.getSearchBarVerticalPadding());
                        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)));
                        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)));
                        int roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) * 0.9f);
                        int roundToInt2 = kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) * 0.9f);
                        final float access$calculatePredictiveBackMultiplier = androidx.compose.material3.SearchBarKt.access$calculatePredictiveBackMultiplier(this.getHighSpeedVideoSizes.getValue(), floatValue, this.getHighResolutionOutputSizeshNQ4ISI.getFloatValue());
                        int lerp = androidx.compose.ui.util.MathHelpersKt.lerp(m8571constrainWidthK40F9xA, roundToInt, access$calculatePredictiveBackMultiplier);
                        int i6 = top + m8570constrainHeightK40F9xA;
                        int lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(i6, roundToInt2, access$calculatePredictiveBackMultiplier);
                        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                        int m8553getMaxHeightimpl2 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                        int lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(lerp, m8554getMaxWidthimpl, floatValue);
                        final int lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(lerp2, m8553getMaxHeightimpl2, floatValue);
                        final int lerp5 = androidx.compose.ui.util.MathHelpersKt.lerp(top, 0, floatValue);
                        final int lerp6 = androidx.compose.ui.util.MathHelpersKt.lerp(0, i5, floatValue);
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(lerp3, m8554getMaxWidthimpl, m8570constrainHeightK40F9xA, m8570constrainHeightK40F9xA));
                        int width = mo7353measureBRTryo0.getWidth();
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(width, lerp4 - lerp5));
                        if (measurable4 != null) {
                            if (androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(j)) {
                                i = 0;
                                m8553getMaxHeightimpl = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - (i6 + i5), 0);
                            } else {
                                i = 0;
                                m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                            }
                            placeable = measurable4.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(width, width, i, m8553getMaxHeightimpl));
                        } else {
                            placeable = null;
                        }
                        final androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState = this.getHighSpeedVideoSizes;
                        final androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2 = this.Camera2StreamConfigurationMap;
                        final androidx.compose.ui.layout.Placeable placeable2 = placeable;
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, lerp4, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarKt$SearchBarLayout$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.SearchBarKt$SearchBarLayout$2$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.MeasureScope.this, j, mutableState, floatValue, access$calculatePredictiveBackMultiplier, mutableState2, lerp4, mo7353measureBRTryo02, lerp5, mo7353measureBRTryo0, top, placeable2, lerp6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                    i3++;
                    measureScope2 = measureScope;
                    j2 = j;
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
            i2++;
            measureScope2 = measureScope;
            j2 = j;
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.MeasureScope measureScope, long j, androidx.compose.runtime.MutableState mutableState, float f, float f2, androidx.compose.runtime.MutableState mutableState2, int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.Placeable placeable2, int i3, androidx.compose.ui.layout.Placeable placeable3, int i4, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        float f3;
        float f4;
        f3 = androidx.compose.material3.SearchBarKt.getValidOutputFormatsForInputhNQ4ISI;
        int i5 = measureScope.mo1412roundToPx0680j_4(f3);
        int m3686access$calculatePredictiveBackOffsetXrOvwMX4 = androidx.compose.material3.SearchBarKt.m3686access$calculatePredictiveBackOffsetXrOvwMX4(j, i5, (androidx.view.BackEventCompat) mutableState.getValue(), measureScope.getLayoutDirection(), f, f2);
        androidx.view.BackEventCompat backEventCompat = (androidx.view.BackEventCompat) mutableState.getValue();
        androidx.view.BackEventCompat backEventCompat2 = (androidx.view.BackEventCompat) mutableState2.getValue();
        f4 = androidx.compose.material3.SearchBarKt.unwrapAs;
        int m3687access$calculatePredictiveBackOffsetYdzo92Q0 = androidx.compose.material3.SearchBarKt.m3687access$calculatePredictiveBackOffsetYdzo92Q0(j, i5, backEventCompat, backEventCompat2, i, measureScope.mo1412roundToPx0680j_4(f4), f2);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, m3686access$calculatePredictiveBackOffsetXrOvwMX4, m3687access$calculatePredictiveBackOffsetYdzo92Q0 + i2, 0.0f, 4, null);
        int i6 = m3687access$calculatePredictiveBackOffsetYdzo92Q0 + i3;
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, m3686access$calculatePredictiveBackOffsetXrOvwMX4, i6, 0.0f, 4, null);
        if (placeable3 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, m3686access$calculatePredictiveBackOffsetXrOvwMX4, i6 + placeable2.getHeight() + i4, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    SearchBarKt$SearchBarLayout$2$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.material3.internal.MutableWindowInsets mutableWindowInsets, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2) {
        this.getHighSpeedVideoFpsRanges = animatable;
        this.getHighSpeedVideoFpsRangesFor = mutableWindowInsets;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableFloatState;
        this.Camera2StreamConfigurationMap = mutableState2;
    }
}
