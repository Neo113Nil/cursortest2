package com.paypal.oslo.feature.activity.domain.usecase.search;

/* loaded from: classes10.dex */
public final class ActivitySuggestionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ActivitySuggestionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase newInstance(com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository iActivitySearchRepository) {
        return new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase(iActivitySearchRepository);
    }
}
