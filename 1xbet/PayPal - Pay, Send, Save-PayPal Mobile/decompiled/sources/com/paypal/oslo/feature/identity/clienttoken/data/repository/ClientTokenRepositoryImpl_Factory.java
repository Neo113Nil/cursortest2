package com.paypal.oslo.feature.identity.clienttoken.data.repository;

/* loaded from: classes12.dex */
public final class ClientTokenRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoFpsRangesFor;

    private ClientTokenRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4) {
        return new com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl newInstance(javax.inject.Provider<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> provider, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl(provider, base64Encoder, provider2, identityTokenStorage);
    }
}
