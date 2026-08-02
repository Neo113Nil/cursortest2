package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANT", "STANDARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddFundType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType INSTANT;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType STANDARD;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType[] getHighSpeedVideoFpsRangesFor;

    private AddFundType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType("INSTANT", 0);
        INSTANT = addFundType;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType("STANDARD", 1);
        STANDARD = addFundType2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType[] addFundTypeArr = {addFundType, addFundType2};
        getHighSpeedVideoFpsRangesFor = addFundTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(addFundTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
