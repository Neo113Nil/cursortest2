package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CardActivationRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CardActivationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationAvailability;", "getCardActivationAvailability", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;", "request", "", "activateCard", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActivationRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardActivationRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository
    public final java.lang.Object getCardActivationAvailability(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability>> continuation) {
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository
    public final java.lang.Object activateCard(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData activateCardRequestData, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError, kotlin.Unit>> continuation) {
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented.INSTANCE);
    }
}
