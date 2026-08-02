package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class GetMakeAPaymentOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> Camera2StreamConfigurationMap;

    private GetMakeAPaymentOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository makeAPaymentRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase(makeAPaymentRepository);
    }
}
