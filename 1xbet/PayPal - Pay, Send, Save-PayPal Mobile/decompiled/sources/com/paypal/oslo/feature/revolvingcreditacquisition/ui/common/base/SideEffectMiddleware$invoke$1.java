package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware$invoke$1", f = "SideEffectMiddleware.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {57}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SideEffectMiddleware$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware<S, I> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.Camera2StreamConfigurationMap.onState((com.paypal.oslo.core.mvi.UiState) this.getHighSpeedVideoFpsRangesFor.getStates().getSecond(), this.getHighSpeedVideoFpsRangesFor.getEventDispatcher(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SideEffectMiddleware$invoke$1(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware<S, I> sideEffectMiddleware, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.SideEffectMiddleware$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sideEffectMiddleware;
        this.getHighSpeedVideoFpsRangesFor = input;
    }
}
