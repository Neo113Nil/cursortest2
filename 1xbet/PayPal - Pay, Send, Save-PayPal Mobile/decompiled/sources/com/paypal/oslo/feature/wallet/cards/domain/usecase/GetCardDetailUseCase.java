package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDetailUseCase;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;)V", "", "cardId", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetailError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCardDetailUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetCardDetailUseCase(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoSizes = cardRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> invoke(java.lang.String cardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1(cardId, this, null));
    }
}
