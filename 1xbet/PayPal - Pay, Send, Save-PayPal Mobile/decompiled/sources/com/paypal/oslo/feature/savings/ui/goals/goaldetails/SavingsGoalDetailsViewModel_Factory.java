package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

/* loaded from: classes14.dex */
public final class SavingsGoalDetailsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer> getHighSpeedVideoSizes;

    private SavingsGoalDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer> provider4) {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase deleteMoneyboxUseCase, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer savingsGoalDetailsReducer) {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel(getSavingsHubDataUseCase, deleteMoneyboxUseCase, savingsFeatureManager, savingsGoalDetailsReducer);
    }
}
