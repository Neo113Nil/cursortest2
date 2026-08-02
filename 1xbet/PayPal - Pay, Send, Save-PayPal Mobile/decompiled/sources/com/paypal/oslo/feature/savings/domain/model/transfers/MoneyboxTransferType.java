package com.paypal.oslo.feature.savings.domain.model.transfers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "PULL", "PUSH_TO_GI", "PULL_FROM_GI", "GI_TO_GI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyboxTransferType {
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType GI_TO_GI;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType PULL;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType PULL_FROM_GI;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType PUSH;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType PUSH_TO_GI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType[] getHighSpeedVideoFpsRangesFor;

    private MoneyboxTransferType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType("PUSH", 0);
        PUSH = moneyboxTransferType;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType2 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType("PULL", 1);
        PULL = moneyboxTransferType2;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType3 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType("PUSH_TO_GI", 2);
        PUSH_TO_GI = moneyboxTransferType3;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType4 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType("PULL_FROM_GI", 3);
        PULL_FROM_GI = moneyboxTransferType4;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType5 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType("GI_TO_GI", 4);
        GI_TO_GI = moneyboxTransferType5;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType[] moneyboxTransferTypeArr = {moneyboxTransferType, moneyboxTransferType2, moneyboxTransferType3, moneyboxTransferType4, moneyboxTransferType5};
        getHighSpeedVideoFpsRangesFor = moneyboxTransferTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(moneyboxTransferTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
