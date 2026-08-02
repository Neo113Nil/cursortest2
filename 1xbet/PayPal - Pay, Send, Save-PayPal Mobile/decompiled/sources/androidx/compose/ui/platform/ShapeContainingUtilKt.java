package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u001a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u001c"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "isInOutline", "(Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/Rect;", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "Landroidx/compose/ui/graphics/Outline$Rounded;", "p3", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/Outline$Rounded;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/RoundRect;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "Landroidx/compose/ui/geometry/CornerRadius;", "getHighSpeedVideoFpsRangesFor", "(FFJFF)Z", "(Landroidx/compose/ui/graphics/Path;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
            return getHighSpeedVideoSizes(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            return getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.graphics.Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            return getHighSpeedVideoFpsRanges(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom();
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.Outline.Rounded rounded, float f, float f2, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
        androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!getHighSpeedVideoFpsRanges(roundRect)) {
            androidx.compose.ui.graphics.Path Path = path2 == null ? androidx.compose.ui.graphics.AndroidPath_androidKt.Path() : path2;
            androidx.compose.ui.graphics.Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return getHighSpeedVideoFpsRanges(Path, f, f2, path, path2);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right = roundRect.getRight() - java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right2 = roundRect.getRight() - java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - java.lang.Float.intBitsToFloat((int) (4294967295L & roundRect.m5800getBottomLeftCornerRadiuskKHJgLs()));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        if (f < intBitsToFloat && f2 < intBitsToFloat2) {
            return getHighSpeedVideoFpsRangesFor(f, f2, roundRect.m5802getTopLeftCornerRadiuskKHJgLs(), intBitsToFloat, intBitsToFloat2);
        }
        if (f < intBitsToFloat4 && f2 > bottom2) {
            return getHighSpeedVideoFpsRangesFor(f, f2, roundRect.m5800getBottomLeftCornerRadiuskKHJgLs(), intBitsToFloat4, bottom2);
        }
        if (f > right && f2 < intBitsToFloat3) {
            return getHighSpeedVideoFpsRangesFor(f, f2, roundRect.m5803getTopRightCornerRadiuskKHJgLs(), right, intBitsToFloat3);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return getHighSpeedVideoFpsRangesFor(f, f2, roundRect.m5801getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.geometry.RoundRect roundRect) {
        return java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() >> 32)) + java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32)) + java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && java.lang.Float.intBitsToFloat((int) (roundRect.m5802getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight() && java.lang.Float.intBitsToFloat((int) (roundRect.m5803getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (roundRect.m5801getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.Path path, float f, float f2, androidx.compose.ui.graphics.Path path2, androidx.compose.ui.graphics.Path path3) {
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        androidx.compose.ui.graphics.Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        path3.mo5886opN5in7k0(path, path2, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6285getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) + ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f;
    }
}
