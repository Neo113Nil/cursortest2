package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel$onRequestTypeClick$1", f = "PayAndGetPaidViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {81, 89, 94}, m = "invokeSuspend", n = {"result", "this_$iv", "verificationResult", "$i$f$fold", "$i$a$-fold-PayAndGetPaidViewModel$onRequestTypeClick$1$2", "result", "this_$iv", "verificationResult", "$i$f$fold", "$i$a$-fold-PayAndGetPaidViewModel$onRequestTypeClick$1$2"}, nl = {83, 91, 86}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PayAndGetPaidViewModel$onRequestTypeClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.navigation3.runtime.NavKey getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r1.emit(r2, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r1.emit(r3, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r10 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase getPayGetPaidVerificationStatusUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Loading.INSTANCE);
            getPayGetPaidVerificationStatusUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.getInputFormats = 1;
            obj = getPayGetPaidVerificationStatusUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel = this.getInputSizeshNQ4ISI;
        androidx.navigation3.runtime.NavKey navKey = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult payGetPaidVerificationResult = (com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult) ((arrow.core.Either.Right) either).getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(payGetPaidVerificationResult, com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult.Verified.INSTANCE)) {
                mutableStateFlow4 = payAndGetPaidViewModel.getInputSizeshNQ4ISI;
                mutableStateFlow4.setValue(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Idle.INSTANCE);
                mutableSharedFlow2 = payAndGetPaidViewModel.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination navigateToDestination = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination(navKey);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payGetPaidVerificationResult);
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getInputFormats = 2;
            } else if (payGetPaidVerificationResult instanceof com.paypal.oslo.feature.businesshome.api.domain.usecase.PayGetPaidVerificationResult.NeedsSetup) {
                mutableStateFlow3 = payAndGetPaidViewModel.getInputSizeshNQ4ISI;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Idle.INSTANCE);
                payAndGetPaidViewModel.pendingDestination = navKey;
                mutableSharedFlow = payAndGetPaidViewModel.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet navigateToAccountSetupSheet = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet(str);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payGetPaidVerificationResult);
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getInputFormats = 3;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = payAndGetPaidViewModel.getInputSizeshNQ4ISI;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Error.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel$onRequestTypeClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel$onRequestTypeClick$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayAndGetPaidViewModel$onRequestTypeClick$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel$onRequestTypeClick$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = payAndGetPaidViewModel;
        this.getHighSpeedVideoFpsRanges = navKey;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
