package com.paypal.oslo.feature.savings.ui.goals.editgoal;

/* loaded from: classes14.dex */
public final class SavingsEditGoalViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer> getHighSpeedVideoSizes;

    private SavingsEditGoalViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider3) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase updateMoneyboxUseCase, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer savingsEditGoalReducer, com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel(updateMoneyboxUseCase, savingsEditGoalReducer, goalsFieldValidator);
    }
}
