package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001b\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0019\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0018\"\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "(F)V", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UnspecifiedConstraintsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRangesFor;

    private UnspecifiedConstraintsNode(float f, float f2) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }

    public final void getHighSpeedVideoFpsRangesFor(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public final void getHighSpeedVideoFpsRanges(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int m8556getMinWidthimpl;
        int m8555getMinHeightimpl;
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) == 0) {
            int i = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges);
            m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
            if (i < 0) {
                i = 0;
            }
            if (i <= m8556getMinWidthimpl) {
                m8556getMinWidthimpl = i;
            }
        } else {
            m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        }
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) == 0) {
            int i2 = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor);
            m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            int i3 = i2 >= 0 ? i2 : 0;
            if (i3 <= m8555getMinHeightimpl) {
                m8555getMinHeightimpl = i3;
            }
        } else {
            m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(m8556getMinWidthimpl, m8554getMaxWidthimpl, m8555getMinHeightimpl, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.UnspecifiedConstraintsNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        int i2 = !java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) ? intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges) : 0;
        return minIntrinsicWidth < i2 ? i2 : minIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        int i2 = !java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) ? intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges) : 0;
        return maxIntrinsicWidth < i2 ? i2 : maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        int i2 = !java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor) : 0;
        return minIntrinsicHeight < i2 ? i2 : minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        int i2 = !java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor) : 0;
        return maxIntrinsicHeight < i2 ? i2 : maxIntrinsicHeight;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
