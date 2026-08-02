package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 l2\u00020\u0001:\u0002mlJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ/\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H'¢\u0006\u0004\b,\u0010-J!\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b,\u00100J\u0017\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020!H'¢\u0006\u0004\b2\u0010-J!\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203H'¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b5\u00107J'\u00108\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b:\u00109J!\u0010@\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\u0005H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0005H&¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0005H\u0016¢\u0006\u0004\bD\u0010BJ\u0017\u0010G\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\bE\u0010FJ\u0017\u0010L\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020!H&¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OH\u0096\u0002¢\u0006\u0004\bP\u0010QJ!\u0010P\u001a\u00020O2\u0006\u0010S\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010UJ'\u0010\\\u001a\u00020%2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020XH&¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b_\u0010^J\u0018\u0010`\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b`\u0010^J\u0018\u0010a\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\ba\u0010^J\u0018\u0010b\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\bb\u0010^R\u001c\u0010h\u001a\u00020c8'@'X¦\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010jø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "x", "y", "", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "relativeQuadraticTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "arcToRad", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "startAngleDegrees", "sweepAngleDegrees", "arcTo", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "path", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/PathIterator;", "iterator", "()Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "tolerance", "(Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "plus", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "minus", "or", "and", "xor", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isEmpty", "Companion", "Direction"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Path {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Path.Companion INSTANCE = androidx.compose.ui.graphics.Path.Companion.getHighSpeedVideoSizes;

    void addArc(androidx.compose.ui.geometry.Rect oval, float startAngleDegrees, float sweepAngleDegrees);

    void addArcRad(androidx.compose.ui.geometry.Rect oval, float startAngleRadians, float sweepAngleRadians);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @kotlin.ReplaceWith(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(androidx.compose.ui.geometry.Rect oval);

    void addOval(androidx.compose.ui.geometry.Rect oval, androidx.compose.ui.graphics.Path.Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo5884addPathUv8p0NA(androidx.compose.ui.graphics.Path path, long offset);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @kotlin.ReplaceWith(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(androidx.compose.ui.geometry.Rect rect);

    void addRect(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Path.Direction direction);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @kotlin.ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(androidx.compose.ui.geometry.RoundRect roundRect);

    void addRoundRect(androidx.compose.ui.geometry.RoundRect roundRect, androidx.compose.ui.graphics.Path.Direction direction);

    void arcTo(androidx.compose.ui.geometry.Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo);

    void close();

    void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3);

    androidx.compose.ui.geometry.Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo5885getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float x, float y);

    void moveTo(float x, float y);

    /* renamed from: op-N5in7k0 */
    boolean mo5886opN5in7k0(androidx.compose.ui.graphics.Path path1, androidx.compose.ui.graphics.Path path2, int operation);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @kotlin.ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float x1, float y1, float x2, float y2);

    void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    void relativeLineTo(float dx, float dy);

    void relativeMoveTo(float dx, float dy);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @kotlin.ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo5887setFillTypeoQ8Xj4U(int i);

    /* renamed from: transform-58bKbWc */
    default void mo5888transform58bKbWc(float[] matrix) {
    }

    /* renamed from: translate-k-4lQ0M */
    void mo5889translatek4lQ0M(long offset);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        private static final /* synthetic */ androidx.compose.ui.graphics.Path.Direction[] getHighSpeedVideoFpsRangesFor;
        public static final androidx.compose.ui.graphics.Path.Direction CounterClockwise = new androidx.compose.ui.graphics.Path.Direction("CounterClockwise", 0);
        public static final androidx.compose.ui.graphics.Path.Direction Clockwise = new androidx.compose.ui.graphics.Path.Direction("Clockwise", 1);

        private Direction(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.graphics.Path.Direction[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
        }

        public static androidx.compose.ui.graphics.Path.Direction[] values() {
            return (androidx.compose.ui.graphics.Path.Direction[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.compose.ui.graphics.Path.Direction valueOf(java.lang.String str) {
            return (androidx.compose.ui.graphics.Path.Direction) java.lang.Enum.valueOf(androidx.compose.ui.graphics.Path.Direction.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.compose.ui.graphics.Path.Direction> getEntries() {
            return Camera2StreamConfigurationMap;
        }

        private static final /* synthetic */ androidx.compose.ui.graphics.Path.Direction[] getHighSpeedVideoFpsRangesFor() {
            return new androidx.compose.ui.graphics.Path.Direction[]{CounterClockwise, Clockwise};
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void quadraticTo(androidx.compose.ui.graphics.Path path, float f, float f2, float f3, float f4) {
            androidx.compose.ui.graphics.Path.super.quadraticTo(f, f2, f3, f4);
        }

        @java.lang.Deprecated
        public static void relativeQuadraticTo(androidx.compose.ui.graphics.Path path, float f, float f2, float f3, float f4) {
            androidx.compose.ui.graphics.Path.super.relativeQuadraticTo(f, f2, f3, f4);
        }

        @java.lang.Deprecated
        public static void arcToRad(androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z) {
            androidx.compose.ui.graphics.Path.super.arcToRad(rect, f, f2, z);
        }

        @java.lang.Deprecated
        public static void rewind(androidx.compose.ui.graphics.Path path) {
            androidx.compose.ui.graphics.Path.super.rewind();
        }

        @java.lang.Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m6265transform58bKbWc(androidx.compose.ui.graphics.Path path, float[] fArr) {
            androidx.compose.ui.graphics.Path.super.mo5888transform58bKbWc(fArr);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.PathIterator iterator(androidx.compose.ui.graphics.Path path) {
            return androidx.compose.ui.graphics.Path.super.iterator();
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.PathIterator iterator(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float f) {
            return androidx.compose.ui.graphics.Path.super.iterator(conicEvaluation, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.Path plus(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
            return androidx.compose.ui.graphics.Path.super.plus(path2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.Path minus(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
            return androidx.compose.ui.graphics.Path.super.minus(path2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.Path or(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
            return androidx.compose.ui.graphics.Path.super.or(path2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.Path and(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
            return androidx.compose.ui.graphics.Path.super.and(path2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.Path xor(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
            return androidx.compose.ui.graphics.Path.super.xor(path2);
        }
    }

    default void quadraticTo(float x1, float y1, float x2, float y2) {
        quadraticBezierTo(x1, y1, x2, y2);
    }

    default void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
        relativeQuadraticBezierTo(dx1, dy1, dx2, dy2);
    }

    default void arcToRad(androidx.compose.ui.geometry.Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        arcTo(rect, androidx.compose.ui.graphics.DegreesKt.degrees(startAngleRadians), androidx.compose.ui.graphics.DegreesKt.degrees(sweepAngleRadians), forceMoveTo);
    }

    static /* synthetic */ void addRect$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Path.Direction direction, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = androidx.compose.ui.graphics.Path.Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addOval$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Path.Direction direction, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            direction = androidx.compose.ui.graphics.Path.Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.RoundRect roundRect, androidx.compose.ui.graphics.Path.Direction direction, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = androidx.compose.ui.graphics.Path.Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m6262addPathUv8p0NA$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        path.mo5884addPathUv8p0NA(path2, j);
    }

    default void rewind() {
        reset();
    }

    default androidx.compose.ui.graphics.PathIterator iterator() {
        return androidx.compose.ui.graphics.AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    static /* synthetic */ androidx.compose.ui.graphics.PathIterator iterator$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return path.iterator(conicEvaluation, f);
    }

    default androidx.compose.ui.graphics.PathIterator iterator(androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return androidx.compose.ui.graphics.AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, tolerance);
    }

    default androidx.compose.ui.graphics.Path plus(androidx.compose.ui.graphics.Path path) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.mo5886opN5in7k0(this, path, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6287getUnionb3I0S0c());
        return Path;
    }

    default androidx.compose.ui.graphics.Path minus(androidx.compose.ui.graphics.Path path) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.mo5886opN5in7k0(this, path, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6284getDifferenceb3I0S0c());
        return Path;
    }

    default androidx.compose.ui.graphics.Path or(androidx.compose.ui.graphics.Path path) {
        return plus(path);
    }

    default androidx.compose.ui.graphics.Path and(androidx.compose.ui.graphics.Path path) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.mo5886opN5in7k0(this, path, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6285getIntersectb3I0S0c());
        return Path;
    }

    default androidx.compose.ui.graphics.Path xor(androidx.compose.ui.graphics.Path path) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.mo5886opN5in7k0(this, path, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6288getXorb3I0S0c());
        return Path;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/PathOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Landroidx/compose/ui/graphics/Path;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "combine"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.Path.Companion getHighSpeedVideoSizes = new androidx.compose.ui.graphics.Path.Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final androidx.compose.ui.graphics.Path m6263combinexh6zSI8(int operation, androidx.compose.ui.graphics.Path path1, androidx.compose.ui.graphics.Path path2) {
            androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
            if (Path.mo5886opN5in7k0(path1, path2, operation)) {
                return Path;
            }
            throw new java.lang.IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }
}
