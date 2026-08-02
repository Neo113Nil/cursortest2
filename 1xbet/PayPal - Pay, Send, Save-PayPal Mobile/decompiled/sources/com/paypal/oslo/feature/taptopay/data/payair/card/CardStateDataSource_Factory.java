package com.paypal.oslo.feature.taptopay.data.payair.card;

/* loaded from: classes15.dex */
public final class CardStateDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private CardStateDataSource_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource newInstance(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource(sdkTokenManager, coroutineDispatcher);
    }
}
