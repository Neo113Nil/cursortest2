package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNRESOLVED", "RESOLVED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContingencyStatus {
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus RESOLVED;
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus UNKNOWN;
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus UNRESOLVED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus[] getHighSpeedVideoFpsRangesFor;

    private ContingencyStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus = new com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus("UNRESOLVED", 0);
        UNRESOLVED = contingencyStatus;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus2 = new com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus("RESOLVED", 1);
        RESOLVED = contingencyStatus2;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus3 = new com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus("UNKNOWN", 2);
        UNKNOWN = contingencyStatus3;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus[] contingencyStatusArr = {contingencyStatus, contingencyStatus2, contingencyStatus3};
        getHighSpeedVideoFpsRangesFor = contingencyStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contingencyStatusArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
