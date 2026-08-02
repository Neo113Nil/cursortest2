package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

/* loaded from: classes14.dex */
public final class QuickStartPromptViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> getHighSpeedVideoFpsRanges;

    private QuickStartPromptViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel newInstance(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel(searchAndIntelligence);
    }
}
