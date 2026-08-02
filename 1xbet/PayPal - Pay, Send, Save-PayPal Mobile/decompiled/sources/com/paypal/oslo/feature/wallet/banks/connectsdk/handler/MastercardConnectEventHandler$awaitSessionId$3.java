package com.paypal.oslo.feature.wallet.banks.connectsdk.handler;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3", f = "MastercardConnectEventHandler.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MastercardConnectEventHandler$awaitSessionId$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        mutableSharedFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(mutableSharedFlow, this);
        return first == coroutine_suspended ? coroutine_suspended : first;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MastercardConnectEventHandler$awaitSessionId$3(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mastercardConnectEventHandler;
    }
}
