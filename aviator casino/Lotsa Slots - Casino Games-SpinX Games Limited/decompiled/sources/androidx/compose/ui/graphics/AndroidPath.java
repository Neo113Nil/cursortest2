package androidx.compose.ui.graphics;

/* compiled from: AndroidPath.android.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J \u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\"\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J(\u00101\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u00102\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u00020\u001eH\u0016J8\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020!H\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\u0018\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!H\u0016J\u0018\u0010?\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!H\u0016J*\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ(\u0010G\u001a\u00020\u001e2\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J8\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!2\u0006\u0010M\u001a\u00020!2\u0006\u0010N\u001a\u00020!H\u0016J\u0018\u0010O\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020!H\u0016J\u0018\u0010R\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020!H\u0016J(\u0010S\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!H\u0016J\b\u0010T\u001a\u00020\u001eH\u0016J\b\u0010U\u001a\u00020\u001eH\u0016J\u001a\u0010V\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020XH\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u001a\u0010[\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "internalPath", "Landroid/graphics/Path;", "(Landroid/graphics/Path;)V", "value", "Landroidx/compose/ui/graphics/PathFillType;", "fillType", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "getInternalPath", "()Landroid/graphics/Path;", "isConvex", "", "isConvex$annotations", "()V", "()Z", "isEmpty", "mMatrix", "Landroid/graphics/Matrix;", com.helpshift.proactive.InAppViewConstants.RADII, "", "rectF", "Landroid/graphics/RectF;", "_rectIsValid", "rect", "Landroidx/compose/ui/geometry/Rect;", "addArc", "", "oval", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPath implements androidx.compose.ui.graphics.Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private android.graphics.RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void arcToRad(androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z) {
        androidx.compose.ui.graphics.Path.CC.$default$arcToRad(this, rect, f, f2, z);
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
    public int mo2004getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD) {
            return androidx.compose.ui.graphics.PathFillType.INSTANCE.m2404getEvenOddRgk1Os();
        }
        return androidx.compose.ui.graphics.PathFillType.INSTANCE.m2405getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo2006setFillTypeoQ8Xj4U(int i) {
        android.graphics.Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (androidx.compose.ui.graphics.PathFillType.m2400equalsimpl0(i, androidx.compose.ui.graphics.PathFillType.INSTANCE.m2404getEvenOddRgk1Os())) {
            fillType = android.graphics.Path.FillType.EVEN_ODD;
        } else {
            fillType = android.graphics.Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float x, float y) {
        this.internalPath.moveTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float x, float y) {
        this.internalPath.lineTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.internalPath.cubicTo(x1, y1, x2, y2, x3, y3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(androidx.compose.ui.geometry.Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.arcTo(rectF2, startAngleDegrees, sweepAngleDegrees, forceMoveTo);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(androidx.compose.ui.geometry.Rect rect) {
        if (!_rectIsValid(rect)) {
            throw new java.lang.IllegalStateException("invalid rect".toString());
        }
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(androidx.compose.ui.geometry.Rect oval) {
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.addOval(rectF2, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(androidx.compose.ui.geometry.Rect oval, float startAngleRadians, float sweepAngleRadians) {
        addArc(oval, androidx.compose.ui.graphics.DegreesKt.degrees(startAngleRadians), androidx.compose.ui.graphics.DegreesKt.degrees(sweepAngleRadians));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(androidx.compose.ui.geometry.Rect oval, float startAngleDegrees, float sweepAngleDegrees) {
        if (!_rectIsValid(oval)) {
            throw new java.lang.IllegalStateException("invalid rect".toString());
        }
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        path.addArc(rectF2, startAngleDegrees, sweepAngleDegrees);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fArr);
        fArr[0] = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs());
        fArr[3] = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs());
        fArr[4] = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs());
        android.graphics.Path path = this.internalPath;
        android.graphics.RectF rectF2 = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = this.radii;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fArr2);
        path.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo2003addPathUv8p0NA(androidx.compose.ui.graphics.Path path, long offset) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            path2.addPath(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), androidx.compose.ui.geometry.Offset.m1871getXimpl(offset), androidx.compose.ui.geometry.Offset.m1872getYimpl(offset));
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo2008translatek4lQ0M(long offset) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(androidx.compose.ui.geometry.Offset.m1871getXimpl(offset), androidx.compose.ui.geometry.Offset.m1872getYimpl(offset));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo2007transform58bKbWc(float[] matrix) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix2);
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m1983setFromEL8BTi8(matrix2, matrix);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public androidx.compose.ui.geometry.Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo2005opN5in7k0(androidx.compose.ui.graphics.Path path1, androidx.compose.ui.graphics.Path path2, int operation) {
        android.graphics.Path.Op op;
        if (androidx.compose.ui.graphics.PathOperation.m2409equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2413getDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (androidx.compose.ui.graphics.PathOperation.m2409equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2414getIntersectb3I0S0c())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (androidx.compose.ui.graphics.PathOperation.m2409equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2415getReverseDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = androidx.compose.ui.graphics.PathOperation.m2409equalsimpl0(operation, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2416getUnionb3I0S0c()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
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
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final boolean _rectIsValid(androidx.compose.ui.geometry.Rect rect) {
        if (!(!java.lang.Float.isNaN(rect.getLeft()))) {
            throw new java.lang.IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!java.lang.Float.isNaN(rect.getTop()))) {
            throw new java.lang.IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!java.lang.Float.isNaN(rect.getRight()))) {
            throw new java.lang.IllegalStateException("Rect.right is NaN".toString());
        }
        if (!java.lang.Float.isNaN(rect.getBottom())) {
            return true;
        }
        throw new java.lang.IllegalStateException("Rect.bottom is NaN".toString());
    }
}
