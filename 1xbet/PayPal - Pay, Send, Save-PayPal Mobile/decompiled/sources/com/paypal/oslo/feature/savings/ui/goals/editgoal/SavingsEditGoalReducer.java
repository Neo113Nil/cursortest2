package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalState;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "goalsFieldValidator", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalState;Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;)Larrow/core/Either;", "p0", "p1", "p2", "p3", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsEditGoalReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SavingsEditGoalReducer(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsFieldValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = goalsFieldValidator;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SavingsEditGoalReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect>> reduce(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState state, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent event) {
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy2;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen showServiceUnavailableScreen;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy3;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy4;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy5;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy6;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy7;
        java.lang.String amount;
        java.lang.String str;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy8;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState copy9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged)) {
            if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.BackClicked.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.NavigateBack.INSTANCE);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked.INSTANCE)) {
                    if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult)) {
                        if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError)) {
                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult) event).isDuplicate()) {
                                copy2 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName.INSTANCE, (r20 & 256) != 0 ? state.targetAmountError : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                            }
                            copy = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : true, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                        }
                        com.paypal.oslo.feature.savings.domain.model.SavingsError error = ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError) event).getError();
                        if (error instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                            showServiceUnavailableScreen = com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowNetworkErrorScreen.INSTANCE;
                        } else {
                            if (!(error instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) && !(error instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            showServiceUnavailableScreen = com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen.INSTANCE;
                        }
                        com.paypal.oslo.core.mvi.UiEffect uiEffect = showServiceUnavailableScreen;
                        copy3 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy3, uiEffect);
                    }
                    if (((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult) event).getResult().getSuccess()) {
                        copy5 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy5, new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated(state.getGoalName()));
                    }
                    copy4 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy4, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen.INSTANCE);
                }
                com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateGoalName = this.getHighResolutionOutputSizeshNQ4ISI.validateGoalName(state.getGoalName());
                com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateTargetAmount = this.getHighResolutionOutputSizeshNQ4ISI.validateTargetAmount(state.getTargetAmount(), state.getOriginalTargetAmount());
                if (validateGoalName != null || validateTargetAmount != null) {
                    copy6 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : validateGoalName, (r20 & 256) != 0 ? state.targetAmountError : validateTargetAmount);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                }
                copy7 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : false, (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
            }
            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged targetAmountChanged = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged) event;
            if (targetAmountChanged.getAmount().length() == 0) {
                str = "";
            } else {
                if (kotlin.text.StringsKt.toLongOrNull(targetAmountChanged.getAmount()) == null) {
                    amount = state.getTargetAmount();
                } else {
                    long parseLong = java.lang.Long.parseLong(targetAmountChanged.getAmount());
                    double d = parseLong / 100.0d;
                    java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(state.getTargetAmount());
                    long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
                    boolean z = d <= 100000.0d;
                    boolean z2 = parseLong < longValue;
                    if (z || z2) {
                        amount = targetAmountChanged.getAmount();
                    } else {
                        amount = state.getTargetAmount();
                    }
                }
                str = amount;
            }
            copy8 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : null, (r20 & 4) != 0 ? state.targetAmount : str, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : getHighSpeedVideoFpsRanges(state.getGoalName(), str, state.getOriginalGoalName(), state.getOriginalTargetAmount()), (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
        }
        java.lang.String goalName = ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged) event).getGoalName();
        copy9 = state.copy((r20 & 1) != 0 ? state.goalId : null, (r20 & 2) != 0 ? state.goalName : goalName, (r20 & 4) != 0 ? state.targetAmount : null, (r20 & 8) != 0 ? state.originalGoalName : null, (r20 & 16) != 0 ? state.originalTargetAmount : null, (r20 & 32) != 0 ? state.isLoading : false, (r20 & 64) != 0 ? state.isSaveEnabled : getHighSpeedVideoFpsRanges(goalName, state.getTargetAmount(), state.getOriginalGoalName(), state.getOriginalTargetAmount()), (r20 & 128) != 0 ? state.validationError : null, (r20 & 256) != 0 ? state.targetAmountError : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        return (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(p0).toString(), kotlin.text.StringsKt.trim(p2).toString()) && kotlin.jvm.internal.Intrinsics.areEqual(p1, p3)) ? false : true;
    }
}
