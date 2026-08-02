package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCache$2", f = "DownloadManagerImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, nl = {224}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$clearCache$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = downloadDao.getByState("COMPLETED", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl = this.getHighSpeedVideoSizes;
        java.util.Iterator it = ((java.util.List) obj).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            java.lang.String filePath = ((com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) it.next()).getFilePath();
            if (filePath != null) {
                fileDeleter = downloadManagerImpl.getHighSpeedVideoSizes;
                if (fileDeleter.delete(filePath)) {
                    i2++;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCache$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCache$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$clearCache$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$clearCache$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = downloadManagerImpl;
    }
}
