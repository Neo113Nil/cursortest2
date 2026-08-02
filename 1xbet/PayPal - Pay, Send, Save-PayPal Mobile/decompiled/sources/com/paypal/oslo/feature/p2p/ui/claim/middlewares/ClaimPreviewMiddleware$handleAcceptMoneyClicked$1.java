package com.paypal.oslo.feature.p2p.ui.claim.middlewares;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1", f = "ClaimPreviewMiddleware.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$launch", "transactionId"}, nl = {97}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class ClaimPreviewMiddleware$handleAcceptMoneyClicked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String transactionId;
        com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase claimMoneyUseCase;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState second = this.getHighResolutionOutputSizeshNQ4ISI.getStates().getSecond();
            com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content content = second instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content ? (com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) second : null;
            if (content != null && (transactionId = content.getTransactionId()) != null) {
                claimMoneyUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionId);
                this.Camera2StreamConfigurationMap = 1;
                obj = claimMoneyUseCase.invoke(transactionId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CLAIM_PREVIEW_MISSING_TRANSACTION_ID, null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer claimMoneyTransfer = (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer) ((arrow.core.Ior) obj).getOrNull();
        if ((claimMoneyTransfer != null ? claimMoneyTransfer.getStatus() : null) == com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.COMPLETED) {
            this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher().invoke(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimSucceeded.INSTANCE);
        } else {
            if ((claimMoneyTransfer != null ? claimMoneyTransfer.getStatus() : null) == com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.REVERSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher().invoke(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimDeclined.INSTANCE);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher().invoke(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimFailed.INSTANCE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1 claimPreviewMiddleware$handleAcceptMoneyClicked$1 = new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        claimPreviewMiddleware$handleAcceptMoneyClicked$1.getHighSpeedVideoSizes = obj;
        return claimPreviewMiddleware$handleAcceptMoneyClicked$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClaimPreviewMiddleware$handleAcceptMoneyClicked$1(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> input, com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware claimPreviewMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = input;
        this.getHighSpeedVideoFpsRangesFor = claimPreviewMiddleware;
    }
}
