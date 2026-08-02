package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase;

/* loaded from: classes15.dex */
public final class ConfirmCategoryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository> Camera2StreamConfigurationMap;

    private ConfirmCategoryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository categoryConfirmationRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase(categoryConfirmationRepository);
    }
}
