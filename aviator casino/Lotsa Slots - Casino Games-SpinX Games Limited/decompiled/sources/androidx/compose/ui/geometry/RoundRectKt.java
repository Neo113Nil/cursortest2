package androidx.compose.ui.geometry;

/* compiled from: RoundRect.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final androidx.compose.ui.geometry.RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long CornerRadius = androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(f5, f6);
        return new androidx.compose.ui.geometry.RoundRect(f, f2, f3, f4, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final androidx.compose.ui.geometry.RoundRect m1925RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j));
    }

    public static final androidx.compose.ui.geometry.RoundRect RoundRect(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final androidx.compose.ui.geometry.RoundRect m1926RoundRectsniSvfs(androidx.compose.ui.geometry.Rect rect, long j) {
        return RoundRect(rect, androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j));
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final androidx.compose.ui.geometry.RoundRect m1923RoundRectZAM2FJo(androidx.compose.ui.geometry.Rect rect, long j, long j2, long j3, long j4) {
        return new androidx.compose.ui.geometry.RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final androidx.compose.ui.geometry.RoundRect m1927translateUv8p0NA(androidx.compose.ui.geometry.RoundRect roundRect, long j) {
        return new androidx.compose.ui.geometry.RoundRect(androidx.compose.ui.geometry.Offset.m1871getXimpl(j) + roundRect.getLeft(), androidx.compose.ui.geometry.Offset.m1872getYimpl(j) + roundRect.getTop(), androidx.compose.ui.geometry.Offset.m1871getXimpl(j) + roundRect.getRight(), androidx.compose.ui.geometry.Offset.m1872getYimpl(j) + roundRect.getBottom(), roundRect.m1921getTopLeftCornerRadiuskKHJgLs(), roundRect.m1922getTopRightCornerRadiuskKHJgLs(), roundRect.m1920getBottomRightCornerRadiuskKHJgLs(), roundRect.m1919getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final androidx.compose.ui.geometry.Rect getBoundingRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        return new androidx.compose.ui.geometry.Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final androidx.compose.ui.geometry.Rect getSafeInnerRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        return new androidx.compose.ui.geometry.Rect(roundRect.getLeft() + (java.lang.Math.max(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (java.lang.Math.max(androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (java.lang.Math.max(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (java.lang.Math.max(androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isEmpty(androidx.compose.ui.geometry.RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(androidx.compose.ui.geometry.RoundRect roundRect) {
        float left = roundRect.getLeft();
        if (!java.lang.Float.isInfinite(left) && !java.lang.Float.isNaN(left)) {
            float top = roundRect.getTop();
            if (!java.lang.Float.isInfinite(top) && !java.lang.Float.isNaN(top)) {
                float right = roundRect.getRight();
                if (!java.lang.Float.isInfinite(right) && !java.lang.Float.isNaN(right)) {
                    float bottom = roundRect.getBottom();
                    if (!java.lang.Float.isInfinite(bottom) && !java.lang.Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(androidx.compose.ui.geometry.RoundRect roundRect) {
        return (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == 0.0f || androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == 0.0f || androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == 0.0f || androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == 0.0f));
    }

    public static final boolean isEllipse(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isCircle(androidx.compose.ui.geometry.RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final float getMinDimension(androidx.compose.ui.geometry.RoundRect roundRect) {
        return java.lang.Math.min(java.lang.Math.abs(roundRect.getWidth()), java.lang.Math.abs(roundRect.getHeight()));
    }

    public static final float getMaxDimension(androidx.compose.ui.geometry.RoundRect roundRect) {
        return java.lang.Math.max(java.lang.Math.abs(roundRect.getWidth()), java.lang.Math.abs(roundRect.getHeight()));
    }

    public static final long getCenter(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final boolean isSimple(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs());
    }

    public static final androidx.compose.ui.geometry.RoundRect lerp(androidx.compose.ui.geometry.RoundRect roundRect, androidx.compose.ui.geometry.RoundRect roundRect2, float f) {
        return new androidx.compose.ui.geometry.RoundRect(androidx.compose.ui.util.MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), androidx.compose.ui.util.MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), androidx.compose.ui.util.MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), androidx.compose.ui.util.MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), androidx.compose.ui.geometry.CornerRadiusKt.m1857lerp3Ry4LBc(roundRect.m1921getTopLeftCornerRadiuskKHJgLs(), roundRect2.m1921getTopLeftCornerRadiuskKHJgLs(), f), androidx.compose.ui.geometry.CornerRadiusKt.m1857lerp3Ry4LBc(roundRect.m1922getTopRightCornerRadiuskKHJgLs(), roundRect2.m1922getTopRightCornerRadiuskKHJgLs(), f), androidx.compose.ui.geometry.CornerRadiusKt.m1857lerp3Ry4LBc(roundRect.m1920getBottomRightCornerRadiuskKHJgLs(), roundRect2.m1920getBottomRightCornerRadiuskKHJgLs(), f), androidx.compose.ui.geometry.CornerRadiusKt.m1857lerp3Ry4LBc(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m1919getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }
}
