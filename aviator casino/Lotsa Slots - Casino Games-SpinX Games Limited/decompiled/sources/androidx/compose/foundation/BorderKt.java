package androidx.compose.foundation;

/* compiled from: Border.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a>\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "fillArea", "", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderKt {
    public static /* synthetic */ androidx.compose.ui.Modifier border$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.BorderStroke borderStroke, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    public static final androidx.compose.ui.Modifier border(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.BorderStroke borderStroke, androidx.compose.ui.graphics.Shape shape) {
        return m225borderziNgDLE(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m224borderxT4_qwU$default(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        return m223borderxT4_qwU(modifier, f, j, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m223borderxT4_qwU(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.ui.graphics.Shape shape) {
        return m225borderziNgDLE(modifier, f, new androidx.compose.ui.graphics.SolidColor(j, null), shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m225borderziNgDLE(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape) {
        return modifier.then(new androidx.compose.foundation.BorderModifierNodeElement(f, brush, shape, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.DrawResult drawContentWithoutBorder(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final androidx.compose.ui.draw.DrawResult m226drawRectBorderNsqcLGU(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, final androidx.compose.ui.graphics.Brush brush, long j, long j2, boolean z, float f) {
        final long m1887getZeroF1C5BW0 = z ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j;
        final long m1778getSizeNHjbRc = z ? cacheDrawScope.m1778getSizeNHjbRc() : j2;
        final androidx.compose.ui.graphics.drawscope.DrawStyle stroke = z ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : new androidx.compose.ui.graphics.drawscope.Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
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
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2671drawRectAsUm42w$default(contentDrawScope, androidx.compose.ui.graphics.Brush.this, m1887getZeroF1C5BW0, m1778getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.Path createRoundRectPath(androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo2005opN5in7k0(path, Path, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2413getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final androidx.compose.ui.geometry.RoundRect createInsetRoundedRect(float f, androidx.compose.ui.geometry.RoundRect roundRect) {
        return new androidx.compose.ui.geometry.RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m227shrinkKibmq7A(roundRect.m1921getTopLeftCornerRadiuskKHJgLs(), f), m227shrinkKibmq7A(roundRect.m1922getTopRightCornerRadiuskKHJgLs(), f), m227shrinkKibmq7A(roundRect.m1920getBottomRightCornerRadiuskKHJgLs(), f), m227shrinkKibmq7A(roundRect.m1919getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m227shrinkKibmq7A(long j, float f) {
        return androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(java.lang.Math.max(0.0f, androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(j) - f), java.lang.Math.max(0.0f, androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(j) - f));
    }
}
