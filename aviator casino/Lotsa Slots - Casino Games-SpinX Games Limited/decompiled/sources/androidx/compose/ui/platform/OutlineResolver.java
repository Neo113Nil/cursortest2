package androidx.compose.ui.platform;

/* compiled from: OutlineResolver.android.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0018\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020.2\u0006\u0010&\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b6\u00107J6\u00105\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u00108\u001a\u00020#2\u0006\u0010-\u001a\u00020\u00062\u0006\u00109\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010:\u001a\u00020.H\u0002J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020\rH\u0002J\u0010\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020*H\u0002J0\u0010B\u001a\u00020\u0006*\u0004\u0018\u00010*2\u0006\u0010C\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u00020\u001eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u0016\u0010 \u001a\u00020!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020\u001eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010'\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "<set-?>", "", "cacheIsDirty", "getCacheIsDirty$ui_release", "()Z", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", "position", "isInOutline-k-4lQ0M", "(J)Z", "update", "update-uvyYCjk", "(J)V", "alpha", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", "offset", com.helpshift.proactive.InAppViewConstants.RADIUS, "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final android.graphics.Outline cachedOutline;
    private androidx.compose.ui.graphics.Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private androidx.compose.ui.unit.Density density;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private androidx.compose.ui.graphics.Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private androidx.compose.ui.graphics.Shape shape;
    private long size;
    private androidx.compose.ui.graphics.Path tmpOpPath;
    private androidx.compose.ui.graphics.Path tmpPath;
    private androidx.compose.ui.geometry.RoundRect tmpRoundRect;
    private androidx.compose.ui.graphics.Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(androidx.compose.ui.unit.Density density) {
        this.density = density;
        android.graphics.Outline outline = new android.graphics.Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.size = androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        this.shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        this.rectSize = androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        this.layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
    }

    /* renamed from: getCacheIsDirty$ui_release, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public final androidx.compose.ui.graphics.Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean update(androidx.compose.ui.graphics.Shape shape, float alpha, boolean clipToOutline, float elevation, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        this.cachedOutline.setAlpha(alpha);
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(this.shape, shape);
        if (z) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z2 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m3762isInOutlinek4lQ0M(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return androidx.compose.ui.platform.ShapeContainingUtilKt.isInOutline(outline, androidx.compose.ui.geometry.Offset.m1871getXimpl(position), androidx.compose.ui.geometry.Offset.m1872getYimpl(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final void clipToOutline(androidx.compose.ui.graphics.Canvas canvas) {
        androidx.compose.ui.graphics.Path clipPath = getClipPath();
        if (clipPath != null) {
            androidx.compose.ui.graphics.Canvas.CC.m2085clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            androidx.compose.ui.graphics.Path path = this.tmpPath;
            androidx.compose.ui.geometry.RoundRect roundRect = this.tmpRoundRect;
            if (path == null || !m3761isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
                androidx.compose.ui.geometry.RoundRect m1925RoundRectgG7oq9Y = androidx.compose.ui.geometry.RoundRectKt.m1925RoundRectgG7oq9Y(androidx.compose.ui.geometry.Offset.m1871getXimpl(this.rectTopLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.rectTopLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(this.rectTopLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.rectSize), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.rectTopLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.rectSize), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (path == null) {
                    path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m1925RoundRectgG7oq9Y);
                this.tmpRoundRect = m1925RoundRectgG7oq9Y;
                this.tmpPath = path;
            }
            androidx.compose.ui.graphics.Canvas.CC.m2085clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        androidx.compose.ui.graphics.Canvas.CC.m2086clipRectN_I0leg$default(canvas, androidx.compose.ui.geometry.Offset.m1871getXimpl(this.rectTopLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.rectTopLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(this.rectTopLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.rectSize), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.rectTopLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.rectSize), 0, 16, null);
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m3763updateuvyYCjk(long size) {
        if (androidx.compose.ui.geometry.Size.m1936equalsimpl0(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            long j = this.size;
            this.rectSize = j;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && androidx.compose.ui.geometry.Size.m1940getWidthimpl(j) > 0.0f && androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI = this.shape.mo262createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo262createOutlinePq9zytI;
                if (mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                    updateCacheWithRect(((androidx.compose.ui.graphics.Outline.Rectangle) mo262createOutlinePq9zytI).getRect());
                    return;
                } else if (mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                    updateCacheWithRoundRect(((androidx.compose.ui.graphics.Outline.Rounded) mo262createOutlinePq9zytI).getRoundRect());
                    return;
                } else {
                    if (mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Generic) {
                        updateCacheWithPath(((androidx.compose.ui.graphics.Outline.Generic) mo262createOutlinePq9zytI).getPath());
                        return;
                    }
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(androidx.compose.ui.geometry.Rect rect) {
        this.rectTopLeft = androidx.compose.ui.geometry.OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = androidx.compose.ui.geometry.SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        float m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = androidx.compose.ui.geometry.OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = androidx.compose.ui.geometry.SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (androidx.compose.ui.geometry.RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(kotlin.math.MathKt.roundToInt(roundRect.getLeft()), kotlin.math.MathKt.roundToInt(roundRect.getTop()), kotlin.math.MathKt.roundToInt(roundRect.getRight()), kotlin.math.MathKt.roundToInt(roundRect.getBottom()), m1846getXimpl);
            this.roundedCornerRadius = m1846getXimpl;
            return;
        }
        androidx.compose.ui.graphics.Path path = this.cachedRrectPath;
        if (path == null) {
            path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    private final void updateCacheWithPath(androidx.compose.ui.graphics.Path composePath) {
        if (android.os.Build.VERSION.SDK_INT > 28 || composePath.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (composePath instanceof androidx.compose.ui.graphics.AndroidPath) {
                outline.setConvexPath(((androidx.compose.ui.graphics.AndroidPath) composePath).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m3761isSameBounds4L21HEs(androidx.compose.ui.geometry.RoundRect roundRect, long j, long j2, float f) {
        return roundRect != null && androidx.compose.ui.geometry.RoundRectKt.isSimple(roundRect) && roundRect.getLeft() == androidx.compose.ui.geometry.Offset.m1871getXimpl(j) && roundRect.getTop() == androidx.compose.ui.geometry.Offset.m1872getYimpl(j) && roundRect.getRight() == androidx.compose.ui.geometry.Offset.m1871getXimpl(j) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(j2) && roundRect.getBottom() == androidx.compose.ui.geometry.Offset.m1872getYimpl(j) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(j2) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == f;
    }
}
