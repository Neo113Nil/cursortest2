package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\u001aC\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u001d"}, d2 = {"ManageFISection", "", "modifier", "Landroidx/compose/ui/Modifier;", "fundingInstruments", "", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentWithPosition;", "paymentMethodAbsence", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "onUpdateFiClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NoPaymentMethodErrorView", "text", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ManageFISectionCreditCardWithLastDigitsPreview", "(Landroidx/compose/runtime/Composer;I)V", "ManageFISectionDebitCardWithLastDigitsPreview", "ManageFISectionBankAccountWithLastDigitsPreview", "ManageFISectionPayPalBalancePreview", "ManageFISectionPayPalDebitWithBalancePreview", "ManageFISectionNoDefaultPreview", "ManageFISectionWithBackupPreview", "ManageFISectionNoBackupPreview", "ManageFISectionEmptyNamePreview", "ManageFISectionPPCCPreview", "ManageFISectionLongMerchantNamePreview", "ManageFISectionMultipleFundingInstrumentsPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManageFISectionKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageFISection(androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list2;
        int i4;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list3;
        final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics;
        java.lang.String fiLabel;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-428865572);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                paymentMethodAbsence2 = paymentMethodAbsence;
                i3 |= startRestartGroup.changed(paymentMethodAbsence2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        list3 = list2;
                        paymentMethodAbsence3 = paymentMethodAbsence2;
                    } else {
                        companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        list3 = i8 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                        if (i4 != 0) {
                            paymentMethodAbsence2 = null;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function03 = function02;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-428865572, i6, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISection (ManageFISection.kt:61)");
                        }
                        if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics) {
                            startRestartGroup.startReplaceGroup(-1572055156);
                            java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                            if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics)) {
                                consume = null;
                            }
                            detailScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics) consume;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1571993001);
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                            com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                            if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                                str = "null";
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type DetailScreenAnalytics but current analytics is of type ");
                            sb.append(str);
                            sb.append(". Returning null.");
                            com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                            startRestartGroup.endReplaceGroup();
                            detailScreenAnalytics = null;
                        }
                        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics2 = detailScreenAnalytics;
                        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule payingWithModule = detailScreenAnalytics2 != null ? detailScreenAnalytics2.getPayingWithModule() : null;
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence4 = paymentMethodAbsence2;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_paying_with, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                        com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_update, startRestartGroup, 0), com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, payingWithModule != null ? payingWithModule.updateButton() : null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, ((i6 >> 9) & 14) | 1769472, 408);
                        startRestartGroup.endNode();
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing2() / 2.0f), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 390, 0), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-762527284);
                        for (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition fundingInstrumentWithPosition : list3) {
                            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fi = fundingInstrumentWithPosition.getFi();
                            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority position = fundingInstrumentWithPosition.getPosition();
                            if (fi.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance) {
                                startRestartGroup.startReplaceGroup(-1292389917);
                                java.lang.String formattedBalance = fi.getFormattedBalance();
                                if (formattedBalance != null) {
                                    startRestartGroup.startReplaceGroup(-1292389917);
                                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_available_balance, new java.lang.Object[]{formattedBalance}, startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-1292389918);
                                    startRestartGroup.endReplaceGroup();
                                    stringResource = null;
                                }
                                startRestartGroup.endReplaceGroup();
                            } else if (fi.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) {
                                startRestartGroup.startReplaceGroup(-1292091108);
                                java.lang.String formattedBalance2 = fi.getFormattedBalance();
                                if (formattedBalance2 != null) {
                                    startRestartGroup.startReplaceGroup(-1292091108);
                                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_available_paypal_balance, new java.lang.Object[]{formattedBalance2}, startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-1292091109);
                                    startRestartGroup.endReplaceGroup();
                                    stringResource = null;
                                }
                                startRestartGroup.endReplaceGroup();
                            } else {
                                if (fi.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit) {
                                    startRestartGroup.startReplaceGroup(-1291811799);
                                    startRestartGroup.endReplaceGroup();
                                    fiLabel = null;
                                } else {
                                    startRestartGroup.startReplaceGroup(373971830);
                                    fiLabel = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(fi, (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()));
                                    startRestartGroup.endReplaceGroup();
                                }
                                com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19836FundingInstrumentComponentFJfuzF0(fi, null, fiLabel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.getTrailingLabel(fi, position, startRestartGroup, 0), 0.0f, startRestartGroup, 0, 18);
                            }
                            fiLabel = stringResource;
                            com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19836FundingInstrumentComponentFJfuzF0(fi, null, fiLabel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.getTrailingLabel(fi, position, startRestartGroup, 0), 0.0f, startRestartGroup, 0, 18);
                        }
                        startRestartGroup.endReplaceGroup();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(paymentMethodAbsence4, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup.INSTANCE)) {
                            startRestartGroup.startReplaceGroup(-762490554);
                            getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_no_backup_payment_method, startRestartGroup, 0), null, startRestartGroup, 0, 2);
                            startRestartGroup.endReplaceGroup();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(paymentMethodAbsence4, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod.INSTANCE)) {
                            startRestartGroup.startReplaceGroup(-762483938);
                            getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_flow_no_saved_fi, startRestartGroup, 0), null, startRestartGroup, 0, 2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (paymentMethodAbsence4 != null) {
                                startRestartGroup.startReplaceGroup(-762492728);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(2132964109);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        paymentMethodAbsence3 = paymentMethodAbsence4;
                        function02 = function03;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list4 = list3;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function02;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$4lErMry75u9bAlKTG_8ty9irlHA(androidx.compose.ui.Modifier.this, list4, paymentMethodAbsence3, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paymentMethodAbsence2 = paymentMethodAbsence;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        list2 = list;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        paymentMethodAbsence2 = paymentMethodAbsence;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(597243495);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(597243495, i4, -1, "com.paypal.oslo.feature.subscriptions.details.ui.NoPaymentMethodErrorView (ManageFISection.kt:144)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.CardArtIconContainer(com.paypal.pds.core.Icon.Alert.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, startRestartGroup, 24582, 14);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i4 & 14) | 12779904, 6, 858);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.m19840$r8$lambda$fwXUG0HOyZjNEB4mJzI62l2XI(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3gw4XjCUmgJTjZj_0SD_SCcKnqA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(334691078);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(334691078, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionLongMerchantNamePreview (ManageFISection.kt:322)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getDebitCard(), "preview-fi-long-name", null, "Bank of America Platinum Rewards Card with Very Long Name That Should Truncate", "9876", null, null, 50, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$3gw4XjCUmgJTjZj_0SD_SCcKnqA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4lErMry75u9bAlKTG_8ty9irlHA(androidx.compose.ui.Modifier modifier, java.util.List list, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageFISection(modifier, list, paymentMethodAbsence, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7AfWTci2bhFCvMvhVOfWrIqC1BM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-974097214);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-974097214, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionPayPalBalancePreview (ManageFISection.kt:219)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalBalance(), "preview-fi-4", null, "PayPal Balance", null, "$150.75", "https://www.paypalobjects.com/dp/wallet/paypal_small.png", 10, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$7AfWTci2bhFCvMvhVOfWrIqC1BM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X6XVqDAa5-GtOYWjACKtrtTP8GY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19838$r8$lambda$X6XVqDAa5GtOYWjACKtrtTP8GY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-282150543);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-282150543, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionEmptyNamePreview (ManageFISection.kt:288)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-fi-empty-name", null, null, "1234", null, null, 50, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.m19838$r8$lambda$X6XVqDAa5GtOYWjACKtrtTP8GY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zf5PkG9D5mFNFkL2rIXrR5aGvbg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2096992737);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2096992737, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionWithBackupPreview (ManageFISection.kt:265)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsPreviewData().balanceWithBackup(), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$Zf5PkG9D5mFNFkL2rIXrR5aGvbg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$akr1Gi9tCbPbFxdQOkFLvxqcwvQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1691598554);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1691598554, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionNoBackupPreview (ManageFISection.kt:276)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsPreviewData().balanceWithNoBackup(), com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup.INSTANCE, null, startRestartGroup, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$akr1Gi9tCbPbFxdQOkFLvxqcwvQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$di-SkNmetxj-fRqXS63GR3-t36s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19839$r8$lambda$diSkNmetxjfRqXS63GR3t36s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1965800066);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1965800066, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionCreditCardWithLastDigitsPreview (ManageFISection.kt:166)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-fi-1", null, null, "1234", null, "https://www.paypalobjects.com/dp/wallet/card/visa_small.png", 22, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.m19839$r8$lambda$diSkNmetxjfRqXS63GR3t36s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fwXUG0HOyZjNEB--4mJzI62l2XI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19840$r8$lambda$fwXUG0HOyZjNEB4mJzI62l2XI(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iajxQBEW1dXcX_5ihpHmkQKy57c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-175206036);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-175206036, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionBankAccountWithLastDigitsPreview (ManageFISection.kt:201)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getBankChecking(), "preview-fi-3", null, "HSBC Checking", "9012", null, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewDataKt.THUMBNAIL, 18, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$iajxQBEW1dXcX_5ihpHmkQKy57c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iwcNil2zoc5a1_oV_vSY436Q_UE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-728590442);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-728590442, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionMultipleFundingInstrumentsPreview (ManageFISection.kt:339)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition[]{com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalDebit(), "preview-fi-primary", null, null, null, "$250.00", null, 46, null), null, 1, null), com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-fi-backup", null, "Chase Sapphire", "4321", null, null, 50, null), null, 1, null)}), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$iwcNil2zoc5a1_oV_vSY436Q_UE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rwL86D6HBeQ6_SVjRCA7MzQt1MU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1202278281);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1202278281, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionDebitCardWithLastDigitsPreview (ManageFISection.kt:183)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getDebitCard(), "preview-fi-2", null, "Bank of America Debit", "5678", null, "https://www.paypalobjects.com/dp/wallet/card/mastercard_small.png", 18, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$rwL86D6HBeQ6_SVjRCA7MzQt1MU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uxY8X9BV2GhhDFyMGwdr9_cD8K8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(868835129);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(868835129, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionNoDefaultPreview (ManageFISection.kt:254)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), null, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod.INSTANCE, null, startRestartGroup, 384, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$uxY8X9BV2GhhDFyMGwdr9_cD8K8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xn0JNTYRp-pgBE2_u9d_i76GLbI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19841$r8$lambda$xn0JNTYRppgBE2_u9d_i76GLbI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1094312148);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1094312148, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionPayPalDebitWithBalancePreview (ManageFISection.kt:237)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalDebit(), "preview-fi-5", null, null, null, "$85.50", "https://www.paypalobjects.com/dp/wallet/paypal_debit_small.png", 14, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.m19841$r8$lambda$xn0JNTYRppgBE2_u9d_i76GLbI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zSlLmZHZNvGV2S7cno7R9jbqMAM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2111164553);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2111164553, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionPPCCPreview (ManageFISection.kt:305)");
            }
            ManageFISection(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.withPosition$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalCredit(), "preview-fi-ppcc", null, "PayPal CashBack MasterCard", "1234", null, null, 50, null), null, 1, null)), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.$r8$lambda$zSlLmZHZNvGV2S7cno7R9jbqMAM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
