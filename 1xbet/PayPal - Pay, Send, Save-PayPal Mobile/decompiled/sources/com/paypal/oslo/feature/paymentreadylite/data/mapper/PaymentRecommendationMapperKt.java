package com.paypal.oslo.feature.paymentreadylite.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/model/PaymentRecommendationResponse;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "toDomain", "(Lcom/paypal/oslo/feature/paymentreadylite/data/model/PaymentRecommendationResponse;)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationMapperKt {
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation toDomain(com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse paymentRecommendationResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationResponse, "");
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation(paymentRecommendationResponse.getSessionId(), paymentRecommendationResponse.getInPayPalNetwork(), com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentOptionMapperKt.toDomain(paymentRecommendationResponse.getRecommendations()));
    }
}
