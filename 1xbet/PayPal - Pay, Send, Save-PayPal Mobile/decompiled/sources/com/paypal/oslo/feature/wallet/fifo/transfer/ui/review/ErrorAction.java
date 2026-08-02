package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "Retry", "EndFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorAction {
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction EndFlow;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction Retry;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction[] getHighSpeedVideoFpsRanges;

    private ErrorAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction("Retry", 0);
        Retry = errorAction;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction2 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction("EndFlow", 1);
        EndFlow = errorAction2;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction[] errorActionArr = {errorAction, errorAction2};
        getHighSpeedVideoFpsRanges = errorActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(errorActionArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
