package com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/instore/GetInstorePaymentDataUseCase;", "", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/instore/InStorePaymentRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/instore/InStorePaymentRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentError;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/instore/InStorePaymentRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetInstorePaymentDataUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetInstorePaymentDataUseCase(com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository inStorePaymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStorePaymentRepository, "");
        this.getHighSpeedVideoFpsRanges = inStorePaymentRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference>> invoke() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase$invoke$1(this, null));
    }
}
