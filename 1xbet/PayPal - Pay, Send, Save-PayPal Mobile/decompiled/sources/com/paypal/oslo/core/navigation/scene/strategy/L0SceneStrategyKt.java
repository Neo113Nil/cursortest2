package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "topBarConfig", "Lkotlin/Function0;", "", "onBack", "Lcom/paypal/oslo/core/navigation/scene/strategy/L0SceneStrategy;", "rememberL0SceneStrategy", "(Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/scene/strategy/L0SceneStrategy;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L0SceneStrategyKt {
    public static final com.paypal.oslo.core.navigation.scene.strategy.L0SceneStrategy rememberL0SceneStrategy(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1305908737, i, -1, "com.paypal.oslo.core.navigation.scene.strategy.rememberL0SceneStrategy (L0SceneStrategy.kt:84)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(topBarConfig)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.core.navigation.scene.strategy.L0SceneStrategy(topBarConfig, function0);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.core.navigation.scene.strategy.L0SceneStrategy l0SceneStrategy = (com.paypal.oslo.core.navigation.scene.strategy.L0SceneStrategy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return l0SceneStrategy;
    }
}
