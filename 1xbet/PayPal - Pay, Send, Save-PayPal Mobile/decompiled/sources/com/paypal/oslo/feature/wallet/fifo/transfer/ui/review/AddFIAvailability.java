package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;", "", "<init>", "(Ljava/lang/String;I)V", "BANK_AND_CARD", "BANK_ONLY", "CARD_ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddFIAvailability {
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability BANK_AND_CARD;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability BANK_ONLY;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability CARD_ONLY;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AddFIAvailability(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability("BANK_AND_CARD", 0);
        BANK_AND_CARD = addFIAvailability;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability2 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability("BANK_ONLY", 1);
        BANK_ONLY = addFIAvailability2;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability3 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability("CARD_ONLY", 2);
        CARD_ONLY = addFIAvailability3;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability[] addFIAvailabilityArr = {addFIAvailability, addFIAvailability2, addFIAvailability3};
        getHighSpeedVideoFpsRanges = addFIAvailabilityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addFIAvailabilityArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
