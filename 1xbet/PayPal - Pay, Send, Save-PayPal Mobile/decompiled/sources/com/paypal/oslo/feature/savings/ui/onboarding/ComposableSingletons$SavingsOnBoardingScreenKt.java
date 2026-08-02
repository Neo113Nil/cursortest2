package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SavingsOnBoardingScreenKt {
    public static final com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(886397421, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt.$r8$lambda$mdBw7OnlTBymvInvB5_Dw6IqUhY((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$mdBw7OnlTBymvInvB5_Dw6IqUhY(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(886397421, i, -1, "com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt.lambda$886397421.<anonymous> (SavingsOnBoardingScreen.kt:147)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$SavingsOnBoardingScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$886397421$savings_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
