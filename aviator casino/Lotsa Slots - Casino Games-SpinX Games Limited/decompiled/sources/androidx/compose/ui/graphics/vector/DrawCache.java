package androidx.compose.ui.graphics.vector;

/* compiled from: DrawCache.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JI\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\f\u0010'\u001a\u00020\u0019*\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "()V", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "I", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage$annotations", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "drawCachedImage", "", "density", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawInto", "target", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "clear", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private androidx.compose.ui.graphics.Canvas cachedCanvas;
    private androidx.compose.ui.graphics.ImageBitmap mCachedImage;
    private androidx.compose.ui.unit.Density scopeDensity;
    private androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
    private long size = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    private int config = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope cacheScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    public final androidx.compose.ui.graphics.ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m2752drawCachedImageFqjB98A(int config, long size, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.mCachedImage;
        androidx.compose.ui.graphics.Canvas canvas = this.cachedCanvas;
        if (imageBitmap == null || canvas == null || androidx.compose.ui.unit.IntSize.m4652getWidthimpl(size) > imageBitmap.getWidth() || androidx.compose.ui.unit.IntSize.m4651getHeightimpl(size) > imageBitmap.getHeight() || !androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(this.config, config)) {
            imageBitmap = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(size), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(size), config, false, null, 24, null);
            canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
            this.mCachedImage = imageBitmap;
            this.cachedCanvas = canvas;
            this.config = config;
        }
        this.size = size;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.cacheScope;
        long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(size);
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2597setSizeuvyYCjk(m4662toSizeozmzZPI);
        canvas.save();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        clear(canvasDrawScope2);
        block.invoke(canvasDrawScope2);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2597setSizeuvyYCjk(size2);
        imageBitmap.prepareToDraw();
    }

    public static /* synthetic */ void drawInto$default(androidx.compose.ui.graphics.vector.DrawCache drawCache, androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f, colorFilter);
    }

    public final void drawInto(androidx.compose.ui.graphics.drawscope.DrawScope target, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap == null) {
            throw new java.lang.IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(target, imageBitmap, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    private final void clear(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(drawScope, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 62, null);
    }
}
