package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$2", f = "CardActivationSideEffectMiddleware.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {60}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class CardActivationSideEffectMiddleware$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware.access$activateCard(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getEventDispatcher(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardActivationSideEffectMiddleware$invoke$2(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware cardActivationSideEffectMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating activating, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardActivationSideEffectMiddleware;
        this.getHighSpeedVideoFpsRangesFor = activating;
        this.Camera2StreamConfigurationMap = input;
    }
}
