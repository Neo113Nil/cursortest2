package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$retry$1", f = "AccountVisibilityViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, nl = {356}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountVisibilityViewModel$retry$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase getAccountVisibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Loading.INSTANCE);
            getAccountVisibilityUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getAccountVisibilityUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError dataResultError = (com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue();
            mutableStateFlow4 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$getErrorMessage(dataResultError)));
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData = (com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData) ((arrow.core.Ior.Right) ior).getValue();
            mutableStateFlow3 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content(accountVisibilityData, false, null, 6, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData2 = (com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData) both.getRightValue();
            mutableStateFlow2 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError(accountVisibilityData2, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$getErrorMessage((com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError) leftValue)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$retry$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$retry$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityViewModel$retry$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$retry$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = accountVisibilityViewModel;
    }
}
