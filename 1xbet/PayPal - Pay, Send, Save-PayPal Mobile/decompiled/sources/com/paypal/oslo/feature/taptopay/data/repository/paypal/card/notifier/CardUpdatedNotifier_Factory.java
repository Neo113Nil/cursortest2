package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

/* loaded from: classes15.dex */
public final class CardUpdatedNotifier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> getHighSpeedVideoFpsRangesFor;

    private CardUpdatedNotifier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier(getCardMetaDataUseCase, cardSynchronizer);
    }
}
