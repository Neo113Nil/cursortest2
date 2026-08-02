package com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase;

/* loaded from: classes15.dex */
public final class StringResourceProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private StringResourceProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider(context);
    }
}
