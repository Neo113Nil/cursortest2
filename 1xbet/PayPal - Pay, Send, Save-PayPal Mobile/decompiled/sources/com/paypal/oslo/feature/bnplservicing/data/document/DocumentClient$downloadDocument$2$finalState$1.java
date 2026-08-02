package com.paypal.oslo.feature.bnplservicing.data.document;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/paypal/oslo/downloads/api/model/DownloadState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1", f = "DocumentClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class DocumentClient$downloadDocument$2$finalState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.downloads.api.model.DownloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.api.model.DownloadState downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.downloads.api.model.DownloadState downloadState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1) create(downloadState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1 documentClient$downloadDocument$2$finalState$1 = new com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1(continuation);
        documentClient$downloadDocument$2$finalState$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return documentClient$downloadDocument$2$finalState$1;
    }

    DocumentClient$downloadDocument$2$finalState$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1> continuation) {
        super(2, continuation);
    }
}
