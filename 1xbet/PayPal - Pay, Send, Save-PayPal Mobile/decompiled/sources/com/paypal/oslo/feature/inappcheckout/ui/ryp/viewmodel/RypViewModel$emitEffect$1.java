package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1", f = "RypViewModel.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, nl = {309}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RypViewModel$emitEffect$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.Camera2StreamConfigurationMap.getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (mutableSharedFlow.emit(this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RypViewModel$emitEffect$1(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect effect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$emitEffect$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = rypViewModel;
        this.getHighSpeedVideoFpsRanges = effect;
    }
}
