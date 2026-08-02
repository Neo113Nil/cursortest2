package com.paypal.oslo.feature.identity.unifiedalert.domain.usecase;

/* loaded from: classes13.dex */
public final class FetchUnifiedAlertsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> getHighSpeedVideoFpsRangesFor;

    private FetchUnifiedAlertsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase newInstance(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository unifiedAlertsRepository) {
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase(unifiedAlertsRepository);
    }
}
