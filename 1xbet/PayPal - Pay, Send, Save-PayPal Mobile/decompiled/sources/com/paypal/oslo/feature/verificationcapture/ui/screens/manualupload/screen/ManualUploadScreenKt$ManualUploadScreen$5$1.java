package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$5$1", f = "ManualUploadScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadScreenKt$ManualUploadScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.handleEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult(success.getImageBytes(), "image/jpeg"))));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$5$1) create(success, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$5$1 manualUploadScreenKt$ManualUploadScreen$5$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$5$1(this.getHighSpeedVideoFpsRanges, continuation);
        manualUploadScreenKt$ManualUploadScreen$5$1.getHighSpeedVideoFpsRangesFor = obj;
        return manualUploadScreenKt$ManualUploadScreen$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualUploadScreenKt$ManualUploadScreen$5$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = manualUploadViewModel;
    }
}
