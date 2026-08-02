package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m328RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m330RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m251getXimpl(j), CornerRadius.m252getYimpl(j));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m331RoundRectsniSvfs(Rect rect, long j) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m251getXimpl(j), CornerRadius.m252getYimpl(j));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset((roundRect.getWidth() / 2.0f) + roundRect.getLeft(), (roundRect.getHeight() / 2.0f) + roundRect.getTop());
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float max = Math.max(CornerRadius.m251getXimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()));
        float max2 = Math.max(CornerRadius.m252getYimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m252getYimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()));
        return new Rect((max * 0.29289323f) + roundRect.getLeft(), (max2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (Math.max(CornerRadius.m251getXimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()), CornerRadius.m251getXimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m252getYimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m252getYimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m252getYimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m252getYimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m252getYimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m252getYimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if (Float.isInfinite(left) || Float.isNaN(left)) {
            return false;
        }
        float top = roundRect.getTop();
        if (Float.isInfinite(top) || Float.isNaN(top)) {
            return false;
        }
        float right = roundRect.getRight();
        if (Float.isInfinite(right) || Float.isNaN(right)) {
            return false;
        }
        float bottom = roundRect.getBottom();
        return (Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true;
    }

    public static final boolean isRect(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) != 0.0f && CornerRadius.m252getYimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (CornerRadius.m251getXimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) != 0.0f && CornerRadius.m252getYimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (CornerRadius.m251getXimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m252getYimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
            return CornerRadius.m251getXimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m252getYimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) == 0.0f;
        }
        return false;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m327getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m325getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m251getXimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m251getXimpl(roundRect.m326getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m252getYimpl(roundRect.m324getBottomLeftCornerRadiuskKHJgLs());
    }

    public static final RoundRect lerp(RoundRect start, RoundRect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f), CornerRadiusKt.m262lerp3Ry4LBc(start.m326getTopLeftCornerRadiuskKHJgLs(), stop.m326getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m262lerp3Ry4LBc(start.m327getTopRightCornerRadiuskKHJgLs(), stop.m327getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m262lerp3Ry4LBc(start.m325getBottomRightCornerRadiuskKHJgLs(), stop.m325getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m262lerp3Ry4LBc(start.m324getBottomLeftCornerRadiuskKHJgLs(), stop.m324getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m332translateUv8p0NA(RoundRect translate, long j) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(Offset.m276getXimpl(j) + translate.getLeft(), Offset.m277getYimpl(j) + translate.getTop(), Offset.m276getXimpl(j) + translate.getRight(), Offset.m277getYimpl(j) + translate.getBottom(), translate.m326getTopLeftCornerRadiuskKHJgLs(), translate.m327getTopRightCornerRadiuskKHJgLs(), translate.m325getBottomRightCornerRadiuskKHJgLs(), translate.m324getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
