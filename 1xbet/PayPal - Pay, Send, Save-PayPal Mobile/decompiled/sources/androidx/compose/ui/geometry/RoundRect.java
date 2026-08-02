package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010%J`\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010 R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010%R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b=\u0010%R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010%R\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b?\u0010%R\u0011\u0010A\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b@\u0010 R\u0011\u0010C\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bB\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010D"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/compose/ui/geometry/CornerRadius;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/geometry/RoundRect;", "p0", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(FFFF)F", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeft", "getTop", "getRight", "getBottom", "J", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "getBottomRightCornerRadius-kKHJgLs", "getBottomLeftCornerRadius-kKHJgLs", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/RoundRect;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.RoundRect.Companion INSTANCE = new androidx.compose.ui.geometry.RoundRect.Companion(null);
    private static final androidx.compose.ui.geometry.RoundRect Zero = androidx.compose.ui.geometry.RoundRectKt.m5806RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.geometry.CornerRadius.INSTANCE.m5724getZerokKHJgLs());

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.RoundRect getHighSpeedVideoSizes;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

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
        this(f, f2, f3, f4, (i & 16) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m5724getZerokKHJgLs() : j, (i & 32) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m5724getZerokKHJgLs() : j2, (i & 64) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m5724getZerokKHJgLs() : j3, (i & 128) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m5724getZerokKHJgLs() : j4, null);
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m5802getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m5803getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m5801getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m5800getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    private final androidx.compose.ui.geometry.RoundRect Camera2StreamConfigurationMap() {
        androidx.compose.ui.geometry.RoundRect roundRect = this.getHighSpeedVideoSizes;
        if (roundRect != null) {
            return roundRect;
        }
        float highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(getHighSpeedVideoSizes(getHighSpeedVideoSizes(1.0f, java.lang.Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), java.lang.Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), java.lang.Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), java.lang.Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), java.lang.Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), java.lang.Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), java.lang.Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), java.lang.Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f = this.left;
        float f2 = this.top;
        float f3 = this.right;
        float f4 = this.bottom;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32));
        long m5706constructorimpl = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * highSpeedVideoSizes) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * highSpeedVideoSizes) << 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32));
        long m5706constructorimpl2 = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * highSpeedVideoSizes) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2 * highSpeedVideoSizes) << 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32));
        long m5706constructorimpl3 = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * highSpeedVideoSizes) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat3 * highSpeedVideoSizes) << 32));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32));
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L));
        float f5 = f * highSpeedVideoSizes;
        float f6 = f2 * highSpeedVideoSizes;
        float f7 = f3 * highSpeedVideoSizes;
        float f8 = f4 * highSpeedVideoSizes;
        androidx.compose.ui.geometry.RoundRect roundRect2 = new androidx.compose.ui.geometry.RoundRect(f5, f6, f7, f8, m5706constructorimpl, m5706constructorimpl2, m5706constructorimpl3, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat5 * highSpeedVideoSizes) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat4 * highSpeedVideoSizes) << 32)), null);
        this.getHighSpeedVideoSizes = roundRect2;
        return roundRect2;
    }

    private static float getHighSpeedVideoSizes(float p0, float p1, float p2, float p3) {
        float f = p1 + p2;
        return (f <= p3 || f == 0.0f) ? p0 : java.lang.Math.min(p0, p3 / f);
    }

    public final java.lang.String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.left, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.top, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.right, 1));
        sb.append(", ");
        sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(this.bottom, 1));
        java.lang.String obj = sb.toString();
        if (!androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(j, j2) || !androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(j2, j3) || !androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(j3, j4)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RoundRect(rect=");
            sb2.append(obj);
            sb2.append(", topLeft=");
            sb2.append((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(j));
            sb2.append(", topRight=");
            sb2.append((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(j2));
            sb2.append(", bottomRight=");
            sb2.append((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(j3));
            sb2.append(", bottomLeft=");
            sb2.append((java.lang.Object) androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(j4));
            sb2.append(')');
            return sb2.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == java.lang.Float.intBitsToFloat(i2)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("RoundRect(rect=");
            sb3.append(obj);
            sb3.append(", radius=");
            sb3.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i), 1));
            sb3.append(')');
            return sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("RoundRect(rect=");
        sb4.append(obj);
        sb4.append(", x=");
        sb4.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i), 1));
        sb4.append(", y=");
        sb4.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i2), 1));
        sb4.append(')');
        return sb4.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/RoundRect;", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.geometry.RoundRect getZero() {
            return androidx.compose.ui.geometry.RoundRect.Zero;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m5798containsk4lQ0M(long point) {
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3;
        float intBitsToFloat4;
        int i = (int) (point >> 32);
        if (java.lang.Float.intBitsToFloat(i) >= this.left && java.lang.Float.intBitsToFloat(i) < this.right) {
            int i2 = (int) (point & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i2) >= this.top && java.lang.Float.intBitsToFloat(i2) < this.bottom) {
                androidx.compose.ui.geometry.RoundRect Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                if (java.lang.Float.intBitsToFloat(i) < this.left + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topLeftCornerRadius >> 32)) && java.lang.Float.intBitsToFloat(i2) < this.top + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topLeftCornerRadius & 4294967295L))) {
                    intBitsToFloat = (java.lang.Float.intBitsToFloat(i) - this.left) - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topLeftCornerRadius >> 32));
                    intBitsToFloat2 = (java.lang.Float.intBitsToFloat(i2) - this.top) - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topLeftCornerRadius & 4294967295L));
                    intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topLeftCornerRadius >> 32));
                    intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (4294967295L & Camera2StreamConfigurationMap.topLeftCornerRadius));
                } else if (java.lang.Float.intBitsToFloat(i) > this.right - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topRightCornerRadius >> 32)) && java.lang.Float.intBitsToFloat(i2) < this.top + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topRightCornerRadius & 4294967295L))) {
                    intBitsToFloat = (java.lang.Float.intBitsToFloat(i) - this.right) + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topRightCornerRadius >> 32));
                    intBitsToFloat2 = (java.lang.Float.intBitsToFloat(i2) - this.top) - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topRightCornerRadius & 4294967295L));
                    intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.topRightCornerRadius >> 32));
                    intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (4294967295L & Camera2StreamConfigurationMap.topRightCornerRadius));
                } else if (java.lang.Float.intBitsToFloat(i) > this.right - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomRightCornerRadius >> 32)) && java.lang.Float.intBitsToFloat(i2) > this.bottom - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomRightCornerRadius & 4294967295L))) {
                    intBitsToFloat = (java.lang.Float.intBitsToFloat(i) - this.right) + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomRightCornerRadius >> 32));
                    intBitsToFloat2 = (java.lang.Float.intBitsToFloat(i2) - this.bottom) + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomRightCornerRadius & 4294967295L));
                    intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomRightCornerRadius >> 32));
                    intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (4294967295L & Camera2StreamConfigurationMap.bottomRightCornerRadius));
                } else {
                    if (java.lang.Float.intBitsToFloat(i) >= this.left + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomLeftCornerRadius >> 32)) || java.lang.Float.intBitsToFloat(i2) <= this.bottom - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    intBitsToFloat = (java.lang.Float.intBitsToFloat(i) - this.left) - java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomLeftCornerRadius >> 32));
                    intBitsToFloat2 = (java.lang.Float.intBitsToFloat(i2) - this.bottom) + java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomLeftCornerRadius & 4294967295L));
                    intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (Camera2StreamConfigurationMap.bottomLeftCornerRadius >> 32));
                    intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (4294967295L & Camera2StreamConfigurationMap.bottomLeftCornerRadius));
                }
                float f = intBitsToFloat / intBitsToFloat3;
                float f2 = intBitsToFloat2 / intBitsToFloat4;
                return (f * f) + (f2 * f2) <= 1.0f;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((java.lang.Float.hashCode(this.left) * 31) + java.lang.Float.hashCode(this.top)) * 31) + java.lang.Float.hashCode(this.right)) * 31) + java.lang.Float.hashCode(this.bottom)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.topLeftCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.topRightCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.bottomRightCornerRadius)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.geometry.RoundRect)) {
            return false;
        }
        androidx.compose.ui.geometry.RoundRect roundRect = (androidx.compose.ui.geometry.RoundRect) other;
        return java.lang.Float.compare(this.left, roundRect.left) == 0 && java.lang.Float.compare(this.top, roundRect.top) == 0 && java.lang.Float.compare(this.right, roundRect.right) == 0 && java.lang.Float.compare(this.bottom, roundRect.bottom) == 0 && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final androidx.compose.ui.geometry.RoundRect m5799copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new androidx.compose.ui.geometry.RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
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

    public static final androidx.compose.ui.geometry.RoundRect getZero() {
        return INSTANCE.getZero();
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }
}
