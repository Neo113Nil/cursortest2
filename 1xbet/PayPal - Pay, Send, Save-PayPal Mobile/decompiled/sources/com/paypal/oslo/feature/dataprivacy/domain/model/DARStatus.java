package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "IN_PROGRESS", "WITHDRAWN", "UNVERIFIED", "VERIFIED", "REJECTED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DARStatus {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus CLOSED;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus FAILED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus IN_PROGRESS;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus OPEN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus REJECTED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus UNKNOWN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus UNVERIFIED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus VERIFIED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus WITHDRAWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DARStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("OPEN", 0);
        OPEN = dARStatus;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus2 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("CLOSED", 1);
        CLOSED = dARStatus2;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus3 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2);
        FAILED = dARStatus3;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus4 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("IN_PROGRESS", 3);
        IN_PROGRESS = dARStatus4;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus5 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("WITHDRAWN", 4);
        WITHDRAWN = dARStatus5;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus6 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("UNVERIFIED", 5);
        UNVERIFIED = dARStatus6;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus7 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("VERIFIED", 6);
        VERIFIED = dARStatus7;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus8 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("REJECTED", 7);
        REJECTED = dARStatus8;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus9 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus("UNKNOWN", 8);
        UNKNOWN = dARStatus9;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus[] dARStatusArr = {dARStatus, dARStatus2, dARStatus3, dARStatus4, dARStatus5, dARStatus6, dARStatus7, dARStatus8, dARStatus9};
        Camera2StreamConfigurationMap = dARStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dARStatusArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
