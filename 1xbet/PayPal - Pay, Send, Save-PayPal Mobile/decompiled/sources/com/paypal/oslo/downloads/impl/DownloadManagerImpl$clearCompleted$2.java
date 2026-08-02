package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCompleted$2", f = "DownloadManagerImpl.kt", i = {1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "invokeSuspend", n = {"completedDownloads"}, nl = {215, -1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$clearCompleted$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r8 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = downloadDao.getByState("COMPLETED", this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl = this.getHighSpeedVideoFpsRangesFor;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String filePath = ((com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) it.next()).getFilePath();
            if (filePath != null) {
                fileDeleter = downloadManagerImpl.getHighSpeedVideoSizes;
                fileDeleter.deleteIfExists(filePath);
            }
        }
        downloadDao2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
        this.getHighSpeedVideoSizes = 2;
        java.lang.Object deleteByState = downloadDao2.deleteByState("COMPLETED", this);
        return deleteByState == coroutine_suspended ? coroutine_suspended : deleteByState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCompleted$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCompleted$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$clearCompleted$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCompleted$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = downloadManagerImpl;
    }
}
