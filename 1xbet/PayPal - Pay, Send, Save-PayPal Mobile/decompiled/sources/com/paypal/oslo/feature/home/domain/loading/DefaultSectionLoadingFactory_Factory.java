package com.paypal.oslo.feature.home.domain.loading;

/* loaded from: classes12.dex */
public final class DefaultSectionLoadingFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory_Factory create() {
        return com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory newInstance() {
        return new com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory_Factory();

        private InstanceHolder() {
        }
    }
}
