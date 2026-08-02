package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt$OnlinePaymentScreen$1$1", f = "OnlinePaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentScreenKt$OnlinePaymentScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.handleAddFiResult(addFIFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt$OnlinePaymentScreen$1$1) create(addFIFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt$OnlinePaymentScreen$1$1 onlinePaymentScreenKt$OnlinePaymentScreen$1$1 = new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt$OnlinePaymentScreen$1$1(this.Camera2StreamConfigurationMap, continuation);
        onlinePaymentScreenKt$OnlinePaymentScreen$1$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return onlinePaymentScreenKt$OnlinePaymentScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentScreenKt$OnlinePaymentScreen$1$1(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt$OnlinePaymentScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = onlinePaymentViewModel;
    }
}
