package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes5.dex */
public final class AcquisitionConfigModule_ProvideCountryGetterFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CountryResolver> getHighResolutionOutputSizeshNQ4ISI;

    private AcquisitionConfigModule_ProvideCountryGetterFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CountryResolver> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> get() {
        return provideCountryGetter(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideCountryGetterFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CountryResolver> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideCountryGetterFactory(provider);
    }

    public static kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> provideCountryGetter(com.paypal.oslo.feature.bnplacquisition.config.CountryResolver countryResolver) {
        return (kotlin.jvm.functions.Function0) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule.INSTANCE.provideCountryGetter(countryResolver));
    }
}
