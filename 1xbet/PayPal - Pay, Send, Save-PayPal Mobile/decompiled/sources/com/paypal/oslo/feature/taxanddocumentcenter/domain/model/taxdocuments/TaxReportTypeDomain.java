package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "stringKey", "Ljava/lang/String;", "getStringKey", "()Ljava/lang/String;", "SALES_1099K", "SALES_TRANSACTIONS_STATEMENT", "CRYPTO_1099K", "CRYPTO_1099_DA", "CRYPTO_GAINS_LOSSES_STATEMENT", "CRYPTO_TRANSACTIONS_STATEMENT", "SAVINGS_1099_INT", "MULTI_SAVINGS_1099_INT", "CRYPTO_1099_MISC", "FIAT_1099_MISC", "GET_ALL_TAX_DOCUMENTS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportTypeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain CRYPTO_1099K;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain CRYPTO_1099_DA;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain CRYPTO_1099_MISC;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain CRYPTO_GAINS_LOSSES_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain CRYPTO_TRANSACTIONS_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain FIAT_1099_MISC;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain GET_ALL_TAX_DOCUMENTS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain MULTI_SAVINGS_1099_INT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain SALES_1099K;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain SALES_TRANSACTIONS_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain SAVINGS_1099_INT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain[] getHighSpeedVideoFpsRanges;
    private final java.lang.String stringKey;

    private TaxReportTypeDomain(java.lang.String str, int i, java.lang.String str2) {
        this.stringKey = str2;
    }

    public final java.lang.String getStringKey() {
        return this.stringKey;
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("SALES_1099K", 0, "sales_1099k");
        SALES_1099K = taxReportTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("SALES_TRANSACTIONS_STATEMENT", 1, "sales_transaction_statement");
        SALES_TRANSACTIONS_STATEMENT = taxReportTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("CRYPTO_1099K", 2, "sales_1099k_crypto");
        CRYPTO_1099K = taxReportTypeDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("CRYPTO_1099_DA", 3, "crypto_1099da");
        CRYPTO_1099_DA = taxReportTypeDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("CRYPTO_GAINS_LOSSES_STATEMENT", 4, "crypto_gains_losses");
        CRYPTO_GAINS_LOSSES_STATEMENT = taxReportTypeDomain5;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain6 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("CRYPTO_TRANSACTIONS_STATEMENT", 5, "crypto_transaction_statement");
        CRYPTO_TRANSACTIONS_STATEMENT = taxReportTypeDomain6;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain7 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("SAVINGS_1099_INT", 6, "savings_1099int");
        SAVINGS_1099_INT = taxReportTypeDomain7;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain8 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("MULTI_SAVINGS_1099_INT", 7, "savings_1099int");
        MULTI_SAVINGS_1099_INT = taxReportTypeDomain8;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain9 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("CRYPTO_1099_MISC", 8, "rewards_1099misc_crypto");
        CRYPTO_1099_MISC = taxReportTypeDomain9;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain10 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("FIAT_1099_MISC", 9, "rewards_1099misc_fiat");
        FIAT_1099_MISC = taxReportTypeDomain10;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain11 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain("GET_ALL_TAX_DOCUMENTS", 10, "download_all");
        GET_ALL_TAX_DOCUMENTS = taxReportTypeDomain11;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain[] taxReportTypeDomainArr = {taxReportTypeDomain, taxReportTypeDomain2, taxReportTypeDomain3, taxReportTypeDomain4, taxReportTypeDomain5, taxReportTypeDomain6, taxReportTypeDomain7, taxReportTypeDomain8, taxReportTypeDomain9, taxReportTypeDomain10, taxReportTypeDomain11};
        getHighSpeedVideoFpsRanges = taxReportTypeDomainArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(taxReportTypeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
