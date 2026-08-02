package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "STORED_VALUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawalSourceType {
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType STORED_VALUE;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String type;

    private WithdrawalSourceType(java.lang.String str, java.lang.String str2) {
        this.type = str2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType withdrawalSourceType = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType("STORED_VALUE", "STORED_VALUE");
        STORED_VALUE = withdrawalSourceType;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType[] withdrawalSourceTypeArr = {withdrawalSourceType};
        getHighSpeedVideoFpsRangesFor = withdrawalSourceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(withdrawalSourceTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSourceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
