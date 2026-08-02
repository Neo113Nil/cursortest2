package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class UpdateAutopayUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository> getHighSpeedVideoSizes;

    private UpdateAutopayUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository autopayRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase(autopayRepository);
    }
}
