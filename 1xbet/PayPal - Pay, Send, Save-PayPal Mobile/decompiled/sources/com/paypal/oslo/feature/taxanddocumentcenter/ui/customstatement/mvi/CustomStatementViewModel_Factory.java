package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

/* loaded from: classes15.dex */
public final class CustomStatementViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementReducer> getHighSpeedVideoSizes;

    private CustomStatementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase> provider4) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase getCustomStatementOptionsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementReducer customStatementReducer, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase requestStatementUseCase) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel(getCustomStatementOptionsUseCase, customStatementReducer, getUserInfoUseCase, requestStatementUseCase);
    }
}
