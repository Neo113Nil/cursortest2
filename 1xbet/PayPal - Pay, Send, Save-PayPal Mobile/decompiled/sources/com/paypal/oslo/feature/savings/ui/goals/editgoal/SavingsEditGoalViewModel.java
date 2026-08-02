package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020 0#8G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0'8G¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateMoneyboxUseCase;", "updateMoneyboxUseCase", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalReducer;", "reducer", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "goalsFieldValidator", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateMoneyboxUseCase;Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalReducer;Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;)V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "", "initialize", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "intent", "processIntent", "(Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;)V", "Lkotlin/Function1;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateMoneyboxUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalState;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsEditGoalViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase getHighSpeedVideoSizes;
    private com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SavingsEditGoalViewModel(com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase updateMoneyboxUseCase, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalReducer savingsEditGoalReducer, com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsFieldValidator, "");
        this.getHighSpeedVideoSizes = updateMoneyboxUseCase;
        this.getHighSpeedVideoFpsRangesFor = savingsEditGoalReducer;
        this.Camera2StreamConfigurationMap = goalsFieldValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$validateDuplicateNameAndSave(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$validateDuplicateNameAndSave$1 savingsEditGoalViewModel$validateDuplicateNameAndSave$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$validateDuplicateNameAndSave$1) {
            savingsEditGoalViewModel$validateDuplicateNameAndSave$1 = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$validateDuplicateNameAndSave$1) continuation;
            if ((savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator = savingsEditGoalViewModel.Camera2StreamConfigurationMap;
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(str2).toString();
                    savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsEditGoalViewModel$validateDuplicateNameAndSave$1.Camera2StreamConfigurationMap = function1;
                    savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRanges = 1;
                    obj = goalsFieldValidator.isDuplicateGoalName(obj2, str, savingsEditGoalViewModel$validateDuplicateNameAndSave$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) savingsEditGoalViewModel$validateDuplicateNameAndSave$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult(((java.lang.Boolean) obj).booleanValue()));
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsEditGoalViewModel$validateDuplicateNameAndSave$1 = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$validateDuplicateNameAndSave$1(savingsEditGoalViewModel, continuation);
        java.lang.Object obj3 = savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsEditGoalViewModel$validateDuplicateNameAndSave$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult(((java.lang.Boolean) obj3).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public final void initialize(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = goal;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount = goal.getTargetAmount();
        java.lang.String dollarsToCents = (targetAmount == null || (value = targetAmount.getValue()) == null) ? null : com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.INSTANCE.dollarsToCents(value);
        java.lang.String str = dollarsToCents == null ? "" : dollarsToCents;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.mvi.MviStateStore<>("SavingsEditGoalViewModel.store", new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState(goal.getId(), goal.getTitle(), str, goal.getTitle(), str, false, false, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, null), this.getHighSpeedVideoFpsRangesFor, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent>() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked) {
                    com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState second = input.getStates().getSecond();
                    if (second.getValidationError() == null && second.getTargetAmountError() == null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.this, second, input, null), 3, null);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult) {
                    com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent event2 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event2, "");
                    if (((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult) event2).isDuplicate()) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$2(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.this, input, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$updateGoal$1 savingsEditGoalViewModel$updateGoal$1;
        int i;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$updateGoal$1) {
            savingsEditGoalViewModel$updateGoal$1 = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$updateGoal$1) continuation;
            if ((savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState value = getUiState().getValue();
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = null;
                    if (!kotlin.text.StringsKt.isBlank(value.getTargetAmount())) {
                        try {
                            money = new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.INSTANCE.centsToDollars(value.getTargetAmount()));
                        } catch (java.lang.NumberFormatException unused) {
                        }
                        com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase updateMoneyboxUseCase = this.getHighSpeedVideoSizes;
                        goalSummaryDTO = this.getHighSpeedVideoFpsRanges;
                        if (goalSummaryDTO != null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            goalSummaryDTO2 = goalSummaryDTO;
                        }
                        java.lang.String obj2 = kotlin.text.StringsKt.trim(value.getGoalName()).toString();
                        savingsEditGoalViewModel$updateGoal$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                        savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                        savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap = 1;
                        obj = updateMoneyboxUseCase.invoke(goalSummaryDTO2, obj2, money, savingsEditGoalViewModel$updateGoal$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    money = null;
                    com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxUseCase updateMoneyboxUseCase2 = this.getHighSpeedVideoSizes;
                    goalSummaryDTO = this.getHighSpeedVideoFpsRanges;
                    if (goalSummaryDTO != null) {
                    }
                    java.lang.String obj22 = kotlin.text.StringsKt.trim(value.getGoalName()).toString();
                    savingsEditGoalViewModel$updateGoal$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                    savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap = 1;
                    obj = updateMoneyboxUseCase2.invoke(goalSummaryDTO2, obj22, money, savingsEditGoalViewModel$updateGoal$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) savingsEditGoalViewModel$updateGoal$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult((com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError((com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsEditGoalViewModel$updateGoal$1 = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$updateGoal$1(this, continuation);
        java.lang.Object obj3 = savingsEditGoalViewModel$updateGoal$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsEditGoalViewModel$updateGoal$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> getUiEffect() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mviStateStore != null) {
            return mviStateStore.getUiEffect();
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState> getUiState() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mviStateStore != null) {
            return mviStateStore.getUiState();
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }

    public final void processIntent(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect> mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mviStateStore != null) {
            mviStateStore.onEvent(intent);
            return;
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }
}
