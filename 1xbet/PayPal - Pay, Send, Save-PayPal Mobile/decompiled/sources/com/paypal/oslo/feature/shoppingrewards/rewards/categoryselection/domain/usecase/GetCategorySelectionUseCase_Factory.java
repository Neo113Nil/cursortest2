package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCategorySelectionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetCategorySelectionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository categorySelectionRepository, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase(categorySelectionRepository, stringResourceProvider);
    }
}
