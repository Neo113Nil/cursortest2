package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "toSection", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "", "getSupportsInProgressMessages", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;)Z", "supportsInProgressMessages"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportExtensionsKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection toSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTypeDomain, "");
        switch (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportExtensionsKt.WhenMappings.$EnumSwitchMapping$0[taxReportTypeDomain.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES;
            case 4:
            case 5:
            case 6:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO;
            case 7:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS;
            case 8:
            case 9:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS;
            case 10:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS;
            case 11:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.YEAR_IN_REVIEW;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final boolean getSupportsInProgressMessages(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTypeDomain, "");
        return taxReportTypeDomain == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K || taxReportTypeDomain == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_TRANSACTIONS_STATEMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_DA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_GAINS_LOSSES_STATEMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_TRANSACTIONS_STATEMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SAVINGS_1099_INT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.FIAT_1099_MISC.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_MISC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.MULTI_SAVINGS_1099_INT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.GET_ALL_TAX_DOCUMENTS.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
