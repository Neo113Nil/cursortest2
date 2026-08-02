package com.paypal.oslo.feature.onboarding.signup.email.ui.component;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"SignupEmailComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/EmailComponentConfig;", "emailData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "emailCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Email;", "stateMap", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/EmailComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Email;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SignupEmailComponentLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupEmailComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupEmailComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig emailComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email email, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStateMap, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1259794153);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(emailComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(emailData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(email) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(componentStateMap) : startRestartGroup.changedInstance(componentStateMap) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1259794153, i3, -1, "com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponent (SignupEmailComponent.kt:44)");
                }
                com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailFieldKt.SignupEmailField(emailComponentConfig.getEmailField(), emailData.m16483getEmailBvNjjI(), email.getOnValueChange(), modifier4, componentStateMap, startRestartGroup, ((i3 << 3) & 57344) | ((i3 >> 3) & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt.$r8$lambda$PUS9Clg5_y6N2II_851TDrgEYM0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig.this, emailData, email, componentStateMap, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SignupEmailComponentLightPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-213943711);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-213943711, i, -1, "com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentLightPreview (SignupEmailComponent.kt:60)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig emailComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig("email_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("EMAIL"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig("email_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("EMAIL"), "Email address", "We'll use this to keep you updated on your account.", null, null, 48, null), null);
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt.$r8$lambda$zN4beFLjC8a_8Mt4DfJAcFinvWk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SignupEmailComponent(emailComponentConfig, emailData, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email((kotlin.jvm.functions.Function1) rememberedValue), com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.emptyComponentStateMap(), null, startRestartGroup, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.email.ui.component.SignupEmailComponentKt.m16371$r8$lambda$utXQsP_wHF_zCUSSPQwETpuQBg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PUS9Clg5_y6N2II_851TDrgEYM0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig emailComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email email, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupEmailComponent(emailComponentConfig, emailData, email, componentStateMap, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$utXQs-P_wHF_zCUSSPQwETpuQBg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16371$r8$lambda$utXQsP_wHF_zCUSSPQwETpuQBg(int i, androidx.compose.runtime.Composer composer, int i2) {
        SignupEmailComponentLightPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zN4beFLjC8a_8Mt4DfJAcFinvWk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
