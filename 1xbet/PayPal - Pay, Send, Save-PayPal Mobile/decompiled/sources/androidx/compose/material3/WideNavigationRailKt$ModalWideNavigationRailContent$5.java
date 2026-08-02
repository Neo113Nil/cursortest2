package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WideNavigationRailKt$ModalWideNavigationRailContent$5 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Vertical Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.WideNavigationRailColors getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoSizesFor;
    final /* synthetic */ boolean getInputFormats;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputFormats;
    final /* synthetic */ androidx.compose.material3.RailPredictiveBackState getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1043835354, intValue, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1044)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changedInstance = composer2.changedInstance(this.getOutputFormats);
            boolean changed = composer2.changed(this.getOutputMinFrameDuration);
            boolean changed2 = composer2.changed(this.getInputFormats);
            final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getOutputFormats;
            final androidx.compose.material3.RailPredictiveBackState railPredictiveBackState = this.getOutputMinFrameDuration;
            final boolean z = this.getInputFormats;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$5.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Animatable.this, railPredictiveBackState, z, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion, (kotlin.jvm.functions.Function1) rememberedValue), true, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, composer2, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Animatable animatable, androidx.compose.material3.RailPredictiveBackState railPredictiveBackState, boolean z, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        float Camera2StreamConfigurationMap;
        float Camera2StreamConfigurationMap2;
        float floatValue = ((java.lang.Number) animatable.getValue()).floatValue();
        if (floatValue > 0.0f) {
            Camera2StreamConfigurationMap = androidx.compose.material3.WideNavigationRailKt.Camera2StreamConfigurationMap(graphicsLayerScope, floatValue, railPredictiveBackState.getSwipeEdgeMatchesRail());
            Camera2StreamConfigurationMap2 = androidx.compose.material3.WideNavigationRailKt.Camera2StreamConfigurationMap(graphicsLayerScope, floatValue);
            graphicsLayerScope.setScaleX(Camera2StreamConfigurationMap == 0.0f ? 1.0f : Camera2StreamConfigurationMap2 / Camera2StreamConfigurationMap);
            graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.5f));
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$ModalWideNavigationRailContent$5(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.material3.RailPredictiveBackState railPredictiveBackState, boolean z, boolean z2, androidx.compose.material3.WideNavigationRailColors wideNavigationRailColors, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.Arrangement.Vertical vertical, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        this.getOutputFormats = animatable;
        this.getOutputMinFrameDuration = railPredictiveBackState;
        this.getInputFormats = z;
        this.getHighSpeedVideoSizes = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = wideNavigationRailColors;
        this.getInputSizeshNQ4ISI = shape;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoSizesFor = windowInsets;
        this.Camera2StreamConfigurationMap = vertical;
        this.getHighSpeedVideoFpsRanges = function22;
    }
}
