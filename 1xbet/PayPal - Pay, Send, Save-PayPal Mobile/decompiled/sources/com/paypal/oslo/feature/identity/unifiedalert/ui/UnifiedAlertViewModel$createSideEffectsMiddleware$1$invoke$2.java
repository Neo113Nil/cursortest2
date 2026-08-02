package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2", f = "UnifiedAlertViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 239}, m = "invokeSuspend", n = {}, nl = {239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.access$executeValidation(r10.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) r10.Camera2StreamConfigurationMap, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.DENIED, r10.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher(), r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r4.markHandled(((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) r10.Camera2StreamConfigurationMap).getAlertData().getDocumentId(), ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) r10.Camera2StreamConfigurationMap).getAlertData().getUserId(), ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) r10.Camera2StreamConfigurationMap).getAlertData().getExpiresAtEpoch(), r10) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) this.Camera2StreamConfigurationMap).getAlertData().getDocumentId())) {
                alertDeduplicationManager = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState unifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = unifiedAlertUiState;
        this.getHighSpeedVideoFpsRangesFor = unifiedAlertViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = input;
    }
}
