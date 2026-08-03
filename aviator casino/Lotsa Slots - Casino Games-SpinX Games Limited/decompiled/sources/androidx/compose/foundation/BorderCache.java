package androidx.compose.foundation;

/* compiled from: Border.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÂ\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\tJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J@\u0010\u0018\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "borderPath", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "obtainPath", "toString", "", "drawBorderCache", "Landroidx/compose/ui/draw/CacheDrawScope;", "borderSize", "Landroidx/compose/ui/unit/IntSize;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BorderCache {
    private androidx.compose.ui.graphics.Path borderPath;
    private androidx.compose.ui.graphics.Canvas canvas;
    private androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;
    private androidx.compose.ui.graphics.ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.ui.graphics.ImageBitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.ui.graphics.Canvas getCanvas() {
        return this.canvas;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* renamed from: component4, reason: from getter */
    private final androidx.compose.ui.graphics.Path getBorderPath() {
        return this.borderPath;
    }

    public static /* synthetic */ androidx.compose.foundation.BorderCache copy$default(androidx.compose.foundation.BorderCache borderCache, androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path path, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    public final androidx.compose.foundation.BorderCache copy(androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path borderPath) {
        return new androidx.compose.foundation.BorderCache(imageBitmap, canvas, canvasDrawScope, borderPath);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.BorderCache)) {
            return false;
        }
        androidx.compose.foundation.BorderCache borderCache = (androidx.compose.foundation.BorderCache) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.imageBitmap, borderCache.imageBitmap) && kotlin.jvm.internal.Intrinsics.areEqual(this.canvas, borderCache.canvas) && kotlin.jvm.internal.Intrinsics.areEqual(this.canvasDrawScope, borderCache.canvasDrawScope) && kotlin.jvm.internal.Intrinsics.areEqual(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.imageBitmap;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        androidx.compose.ui.graphics.Canvas canvas = this.canvas;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        androidx.compose.ui.graphics.Path path = this.borderPath;
        return hashCode3 + (path != null ? path.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.graphics.ImageBitmap m220drawBorderCacheEMwLDEs(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, long j, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        boolean z;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.imageBitmap;
        androidx.compose.ui.graphics.Canvas canvas = this.canvas;
        androidx.compose.ui.graphics.ImageBitmapConfig m2334boximpl = imageBitmap != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2334boximpl(imageBitmap.mo1980getConfig_sVssgQ()) : null;
        int m2342getArgb8888_sVssgQ = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
        if (m2334boximpl == null || !androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(m2334boximpl.m2340unboximpl(), m2342getArgb8888_sVssgQ)) {
            if (!androidx.compose.ui.graphics.ImageBitmapConfig.m2336equalsimpl(i, imageBitmap != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2334boximpl(imageBitmap.mo1980getConfig_sVssgQ()) : null)) {
                z = false;
                if (imageBitmap != null || canvas == null || androidx.compose.ui.geometry.Size.m1940getWidthimpl(cacheDrawScope.m1778getSizeNHjbRc()) > imageBitmap.getWidth() || androidx.compose.ui.geometry.Size.m1937getHeightimpl(cacheDrawScope.m1778getSizeNHjbRc()) > imageBitmap.getHeight() || !z) {
                    imageBitmap = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), i, false, null, 24, null);
                    this.imageBitmap = imageBitmap;
                    canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
                    this.canvas = canvas;
                }
                canvasDrawScope = this.canvasDrawScope;
                if (canvasDrawScope == null) {
                    canvasDrawScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
                    this.canvasDrawScope = canvasDrawScope;
                }
                long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(j);
                androidx.compose.ui.unit.LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
                androidx.compose.ui.unit.Density density = drawParams.getDensity();
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
                long size = drawParams.getSize();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
                drawParams2.setDensity(cacheDrawScope);
                drawParams2.setLayoutDirection(layoutDirection);
                drawParams2.setCanvas(canvas);
                drawParams2.m2597setSizeuvyYCjk(m4662toSizeozmzZPI);
                canvas.save();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope2, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, m4662toSizeozmzZPI, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 58, null);
                function1.invoke(canvasDrawScope2);
                canvas.restore();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
                drawParams3.setDensity(density);
                drawParams3.setLayoutDirection(layoutDirection2);
                drawParams3.setCanvas(canvas2);
                drawParams3.m2597setSizeuvyYCjk(size);
                imageBitmap.prepareToDraw();
                return imageBitmap;
            }
        }
        z = true;
        if (imageBitmap != null) {
        }
        imageBitmap = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), i, false, null, 24, null);
        this.imageBitmap = imageBitmap;
        canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
        this.canvas = canvas;
        canvasDrawScope = this.canvasDrawScope;
        if (canvasDrawScope == null) {
        }
        long m4662toSizeozmzZPI2 = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(j);
        androidx.compose.ui.unit.LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope.getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams4.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection22 = drawParams4.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas22 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope.getDrawParams();
        drawParams22.setDensity(cacheDrawScope);
        drawParams22.setLayoutDirection(layoutDirection3);
        drawParams22.setCanvas(canvas);
        drawParams22.m2597setSizeuvyYCjk(m4662toSizeozmzZPI2);
        canvas.save();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope22 = canvasDrawScope;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope22, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, m4662toSizeozmzZPI2, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 58, null);
        function1.invoke(canvasDrawScope22);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams32 = canvasDrawScope.getDrawParams();
        drawParams32.setDensity(density2);
        drawParams32.setLayoutDirection(layoutDirection22);
        drawParams32.setCanvas(canvas22);
        drawParams32.m2597setSizeuvyYCjk(size2);
        imageBitmap.prepareToDraw();
        return imageBitmap;
    }

    public final androidx.compose.ui.graphics.Path obtainPath() {
        androidx.compose.ui.graphics.Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }
}
