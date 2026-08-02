package com.paypal.oslo.feature.paymentreadylite.data.datasource.stub;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/stub/StubPaymentRecommendationRemoteDataSource;", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationRemoteDataSource;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/error/PaymentRecommendationApiError;", "Lcom/paypal/oslo/feature/paymentreadylite/data/model/PaymentRecommendationResponse;", "fetchPaymentRecommendation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StubPaymentRecommendationRemoteDataSource implements com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StubPaymentRecommendationRemoteDataSource() {
    }

    @Override // com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource
    public final java.lang.Object fetchPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationApiError, com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse("stub-session-12345", true, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto[]{new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto("PAYPAL", 1), new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto("VENMO", 2)})));
    }
}
