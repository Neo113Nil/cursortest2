package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

/* loaded from: classes14.dex */
public final class SavingsGoalDetailsReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer_Factory create() {
        return com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer newInstance() {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
