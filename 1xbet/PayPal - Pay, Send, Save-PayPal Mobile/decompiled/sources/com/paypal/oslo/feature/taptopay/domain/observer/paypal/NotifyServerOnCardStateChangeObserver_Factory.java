package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

/* loaded from: classes15.dex */
public final class NotifyServerOnCardStateChangeObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> getHighSpeedVideoSizes;

    private NotifyServerOnCardStateChangeObserver_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver(payPalObserveCardStateUseCase, payPalCardRepository);
    }
}
