package androidx.compose.ui.graphics;

/* compiled from: Outline.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009f\u0001\u0010\u001a\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010\"\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010%\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!H\u0082\b\u001a\f\u0010'\u001a\u00020(*\u00020#H\u0002\u001a\u0011\u0010)\u001a\u00020**\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010)\u001a\u00020**\u00020#H\u0002¢\u0006\u0002\u0010,\u001a\u0011\u0010-\u001a\u00020.*\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010-\u001a\u00020.*\u00020#H\u0002¢\u0006\u0002\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Outline outline) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            path.addRect(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect());
        } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            path.addRoundRect(((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect());
        } else {
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.Path.CC.m2392addPathUv8p0NA$default(path, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m2378drawOutlinehn5TExg$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        if ((i2 & 8) != 0) {
            drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
        }
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        androidx.compose.ui.graphics.ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU();
        }
        m2377drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    private static final long topLeft(androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.geometry.SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }

    private static final long size(androidx.compose.ui.geometry.RoundRect roundRect) {
        return androidx.compose.ui.geometry.SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final void drawOutlineHelper(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.RoundRect, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.graphics.Path, kotlin.Unit> function23) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            function2.invoke(drawScope, ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect());
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            androidx.compose.ui.graphics.Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                function23.invoke(drawScope, roundRectPath);
                return;
            } else {
                function22.invoke(drawScope, rounded.getRoundRect());
                return;
            }
        }
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        function23.invoke(drawScope, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath());
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
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(rounded.getRoundRect().m1919getBottomLeftCornerRadiuskKHJgLs()), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(rounded.getRoundRect().m1919getBottomLeftCornerRadiuskKHJgLs()), paint);
                return;
            }
        }
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        canvas.drawPath(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), paint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect roundRect) {
        return ((androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1920getBottomRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) > androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) ? 1 : (androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1922getTopRightCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(roundRect.m1921getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m2379drawOutlinewDX37Ww(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, long j, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        androidx.compose.ui.graphics.Path path;
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.geometry.Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect();
            drawScope.mo2588drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo2590drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f, colorFilter, i);
                return;
            }
        } else {
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            path = ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath();
        }
        drawScope.mo2584drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m2377drawOutlinehn5TExg(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        androidx.compose.ui.graphics.Path path;
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.geometry.Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect();
            drawScope.mo2587drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo2589drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f, drawStyle, colorFilter, i);
                return;
            }
        } else {
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            path = ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath();
        }
        drawScope.mo2583drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }
}
