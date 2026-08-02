package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/downloads/api/model/DownloadInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$getDownload$2", f = "DownloadManagerImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$getDownload$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadInfo>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = downloadDao.getById(this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) obj;
        if (downloadEntity != null) {
            return com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$toDownloadInfo(this.getHighSpeedVideoSizes, downloadEntity);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadInfo> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$getDownload$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$getDownload$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$getDownload$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$getDownload$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = downloadManagerImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
