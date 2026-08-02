package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$OnboardingAddMoneyScreenKt {
    public static final com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$OnboardingAddMoneyScreenKt INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$OnboardingAddMoneyScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1251403499, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$OnboardingAddMoneyScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$OnboardingAddMoneyScreenKt.m18885$r8$lambda$IcyTDbAGXNDiBbghuVWwUYV274((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$Ic-yTDbAGXNDiBbghuVWwUYV274, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18885$r8$lambda$IcyTDbAGXNDiBbghuVWwUYV274(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1251403499, i, -1, "com.paypal.oslo.feature.savings.ui.onboarding.ComposableSingletons$OnboardingAddMoneyScreenKt.lambda$1251403499.<anonymous> (OnboardingAddMoneyScreen.kt:308)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveInfoScreenKt.AutoSaveInfoScreen(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1251403499$savings_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
