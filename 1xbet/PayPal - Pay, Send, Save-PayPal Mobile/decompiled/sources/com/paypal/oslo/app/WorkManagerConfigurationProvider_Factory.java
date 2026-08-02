package com.paypal.oslo.app;

/* loaded from: classes10.dex */
public final class WorkManagerConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.WorkManagerConfigurationProvider> {
    private final dagger.internal.Provider<androidx.hilt.work.HiltWorkerFactory> getHighResolutionOutputSizeshNQ4ISI;

    private WorkManagerConfigurationProvider_Factory(dagger.internal.Provider<androidx.hilt.work.HiltWorkerFactory> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.WorkManagerConfigurationProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.WorkManagerConfigurationProvider_Factory create(dagger.internal.Provider<androidx.hilt.work.HiltWorkerFactory> provider) {
        return new com.paypal.oslo.app.WorkManagerConfigurationProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.WorkManagerConfigurationProvider newInstance(androidx.hilt.work.HiltWorkerFactory hiltWorkerFactory) {
        return new com.paypal.oslo.app.WorkManagerConfigurationProvider(hiltWorkerFactory);
    }
}
