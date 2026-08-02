package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MinimumInteractiveModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final int width;
        final int height;
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(((androidx.compose.ui.unit.Dp) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.material3.InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m8615unboximpl(), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)));
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        boolean z = getIsAttached() && !java.lang.Float.isNaN(m8601constructorimpl) && androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(m8601constructorimpl, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0;
        int i = !java.lang.Float.isNaN(m8601constructorimpl) ? measureScope.mo1412roundToPx0680j_4(m8601constructorimpl) : 0;
        if (z) {
            width = java.lang.Math.max(mo7353measureBRTryo0.getWidth(), i);
        } else {
            width = mo7353measureBRTryo0.getWidth();
        }
        if (z) {
            height = java.lang.Math.max(mo7353measureBRTryo0.getHeight(), i);
        } else {
            height = mo7353measureBRTryo0.getHeight();
        }
        if (z) {
            java.util.LinkedHashMap linkedHashMap = this.getHighSpeedVideoSizes;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.getHighSpeedVideoSizes = linkedHashMap;
            }
            linkedHashMap.put(androidx.compose.material3.InteractiveComponentSizeKt.getMinimumInteractiveLeftAlignmentLine(), java.lang.Integer.valueOf(kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.round((i - mo7353measureBRTryo0.getWidth()) / 2.0f), 0)));
            linkedHashMap.put(androidx.compose.material3.InteractiveComponentSizeKt.getMinimumInteractiveTopAlignmentLine(), java.lang.Integer.valueOf(kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.round((i - mo7353measureBRTryo0.getHeight()) / 2.0f), 0)));
        }
        java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map = this.getHighSpeedVideoSizes;
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return measureScope.layout(width, height, map, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.MinimumInteractiveModifierNode.$r8$lambda$YAxurvUD3TXbI36hTOUtj95vMYA(width, mo7353measureBRTryo0, height, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YAxurvUD3TXbI36hTOUtj95vMYA(int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, kotlin.math.MathKt.roundToInt((i - placeable.getWidth()) / 2.0f), kotlin.math.MathKt.roundToInt((i2 - placeable.getHeight()) / 2.0f), 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
