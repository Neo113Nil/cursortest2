package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "REJECTED", "UNKNOWN", "UPCOMING", "COMPLETED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepaymentStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus CANCELED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus COMPLETED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus PENDING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus REJECTED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus UPCOMING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus[] getHighSpeedVideoFpsRangesFor;

    private RepaymentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 0);
        CANCELED = repaymentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = repaymentStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus("REJECTED", 2);
        REJECTED = repaymentStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus("UNKNOWN", 3);
        UNKNOWN = repaymentStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus("UPCOMING", 4);
        UPCOMING = repaymentStatus5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus6 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus("COMPLETED", 5);
        COMPLETED = repaymentStatus6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus[] repaymentStatusArr = {repaymentStatus, repaymentStatus2, repaymentStatus3, repaymentStatus4, repaymentStatus5, repaymentStatus6};
        getHighSpeedVideoFpsRangesFor = repaymentStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(repaymentStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
