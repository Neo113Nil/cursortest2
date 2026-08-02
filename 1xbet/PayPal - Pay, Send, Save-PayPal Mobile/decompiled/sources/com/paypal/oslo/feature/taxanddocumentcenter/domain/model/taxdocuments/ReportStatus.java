package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INPROGRESS", "DOWNLOADABLE", "RECON_REQUEST_AVAILABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReportStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus DOWNLOADABLE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus INPROGRESS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus RECON_REQUEST_AVAILABLE;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus[] getHighResolutionOutputSizeshNQ4ISI;

    private ReportStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus("INPROGRESS", 0);
        INPROGRESS = reportStatus;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus("DOWNLOADABLE", 1);
        DOWNLOADABLE = reportStatus2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus("RECON_REQUEST_AVAILABLE", 2);
        RECON_REQUEST_AVAILABLE = reportStatus3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus[] reportStatusArr = {reportStatus, reportStatus2, reportStatus3};
        getHighResolutionOutputSizeshNQ4ISI = reportStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(reportStatusArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
