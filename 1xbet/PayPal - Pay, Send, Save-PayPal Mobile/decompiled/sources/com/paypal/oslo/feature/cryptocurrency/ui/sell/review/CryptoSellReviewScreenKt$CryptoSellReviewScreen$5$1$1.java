package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CryptoSellReviewScreenKt$CryptoSellReviewScreen$5$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent2 = cryptoSellReviewEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent2, "");
        ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel) this.receiver).handleEvent$cryptocurrency_prodRelease(cryptoSellReviewEvent2);
        return kotlin.Unit.INSTANCE;
    }

    CryptoSellReviewScreenKt$CryptoSellReviewScreen$5$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.class, "handleEvent", "handleEvent$cryptocurrency_prodRelease(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;)V", 0);
    }
}
