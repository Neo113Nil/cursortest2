package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/RectRulers;", "rulers", "fitInside", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/RectRulers;)Landroidx/compose/ui/Modifier;", "fitOutside"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RulerAlignmentKt {
    public static final androidx.compose.ui.Modifier fitInside(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.RectRulers rectRulers) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.layout.MeasureResult highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.RulerAlignmentKt.getHighSpeedVideoSizes(androidx.compose.ui.layout.RectRulers.this, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes(final androidx.compose.ui.layout.RectRulers rectRulers, androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) && androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())) {
            final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
            final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.RulerAlignmentKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.RectRulers.this, m8554getMaxWidthimpl, m8553getMaxHeightimpl, measurable, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        final int width = mo7353measureBRTryo0.getWidth();
        final int height = mo7353measureBRTryo0.getHeight();
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.RulerAlignmentKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.RectRulers.this, width, height, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.RectRulers rectRulers, int i, int i2, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int roundToInt = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighResolutionOutputSizeshNQ4ISI(), 0.0f));
        if (roundToInt < 0) {
            roundToInt = 0;
        }
        int i3 = roundToInt > i ? i : roundToInt;
        int roundToInt2 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRangesFor(), 0.0f));
        if (roundToInt2 < 0) {
            roundToInt2 = 0;
        }
        int i4 = roundToInt2 > i2 ? i2 : roundToInt2;
        int roundToInt3 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRanges(), i));
        if (roundToInt3 < 0) {
            roundToInt3 = 0;
        }
        if (roundToInt3 <= i) {
            i = roundToInt3;
        }
        int roundToInt4 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoSizes(), i2));
        int i5 = roundToInt4 >= 0 ? roundToInt4 : 0;
        if (i5 <= i2) {
            i2 = i5;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i - i3, i2 - i4)), i3, i4, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.RectRulers rectRulers, int i, int i2, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int roundToInt = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighResolutionOutputSizeshNQ4ISI(), 0.0f));
        if (roundToInt < 0) {
            roundToInt = 0;
        }
        if (roundToInt > i) {
            roundToInt = i;
        }
        int roundToInt2 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRangesFor(), 0.0f));
        if (roundToInt2 < 0) {
            roundToInt2 = 0;
        }
        if (roundToInt2 > i2) {
            roundToInt2 = i2;
        }
        int roundToInt3 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRanges(), i));
        if (roundToInt3 < 0) {
            roundToInt3 = 0;
        }
        if (roundToInt3 > i) {
            roundToInt3 = i;
        }
        int roundToInt4 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoSizes(), i2));
        int i3 = roundToInt4 >= 0 ? roundToInt4 : 0;
        if (i3 > i2) {
            i3 = i2;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, ((roundToInt + roundToInt3) - i) / 2, ((roundToInt2 + i3) - i2) / 2, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier fitOutside(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.RectRulers rectRulers) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.layout.MeasureResult highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.RulerAlignmentKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.RectRulers.this, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges(final androidx.compose.ui.layout.RectRulers rectRulers, androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) && androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())) {
            final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
            final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.RulerAlignmentKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.RectRulers.this, m8554getMaxWidthimpl, m8553getMaxHeightimpl, measurable, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, 4, null);
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.RulerAlignmentKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Measurable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.RectRulers rectRulers, int i, int i2, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int i3;
        int i4;
        int roundToInt = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighResolutionOutputSizeshNQ4ISI(), 0.0f));
        int roundToInt2 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRangesFor(), 0.0f));
        int roundToInt3 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoFpsRanges(), i));
        int roundToInt4 = kotlin.math.MathKt.roundToInt(placementScope.current(rectRulers.getGetHighSpeedVideoSizes(), i2));
        if (roundToInt > 0) {
            i = roundToInt;
        } else {
            if (roundToInt2 <= 0) {
                if (roundToInt3 < i) {
                    i -= roundToInt3;
                    i4 = roundToInt3;
                    i3 = 0;
                } else if (roundToInt4 < i2) {
                    i2 -= roundToInt4;
                    i3 = roundToInt4;
                    i4 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, i2)), i4, i3, 0.0f, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            i2 = roundToInt2;
        }
        i4 = 0;
        i3 = 0;
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, i2)), i4, i3, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(0, 0)), 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
