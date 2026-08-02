package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$delete$2", f = "DownloadManagerImpl.kt", i = {1}, l = {239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "invokeSuspend", n = {"entity"}, nl = {241, 247}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$delete$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r1.deleteById(r6.getHighSpeedVideoFpsRanges, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = downloadDao.getById(this.getHighSpeedVideoFpsRanges, this);
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
        downloadWorkScheduler = this.Camera2StreamConfigurationMap.getOutputFormats;
        downloadWorkScheduler.m11758cancelDownload3wgKXB0(this.getHighSpeedVideoFpsRanges);
        java.lang.String filePath = downloadEntity.getFilePath();
        if (filePath != null) {
            fileDeleter = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fileDeleter.deleteIfExists(filePath));
        }
        downloadDao2 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$delete$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$delete$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$delete$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$delete$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = downloadManagerImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
