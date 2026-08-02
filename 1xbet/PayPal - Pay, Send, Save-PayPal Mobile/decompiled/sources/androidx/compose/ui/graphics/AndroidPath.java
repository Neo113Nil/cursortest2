package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J/\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J?\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010!J/\u0010+\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010-\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b-\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020%H\u0016¢\u0006\u0004\b3\u0010.J\u001f\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020%2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00101J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00106\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00108J'\u0010;\u001a\u00020\t2\u0006\u00102\u001a\u00020%2\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\t2\u0006\u00102\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010C\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\tH\u0016¢\u0006\u0004\bG\u0010EJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020%H\u0016¢\u0006\u0004\bP\u0010QJ'\u0010X\u001a\u00020)2\u0006\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020\u00012\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020%H\u0002¢\u0006\u0004\bZ\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR$\u0010n\u001a\u00020h2\u0006\u0010i\u001a\u00020h8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010o\u001a\u00020)8WX\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010E\u001a\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010p"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "", "x", "y", "", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "relativeQuadraticTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleDegrees", "sweepAngleDegrees", "", "forceMoveTo", "arcTo", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "startAngleRadians", "sweepAngleRadians", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "path", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "p0", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/RectF;", "", "[F", "Camera2StreamConfigurationMap", "Landroid/graphics/Matrix;", "getHighSpeedVideoSizes", "Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/PathFillType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "isEmpty"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPath implements androidx.compose.ui.graphics.Path {
    public static final int $stable = 8;
    private android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private float[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.graphics.Matrix getHighSpeedVideoFpsRanges;
    private final android.graphics.Path internalPath;

    public static /* synthetic */ void isConvex$annotations() {
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public final int mo5885getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD) {
            return androidx.compose.ui.graphics.PathFillType.INSTANCE.m6274getEvenOddRgk1Os();
        }
        return androidx.compose.ui.graphics.PathFillType.INSTANCE.m6275getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public final void mo5887setFillTypeoQ8Xj4U(int i) {
        android.graphics.Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (androidx.compose.ui.graphics.PathFillType.m6270equalsimpl0(i, androidx.compose.ui.graphics.PathFillType.INSTANCE.m6274getEvenOddRgk1Os())) {
            fillType = android.graphics.Path.FillType.EVEN_ODD;
        } else {
            fillType = android.graphics.Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void moveTo(float x, float y) {
        this.internalPath.moveTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeMoveTo(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void lineTo(float x, float y) {
        this.internalPath.lineTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeLineTo(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void quadraticBezierTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void quadraticTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.internalPath.cubicTo(x1, y1, x2, y2, x3, y3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void arcTo(androidx.compose.ui.geometry.Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.arcTo(rectF2, startAngleDegrees, sweepAngleDegrees, forceMoveTo);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRect(androidx.compose.ui.geometry.Rect rect) {
        addRect(rect, androidx.compose.ui.graphics.Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRect(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.graphics.Path.Direction direction) {
        android.graphics.Path.Direction highResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor(rect);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.AndroidPath_androidKt.getHighResolutionOutputSizeshNQ4ISI(direction);
        path.addRect(rectF2, highResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addOval(androidx.compose.ui.geometry.Rect oval) {
        addOval(oval, androidx.compose.ui.graphics.Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addOval(androidx.compose.ui.geometry.Rect oval, androidx.compose.ui.graphics.Path.Direction direction) {
        android.graphics.Path.Direction highResolutionOutputSizeshNQ4ISI;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.AndroidPath_androidKt.getHighResolutionOutputSizeshNQ4ISI(direction);
        path.addOval(rectF2, highResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRoundRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        addRoundRect(roundRect, androidx.compose.ui.graphics.Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRoundRect(androidx.compose.ui.geometry.RoundRect roundRect, androidx.compose.ui.graphics.Path.Direction direction) {
        android.graphics.Path.Direction highResolutionOutputSizeshNQ4ISI;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new float[8];
        }
        float[] fArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fArr);
        fArr[0] = java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        fArr[2] = java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[4] = java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[6] = java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fArr2);
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.AndroidPath_androidKt.getHighResolutionOutputSizeshNQ4ISI(direction);
        path.addRoundRect(rectF2, fArr2, highResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addArcRad(androidx.compose.ui.geometry.Rect oval, float startAngleRadians, float sweepAngleRadians) {
        addArc(oval, androidx.compose.ui.graphics.DegreesKt.degrees(startAngleRadians), androidx.compose.ui.graphics.DegreesKt.degrees(sweepAngleRadians));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addArc(androidx.compose.ui.geometry.Rect oval, float startAngleDegrees, float sweepAngleDegrees) {
        getHighSpeedVideoFpsRangesFor(oval);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.addArc(rectF2, startAngleDegrees, sweepAngleDegrees);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public final void mo5884addPathUv8p0NA(androidx.compose.ui.graphics.Path path, long offset) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            path2.addPath(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), java.lang.Float.intBitsToFloat((int) (offset >> 32)), java.lang.Float.intBitsToFloat((int) (offset & 4294967295L)));
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void mo5889translatek4lQ0M(long offset) {
        android.graphics.Matrix matrix = this.getHighSpeedVideoFpsRanges;
        if (matrix == null) {
            this.getHighSpeedVideoFpsRanges = new android.graphics.Matrix();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(java.lang.Float.intBitsToFloat((int) (offset >> 32)), java.lang.Float.intBitsToFloat((int) (offset & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public final void mo5888transform58bKbWc(float[] matrix) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix2 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix2);
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(matrix2, matrix);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final androidx.compose.ui.geometry.Rect getBounds() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public final boolean mo5886opN5in7k0(androidx.compose.ui.graphics.Path path1, androidx.compose.ui.graphics.Path path2, int operation) {
        android.graphics.Path.Op op;
        if (androidx.compose.ui.graphics.PathOperation.m6280equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6284getDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (androidx.compose.ui.graphics.PathOperation.m6280equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6285getIntersectb3I0S0c())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (androidx.compose.ui.graphics.PathOperation.m6280equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6286getReverseDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = androidx.compose.ui.graphics.PathOperation.m6280equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6287getUnionb3I0S0c()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path = this.internalPath;
        if (!(path1 instanceof androidx.compose.ui.graphics.AndroidPath)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((androidx.compose.ui.graphics.AndroidPath) path1).getInternalPath();
        if (path2 instanceof androidx.compose.ui.graphics.AndroidPath) {
            return path.op(internalPath, ((androidx.compose.ui.graphics.AndroidPath) path2).getInternalPath(), op);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private static void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Rect p0) {
        if (java.lang.Float.isNaN(p0.getLeft()) || java.lang.Float.isNaN(p0.getTop()) || java.lang.Float.isNaN(p0.getRight()) || java.lang.Float.isNaN(p0.getBottom())) {
            androidx.compose.ui.graphics.AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
