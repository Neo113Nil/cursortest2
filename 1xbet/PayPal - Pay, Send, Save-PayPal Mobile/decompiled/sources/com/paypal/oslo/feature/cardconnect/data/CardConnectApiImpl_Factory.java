package com.paypal.oslo.feature.cardconnect.data;

/* loaded from: classes11.dex */
public final class CardConnectApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher> getHighSpeedVideoSizes;

    private CardConnectApiImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher> provider3) {
        return new com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl newInstance(com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase checkCardConnectEligibilityUseCase, com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase cardConnectCreateSessionUseCase, com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher knotSDKLauncher) {
        return new com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl(checkCardConnectEligibilityUseCase, cardConnectCreateSessionUseCase, knotSDKLauncher);
    }
}
