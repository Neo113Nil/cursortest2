package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvidePaymentActivityLauncherFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoSizes;

    public ThalesTapToPaySingletonModule_ProvidePaymentActivityLauncherFactory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency get() {
        return providePaymentActivityLauncher(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidePaymentActivityLauncherFactory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidePaymentActivityLauncherFactory(provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency providePaymentActivityLauncher(android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource) {
        return (com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.providePaymentActivityLauncher(context, thalesPaymentDataSource));
    }
}
