package androidx.compose.foundation.layout;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "Landroidx/compose/ui/unit/Dp;", com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "setMinHeight-0680j_4", "(F)V", "F", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f2, null);
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m639setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m638setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    private UnspecifiedConstraintsNode(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int m4426getMinWidthimpl;
        int m4425getMinHeightimpl;
        if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) && androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) == 0) {
            m4426getMinWidthimpl = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo309roundToPx0680j_4(this.minWidth), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)), 0);
        } else {
            m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        }
        int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) && androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) == 0) {
            m4425getMinHeightimpl = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo309roundToPx0680j_4(this.minHeight), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)), 0);
        } else {
            m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
        }
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(m4426getMinWidthimpl, m4424getMaxWidthimpl, m4425getMinHeightimpl, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return kotlin.ranges.RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicWidth(i), !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo309roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return kotlin.ranges.RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicWidth(i), !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo309roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return kotlin.ranges.RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicHeight(i), !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo309roundToPx0680j_4(this.minHeight) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return kotlin.ranges.RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicHeight(i), !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo309roundToPx0680j_4(this.minHeight) : 0);
    }
}
