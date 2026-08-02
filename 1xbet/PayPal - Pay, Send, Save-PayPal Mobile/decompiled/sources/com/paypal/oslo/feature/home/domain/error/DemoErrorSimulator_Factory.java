package com.paypal.oslo.feature.home.domain.error;

/* loaded from: classes12.dex */
public final class DemoErrorSimulator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighResolutionOutputSizeshNQ4ISI;

    private DemoErrorSimulator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        return new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator newInstance(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator(stringProvider);
    }
}
