package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0002\u001a\r\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u0002\u001a\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002\u001a\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0002\u001a\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0002\u001a\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0002"}, d2 = {"", "TaxReportSectionWithAvailabilityMessagePreview", "(Landroidx/compose/runtime/Composer;I)V", "SalesSectionWithReportsPreview", "CryptoSectionPreview", "SectionNotAvailablePreview", "SectionNotEligibleSalesPreview", "SectionNotEligibleCryptoPreview", "SectionNotEligibleSavingsPreview", "SectionNotEligibleRewardsPreview", "Sales1099KInProgressStatesPreview", "Crypto1099KInProgressStatesPreview", "YearInReviewSectionPreview", "CryptoSectionAllReportsPreview", "RewardsSectionAllReportsPreview", "SavingsSectionAllReportsPreview", "SalesWithReportLinkPreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportSectionPreviewKt {
    public static final void TaxReportSectionWithAvailabilityMessagePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-397927959);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-397927959, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionWithAvailabilityMessagePreview (TaxReportSectionPreview.kt:39)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_pending_review_message, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$PzOdF29uOMmdwirabL0uj94q1ZY((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$OI0zLbo_eiTWHEmFaq7Np_l4yi4((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$523aKpwQ82PlCoNBkE9b4jus6Yo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SalesSectionWithReportsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2058394953);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2058394953, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SalesSectionWithReportsPreview (TaxReportSectionPreview.kt:68)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, "1099k-fiat-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_description, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_self_correction_in_progress_text, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, null, 8, null), null, null, null, null, null, 992, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_TRANSACTIONS_STATEMENT, "transaction-statement-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement_description, new java.lang.Object[]{"2024"}, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement_in_progress_text, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, null, 8, null), null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_link_request_transaction_statement, startRestartGroup, 0), "paypal://tax-documents/request-statement", "GET", null, 8, null), null, null, null, com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K, "1099k-crypto-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto_description, startRestartGroup, 0), null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_not_available_inline_note, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K, null, 8, null), null, null, null, null, 976, null)}), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20399$r8$lambda$_WoRqitvtyo_qlX_A2u2OCSHuk((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$CrIhaqHQjwk2tKV7QKJckcbuOqs((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20391$r8$lambda$NU5Nsv6X50SbLEIhDwGp_WttsY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CryptoSectionPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1785243259);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1785243259, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.CryptoSectionPreview (TaxReportSectionPreview.kt:146)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_DA, "1099da-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_1099da, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_1099da_description, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$BX4a9mVTL3Jl8HleyUikDxY8w4U((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$Puo6lt1fGZ2rg6Rj3SZjiPKdFjY((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20405$r8$lambda$rse7lh27eNvLKHibSQvOEJrKC8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SectionNotAvailablePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1282236110);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1282236110, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SectionNotAvailablePreview (TaxReportSectionPreview.kt:181)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_available_message, new java.lang.Object[]{"March 31"}, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$NBiLJXShyCDq1eUHKfOKuwe7Qfc((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20392$r8$lambda$0KZMk_0szqAhi0IHCt5OZZaGd8((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$2i5XSxEAO4APZcMOs_6r87nLqIY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SectionNotEligibleSalesPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1868374690);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1868374690, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SectionNotEligibleSalesPreview (TaxReportSectionPreview.kt:212)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_sales, new java.lang.Object[]{"2024"}, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_ELIGIBLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$ufByAEYIGUrpDY1DNTOgx_LWpzI((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$shC9pg76YS5_W87Zq3MyTdHqeaQ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$_3mn74JcYyhQjraIUAOGldi1ouM(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SectionNotEligibleCryptoPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1123490375);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1123490375, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SectionNotEligibleCryptoPreview (TaxReportSectionPreview.kt:243)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_crypto, new java.lang.Object[]{"2024"}, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_ELIGIBLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20403$r8$lambda$m3iOv54PO_IXfEEPaO0KiDYu8E((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$RB0Xk34bWE7P5oxgV4fDBxfrLUE((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20402$r8$lambda$j6ELc5F1nRVFjMED1zh8Qk7NBw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SectionNotEligibleSavingsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(678528533);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(678528533, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SectionNotEligibleSavingsPreview (TaxReportSectionPreview.kt:274)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_savings, new java.lang.Object[]{"2024"}, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_ELIGIBLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$kpDGVOzOOrvpuTToZZ4jB0npSUc((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20395$r8$lambda$IeHtnyjnlEAaLnpKI6Dkf0SlEg((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$UZwtZ3yUpsxmtTKLjyMPE0J12cU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SectionNotEligibleRewardsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(91059402);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(91059402, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SectionNotEligibleRewardsPreview (TaxReportSectionPreview.kt:305)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards, startRestartGroup, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_rewards, new java.lang.Object[]{"2024"}, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_ELIGIBLE), kotlin.collections.CollectionsKt.emptyList(), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$3AWLFgm1fO7F3C1kXUNlcrdb69Q((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20406$r8$lambda$tNnmMWwaB1kZ78ibyRbunk8iPY((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20394$r8$lambda$8fq_BJWGSjfEX4fpwgHkrxILlA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Sales1099KInProgressStatesPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1146274951);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1146274951, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.Sales1099KInProgressStatesPreview (TaxReportSectionPreview.kt:336)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, "1099k-not-available", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_in_progress_not_available_message, new java.lang.Object[]{"March 31"}, startRestartGroup, 0), null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_not_available_inline_note, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, null, 8, null), null, null, null, null, 976, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, "1099k-pending-review", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_in_progress_pending_review_message, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)}), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$3gBVifZw5N2JgeCA38UeV7RyCyA((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$U8FB6vSolx7sBPYINbSvTwy8R4c((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$e4RwRs7ADqUIWFajIIAc6YEPbdQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Crypto1099KInProgressStatesPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2040125622);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2040125622, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.Crypto1099KInProgressStatesPreview (TaxReportSectionPreview.kt:385)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K, "crypto-1099k-not-available", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto_in_progress_not_available_message, new java.lang.Object[]{"March 31"}, startRestartGroup, 0), null, null, null, null, null, null, 1008, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K, "crypto-1099k-pending-review", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto_in_progress_pending_review_message, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)}), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$dYa4RdEvLVGeL4F8UjNyIpsMjUM((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$H7M_lQCmFsWbkkeRArvxlGt8DPI((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$caoMKx107G7lNU4GrgCcCto4IqE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void YearInReviewSectionPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1398162494);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1398162494, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearInReviewSectionPreview (TaxReportSectionPreview.kt:428)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.YEAR_IN_REVIEW, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_year_in_review_section_title, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.GET_ALL_TAX_DOCUMENTS, "get-all-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_all, new java.lang.Object[]{"2024"}, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_all_description, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)), "2024", null, null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$hd0gqwJ0hy3Qz2lG1STtZLrpxZI((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$Fv1k4QLdWwpW49D999S5liw7Bk0((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$uW1tQVxKbM161PpwTWekGbRwUak(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CryptoSectionAllReportsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(212343111);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(212343111, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.CryptoSectionAllReportsPreview (TaxReportSectionPreview.kt:461)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_GAINS_LOSSES_STATEMENT, "crypto-gains-losses-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_gains_losses, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_gains_losses_description, startRestartGroup, 0), null, null, null, null, null, null, 1008, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_TRANSACTIONS_STATEMENT, "crypto-transactions-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_transaction_statement, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_transaction_statement_description, new java.lang.Object[]{"2024"}, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)}), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$_mC6o0fGdtZdVxeTFTX3Jb6ODQs((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20393$r8$lambda$1EY3fzpq35VZDvx48hrLRv5c6s((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$c7iD_gZ28elRDHDTJb6od3HMRQI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RewardsSectionAllReportsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(325749390);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(325749390, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.RewardsSectionAllReportsPreview (TaxReportSectionPreview.kt:505)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.FIAT_1099_MISC, "fiat-1099-misc-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_fiat, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_fiat_description, startRestartGroup, 0), null, null, null, null, null, null, 1008, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_MISC, "crypto-1099-misc-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_crypto, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_crypto_description, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)}), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$xOAmL318e9cMaW08P0IM3Kga918((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20401$r8$lambda$hIqiSSBfhuIu9HmuFS9_Xkq4vM((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$v4iocIWdQiFH48u7S86nFc12rvs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SavingsSectionAllReportsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(531093667);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(531093667, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SavingsSectionAllReportsPreview (TaxReportSectionPreview.kt:546)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SAVINGS_1099_INT, "savings-1099-int-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int_multi_account_description, new java.lang.Object[]{"2024"}, startRestartGroup, 0), null, null, null, null, null, null, 1008, null)), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20398$r8$lambda$_AmSz0JPaoL3ZEvHIdFsU_WxJ8((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$MJ2w4XBMT84mCvr9yiz9NllUikk((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20404$r8$lambda$plENz8VCnoYxrXm0pCQz3giPM(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SalesWithReportLinkPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1845768073);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1845768073, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.SalesWithReportLinkPreview (TaxReportSectionPreview.kt:580)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales, startRestartGroup, 0), null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, "1099k-fiat-2024", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_description, startRestartGroup, 0), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_link_self_correction, startRestartGroup, 0), "paypal://tax-documents/self-correction", "GET", null, 8, null), null, null, null, 944, null)), "2024", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip, startRestartGroup, 0), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES), null, 64, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.$r8$lambda$MUcDGnDB6ZwZEIO9dvFcAF4rKog((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20400$r8$lambda$ey7BY_hbXwf5cAk074HFLXwtA((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportSectionComponentKt.TaxReportSection(taxReportSection, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.TaxReportSectionPreviewKt.m20396$r8$lambda$TFd5RDatEZWh7FYhJLV24e4ce8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-NU5Nsv6X50SbLEIhDwGp_WttsY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20391$r8$lambda$NU5Nsv6X50SbLEIhDwGp_WttsY(int i, androidx.compose.runtime.Composer composer, int i2) {
        SalesSectionWithReportsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0KZMk_0szqAhi0IHCt5OZZaGd-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20392$r8$lambda$0KZMk_0szqAhi0IHCt5OZZaGd8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1EY3fzpq35VZD-vx48hrLRv5c6s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20393$r8$lambda$1EY3fzpq35VZDvx48hrLRv5c6s(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2i5XSxEAO4APZcMOs_6r87nLqIY(int i, androidx.compose.runtime.Composer composer, int i2) {
        SectionNotAvailablePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3AWLFgm1fO7F3C1kXUNlcrdb69Q(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3gBVifZw5N2JgeCA38UeV7RyCyA(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$523aKpwQ82PlCoNBkE9b4jus6Yo(int i, androidx.compose.runtime.Composer composer, int i2) {
        TaxReportSectionWithAvailabilityMessagePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8fq_BJWGSjfEX4-fpwgHkrxILlA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20394$r8$lambda$8fq_BJWGSjfEX4fpwgHkrxILlA(int i, androidx.compose.runtime.Composer composer, int i2) {
        SectionNotEligibleRewardsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BX4a9mVTL3Jl8HleyUikDxY8w4U(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CrIhaqHQjwk2tKV7QKJckcbuOqs(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fv1k4QLdWwpW49D999S5liw7Bk0(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H7M_lQCmFsWbkkeRArvxlGt8DPI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IeHtnyjnl-EAaLnpKI6Dkf0SlEg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20395$r8$lambda$IeHtnyjnlEAaLnpKI6Dkf0SlEg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MJ2w4XBMT84mCvr9yiz9NllUikk(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MUcDGnDB6ZwZEIO9dvFcAF4rKog(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NBiLJXShyCDq1eUHKfOKuwe7Qfc(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OI0zLbo_eiTWHEmFaq7Np_l4yi4(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Puo6lt1fGZ2rg6Rj3SZjiPKdFjY(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PzOdF29uOMmdwirabL0uj94q1ZY(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RB0Xk34bWE7P5oxgV4fDBxfrLUE(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TFd5RDatEZWh7FYh-JLV24e4ce8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20396$r8$lambda$TFd5RDatEZWh7FYhJLV24e4ce8(int i, androidx.compose.runtime.Composer composer, int i2) {
        SalesWithReportLinkPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U8FB6vSolx7sBPYINbSvTwy8R4c(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UZwtZ3yUpsxmtTKLjyMPE0J12cU(int i, androidx.compose.runtime.Composer composer, int i2) {
        SectionNotEligibleSavingsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_3mn74JcYyhQjraIUAOGldi1ouM(int i, androidx.compose.runtime.Composer composer, int i2) {
        SectionNotEligibleSalesPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_AmSz0JPaoL-3ZEvHIdFsU_WxJ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20398$r8$lambda$_AmSz0JPaoL3ZEvHIdFsU_WxJ8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_WoRqitvtyo_qlX_A2u-2OCSHuk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20399$r8$lambda$_WoRqitvtyo_qlX_A2u2OCSHuk(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_mC6o0fGdtZdVxeTFTX3Jb6ODQs(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c7iD_gZ28elRDHDTJb6od3HMRQI(int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoSectionAllReportsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$caoMKx107G7lNU4GrgCcCto4IqE(int i, androidx.compose.runtime.Composer composer, int i2) {
        Crypto1099KInProgressStatesPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dYa4RdEvLVGeL4F8UjNyIpsMjUM(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e-y7BY_hb-Xwf5cAk074HFLXwtA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20400$r8$lambda$ey7BY_hbXwf5cAk074HFLXwtA(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e4RwRs7ADqUIWFajIIAc6YEPbdQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        Sales1099KInProgressStatesPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hIqiSSB-fhuIu9HmuFS9_Xkq4vM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20401$r8$lambda$hIqiSSBfhuIu9HmuFS9_Xkq4vM(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hd0gqwJ0hy3Qz2lG1STtZLrpxZI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j6ELc5F1nRVFjMED1-zh8Qk7NBw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20402$r8$lambda$j6ELc5F1nRVFjMED1zh8Qk7NBw(int i, androidx.compose.runtime.Composer composer, int i2) {
        SectionNotEligibleCryptoPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kpDGVOzOOrvpuTToZZ4jB0npSUc(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m3i-Ov54PO_IXfEEPaO0KiDYu8E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20403$r8$lambda$m3iOv54PO_IXfEEPaO0KiDYu8E(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p-lE-Nz8VCnoYxrXm0pCQz3giPM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20404$r8$lambda$plENz8VCnoYxrXm0pCQz3giPM(int i, androidx.compose.runtime.Composer composer, int i2) {
        SavingsSectionAllReportsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rse7lh27eNvLKH-ibSQvOEJrKC8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20405$r8$lambda$rse7lh27eNvLKHibSQvOEJrKC8(int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoSectionPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uW1tQVxKbM161PpwTWekGbRwUak(int i, androidx.compose.runtime.Composer composer, int i2) {
        YearInReviewSectionPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v4iocIWdQiFH48u7S86nFc12rvs(int i, androidx.compose.runtime.Composer composer, int i2) {
        RewardsSectionAllReportsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$shC9pg76YS5_W87Zq3MyTdHqeaQ(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ufByAEYIGUrpDY1DNTOgx_LWpzI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tNnmM-WwaB1kZ78ibyRbunk8iPY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20406$r8$lambda$tNnmMWwaB1kZ78ibyRbunk8iPY(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xOAmL318e9cMaW08P0IM3Kga918(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        return kotlin.Unit.INSTANCE;
    }
}
