package com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem;

/* loaded from: classes14.dex */
public final class CommerceItemProductDetailsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> getHighResolutionOutputSizeshNQ4ISI;

    private CommerceItemProductDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel newInstance(com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase getCommerceItemVariantsUseCase, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel(getCommerceItemVariantsUseCase, internalSearchAndIntelligence);
    }
}
