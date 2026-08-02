package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetMenuItemsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository> Camera2StreamConfigurationMap;

    private GetMenuItemsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository menuRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase(menuRepository);
    }
}
