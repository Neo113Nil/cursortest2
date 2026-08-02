package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantScreen$1$1", f = "PpwMerchantScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PpwMerchantScreenKt$PpwMerchantScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.handleEvent(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.LoadScreen(this.getHighSpeedVideoFpsRangesFor.getReceiverAmount(), this.getHighSpeedVideoFpsRangesFor.getSenderAmount(), this.getHighSpeedVideoFpsRangesFor.getSenderCurrencyCode(), this.getHighSpeedVideoFpsRangesFor.getReceiverCurrencyCode(), this.getHighSpeedVideoFpsRangesFor.getSenderCountryCode(), this.getHighSpeedVideoFpsRangesFor.getReceiverCountryCode()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PpwMerchantScreenKt$PpwMerchantScreen$1$1(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel ppwMerchantViewModel, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs ppwMerchantNavArgs, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = ppwMerchantViewModel;
        this.getHighSpeedVideoFpsRangesFor = ppwMerchantNavArgs;
    }
}
