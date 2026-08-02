package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0003\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "", "p1", "p2", "Ljava/math/BigDecimal;", "p3", "p4", "p5", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/PaymentMethodUiModel;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/PaymentMethodUiModel;", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayScreenPreviewKt {
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState autopayState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1976149942);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(autopayState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1976149942, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayPreviewWrapper (AutopayScreenPreview.kt:175)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18299$r8$lambda$SbhQjOWAp84PMQ5Ezr9j4dKXt4((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$nTvMuiId2JDvSxtCRJEwiXkYXrI((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$V4lTd3kHvk3l1PGYC2tOkZZbFFo((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$enIQeTKx5AlwjgXSMU_SSi9RP5k((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt.AutopayScreenContent(autopayState, function1, function12, function0, function02, function13, function03, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, (i2 & 14) | 14380464, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18298$r8$lambda$DJagbDVarNlJ4LgjRAU0nc8qYU(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3, java.math.BigDecimal bigDecimal2) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        copy = r2.copy((r26 & 1) != 0 ? r2.options : null, (r26 & 2) != 0 ? r2.selectedOption : paymentOption, (r26 & 4) != 0 ? r2.selectedAmount : bigDecimal, (r26 & 8) != 0 ? r2.customAmount : null, (r26 & 16) != 0 ? r2.customAmountError : null, (r26 & 32) != 0 ? r2.generalErrorMessage : null, (r26 & 64) != 0 ? r2.formattedMaxAmount : str3, (r26 & 128) != 0 ? r2.maxAmount : bigDecimal2, (r26 & 256) != 0 ? r2.formattedZeroAmount : null, (r26 & 512) != 0 ? r2.maxCustomAmount : null, (r26 & 1024) != 0 ? r2.hintText : null, (r26 & 2048) != 0 ? getHighSpeedVideoFpsRanges().getSelectAmountData().localeString : null);
        copy2 = highSpeedVideoFpsRanges.copy((r18 & 1) != 0 ? highSpeedVideoFpsRanges.title : null, (r18 & 2) != 0 ? highSpeedVideoFpsRanges.selectAmountData : copy, (r18 & 4) != 0 ? highSpeedVideoFpsRanges.paymentMethodData : getHighSpeedVideoFpsRangesFor(str, str2), (r18 & 8) != 0 ? highSpeedVideoFpsRanges.scheduleInfoText : null, (r18 & 16) != 0 ? highSpeedVideoFpsRanges.termsAndConditionUrl : null, (r18 & 32) != 0 ? highSpeedVideoFpsRanges.isEnrolled : true, (r18 & 64) != 0 ? highSpeedVideoFpsRanges.cancelButtonText : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel_autopay, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r18 & 128) != 0 ? highSpeedVideoFpsRanges.currencyCode : null);
        return copy2;
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_label, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_add, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank ••".concat(java.lang.String.valueOf(str2))), "https://www.paypalobjects.com/images/shared/bank_accounts/bank_placeholder.png", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null), null, null, 24, null);
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getHighSpeedVideoFpsRanges() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_minimum_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_statement_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)));
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(888.88d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel(stringResOnly, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(mapOf, null, null, null, null, null, "$888.88", valueOf, "$0", null, null, null, 3644, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_label, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_add, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, 24, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_schedule_info, new java.lang.Object[]{"28th"}, null, false, 12, null), "https://", false, null, "USD", 96, null);
    }

    /* renamed from: $r8$lambda$DJagbDVarNl-J4LgjRAU0nc8qYU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18298$r8$lambda$DJagbDVarNlJ4LgjRAU0nc8qYU(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState autopayState, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(autopayState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LtFXJfk4iVigvxIeTLWmw1wmNOg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(870296904);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(870296904, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenEnrolledPreview (AutopayScreenPreview.kt:37)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal("2500");
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(8888.88d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(getHighResolutionOutputSizeshNQ4ISI(paymentOption, "HSBC", "8607", bigDecimal, "$8888.88", valueOf), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, null, 384, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$LtFXJfk4iVigvxIeTLWmw1wmNOg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QwbFAmmeNggLsgG8Ox5K47UArnc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(85815602);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(85815602, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenEnrolledNoChangesPreview (AutopayScreenPreview.kt:98)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
            java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(888.88d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(getHighResolutionOutputSizeshNQ4ISI(paymentOption, "HSBC", "8607", bigDecimal, "$888.88", valueOf), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, null, null, 384, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$QwbFAmmeNggLsgG8Ox5K47UArnc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SbhQjOWAp84PMQ5Ezr9j4-dKXt4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18299$r8$lambda$SbhQjOWAp84PMQ5Ezr9j4dKXt4(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T-UnEj5GyTa60tTbWUBZbL9uc-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18300$r8$lambda$TUnEj5GyTa60tTbWUBZbL9uc8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2011659131);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2011659131, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenErrorFetchingPreview (AutopayScreenPreview.kt:117)");
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, null, 2, null)), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18300$r8$lambda$TUnEj5GyTa60tTbWUBZbL9uc8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V4lTd3kHvk3l1PGYC2tOkZZbFFo(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$enIQeTKx5AlwjgXSMU_SSi9RP5k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fdmKfWbIr7CmTxbLv8lplP9Onw4(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-30572082);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-30572082, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenNotEnrolledReadyPreview (AutopayScreenPreview.kt:78)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            copy = r7.copy((r26 & 1) != 0 ? r7.options : null, (r26 & 2) != 0 ? r7.selectedOption : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, (r26 & 4) != 0 ? r7.selectedAmount : null, (r26 & 8) != 0 ? r7.customAmount : null, (r26 & 16) != 0 ? r7.customAmountError : null, (r26 & 32) != 0 ? r7.generalErrorMessage : null, (r26 & 64) != 0 ? r7.formattedMaxAmount : null, (r26 & 128) != 0 ? r7.maxAmount : null, (r26 & 256) != 0 ? r7.formattedZeroAmount : null, (r26 & 512) != 0 ? r7.maxCustomAmount : null, (r26 & 1024) != 0 ? r7.hintText : null, (r26 & 2048) != 0 ? getHighSpeedVideoFpsRanges().getSelectAmountData().localeString : null);
            copy2 = highSpeedVideoFpsRanges.copy((r18 & 1) != 0 ? highSpeedVideoFpsRanges.title : null, (r18 & 2) != 0 ? highSpeedVideoFpsRanges.selectAmountData : copy, (r18 & 4) != 0 ? highSpeedVideoFpsRanges.paymentMethodData : getHighSpeedVideoFpsRangesFor("Chase", "1234"), (r18 & 8) != 0 ? highSpeedVideoFpsRanges.scheduleInfoText : null, (r18 & 16) != 0 ? highSpeedVideoFpsRanges.termsAndConditionUrl : null, (r18 & 32) != 0 ? highSpeedVideoFpsRanges.isEnrolled : false, (r18 & 64) != 0 ? highSpeedVideoFpsRanges.cancelButtonText : null, (r18 & 128) != 0 ? highSpeedVideoFpsRanges.currencyCode : null);
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(copy2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, null, 384, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$fdmKfWbIr7CmTxbLv8lplP9Onw4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g43N6jvMyMaRbfW-FB_9jgVlUPQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18301$r8$lambda$g43N6jvMyMaRbfWFB_9jgVlUPQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-375066511);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-375066511, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenLoadingPreview (AutopayScreenPreview.kt:58)");
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading(null, 1, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18301$r8$lambda$g43N6jvMyMaRbfWFB_9jgVlUPQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mMBRfZjaYaCewI4mtqV-o9JovZo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18302$r8$lambda$mMBRfZjaYaCewI4mtqVo9JovZo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1194320895);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1194320895, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenErrorConfirmingPreview (AutopayScreenPreview.kt:132)");
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay(getHighSpeedVideoFpsRanges(), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, false, true, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, null, null)), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18302$r8$lambda$mMBRfZjaYaCewI4mtqVo9JovZo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n-7-x8NRyZehAfw3p-lwdp71iCg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18303$r8$lambda$n7x8NRyZehAfw3plwdp71iCg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(389865208);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(389865208, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenNotEnrolledEmptyPreview (AutopayScreenPreview.kt:68)");
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(getHighSpeedVideoFpsRanges(), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, null, 384, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.m18303$r8$lambda$n7x8NRyZehAfw3plwdp71iCg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nPjoYUocyTOqF9kI4tIoUPoL0XA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1857060514);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1857060514, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenEnrolledDarkPreview (AutopayScreenPreview.kt:159)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal("2500");
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(8888.88d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(getHighResolutionOutputSizeshNQ4ISI(paymentOption, "HSBC", "8607", bigDecimal, "$8888.88", valueOf), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, null, 384, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.preview.AutopayScreenPreviewKt.$r8$lambda$nPjoYUocyTOqF9kI4tIoUPoL0XA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nTvMuiId2JDvSxtCRJEwiXkYXrI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
