package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/RepaymentPlanInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "DEBIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepaymentPlanInstrumentType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType BANK;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType DEBIT_CARD;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType[] getHighSpeedVideoSizes;

    private RepaymentPlanInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = repaymentPlanInstrumentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType("BANK", 1);
        BANK = repaymentPlanInstrumentType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType("DEBIT_CARD", 2);
        DEBIT_CARD = repaymentPlanInstrumentType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType("UNKNOWN", 3);
        UNKNOWN = repaymentPlanInstrumentType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType[] repaymentPlanInstrumentTypeArr = {repaymentPlanInstrumentType, repaymentPlanInstrumentType2, repaymentPlanInstrumentType3, repaymentPlanInstrumentType4};
        getHighSpeedVideoSizes = repaymentPlanInstrumentTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(repaymentPlanInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
