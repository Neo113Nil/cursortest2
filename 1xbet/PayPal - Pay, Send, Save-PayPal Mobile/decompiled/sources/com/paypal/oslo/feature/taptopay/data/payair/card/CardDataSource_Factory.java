package com.paypal.oslo.feature.taptopay.data.payair.card;

/* loaded from: classes15.dex */
public final class CardDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private CardDataSource_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource newInstance(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource(sdkTokenManager, coroutineDispatcher);
    }
}
