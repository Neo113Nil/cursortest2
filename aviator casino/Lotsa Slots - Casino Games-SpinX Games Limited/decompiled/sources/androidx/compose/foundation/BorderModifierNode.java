package androidx.compose.foundation;

/* compiled from: Border.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends androidx.compose.ui.node.DelegatingNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.BorderCache borderCache;
    private androidx.compose.ui.graphics.Brush brush;
    private final androidx.compose.ui.draw.CacheDrawModifierNode drawWithCacheModifierNode;
    private androidx.compose.ui.graphics.Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (androidx.compose.ui.draw.CacheDrawModifierNode) delegate(androidx.compose.ui.draw.DrawModifierKt.CacheDrawModifierNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.ui.draw.DrawResult invoke(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
                androidx.compose.ui.draw.DrawResult drawContentWithoutBorder;
                androidx.compose.ui.draw.DrawResult m226drawRectBorderNsqcLGU;
                androidx.compose.ui.draw.DrawResult m229drawRoundRectBorderJqoCqck;
                androidx.compose.ui.draw.DrawResult drawGenericBorder;
                if (cacheDrawScope.mo315toPx0680j_4(androidx.compose.foundation.BorderModifierNode.this.getWidth()) < 0.0f || androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(cacheDrawScope.m1778getSizeNHjbRc()) <= 0.0f) {
                    drawContentWithoutBorder = androidx.compose.foundation.BorderKt.drawContentWithoutBorder(cacheDrawScope);
                    return drawContentWithoutBorder;
                }
                float f2 = 2;
                float min = java.lang.Math.min(androidx.compose.ui.unit.Dp.m4483equalsimpl0(androidx.compose.foundation.BorderModifierNode.this.getWidth(), androidx.compose.ui.unit.Dp.INSTANCE.m4496getHairlineD9Ej5fM()) ? 1.0f : (float) java.lang.Math.ceil(cacheDrawScope.mo315toPx0680j_4(androidx.compose.foundation.BorderModifierNode.this.getWidth())), (float) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(cacheDrawScope.m1778getSizeNHjbRc()) / f2));
                float f3 = min / f2;
                long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(f3, f3);
                long Size = androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.geometry.Size.m1940getWidthimpl(cacheDrawScope.m1778getSizeNHjbRc()) - min, androidx.compose.ui.geometry.Size.m1937getHeightimpl(cacheDrawScope.m1778getSizeNHjbRc()) - min);
                boolean z = f2 * min > androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(cacheDrawScope.m1778getSizeNHjbRc());
                androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI = androidx.compose.foundation.BorderModifierNode.this.getShape().mo262createOutlinePq9zytI(cacheDrawScope.m1778getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Generic) {
                    androidx.compose.foundation.BorderModifierNode borderModifierNode = androidx.compose.foundation.BorderModifierNode.this;
                    drawGenericBorder = borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (androidx.compose.ui.graphics.Outline.Generic) mo262createOutlinePq9zytI, z, min);
                    return drawGenericBorder;
                }
                if (mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                    androidx.compose.foundation.BorderModifierNode borderModifierNode2 = androidx.compose.foundation.BorderModifierNode.this;
                    m229drawRoundRectBorderJqoCqck = borderModifierNode2.m229drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (androidx.compose.ui.graphics.Outline.Rounded) mo262createOutlinePq9zytI, Offset, Size, z, min);
                    return m229drawRoundRectBorderJqoCqck;
                }
                if (!(mo262createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rectangle)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                m226drawRectBorderNsqcLGU = androidx.compose.foundation.BorderKt.m226drawRectBorderNsqcLGU(cacheDrawScope, androidx.compose.foundation.BorderModifierNode.this.getBrush(), Offset, Size, z, min);
                return m226drawRectBorderNsqcLGU;
            }
        }));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m231setWidth0680j_4(float f) {
        if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(androidx.compose.ui.graphics.Brush brush) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    public final void setShape(androidx.compose.ui.graphics.Shape shape) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, final androidx.compose.ui.graphics.Brush brush, final androidx.compose.ui.graphics.Outline.Generic generic, boolean z, float f) {
        int m2342getArgb8888_sVssgQ;
        androidx.compose.ui.graphics.ColorFilter colorFilter;
        boolean z2;
        ?? r12;
        androidx.compose.ui.graphics.Canvas canvas;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(contentDrawScope, androidx.compose.ui.graphics.Outline.Generic.this.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof androidx.compose.ui.graphics.SolidColor) {
            m2342getArgb8888_sVssgQ = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ();
            colorFilter = androidx.compose.ui.graphics.ColorFilter.Companion.m2154tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, ((androidx.compose.ui.graphics.SolidColor) brush).getValue(), 0, 2, null);
        } else {
            m2342getArgb8888_sVssgQ = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
            colorFilter = null;
        }
        final androidx.compose.ui.geometry.Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new androidx.compose.foundation.BorderCache(null, null, null, null, 15, null);
        }
        androidx.compose.foundation.BorderCache borderCache = this.borderCache;
        kotlin.jvm.internal.Intrinsics.checkNotNull(borderCache);
        androidx.compose.ui.graphics.Path obtainPath = borderCache.obtainPath();
        obtainPath.reset();
        obtainPath.addRect(bounds);
        obtainPath.mo2005opN5in7k0(obtainPath, generic.getPath(), androidx.compose.ui.graphics.PathOperation.INSTANCE.m2413getDifferenceb3I0S0c());
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize((int) java.lang.Math.ceil(bounds.getWidth()), (int) java.lang.Math.ceil(bounds.getHeight()));
        androidx.compose.foundation.BorderCache borderCache2 = this.borderCache;
        kotlin.jvm.internal.Intrinsics.checkNotNull(borderCache2);
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = borderCache2.imageBitmap;
        androidx.compose.ui.graphics.Canvas canvas2 = borderCache2.canvas;
        androidx.compose.ui.graphics.ImageBitmapConfig m2334boximpl = imageBitmap != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2334boximpl(imageBitmap.mo1980getConfig_sVssgQ()) : null;
        int m2342getArgb8888_sVssgQ2 = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
        if (m2334boximpl == null || !androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(m2334boximpl.m2340unboximpl(), m2342getArgb8888_sVssgQ2)) {
            if (!androidx.compose.ui.graphics.ImageBitmapConfig.m2336equalsimpl(m2342getArgb8888_sVssgQ, imageBitmap != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2334boximpl(imageBitmap.mo1980getConfig_sVssgQ()) : null)) {
                z2 = false;
                if (imageBitmap != null || canvas2 == null || androidx.compose.ui.geometry.Size.m1940getWidthimpl(cacheDrawScope.m1778getSizeNHjbRc()) > imageBitmap.getWidth() || androidx.compose.ui.geometry.Size.m1937getHeightimpl(cacheDrawScope.m1778getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
                    androidx.compose.ui.graphics.ImageBitmap m2347ImageBitmapx__hDU$default = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize), m2342getArgb8888_sVssgQ, false, null, 24, null);
                    borderCache2.imageBitmap = m2347ImageBitmapx__hDU$default;
                    androidx.compose.ui.graphics.Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m2347ImageBitmapx__hDU$default);
                    borderCache2.canvas = Canvas;
                    r12 = m2347ImageBitmapx__hDU$default;
                    canvas = Canvas;
                } else {
                    r12 = imageBitmap;
                    canvas = canvas2;
                }
                canvasDrawScope = borderCache2.canvasDrawScope;
                if (canvasDrawScope == null) {
                    canvasDrawScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
                    borderCache2.canvasDrawScope = canvasDrawScope;
                }
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(IntSize);
                androidx.compose.ui.unit.LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
                androidx.compose.ui.unit.Density density = drawParams.getDensity();
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                androidx.compose.ui.graphics.Canvas canvas3 = drawParams.getCanvas();
                long size = drawParams.getSize();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
                drawParams2.setDensity(cacheDrawScope);
                drawParams2.setLayoutDirection(layoutDirection);
                drawParams2.setCanvas(canvas);
                drawParams2.m2597setSizeuvyYCjk(m4662toSizeozmzZPI);
                canvas.save();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope3, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, m4662toSizeozmzZPI, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 58, null);
                float f2 = -bounds.getLeft();
                float f3 = -bounds.getTop();
                canvasDrawScope3.getDrawContext().getTransform().translate(f2, f3);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f4 = 1;
                float m1940getWidthimpl = (androidx.compose.ui.geometry.Size.m1940getWidthimpl(canvasDrawScope3.mo2592getSizeNHjbRc()) + f4) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(canvasDrawScope3.mo2592getSizeNHjbRc());
                float m1937getHeightimpl = (androidx.compose.ui.geometry.Size.m1937getHeightimpl(canvasDrawScope3.mo2592getSizeNHjbRc()) + f4) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(canvasDrawScope3.mo2592getSizeNHjbRc());
                long mo2591getCenterF1C5BW0 = canvasDrawScope3.mo2591getCenterF1C5BW0();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope3.getDrawContext();
                long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2605scale0AR0LA0(m1940getWidthimpl, m1937getHeightimpl, mo2591getCenterF1C5BW0);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 28, null);
                drawContext.getCanvas().restore();
                drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                canvasDrawScope3.getDrawContext().getTransform().translate(-f2, -f3);
                canvas.restore();
                androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                drawParams3.setDensity(density);
                drawParams3.setLayoutDirection(layoutDirection2);
                drawParams3.setCanvas(canvas3);
                drawParams3.m2597setSizeuvyYCjk(size);
                r12.prepareToDraw();
                objectRef.element = r12;
                final androidx.compose.ui.graphics.ColorFilter colorFilter2 = colorFilter;
                return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                        invoke2(contentDrawScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                        contentDrawScope.drawContent();
                        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float left = androidx.compose.ui.geometry.Rect.this.getLeft();
                        float top = androidx.compose.ui.geometry.Rect.this.getTop();
                        kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.graphics.ImageBitmap> objectRef2 = objectRef;
                        long j = IntSize;
                        androidx.compose.ui.graphics.ColorFilter colorFilter3 = colorFilter2;
                        contentDrawScope2.getDrawContext().getTransform().translate(left, top);
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(contentDrawScope2, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter3, 0, 0, 890, null);
                        contentDrawScope2.getDrawContext().getTransform().translate(-left, -top);
                    }
                });
            }
        }
        z2 = true;
        if (imageBitmap != null) {
        }
        androidx.compose.ui.graphics.ImageBitmap m2347ImageBitmapx__hDU$default2 = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize), m2342getArgb8888_sVssgQ, false, null, 24, null);
        borderCache2.imageBitmap = m2347ImageBitmapx__hDU$default2;
        androidx.compose.ui.graphics.Canvas Canvas2 = androidx.compose.ui.graphics.CanvasKt.Canvas(m2347ImageBitmapx__hDU$default2);
        borderCache2.canvas = Canvas2;
        r12 = m2347ImageBitmapx__hDU$default2;
        canvas = Canvas2;
        canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
        }
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope22 = canvasDrawScope;
        long m4662toSizeozmzZPI2 = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(IntSize);
        androidx.compose.ui.unit.LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope22.getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams4.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection22 = drawParams4.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas32 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope22.getDrawParams();
        drawParams22.setDensity(cacheDrawScope);
        drawParams22.setLayoutDirection(layoutDirection3);
        drawParams22.setCanvas(canvas);
        drawParams22.m2597setSizeuvyYCjk(m4662toSizeozmzZPI2);
        canvas.save();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope32 = canvasDrawScope22;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope32, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, m4662toSizeozmzZPI2, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 58, null);
        float f22 = -bounds.getLeft();
        float f32 = -bounds.getTop();
        canvasDrawScope32.getDrawContext().getTransform().translate(f22, f32);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(canvasDrawScope32, generic.getPath(), brush, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f42 = 1;
        float m1940getWidthimpl2 = (androidx.compose.ui.geometry.Size.m1940getWidthimpl(canvasDrawScope32.mo2592getSizeNHjbRc()) + f42) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(canvasDrawScope32.mo2592getSizeNHjbRc());
        float m1937getHeightimpl2 = (androidx.compose.ui.geometry.Size.m1937getHeightimpl(canvasDrawScope32.mo2592getSizeNHjbRc()) + f42) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(canvasDrawScope32.mo2592getSizeNHjbRc());
        long mo2591getCenterF1C5BW02 = canvasDrawScope32.mo2591getCenterF1C5BW0();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope32.getDrawContext();
        long mo2598getSizeNHjbRc2 = drawContext2.mo2598getSizeNHjbRc();
        drawContext2.getCanvas().save();
        drawContext2.getTransform().mo2605scale0AR0LA0(m1940getWidthimpl2, m1937getHeightimpl2, mo2591getCenterF1C5BW02);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(canvasDrawScope32, obtainPath, brush, 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 28, null);
        drawContext2.getCanvas().restore();
        drawContext2.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc2);
        canvasDrawScope32.getDrawContext().getTransform().translate(-f22, -f32);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams32 = canvasDrawScope22.getDrawParams();
        drawParams32.setDensity(density2);
        drawParams32.setLayoutDirection(layoutDirection22);
        drawParams32.setCanvas(canvas32);
        drawParams32.m2597setSizeuvyYCjk(size2);
        r12.prepareToDraw();
        objectRef.element = r12;
        final androidx.compose.ui.graphics.ColorFilter colorFilter22 = colorFilter;
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                float left = androidx.compose.ui.geometry.Rect.this.getLeft();
                float top = androidx.compose.ui.geometry.Rect.this.getTop();
                kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.graphics.ImageBitmap> objectRef2 = objectRef;
                long j = IntSize;
                androidx.compose.ui.graphics.ColorFilter colorFilter3 = colorFilter22;
                contentDrawScope2.getDrawContext().getTransform().translate(left, top);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(contentDrawScope2, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter3, 0, 0, 890, null);
                contentDrawScope2.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final androidx.compose.ui.draw.DrawResult m229drawRoundRectBorderJqoCqck(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, final androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        final androidx.compose.ui.graphics.Path createRoundRectPath;
        if (androidx.compose.ui.geometry.RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m1921getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1921getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                    long m227shrinkKibmq7A;
                    contentDrawScope.drawContent();
                    if (z) {
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2673drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, m1921getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float m1846getXimpl = androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(m1921getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (m1846getXimpl < f3) {
                        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float f4 = f;
                        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(contentDrawScope.mo2592getSizeNHjbRc()) - f;
                        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(contentDrawScope.mo2592getSizeNHjbRc()) - f;
                        int m2101getDifferencertfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2101getDifferencertfAjoo();
                        androidx.compose.ui.graphics.Brush brush2 = brush;
                        long j3 = m1921getTopLeftCornerRadiuskKHJgLs;
                        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
                        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo2601clipRectN_I0leg(f4, f4, m1940getWidthimpl, m1937getHeightimpl, m2101getDifferencertfAjoo);
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2673drawRoundRectZuiqVtQ$default(contentDrawScope2, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                        return;
                    }
                    androidx.compose.ui.graphics.Brush brush3 = brush;
                    long j4 = j;
                    long j5 = j2;
                    m227shrinkKibmq7A = androidx.compose.foundation.BorderKt.m227shrinkKibmq7A(m1921getTopLeftCornerRadiuskKHJgLs, f3);
                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2673drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, j4, j5, m227shrinkKibmq7A, 0.0f, stroke, null, 0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new androidx.compose.foundation.BorderCache(null, null, null, null, 15, null);
        }
        androidx.compose.foundation.BorderCache borderCache = this.borderCache;
        kotlin.jvm.internal.Intrinsics.checkNotNull(borderCache);
        createRoundRectPath = androidx.compose.foundation.BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2667drawPathGBMwjPU$default(contentDrawScope, androidx.compose.ui.graphics.Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
