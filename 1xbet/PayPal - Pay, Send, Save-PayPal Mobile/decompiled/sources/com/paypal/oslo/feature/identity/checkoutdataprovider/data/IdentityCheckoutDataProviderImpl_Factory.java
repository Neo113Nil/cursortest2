package com.paypal.oslo.feature.identity.checkoutdataprovider.data;

/* loaded from: classes12.dex */
public final class IdentityCheckoutDataProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> getHighSpeedVideoSizes;

    private IdentityCheckoutDataProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider5) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl newInstance(com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl(lLSLoginUseCase, checkoutInputDataStore, checkoutOutputDataStore, authCodeDataStore, identityTokenStorage);
    }
}
