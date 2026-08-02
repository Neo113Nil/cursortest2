package com.paypal.oslo.feature.savings.ui.goals.creategoal;

/* loaded from: classes14.dex */
public final class SavingsCreateGoalViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> getHighSpeedVideoFpsRangesFor;

    private SavingsCreateGoalViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider2) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel newInstance(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer savingsCreateGoalReducer, com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel(savingsCreateGoalReducer, goalsFieldValidator);
    }
}
