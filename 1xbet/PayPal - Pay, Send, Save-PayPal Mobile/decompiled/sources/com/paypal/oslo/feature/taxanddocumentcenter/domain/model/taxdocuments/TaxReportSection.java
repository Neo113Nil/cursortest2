package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "sectionTitle", "Ljava/lang/String;", "getSectionTitle", "()Ljava/lang/String;", "stringKey", "getStringKey", "Companion", "GOODS_AND_SERVICES", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "SAVINGS", "REWARDS", "YEAR_IN_REVIEW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportSection {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection CRYPTO;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection GOODS_AND_SERVICES;
    public static final java.lang.String MINIMUM_SAVINGS_INTEREST_AMOUNT = "$10";
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection REWARDS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection SAVINGS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection YEAR_IN_REVIEW;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection[] getHighSpeedVideoFpsRanges;
    private final java.lang.String sectionTitle;
    private final java.lang.String stringKey;

    private TaxReportSection(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.sectionTitle = str2;
        this.stringKey = str3;
    }

    public final java.lang.String getSectionTitle() {
        return this.sectionTitle;
    }

    public final java.lang.String getStringKey() {
        return this.stringKey;
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection("GOODS_AND_SERVICES", 0, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SALES, "section_sales");
        GOODS_AND_SERVICES = taxReportSection;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 1, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, "section_crypto");
        CRYPTO = taxReportSection2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection("SAVINGS", 2, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "section_savings");
        SAVINGS = taxReportSection3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection("REWARDS", 3, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, "section_rewards");
        REWARDS = taxReportSection4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection("YEAR_IN_REVIEW", 4, "Year in review", "year_in_review_section_title");
        YEAR_IN_REVIEW = taxReportSection5;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection[] taxReportSectionArr = {taxReportSection, taxReportSection2, taxReportSection3, taxReportSection4, taxReportSection5};
        getHighSpeedVideoFpsRanges = taxReportSectionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(taxReportSectionArr);
        INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.Companion(null);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
