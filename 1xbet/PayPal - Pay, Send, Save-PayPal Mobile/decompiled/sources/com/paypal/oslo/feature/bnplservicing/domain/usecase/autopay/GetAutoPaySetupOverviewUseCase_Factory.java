package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

/* loaded from: classes11.dex */
public final class GetAutoPaySetupOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> getHighSpeedVideoFpsRanges;

    private GetAutoPaySetupOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository autopayRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase(autopayRepository);
    }
}
