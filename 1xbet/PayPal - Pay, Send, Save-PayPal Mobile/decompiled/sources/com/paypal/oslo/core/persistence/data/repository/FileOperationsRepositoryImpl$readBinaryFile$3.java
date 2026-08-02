package com.paypal.oslo.core.persistence.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readBinaryFile$3", f = "FileOperationsRepositoryImpl.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class FileOperationsRepositoryImpl$readBinaryFile$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super byte[]>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.io.File cacheDir;
        java.io.File file;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes) {
                context = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                cacheDir = context.getCacheDir();
                file = new java.io.File(cacheDir, this.getHighSpeedVideoFpsRanges);
                if (file.exists()) {
                    return null;
                }
                return kotlin.io.FilesKt.readBytes(file);
            }
            com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(fileOperationsRepositoryImpl.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$getUserFilesDirectory$2(fileOperationsRepositoryImpl, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cacheDir = (java.io.File) obj;
        file = new java.io.File(cacheDir, this.getHighSpeedVideoFpsRanges);
        if (file.exists()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return ((com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readBinaryFile$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readBinaryFile$3(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileOperationsRepositoryImpl$readBinaryFile$3(boolean z, com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$readBinaryFile$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = fileOperationsRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
