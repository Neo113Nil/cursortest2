package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

/* loaded from: classes15.dex */
public final class CategorySelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase> getHighSpeedVideoFpsRanges;

    private CategorySelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getCategorySelectionUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase confirmCategoryUseCase) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel(getCategorySelectionUseCase, confirmCategoryUseCase);
    }
}
