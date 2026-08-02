package com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid;

/* loaded from: classes15.dex */
public final class GetPlaidTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> getHighSpeedVideoSizes;

    private GetPlaidTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider, dagger.internal.Provider<android.content.Context> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider, dagger.internal.Provider<android.content.Context> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository, android.content.Context context) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase(externalBankAccessRepository, context);
    }
}
