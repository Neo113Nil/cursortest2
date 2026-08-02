package com.paypal.oslo.feature.debitcard.shared.base;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware$invoke$1", f = "SideEffectsMiddleware.kt", i = {0, 0, 1, 1}, l = {94, 95}, m = "invokeSuspend", n = {"preState", "currentState", "preState", "currentState"}, nl = {95, 96}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class SideEffectsMiddleware$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<S, I> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r8.getHighSpeedVideoFpsRanges.handleEvent(r8.getHighSpeedVideoSizes.getEvent(), r1, r8.getHighSpeedVideoSizes.getEventDispatcher(), r8) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.UiState uiState;
        com.paypal.oslo.core.mvi.UiState uiState2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Pair states = this.getHighSpeedVideoSizes.getStates();
            com.paypal.oslo.core.mvi.UiState uiState3 = (com.paypal.oslo.core.mvi.UiState) states.component1();
            com.paypal.oslo.core.mvi.UiState uiState4 = (com.paypal.oslo.core.mvi.UiState) states.component2();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiState3);
            this.Camera2StreamConfigurationMap = uiState4;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.handleStateTransition(uiState3, uiState4, this.getHighSpeedVideoSizes.getEventDispatcher(), this) != coroutine_suspended) {
                uiState = uiState3;
                uiState2 = uiState4;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        uiState2 = (com.paypal.oslo.core.mvi.UiState) this.Camera2StreamConfigurationMap;
        uiState = (com.paypal.oslo.core.mvi.UiState) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiState);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiState2);
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware$invoke$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SideEffectsMiddleware$invoke$1(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> input, com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<S, I> sideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = input;
        this.getHighSpeedVideoFpsRanges = sideEffectsMiddleware;
    }
}
