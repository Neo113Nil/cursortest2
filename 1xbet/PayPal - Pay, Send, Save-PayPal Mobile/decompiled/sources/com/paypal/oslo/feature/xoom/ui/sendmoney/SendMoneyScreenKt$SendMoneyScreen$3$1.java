package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$3$1", f = "SendMoneyScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class SendMoneyScreenKt$SendMoneyScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getInputFormats.onLoad(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$3$1(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMoneyScreenKt$SendMoneyScreen$3$1(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$3$1> continuation) {
        super(2, continuation);
        this.getInputFormats = sendMoneyViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
        this.Camera2StreamConfigurationMap = str5;
        this.getOutputMinFrameDuration = str6;
    }
}
