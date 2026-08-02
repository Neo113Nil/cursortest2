package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2", f = "DownloadWorker.kt", i = {0, 1, 2}, l = {108, 110, 113}, m = "invokeSuspend", n = {"result", "result", "result"}, nl = {109, 112, 107}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$processDownload$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.downloads.impl.engine.DownloadResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.downloads.impl.data.entity.DownloadEntity getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (com.paypal.oslo.downloads.worker.DownloadWorker.access$handleProgress(r9.getHighSpeedVideoSizesFor, r9.getHighSpeedVideoFpsRangesFor, r9.getHighSpeedVideoSizes, (com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress) r0, r9) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> objectRef;
        T t;
        kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> objectRef2;
        T t2;
        com.paypal.oslo.downloads.impl.engine.DownloadResult downloadResult = (com.paypal.oslo.downloads.impl.engine.DownloadResult) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (downloadResult instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress) {
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadResult);
                this.getOutputMinFrameDuration = 1;
            } else if (downloadResult instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Success) {
                kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> objectRef3 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadResult);
                this.Camera2StreamConfigurationMap = objectRef3;
                this.getOutputMinFrameDuration = 2;
                java.lang.Object access$handleSuccess = com.paypal.oslo.downloads.worker.DownloadWorker.access$handleSuccess(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, (com.paypal.oslo.downloads.impl.engine.DownloadResult.Success) downloadResult, this);
                if (access$handleSuccess != coroutine_suspended) {
                    objectRef2 = objectRef3;
                    t2 = access$handleSuccess;
                    objectRef2.element = t2;
                }
            } else {
                if (!(downloadResult instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> objectRef4 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadResult);
                this.Camera2StreamConfigurationMap = objectRef4;
                this.getOutputMinFrameDuration = 3;
                java.lang.Object access$handleError = com.paypal.oslo.downloads.worker.DownloadWorker.access$handleError(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, (com.paypal.oslo.downloads.impl.engine.DownloadResult.Error) downloadResult, this);
                if (access$handleError != coroutine_suspended) {
                    objectRef = objectRef4;
                    t = access$handleError;
                    objectRef.element = t;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            t2 = obj;
            objectRef2.element = t2;
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
            objectRef.element = t;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.downloads.impl.engine.DownloadResult downloadResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2) create(downloadResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2 downloadWorker$processDownload$2 = new com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        downloadWorker$processDownload$2.getHighSpeedVideoFpsRanges = obj;
        return downloadWorker$processDownload$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$processDownload$2(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.jvm.internal.Ref.ObjectRef<androidx.work.ListenableWorker.Result> objectRef, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = downloadWorker;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = downloadEntity;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
    }
}
