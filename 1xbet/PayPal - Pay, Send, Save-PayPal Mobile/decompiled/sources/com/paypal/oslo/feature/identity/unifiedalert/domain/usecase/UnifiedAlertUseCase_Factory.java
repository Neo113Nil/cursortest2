package com.paypal.oslo.feature.identity.unifiedalert.domain.usecase;

/* loaded from: classes13.dex */
public final class UnifiedAlertUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> getHighSpeedVideoFpsRanges;

    private UnifiedAlertUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase newInstance(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository unifiedAlertsRepository) {
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase(unifiedAlertsRepository);
    }
}
