package androidx.compose.foundation;

/* compiled from: Background.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\f\u0010$\u001a\u00020%*\u00020&H\u0016J\f\u0010'\u001a\u00020%*\u00020&H\u0002J\f\u0010(\u001a\u00020%*\u00020&H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/BackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "color", "Landroidx/compose/ui/graphics/Color;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "(JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "J", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "lastShape", "lastSize", "Landroidx/compose/ui/geometry/Size;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawOutline", "drawRect", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {
    private float alpha;
    private androidx.compose.ui.graphics.Brush brush;
    private long color;
    private androidx.compose.ui.unit.LayoutDirection lastLayoutDirection;
    private androidx.compose.ui.graphics.Outline lastOutline;
    private androidx.compose.ui.graphics.Shape lastShape;
    private androidx.compose.ui.geometry.Size lastSize;
    private androidx.compose.ui.graphics.Shape shape;

    public /* synthetic */ BackgroundNode(long j, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, brush, f, shape);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m214setColor8_81llA(long j) {
        this.color = j;
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(androidx.compose.ui.graphics.Brush brush) {
        this.brush = brush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    public final void setShape(androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    private BackgroundNode(long j, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shape shape) {
        this.color = j;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        if (this.shape == androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    private final void drawRect(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.color, androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU())) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        androidx.compose.ui.graphics.Brush brush = this.brush;
        if (brush != null) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2671drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final void drawOutline(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI;
        if (androidx.compose.ui.geometry.Size.m1935equalsimpl(contentDrawScope.mo2592getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && kotlin.jvm.internal.Intrinsics.areEqual(this.lastShape, this.shape)) {
            mo262createOutlinePq9zytI = this.lastOutline;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mo262createOutlinePq9zytI);
        } else {
            mo262createOutlinePq9zytI = this.shape.mo262createOutlinePq9zytI(contentDrawScope.mo2592getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.color, androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU())) {
            androidx.compose.ui.graphics.OutlineKt.m2379drawOutlinewDX37Ww(contentDrawScope, mo262createOutlinePq9zytI, this.color, (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : 0);
        }
        androidx.compose.ui.graphics.Brush brush = this.brush;
        if (brush != null) {
            androidx.compose.ui.graphics.OutlineKt.m2378drawOutlinehn5TExg$default(contentDrawScope, mo262createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = mo262createOutlinePq9zytI;
        this.lastSize = androidx.compose.ui.geometry.Size.m1928boximpl(contentDrawScope.mo2592getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
    }
}
