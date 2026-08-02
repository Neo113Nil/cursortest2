package com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/paypal/oslo/downloads/api/model/DownloadState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1", f = "DownloadFileUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class DownloadFileUseCase$awaitDownloadCompletion$finalState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.downloads.api.model.DownloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.api.model.DownloadState downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase.access$isTerminalState(this.Camera2StreamConfigurationMap, downloadState));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.downloads.api.model.DownloadState downloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1) create(downloadState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1 downloadFileUseCase$awaitDownloadCompletion$finalState$1 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1(this.Camera2StreamConfigurationMap, continuation);
        downloadFileUseCase$awaitDownloadCompletion$finalState$1.getHighSpeedVideoFpsRanges = obj;
        return downloadFileUseCase$awaitDownloadCompletion$finalState$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileUseCase$awaitDownloadCompletion$finalState$1(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = downloadFileUseCase;
    }
}
