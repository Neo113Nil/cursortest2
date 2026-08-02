package com.paypal.oslo.core.persistence.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createBinaryFile$3", f = "FileOperationsRepositoryImpl.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {99}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class FileOperationsRepositoryImpl$createBinaryFile$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.io.File>, java.lang.Object> {
    final /* synthetic */ byte[] Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.io.File cacheDir;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes) {
                context = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                cacheDir = context.getCacheDir();
                java.io.File file = new java.io.File(cacheDir, this.getHighSpeedVideoFpsRangesFor);
                kotlin.io.FilesKt.writeBytes(file, this.Camera2StreamConfigurationMap);
                return file;
            }
            com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
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
        java.io.File file2 = new java.io.File(cacheDir, this.getHighSpeedVideoFpsRangesFor);
        kotlin.io.FilesKt.writeBytes(file2, this.Camera2StreamConfigurationMap);
        return file2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        return ((com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createBinaryFile$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createBinaryFile$3(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileOperationsRepositoryImpl$createBinaryFile$3(boolean z, com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl fileOperationsRepositoryImpl, java.lang.String str, byte[] bArr, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl$createBinaryFile$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = fileOperationsRepositoryImpl;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = bArr;
    }
}
