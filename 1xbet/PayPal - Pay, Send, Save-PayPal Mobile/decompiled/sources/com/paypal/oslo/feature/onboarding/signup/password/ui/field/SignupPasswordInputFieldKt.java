package com.paypal.oslo.feature.onboarding.signup.password.ui.field;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"SignupPasswordInputField", "", "fieldConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "showPasswordHints", "", "onValueChange", "Lkotlin/Function1;", "validationResults", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupPasswordInputFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupPasswordInputField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, final java.lang.String str, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String m16200variantCBRiV3w;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTextInputFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1271235367);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signupTextInputFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1271235367, i3, -1, "com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputField (SignupPasswordInputField.kt:48)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final androidx.compose.ui.autofill.AutofillManager autofillManager = (androidx.compose.ui.autofill.AutofillManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalAutofillManager());
                boolean changed = startRestartGroup.changed(list);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt.buildValidationAlertsWithOptions(context, list, z);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.List list2 = (java.util.List) rememberedValue;
                java.lang.String label = signupTextInputFieldConfig.getLabel();
                if (label == null) {
                    startRestartGroup.startReplaceGroup(-1648043941);
                    startRestartGroup.endReplaceGroup();
                    m16200variantCBRiV3w = null;
                } else {
                    startRestartGroup.startReplaceGroup(-1648043940);
                    m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(label), new java.lang.Object[0], startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str2 = m16200variantCBRiV3w == null ? "" : m16200variantCBRiV3w;
                boolean changedInstance = startRestartGroup.changedInstance(autofillManager);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt.$r8$lambda$YCherUotMNJlPFhDGU0cLDk73Oo(androidx.compose.ui.autofill.AutofillManager.this, (androidx.compose.ui.focus.FocusState) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier onFocusEvent = androidx.compose.ui.focus.FocusEventModifierKt.onFocusEvent(modifier4, (kotlin.jvm.functions.Function1) rememberedValue2);
                boolean z2 = (i3 & 7168) == 2048;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt.$r8$lambda$6BwpRFbu_9YgOGwIPvWetHtP2yA(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.PasswordInputKt.PasswordInput(str, (kotlin.jvm.functions.Function1) rememberedValue3, onFocusEvent, str2, false, list2, null, null, startRestartGroup, (i3 >> 3) & 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.password.ui.field.SignupPasswordInputFieldKt.m16381$r8$lambda$o6C1rvdjzMLyVCICRXlQPxtK6o(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig.this, str, z, function1, list, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6BwpRFbu_9YgOGwIPvWetHtP2yA(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YCherUotMNJlPFhDGU0cLDk73Oo(androidx.compose.ui.autofill.AutofillManager autofillManager, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        if (focusState.isFocused() && autofillManager != null) {
            autofillManager.cancel();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o6C1r-vdjzMLyVCICRXlQPxtK6o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16381$r8$lambda$o6C1rvdjzMLyVCICRXlQPxtK6o(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupPasswordInputField(signupTextInputFieldConfig, str, z, function1, list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
