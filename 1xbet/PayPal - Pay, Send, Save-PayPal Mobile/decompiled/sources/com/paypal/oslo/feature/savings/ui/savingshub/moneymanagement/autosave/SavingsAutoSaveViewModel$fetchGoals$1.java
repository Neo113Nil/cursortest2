package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel$fetchGoals$1", f = "SavingsAutoSaveViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {155}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsAutoSaveViewModel$fetchGoals$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState goalsLoaded;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading.INSTANCE);
            fetchGoalsUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase.invoke$default(fetchGoalsUseCase, null, this.getHighSpeedVideoSizes, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow3 = savingsAutoSaveViewModel.Camera2StreamConfigurationMap;
            if (list.isEmpty()) {
                goalsLoaded = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NoGoalsFound.INSTANCE, "No goals found");
            } else {
                goalsLoaded = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded(list);
            }
            mutableStateFlow3.setValue(goalsLoaded);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow2 = savingsAutoSaveViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.access$handleError(savingsAutoSaveViewModel, savingsError));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel$fetchGoals$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel$fetchGoals$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsAutoSaveViewModel$fetchGoals$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel$fetchGoals$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = savingsAutoSaveViewModel;
        this.getHighSpeedVideoSizes = z;
    }
}
