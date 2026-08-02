package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class GetQuickStartPromptsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetQuickStartPromptsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository startersRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase(startersRepository);
    }
}
