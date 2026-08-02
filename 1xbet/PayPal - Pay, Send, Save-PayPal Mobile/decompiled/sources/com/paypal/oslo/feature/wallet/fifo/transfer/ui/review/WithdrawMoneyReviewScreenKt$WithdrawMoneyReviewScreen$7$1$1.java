package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$7$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent withdrawMoneyReviewEvent) {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent withdrawMoneyReviewEvent2 = withdrawMoneyReviewEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyReviewEvent2, "");
        ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel) this.receiver).handleAction$wallet_prodRelease(withdrawMoneyReviewEvent2);
        return kotlin.Unit.INSTANCE;
    }

    WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$7$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.class, "handleAction", "handleAction$wallet_prodRelease(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;)V", 0);
    }
}
