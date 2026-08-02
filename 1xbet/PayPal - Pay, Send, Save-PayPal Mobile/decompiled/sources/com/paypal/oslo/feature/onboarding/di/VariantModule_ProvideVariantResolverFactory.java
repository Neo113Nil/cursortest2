package com.paypal.oslo.feature.onboarding.di;

/* loaded from: classes13.dex */
public final class VariantModule_ProvideVariantResolverFactory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private VariantModule_ProvideVariantResolverFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver get() {
        return provideVariantResolver(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.di.VariantModule_ProvideVariantResolverFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.onboarding.di.VariantModule_ProvideVariantResolverFactory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver provideVariantResolver(android.content.Context context) {
        return (com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.onboarding.di.VariantModule.INSTANCE.provideVariantResolver(context));
    }
}
