package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

/* loaded from: classes15.dex */
public final class CardSuspendedNotifier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender> getHighResolutionOutputSizeshNQ4ISI;

    private CardSuspendedNotifier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier newInstance(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender cardTokenSuspender) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier(cardTokenSuspender);
    }
}
