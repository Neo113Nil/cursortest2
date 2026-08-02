package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UpdateNicknameUseCase;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;)V", "", "cardId", "nickName", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/cards/domain/repository/CardRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateNicknameUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UpdateNicknameUseCase(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> invoke(java.lang.String cardId, java.lang.String nickName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickName, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1(cardId, nickName, this, null));
    }
}
