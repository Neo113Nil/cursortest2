package com.paypal.oslo.feature.home.data;

/* loaded from: classes12.dex */
public final class ResourceRewardsStringProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private ResourceRewardsStringProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider(context);
    }
}
