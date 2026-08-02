package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "payPalLocalCardDataRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetCardIdGroupUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayPalGetCardIdGroupUseCase(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalLocalCardDataRepository, "");
        this.getHighSpeedVideoSizes = payPalLocalCardDataRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> continuation) {
        return this.getHighSpeedVideoSizes.getCardIdGroup(cardId, continuation);
    }
}
