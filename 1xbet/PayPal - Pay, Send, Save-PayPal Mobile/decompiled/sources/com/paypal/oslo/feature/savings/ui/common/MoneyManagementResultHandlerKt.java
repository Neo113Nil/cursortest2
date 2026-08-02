package com.paypal.oslo.feature.savings.ui.common;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a;\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "Lkotlin/ParameterName;", "", "", "onSuccess", "MoneyManagementResultHandler-uLJ83ew", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "MoneyManagementResultHandler", "Lcom/paypal/oslo/feature/savings/ui/common/ToastMessageData;", "messageData", "addMoneySuccessTemplate", "addMoneyDebitCardSuccessTemplate", "transferMoneySuccessTemplate", "deleteGoalSuccessTemplate", "autoSaveSetupSuccessTemplate", "autoSaveChangedTemplate", "formatToastMessage", "(Lcom/paypal/oslo/feature/savings/ui/common/ToastMessageData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "result", "paypalBalanceDisplayName", "buildToastMessageData", "(Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/common/ToastMessageData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyManagementResultHandlerKt {
    /* renamed from: MoneyManagementResultHandler-uLJ83ew, reason: not valid java name */
    public static final void m18749MoneyManagementResultHandleruLJ83ew(final java.lang.String str, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult, ? super java.lang.String, kotlin.Unit> function22;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(727283831);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            function22 = function2;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(727283831, i2, -1, "com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandler (MoneyManagementResultHandler.kt:55)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_paypal_balance, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_toast_add_money_success, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_add_money_debit_card_success, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_toast_transfer_money_success, startRestartGroup, 0);
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_toast_delete_goal_success, startRestartGroup, 0);
            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_setup_success_message, startRestartGroup, 0);
            java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_changed_message, startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(stringResource);
            boolean changed2 = startRestartGroup.changed(stringResource2);
            boolean changed3 = startRestartGroup.changed(stringResource3);
            boolean changed4 = startRestartGroup.changed(stringResource4);
            boolean changed5 = startRestartGroup.changed(stringResource5);
            boolean changed6 = startRestartGroup.changed(stringResource6);
            boolean changed7 = startRestartGroup.changed(stringResource7);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (((changed | changed2 | changed3 | changed4 | changed5 | changed6 | changed7) || z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = 0;
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1(stringResource, stringResource2, stringResource3, stringResource4, stringResource5, stringResource6, stringResource7, function2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i4 = 0;
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler-uLJ83ew$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m18750invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18750invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            i3 = i;
            function22 = function2;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function23, (kotlin.jvm.functions.Function2) rememberedValue2, composer2, (i2 & 14) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt.$r8$lambda$DXYVMyNGw3RleuRI662hOdSf_R4(str, function22, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String formatToastMessage(com.paypal.oslo.feature.savings.ui.common.ToastMessageData toastMessageData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessageData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        int i = com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt.WhenMappings.$EnumSwitchMapping$0[toastMessageData.getFlowType().ordinal()];
        if (i == 1 || i == 2) {
            if (toastMessageData.getFrequency() != com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME) {
                return toastMessageData.isAutoSaveEnabled() ? str6 : str5;
            }
            if (toastMessageData.isDebitCard()) {
                java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{toastMessageData.getFormattedAmount(), toastMessageData.getDestinationName()}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }
            java.lang.String format2 = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{toastMessageData.getFormattedAmount(), toastMessageData.getDestinationName()}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            return format2;
        }
        if (i == 3) {
            java.lang.String format3 = java.lang.String.format(str3, java.util.Arrays.copyOf(new java.lang.Object[]{toastMessageData.getFormattedAmount(), toastMessageData.getDestinationName()}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
            return format3;
        }
        if (i != 4) {
            if (i == 5) {
                return str4;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (toastMessageData.isAutoSaveEnabled()) {
        }
    }

    public static final com.paypal.oslo.feature.savings.ui.common.ToastMessageData buildToastMessageData(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, java.lang.String str) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO source;
        java.lang.String title;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementSuccessNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(moneyManagementSuccessNavResult.getDestinationFi().getAmount());
        java.lang.String format = java.lang.String.format("$%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal = moneyManagementSuccessNavResult.getDestinationFi().getGoal();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType = null;
        if (goal == null || (title = goal.getTitle()) == null) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO financialInstrument = moneyManagementSuccessNavResult.getDestinationFi().getFinancialInstrument();
            java.lang.String displayName = financialInstrument != null ? com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTOKt.getDisplayName(financialInstrument, str) : null;
            if (displayName != null) {
                str2 = displayName;
            }
        } else {
            str2 = title;
        }
        java.lang.String str3 = str2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO sourceFi = moneyManagementSuccessNavResult.getSourceFi();
        if (sourceFi != null && (source = sourceFi.getSource()) != null) {
            instrumentType = source.getInstrumentType();
        }
        boolean z = instrumentType == com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType = moneyManagementSuccessNavResult.getFlowType();
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency = moneyManagementSuccessNavResult.getFrequency();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal2 = moneyManagementSuccessNavResult.getDestinationFi().getGoal();
        return new com.paypal.oslo.feature.savings.ui.common.ToastMessageData(format, str3, z, flowType, frequency, goal2 != null ? goal2.isAutoSaveEnabled() : false);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DXYVMyNGw3RleuRI662hOdSf_R4(java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        m18749MoneyManagementResultHandleruLJ83ew(str, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
