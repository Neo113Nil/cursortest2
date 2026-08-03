package androidx.compose.ui.geometry;

/* compiled from: RoundRect.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0016\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0016\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0016\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0016\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.RoundRect.Companion INSTANCE = new androidx.compose.ui.geometry.RoundRect.Companion(null);
    private static final androidx.compose.ui.geometry.RoundRect Zero = androidx.compose.ui.geometry.RoundRectKt.m1925RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs());
    private androidx.compose.ui.geometry.RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    public static final androidx.compose.ui.geometry.RoundRect getZero() {
        return INSTANCE.getZero();
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final androidx.compose.ui.geometry.RoundRect m1918copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new androidx.compose.ui.geometry.RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.geometry.RoundRect)) {
            return false;
        }
        androidx.compose.ui.geometry.RoundRect roundRect = (androidx.compose.ui.geometry.RoundRect) other;
        return java.lang.Float.compare(this.left, roundRect.left) == 0 && java.lang.Float.compare(this.top, roundRect.top) == 0 && java.lang.Float.compare(this.right, roundRect.right) == 0 && java.lang.Float.compare(this.bottom, roundRect.bottom) == 0 && androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public int hashCode() {
        return (((((((((((((java.lang.Float.floatToIntBits(this.left) * 31) + java.lang.Float.floatToIntBits(this.top)) * 31) + java.lang.Float.floatToIntBits(this.right)) * 31) + java.lang.Float.floatToIntBits(this.bottom)) * 31) + androidx.compose.ui.geometry.CornerRadius.m1848hashCodeimpl(this.topLeftCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m1848hashCodeimpl(this.topRightCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m1848hashCodeimpl(this.bottomRightCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m1848hashCodeimpl(this.bottomLeftCornerRadius);
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j, (i & 32) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j2, (i & 64) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j3, (i & 128) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j4, null);
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1921getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1922getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1920getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1919getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    private final androidx.compose.ui.geometry.RoundRect scaledRadiiRect() {
        androidx.compose.ui.geometry.RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.bottomLeftCornerRadius), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.topLeftCornerRadius), getHeight()), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.topLeftCornerRadius), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.topRightCornerRadius), getWidth()), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.topRightCornerRadius), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.bottomRightCornerRadius), getHeight()), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.bottomRightCornerRadius), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.bottomLeftCornerRadius), getWidth());
        androidx.compose.ui.geometry.RoundRect roundRect2 = new androidx.compose.ui.geometry.RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.topLeftCornerRadius) * minRadius, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.topLeftCornerRadius) * minRadius), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.topRightCornerRadius) * minRadius, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.topRightCornerRadius) * minRadius), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.bottomRightCornerRadius) * minRadius, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.bottomRightCornerRadius) * minRadius), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(this.bottomLeftCornerRadius) * minRadius, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(this.bottomLeftCornerRadius) * minRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f = radius1 + radius2;
        return (f <= limit || f == 0.0f) ? min : java.lang.Math.min(min, limit / f);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1917containsk4lQ0M(long point) {
        float m1871getXimpl;
        float m1872getYimpl;
        float m1846getXimpl;
        float m1847getYimpl;
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) < this.left || androidx.compose.ui.geometry.Offset.m1871getXimpl(point) >= this.right || androidx.compose.ui.geometry.Offset.m1872getYimpl(point) < this.top || androidx.compose.ui.geometry.Offset.m1872getYimpl(point) >= this.bottom) {
            return false;
        }
        androidx.compose.ui.geometry.RoundRect scaledRadiiRect = scaledRadiiRect();
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) < this.left + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topLeftCornerRadius) && androidx.compose.ui.geometry.Offset.m1872getYimpl(point) < this.top + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            m1871getXimpl = (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) - this.left) - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m1872getYimpl = (androidx.compose.ui.geometry.Offset.m1872getYimpl(point) - this.top) - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topLeftCornerRadius);
            m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) > this.right - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topRightCornerRadius) && androidx.compose.ui.geometry.Offset.m1872getYimpl(point) < this.top + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            m1871getXimpl = (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) - this.right) + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topRightCornerRadius);
            m1872getYimpl = (androidx.compose.ui.geometry.Offset.m1872getYimpl(point) - this.top) - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topRightCornerRadius);
            m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.topRightCornerRadius);
            m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) > this.right - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomRightCornerRadius) && androidx.compose.ui.geometry.Offset.m1872getYimpl(point) > this.bottom - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            m1871getXimpl = (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) - this.right) + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m1872getYimpl = (androidx.compose.ui.geometry.Offset.m1872getYimpl(point) - this.bottom) + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) >= this.left + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || androidx.compose.ui.geometry.Offset.m1872getYimpl(point) <= this.bottom - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            m1871getXimpl = (androidx.compose.ui.geometry.Offset.m1871getXimpl(point) - this.left) - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m1872getYimpl = (androidx.compose.ui.geometry.Offset.m1872getYimpl(point) - this.bottom) + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f = m1871getXimpl / m1846getXimpl;
        float f2 = m1872getYimpl / m1847getYimpl;
        return (f * f) + (f2 * f2) <= 1.0f;
    }

    public java.lang.String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        java.lang.String str = androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(j, j2) || !androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(j2, j3) || !androidx.compose.ui.geometry.CornerRadius.m1845equalsimpl0(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m1852toStringimpl(j)) + ", topRight=" + ((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m1852toStringimpl(j2)) + ", bottomRight=" + ((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m1852toStringimpl(j3)) + ", bottomLeft=" + ((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m1852toStringimpl(j4)) + ')';
        }
        if (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j)) {
            return "RoundRect(rect=" + str + ", radius=" + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j), 1) + ", y=" + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j), 1) + ')';
    }

    /* compiled from: RoundRect.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.geometry.RoundRect getZero() {
            return androidx.compose.ui.geometry.RoundRect.Zero;
        }
    }
}
