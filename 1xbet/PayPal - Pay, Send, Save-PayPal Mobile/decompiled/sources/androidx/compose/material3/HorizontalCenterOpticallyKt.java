package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/shape/CornerBasedShape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/unit/Dp;", "maxStartOffset", "maxEndOffset", "horizontalCenterOptically-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/shape/CornerBasedShape;FF)Landroidx/compose/ui/Modifier;", "horizontalCenterOptically", "Landroidx/compose/material3/ShapeWithHorizontalCenterOptically;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ShapeWithHorizontalCenterOptically;FF)Landroidx/compose/ui/Modifier;", "", "CenterOpticallyCoefficient", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HorizontalCenterOpticallyKt {
    public static final float CenterOpticallyCoefficient = 0.11f;

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m3327horizontalCenterOptically4j6BHR0(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, final float f, final float f2) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.HorizontalCenterOpticallyKt.m3325$r8$lambda$JhIUmGTRuQDBrygKeiqwM_ZS8k(f, f2, cornerBasedShape, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m3328horizontalCenterOptically4j6BHR0(androidx.compose.ui.Modifier modifier, final androidx.compose.material3.ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, final float f, final float f2) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.HorizontalCenterOpticallyKt.$r8$lambda$7CB0r9XvJnOZKsCatFvnX2h5tiQ(f, f2, shapeWithHorizontalCenterOptically, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m3329horizontalCenterOptically4j6BHR0$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m3327horizontalCenterOptically4j6BHR0(modifier, cornerBasedShape, f, f2);
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m3330horizontalCenterOptically4j6BHR0$default(androidx.compose.ui.Modifier modifier, androidx.compose.material3.ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m3328horizontalCenterOptically4j6BHR0(modifier, shapeWithHorizontalCenterOptically, f, f2);
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$7CB0r9XvJnOZKsCatFvnX2h5tiQ(float f, float f2, final androidx.compose.material3.ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        int width = mo7353measureBRTryo0.getWidth();
        int height = mo7353measureBRTryo0.getHeight();
        final float f3 = -measureScope.mo1418toPx0680j_4(f);
        final float f4 = measureScope.mo1418toPx0680j_4(f2);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.HorizontalCenterOpticallyKt.$r8$lambda$daTom7TVTD24n3ZdJV_zBJtJw1s(androidx.compose.material3.ShapeWithHorizontalCenterOptically.this, f3, f4, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$JhIUmGT-RuQDBrygKeiqwM_ZS8k, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult m3325$r8$lambda$JhIUmGTRuQDBrygKeiqwM_ZS8k(float f, float f2, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        int width = mo7353measureBRTryo0.getWidth();
        int height = mo7353measureBRTryo0.getHeight();
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(height) & 4294967295L));
        final float f3 = -measureScope.mo1418toPx0680j_4(f);
        final float f4 = measureScope.mo1418toPx0680j_4(f2);
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        final float mo1966toPxTmRCtEA = (((cornerBasedShape.getTopStart().mo1966toPxTmRCtEA(m5812constructorimpl, measureScope2) + cornerBasedShape.getBottomStart().mo1966toPxTmRCtEA(m5812constructorimpl, measureScope2)) / 2.0f) - ((cornerBasedShape.getTopEnd().mo1966toPxTmRCtEA(m5812constructorimpl, measureScope2) + cornerBasedShape.getBottomEnd().mo1966toPxTmRCtEA(m5812constructorimpl, measureScope2)) / 2.0f)) * 0.11f;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.HorizontalCenterOpticallyKt.m3326$r8$lambda$QWGxkTAZkxIvm_07RX9HRtjYd4(mo1966toPxTmRCtEA, f3, f4, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$QWGxkTAZkxI-vm_07RX9HRtjYd4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3326$r8$lambda$QWGxkTAZkxIvm_07RX9HRtjYd4(float f, float f2, float f3, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, kotlin.math.MathKt.roundToInt(kotlin.ranges.RangesKt.coerceIn(f, f2, f3)), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$daTom7TVTD24n3ZdJV_zBJtJw1s(androidx.compose.material3.ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f, float f2, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, kotlin.math.MathKt.roundToInt(kotlin.ranges.RangesKt.coerceIn(shapeWithHorizontalCenterOptically.offset(), f, f2)), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
