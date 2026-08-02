package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class YearDropdownRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> getHighSpeedVideoFpsRangesFor;

    private YearDropdownRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl newInstance(com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl(countryConfig);
    }
}
