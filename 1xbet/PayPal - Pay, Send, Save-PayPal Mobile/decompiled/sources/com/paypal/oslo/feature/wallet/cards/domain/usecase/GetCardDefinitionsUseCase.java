package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "invoke", "(Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCardDefinitionsUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetCardDefinitionsUseCase(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> invoke(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase$invoke$1(request, this, null));
    }
}
