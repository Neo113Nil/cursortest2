package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

/* loaded from: classes15.dex */
public final class CardAddedNotifier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> getHighSpeedVideoSizes;

    private CardAddedNotifier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier(getCardUseCase, getCardMetaDataUseCase, cardSynchronizer);
    }
}
