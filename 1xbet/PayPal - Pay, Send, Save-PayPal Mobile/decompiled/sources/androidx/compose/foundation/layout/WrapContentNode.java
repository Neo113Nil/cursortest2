package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u0015\u0010\u001bR.\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\"\u0004\b\u001d\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "p0", "", "p1", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "p2", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/Direction;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/layout/Direction;)V", "getHighSpeedVideoSizes", "Z", "(Z)V", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WrapContentNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.Direction getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public WrapContentNode(androidx.compose.foundation.layout.Direction direction, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset> function2) {
        this.getHighSpeedVideoSizes = direction;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.Direction direction) {
        this.getHighSpeedVideoSizes = direction;
    }

    public final void getHighSpeedVideoFpsRanges(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset> function2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(this.getHighSpeedVideoSizes != androidx.compose.foundation.layout.Direction.Vertical ? 0 : androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), (this.getHighSpeedVideoSizes == androidx.compose.foundation.layout.Direction.Vertical || !this.Camera2StreamConfigurationMap) ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : Integer.MAX_VALUE, this.getHighSpeedVideoSizes == androidx.compose.foundation.layout.Direction.Horizontal ? androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) : 0, (this.getHighSpeedVideoSizes == androidx.compose.foundation.layout.Direction.Horizontal || !this.Camera2StreamConfigurationMap) ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : Integer.MAX_VALUE));
        final int coerceIn = kotlin.ranges.RangesKt.coerceIn(mo7353measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        final int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(mo7353measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, coerceIn, coerceIn2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WrapContentNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.WrapContentNode.getHighSpeedVideoSizes(androidx.compose.foundation.layout.WrapContentNode.this, coerceIn, mo7353measureBRTryo0, coerceIn2, measureScope, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoSizes;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.layout.WrapContentNode wrapContentNode, int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope, placeable, wrapContentNode.getHighSpeedVideoFpsRangesFor.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl(((i2 - placeable.getHeight()) & 4294967295L) | ((i - placeable.getWidth()) << 32))), measureScope.getLayoutDirection()).m8738unboximpl(), 0.0f, 2, null);
        return kotlin.Unit.INSTANCE;
    }
}
