package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0010\u0010\u0017\u001a!\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0011\u001a2\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u0014*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "elevation", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "", "clip", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "shadow", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/shadow/Shadow;", "dropShadow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DropShadowScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "innerShadow", "Landroidx/compose/ui/draw/InnerShadowScope;", "Landroidx/compose/ui/draw/ShadowScope;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/draw/ShadowScope;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShadowKt {
    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m5615shadowziNgDLE$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0;
        }
        return m5614shadowziNgDLE(modifier, f, shape, z);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @kotlin.ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.Modifier m5614shadowziNgDLE(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z) {
        return m5612shadows4CzXII(modifier, f, shape, z, androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor(), androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m5613shadows4CzXII$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z, long j, long j2, int i, java.lang.Object obj) {
        boolean z2;
        androidx.compose.ui.graphics.Shape rectangleShape = (i & 2) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z2 = androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0;
        } else {
            z2 = z;
        }
        return m5612shadows4CzXII(modifier, f, rectangleShape, z2, (i & 8) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i & 16) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : j2);
    }

    public static final androidx.compose.ui.Modifier dropShadow(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        return modifier.then(new androidx.compose.ui.draw.SimpleDropShadowElement(shape, shadow));
    }

    public static final androidx.compose.ui.Modifier dropShadow(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.DropShadowScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.draw.BlockDropShadowElement(shape, function1));
    }

    public static final androidx.compose.ui.Modifier innerShadow(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        return modifier.then(new androidx.compose.ui.draw.SimpleInnerShadowElement(shape, shadow));
    }

    public static final androidx.compose.ui.Modifier innerShadow(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.InnerShadowScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.draw.BlockInnerShadowElement(shape, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.compose.ui.draw.ShadowScope shadowScope) {
        shadowScope.setRadius(0.0f);
        shadowScope.setSpread(0.0f);
        shadowScope.mo5538setOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
        shadowScope.mo5537setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU());
        shadowScope.setBrush(null);
        shadowScope.setAlpha(1.0f);
        shadowScope.mo5536setBlendModes9anfk8(androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU());
    }

    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m5612shadows4CzXII(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z, long j, long j2) {
        return (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0 || z) ? modifier.then(new androidx.compose.ui.draw.ShadowGraphicsLayerElement(f, shape, z, j, j2, null)) : modifier;
    }
}
