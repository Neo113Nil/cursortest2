package com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard;

/* loaded from: classes14.dex */
public final class ProductCardCarouselViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ProductCardCarouselViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider, dagger.internal.Provider<android.content.Context> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence> provider, dagger.internal.Provider<android.content.Context> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel newInstance(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence, android.content.Context context) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel(searchAndIntelligence, context);
    }
}
