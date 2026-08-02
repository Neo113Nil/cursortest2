package com.paypal.oslo.feature.notificationcenter.di;

/* loaded from: classes5.dex */
public final class TimeProviderModule_ProvideTimeProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider get() {
        return provideTimeProvider();
    }

    public static com.paypal.oslo.feature.notificationcenter.di.TimeProviderModule_ProvideTimeProviderFactory create() {
        return com.paypal.oslo.feature.notificationcenter.di.TimeProviderModule_ProvideTimeProviderFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider provideTimeProvider() {
        return (com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.notificationcenter.di.TimeProviderModule.INSTANCE.provideTimeProvider());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.di.TimeProviderModule_ProvideTimeProviderFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.notificationcenter.di.TimeProviderModule_ProvideTimeProviderFactory();

        private InstanceHolder() {
        }
    }
}
