package com.paypal.oslo.downloads.impl.storage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2", f = "DefaultDownloadStorageProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DefaultDownloadStorageProvider$getStorageDirectory$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider.access$validateCategory(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        context = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        java.io.File file = new java.io.File(context.getFilesDir(), "downloads/".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges)));
        com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider.access$ensureDirectoryExists(this.Camera2StreamConfigurationMap, file);
        return file.getAbsolutePath();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDownloadStorageProvider$getStorageDirectory$2(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = defaultDownloadStorageProvider;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
