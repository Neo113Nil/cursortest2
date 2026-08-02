package com.paypal.oslo.feature.taptopay.data.repository.paypal.personalization;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/personalization/RemotePersonalizationMessageRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/personalization/PayPalPersonalizedMessageRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PSRequestData;", "psRequestData", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PSMessageError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/FISelectorMessage;", "getFISelectorMessage", "(Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PSRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/AllSetStretchOfferTile;", "getStretchOfferTile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RemotePersonalizationMessageRepository implements com.paypal.oslo.feature.taptopay.domain.repository.paypal.personalization.PayPalPersonalizedMessageRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RemotePersonalizationMessageRepository() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.personalization.PayPalPersonalizedMessageRepository
    public final java.lang.Object getFISelectorMessage(com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData pSRequestData, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.personalization.PSMessageError, com.paypal.oslo.feature.taptopay.domain.model.personalization.FISelectorMessage>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.personalization.FISelectorMessage(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.personalization.PayPalPersonalizedMessageRepository
    public final java.lang.Object getStretchOfferTile(com.paypal.oslo.feature.taptopay.domain.model.personalization.PSRequestData pSRequestData, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.personalization.PSMessageError, com.paypal.oslo.feature.taptopay.domain.model.personalization.AllSetStretchOfferTile>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.personalization.AllSetStretchOfferTile("", "", "", "", "", null, "", com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.ELIGIBLE, new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress(0, 0)));
    }
}
