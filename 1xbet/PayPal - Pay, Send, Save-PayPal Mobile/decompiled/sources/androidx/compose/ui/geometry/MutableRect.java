package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b(\u0010&\"\u0004\b)\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010\u0014R\u0012\u0010/\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0012\u00101\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010&R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b8\u00107R\u0011\u00109\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010;\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b:\u0010&R\u0011\u0010=\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0011\u0010?\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b>\u00104R\u0011\u0010A\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b@\u00104R\u0011\u0010C\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bB\u00104R\u0011\u0010E\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bD\u00104R\u0011\u0010G\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bF\u00104R\u0011\u0010I\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bH\u00104R\u0011\u0010K\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bJ\u00104R\u0011\u0010M\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bL\u00104R\u0011\u0010O\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bN\u00104"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "translate-k-4lQ0M", "(J)V", "translate", "translateX", "translateY", "(FF)V", "delta", "inflate", "(F)V", "deflate", "intersect", "Landroidx/compose/ui/geometry/Rect;", "other", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "(Landroidx/compose/ui/geometry/MutableRect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "set", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeft", "()F", "setLeft", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "isInfinite", "()Z", "isFinite", "isEmpty", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
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

    public final void translate(float translateX, float translateY) {
        this.left += translateX;
        this.top += translateY;
        this.right += translateX;
        this.bottom += translateY;
    }

    public final void inflate(float delta) {
        this.left -= delta;
        this.top -= delta;
        this.right += delta;
        this.bottom += delta;
    }

    public final void deflate(float delta) {
        inflate(-delta);
    }

    public final void intersect(float left, float top, float right, float bottom) {
        this.left = java.lang.Math.max(left, this.left);
        this.top = java.lang.Math.max(top, this.top);
        this.right = java.lang.Math.min(right, this.right);
        this.bottom = java.lang.Math.min(bottom, this.bottom);
    }

    public final boolean overlaps(androidx.compose.ui.geometry.Rect other) {
        boolean z = this.left < other.getRight();
        boolean z2 = other.getLeft() < this.right;
        return z & z2 & (this.top < other.getBottom()) & (other.getTop() < this.bottom);
    }

    public final boolean overlaps(androidx.compose.ui.geometry.MutableRect other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m5735getTopLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m5734getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m5736getTopRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m5731getCenterLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m5730getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2 + bottom) & 4294967295L));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m5732getCenterRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m5728getBottomLeftF1C5BW0() {
        float f = this.left;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.bottom) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m5727getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + right) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m5729getBottomRightF1C5BW0() {
        float f = this.right;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.bottom) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    public final void set(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableRect(");
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
    public final long m5733getSizeNHjbRc() {
        float right = getRight();
        float left = getLeft();
        float bottom = getBottom();
        float top = getTop();
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(right - left) << 32) | (java.lang.Float.floatToRawIntBits(bottom - top) & 4294967295L));
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m5737translatek4lQ0M(long offset) {
        translate(java.lang.Float.intBitsToFloat((int) (offset >> 32)), java.lang.Float.intBitsToFloat((int) (offset & 4294967295L)));
    }

    public final float getMinDimension() {
        return java.lang.Math.min(java.lang.Math.abs(getRight() - getLeft()), java.lang.Math.abs(getBottom() - getTop()));
    }

    public final float getMaxDimension() {
        return java.lang.Math.max(java.lang.Math.abs(getRight() - getLeft()), java.lang.Math.abs(getBottom() - getTop()));
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m5726containsk4lQ0M(long offset) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (offset >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (offset & 4294967295L));
        boolean z = intBitsToFloat >= this.left;
        boolean z2 = intBitsToFloat < this.right;
        return z & z2 & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }
}
