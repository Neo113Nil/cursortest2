package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$WelcomeScreenKt {
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt INSTANCE = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-122548574, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt.$r8$lambda$XIZPlmsM6Izu0z_T3Pr_4TByVJE((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$XIZPlmsM6Izu0z_T3Pr_4TByVJE(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-122548574, i, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt.lambda$-122548574.<anonymous> (WelcomeScreen.kt:288)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel();
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.WelcomeScreen(null, (com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel) rememberedValue, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-122548574$onboarding_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m16503getLambda$122548574$onboarding_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
