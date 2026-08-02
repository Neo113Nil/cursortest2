package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class GetMakeAPaymentEligibleFiUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> Camera2StreamConfigurationMap;

    private GetMakeAPaymentEligibleFiUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository makeAPaymentRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase(makeAPaymentRepository);
    }
}
