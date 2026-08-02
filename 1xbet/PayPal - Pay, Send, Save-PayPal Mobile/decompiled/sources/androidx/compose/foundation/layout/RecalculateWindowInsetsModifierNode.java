package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u0018\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "maxIntrinsicHeight", "maxIntrinsicWidth", "Landroidx/compose/foundation/layout/ValueInsets;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/ValueInsets;", "", "getShouldAutoInvalidate", "()Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RecalculateWindowInsetsModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode implements androidx.compose.ui.node.LayoutModifierNode {
    private final androidx.compose.foundation.layout.ValueInsets getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.layout.ValueInsets(new androidx.compose.foundation.layout.InsetsValues(0, 0, 0, 0), "reset");

    @Override // androidx.compose.ui.Modifier.Node
    /* renamed from: getShouldAutoInvalidate */
    public final boolean getCamera2StreamConfigurationMap() {
        return false;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        return this.getHighSpeedVideoFpsRangesFor.getValue$foundation_layout().getLeft() == -1 ? p0 : this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.Measurable measurable, long j) {
        if (!androidx.compose.ui.unit.Constraints.m8552getHasFixedWidthimpl(j) || !androidx.compose.ui.unit.Constraints.m8551getHasFixedHeightimpl(j)) {
            if (this.getHighSpeedVideoFpsRangesFor.getValue$foundation_layout().getLeft() != -1) {
                this.getHighSpeedVideoFpsRangesFor.setValue$foundation_layout(new androidx.compose.foundation.layout.InsetsValues(-1, -1, -1, -1));
                insetsInvalidated();
            }
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, 4, null);
        }
        final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode.getHighSpeedVideoSizes(androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode.this, measurable, m8554getMaxWidthimpl, m8553getMaxHeightimpl, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoSizes;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode, androidx.compose.ui.layout.Measurable measurable, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(coordinates);
            long mo7361getSizeYbymL2g = coordinates.mo7361getSizeYbymL2g();
            long mo7364localToRootMKHz9U = coordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g >> 32)) << 32)));
            long mo7361getSizeYbymL2g2 = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(coordinates).mo7361getSizeYbymL2g();
            int round = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (positionInRoot >> 32)));
            int round2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
            int round3 = ((int) (mo7361getSizeYbymL2g2 >> 32)) - java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U >> 32)));
            int round4 = ((int) (mo7361getSizeYbymL2g2 & 4294967295L)) - java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U & 4294967295L)));
            androidx.compose.foundation.layout.InsetsValues value$foundation_layout = recalculateWindowInsetsModifierNode.getHighSpeedVideoFpsRangesFor.getValue$foundation_layout();
            if (value$foundation_layout.getLeft() != round || value$foundation_layout.getTop() != round2 || value$foundation_layout.getRight() != round3 || value$foundation_layout.getBottom() != round4) {
                recalculateWindowInsetsModifierNode.getHighSpeedVideoFpsRangesFor.setValue$foundation_layout(new androidx.compose.foundation.layout.InsetsValues(round, round2, round3, round4));
                recalculateWindowInsetsModifierNode.insetsInvalidated();
            }
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, i2)), 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }
}
