package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$pause$2", f = "DownloadManagerImpl.kt", i = {1}, l = {105, 113}, m = "invokeSuspend", n = {"entity"}, nl = {107, 119}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$pause$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateState$default(r4, r13.Camera2StreamConfigurationMap, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, "USER_REQUESTED", 0, r13, 8, null) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r14 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = downloadDao.getById(this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) obj;
        if (downloadEntity == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (downloadEntity.canPause()) {
            downloadWorkScheduler = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            downloadWorkScheduler.m11758cancelDownload3wgKXB0(this.Camera2StreamConfigurationMap);
            downloadDao2 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
            this.getHighSpeedVideoSizes = 2;
        } else {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$pause$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$pause$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$pause$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$pause$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = downloadManagerImpl;
        this.Camera2StreamConfigurationMap = str;
    }
}
