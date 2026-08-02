package com.paypal.oslo.feature.onboarding.signup.phone.ui.component;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"SignupPhoneInputComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PhoneComponentConfig;", "phoneData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Phone;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PhoneComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Phone;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OnboardingPhoneInputComponentLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupPhoneInputComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupPhoneInputComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig phoneComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData phoneData, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone phone, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(949918817);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(phoneComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(phoneData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(phone) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(949918817, i3, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponent (SignupPhoneInputComponent.kt:46)");
                }
                com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt.SignupPhoneInputField(phoneComponentConfig.getPhoneField(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_us_phone_country_code, startRestartGroup, 0), phoneData.m16497getPhoneNumbervCycbc(), phone.getOnValueChange(), phoneData.getValidationResults(), modifier3, phoneData.getApiErrorMessage(), startRestartGroup, (i3 << 6) & 458752, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponentKt.$r8$lambda$aJqUBNLYgFLV7XepLSgv2bOv2j8(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig.this, phoneData, phone, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OnboardingPhoneInputComponentLightPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-191568856);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-191568856, i, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.component.OnboardingPhoneInputComponentLightPreview (SignupPhoneInputComponent.kt:64)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.getLocalVariantResolver().provides(com.paypal.oslo.feature.onboarding.shared.variants.preview.PreviewScaffoldKt.previewVariantResolver(startRestartGroup, 0)), com.paypal.oslo.feature.onboarding.signup.phone.ui.component.ComposableSingletons$SignupPhoneInputComponentKt.INSTANCE.m16419getLambda$2078807158$onboarding_prodRelease(), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.phone.ui.component.SignupPhoneInputComponentKt.$r8$lambda$yd5vvNt4OLtknO94X9xKZIyIrck(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aJqUBNLYgFLV7XepLSgv2bOv2j8(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig phoneComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData phoneData, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone phone, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupPhoneInputComponent(phoneComponentConfig, phoneData, phone, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yd5vvNt4OLtknO94X9xKZIyIrck(int i, androidx.compose.runtime.Composer composer, int i2) {
        OnboardingPhoneInputComponentLightPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
