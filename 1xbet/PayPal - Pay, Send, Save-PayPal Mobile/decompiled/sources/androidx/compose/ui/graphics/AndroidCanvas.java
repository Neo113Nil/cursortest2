package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010/\u001a\u00020,*\u00020\"¢\u0006\u0004\b-\u0010.J'\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107JG\u0010:\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J7\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u00107J'\u0010A\u001a\u00020\u00042\u0006\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@JO\u0010F\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010E\u001a\u00020D2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010IJ'\u0010O\u001a\u00020\u00042\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ?\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020J2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020R2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ-\u0010_\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010\u0003J\u000f\u0010a\u001a\u00020\u0004H\u0016¢\u0006\u0004\ba\u0010\u0003J%\u0010c\u001a\u00020\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\bc\u0010dJ-\u0010f\u001a\u00020\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ'\u0010k\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020h2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bi\u0010jJ'\u0010f\u001a\u00020\u00042\u0006\u0010b\u001a\u00020h2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010lJ'\u0010m\u001a\u00020\u00042\u0006\u0010b\u001a\u00020h2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020eH\u0002¢\u0006\u0004\bm\u0010nJ'\u0010u\u001a\u00020\u00042\u0006\u0010p\u001a\u00020o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bs\u0010tR,\u0010x\u001a\u00060vj\u0002`w8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bx\u0010y\u0012\u0004\b~\u0010\u0003\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bf\u0010\u0081\u0001"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "p0", "getHighSpeedVideoSizes", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "([FLandroidx/compose/ui/graphics/Paint;)V", "getHighSpeedVideoFpsRanges", "([FLandroidx/compose/ui/graphics/Paint;I)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/getHighSpeedVideoSizes;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "Landroid/graphics/Rect;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Rect;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCanvas implements androidx.compose.ui.graphics.Canvas {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.graphics.Rect Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Canvas internalCanvas;

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getHighSpeedVideoFpsRangesFor;
        this.internalCanvas = canvas;
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void saveLayer(androidx.compose.ui.geometry.Rect bounds, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public final void mo5848concat58bKbWc(float[] matrix) {
        if (androidx.compose.ui.graphics.MatrixKt.m6247isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public final void mo5847clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m5856toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public final void mo5846clipPathmtrdDE(androidx.compose.ui.graphics.Path path, int clipOp) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            canvas.clipPath(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), m5856toRegionOp7u2Bmg(clipOp));
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final android.graphics.Region.Op m5856toRegionOp7u2Bmg(int i) {
        return androidx.compose.ui.graphics.ClipOp.m5980equalsimpl0(i, androidx.compose.ui.graphics.ClipOp.INSTANCE.m5984getDifferencertfAjoo()) ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public final void mo5852drawLineWko1d7g(long p1, long p2, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawLine(java.lang.Float.intBitsToFloat((int) (p1 >> 32)), java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (p2 >> 32)), java.lang.Float.intBitsToFloat((int) (p2 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRect(float left, float top, float right, float bottom, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawOval(float left, float top, float right, float bottom, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawOval(left, top, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public final void mo5849drawCircle9KIMszo(long center, float radius, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawCircle(java.lang.Float.intBitsToFloat((int) (center >> 32)), java.lang.Float.intBitsToFloat((int) (center & 4294967295L)), radius, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawPath(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            canvas.drawPath(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public final void mo5850drawImaged4ec7I(androidx.compose.ui.graphics.ImageBitmap image, long topLeftOffset, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawBitmap(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap(image), java.lang.Float.intBitsToFloat((int) (topLeftOffset >> 32)), java.lang.Float.intBitsToFloat((int) (topLeftOffset & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public final void mo5851drawImageRectHPBpro0(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, androidx.compose.ui.graphics.Paint paint) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        android.graphics.Bitmap asAndroidBitmap = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        android.graphics.Rect rect = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
        rect.left = androidx.compose.ui.unit.IntOffset.m8729getXimpl(srcOffset);
        rect.top = androidx.compose.ui.unit.IntOffset.m8730getYimpl(srcOffset);
        rect.right = androidx.compose.ui.unit.IntOffset.m8729getXimpl(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = androidx.compose.ui.unit.IntOffset.m8730getYimpl(srcOffset) + ((int) (srcSize & 4294967295L));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        android.graphics.Rect rect2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
        rect2.left = androidx.compose.ui.unit.IntOffset.m8729getXimpl(dstOffset);
        rect2.top = androidx.compose.ui.unit.IntOffset.m8730getYimpl(dstOffset);
        rect2.right = androidx.compose.ui.unit.IntOffset.m8729getXimpl(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = androidx.compose.ui.unit.IntOffset.m8730getYimpl(dstOffset) + ((int) (dstSize & 4294967295L));
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public final void mo5853drawPointsO7TthRY(int pointMode, java.util.List<androidx.compose.ui.geometry.Offset> points, androidx.compose.ui.graphics.Paint paint) {
        if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6297getLinesr_lszbg())) {
            getHighSpeedVideoFpsRangesFor(points, paint, 2);
        } else if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6299getPolygonr_lszbg())) {
            getHighSpeedVideoFpsRangesFor(points, paint, 1);
        } else if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6298getPointsr_lszbg())) {
            getHighSpeedVideoSizes(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void enableZ() {
        androidx.compose.ui.graphics.CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void disableZ() {
        androidx.compose.ui.graphics.CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<androidx.compose.ui.geometry.Offset> p0, androidx.compose.ui.graphics.Paint p1, int p2) {
        if (p0.size() >= 2) {
            android.graphics.Paint asFrameworkPaint = p1.asFrameworkPaint();
            int i = 0;
            while (i < p0.size() - 1) {
                long m5762unboximpl = p0.get(i).m5762unboximpl();
                long m5762unboximpl2 = p0.get(i + 1).m5762unboximpl();
                this.internalCanvas.drawLine(java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32)), java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)), java.lang.Float.intBitsToFloat((int) (m5762unboximpl2 >> 32)), java.lang.Float.intBitsToFloat((int) (m5762unboximpl2 & 4294967295L)), asFrameworkPaint);
                i += p2;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public final void mo5854drawRawPointsO7TthRY(int pointMode, float[] points, androidx.compose.ui.graphics.Paint paint) {
        if (points.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("points must have an even number of values");
        }
        if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6297getLinesr_lszbg())) {
            getHighSpeedVideoFpsRanges(points, paint, 2);
        } else if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6299getPolygonr_lszbg())) {
            getHighSpeedVideoFpsRanges(points, paint, 1);
        } else if (androidx.compose.ui.graphics.PointMode.m6293equalsimpl0(pointMode, androidx.compose.ui.graphics.PointMode.INSTANCE.m6298getPointsr_lszbg())) {
            getHighSpeedVideoFpsRangesFor(points, paint);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(float[] fArr, androidx.compose.ui.graphics.Paint paint) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            for (int i = 0; i < fArr.length - 1; i += 2) {
                this.internalCanvas.drawPoint(fArr[i], fArr[i + 1], asFrameworkPaint);
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges(float[] p0, androidx.compose.ui.graphics.Paint p1, int p2) {
        if (p0.length < 4 || p0.length % 2 != 0) {
            return;
        }
        android.graphics.Paint asFrameworkPaint = p1.asFrameworkPaint();
        int i = 0;
        while (i < p0.length - 3) {
            this.internalCanvas.drawLine(p0[i], p0[i + 1], p0[i + 2], p0[i + 3], asFrameworkPaint);
            i += p2 * 2;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public final void mo5855drawVerticesTPEHhCM(androidx.compose.ui.graphics.Vertices vertices, int blendMode, androidx.compose.ui.graphics.Paint paint) {
        this.internalCanvas.drawVertices(androidx.compose.ui.graphics.AndroidVertexMode_androidKt.m5901toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    private final void getHighSpeedVideoSizes(java.util.List<androidx.compose.ui.geometry.Offset> p0, androidx.compose.ui.graphics.Paint p1) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            long m5762unboximpl = p0.get(i).m5762unboximpl();
            this.internalCanvas.drawPoint(java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32)), java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)), p1.asFrameworkPaint());
        }
    }
}
