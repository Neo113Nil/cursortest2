package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$SignupTextInputFieldWithIconKt {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(66082650, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt.$r8$lambda$_2eYUj0AySlWOLUgXBbBDn2ISc8((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_2eYUj0AySlWOLUgXBbBDn2ISc8(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(66082650, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt.lambda$66082650.<anonymous> (SignupTextInputFieldWithIcon.kt:64)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Search.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$66082650$onboarding_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
