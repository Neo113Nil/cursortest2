package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsLandingPageData$1", f = "SavingsBaseViewModel.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, nl = {450}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsBaseViewModel$fetchSavingsLandingPageData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getSavingsLandingPageDataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState savingsBaseUiState;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getSavingsLandingPageDataUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = getSavingsLandingPageDataUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
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
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = (com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = savingsBaseViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings(savingsLandingPageResult, z));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow = savingsBaseViewModel.getHighSpeedVideoSizes;
            if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                savingsBaseUiState = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall(z));
            } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            } else {
                if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            }
            mutableStateFlow.setValue(savingsBaseUiState);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsLandingPageData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsLandingPageData$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsBaseViewModel$fetchSavingsLandingPageData$1(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsLandingPageData$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsBaseViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
