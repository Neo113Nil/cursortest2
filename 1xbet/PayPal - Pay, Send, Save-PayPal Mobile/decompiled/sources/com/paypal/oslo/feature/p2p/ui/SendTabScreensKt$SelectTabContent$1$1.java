package com.paypal.oslo.feature.p2p.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/p2p/navigation/result/ReviewScreenNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1", f = "SendTabScreens.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class SendTabScreensKt$SelectTabContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult reviewScreenNavResult = (com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(reviewScreenNavResult.getOutcome(), com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult.Outcome.Cancelled.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.processEvent(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult reviewScreenNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1) create(reviewScreenNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1 sendTabScreensKt$SelectTabContent$1$1 = new com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        sendTabScreensKt$SelectTabContent$1$1.Camera2StreamConfigurationMap = obj;
        return sendTabScreensKt$SelectTabContent$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendTabScreensKt$SelectTabContent$1$1(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = transferViewModel;
    }
}
