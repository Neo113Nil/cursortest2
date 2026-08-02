package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "rememberGraphicsLayer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "GraphicsLayerScope", "()Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "DefaultCameraDistance", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/ui/graphics/Color;", "DefaultShadowColor", "J", "getDefaultShadowColor", "()J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }

    public static final androidx.compose.ui.graphics.layer.GraphicsLayer rememberGraphicsLayer(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(158092365, i, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:249)");
        }
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = (androidx.compose.ui.graphics.GraphicsContext) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalGraphicsContext());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.ui.graphics.GraphicsContextObserver(graphicsContext);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.graphics.layer.GraphicsLayer camera2StreamConfigurationMap = ((androidx.compose.ui.graphics.GraphicsContextObserver) rememberedValue).getCamera2StreamConfigurationMap();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return camera2StreamConfigurationMap;
    }

    public static final androidx.compose.ui.graphics.GraphicsLayerScope GraphicsLayerScope() {
        return new androidx.compose.ui.graphics.ReusableGraphicsLayerScope();
    }
}
