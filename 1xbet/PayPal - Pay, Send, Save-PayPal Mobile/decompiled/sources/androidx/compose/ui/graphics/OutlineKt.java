package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001a\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001c*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010\u001f\u001a!\u0010\u0013\u001a\u00020\u0003*\u00020!2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0013\u0010$"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "addOutline", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/ui/geometry/Size;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)J", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Paint;", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Paint;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Outline outline) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.graphics.Path.addRect$default(path, ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), null, 2, null);
        } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Path.addRoundRect$default(path, ((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else {
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.Path.m6262addPathUv8p0NA$default(path, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m6249drawOutlinehn5TExg$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
        }
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        androidx.compose.ui.graphics.ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU();
        }
        m6248drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    private static final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long getHighSpeedVideoSizes(androidx.compose.ui.geometry.RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(height) & 4294967295L));
    }

    public static final void drawOutline(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.Paint paint) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            canvas.drawRect(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            androidx.compose.ui.graphics.Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                canvas.drawPath(roundRectPath, paint);
                return;
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5800getBottomLeftCornerRadiuskKHJgLs() >> 32)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5800getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)), paint);
                return;
            }
        }
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        canvas.drawPath(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), paint);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m6250drawOutlinewDX37Ww(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, long j, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.geometry.Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect();
            drawScope.mo6445drawRectnJ9OG0(j, getHighResolutionOutputSizeshNQ4ISI(rect), Camera2StreamConfigurationMap(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            androidx.compose.ui.graphics.Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                drawScope.mo6441drawPathLG529CI(roundRectPath, j, f, drawStyle, colorFilter, i);
                return;
            }
            androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32));
            drawScope.mo6447drawRoundRectuAw5IA(j, getHighResolutionOutputSizeshNQ4ISI(roundRect), getHighSpeedVideoSizes(roundRect), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32)), drawStyle, f, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            drawScope.mo6441drawPathLG529CI(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), j, f, drawStyle, colorFilter, i);
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m6248drawOutlinehn5TExg(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.geometry.Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect();
            drawScope.mo6444drawRectAsUm42w(brush, getHighResolutionOutputSizeshNQ4ISI(rect), Camera2StreamConfigurationMap(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            androidx.compose.ui.graphics.Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                drawScope.mo6440drawPathGBMwjPU(roundRectPath, brush, f, drawStyle, colorFilter, i);
                return;
            }
            androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32));
            drawScope.mo6446drawRoundRectZuiqVtQ(brush, getHighResolutionOutputSizeshNQ4ISI(roundRect), getHighSpeedVideoSizes(roundRect), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32)), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            drawScope.mo6440drawPathGBMwjPU(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), brush, f, drawStyle, colorFilter, i);
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final long Camera2StreamConfigurationMap(androidx.compose.ui.geometry.Rect rect) {
        float right = rect.getRight();
        float left = rect.getLeft();
        float bottom = rect.getBottom();
        float top = rect.getTop();
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(right - left) << 32) | (java.lang.Float.floatToRawIntBits(bottom - top) & 4294967295L));
    }
}
