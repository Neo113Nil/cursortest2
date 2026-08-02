package com.paypal.oslo.feature.businesshome.ui.accountsetup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$loadData$1", f = "AccountSetupViewModel.kt", i = {}, l = {72, 76}, m = "invokeSuspend", n = {}, nl = {74, 77}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountSetupViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r5 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r5 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase isMandatoryAccountSetupCompleteUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase getAccountSetupStatusUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            isMandatoryAccountSetupCompleteUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = isMandatoryAccountSetupCompleteUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel.access$updateUiState(accountSetupViewModel, (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus) ((arrow.core.Either.Right) either).getValue());
                } else if (either instanceof arrow.core.Either.Left) {
                    mutableStateFlow2 = accountSetupViewModel.getHighSpeedVideoFpsRanges;
                    mutableStateFlow2.setValue(new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error("Unable to load account setup data"));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            return kotlin.Unit.INSTANCE;
        }
        mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        mutableStateFlow.setValue(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Loading.INSTANCE);
        getAccountSetupStatusUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = 2;
        obj = getAccountSetupStatusUseCase.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$loadData$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSetupViewModel$loadData$1(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = accountSetupViewModel;
    }
}
