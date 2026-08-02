package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000e\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/PaddingValues;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingValuesModifier extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor;

    public PaddingValuesModifier(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        float mo1672calculateLeftPaddingu2uoSUM = this.getHighSpeedVideoFpsRangesFor.mo1672calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float top = this.getHighSpeedVideoFpsRangesFor.getTop();
        float mo1673calculateRightPaddingu2uoSUM = this.getHighSpeedVideoFpsRangesFor.mo1673calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float bottom = this.getHighSpeedVideoFpsRangesFor.getBottom();
        boolean z = androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(mo1672calculateLeftPaddingu2uoSUM, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) >= 0;
        boolean z2 = androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(top, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) >= 0;
        if (!(z & z2 & (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(mo1673calculateRightPaddingu2uoSUM, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) >= 0) & (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(bottom, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) >= 0))) {
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int i = measureScope.mo1412roundToPx0680j_4(mo1672calculateLeftPaddingu2uoSUM);
        int i2 = measureScope.mo1412roundToPx0680j_4(mo1673calculateRightPaddingu2uoSUM) + i;
        final int i3 = measureScope.mo1412roundToPx0680j_4(top);
        int i4 = measureScope.mo1412roundToPx0680j_4(bottom) + i3;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -i2, -i4));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, mo7353measureBRTryo0.getWidth() + i2), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, mo7353measureBRTryo0.getHeight() + i4), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.PaddingValuesModifier.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, i, i3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
