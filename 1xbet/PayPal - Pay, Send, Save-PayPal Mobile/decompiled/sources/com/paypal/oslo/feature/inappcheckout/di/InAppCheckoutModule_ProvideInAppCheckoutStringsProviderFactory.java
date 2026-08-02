package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutModule_ProvideInAppCheckoutStringsProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private InAppCheckoutModule_ProvideInAppCheckoutStringsProviderFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider get() {
        return provideInAppCheckoutStringsProvider(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutStringsProviderFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutStringsProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider provideInAppCheckoutStringsProvider(android.content.Context context) {
        return (com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.INSTANCE.provideInAppCheckoutStringsProvider(context));
    }
}
