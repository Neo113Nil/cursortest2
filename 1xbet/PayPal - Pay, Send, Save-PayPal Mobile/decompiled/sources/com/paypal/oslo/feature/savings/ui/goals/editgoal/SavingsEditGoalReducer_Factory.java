package com.paypal.oslo.feature.savings.ui.goals.editgoal;

/* loaded from: classes14.dex */
public final class SavingsEditGoalReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> Camera2StreamConfigurationMap;

    private SavingsEditGoalReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> provider) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer newInstance(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer(goalsFieldValidator);
    }
}
