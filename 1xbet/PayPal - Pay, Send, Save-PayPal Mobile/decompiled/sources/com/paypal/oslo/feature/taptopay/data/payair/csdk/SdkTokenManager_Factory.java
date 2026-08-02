package com.paypal.oslo.feature.taptopay.data.payair.csdk;

/* loaded from: classes15.dex */
public final class SdkTokenManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> {
    private final dagger.internal.Provider<com.payair.logic.managers.SetupManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoSizes;

    private SdkTokenManager_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager newInstance(com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.SetupManager setupManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager(tokenManager, setupManager, coroutineDispatcher);
    }
}
