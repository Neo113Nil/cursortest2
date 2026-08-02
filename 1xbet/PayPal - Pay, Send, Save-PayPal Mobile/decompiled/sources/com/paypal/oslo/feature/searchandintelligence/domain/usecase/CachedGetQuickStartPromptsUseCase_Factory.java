package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class CachedGetQuickStartPromptsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private CachedGetQuickStartPromptsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase getQuickStartPromptsUseCase, com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache quickStartPromptsCache) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase(getQuickStartPromptsUseCase, quickStartPromptsCache);
    }
}
