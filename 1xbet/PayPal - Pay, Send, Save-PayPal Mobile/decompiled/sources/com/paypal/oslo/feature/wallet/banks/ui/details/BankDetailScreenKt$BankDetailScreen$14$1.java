package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$14$1", f = "BankDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankDetailScreenKt$BankDetailScreen$14$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.loadBankDetails(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(confirmBankFlowNavResult.getOutcome() instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Success));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$14$1) create(confirmBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$14$1 bankDetailScreenKt$BankDetailScreen$14$1 = new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$14$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        bankDetailScreenKt$BankDetailScreen$14$1.Camera2StreamConfigurationMap = obj;
        return bankDetailScreenKt$BankDetailScreen$14$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDetailScreenKt$BankDetailScreen$14$1(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt$BankDetailScreen$14$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bankDetailViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
