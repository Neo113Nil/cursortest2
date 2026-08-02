package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1", f = "AutoReloadBaseScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult = (com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.processIntent(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult(autoReloadFlowNavResult));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1) create(autoReloadFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1 autoReloadBaseScreenKt$AutoReloadBaseScreen$3$1 = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1(this.getHighSpeedVideoSizes, continuation);
        autoReloadBaseScreenKt$AutoReloadBaseScreen$3$1.getHighSpeedVideoFpsRangesFor = obj;
        return autoReloadBaseScreenKt$AutoReloadBaseScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt$AutoReloadBaseScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoReloadViewModel;
    }
}
