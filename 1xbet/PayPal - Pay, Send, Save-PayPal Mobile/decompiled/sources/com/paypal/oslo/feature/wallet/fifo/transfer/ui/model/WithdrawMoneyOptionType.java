package com.paypal.oslo.feature.wallet.fifo.transfer.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_TO_FI", "SAVINGS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawMoneyOptionType {
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType SAVINGS;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType TRANSFER_TO_FI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private WithdrawMoneyOptionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType withdrawMoneyOptionType = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType("TRANSFER_TO_FI", 0);
        TRANSFER_TO_FI = withdrawMoneyOptionType;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType withdrawMoneyOptionType2 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType("SAVINGS", 1);
        SAVINGS = withdrawMoneyOptionType2;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType[] withdrawMoneyOptionTypeArr = {withdrawMoneyOptionType, withdrawMoneyOptionType2};
        Camera2StreamConfigurationMap = withdrawMoneyOptionTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(withdrawMoneyOptionTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
