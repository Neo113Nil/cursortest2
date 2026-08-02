package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes12.dex */
public final class GranularAccountVisibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> getHighSpeedVideoSizes;

    private GranularAccountVisibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl(granularAccountVisibilityApi, accountVisibilityDataMapper);
    }
}
