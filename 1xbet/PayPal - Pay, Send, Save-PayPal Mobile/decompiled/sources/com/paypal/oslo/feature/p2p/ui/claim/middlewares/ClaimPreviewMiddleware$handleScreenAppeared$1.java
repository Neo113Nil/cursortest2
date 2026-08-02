package com.paypal.oslo.feature.p2p.ui.claim.middlewares;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleScreenAppeared$1", f = "ClaimPreviewMiddleware.kt", i = {1, 1}, l = {68, 75}, m = "invokeSuspend", n = {"result", "transfer"}, nl = {69, 76}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class ClaimPreviewMiddleware$handleScreenAppeared$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase getPaymentTransferUseCase;
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer claimMoneyTransfer;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent, kotlin.Unit> function1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPaymentTransferUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = 1;
            obj = getPaymentTransferUseCase.invoke(this.getHighSpeedVideoFpsRanges.getPaymentCodeId(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (kotlin.jvm.functions.Function1) this.getHighResolutionOutputSizeshNQ4ISI;
                claimMoneyTransfer = (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded((com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData) obj, claimMoneyTransfer.getId()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        claimMoneyTransfer = (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer) ior.getOrNull();
        if (claimMoneyTransfer == null) {
            this.Camera2StreamConfigurationMap.getEventDispatcher().invoke(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoadFailed.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent, kotlin.Unit> eventDispatcher = this.Camera2StreamConfigurationMap.getEventDispatcher();
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
        this.getHighSpeedVideoSizes = claimMoneyTransfer;
        this.getHighResolutionOutputSizeshNQ4ISI = eventDispatcher;
        this.getOutputFormats = 2;
        obj = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(claimMoneyTransfer, this);
        if (obj != coroutine_suspended) {
            function1 = eventDispatcher;
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded((com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData) obj, claimMoneyTransfer.getId()));
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleScreenAppeared$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleScreenAppeared$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClaimPreviewMiddleware$handleScreenAppeared$1(com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware claimPreviewMiddleware, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared screenAppeared, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleScreenAppeared$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = claimPreviewMiddleware;
        this.getHighSpeedVideoFpsRanges = screenAppeared;
        this.Camera2StreamConfigurationMap = input;
    }
}
