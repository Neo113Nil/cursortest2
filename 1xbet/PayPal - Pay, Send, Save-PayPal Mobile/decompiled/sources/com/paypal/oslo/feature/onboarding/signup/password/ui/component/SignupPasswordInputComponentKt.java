package com.paypal.oslo.feature.onboarding.signup.password.ui.component;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"SignupPasswordInputComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PasswordComponentConfig;", "passwordData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Password;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PasswordComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Password;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SignupPasswordInputComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupPasswordInputComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupPasswordInputComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig passwordComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password password, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1675740461);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(passwordComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(passwordData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(password) ? 256 : 128;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1675740461, i3, -1, "com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponent (SignupPasswordInputComponent.kt:38)");
                }
                com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt.SignupPasswordInputField(passwordComponentConfig.getPasswordField(), passwordData.m16493getPasswordWarBkgA(), passwordData.getShowPasswordHints(), password.getOnValueChange(), passwordData.getValidationResults(), modifier3, startRestartGroup, (i3 << 6) & 458752, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt.$r8$lambda$rGaCq2a5ktXcwUcWNh9GP4GrJQA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig.this, passwordData, password, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void SignupPasswordInputComponentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(126798340);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(126798340, i, -1, "com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentPreview (SignupPasswordInputComponent.kt:55)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig passwordComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig("password_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("PASSWORD"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig("password_input", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("PASSWORD"), "Password", null, null, null, 56, null), null);
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData(null, false, null, 5, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt.$r8$lambda$L5tmePD3SvffmRUPc1K0mYcrKTM((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SignupPasswordInputComponent(passwordComponentConfig, passwordData, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password((kotlin.jvm.functions.Function1) rememberedValue), null, startRestartGroup, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.password.ui.component.SignupPasswordInputComponentKt.$r8$lambda$Os1XNlvyCRkzKMdiiRNnTw55tkI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L5tmePD3SvffmRUPc1K0mYcrKTM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Os1XNlvyCRkzKMdiiRNnTw55tkI(int i, androidx.compose.runtime.Composer composer, int i2) {
        SignupPasswordInputComponentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rGaCq2a5ktXcwUcWNh9GP4GrJQA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig passwordComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password password, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupPasswordInputComponent(passwordComponentConfig, passwordData, password, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
