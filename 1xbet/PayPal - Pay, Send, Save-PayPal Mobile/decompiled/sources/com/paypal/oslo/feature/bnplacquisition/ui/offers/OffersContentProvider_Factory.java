package com.paypal.oslo.feature.bnplacquisition.ui.offers;

/* loaded from: classes11.dex */
public final class OffersContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> Camera2StreamConfigurationMap;

    private OffersContentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider(configContext);
    }
}
