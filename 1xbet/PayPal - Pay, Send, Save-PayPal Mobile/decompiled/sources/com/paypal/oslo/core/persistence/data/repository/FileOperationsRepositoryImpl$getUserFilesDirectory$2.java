package com.paypal.oslo.core.persistence.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$getUserFilesDirectory$2", f = "FileOperationsRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class FileOperationsRepositoryImpl$getUserFilesDirectory$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.io.File>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            context = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            java.io.File file = new java.io.File(context.getFilesDir(), "userFiles");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        return ((com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$getUserFilesDirectory$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$getUserFilesDirectory$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileOperationsRepositoryImpl$getUserFilesDirectory$2(com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$getUserFilesDirectory$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = fileOperationsRepositoryImpl;
    }
}
