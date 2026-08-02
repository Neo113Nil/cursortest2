package com.paypal.oslo.feature.wallet.cards.ui.scan;

/* loaded from: classes15.dex */
public final class CardScanViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private CardScanViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<java.lang.String> provider3, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<java.lang.String> provider3, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5) {
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel newInstance(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel(context, coroutineDispatcher, str, appStorage, appNavigator);
    }
}
