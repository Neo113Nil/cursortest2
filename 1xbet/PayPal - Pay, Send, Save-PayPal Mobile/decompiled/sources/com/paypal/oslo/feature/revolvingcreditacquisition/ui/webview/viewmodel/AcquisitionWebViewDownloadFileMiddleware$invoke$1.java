package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware$invoke$1", f = "AcquisitionWebViewDownloadFileMiddleware.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, nl = {30}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AcquisitionWebViewDownloadFileMiddleware$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadFileUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = downloadFileUseCase.invoke(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested) this.Camera2StreamConfigurationMap).getUrl(), ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested) this.Camera2StreamConfigurationMap).getMimeType(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult downloadResult = (com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult) obj;
        if (downloadResult instanceof com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success) {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            java.lang.String obj2 = ((com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success) downloadResult).getFileUri().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            function1.invoke(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted(obj2));
        } else {
            if (!(downloadResult instanceof com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed(((com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error) downloadResult).getError().getMessage()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AcquisitionWebViewDownloadFileMiddleware$invoke$1(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware acquisitionWebViewDownloadFileMiddleware, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent acquisitionWebViewEvent, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = acquisitionWebViewDownloadFileMiddleware;
        this.Camera2StreamConfigurationMap = acquisitionWebViewEvent;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
