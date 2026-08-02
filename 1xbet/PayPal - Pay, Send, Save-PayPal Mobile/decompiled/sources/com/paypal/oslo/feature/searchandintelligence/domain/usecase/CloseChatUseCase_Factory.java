package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class CloseChatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> getHighSpeedVideoFpsRanges;

    private CloseChatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase(chatRepository);
    }
}
