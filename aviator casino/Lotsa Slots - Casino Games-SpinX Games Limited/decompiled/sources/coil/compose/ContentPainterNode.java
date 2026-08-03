package coil.compose;

/* compiled from: ContentPainterModifier.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010(\u001a\u00020)*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001c\u00101\u001a\u000202*\u0002032\u0006\u0010+\u001a\u0002042\u0006\u00105\u001a\u000202H\u0016J\u001c\u00106\u001a\u000202*\u0002032\u0006\u0010+\u001a\u0002042\u0006\u00105\u001a\u000202H\u0016J\u001c\u00107\u001a\u000202*\u0002032\u0006\u0010+\u001a\u0002042\u0006\u00108\u001a\u000202H\u0016J\u001c\u00109\u001a\u000202*\u0002032\u0006\u0010+\u001a\u0002042\u0006\u00108\u001a\u000202H\u0016J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002¢\u0006\u0004\b@\u0010>J\f\u0010A\u001a\u00020B*\u00020CH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006D"}, d2 = {"Lcoil/compose/ContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "maxIntrinsicWidth", "minIntrinsicHeight", "width", "maxIntrinsicHeight", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "modifyConstraints-ZezNO4M", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentPainterNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.Alignment alignment;
    private float alpha;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private androidx.compose.ui.layout.ContentScale contentScale;
    private androidx.compose.ui.graphics.painter.Painter painter;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(androidx.compose.ui.graphics.painter.Painter painter) {
        this.painter = painter;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(androidx.compose.ui.Alignment alignment) {
        this.alignment = alignment;
    }

    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(androidx.compose.ui.layout.ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public ContentPainterNode(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(m4960modifyConstraintsZezNO4M(j));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: coil.compose.ContentPainterNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = coil.compose.ContentPainterNode.measure_3p2s80s$lambda$0(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit measure_3p2s80s$lambda$0(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m4960modifyConstraintsZezNO4M(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return java.lang.Math.max(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(minIntrinsicWidth, i)))), minIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m4960modifyConstraintsZezNO4M(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return java.lang.Math.max(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(maxIntrinsicWidth, i)))), maxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m4960modifyConstraintsZezNO4M(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return java.lang.Math.max(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(i, minIntrinsicHeight)))), minIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m4960modifyConstraintsZezNO4M(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return java.lang.Math.max(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(i, maxIntrinsicHeight)))), maxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m4959calculateScaledSizeE7KxVPU(long dstSize) {
        if (androidx.compose.ui.geometry.Size.m1942isEmptyimpl(dstSize)) {
            return androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            return dstSize;
        }
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(intrinsicSize);
        if (java.lang.Float.isInfinite(m1940getWidthimpl) || java.lang.Float.isNaN(m1940getWidthimpl)) {
            m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(dstSize);
        }
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(intrinsicSize);
        if (java.lang.Float.isInfinite(m1937getHeightimpl) || java.lang.Float.isNaN(m1937getHeightimpl)) {
            m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(dstSize);
        }
        long Size = androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl);
        long mo3393computeScaleFactorH7hwNQA = this.contentScale.mo3393computeScaleFactorH7hwNQA(Size, dstSize);
        float m3475getScaleXimpl = androidx.compose.ui.layout.ScaleFactor.m3475getScaleXimpl(mo3393computeScaleFactorH7hwNQA);
        if (java.lang.Float.isInfinite(m3475getScaleXimpl) || java.lang.Float.isNaN(m3475getScaleXimpl)) {
            return dstSize;
        }
        float m3476getScaleYimpl = androidx.compose.ui.layout.ScaleFactor.m3476getScaleYimpl(mo3393computeScaleFactorH7hwNQA);
        return (java.lang.Float.isInfinite(m3476getScaleYimpl) || java.lang.Float.isNaN(m3476getScaleYimpl)) ? dstSize : androidx.compose.ui.layout.ScaleFactorKt.m3491timesmw2e94(mo3393computeScaleFactorH7hwNQA, Size);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m4960modifyConstraintsZezNO4M(long constraints) {
        float m4426getMinWidthimpl;
        int m4425getMinHeightimpl;
        float m4994constrainHeightK40F9xA;
        boolean m4422getHasFixedWidthimpl = androidx.compose.ui.unit.Constraints.m4422getHasFixedWidthimpl(constraints);
        boolean m4421getHasFixedHeightimpl = androidx.compose.ui.unit.Constraints.m4421getHasFixedHeightimpl(constraints);
        if (m4422getHasFixedWidthimpl && m4421getHasFixedHeightimpl) {
            return constraints;
        }
        boolean z = androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(constraints) && androidx.compose.ui.unit.Constraints.m4419getHasBoundedHeightimpl(constraints);
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            return z ? androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(constraints, androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints), 0, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints), 0, 10, null) : constraints;
        }
        if (z && (m4422getHasFixedWidthimpl || m4421getHasFixedHeightimpl)) {
            m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints);
            m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints);
        } else {
            float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(intrinsicSize);
            float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(intrinsicSize);
            m4426getMinWidthimpl = (java.lang.Float.isInfinite(m1940getWidthimpl) || java.lang.Float.isNaN(m1940getWidthimpl)) ? androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(constraints) : coil.compose.UtilsKt.m4995constrainWidthK40F9xA(constraints, m1940getWidthimpl);
            if (java.lang.Float.isInfinite(m1937getHeightimpl) || java.lang.Float.isNaN(m1937getHeightimpl)) {
                m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(constraints);
            } else {
                m4994constrainHeightK40F9xA = coil.compose.UtilsKt.m4994constrainHeightK40F9xA(constraints, m1937getHeightimpl);
                long m4959calculateScaledSizeE7KxVPU = m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(m4426getMinWidthimpl, m4994constrainHeightK40F9xA));
                return androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(constraints, androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(constraints, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4959calculateScaledSizeE7KxVPU))), 0, androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(constraints, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4959calculateScaledSizeE7KxVPU))), 0, 10, null);
            }
        }
        m4994constrainHeightK40F9xA = m4425getMinHeightimpl;
        long m4959calculateScaledSizeE7KxVPU2 = m4959calculateScaledSizeE7KxVPU(androidx.compose.ui.geometry.SizeKt.Size(m4426getMinWidthimpl, m4994constrainHeightK40F9xA));
        return androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(constraints, androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(constraints, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4959calculateScaledSizeE7KxVPU2))), 0, androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(constraints, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4959calculateScaledSizeE7KxVPU2))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        long m4959calculateScaledSizeE7KxVPU = m4959calculateScaledSizeE7KxVPU(contentDrawScope.mo2592getSizeNHjbRc());
        long mo1748alignKFBX0sM = this.alignment.mo1748alignKFBX0sM(coil.compose.UtilsKt.m4997toIntSizeuvyYCjk(m4959calculateScaledSizeE7KxVPU), coil.compose.UtilsKt.m4997toIntSizeuvyYCjk(contentDrawScope.mo2592getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        float m4602component1impl = androidx.compose.ui.unit.IntOffset.m4602component1impl(mo1748alignKFBX0sM);
        float m4603component2impl = androidx.compose.ui.unit.IntOffset.m4603component2impl(mo1748alignKFBX0sM);
        contentDrawScope2.getDrawContext().getTransform().translate(m4602component1impl, m4603component2impl);
        this.painter.m2751drawx_KDEd0(contentDrawScope2, m4959calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope2.getDrawContext().getTransform().translate(-m4602component1impl, -m4603component2impl);
        contentDrawScope.drawContent();
    }
}
