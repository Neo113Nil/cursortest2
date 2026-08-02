package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/UpdateTaxSettingsUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PaymentRequestSettingsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PaymentRequestSettingsRepository;)V", "", "isTaxInclusive", "isTaxCalculatedAfterDiscount", "", "invoke", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PaymentRequestSettingsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateTaxSettingsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UpdateTaxSettingsUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository paymentRequestSettingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestSettingsRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentRequestSettingsRepository;
    }

    public final java.lang.Object invoke(boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateTaxSettings = this.getHighResolutionOutputSizeshNQ4ISI.updateTaxSettings(z, z2, continuation);
        return updateTaxSettings == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateTaxSettings : kotlin.Unit.INSTANCE;
    }
}
