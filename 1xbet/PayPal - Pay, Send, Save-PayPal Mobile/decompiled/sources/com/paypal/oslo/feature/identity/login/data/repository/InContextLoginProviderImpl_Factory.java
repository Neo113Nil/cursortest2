package com.paypal.oslo.feature.identity.login.data.repository;

/* loaded from: classes12.dex */
public final class InContextLoginProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private InContextLoginProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        return new com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl newInstance(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl(identityTokenStorage, featureGate);
    }
}
