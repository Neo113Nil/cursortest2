package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

/* loaded from: classes11.dex */
public final class UpdateAutopayUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> getHighSpeedVideoFpsRangesFor;

    private UpdateAutopayUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository autopayRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase(autopayRepository);
    }
}
