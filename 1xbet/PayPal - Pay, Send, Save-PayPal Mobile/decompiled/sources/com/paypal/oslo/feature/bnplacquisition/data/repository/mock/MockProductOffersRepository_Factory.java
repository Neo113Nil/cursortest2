package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockProductOffersRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository> {
    private final dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> getHighResolutionOutputSizeshNQ4ISI;

    private MockProductOffersRepository_Factory(dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository_Factory create(dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository newInstance(kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> function0) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository(function0);
    }
}
