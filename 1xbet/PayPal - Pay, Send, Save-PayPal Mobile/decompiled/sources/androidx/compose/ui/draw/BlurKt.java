package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radiusX", "Landroidx/compose/ui/unit/Dp;", "radiusY", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radius", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m5540blur1fqSgw$default(androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.ui.draw.BlurredEdgeTreatment blurredEdgeTreatment, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = androidx.compose.ui.draw.BlurredEdgeTreatment.m5543boximpl(androidx.compose.ui.draw.BlurredEdgeTreatment.INSTANCE.m5550getRectangleGoahg());
        }
        return m5539blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m5549unboximpl());
    }

    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m5539blur1fqSgw(androidx.compose.ui.Modifier modifier, final float f, final float f2, final androidx.compose.ui.graphics.Shape shape) {
        int m6362getDecal3opZhB0;
        boolean z;
        if (shape != null) {
            m6362getDecal3opZhB0 = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            z = true;
        } else {
            m6362getDecal3opZhB0 = androidx.compose.ui.graphics.TileMode.INSTANCE.m6362getDecal3opZhB0();
            z = false;
        }
        final int i = m6362getDecal3opZhB0;
        final boolean z2 = z;
        return ((androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) <= 0 || androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f2, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) <= 0) && !z2) ? modifier : androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                getHighResolutionOutputSizeshNQ4ISI(graphicsLayerScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                float f3 = graphicsLayerScope.mo1418toPx0680j_4(f);
                float f4 = graphicsLayerScope.mo1418toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((f3 <= 0.0f || f4 <= 0.0f) ? null : androidx.compose.ui.graphics.RenderEffectKt.m6302BlurEffect3YTHUZs(f3, f4, i));
                androidx.compose.ui.graphics.Shape shape2 = shape;
                if (shape2 == null) {
                    shape2 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(shape2);
                graphicsLayerScope.setClip(z2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m5542blurF8QBwvs$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.draw.BlurredEdgeTreatment blurredEdgeTreatment, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = androidx.compose.ui.draw.BlurredEdgeTreatment.m5543boximpl(androidx.compose.ui.draw.BlurredEdgeTreatment.INSTANCE.m5550getRectangleGoahg());
        }
        return m5541blurF8QBwvs(modifier, f, blurredEdgeTreatment.m5549unboximpl());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m5541blurF8QBwvs(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape) {
        return m5539blur1fqSgw(modifier, f, f, shape);
    }
}
