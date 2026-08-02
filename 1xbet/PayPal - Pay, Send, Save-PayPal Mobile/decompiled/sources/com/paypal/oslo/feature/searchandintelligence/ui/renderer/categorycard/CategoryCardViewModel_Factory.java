package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

/* loaded from: classes14.dex */
public final class CategoryCardViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> getHighSpeedVideoSizes;

    private CategoryCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel newInstance(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel(searchAndIntelligence);
    }
}
