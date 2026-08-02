package com.paypal.oslo.feature.onboarding.signup.phone.ui.field;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¨\u0006\u0016"}, d2 = {"SignupPhoneInputField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "validationResults", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "modifier", "Landroidx/compose/ui/Modifier;", "apiErrorMessage", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "buildPhoneValidationAlerts", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "context", "Landroid/content/Context;", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupPhoneInputFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupPhoneInputField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list, androidx.compose.ui.Modifier modifier, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final java.lang.String str4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.textinput.ValidationAlert invoke;
        java.lang.String m16200variantCBRiV3w;
        java.lang.String m16200variantCBRiV3w2;
        java.util.List listOf;
        java.util.List list2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTextInputFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2137897658);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signupTextInputFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                str4 = str3;
                i3 |= startRestartGroup.changed(str4) ? 1048576 : 524288;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str5 = str4;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2137897658, i5, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputField (SignupPhoneInputField.kt:64)");
                    }
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt$SignupPhoneInputField$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt$SignupPhoneInputField$1$1(focusRequester, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    boolean changed = startRestartGroup.changed(list);
                    java.util.ArrayList rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        if (list.isEmpty()) {
                            rememberedValue3 = kotlin.collections.CollectionsKt.emptyList();
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrow.core.Either either = (arrow.core.Either) it.next();
                                if (either instanceof arrow.core.Either.Right) {
                                    invoke = null;
                                } else if (either instanceof arrow.core.Either.Left) {
                                    final com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError = (com.paypal.oslo.feature.onboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either).getValue();
                                    final java.lang.String string = context.getString(validationError.getMessageResId());
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                                    invoke = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt.m16420$r8$lambda$PdIYSTqrcG12mI4iuzImIpZzOo(string, validationError, (java.lang.String) obj);
                                        }
                                    });
                                } else {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                if (invoke != null) {
                                    arrayList.add(invoke);
                                }
                            }
                            rememberedValue3 = arrayList;
                        }
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    java.util.List list3 = (java.util.List) rememberedValue3;
                    boolean z = (3670016 & i5) == 1048576;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        com.paypal.pds.components.textinput.ValidationAlert invoke2 = str4 != null ? com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt.$r8$lambda$MKaraYiplASqjL_Sq3S2OqdvTIE(str4, (java.lang.String) obj);
                            }
                        }) : null;
                        startRestartGroup.updateRememberedValue(invoke2);
                        rememberedValue4 = invoke2;
                    }
                    com.paypal.pds.components.textinput.ValidationAlert validationAlert = (com.paypal.pds.components.textinput.ValidationAlert) rememberedValue4;
                    java.lang.String label = signupTextInputFieldConfig.getLabel();
                    if (label == null) {
                        startRestartGroup.startReplaceGroup(40264648);
                        startRestartGroup.endReplaceGroup();
                        m16200variantCBRiV3w = null;
                    } else {
                        startRestartGroup.startReplaceGroup(40264649);
                        m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(label), new java.lang.Object[0], startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (m16200variantCBRiV3w == null) {
                        m16200variantCBRiV3w = "";
                    }
                    java.lang.String sublabel = signupTextInputFieldConfig.getSublabel();
                    if (sublabel == null) {
                        startRestartGroup.startReplaceGroup(40342024);
                        startRestartGroup.endReplaceGroup();
                        m16200variantCBRiV3w2 = null;
                    } else {
                        startRestartGroup.startReplaceGroup(40342025);
                        m16200variantCBRiV3w2 = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sublabel), new java.lang.Object[0], startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String str6 = m16200variantCBRiV3w2 != null ? m16200variantCBRiV3w2 : "";
                    if (validationAlert != null) {
                        listOf = kotlin.collections.CollectionsKt.listOf(validationAlert);
                    } else if (list3.isEmpty()) {
                        listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.pds.components.textinput.ValidationAlert.HelpedText(str6));
                    } else {
                        list2 = list3;
                        int i7 = i5 >> 6;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        java.lang.String str7 = str4;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.TextInputKt.TextInput(str2, function1, androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), focusRequester), m16200variantCBRiV3w, str, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, (i7 & 14) | 100663296 | (i7 & 112) | ((i5 << 9) & 57344), 0, 114400);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        str5 = str7;
                    }
                    list2 = listOf;
                    int i72 = i5 >> 6;
                    androidx.compose.ui.Modifier modifier52 = modifier4;
                    java.lang.String str72 = str4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.TextInputKt.TextInput(str2, function1, androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), focusRequester), m16200variantCBRiV3w, str, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, (i72 & 14) | 100663296 | (i72 & 112) | ((i5 << 9) & 57344), 0, 114400);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    str5 = str72;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.phone.ui.field.SignupPhoneInputFieldKt.$r8$lambda$PYORVryZbqR3pC_fYX75W8Ne3cA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig.this, str, str2, function1, list, modifier3, str5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str4 = str3;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        str4 = str3;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$MKaraYiplASqjL_Sq3S2OqdvTIE(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PYORVryZbqR3pC_fYX75W8Ne3cA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, java.util.List list, androidx.compose.ui.Modifier modifier, java.lang.String str3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupPhoneInputField(signupTextInputFieldConfig, str, str2, function1, list, modifier, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PdIYSTqrcG12mI4iuzI-mIpZzOo, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m16420$r8$lambda$PdIYSTqrcG12mI4iuzImIpZzOo(java.lang.String str, com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.oslo.feature.onboarding.validators.ui.ValidatorMapperKt.toAlertStyle(validationError.getStyle()), false, null, null, 28, null);
    }
}
