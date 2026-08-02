package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$2", f = "CrossBorderViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, nl = {136}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderViewModel$handleInitialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.getTransferAttemptId(), null, new com.paypal.oslo.feature.p2p.domain.model.CurrencyInput(this.getHighResolutionOutputSizeshNQ4ISI.getReceiveCurrencyCode(), this.getHighResolutionOutputSizeshNQ4ISI.getInitialReceiveAmount()), this.getHighResolutionOutputSizeshNQ4ISI.getSendCurrencyCode(), this.getHighSpeedVideoFpsRanges, this);
            if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossBorderViewModel$handleInitialize$2(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize initialize, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = crossBorderViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = initialize;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
