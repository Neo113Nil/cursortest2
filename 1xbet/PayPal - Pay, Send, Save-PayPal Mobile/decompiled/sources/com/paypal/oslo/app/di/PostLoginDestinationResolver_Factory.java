package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class PostLoginDestinationResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.di.PostLoginDestinationResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private PostLoginDestinationResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.di.PostLoginDestinationResolver get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.app.di.PostLoginDestinationResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.app.di.PostLoginDestinationResolver_Factory(provider);
    }

    public static com.paypal.oslo.app.di.PostLoginDestinationResolver newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.app.di.PostLoginDestinationResolver(featureGate);
    }
}
