package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$15$1", f = "BankDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankDetailScreenKt$BankDetailScreen$15$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.loadBankDetails(this.getHighSpeedVideoFpsRanges);
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome = bankFlowNavResult.getOutcome();
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success)) {
            if (outcome instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) {
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(true));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$15$1) create(bankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$15$1 bankDetailScreenKt$BankDetailScreen$15$1 = new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$15$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        bankDetailScreenKt$BankDetailScreen$15$1.getHighSpeedVideoSizes = obj;
        return bankDetailScreenKt$BankDetailScreen$15$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDetailScreenKt$BankDetailScreen$15$1(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$15$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bankDetailViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
