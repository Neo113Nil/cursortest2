package com.paypal.oslo.feature.taptopay.api.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H¦B¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "id", "", "clientMetadataId", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "cardTypes", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/GetCardEligibilityError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface GetCardEligibilityApi {
    java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> list, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardEligibilityError, java.lang.Boolean>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi getCardEligibilityApi, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, java.lang.String str, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return getCardEligibilityApi.invoke(cardId, str, list, continuation);
    }
}
