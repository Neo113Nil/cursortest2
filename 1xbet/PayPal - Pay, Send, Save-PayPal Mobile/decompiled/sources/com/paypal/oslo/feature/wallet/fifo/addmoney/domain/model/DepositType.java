package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_TOPUP", "ADD_FUNDS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DepositType {
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType ADD_FUNDS;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType MANUAL_TOPUP;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DepositType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType("MANUAL_TOPUP", 0);
        MANUAL_TOPUP = depositType;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType("ADD_FUNDS", 1);
        ADD_FUNDS = depositType2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType3 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType("UNKNOWN", 2);
        UNKNOWN = depositType3;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType[] depositTypeArr = {depositType, depositType2, depositType3};
        Camera2StreamConfigurationMap = depositTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(depositTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
