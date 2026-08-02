package com.paypal.oslo.feature.home.domain.loading;

/* loaded from: classes12.dex */
public final class DeckSectionLoadingFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory_Factory create() {
        return com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory newInstance() {
        return new com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory_Factory();

        private InstanceHolder() {
        }
    }
}
