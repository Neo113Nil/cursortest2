package com.paypal.oslo.feature.wallet.preferred.domain.usecase.online;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/GetOnlinePaymentDataUseCase;", "", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/online/OnlinePaymentError;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/online/OnlinePaymentPreference;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetOnlinePaymentDataUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetOnlinePaymentDataUseCase(com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository onlinePaymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePaymentRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = onlinePaymentRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError, com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference>> invoke() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase$invoke$1(this, null));
    }
}
