package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\b\u0018\u0000 c2\u00020\u0001:\u0001cB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J8\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u001a\u0010,\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010'R\u001d\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010'R\u001d\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010'R\u001d\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010'R\u0018\u0010=\u001a\u00020\u00028Ç\u0002¢\u0006\f\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010'R\u0018\u0010@\u001a\u00020\u00028Ç\u0002¢\u0006\f\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010'R\u0017\u0010E\u001a\u00020A8G¢\u0006\f\u0012\u0004\bD\u00104\u001a\u0004\bB\u0010CR\u0017\u0010F\u001a\u00020\u001d8G¢\u0006\f\u0012\u0004\bH\u00104\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020\u001d8G¢\u0006\f\u0012\u0004\bJ\u00104\u001a\u0004\bI\u0010GR\u0017\u0010K\u001a\u00020\u001d8G¢\u0006\f\u0012\u0004\bL\u00104\u001a\u0004\bK\u0010GR\u0011\u0010N\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bM\u0010'R\u0011\u0010P\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bO\u0010'R\u0011\u0010R\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bQ\u0010CR\u0011\u0010T\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bS\u0010CR\u0011\u0010V\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bU\u0010CR\u0011\u0010X\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0011\u0010Z\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bY\u0010CR\u0011\u0010\\\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b[\u0010CR\u0011\u0010^\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b]\u0010CR\u0011\u0010`\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b_\u0010CR\u0011\u0010b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\ba\u0010C"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "translateX", "translateY", "(FF)Landroidx/compose/ui/geometry/Rect;", "delta", "inflate", "(F)Landroidx/compose/ui/geometry/Rect;", "deflate", "other", "intersect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "otherLeft", "otherTop", "otherRight", "otherBottom", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeft", "getLeft$annotations", "()V", "getTop", "getTop$annotations", "getRight", "getRight$annotations", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", io.ktor.http.ContentDisposition.Parameters.Size, "isInfinite", "()Z", "isInfinite$annotations", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Rect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.Rect.Companion INSTANCE = new androidx.compose.ui.geometry.Rect.Companion(null);
    private static final androidx.compose.ui.geometry.Rect Zero = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5777getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.geometry.Rect getZero() {
            return androidx.compose.ui.geometry.Rect.Zero;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final boolean isInfinite() {
        boolean z = this.left == Float.POSITIVE_INFINITY;
        boolean z2 = this.top == Float.POSITIVE_INFINITY;
        return z | z2 | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean isFinite() {
        boolean z = (java.lang.Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040;
        boolean z2 = (java.lang.Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040;
        return z & z2 & ((java.lang.Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & java.lang.Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final androidx.compose.ui.geometry.Rect m5789translatek4lQ0M(long offset) {
        int i = (int) (offset >> 32);
        int i2 = (int) (offset & 4294967295L);
        return new androidx.compose.ui.geometry.Rect(this.left + java.lang.Float.intBitsToFloat(i), this.top + java.lang.Float.intBitsToFloat(i2), this.right + java.lang.Float.intBitsToFloat(i), this.bottom + java.lang.Float.intBitsToFloat(i2));
    }

    public final androidx.compose.ui.geometry.Rect translate(float translateX, float translateY) {
        return new androidx.compose.ui.geometry.Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public final androidx.compose.ui.geometry.Rect inflate(float delta) {
        return new androidx.compose.ui.geometry.Rect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    public final androidx.compose.ui.geometry.Rect deflate(float delta) {
        return inflate(-delta);
    }

    public final androidx.compose.ui.geometry.Rect intersect(androidx.compose.ui.geometry.Rect other) {
        return new androidx.compose.ui.geometry.Rect(java.lang.Math.max(this.left, other.left), java.lang.Math.max(this.top, other.top), java.lang.Math.min(this.right, other.right), java.lang.Math.min(this.bottom, other.bottom));
    }

    public final androidx.compose.ui.geometry.Rect intersect(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new androidx.compose.ui.geometry.Rect(java.lang.Math.max(this.left, otherLeft), java.lang.Math.max(this.top, otherTop), java.lang.Math.min(this.right, otherRight), java.lang.Math.min(this.bottom, otherBottom));
    }

    public final boolean overlaps(androidx.compose.ui.geometry.Rect other) {
        boolean z = this.left < other.right;
        boolean z2 = other.left < this.right;
        return z & z2 & (this.top < other.bottom) & (other.top < this.bottom);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m5787getTopLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m5786getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m5788getTopRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m5783getCenterLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m5782getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2 + bottom) & 4294967295L));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m5784getCenterRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m5780getBottomLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.bottom) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m5779getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m5781getBottomRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.bottom) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rect.fromLTRB(");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.left, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.top, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.right, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.bottom, 1));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m5785getSizeNHjbRc() {
        float right = getRight();
        float left = getLeft();
        float bottom = getBottom();
        float top = getTop();
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(right - left) << 32) | (java.lang.Float.floatToRawIntBits(bottom - top) & 4294967295L));
    }

    public final float getMinDimension() {
        return java.lang.Math.min(java.lang.Math.abs(getRight() - getLeft()), java.lang.Math.abs(getBottom() - getTop()));
    }

    public final float getMaxDimension() {
        return java.lang.Math.max(java.lang.Math.abs(getRight() - getLeft()), java.lang.Math.abs(getBottom() - getTop()));
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m5778containsk4lQ0M(long offset) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (offset >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (offset & 4294967295L));
        boolean z = intBitsToFloat >= this.left;
        boolean z2 = intBitsToFloat < this.right;
        return z & z2 & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.left) * 31) + java.lang.Float.hashCode(this.top)) * 31) + java.lang.Float.hashCode(this.right)) * 31) + java.lang.Float.hashCode(this.bottom);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.geometry.Rect)) {
            return false;
        }
        androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) other;
        return java.lang.Float.compare(this.left, rect.left) == 0 && java.lang.Float.compare(this.top, rect.top) == 0 && java.lang.Float.compare(this.right, rect.right) == 0 && java.lang.Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final androidx.compose.ui.geometry.Rect copy(float left, float top, float right, float bottom) {
        return new androidx.compose.ui.geometry.Rect(left, top, right, bottom);
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Rect copy$default(androidx.compose.ui.geometry.Rect rect, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }
}
