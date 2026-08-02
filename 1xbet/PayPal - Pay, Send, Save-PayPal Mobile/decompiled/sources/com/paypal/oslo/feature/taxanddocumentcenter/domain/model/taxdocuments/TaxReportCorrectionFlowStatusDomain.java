package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionFlowStatusDomain;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_REQUIRED_NEW", "ACTION_REQUIRED_RESUME", "IN_PROGRESS", "NOT_AVAILABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportCorrectionFlowStatusDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain ACTION_REQUIRED_NEW;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain ACTION_REQUIRED_RESUME;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain IN_PROGRESS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain NOT_AVAILABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain[] getHighSpeedVideoSizes;

    private TaxReportCorrectionFlowStatusDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain taxReportCorrectionFlowStatusDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain("ACTION_REQUIRED_NEW", 0);
        ACTION_REQUIRED_NEW = taxReportCorrectionFlowStatusDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain taxReportCorrectionFlowStatusDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain("ACTION_REQUIRED_RESUME", 1);
        ACTION_REQUIRED_RESUME = taxReportCorrectionFlowStatusDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain taxReportCorrectionFlowStatusDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain("IN_PROGRESS", 2);
        IN_PROGRESS = taxReportCorrectionFlowStatusDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain taxReportCorrectionFlowStatusDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain("NOT_AVAILABLE", 3);
        NOT_AVAILABLE = taxReportCorrectionFlowStatusDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain[] taxReportCorrectionFlowStatusDomainArr = {taxReportCorrectionFlowStatusDomain, taxReportCorrectionFlowStatusDomain2, taxReportCorrectionFlowStatusDomain3, taxReportCorrectionFlowStatusDomain4};
        getHighSpeedVideoSizes = taxReportCorrectionFlowStatusDomainArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(taxReportCorrectionFlowStatusDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
