package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLETED", "INITIAL", "MANUAL_REVIEW", "PENDING_INFORMATION", "PROCESSING_REPORT", "PROCESSING_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportCorrectionStatusDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain COMPLETED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain INITIAL;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain MANUAL_REVIEW;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain PENDING_INFORMATION;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain PROCESSING_FAILED;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain PROCESSING_REPORT;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[] getHighResolutionOutputSizeshNQ4ISI;

    private TaxReportCorrectionStatusDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("COMPLETED", 0);
        COMPLETED = taxReportCorrectionStatusDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("INITIAL", 1);
        INITIAL = taxReportCorrectionStatusDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("MANUAL_REVIEW", 2);
        MANUAL_REVIEW = taxReportCorrectionStatusDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("PENDING_INFORMATION", 3);
        PENDING_INFORMATION = taxReportCorrectionStatusDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("PROCESSING_REPORT", 4);
        PROCESSING_REPORT = taxReportCorrectionStatusDomain5;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain6 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain("PROCESSING_FAILED", 5);
        PROCESSING_FAILED = taxReportCorrectionStatusDomain6;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[] taxReportCorrectionStatusDomainArr = {taxReportCorrectionStatusDomain, taxReportCorrectionStatusDomain2, taxReportCorrectionStatusDomain3, taxReportCorrectionStatusDomain4, taxReportCorrectionStatusDomain5, taxReportCorrectionStatusDomain6};
        getHighResolutionOutputSizeshNQ4ISI = taxReportCorrectionStatusDomainArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxReportCorrectionStatusDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
