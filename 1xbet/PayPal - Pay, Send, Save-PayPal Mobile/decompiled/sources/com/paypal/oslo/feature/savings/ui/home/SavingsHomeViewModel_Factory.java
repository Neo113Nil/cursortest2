package com.paypal.oslo.feature.savings.ui.home;

/* loaded from: classes14.dex */
public final class SavingsHomeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase> getInputSizeshNQ4ISI;

    private SavingsHomeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer> provider8) {
        this.getInputFormats = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel get() {
        return newInstance(this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer> provider8) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel newInstance(com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase getCachedGoalsUseCase, com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase updateTaxStatementDeliveryPreferenceUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase getGoalSuccessStatusUseCase, com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase shouldAutoShowTaxPreferencePromptUseCase, com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase markTaxPreferencePromptShownUseCase, com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer savingsHomeReducer) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel(savingsFeatureManager, getSavingsHubDataUseCase, getCachedGoalsUseCase, updateTaxStatementDeliveryPreferenceUseCase, getGoalSuccessStatusUseCase, shouldAutoShowTaxPreferencePromptUseCase, markTaxPreferencePromptShownUseCase, savingsHomeReducer);
    }
}
