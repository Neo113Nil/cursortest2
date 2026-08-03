package androidx.compose.ui.graphics;

/* compiled from: Canvas.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H&J0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016JH\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J0\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J*\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J*\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b0\u00101JJ\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010@\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H&J0\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020(0F2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ*\u0010I\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020J2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010M\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J@\u0010N\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J*\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020\u0003H&J\b\u0010Y\u001a\u00020\u0003H&J\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0010H&J\b\u0010\\\u001a\u00020\u0003H&J\u0018\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H&J\u001a\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\b\b\u0002\u0010a\u001a\u00020\u0010H&J\u0018\u0010b\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H&J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u0010H\u0016J\u0018\u0010f\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u0010H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006iÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawArcRad", "startAngleRad", "sweepAngleRad", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", com.helpshift.proactive.InAppViewConstants.RADIUS, "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "scale", "sx", "sy", "skew", "skewRad", "sxRad", "syRad", "translate", "dx", "dy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Canvas {
    /* renamed from: clipPath-mtrdD-E */
    void mo1965clipPathmtrdDE(androidx.compose.ui.graphics.Path path, int clipOp);

    /* renamed from: clipRect-N_I0leg */
    void mo1966clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp);

    /* renamed from: clipRect-mtrdD-E */
    void mo1967clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int clipOp);

    /* renamed from: concat-58bKbWc */
    void mo1968concat58bKbWc(float[] matrix);

    void disableZ();

    void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, androidx.compose.ui.graphics.Paint paint);

    void drawArc(androidx.compose.ui.geometry.Rect rect, float startAngle, float sweepAngle, boolean useCenter, androidx.compose.ui.graphics.Paint paint);

    void drawArcRad(androidx.compose.ui.geometry.Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo1969drawCircle9KIMszo(long center, float radius, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo1970drawImaged4ec7I(androidx.compose.ui.graphics.ImageBitmap image, long topLeftOffset, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo1971drawImageRectHPBpro0(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo1972drawLineWko1d7g(long p1, long p2, androidx.compose.ui.graphics.Paint paint);

    void drawOval(float left, float top, float right, float bottom, androidx.compose.ui.graphics.Paint paint);

    void drawOval(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint);

    void drawPath(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo1973drawPointsO7TthRY(int pointMode, java.util.List<androidx.compose.ui.geometry.Offset> points, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo1974drawRawPointsO7TthRY(int pointMode, float[] points, androidx.compose.ui.graphics.Paint paint);

    void drawRect(float left, float top, float right, float bottom, androidx.compose.ui.graphics.Paint paint);

    void drawRect(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint);

    void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, androidx.compose.ui.graphics.Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo1975drawVerticesTPEHhCM(androidx.compose.ui.graphics.Vertices vertices, int blendMode, androidx.compose.ui.graphics.Paint paint);

    void enableZ();

    void restore();

    void rotate(float degrees);

    void save();

    void saveLayer(androidx.compose.ui.geometry.Rect bounds, androidx.compose.ui.graphics.Paint paint);

    void scale(float sx, float sy);

    void skew(float sx, float sy);

    void skewRad(float sxRad, float syRad);

    void translate(float dx, float dy);

    /* compiled from: Canvas.kt */
    /* renamed from: androidx.compose.ui.graphics.Canvas$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void scale$default(androidx.compose.ui.graphics.Canvas canvas, float f, float f2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
            }
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
        }

        public static void $default$skewRad(androidx.compose.ui.graphics.Canvas _this, float f, float f2) {
            _this.skew(androidx.compose.ui.graphics.DegreesKt.degrees(f), androidx.compose.ui.graphics.DegreesKt.degrees(f2));
        }

        /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m2087clipRectmtrdDE$default(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
            }
            canvas.mo1967clipRectmtrdDE(rect, i);
        }

        /* renamed from: $default$clipRect-mtrdD-E, reason: not valid java name */
        public static void m2083$default$clipRectmtrdDE(androidx.compose.ui.graphics.Canvas _this, androidx.compose.ui.geometry.Rect rect, int i) {
            _this.mo1966clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
        }

        /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m2086clipRectN_I0leg$default(androidx.compose.ui.graphics.Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i2 & 16) != 0) {
                i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
            }
            canvas.mo1966clipRectN_I0leg(f, f2, f3, f4, i);
        }

        /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m2085clipPathmtrdDE$default(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Path path, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
            }
            canvas.mo1965clipPathmtrdDE(path, i);
        }

        public static void $default$drawRect(androidx.compose.ui.graphics.Canvas _this, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint) {
            _this.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void $default$drawOval(androidx.compose.ui.graphics.Canvas _this, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint) {
            _this.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void $default$drawArc(androidx.compose.ui.graphics.Canvas _this, androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, androidx.compose.ui.graphics.Paint paint) {
            _this.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
        }

        public static void $default$drawArcRad(androidx.compose.ui.graphics.Canvas _this, androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, androidx.compose.ui.graphics.Paint paint) {
            _this.drawArc(rect, androidx.compose.ui.graphics.DegreesKt.degrees(f), androidx.compose.ui.graphics.DegreesKt.degrees(f2), z, paint);
        }

        /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
        public static /* synthetic */ void m2088drawImageRectHPBpro0$default(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, androidx.compose.ui.graphics.Paint paint, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
            }
            long m4620getZeronOccac = (i & 2) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j;
            long IntSize = (i & 4) != 0 ? androidx.compose.ui.unit.IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
            canvas.mo1971drawImageRectHPBpro0(imageBitmap, m4620getZeronOccac, IntSize, (i & 8) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j3, (i & 16) != 0 ? IntSize : j4, paint);
        }
    }

    /* compiled from: Canvas.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void skewRad(androidx.compose.ui.graphics.Canvas canvas, float f, float f2) {
            androidx.compose.ui.graphics.Canvas.CC.$default$skewRad(canvas, f, f2);
        }

        @java.lang.Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m2091clipRectmtrdDE(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, int i) {
            androidx.compose.ui.graphics.Canvas.CC.m2083$default$clipRectmtrdDE(canvas, rect, i);
        }

        @java.lang.Deprecated
        public static void drawRect(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint) {
            androidx.compose.ui.graphics.Canvas.CC.$default$drawRect(canvas, rect, paint);
        }

        @java.lang.Deprecated
        public static void drawOval(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Paint paint) {
            androidx.compose.ui.graphics.Canvas.CC.$default$drawOval(canvas, rect, paint);
        }

        @java.lang.Deprecated
        public static void drawArc(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, androidx.compose.ui.graphics.Paint paint) {
            androidx.compose.ui.graphics.Canvas.CC.$default$drawArc(canvas, rect, f, f2, z, paint);
        }

        @java.lang.Deprecated
        public static void drawArcRad(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, androidx.compose.ui.graphics.Paint paint) {
            androidx.compose.ui.graphics.Canvas.CC.$default$drawArcRad(canvas, rect, f, f2, z, paint);
        }
    }
}
