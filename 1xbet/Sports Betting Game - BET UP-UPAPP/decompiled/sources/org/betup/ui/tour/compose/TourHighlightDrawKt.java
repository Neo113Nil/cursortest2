package org.betup.ui.tour.compose;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TourHighlightDraw.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a4\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000\u001a<\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a4\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0000\u001aN\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0000¨\u0006\u0018"}, d2 = {"drawDimOverlay", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "overlayAlpha", "", "cutRoundedRectHole", "left", "top", TtmlNode.RIGHT, "bottom", "cornerRadiusPx", "drawDimWithRoundedHole", "drawDimWithRectHole", "density", "Landroidx/compose/ui/unit/Density;", "cornerRadiusDp", "drawFallbackHomeTileHole", "columnIndex", "", "columns", "rowCenterYFraction", "horizontalPaddingPx", "gapPx", "tileWidthFraction", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourHighlightDrawKt {
    public static final void drawDimOverlay(DrawScope drawScope, float f) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null);
        long m4943getZeroF1C5BW0 = Offset.INSTANCE.m4943getZeroF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L));
        DrawScope.m5724drawRectnJ9OG0$default(drawScope, m5167copywmQWz5c$default, m4943getZeroF1C5BW0, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), 0.0f, null, null, 0, 120, null);
    }

    public static final void cutRoundedRectHole(DrawScope drawScope, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        float coerceAtMost = RangesKt.coerceAtMost(f5, Math.min(f3 - f, f4 - f2) / 2.0f);
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRectKt.m4982RoundRectsniSvfs(new Rect(f, f2, f3, f4), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(coerceAtMost) << 32) | (Float.floatToRawIntBits(coerceAtMost) & 4294967295L))), null, 2, null);
        DrawScope.m5720drawPathLG529CI$default(drawScope, Path, Color.INSTANCE.m5205getWhite0d7_KjU(), 0.0f, null, null, BlendMode.INSTANCE.m5092getDstOut0nO6VwU(), 28, null);
    }

    public static final void drawDimWithRoundedHole(DrawScope drawScope, float f, float f2, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        drawDimOverlay(drawScope, f6);
        if (f3 <= f || f4 <= f2) {
            return;
        }
        cutRoundedRectHole(drawScope, f, f2, f3, f4, f5);
    }

    public static final void drawDimWithRectHole(DrawScope drawScope, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        float f6 = f4 - f2;
        if (f2 > 0.0f) {
            DrawScope.m5724drawRectnJ9OG0$default(drawScope, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
        if (f > 0.0f) {
            DrawScope.m5724drawRectnJ9OG0$default(drawScope, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
        if (f3 < Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32))) {
            DrawScope.m5724drawRectnJ9OG0$default(drawScope, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32)) - f3) << 32)), 0.0f, null, null, 0, 120, null);
        }
        if (f4 < Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L))) {
            long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null);
            long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L)) - f4;
            DrawScope.m5724drawRectnJ9OG0$default(drawScope, m5167copywmQWz5c$default, m4919constructorimpl, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), 0.0f, null, null, 0, 120, null);
        }
    }

    public static final void drawFallbackHomeTileHole(DrawScope drawScope, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        float intBitsToFloat = ((Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() >> 32)) - (f4 * 2.0f)) - (RangesKt.coerceAtLeast(i2 - 1, 0) * f5)) / i2;
        float coerceIn = RangesKt.coerceIn(f6, 0.1f, 1.0f) * intBitsToFloat;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo5730getSizeNHjbRc() & 4294967295L)) * f) - (coerceIn / 2.0f);
        float f7 = (i * (intBitsToFloat + f5)) + f4 + ((intBitsToFloat - coerceIn) / 2.0f);
        drawDimWithRoundedHole(drawScope, f7, intBitsToFloat2, f7 + coerceIn, intBitsToFloat2 + coerceIn, f2, f3);
    }

    public static final float cornerRadiusPx(Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo1167toPx0680j_4(Dp.m7774constructorimpl(f));
    }
}
