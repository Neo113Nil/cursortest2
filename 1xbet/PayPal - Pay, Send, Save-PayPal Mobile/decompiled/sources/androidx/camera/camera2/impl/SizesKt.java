package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\f¢\u0006\u0004\b\u0002\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroid/util/Size;", "", "area", "(Landroid/util/Size;)I", "asLandscape", "(Landroid/util/Size;)Landroid/util/Size;", "asPortrait", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "minByArea", "(Landroid/util/Size;Landroid/util/Size;)Landroid/util/Size;", "maxByArea", "Landroid/graphics/Point;", "(Landroid/graphics/Point;)I", "toSize", "(Landroid/graphics/Point;)Landroid/util/Size;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SizesKt {
    public static final int area(android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        return size.getWidth() * size.getHeight();
    }

    public static final android.util.Size asLandscape(android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        return size.getWidth() >= size.getHeight() ? size : new android.util.Size(size.getHeight(), size.getWidth());
    }

    public static final android.util.Size asPortrait(android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        return size.getWidth() <= size.getHeight() ? size : new android.util.Size(size.getHeight(), size.getWidth());
    }

    public static final android.util.Size minByArea(android.util.Size size, android.util.Size size2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size2, "");
        return area(size) < area(size2) ? size : size2;
    }

    public static final android.util.Size maxByArea(android.util.Size size, android.util.Size size2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size2, "");
        return area(size) > area(size2) ? size : size2;
    }

    public static final int area(android.graphics.Point point) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(point, "");
        return point.x * point.y;
    }

    public static final android.util.Size toSize(android.graphics.Point point) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(point, "");
        return new android.util.Size(point.x, point.y);
    }
}
