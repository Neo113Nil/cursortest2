package com.paypal.oslo.feature.taptopay.api.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦B¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId$PayPalCardId;", "paypalCardIds", "", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface IsCardDigitizedApi {
    java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> list, kotlin.coroutines.Continuation<? super java.util.Map<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId, java.lang.Boolean>> continuation);
}
