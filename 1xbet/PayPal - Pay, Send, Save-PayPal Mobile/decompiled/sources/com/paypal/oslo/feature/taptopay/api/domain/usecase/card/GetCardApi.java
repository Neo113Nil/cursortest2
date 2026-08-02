package com.paypal.oslo.feature.taptopay.api.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦B¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardApi;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "id", "", "getCardArt", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/GetCardError;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/PayPalDigitizedCard;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface GetCardApi {
    java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardError, com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardApi getCardApi, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return getCardApi.invoke(cardId, z, continuation);
    }
}
