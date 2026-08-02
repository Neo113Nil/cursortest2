package com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess;

/* loaded from: classes14.dex */
public final class GoalSuccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase> getHighSpeedVideoSizes;

    private GoalSuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase> provider) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.UpdateGoalSuccessShownUseCase updateGoalSuccessShownUseCase) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel(updateGoalSuccessShownUseCase);
    }
}
