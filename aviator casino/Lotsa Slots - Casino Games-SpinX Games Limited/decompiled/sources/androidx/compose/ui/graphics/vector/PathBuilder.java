package androidx.compose.ui.graphics.vector;

/* compiled from: PathBuilder.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ>\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\u0000J6\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ6\u0010 \u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\rJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\rJ\u0016\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rJ\u0016\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rJ\u0016\u0010-\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rJ\u0016\u0010.\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rJ&\u0010/\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rJ&\u00100\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ&\u00101\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rJ&\u00102\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0016\u00103\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0016\u00104\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u00105\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\rJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\rR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "()V", "_nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "getNodes", "()Ljava/util/List;", "arcTo", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "x1", "y1", "arcToRelative", "a", "b", "dx1", "dy1", "close", "curveTo", "x2", "y2", "x3", "y3", "curveToRelative", "dx2", "dy2", "dx3", "dy3", "horizontalLineTo", "x", "horizontalLineToRelative", "dx", "lineTo", "y", "lineToRelative", "dy", "moveTo", "moveToRelative", "quadTo", "quadToRelative", "reflectiveCurveTo", "reflectiveCurveToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "verticalLineTo", "verticalLineToRelative", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathBuilder {
    private final java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> _nodes = new java.util.ArrayList<>(32);

    public final java.util.List<androidx.compose.ui.graphics.vector.PathNode> getNodes() {
        return this._nodes;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder close() {
        this._nodes.add(androidx.compose.ui.graphics.vector.PathNode.Close.INSTANCE);
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder moveTo(float x, float y) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.MoveTo(x, y));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder moveToRelative(float dx, float dy) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo(dx, dy));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder lineTo(float x, float y) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.LineTo(x, y));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder lineToRelative(float dx, float dy) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo(dx, dy));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder horizontalLineTo(float x) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.HorizontalTo(x));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder horizontalLineToRelative(float dx) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo(dx));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder verticalLineTo(float y) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.VerticalTo(y));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder verticalLineToRelative(float dy) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo(dy));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder curveTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.CurveTo(x1, y1, x2, y2, x3, y3));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder curveToRelative(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder reflectiveCurveTo(float x1, float y1, float x2, float y2) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo(x1, y1, x2, y2));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder reflectiveCurveToRelative(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder quadTo(float x1, float y1, float x2, float y2) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.QuadTo(x1, y1, x2, y2));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder quadToRelative(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo(dx1, dy1, dx2, dy2));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder reflectiveQuadTo(float x1, float y1) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo(x1, y1));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder reflectiveQuadToRelative(float dx1, float dy1) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo(dx1, dy1));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder arcTo(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x1, float y1) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x1, y1));
        return this;
    }

    public final androidx.compose.ui.graphics.vector.PathBuilder arcToRelative(float a2, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
        this._nodes.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo(a2, b, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
        return this;
    }
}
