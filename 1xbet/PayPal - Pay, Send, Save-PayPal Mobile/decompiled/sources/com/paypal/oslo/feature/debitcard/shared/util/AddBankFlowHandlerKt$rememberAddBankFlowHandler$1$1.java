package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1", f = "AddBankFlowHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult addBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.handleResult(addBankFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult addBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1) create(addBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1 addBankFlowHandlerKt$rememberAddBankFlowHandler$1$1 = new com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1(this.getHighSpeedVideoSizes, continuation);
        addBankFlowHandlerKt$rememberAddBankFlowHandler$1$1.getHighSpeedVideoFpsRanges = obj;
        return addBankFlowHandlerKt$rememberAddBankFlowHandler$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1(com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler addBankFlowHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandlerKt$rememberAddBankFlowHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addBankFlowHandler;
    }
}
