package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class CountryResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.CountryResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private CountryResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.CountryResolver get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.CountryResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.config.CountryResolver_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.CountryResolver newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.bnplacquisition.config.CountryResolver(userStore);
    }
}
