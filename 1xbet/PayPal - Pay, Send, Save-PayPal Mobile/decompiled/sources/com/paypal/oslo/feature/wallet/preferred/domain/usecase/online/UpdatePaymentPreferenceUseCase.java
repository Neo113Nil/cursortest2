package com.paypal.oslo.feature.wallet.preferred.domain.usecase.online;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/UpdatePaymentPreferenceUseCase;", "", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;)V", "", "financialInstrumentId", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/online/OnlinePaymentError;", "", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/online/OnlinePaymentRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UpdatePaymentPreferenceUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdatePaymentPreferenceUseCase(com.paypal.oslo.feature.wallet.preferred.domain.repository.online.OnlinePaymentRepository onlinePaymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePaymentRepository, "");
        this.getHighSpeedVideoFpsRangesFor = onlinePaymentRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError, java.lang.Boolean>> invoke(java.lang.String financialInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase$invoke$1(this, financialInstrumentId, null));
    }
}
