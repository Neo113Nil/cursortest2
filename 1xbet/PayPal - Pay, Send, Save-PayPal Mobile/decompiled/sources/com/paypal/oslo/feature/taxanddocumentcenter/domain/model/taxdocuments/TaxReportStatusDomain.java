package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportStatusDomain;", "", "<init>", "(Ljava/lang/String;I)V", "DEPENDENT_REPORT_NOT_READY", "UNAVAILABLE_NO_ACTION", "GENERATION_ON_ACTION", "GENERATED", "GENERATION_ON_DEMAND", "GENERATION_IN_PROGRESS", "NOT_ELIGIBLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportStatusDomain {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain DEPENDENT_REPORT_NOT_READY;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain GENERATED;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain GENERATION_IN_PROGRESS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain GENERATION_ON_ACTION;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain GENERATION_ON_DEMAND;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain NOT_ELIGIBLE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain UNAVAILABLE_NO_ACTION;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain[] getHighSpeedVideoFpsRangesFor;

    private TaxReportStatusDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("DEPENDENT_REPORT_NOT_READY", 0);
        DEPENDENT_REPORT_NOT_READY = taxReportStatusDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("UNAVAILABLE_NO_ACTION", 1);
        UNAVAILABLE_NO_ACTION = taxReportStatusDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("GENERATION_ON_ACTION", 2);
        GENERATION_ON_ACTION = taxReportStatusDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("GENERATED", 3);
        GENERATED = taxReportStatusDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("GENERATION_ON_DEMAND", 4);
        GENERATION_ON_DEMAND = taxReportStatusDomain5;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain6 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("GENERATION_IN_PROGRESS", 5);
        GENERATION_IN_PROGRESS = taxReportStatusDomain6;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain taxReportStatusDomain7 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain("NOT_ELIGIBLE", 6);
        NOT_ELIGIBLE = taxReportStatusDomain7;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain[] taxReportStatusDomainArr = {taxReportStatusDomain, taxReportStatusDomain2, taxReportStatusDomain3, taxReportStatusDomain4, taxReportStatusDomain5, taxReportStatusDomain6, taxReportStatusDomain7};
        getHighSpeedVideoFpsRangesFor = taxReportStatusDomainArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxReportStatusDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
