package com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"TableAmountColumnWeight", "", "allFeeSections", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionSection;", "getAllFeeSections", "()Ljava/util/List;", "CompleteFeeListSection", "", "sections", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "FeeTableHeader", "(Landroidx/compose/runtime/Composer;I)V", "AccordionHeader", "title", "", "expanded", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FeeSections", "FeeAccordionRow", "section", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionSection;Landroidx/compose/runtime/Composer;I)V", "AccordionItem", "items", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionRow;", "LegalTextBlock", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BalanceTermAccordionKt {
    private static final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_spending, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_spending_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_spending_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_spending_intl_details)))), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_adding, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_cash_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_cash_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_cash_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_payroll_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_payroll_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_payroll_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_other_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_other_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_adding_check_other_details))})), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_transferring, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_transfer_electronic_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_transfer_electronic_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_transfer_electronic_details)))), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_debit_card, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_out_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_out_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_out_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_atm_intl_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_intl_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_cash_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_cash_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_debit_cash_details))})), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_business_debit_card, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_atm_intl_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_intl_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_cash_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_cash_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_biz_cash_details))})), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_digital_wallets, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_wallet_intl_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_wallet_intl_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_wallet_intl_details)))), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_section_crypto, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_buy_sell_desc, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_buy_sell_details), 2, null), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier1_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier1_amount), null, 4, null), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier2_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier2_amount), null, 4, null), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier3_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier3_amount), null, 4, null), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier4_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_tier4_amount), null, 4, null), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_receive_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_receive_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_receive_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_transfer_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_transfer_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_transfer_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_external_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_external_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_external_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_buy_transfer_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_buy_transfer_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_buy_transfer_details)), new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_sell_transfer_desc, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_sell_transfer_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_crypto_sell_transfer_details))}))});

    public static final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection> getAllFeeSections() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final void CompleteFeeListSection(final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection> list, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-323789681);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-323789681, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.CompleteFeeListSection (BalanceTermAccordion.kt:219)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_list_title, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
            getHighSpeedVideoFpsRangesFor(composer2, 0);
            getHighSpeedVideoFpsRanges(list, composer2, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$UHTzHBDYHldQaW2UveXHE7tG5yA(list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-697038666);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-697038666, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.FeeTableHeader (BalanceTermAccordion.kt:237)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier height = androidx.compose.foundation.layout.IntrinsicKt.height(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.IntrinsicSize.Min);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, height);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_header_fees, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
            com.paypal.oslo.feature.oneonboarding.ui.common.VerticalDividerKt.m17162VerticalDividerrAjV9yQ(null, 0.0f, startRestartGroup, 0, 3);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_header_amount, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.7f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
            com.paypal.oslo.feature.oneonboarding.ui.common.VerticalDividerKt.m17162VerticalDividerrAjV9yQ(null, 0.0f, startRestartGroup, 0, 3);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_header_details, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
            startRestartGroup.endNode();
            composer2 = startRestartGroup;
            com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$F2qWB_taQ_XfV5bfeSodWp7Wdl4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccordionHeader(final java.lang.String str, boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(353569227);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            z2 = z;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(353569227, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.AccordionHeader (BalanceTermAccordion.kt:293)");
            }
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), "accordion_header_".concat(java.lang.String.valueOf(str))), null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, null, null, function0, startRestartGroup, ((i3 << 12) & 3670016) | 384, 29);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
            composer2 = startRestartGroup;
            z2 = z;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, i3 & 14, 6, 1020);
            com.paypal.pds.components.IconButtonKt.IconButton(z2 ? com.paypal.pds.core.Icon.ChevronUp.INSTANCE : com.paypal.pds.core.Icon.ChevronDown.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE, null, null, null, false, false, composer2, ((i3 >> 3) & 112) | 3072, 500);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z3 = z2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.m16973$r8$lambda$Dro9bn4uIkOsV5YT8PVwmaVXN4(str, z3, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection> list, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1641817777);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1641817777, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.FeeSections (BalanceTermAccordion.kt:322)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            startRestartGroup.startReplaceGroup(-1791732632);
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                FeeAccordionRow((com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection) it.next(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$xgnBNtWw4djy7cxn2KSYeqZppjM(list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void FeeAccordionRow(final com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection accordionSection, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(612262476);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(accordionSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(612262476, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.FeeAccordionRow (BalanceTermAccordion.kt:338)");
            }
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(accordionSection.getTitleResId(), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.MutableState mutableState2 = mutableState;
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            boolean changed = startRestartGroup.changed(mutableState);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$2owQTVktdE0WXSGMt0P184pfLHg(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AccordionHeader(stringResource, booleanValue, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-620611522, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.m16975$r8$lambda$anpfwM_hd8dQMH9eMtO_OKnYuM(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection.this, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1572870, 30);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$m44eqn_ompnRkrGSwCevVEv9sNY(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static final void AccordionItem(final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> list, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1051926890);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        ?? r14 = 1;
        int i3 = 0;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1051926890, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.AccordionItem (BalanceTermAccordion.kt:363)");
            }
            float f = 0.0f;
            java.lang.String str = null;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            startRestartGroup.startReplaceGroup(1119870916);
            for (com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow accordionRow : list) {
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(accordionRow.getDescriptionResId(), startRestartGroup, i3);
                java.lang.Integer amountResId = accordionRow.getAmountResId();
                if (amountResId == null) {
                    startRestartGroup.startReplaceGroup(-91772924);
                    startRestartGroup.endReplaceGroup();
                    stringResource = str;
                } else {
                    startRestartGroup.startReplaceGroup(-91772923);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(amountResId.intValue(), startRestartGroup, i3);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str2 = stringResource == null ? "" : stringResource;
                java.lang.Integer detailsResId = accordionRow.getDetailsResId();
                if (detailsResId == null) {
                    startRestartGroup.startReplaceGroup(-91691580);
                    startRestartGroup.endReplaceGroup();
                    stringResource2 = str;
                } else {
                    startRestartGroup.startReplaceGroup(-91691579);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(detailsResId.intValue(), startRestartGroup, i3);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str3 = stringResource2 == null ? "" : stringResource2;
                androidx.compose.ui.Modifier height = androidx.compose.foundation.layout.IntrinsicKt.height(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, r14, str), androidx.compose.foundation.layout.IntrinsicSize.Min);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.$r8$lambda$h2pNI_iOfZ5dzv1XgMFg7jQ7u6I((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(height, r14, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i3));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
                androidx.compose.runtime.Composer composer3 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
                com.paypal.oslo.feature.oneonboarding.ui.common.VerticalDividerKt.m17162VerticalDividerrAjV9yQ(null, 0.0f, composer3, 0, 3);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(kotlin.text.StringsKt.replace$default(str2, "%%", "%", false, 4, (java.lang.Object) null), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.7f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer3, 0, 6, 1020);
                com.paypal.oslo.feature.oneonboarding.ui.common.VerticalDividerKt.m17162VerticalDividerrAjV9yQ(null, 0.0f, composer3, 0, 3);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(kotlin.text.StringsKt.replace$default(str3, "%%", "%", false, 4, (java.lang.Object) null), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer3, 0, 6, 1020);
                composer3.endNode();
                com.paypal.pds.components.DividerKt.Divider(null, composer3, 0, 1);
                startRestartGroup = composer3;
                r14 = 1;
                str = null;
                i3 = 0;
                f = 0.0f;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.m16976$r8$lambda$qkZckPS1oBRG_n0MSDncbzAbcg(list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LegalTextBlock(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1770728988);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1770728988, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.LegalTextBlock (BalanceTermAccordion.kt:418)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.RichTextLabel(com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.rememberRichTextWithExplicitPlaceholders(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink[]{new com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink("__LINK_1__", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer_link_program_banks, startRestartGroup, 0), com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlProgramBanks), new com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink("__LINK_2__", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer_link_program_bank, startRestartGroup, 0), com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlProgramBanks), new com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink("__LINK_3__", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer_link_terms_and_conditions, startRestartGroup, 0), com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlPaypalBalanceTerms)}), startRestartGroup, 0), com.paypal.pds.core.Typography.BodyMedium.INSTANCE, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermAccordionKt.m16972$r8$lambda$6MjBf_pjrUG8CDnpfew4TeIBZU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$2owQTVktdE0WXSGMt0P184pfLHg(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6MjBf_pjrUG8CDnpfew4-TeIBZU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16972$r8$lambda$6MjBf_pjrUG8CDnpfew4TeIBZU(int i, androidx.compose.runtime.Composer composer, int i2) {
        LegalTextBlock(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Dro9bn4uIkOsV5YT-8PVwmaVXN4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16973$r8$lambda$Dro9bn4uIkOsV5YT8PVwmaVXN4(java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccordionHeader(str, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F2qWB_taQ_XfV5bfeSodWp7Wdl4(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UHTzHBDYHldQaW2UveXHE7tG5yA(java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        CompleteFeeListSection(list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$anpfwM-_hd8dQMH9eMtO_OKnYuM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16975$r8$lambda$anpfwM_hd8dQMH9eMtO_OKnYuM(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection accordionSection, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-620611522, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.FeeAccordionRow.<anonymous>.<anonymous> (BalanceTermAccordion.kt:350)");
        }
        AccordionItem(accordionSection.getItems(), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h2pNI_iOfZ5dzv1XgMFg7jQ7u6I(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m44eqn_ompnRkrGSwCevVEv9sNY(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection accordionSection, int i, androidx.compose.runtime.Composer composer, int i2) {
        FeeAccordionRow(accordionSection, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qkZckPS1oBRG_n0MSDncbz-Abcg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16976$r8$lambda$qkZckPS1oBRG_n0MSDncbzAbcg(java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccordionItem(list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xgnBNtWw4djy7cxn2KSYeqZppjM(java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
