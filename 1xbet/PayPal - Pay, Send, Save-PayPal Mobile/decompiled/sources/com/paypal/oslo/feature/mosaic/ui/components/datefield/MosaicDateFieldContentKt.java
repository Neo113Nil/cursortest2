package com.paypal.oslo.feature.mosaic.ui.components.datefield;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"MosaicDateFieldContent", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPageDateOfBirthInputComponent;", "uiModel", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "onFieldFocus", "Lkotlin/Function0;", "onFieldUnfocus", "onDateValidate", "onValidationFail", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPageDateOfBirthInputComponent;Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "mosaic_prodRelease", "dateValue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicDateFieldContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void MosaicDateFieldContent(final com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent mosaicPageDateOfBirthInputComponent, final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        final androidx.compose.runtime.MutableState mutableState;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageDateOfBirthInputComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicDateFieldUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1357539745);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(mosaicPageDateOfBirthInputComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mosaicDateFieldUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1357539745, i5, -1, "com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContent (MosaicDateFieldContent.kt:48)");
            }
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            boolean isRequired = mosaicPageDateOfBirthInputComponent.isRequired();
            java.lang.Object minAge = mosaicPageDateOfBirthInputComponent.getMinAge();
            java.lang.Object maxAge = mosaicPageDateOfBirthInputComponent.getMaxAge();
            java.lang.Object dateFormat = mosaicDateFieldUiModel.getDateFormat();
            boolean changed = startRestartGroup.changed(isRequired);
            boolean changed2 = startRestartGroup.changed(minAge);
            boolean changed3 = startRestartGroup.changed(maxAge);
            boolean changed4 = startRestartGroup.changed(dateFormat);
            boolean z = (i5 & 57344) == 16384;
            boolean z2 = (458752 & i5) == 131072;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed | changed2 | changed3 | changed4 | z) || z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                mutableState = mutableState2;
                i4 = 1;
                rememberedValue2 = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.$r8$lambda$DBMmNz2ocGz_UylC2D8e_qfYpdg(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.this, context, mosaicPageDateOfBirthInputComponent, function03, function1, (java.lang.String) obj);
                    }
                }));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                i3 = i5;
                mutableState = mutableState2;
                i4 = 1;
            }
            java.util.List list = (java.util.List) rememberedValue2;
            com.paypal.pds.components.textinput.VisualTransformation.Number number = new com.paypal.pds.components.textinput.VisualTransformation.Number(mosaicDateFieldUiModel.getInputMaskFormat());
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.$r8$lambda$naayuOY1hwlw_JX84mv3TmhiXiI(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final com.paypal.pds.components.textinput.MaskedInputTransformation rememberMaskedInputTransformation = com.paypal.pds.components.textinput.MaskedInputTransformationKt.rememberMaskedInputTransformation(number, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, com.paypal.pds.components.textinput.VisualTransformation.Number.$stable | 48);
            java.lang.String str = (java.lang.String) mutableState.getValue();
            com.paypal.pds.components.textinput.VisualTransformation visualTransformation = rememberMaskedInputTransformation.getVisualTransformation();
            java.lang.String upperCase = mosaicDateFieldUiModel.getDateFormat().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            boolean isDisabled = mosaicPageDateOfBirthInputComponent.isDisabled();
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null);
            int i6 = (i3 & 896) == 256 ? i4 : 0;
            int i7 = (i3 & 7168) == 2048 ? i4 : 0;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((i6 | i7) != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.m15791$r8$lambda$xRezptYGUfNUMWTLlRiktGRJ_g(kotlin.jvm.functions.Function0.this, function02, (androidx.compose.ui.focus.FocusState) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.ui.Modifier onFocusChanged = androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue4);
            boolean changedInstance = startRestartGroup.changedInstance(rememberMaskedInputTransformation);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.$r8$lambda$rrHK39svwUB9S5Zl8Y2fhHiUfzU(com.paypal.pds.components.textinput.MaskedInputTransformation.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue5, onFocusChanged, upperCase, (java.lang.String) null, (java.lang.String) null, !isDisabled, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, visualTransformation, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, 100663296, com.paypal.pds.components.textinput.VisualTransformation.$stable << 6, 110256);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.$r8$lambda$OcCVykD5MFR4E662VYLHmrqddKU(com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent.this, mosaicDateFieldUiModel, function0, function02, function03, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$DBMmNz2ocGz_UylC2D8e_qfYpdg(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, android.content.Context context, com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent mosaicPageDateOfBirthInputComponent, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String inputMaskFormat = mosaicDateFieldUiModel.getInputMaskFormat();
        int i = 0;
        for (int i2 = 0; i2 < inputMaskFormat.length(); i2++) {
            if (inputMaskFormat.charAt(i2) == '0') {
                i++;
            }
        }
        if (str.length() != i) {
            return null;
        }
        java.lang.String formatDigitsToDatePattern = com.paypal.oslo.feature.mosaic.domain.util.DateUtil.INSTANCE.formatDigitsToDatePattern(str, mosaicDateFieldUiModel.getDateFormat());
        com.paypal.oslo.feature.mosaic.domain.validator.MosaicDateFieldValidator mosaicDateFieldValidator = com.paypal.oslo.feature.mosaic.domain.validator.MosaicDateFieldValidator.INSTANCE;
        java.lang.String dateFormat = mosaicDateFieldUiModel.getDateFormat();
        boolean isRequired = mosaicPageDateOfBirthInputComponent.isRequired();
        java.lang.Integer minAge = mosaicPageDateOfBirthInputComponent.getMinAge();
        int intValue = minAge != null ? minAge.intValue() : 18;
        java.lang.Integer maxAge = mosaicPageDateOfBirthInputComponent.getMaxAge();
        com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult validateDateOfBirth = mosaicDateFieldValidator.validateDateOfBirth(context, formatDigitsToDatePattern, dateFormat, isRequired, intValue, maxAge != null ? maxAge.intValue() : 100);
        if (validateDateOfBirth.isValid()) {
            function0.invoke();
            return null;
        }
        java.lang.String errorMessage = validateDateOfBirth.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }
        function1.invoke(errorMessage);
        return new com.paypal.pds.components.textinput.ValidationAlertData(errorMessage, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OcCVykD5MFR4E662VYLHmrqddKU(com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent mosaicPageDateOfBirthInputComponent, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        MosaicDateFieldContent(mosaicPageDateOfBirthInputComponent, mosaicDateFieldUiModel, function0, function02, function03, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$naayuOY1hwlw_JX84mv3TmhiXiI(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        mutableState.setValue(sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rrHK39svwUB9S5Zl8Y2fhHiUfzU(com.paypal.pds.components.textinput.MaskedInputTransformation maskedInputTransformation, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        maskedInputTransformation.getFilteredOnValueChange().invoke(sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xRezptY-GUfNUMWTLlRiktGRJ_g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15791$r8$lambda$xRezptYGUfNUMWTLlRiktGRJ_g(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        if (focusState.isFocused()) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
