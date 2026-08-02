package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

/* loaded from: classes15.dex */
public final class CardResumedNotifier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer> getHighResolutionOutputSizeshNQ4ISI;

    private CardResumedNotifier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier newInstance(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer cardTokenResumer) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier(cardTokenResumer);
    }
}
