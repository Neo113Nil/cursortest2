package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavigationBarKt$NavigationBarItem$2$indicator$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.NavigationBarItemColors getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-799524251, intValue, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:297)");
            }
            androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "indicator");
            boolean changed = composer2.changed(this.Camera2StreamConfigurationMap);
            final androidx.compose.runtime.State<java.lang.Float> state = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1.getHighSpeedVideoSizes(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(layoutId, (kotlin.jvm.functions.Function1) rememberedValue), this.getHighSpeedVideoFpsRanges.getSelectedIndicatorColor(), androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), composer2, 6)), composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    NavigationBarKt$NavigationBarItem$2$indicator$1(androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.material3.NavigationBarItemColors navigationBarItemColors) {
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = navigationBarItemColors;
    }
}
