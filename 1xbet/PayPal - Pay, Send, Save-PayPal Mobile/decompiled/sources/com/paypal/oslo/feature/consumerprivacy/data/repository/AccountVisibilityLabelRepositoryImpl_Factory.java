package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes11.dex */
public final class AccountVisibilityLabelRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi> getHighResolutionOutputSizeshNQ4ISI;

    private AccountVisibilityLabelRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi accountVisibilityLabelApi) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl(accountVisibilityLabelApi);
    }
}
