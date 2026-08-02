package com.paypal.oslo.feature.dataprivacy.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/model/DSRCaseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "INPROGRESS", "WITHDRAWN", "UNVERIFIED", "VERIFIED", "REJECTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DSRCaseStatus {
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus CLOSED;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus FAILED;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus INPROGRESS;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus OPEN;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus REJECTED;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus UNVERIFIED;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus VERIFIED;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus WITHDRAWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus[] getHighSpeedVideoFpsRangesFor;

    private DSRCaseStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("OPEN", 0);
        OPEN = dSRCaseStatus;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus2 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("CLOSED", 1);
        CLOSED = dSRCaseStatus2;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus3 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2);
        FAILED = dSRCaseStatus3;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus4 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("INPROGRESS", 3);
        INPROGRESS = dSRCaseStatus4;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus5 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("WITHDRAWN", 4);
        WITHDRAWN = dSRCaseStatus5;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus6 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("UNVERIFIED", 5);
        UNVERIFIED = dSRCaseStatus6;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus7 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("VERIFIED", 6);
        VERIFIED = dSRCaseStatus7;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus dSRCaseStatus8 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus("REJECTED", 7);
        REJECTED = dSRCaseStatus8;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus[] dSRCaseStatusArr = {dSRCaseStatus, dSRCaseStatus2, dSRCaseStatus3, dSRCaseStatus4, dSRCaseStatus5, dSRCaseStatus6, dSRCaseStatus7, dSRCaseStatus8};
        getHighSpeedVideoFpsRangesFor = dSRCaseStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(dSRCaseStatusArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus[] values() {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.data.model.DSRCaseStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
