package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "goalsFieldValidator", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;)Larrow/core/Either;", "", "p0", "p1", "", "Camera2StreamConfigurationMap", "(ILjava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsCreateGoalReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SavingsCreateGoalReducer(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsFieldValidator, "");
        this.getHighSpeedVideoFpsRangesFor = goalsFieldValidator;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SavingsCreateGoalReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect>> reduce(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState state, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent event) {
        double doubleValue;
        int value;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy2;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy3;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy4;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy5;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy6;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy7;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy8;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy9;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy10;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy11;
        java.lang.String amount;
        java.lang.String str;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy12;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged)) {
            if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged)) {
                if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected)) {
                    if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged)) {
                        if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.BackClicked.INSTANCE)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.ReviewClicked.INSTANCE)) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencyCardClicked.INSTANCE)) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.OtherAmountClicked.INSTANCE)) {
                                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave)) {
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountCancel.INSTANCE)) {
                                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountDisplayClicked.INSTANCE)) {
                                                        if (!(event instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult)) {
                                                            throw new kotlin.NoWhenBranchMatchedException();
                                                        }
                                                        if (!((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult) event).isDuplicate()) {
                                                            int selectedAmountIndex = state.getSelectedAmountIndex();
                                                            java.lang.String customAmount = state.getCustomAmount();
                                                            if (selectedAmountIndex == com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.TEN.ordinal()) {
                                                                value = com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.TEN.getValue();
                                                            } else if (selectedAmountIndex == com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.FIFTY.ordinal()) {
                                                                value = com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.FIFTY.getValue();
                                                            } else {
                                                                if (selectedAmountIndex != com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.ONE_FIFTY.ordinal()) {
                                                                    java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(customAmount);
                                                                    doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
                                                                    double d = doubleValue;
                                                                    copy = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy, new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview(state.getGoalName(), state.getTargetAmount(), d, state.getFrequencyState()));
                                                                }
                                                                value = com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.ONE_FIFTY.getValue();
                                                            }
                                                            doubleValue = value;
                                                            double d2 = doubleValue;
                                                            copy = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy, new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview(state.getGoalName(), state.getTargetAmount(), d2, state.getFrequencyState()));
                                                        }
                                                        copy2 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName.INSTANCE, (r22 & 512) != 0 ? state.targetAmountError : null);
                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                                                    }
                                                    copy3 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : true, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                                                }
                                                copy4 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                                            }
                                            com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave customAmountSave = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave) event;
                                            int ordinal = com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.OTHER.ordinal();
                                            java.lang.String trimStart = kotlin.text.StringsKt.trimStart(customAmountSave.getAmount(), com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            copy5 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : ordinal, (r22 & 8) != 0 ? state.customAmount : trimStart.length() != 0 ? trimStart : "", (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.OTHER.ordinal(), customAmountSave.getAmount()), (r22 & 64) != 0 ? state.showCustomAmountDisplay : true, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                                        }
                                        copy6 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.OTHER.ordinal(), (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : true, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                }
                                com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateGoalName = this.getHighSpeedVideoFpsRangesFor.validateGoalName(state.getGoalName());
                                com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateTargetAmount$default = com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator.validateTargetAmount$default(this.getHighSpeedVideoFpsRangesFor, state.getTargetAmount(), null, 2, null);
                                if (validateGoalName != null || validateTargetAmount$default != null) {
                                    copy7 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : validateGoalName, (r22 & 512) != 0 ? state.targetAmountError : validateTargetAmount$default);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
                                }
                                copy8 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateBack.INSTANCE);
                        }
                        copy9 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected) event).getFrequencyState(), (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
                    }
                    com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged customAmountChanged = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged) event;
                    copy10 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : customAmountChanged.getAmount(), (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : Camera2StreamConfigurationMap(state.getSelectedAmountIndex(), customAmountChanged.getAmount()), (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
                }
                com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected amountSelected = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected) event;
                copy11 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : amountSelected.getIndex(), (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : Camera2StreamConfigurationMap(amountSelected.getIndex(), state.getCustomAmount()), (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
            }
            com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged targetAmountChanged = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged) event;
            if (targetAmountChanged.getAmount().length() == 0) {
                str = "";
            } else {
                if (kotlin.text.StringsKt.toLongOrNull(targetAmountChanged.getAmount()) == null) {
                    amount = state.getTargetAmount();
                } else {
                    long parseLong = java.lang.Long.parseLong(targetAmountChanged.getAmount());
                    double d3 = parseLong / 100.0d;
                    java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(state.getTargetAmount());
                    long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
                    boolean z = d3 <= 100000.0d;
                    boolean z2 = parseLong < longValue;
                    if (z || z2) {
                        amount = targetAmountChanged.getAmount();
                    } else {
                        amount = state.getTargetAmount();
                    }
                }
                str = amount;
            }
            copy12 = state.copy((r22 & 1) != 0 ? state.goalName : null, (r22 & 2) != 0 ? state.targetAmount : str, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : false, (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy12, null, 2, null);
        }
        java.lang.String goalName = ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged) event).getGoalName();
        if (goalName.length() > 127) {
            goalName = goalName.substring(0, 127);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goalName, "");
        }
        copy13 = state.copy((r22 & 1) != 0 ? state.goalName : goalName, (r22 & 2) != 0 ? state.targetAmount : null, (r22 & 4) != 0 ? state.selectedAmountIndex : 0, (r22 & 8) != 0 ? state.customAmount : null, (r22 & 16) != 0 ? state.frequencyState : null, (r22 & 32) != 0 ? state.isReviewEnabled : Camera2StreamConfigurationMap(state.getSelectedAmountIndex(), state.getCustomAmount()), (r22 & 64) != 0 ? state.showCustomAmountDisplay : false, (r22 & 128) != 0 ? state.isShowingCustomAmountInput : false, (r22 & 256) != 0 ? state.validationError : null, (r22 & 512) != 0 ? state.targetAmountError : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy13, null, 2, null);
    }

    private static boolean Camera2StreamConfigurationMap(int p0, java.lang.String p1) {
        if (p0 == com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.OTHER.ordinal()) {
            return (kotlin.text.StringsKt.isBlank(p1) || kotlin.text.StringsKt.toDoubleOrNull(p1) == null) ? false : true;
        }
        return true;
    }
}
