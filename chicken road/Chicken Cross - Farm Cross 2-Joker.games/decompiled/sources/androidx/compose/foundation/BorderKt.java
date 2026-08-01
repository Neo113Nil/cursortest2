package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a:\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aA\u0010#\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aW\u0010+\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0012\u0010/\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a!\u00100\u001a\u000201*\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "obtain", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderKt {
    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    public static final Modifier border(Modifier modifier, BorderStroke border, Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m180borderziNgDLE(modifier, border.getWidth(), border.getBrush(), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m179borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m178borderxT4_qwU(modifier, f, j, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m178borderxT4_qwU(Modifier border, float f, long j, Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m180borderziNgDLE(border, f, new SolidColor(j, null), shape);
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m1808equalsimpl(r13, r4 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m1806boximpl(r4.mo1500getConfig_sVssgQ()) : null) != false) goto L23;
     */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int m1814getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        ?? r11;
        Canvas canvas;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    DrawScope.m2112drawPathGBMwjPU$default(onDrawWithContent, Outline.Generic.this.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            m1814getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1813getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m1669tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            m1814getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1814getArgb8888_sVssgQ();
            colorFilter = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        BorderCache obtain = obtain(ref);
        Path obtainPath = obtain.obtainPath();
        obtainPath.reset();
        obtainPath.addRect(bounds);
        obtainPath.mo1525opN5in7k0(obtainPath, generic.getPath(), PathOperation.INSTANCE.m1880getDifferenceb3I0S0c());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long IntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        ImageBitmap imageBitmap = obtain.imageBitmap;
        Canvas canvas2 = obtain.canvas;
        ImageBitmapConfig m1806boximpl = imageBitmap != null ? ImageBitmapConfig.m1806boximpl(imageBitmap.mo1500getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m1806boximpl == null ? false : ImageBitmapConfig.m1809equalsimpl0(m1806boximpl.m1812unboximpl(), ImageBitmapConfig.INSTANCE.m1814getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        if (imageBitmap == null || canvas2 == null || Size.m1461getWidthimpl(cacheDrawScope.m1315getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m1458getHeightimpl(cacheDrawScope.m1315getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap m1819ImageBitmapx__hDU$default = ImageBitmapKt.m1819ImageBitmapx__hDU$default(IntSize.m4000getWidthimpl(IntSize), IntSize.m3999getHeightimpl(IntSize), m1814getArgb8888_sVssgQ, false, null, 24, null);
            obtain.imageBitmap = m1819ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m1819ImageBitmapx__hDU$default);
            obtain.canvas = Canvas;
            r11 = m1819ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r11 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = obtain.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            obtain.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long m4010toSizeozmzZPI = IntSizeKt.m4010toSizeozmzZPI(IntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2046setSizeuvyYCjk(m4010toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.m2117drawRectnJ9OG0$default(canvasDrawScope3, Color.INSTANCE.m1654getBlack0d7_KjU(), 0L, m4010toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m1545getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f2, f3);
        DrawScope.m2112drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float m1461getWidthimpl = (Size.m1461getWidthimpl(canvasDrawScope3.mo2122getSizeNHjbRc()) + f4) / Size.m1461getWidthimpl(canvasDrawScope3.mo2122getSizeNHjbRc());
        float m1458getHeightimpl = (Size.m1458getHeightimpl(canvasDrawScope3.mo2122getSizeNHjbRc()) + f4) / Size.m1458getHeightimpl(canvasDrawScope3.mo2122getSizeNHjbRc());
        long mo2121getCenterF1C5BW0 = canvasDrawScope3.mo2121getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope3.getDrawContext();
        long mo2047getSizeNHjbRc = drawContext.mo2047getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2054scale0AR0LA0(m1461getWidthimpl, m1458getHeightimpl, mo2121getCenterF1C5BW0);
        DrawScope.m2112drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m1545getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo2048setSizeuvyYCjk(mo2047getSizeNHjbRc);
        canvasDrawScope3.getDrawContext().getTransform().translate(-f2, -f3);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2046setSizeuvyYCjk(size);
        r11.prepareToDraw();
        objectRef.element = r11;
        final ColorFilter colorFilter2 = colorFilter;
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                ContentDrawScope contentDrawScope = onDrawWithContent;
                float left = Rect.this.getLeft();
                float top = Rect.this.getTop();
                Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                long j = IntSize;
                ColorFilter colorFilter3 = colorFilter2;
                contentDrawScope.getDrawContext().getTransform().translate(left, top);
                DrawScope.m2106drawImageAZ2fEMs$default(contentDrawScope, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter3, 0, 0, 890, null);
                contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m182drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, androidx.compose.ui.node.Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m1442getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1442getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope onDrawWithContent) {
                    long m183shrinkKibmq7A;
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    if (z) {
                        DrawScope.m2118drawRoundRectZuiqVtQ$default(onDrawWithContent, brush, 0L, 0L, m1442getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float m1367getXimpl = CornerRadius.m1367getXimpl(m1442getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (m1367getXimpl < f3) {
                        ContentDrawScope contentDrawScope = onDrawWithContent;
                        float f4 = f;
                        float m1461getWidthimpl = Size.m1461getWidthimpl(onDrawWithContent.mo2122getSizeNHjbRc()) - f;
                        float m1458getHeightimpl = Size.m1458getHeightimpl(onDrawWithContent.mo2122getSizeNHjbRc()) - f;
                        int m1616getDifferencertfAjoo = ClipOp.INSTANCE.m1616getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j3 = m1442getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext = contentDrawScope.getDrawContext();
                        long mo2047getSizeNHjbRc = drawContext.mo2047getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo2050clipRectN_I0leg(f4, f4, m1461getWidthimpl, m1458getHeightimpl, m1616getDifferencertfAjoo);
                        DrawScope.m2118drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo2048setSizeuvyYCjk(mo2047getSizeNHjbRc);
                        return;
                    }
                    Brush brush3 = brush;
                    long j4 = j;
                    long j5 = j2;
                    m183shrinkKibmq7A = BorderKt.m183shrinkKibmq7A(m1442getTopLeftCornerRadiuskKHJgLs, f3);
                    DrawScope.m2118drawRoundRectZuiqVtQ$default(onDrawWithContent, brush3, j4, j5, m183shrinkKibmq7A, 0.0f, stroke, null, 0, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
                }
            });
        }
        final Path createRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                DrawScope.m2112drawPathGBMwjPU$default(onDrawWithContent, Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m181drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long m1408getZeroF1C5BW0 = z ? Offset.INSTANCE.m1408getZeroF1C5BW0() : j;
        final long m1315getSizeNHjbRc = z ? cacheDrawScope.m1315getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                DrawScope.m2116drawRectAsUm42w$default(onDrawWithContent, Brush.this, m1408getZeroF1C5BW0, m1315getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo1525opN5in7k0(path, Path, PathOperation.INSTANCE.m1880getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m183shrinkKibmq7A(roundRect.m1442getTopLeftCornerRadiuskKHJgLs(), f), m183shrinkKibmq7A(roundRect.m1443getTopRightCornerRadiuskKHJgLs(), f), m183shrinkKibmq7A(roundRect.m1441getBottomRightCornerRadiuskKHJgLs(), f), m183shrinkKibmq7A(roundRect.m1440getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m183shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m1367getXimpl(j) - f), Math.max(0.0f, CornerRadius.m1368getYimpl(j) - f));
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m180borderziNgDLE(Modifier border, final float f, final Brush brush, final Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(border, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
                inspectorInfo.getProperties().set("width", Dp.m3838boximpl(f));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m1618boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m1618boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt$border$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1498088849);
                ComposerKt.sourceInformation(composer, "C97@4024L31:Border.kt#71ulvw");
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.ui.node.Ref();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final androidx.compose.ui.node.Ref ref = (androidx.compose.ui.node.Ref) rememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f2 = f;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt$border$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DrawResult invoke(CacheDrawScope drawWithCache) {
                        DrawResult drawContentWithoutBorder;
                        DrawResult m181drawRectBorderNsqcLGU;
                        DrawResult m182drawRoundRectBorderSYlcjDY;
                        DrawResult drawGenericBorder;
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        if (drawWithCache.mo315toPx0680j_4(f2) < 0.0f || Size.m1460getMinDimensionimpl(drawWithCache.m1315getSizeNHjbRc()) <= 0.0f) {
                            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(drawWithCache);
                            return drawContentWithoutBorder;
                        }
                        float f3 = 2;
                        float min = Math.min(Dp.m3845equalsimpl0(f2, Dp.INSTANCE.m3858getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo315toPx0680j_4(f2)), (float) Math.ceil(Size.m1460getMinDimensionimpl(drawWithCache.m1315getSizeNHjbRc()) / f3));
                        float f4 = min / f3;
                        long Offset = OffsetKt.Offset(f4, f4);
                        long Size = SizeKt.Size(Size.m1461getWidthimpl(drawWithCache.m1315getSizeNHjbRc()) - min, Size.m1458getHeightimpl(drawWithCache.m1315getSizeNHjbRc()) - min);
                        boolean z = f3 * min > Size.m1460getMinDimensionimpl(drawWithCache.m1315getSizeNHjbRc());
                        Outline mo208createOutlinePq9zytI = shape2.mo208createOutlinePq9zytI(drawWithCache.m1315getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
                        if (mo208createOutlinePq9zytI instanceof Outline.Generic) {
                            drawGenericBorder = BorderKt.drawGenericBorder(drawWithCache, ref, brush2, (Outline.Generic) mo208createOutlinePq9zytI, z, min);
                            return drawGenericBorder;
                        }
                        if (mo208createOutlinePq9zytI instanceof Outline.Rounded) {
                            m182drawRoundRectBorderSYlcjDY = BorderKt.m182drawRoundRectBorderSYlcjDY(drawWithCache, ref, brush2, (Outline.Rounded) mo208createOutlinePq9zytI, Offset, Size, z, min);
                            return m182drawRoundRectBorderSYlcjDY;
                        }
                        if (!(mo208createOutlinePq9zytI instanceof Outline.Rectangle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m181drawRectBorderNsqcLGU = BorderKt.m181drawRectBorderNsqcLGU(drawWithCache, brush2, Offset, Size, z, min);
                        return m181drawRectBorderNsqcLGU;
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }
        });
    }
}
