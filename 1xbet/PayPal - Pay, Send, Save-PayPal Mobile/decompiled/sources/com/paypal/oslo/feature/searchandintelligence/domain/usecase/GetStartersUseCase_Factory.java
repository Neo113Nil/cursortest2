package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class GetStartersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> getHighSpeedVideoSizes;

    private GetStartersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository startersRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase(startersRepository);
    }
}
