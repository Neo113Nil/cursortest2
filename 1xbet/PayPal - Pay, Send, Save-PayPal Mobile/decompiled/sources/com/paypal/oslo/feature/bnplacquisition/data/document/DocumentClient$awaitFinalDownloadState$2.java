package com.paypal.oslo.feature.bnplacquisition.data.document;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/paypal/oslo/downloads/api/model/DownloadState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2", f = "DocumentClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class DocumentClient$awaitFinalDownloadState$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.downloads.api.model.DownloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
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
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.downloads.api.model.DownloadState downloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2) create(downloadState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2 documentClient$awaitFinalDownloadState$2 = new com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2(continuation);
        documentClient$awaitFinalDownloadState$2.getHighSpeedVideoFpsRanges = obj;
        return documentClient$awaitFinalDownloadState$2;
    }

    DocumentClient$awaitFinalDownloadState$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2> continuation) {
        super(2, continuation);
    }
}
