package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"BalanceModule", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "onMakePaymentClick", "Lkotlin/Function0;", "onAutopayClick", "onInfoMessageClick", "onAmountToAvoidInterestInfoClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "onDetailsPageClick", "", "onPhoneNumberClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BalanceModuleKt {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceModule(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceModuleUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(943339084);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(balanceModuleUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(943339084, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModule (BalanceModule.kt:45)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(244462118, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.$r8$lambda$gfsy30knKfh_W8_Pv4jOpyMuwmg(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel.this, function02, function0, function1, function03, function12, function13, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.$r8$lambda$kk5tplzZNnRqZ0eMZjf5DpVVYYM(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel.this, function0, function02, function03, function1, function12, function13, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gfsy30knKfh_W8_Pv4jOpyMuwmg(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(244462118, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModule.<anonymous> (BalanceModule.kt:50)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceHeaderKt.BalanceHeader(balanceModuleUiModel, composer, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.CreditUtilizationBarKt.CreditUtilizationBar(balanceModuleUiModel.getCreditUtilizationPercentage(), composer, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.DetailRow(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_available_credit, composer, 0), balanceModuleUiModel.getAvailableCredit(), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleTestTags.AVAILABLE_CREDIT_AMOUNT, null, null, composer, 384, 24);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPayment = balanceModuleUiModel.getMinimumPayment();
            if (minimumPayment == null) {
                composer.startReplaceGroup(-1930838178);
            } else {
                composer.startReplaceGroup(-1930838177);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.DetailRow(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_balance_min_payment_due_with_due_date, new java.lang.Object[]{minimumPayment.getDueDate()}, composer, 0), minimumPayment.getAmount(), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleTestTags.MIN_PAYMENT_AMOUNT, null, null, composer, 384, 24);
                java.lang.String amountToAvoidInterest = minimumPayment.getAmountToAvoidInterest();
                if (amountToAvoidInterest == null) {
                    composer.startReplaceGroup(1408718160);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1408718161);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.DetailRow(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_amount_to_avoid_interest, composer, 0), amountToAvoidInterest, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleTestTags.AMOUNT_TO_AVOID_INTEREST, balanceModuleUiModel.getMinimumPayment().getAvoidInterestOnNextStatementGuide(), function1, composer, 384, 0);
                    composer.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            composer.endReplaceGroup();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayStatusRowKt.AutopayStatusRow(balanceModuleUiModel.getAutopayStatus(), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item.INSTANCE.getAUTOPAY()), function0, composer, 0, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString infoMessage = balanceModuleUiModel.getInfoMessage();
            if (infoMessage == null) {
                composer.startReplaceGroup(-1929568604);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1929568603);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PaymentsInfoMessageKt.PaymentsInfoMessage(infoMessage, function03, composer, 0);
                composer.endReplaceGroup();
            }
            if (balanceModuleUiModel.getShowMakePaymentButton()) {
                composer.startReplaceGroup(-1929322463);
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_make_a_payment, composer, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleTestTags.MAKE_A_PAYMENT_BUTTON), com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item.INSTANCE.getMAKE_PAYMENT_BUTTON()), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1928800206);
                composer.endReplaceGroup();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel persistentDebt = balanceModuleUiModel.getPersistentDebt();
            if (persistentDebt == null) {
                composer.startReplaceGroup(-1928756249);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1928756248);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.PersistentDebtKt.PersistentDebt(persistentDebt, function12, function13, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kk5tplzZNnRqZ0eMZjf5DpVVYYM(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, function13, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
