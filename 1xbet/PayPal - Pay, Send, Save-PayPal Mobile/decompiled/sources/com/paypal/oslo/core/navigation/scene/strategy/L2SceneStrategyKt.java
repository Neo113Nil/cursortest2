package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/strategy/L2SceneStrategy;", "rememberL2SceneStrategy", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/scene/strategy/L2SceneStrategy;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L2SceneStrategyKt {
    public static final com.paypal.oslo.core.navigation.scene.strategy.L2SceneStrategy rememberL2SceneStrategy(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1018065871, i, -1, "com.paypal.oslo.core.navigation.scene.strategy.rememberL2SceneStrategy (L2SceneStrategy.kt:71)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.core.navigation.scene.strategy.L2SceneStrategy();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.core.navigation.scene.strategy.L2SceneStrategy l2SceneStrategy = (com.paypal.oslo.core.navigation.scene.strategy.L2SceneStrategy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return l2SceneStrategy;
    }
}
