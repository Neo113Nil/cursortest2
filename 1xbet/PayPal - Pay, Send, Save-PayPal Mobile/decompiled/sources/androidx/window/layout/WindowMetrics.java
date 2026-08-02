package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010 \u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a"}, d2 = {"Landroidx/window/layout/WindowMetrics;", "", "Landroidx/window/core/Bounds;", "_bounds", "", "density", "<init>", "(Landroidx/window/core/Bounds;F)V", "Landroid/graphics/Rect;", "bounds", "(Landroid/graphics/Rect;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/window/core/Bounds;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDensity", "()F", "getBounds", "()Landroid/graphics/Rect;", "getWidthDp", "widthDp", "getHeightDp", "heightDp"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowMetrics {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.window.core.Bounds getHighSpeedVideoFpsRangesFor;
    private final float density;

    public WindowMetrics(androidx.window.core.Bounds bounds, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        this.getHighSpeedVideoFpsRangesFor = bounds;
        this.density = f;
    }

    public final float getDensity() {
        return this.density;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(android.graphics.Rect rect, float f) {
        this(new androidx.window.core.Bounds(rect), f);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
    }

    public final android.graphics.Rect getBounds() {
        return this.getHighSpeedVideoFpsRangesFor.toRect();
    }

    public final float getWidthDp() {
        return getBounds().width() / this.density;
    }

    public final float getHeightDp() {
        return getBounds().height() / this.density;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.window.layout.WindowMetrics windowMetrics = (androidx.window.layout.WindowMetrics) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, windowMetrics.getHighSpeedVideoFpsRangesFor) && this.density == windowMetrics.density;
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Float.hashCode(this.density);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", density=");
        sb.append(this.density);
        sb.append(')');
        return sb.toString();
    }
}
