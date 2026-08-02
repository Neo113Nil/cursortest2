package com.paypal.oslo.feature.revolvingcreditservicing.data.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Ljava/io/IOException;", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl$saveFile$2", f = "FileStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class FileStorageImpl$saveFile$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.io.IOException, ? extends java.lang.String>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.io.OutputStream, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                context = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                java.io.File file = new java.io.File(context.getFilesDir(), this.getHighSpeedVideoFpsRanges);
                if (!file.exists()) {
                    file.mkdirs();
                }
                java.io.File file2 = new java.io.File(file, this.Camera2StreamConfigurationMap);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    this.getHighSpeedVideoFpsRangesFor.invoke(fileOutputStream);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    return arrow.core.EitherKt.right(file2.getAbsolutePath());
                } finally {
                }
            } catch (java.io.IOException e) {
                return arrow.core.EitherKt.left(e);
            }
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.io.IOException, ? extends java.lang.String>> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl$saveFile$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl$saveFile$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FileStorageImpl$saveFile$2(com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl fileStorageImpl, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.io.OutputStream, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl$saveFile$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = fileStorageImpl;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
