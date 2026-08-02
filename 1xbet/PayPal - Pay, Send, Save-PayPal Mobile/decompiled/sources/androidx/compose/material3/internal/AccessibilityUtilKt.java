package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0007\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0002\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "HorizontalSemanticsBoundsPadding", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHorizontalSemanticsBoundsPadding", "()F", "getHorizontalSemanticsBoundsPadding$annotations", "()V", "VerticalSemanticsBoundsPadding", "getVerticalSemanticsBoundsPadding", "getVerticalSemanticsBoundsPadding$annotations", "Landroidx/compose/ui/Modifier;", "IncreaseHorizontalSemanticsBounds", "Landroidx/compose/ui/Modifier;", "getIncreaseHorizontalSemanticsBounds", "()Landroidx/compose/ui/Modifier;", "IncreaseVerticalSemanticsBounds", "getIncreaseVerticalSemanticsBounds"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding;
    private static final androidx.compose.ui.Modifier IncreaseHorizontalSemanticsBounds;
    private static final androidx.compose.ui.Modifier IncreaseVerticalSemanticsBounds;
    private static final float VerticalSemanticsBoundsPadding;

    public static /* synthetic */ void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    public static /* synthetic */ void getVerticalSemanticsBoundsPadding$annotations() {
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    public static final float getVerticalSemanticsBoundsPadding() {
        return VerticalSemanticsBoundsPadding;
    }

    public static final androidx.compose.ui.Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }

    public static final androidx.compose.ui.Modifier getIncreaseVerticalSemanticsBounds() {
        return IncreaseVerticalSemanticsBounds;
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
        HorizontalSemanticsBoundsPadding = m8601constructorimpl;
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
        VerticalSemanticsBoundsPadding = m8601constructorimpl2;
        IncreaseHorizontalSemanticsBounds = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.internal.AccessibilityUtilKt.$r8$lambda$vj_L_dx3_tuncOKmBPJLccTAYPY((androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        }), true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }), m8601constructorimpl, 0.0f, 2, null);
        IncreaseVerticalSemanticsBounds = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.internal.AccessibilityUtilKt.$r8$lambda$YBlIMh33yfX6fBY1_RBWEPjDrPk((androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        }), true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }), 0.0f, m8601constructorimpl2, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NInMqzBmj0pFHNYetGqSB4ArrVo(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, -i, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$YBlIMh33yfX6fBY1_RBWEPjDrPk(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final int i = measureScope.mo1412roundToPx0680j_4(VerticalSemanticsBoundsPadding);
        long getHighSpeedVideoFpsRangesFor = constraints.getGetHighSpeedVideoFpsRangesFor();
        int i2 = i * 2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(getHighSpeedVideoFpsRangesFor, 0, i2));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight() - i2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.AccessibilityUtilKt.$r8$lambda$l2CKJixmkGExPYijRL5uGT8dHik(androidx.compose.ui.layout.Placeable.this, i, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l2CKJixmkGExPYijRL5uGT8dHik(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$vj_L_dx3_tuncOKmBPJLccTAYPY(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final int i = measureScope.mo1412roundToPx0680j_4(HorizontalSemanticsBoundsPadding);
        long getHighSpeedVideoFpsRangesFor = constraints.getGetHighSpeedVideoFpsRangesFor();
        int i2 = i * 2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(getHighSpeedVideoFpsRangesFor, i2, 0));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth() - i2, mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.AccessibilityUtilKt.$r8$lambda$NInMqzBmj0pFHNYetGqSB4ArrVo(androidx.compose.ui.layout.Placeable.this, i, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
