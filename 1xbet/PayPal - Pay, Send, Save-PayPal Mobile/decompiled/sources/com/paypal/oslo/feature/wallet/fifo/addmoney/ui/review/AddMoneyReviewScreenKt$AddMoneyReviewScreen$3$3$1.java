package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddMoneyReviewScreenKt$AddMoneyReviewScreen$3$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction reviewScreenUiAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewScreenUiAction, "");
        ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel) this.receiver).onUiAction(reviewScreenUiAction);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction reviewScreenUiAction) {
        getHighSpeedVideoFpsRanges(reviewScreenUiAction);
        return kotlin.Unit.INSTANCE;
    }

    AddMoneyReviewScreenKt$AddMoneyReviewScreen$3$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.class, "onUiAction", "onUiAction(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;)V", 0);
    }
}
