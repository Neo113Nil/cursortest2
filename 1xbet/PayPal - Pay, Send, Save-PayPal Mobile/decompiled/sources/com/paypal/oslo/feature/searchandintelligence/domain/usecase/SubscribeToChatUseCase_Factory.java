package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class SubscribeToChatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> getHighSpeedVideoFpsRanges;

    private SubscribeToChatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase(chatRepository);
    }
}
