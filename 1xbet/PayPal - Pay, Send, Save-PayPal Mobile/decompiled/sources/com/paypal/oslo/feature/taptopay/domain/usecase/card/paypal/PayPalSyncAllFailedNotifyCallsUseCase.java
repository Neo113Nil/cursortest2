package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayPalSyncAllFailedNotifyCallsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalSyncAllFailedNotifyCallsUseCase(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
        this.Camera2StreamConfigurationMap = payPalCardRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object syncAllFailedNotifyCalls = this.Camera2StreamConfigurationMap.syncAllFailedNotifyCalls(continuation);
        return syncAllFailedNotifyCalls == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? syncAllFailedNotifyCalls : kotlin.Unit.INSTANCE;
    }
}
