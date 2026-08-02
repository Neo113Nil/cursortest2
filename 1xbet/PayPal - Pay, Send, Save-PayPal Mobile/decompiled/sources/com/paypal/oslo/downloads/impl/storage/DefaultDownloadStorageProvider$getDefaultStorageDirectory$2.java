package com.paypal.oslo.downloads.impl.storage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2", f = "DefaultDownloadStorageProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DefaultDownloadStorageProvider$getDefaultStorageDirectory$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            context = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            java.io.File file = new java.io.File(context.getFilesDir(), "downloads");
            com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider.access$ensureDirectoryExists(this.getHighSpeedVideoSizes, file);
            return file.getAbsolutePath();
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDownloadStorageProvider$getDefaultStorageDirectory$2(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = defaultDownloadStorageProvider;
    }
}
