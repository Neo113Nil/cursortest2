package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel;

/* loaded from: classes15.dex */
public final class MainMenuViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuGroupMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private MainMenuViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuGroupMapper> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuGroupMapper> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetMenuItemsUseCase getMenuItemsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuGroupMapper menuGroupMapper, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel(getMenuItemsUseCase, menuGroupMapper, appNavigator);
    }
}
