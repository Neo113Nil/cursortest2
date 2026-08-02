package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\f*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "p0", "", "p1", "<init>", "(Landroidx/compose/foundation/layout/Direction;F)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/layout/Direction;", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/layout/Direction;)V", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FillNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.Direction Camera2StreamConfigurationMap;

    public FillNode(androidx.compose.foundation.layout.Direction direction, float f) {
        this.Camera2StreamConfigurationMap = direction;
        this.getHighSpeedVideoSizes = f;
    }

    public final void getHighSpeedVideoFpsRangesFor(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.foundation.layout.Direction direction) {
        this.Camera2StreamConfigurationMap = direction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int m8554getMaxWidthimpl;
        int i;
        int m8553getMaxHeightimpl;
        int i2;
        if (!androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(j) || this.Camera2StreamConfigurationMap == androidx.compose.foundation.layout.Direction.Vertical) {
            int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
            i = m8556getMinWidthimpl;
        } else {
            int round = java.lang.Math.round(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) * this.getHighSpeedVideoSizes);
            int m8556getMinWidthimpl2 = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
            if (round < m8556getMinWidthimpl2) {
                round = m8556getMinWidthimpl2;
            }
            if (round <= m8554getMaxWidthimpl) {
                m8554getMaxWidthimpl = round;
            }
            i = m8554getMaxWidthimpl;
        }
        if (!androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(j) || this.Camera2StreamConfigurationMap == androidx.compose.foundation.layout.Direction.Horizontal) {
            int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            i2 = m8555getMinHeightimpl;
        } else {
            int round2 = java.lang.Math.round(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) * this.getHighSpeedVideoSizes);
            int m8555getMinHeightimpl2 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            i2 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            if (round2 < m8555getMinHeightimpl2) {
                round2 = m8555getMinHeightimpl2;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            m8553getMaxHeightimpl = i2;
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(i, m8554getMaxWidthimpl, i2, m8553getMaxHeightimpl));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.FillNode.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
