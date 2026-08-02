package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalReducer;", "reducer", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "goalsFieldValidator", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalReducer;Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;)V", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalReducer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsCreateGoalViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState> uiState;

    @javax.inject.Inject
    public SavingsCreateGoalViewModel(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalReducer savingsCreateGoalReducer, com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsCreateGoalReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsFieldValidator, "");
        this.Camera2StreamConfigurationMap = savingsCreateGoalReducer;
        this.getHighSpeedVideoFpsRanges = goalsFieldValidator;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("SavingsCreateGoalViewModel.store", com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState.INSTANCE.getInitial(), savingsCreateGoalReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent>() { // from class: com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.ReviewClicked) {
                    com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState second = input.getStates().getSecond();
                    if (second.getValidationError() == null && second.getTargetAmountError() == null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.this, second, input, null), 3, null);
                    }
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$validateDuplicateName(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel savingsCreateGoalViewModel, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1 savingsCreateGoalViewModel$validateDuplicateName$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1) {
            savingsCreateGoalViewModel$validateDuplicateName$1 = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1) continuation;
            if ((savingsCreateGoalViewModel$validateDuplicateName$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsCreateGoalViewModel$validateDuplicateName$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1 savingsCreateGoalViewModel$validateDuplicateName$12 = savingsCreateGoalViewModel$validateDuplicateName$1;
                java.lang.Object obj = savingsCreateGoalViewModel$validateDuplicateName$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsCreateGoalViewModel$validateDuplicateName$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator = savingsCreateGoalViewModel.getHighSpeedVideoFpsRanges;
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(str).toString();
                    savingsCreateGoalViewModel$validateDuplicateName$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsCreateGoalViewModel$validateDuplicateName$12.getHighResolutionOutputSizeshNQ4ISI = function1;
                    savingsCreateGoalViewModel$validateDuplicateName$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator.isDuplicateGoalName$default(goalsFieldValidator, obj2, null, savingsCreateGoalViewModel$validateDuplicateName$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) savingsCreateGoalViewModel$validateDuplicateName$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult(((java.lang.Boolean) obj).booleanValue()));
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsCreateGoalViewModel$validateDuplicateName$1 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1(savingsCreateGoalViewModel, continuation);
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1 savingsCreateGoalViewModel$validateDuplicateName$122 = savingsCreateGoalViewModel$validateDuplicateName$1;
        java.lang.Object obj3 = savingsCreateGoalViewModel$validateDuplicateName$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsCreateGoalViewModel$validateDuplicateName$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult(((java.lang.Boolean) obj3).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processIntent(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(intent);
    }
}
