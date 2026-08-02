package com.paypal.oslo.feature.searchandintelligence.ui;

/* loaded from: classes14.dex */
public final class ChatViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> getInputFormats;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlin.time.TimeSource> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer> getOutputMinFrameDuration;

    private ChatViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider4, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> provider5, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase> provider6, dagger.internal.Provider<kotlin.time.TimeSource> provider7, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker> provider8, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer> provider9, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider10) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getInputFormats = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getOutputFormats = provider7;
        this.getHighSpeedVideoSizes = provider8;
        this.getOutputMinFrameDuration = provider9;
        this.getInputSizeshNQ4ISI = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getInputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider4, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> provider5, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase> provider6, dagger.internal.Provider<kotlin.time.TimeSource> provider7, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker> provider8, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer> provider9, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider10) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel newInstance(com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase createChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase subscribeToChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase closeChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence, com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager searchAndIntelligenceConfigManager, com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getStartersUseCase, kotlin.time.TimeSource timeSource, com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer chatReducer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel(createChatUseCase, subscribeToChatUseCase, closeChatUseCase, internalSearchAndIntelligence, searchAndIntelligenceConfigManager, getStartersUseCase, timeSource, chatMetricsTracker, chatReducer, coroutineDispatcher);
    }
}
