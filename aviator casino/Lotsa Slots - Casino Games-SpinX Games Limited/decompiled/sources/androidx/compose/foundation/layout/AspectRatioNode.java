package androidx.compose.foundation.layout;

/* compiled from: AspectRatio.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J \u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J \u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        long m494findSizeToXhtMw = m494findSizeToXhtMw(j);
        if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m494findSizeToXhtMw, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
            j = androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(m494findSizeToXhtMw), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(m494findSizeToXhtMw));
        }
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        if (i != Integer.MAX_VALUE) {
            return kotlin.math.MathKt.roundToInt(i * this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return kotlin.math.MathKt.roundToInt(i * this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return kotlin.math.MathKt.roundToInt(i / this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return kotlin.math.MathKt.roundToInt(i / this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m494findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m498tryMaxWidthJN0ABg$default = m498tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m498tryMaxWidthJN0ABg$default, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m498tryMaxWidthJN0ABg$default;
            }
            long m496tryMaxHeightJN0ABg$default = m496tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m496tryMaxHeightJN0ABg$default, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m496tryMaxHeightJN0ABg$default;
            }
            long m502tryMinWidthJN0ABg$default = m502tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m502tryMinWidthJN0ABg$default, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m502tryMinWidthJN0ABg$default;
            }
            long m500tryMinHeightJN0ABg$default = m500tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m500tryMinHeightJN0ABg$default, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m500tryMinHeightJN0ABg$default;
            }
            long m497tryMaxWidthJN0ABg = m497tryMaxWidthJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m497tryMaxWidthJN0ABg, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m497tryMaxWidthJN0ABg;
            }
            long m495tryMaxHeightJN0ABg = m495tryMaxHeightJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m495tryMaxHeightJN0ABg, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m495tryMaxHeightJN0ABg;
            }
            long m501tryMinWidthJN0ABg = m501tryMinWidthJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m501tryMinWidthJN0ABg, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m501tryMinWidthJN0ABg;
            }
            long m499tryMinHeightJN0ABg = m499tryMinHeightJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m499tryMinHeightJN0ABg, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m499tryMinHeightJN0ABg;
            }
        } else {
            long m496tryMaxHeightJN0ABg$default2 = m496tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m496tryMaxHeightJN0ABg$default2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m496tryMaxHeightJN0ABg$default2;
            }
            long m498tryMaxWidthJN0ABg$default2 = m498tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m498tryMaxWidthJN0ABg$default2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m498tryMaxWidthJN0ABg$default2;
            }
            long m500tryMinHeightJN0ABg$default2 = m500tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m500tryMinHeightJN0ABg$default2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m500tryMinHeightJN0ABg$default2;
            }
            long m502tryMinWidthJN0ABg$default2 = m502tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m502tryMinWidthJN0ABg$default2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m502tryMinWidthJN0ABg$default2;
            }
            long m495tryMaxHeightJN0ABg2 = m495tryMaxHeightJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m495tryMaxHeightJN0ABg2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m495tryMaxHeightJN0ABg2;
            }
            long m497tryMaxWidthJN0ABg2 = m497tryMaxWidthJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m497tryMaxWidthJN0ABg2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m497tryMaxWidthJN0ABg2;
            }
            long m499tryMinHeightJN0ABg2 = m499tryMinHeightJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m499tryMinHeightJN0ABg2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m499tryMinHeightJN0ABg2;
            }
            long m501tryMinWidthJN0ABg2 = m501tryMinWidthJN0ABg(j, false);
            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(m501tryMinWidthJN0ABg2, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                return m501tryMinWidthJN0ABg2;
            }
        }
        return androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m498tryMaxWidthJN0ABg$default(androidx.compose.foundation.layout.AspectRatioNode aspectRatioNode, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m497tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m497tryMaxWidthJN0ABg(long j, boolean z) {
        int roundToInt;
        int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        if (m4424getMaxWidthimpl != Integer.MAX_VALUE && (roundToInt = kotlin.math.MathKt.roundToInt(m4424getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(m4424getMaxWidthimpl, roundToInt);
            if (!z || androidx.compose.ui.unit.ConstraintsKt.m4439isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m496tryMaxHeightJN0ABg$default(androidx.compose.foundation.layout.AspectRatioNode aspectRatioNode, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m495tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m495tryMaxHeightJN0ABg(long j, boolean z) {
        int roundToInt;
        int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
        if (m4423getMaxHeightimpl != Integer.MAX_VALUE && (roundToInt = kotlin.math.MathKt.roundToInt(m4423getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(roundToInt, m4423getMaxHeightimpl);
            if (!z || androidx.compose.ui.unit.ConstraintsKt.m4439isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m502tryMinWidthJN0ABg$default(androidx.compose.foundation.layout.AspectRatioNode aspectRatioNode, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m501tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m501tryMinWidthJN0ABg(long j, boolean z) {
        int m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        int roundToInt = kotlin.math.MathKt.roundToInt(m4426getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(m4426getMinWidthimpl, roundToInt);
            if (!z || androidx.compose.ui.unit.ConstraintsKt.m4439isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m500tryMinHeightJN0ABg$default(androidx.compose.foundation.layout.AspectRatioNode aspectRatioNode, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m499tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m499tryMinHeightJN0ABg(long j, boolean z) {
        int m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
        int roundToInt = kotlin.math.MathKt.roundToInt(m4425getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(roundToInt, m4425getMinHeightimpl);
            if (!z || androidx.compose.ui.unit.ConstraintsKt.m4439isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }
}
