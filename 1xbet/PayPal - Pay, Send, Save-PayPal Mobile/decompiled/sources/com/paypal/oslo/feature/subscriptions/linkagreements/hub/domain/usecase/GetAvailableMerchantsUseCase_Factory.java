package com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase;

/* loaded from: classes15.dex */
public final class GetAvailableMerchantsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository> Camera2StreamConfigurationMap;

    private GetAvailableMerchantsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase newInstance(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository linkAgreementsRepository) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase(linkAgreementsRepository);
    }
}
