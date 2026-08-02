package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class CreateChatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> Camera2StreamConfigurationMap;

    private CreateChatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase(chatRepository);
    }
}
