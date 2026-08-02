package androidx.compose.ui.graphics.painter;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/graphics/painter/BrushPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/Brush;", "brush", "<init>", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/ColorFilter;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrushPainter extends androidx.compose.ui.graphics.painter.Painter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.ColorFilter getHighSpeedVideoSizes;
    private final androidx.compose.ui.graphics.Brush brush;
    private float getHighResolutionOutputSizeshNQ4ISI = 1.0f;

    public BrushPainter(androidx.compose.ui.graphics.Brush brush) {
        this.brush = brush;
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return this.brush.getIntrinsicSize();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.drawscope.DrawScope.m6525drawRectAsUm42w$default(drawScope, this.brush, 0L, 0L, this.getHighResolutionOutputSizeshNQ4ISI, null, this.getHighSpeedVideoSizes, 0, 86, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final boolean applyAlpha(float alpha) {
        this.getHighResolutionOutputSizeshNQ4ISI = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected final boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getHighSpeedVideoSizes = colorFilter;
        return true;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.graphics.painter.BrushPainter) && kotlin.jvm.internal.Intrinsics.areEqual(this.brush, ((androidx.compose.ui.graphics.painter.BrushPainter) other).brush);
    }

    public final int hashCode() {
        return this.brush.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BrushPainter(brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }
}
