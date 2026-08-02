package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ReviewScreenKt$ReviewScreen$6$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent2 = reviewEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent2, "");
        ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel) this.receiver).handleEvent$cryptocurrency_prodRelease(reviewEvent2);
        return kotlin.Unit.INSTANCE;
    }

    ReviewScreenKt$ReviewScreen$6$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.class, "handleEvent", "handleEvent$cryptocurrency_prodRelease(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;)V", 0);
    }
}
