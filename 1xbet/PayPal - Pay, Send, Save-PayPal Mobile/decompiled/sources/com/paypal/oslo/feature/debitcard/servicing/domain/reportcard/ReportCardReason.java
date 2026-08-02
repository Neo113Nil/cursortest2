package com.paypal.oslo.feature.debitcard.servicing.domain.reportcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "", "<init>", "(Ljava/lang/String;I)V", "LOST_OR_STOLEN", "DAMAGED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportCardReason {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason DAMAGED;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason LOST_OR_STOLEN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason[] getHighSpeedVideoSizes;

    private ReportCardReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason("LOST_OR_STOLEN", 0);
        LOST_OR_STOLEN = reportCardReason;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason2 = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason("DAMAGED", 1);
        DAMAGED = reportCardReason2;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason[] reportCardReasonArr = {reportCardReason, reportCardReason2};
        getHighSpeedVideoSizes = reportCardReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(reportCardReasonArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
