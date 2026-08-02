package com.paypal.oslo.core.network.sse.domain.usecase;

/* loaded from: classes10.dex */
public final class SubscribeToSseUseCase_Factory<T> implements dagger.internal.Factory<com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.SseParser<T>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.repository.SseRepository> getHighSpeedVideoFpsRangesFor;

    private SubscribeToSseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.repository.SseRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.SseParser<T>> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static <T> com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase_Factory<T> create(dagger.internal.Provider<com.paypal.oslo.core.network.sse.domain.repository.SseRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.SseParser<T>> provider2) {
        return new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase_Factory<>(provider, provider2);
    }

    public static <T> com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> newInstance(com.paypal.oslo.core.network.sse.domain.repository.SseRepository sseRepository, com.paypal.oslo.core.network.sse.SseParser<T> sseParser) {
        return new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<>(sseRepository, sseParser);
    }
}
