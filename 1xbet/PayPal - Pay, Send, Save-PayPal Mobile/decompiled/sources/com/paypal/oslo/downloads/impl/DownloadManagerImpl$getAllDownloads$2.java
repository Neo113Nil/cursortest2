package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/paypal/oslo/downloads/api/model/DownloadInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$getAllDownloads$2", f = "DownloadManagerImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {478}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$getAllDownloads$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.downloads.api.model.DownloadInfo>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = downloadDao.getAll(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$toDownloadInfo(downloadManagerImpl, (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.downloads.api.model.DownloadInfo>> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$getAllDownloads$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$getAllDownloads$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$getAllDownloads$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$getAllDownloads$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = downloadManagerImpl;
    }
}
