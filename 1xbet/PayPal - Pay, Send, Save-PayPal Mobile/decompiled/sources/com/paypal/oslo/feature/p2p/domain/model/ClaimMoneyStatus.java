package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "COMPLETED", "REVERSED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClaimMoneyStatus {
    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus COMPLETED;
    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus PENDING;
    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus REVERSED;
    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ClaimMoneyStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus claimMoneyStatus = new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0);
        PENDING = claimMoneyStatus;
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus claimMoneyStatus2 = new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus("COMPLETED", 1);
        COMPLETED = claimMoneyStatus2;
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus claimMoneyStatus3 = new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus("REVERSED", 2);
        REVERSED = claimMoneyStatus3;
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus claimMoneyStatus4 = new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus("UNKNOWN", 3);
        UNKNOWN = claimMoneyStatus4;
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus[] claimMoneyStatusArr = {claimMoneyStatus, claimMoneyStatus2, claimMoneyStatus3, claimMoneyStatus4};
        getHighResolutionOutputSizeshNQ4ISI = claimMoneyStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(claimMoneyStatusArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
