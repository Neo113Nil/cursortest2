package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

/* loaded from: classes15.dex */
public final class CardDeletedNotifier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser> getHighSpeedVideoFpsRangesFor;

    private CardDeletedNotifier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier newInstance(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenCloser cardTokenCloser) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier(cardTokenCloser);
    }
}
