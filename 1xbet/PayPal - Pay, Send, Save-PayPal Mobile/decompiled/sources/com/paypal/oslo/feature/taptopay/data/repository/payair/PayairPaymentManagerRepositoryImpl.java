package com.paypal.oslo.feature.taptopay.data.repository.payair;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentManagerRepositoryImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;", "Lcom/payair/logic/managers/PaymentManager;", "paymentManager", "<init>", "(Lcom/payair/logic/managers/PaymentManager;)V", "", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "", "replenishPaymentKeys", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/payair/logic/managers/PaymentManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayairPaymentManagerRepositoryImpl implements com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.payair.logic.managers.PaymentManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayairPaymentManagerRepositoryImpl(com.payair.logic.managers.PaymentManager paymentManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentManager;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository
    public final java.lang.Object replenishPaymentKeys(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.replenishPaymentKeys(str, continuation);
    }
}
