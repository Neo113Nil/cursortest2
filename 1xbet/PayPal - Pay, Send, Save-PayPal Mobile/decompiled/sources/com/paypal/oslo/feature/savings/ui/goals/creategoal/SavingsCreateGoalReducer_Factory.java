package com.paypal.oslo.feature.savings.ui.goals.creategoal;

/* loaded from: classes14.dex */
public final class SavingsCreateGoalReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> getHighSpeedVideoFpsRangesFor;

    private SavingsCreateGoalReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer newInstance(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer(goalsFieldValidator);
    }
}
