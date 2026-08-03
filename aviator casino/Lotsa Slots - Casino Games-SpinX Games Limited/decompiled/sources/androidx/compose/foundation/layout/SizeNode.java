package androidx.compose.foundation.layout;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "Landroidx/compose/ui/unit/Dp;", com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f4, z, null);
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m633setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m632setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m631setMaxWidth0680j_4(float f) {
        this.maxWidth = f;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m630setMaxHeight0680j_4(float f) {
        this.maxHeight = f;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    private SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m625getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density density) {
        int i;
        int coerceAtLeast;
        int i2 = 0;
        int coerceAtLeast2 = !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.maxWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? kotlin.ranges.RangesKt.coerceAtLeast(density.mo309roundToPx0680j_4(this.maxWidth), 0) : Integer.MAX_VALUE;
        int coerceAtLeast3 = !androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.maxHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? kotlin.ranges.RangesKt.coerceAtLeast(density.mo309roundToPx0680j_4(this.maxHeight), 0) : Integer.MAX_VALUE;
        if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) || (i = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(density.mo309roundToPx0680j_4(this.minWidth), coerceAtLeast2), 0)) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) && (coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(density.mo309roundToPx0680j_4(this.minHeight), coerceAtLeast3), 0)) != Integer.MAX_VALUE) {
            i2 = coerceAtLeast;
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(i, coerceAtLeast2, i2, coerceAtLeast3);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int coerceAtMost;
        int coerceAtLeast;
        int coerceAtMost2;
        int coerceAtLeast2;
        long Constraints;
        long m625getTargetConstraintsOenEA2s = m625getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = androidx.compose.ui.unit.ConstraintsKt.m4436constrainN9IONVI(j, m625getTargetConstraintsOenEA2s);
        } else {
            if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
                coerceAtMost = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(m625getTargetConstraintsOenEA2s);
            } else {
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m625getTargetConstraintsOenEA2s));
            }
            if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.maxWidth, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
                coerceAtLeast = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m625getTargetConstraintsOenEA2s);
            } else {
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(m625getTargetConstraintsOenEA2s));
            }
            if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.minHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
                coerceAtMost2 = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(m625getTargetConstraintsOenEA2s);
            } else {
                coerceAtMost2 = kotlin.ranges.RangesKt.coerceAtMost(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m625getTargetConstraintsOenEA2s));
            }
            if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.maxHeight, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
                coerceAtLeast2 = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m625getTargetConstraintsOenEA2s);
            } else {
                coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(m625getTargetConstraintsOenEA2s));
            }
            Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(coerceAtMost, coerceAtLeast, coerceAtMost2, coerceAtLeast2);
        }
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(Constraints);
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long m625getTargetConstraintsOenEA2s = m625getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (androidx.compose.ui.unit.Constraints.m4422getHasFixedWidthimpl(m625getTargetConstraintsOenEA2s)) {
            return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m625getTargetConstraintsOenEA2s);
        }
        return androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(m625getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m625getTargetConstraintsOenEA2s = m625getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (androidx.compose.ui.unit.Constraints.m4421getHasFixedHeightimpl(m625getTargetConstraintsOenEA2s)) {
            return androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m625getTargetConstraintsOenEA2s);
        }
        return androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(m625getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m625getTargetConstraintsOenEA2s = m625getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (androidx.compose.ui.unit.Constraints.m4422getHasFixedWidthimpl(m625getTargetConstraintsOenEA2s)) {
            return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m625getTargetConstraintsOenEA2s);
        }
        return androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(m625getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m625getTargetConstraintsOenEA2s = m625getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (androidx.compose.ui.unit.Constraints.m4421getHasFixedHeightimpl(m625getTargetConstraintsOenEA2s)) {
            return androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m625getTargetConstraintsOenEA2s);
        }
        return androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(m625getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }
}
