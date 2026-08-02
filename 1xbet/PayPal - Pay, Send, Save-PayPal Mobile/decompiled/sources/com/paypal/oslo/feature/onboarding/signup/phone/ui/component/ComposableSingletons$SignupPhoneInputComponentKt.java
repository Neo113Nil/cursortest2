package com.paypal.oslo.feature.onboarding.signup.phone.ui.component;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$SignupPhoneInputComponentKt {
    public static final com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2078807158, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt.$r8$lambda$9VbWt8jOs7VnD0DwObMvVDHlpr8((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$9VbWt8jOs7VnD0DwObMvVDHlpr8(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2078807158, i, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt.lambda$-2078807158.<anonymous> (SignupPhoneInputComponent.kt:67)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig phoneComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig("phone_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("PHONE"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig("phone_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("PHONE"), "phone_entry.phone.phone.label", "phone_entry.phone.phone.helper", "phone_entry.phone.phone.placeholder", null, 32, null), null);
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData phoneData = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl("408 356 3234"), null, null, 6, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt.$r8$lambda$GouCeJ5AexLK_9uLA1FHfc45IFs((java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponentKt.SignupPhoneInputComponent(phoneComponentConfig, phoneData, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone((kotlin.jvm.functions.Function1) rememberedValue), null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GouCeJ5AexLK_9uLA1FHfc45IFs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-2078807158$onboarding_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m16419getLambda$2078807158$onboarding_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
