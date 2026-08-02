package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes11.dex */
public final class AccountVisibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi> getHighSpeedVideoSizes;

    private AccountVisibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl(accountVisibilityApi, accountVisibilityDataMapper);
    }
}
