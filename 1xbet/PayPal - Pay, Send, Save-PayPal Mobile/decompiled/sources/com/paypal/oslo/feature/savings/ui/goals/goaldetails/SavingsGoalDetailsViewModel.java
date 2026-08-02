package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0011J,\u0010(\u001a\u00020\u00172\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170*2\b\b\u0002\u0010+\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J*\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00102\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170*H\u0082@¢\u0006\u0002\u00100J*\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00102\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170*H\u0082@¢\u0006\u0002\u00100J<\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170*2\b\b\u0002\u00106\u001a\u00020,H\u0082@¢\u0006\u0002\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getSavingsHubDataUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;", "deleteMoneyboxUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/DeleteMoneyboxUseCase;", "featureManager", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "reducer", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsReducer;", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/DeleteMoneyboxUseCase;Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsReducer;)V", "initialGoal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "_store", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "getStore", "()Lcom/paypal/oslo/core/mvi/MviStateStore;", "initialize", "", "goal", "getInitialGoal", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "processIntent", "intent", "sideEffectsMiddleware", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "getSideEffectsMiddleware", "()Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "fetchGoalData", "eventDispatcher", "Lkotlin/Function1;", "isActivityRefreshRequired", "", "(Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeleteGoalConfirmed", "state", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeleteAfterTransfer", "deleteGoal", "goalId", "", "goalName", "isAfterTransfer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savings_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsGoalDetailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase Camera2StreamConfigurationMap;
    private com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase getHighSpeedVideoFpsRangesFor;
    private com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer getInputSizeshNQ4ISI;

    @javax.inject.Inject
    public SavingsGoalDetailsViewModel(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase deleteMoneyboxUseCase, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsReducer savingsGoalDetailsReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsHubDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneyboxUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsGoalDetailsReducer, "");
        this.Camera2StreamConfigurationMap = getSavingsHubDataUseCase;
        this.getHighSpeedVideoFpsRangesFor = deleteMoneyboxUseCase;
        this.getHighSpeedVideoFpsRanges = savingsFeatureManager;
        this.getInputSizeshNQ4ISI = savingsGoalDetailsReducer;
    }

    public final void initialize(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = goal;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        if (this.getHighSpeedVideoSizes != null) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = goalSummaryDTO;
        if (goalSummaryDTO == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            goalSummaryDTO = null;
        }
        this.getHighSpeedVideoSizes = new com.paypal.oslo.core.mvi.MviStateStore<>("SavingsGoalDetailsViewModel.store", new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success(goalSummaryDTO, this.getHighSpeedVideoFpsRanges.isAddMoneyFeatureAvailable(), this.getHighSpeedVideoFpsRanges.isTransferMoneyFeatureAvailable(), false, false, null, false, null, null, null, false, false, null, false, this.getHighSpeedVideoFpsRanges.isSmartRouteEntryPointVisible(), 16376, null), this.getInputSizeshNQ4ISI, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent>() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent event = input.getEvent();
                if ((event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Initialize) || (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested) || (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalErrorDismissed)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel.this, input, null), 3, null);
                    return;
                }
                if ((event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess) || (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess) || (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RefreshGoal)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$2(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel.this, input, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$3(input, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalConfirmed) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$4(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel.this, input, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRetryRequested) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5(input, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel.this, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteCompleted) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$6(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel.this, input, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getInitialGoal() {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.getHighResolutionOutputSizeshNQ4ISI;
        if (goalSummaryDTO != null) {
            return goalSummaryDTO;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:65|66))(3:67|68|(1:70))|12|13|(6:15|(5:18|19|(3:21|22|23)(1:25)|24|16)|26|27|(3:29|(2:30|(4:32|(1:34)|35|(2:37|38)(1:40))(1:41))|39)|(1:43)(1:47))(2:48|(4:50|51|(1:53)(2:55|(1:57)(2:58|(1:60)(2:61|62)))|54)(2:63|64))|44|45))|81|6|7|(0)(0)|12|13|(0)(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0112, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        r8 = r8.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0117, code lost:
    
        if (r8 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0119, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011a, code lost:
    
        r7.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        r8 = r8.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0128, code lost:
    
        if (r8 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        r7.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error(r5));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: IllegalArgumentException -> 0x0112, IllegalStateException -> 0x0123, TRY_ENTER, TryCatch #2 {IllegalArgumentException -> 0x0112, IllegalStateException -> 0x0123, blocks: (B:11:0x002f, B:12:0x004d, B:15:0x0053, B:16:0x006c, B:18:0x0072, B:22:0x007a, B:27:0x007e, B:29:0x0088, B:30:0x0092, B:32:0x0098, B:34:0x00a7, B:35:0x00ad, B:39:0x00b8, B:43:0x00bc, B:47:0x00c6, B:50:0x00d5, B:53:0x00e1, B:54:0x00fd, B:57:0x00ec, B:60:0x00f7, B:61:0x0106, B:62:0x010b, B:63:0x010c, B:64:0x0111, B:68:0x003e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, kotlin.Unit> function1, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$fetchGoalData$1 savingsGoalDetailsViewModel$fetchGoalData$1;
        int i;
        arrow.core.Either either;
        java.lang.String message;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$fetchGoalData$1) {
            savingsGoalDetailsViewModel$fetchGoalData$1 = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$fetchGoalData$1) continuation;
            if ((savingsGoalDetailsViewModel$fetchGoalData$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                savingsGoalDetailsViewModel$fetchGoalData$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = savingsGoalDetailsViewModel$fetchGoalData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsGoalDetailsViewModel$fetchGoalData$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = null;
                java.lang.String str = "An error occurred";
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase = this.Camera2StreamConfigurationMap;
                    savingsGoalDetailsViewModel$fetchGoalData$1.Camera2StreamConfigurationMap = function1;
                    savingsGoalDetailsViewModel$fetchGoalData$1.getHighSpeedVideoSizes = z;
                    savingsGoalDetailsViewModel$fetchGoalData$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase.invoke$default(getSavingsHubDataUseCase, null, savingsGoalDetailsViewModel$fetchGoalData$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = savingsGoalDetailsViewModel$fetchGoalData$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) savingsGoalDetailsViewModel$fetchGoalData$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> tiles = ((com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult) ((arrow.core.Either.Right) either).getValue()).getTiles();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : tiles) {
                        if (obj2 instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) {
                            arrayList.add(obj2);
                        }
                    }
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                    if (goalZoneDTO != null) {
                        java.util.Iterator<T> it = goalZoneDTO.getGoals().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            java.lang.String id = ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) next).getId();
                            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (goalSummaryDTO2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                                goalSummaryDTO2 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(id, goalSummaryDTO2.getId())) {
                                goalSummaryDTO = next;
                                break;
                            }
                        }
                        goalSummaryDTO = goalSummaryDTO;
                    }
                    if (goalSummaryDTO != null) {
                        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult(goalSummaryDTO, z));
                    } else {
                        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error("Goal not found"));
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                    if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                        message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) savingsError).getMessage();
                    } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                        message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getMessage();
                    } else {
                        if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError) savingsError).getMessage();
                    }
                    function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error(message));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsGoalDetailsViewModel$fetchGoalData$1 = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$fetchGoalData$1(this, continuation);
        java.lang.Object obj3 = savingsGoalDetailsViewModel$fetchGoalData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsGoalDetailsViewModel$fetchGoalData$1.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = null;
        java.lang.String str2 = "An error occurred";
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, kotlin.Unit> function1, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$deleteGoal$1 savingsGoalDetailsViewModel$deleteGoal$1;
        int i;
        arrow.core.Either either;
        java.lang.String message;
        com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType.GenericError genericError;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$deleteGoal$1) {
            savingsGoalDetailsViewModel$deleteGoal$1 = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$deleteGoal$1) continuation;
            if ((savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase deleteMoneyboxUseCase = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory default_category = com.paypal.oslo.feature.savings.constants.SavingsConstants.MoneyboxDefaults.INSTANCE.getDEFAULT_CATEGORY();
                    savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsGoalDetailsViewModel$deleteGoal$1.Camera2StreamConfigurationMap = str2;
                    savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoSizes = function1;
                    savingsGoalDetailsViewModel$deleteGoal$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRanges = 1;
                    obj = deleteMoneyboxUseCase.invoke(str, default_category, savingsGoalDetailsViewModel$deleteGoal$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = savingsGoalDetailsViewModel$deleteGoal$1.getHighResolutionOutputSizeshNQ4ISI;
                    function1 = (kotlin.jvm.functions.Function1) savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) savingsGoalDetailsViewModel$deleteGoal$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess(str2));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                    if (z) {
                        genericError = com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType.TransferSuccessDeletionFailed.INSTANCE;
                    } else {
                        if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                            message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) savingsError).getMessage();
                        } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                            message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getMessage();
                        } else {
                            if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            message = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError) savingsError).getMessage();
                        }
                        genericError = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType.GenericError(message);
                    }
                    function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError(genericError, true));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsGoalDetailsViewModel$deleteGoal$1 = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$deleteGoal$1(this, continuation);
        java.lang.Object obj2 = savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsGoalDetailsViewModel$deleteGoal$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleDeleteAfterTransfer(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState savingsGoalDetailsState, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        if (savingsGoalDetailsState instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success success = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) savingsGoalDetailsState;
            java.lang.Object highResolutionOutputSizeshNQ4ISI = savingsGoalDetailsViewModel.getHighResolutionOutputSizeshNQ4ISI(success.getGoal().getId(), success.getGoal().getTitle(), function1, true, continuation);
            if (highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleDeleteGoalConfirmed(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState savingsGoalDetailsState, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        if (savingsGoalDetailsState instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success success = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) savingsGoalDetailsState;
            if (success.getDeleteDialogType() instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType.ZeroBalance) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI = savingsGoalDetailsViewModel.getHighResolutionOutputSizeshNQ4ISI(success.getGoal().getId(), success.getGoal().getTitle(), function1, false, continuation);
                return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect> getUiEffect() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect> mviStateStore = this.getHighSpeedVideoSizes;
        if (mviStateStore != null) {
            return mviStateStore.getUiEffect();
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState> getUiState() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect> mviStateStore = this.getHighSpeedVideoSizes;
        if (mviStateStore != null) {
            return mviStateStore.getUiState();
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }

    public final void processIntent(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect> mviStateStore = this.getHighSpeedVideoSizes;
        if (mviStateStore != null) {
            mviStateStore.onEvent(intent);
            return;
        }
        throw new java.lang.IllegalStateException("ViewModel not initialized. Call initialize(goal) first.".toString());
    }
}
