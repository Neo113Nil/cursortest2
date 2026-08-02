package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$3", f = "CrossBorderViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, nl = {154}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderViewModel$handleInitialize$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getTransferAttemptId(), new com.paypal.oslo.feature.p2p.domain.model.CurrencyInput(this.getHighSpeedVideoFpsRangesFor.getSendCurrencyCode(), this.getHighSpeedVideoSizes), null, this.getHighSpeedVideoFpsRangesFor.getReceiveCurrencyCode(), this.getHighSpeedVideoFpsRanges, this);
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
        return ((com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$3(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossBorderViewModel$handleInitialize$3(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize initialize, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleInitialize$3> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = crossBorderViewModel;
        this.getHighSpeedVideoFpsRangesFor = initialize;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
