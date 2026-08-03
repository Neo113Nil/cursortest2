package androidx.compose.ui.draw;

/* compiled from: Blur.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1765blur1fqSgw$default(androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.ui.draw.BlurredEdgeTreatment blurredEdgeTreatment, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = androidx.compose.ui.draw.BlurredEdgeTreatment.m1768boximpl(androidx.compose.ui.draw.BlurredEdgeTreatment.INSTANCE.m1775getRectangleGoahg());
        }
        return m1764blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m1774unboximpl());
    }

    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1764blur1fqSgw(androidx.compose.ui.Modifier modifier, final float f, final float f2, final androidx.compose.ui.graphics.Shape shape) {
        final int m2495getDecal3opZhB0;
        final boolean z;
        if (shape != null) {
            m2495getDecal3opZhB0 = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            z = true;
        } else {
            m2495getDecal3opZhB0 = androidx.compose.ui.graphics.TileMode.INSTANCE.m2495getDecal3opZhB0();
            z = false;
        }
        float f3 = 0;
        return ((androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(f3)) <= 0 || androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f2, androidx.compose.ui.unit.Dp.m4478constructorimpl(f3)) <= 0) && !z) ? modifier : androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                float f4 = graphicsLayerScope.mo315toPx0680j_4(f);
                float f5 = graphicsLayerScope.mo315toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((f4 <= 0.0f || f5 <= 0.0f) ? null : androidx.compose.ui.graphics.RenderEffectKt.m2429BlurEffect3YTHUZs(f4, f5, m2495getDecal3opZhB0));
                androidx.compose.ui.graphics.Shape shape2 = shape;
                if (shape2 == null) {
                    shape2 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(shape2);
                graphicsLayerScope.setClip(z);
            }
        });
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1767blurF8QBwvs$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.draw.BlurredEdgeTreatment blurredEdgeTreatment, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = androidx.compose.ui.draw.BlurredEdgeTreatment.m1768boximpl(androidx.compose.ui.draw.BlurredEdgeTreatment.INSTANCE.m1775getRectangleGoahg());
        }
        return m1766blurF8QBwvs(modifier, f, blurredEdgeTreatment.m1774unboximpl());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1766blurF8QBwvs(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape) {
        return m1764blur1fqSgw(modifier, f, f, shape);
    }
}
