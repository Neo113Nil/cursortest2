package androidx.compose.ui.platform;

/* compiled from: ShapeContainingUtil.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    public static /* synthetic */ boolean isInOutline$default(androidx.compose.ui.graphics.Outline outline, float f, float f2, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f2, path, path2);
    }

    public static final boolean isInOutline(androidx.compose.ui.graphics.Outline outline, float f, float f2, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            return isInRectangle(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            return isInRoundedRect((androidx.compose.ui.graphics.Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            return isInPath(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final boolean isInRectangle(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(androidx.compose.ui.graphics.Outline.Rounded rounded, float f, float f2, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
        androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            androidx.compose.ui.graphics.Path Path = path2 == null ? androidx.compose.ui.graphics.AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return isInPath(Path, f, f2, path, path2);
        }
        float m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs());
        float m1847getYimpl2 = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs());
        float m1846getXimpl2 = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f < m1846getXimpl && f2 < m1847getYimpl) {
            return m3764isWithinEllipseVE1yxkc(f, f2, roundRect.m1921getTopLeftCornerRadiuskKHJgLs(), m1846getXimpl, m1847getYimpl);
        }
        if (f < m1846getXimpl2 && f2 > bottom2) {
            return m3764isWithinEllipseVE1yxkc(f, f2, roundRect.m1919getBottomLeftCornerRadiuskKHJgLs(), m1846getXimpl2, bottom2);
        }
        if (f > right && f2 < m1847getYimpl2) {
            return m3764isWithinEllipseVE1yxkc(f, f2, roundRect.m1922getTopRightCornerRadiuskKHJgLs(), right, m1847getYimpl2);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return m3764isWithinEllipseVE1yxkc(f, f2, roundRect.m1920getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    private static final boolean cornersFit(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) + androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) + androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m3764isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j);
        float m1847getYimpl = androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j);
        return ((f5 * f5) / (m1846getXimpl * m1846getXimpl)) + ((f6 * f6) / (m1847getYimpl * m1847getYimpl)) <= 1.0f;
    }

    private static final boolean isInPath(androidx.compose.ui.graphics.Path path, float f, float f2, androidx.compose.ui.graphics.Path path2, androidx.compose.ui.graphics.Path path3) {
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        path3.mo2005opN5in7k0(path, path2, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2414getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }
}
