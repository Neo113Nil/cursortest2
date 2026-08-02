package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

/* loaded from: classes11.dex */
public final class CancelAutopayUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> Camera2StreamConfigurationMap;

    private CancelAutopayUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository autopayRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase(autopayRepository);
    }
}
