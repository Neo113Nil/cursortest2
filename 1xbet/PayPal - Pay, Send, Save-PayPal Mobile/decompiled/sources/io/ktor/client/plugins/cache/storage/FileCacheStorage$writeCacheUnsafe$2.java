package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2", f = "FileCacheStorage.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FileCacheStorage$writeCacheUnsafe$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.File file;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.lang.Throwable th;
        java.io.BufferedOutputStream bufferedOutputStream2;
        java.lang.Object copyTo$default;
        ?? r1;
        java.lang.Throwable th2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(false, 1, null);
            try {
                file = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                java.io.BufferedOutputStream bufferedOutputStream3 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(file, this.Camera2StreamConfigurationMap)), 8192);
                try {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1(byteChannel, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), 3, null);
                    io.ktor.utils.io.ByteChannel byteChannel2 = byteChannel;
                    java.io.BufferedOutputStream bufferedOutputStream4 = bufferedOutputStream3;
                    this.getHighSpeedVideoFpsRangesFor = bufferedOutputStream3;
                    this.getHighSpeedVideoFpsRanges = 1;
                    bufferedOutputStream = bufferedOutputStream3;
                    try {
                        copyTo$default = io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(byteChannel2, bufferedOutputStream4, 0L, this, 2, null);
                        if (copyTo$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bufferedOutputStream = bufferedOutputStream3;
                }
            } catch (java.lang.Exception e) {
                org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception during saving a cache to a file: ");
                    sb.append(kotlin.ExceptionsKt.stackTraceToString(e));
                    logger.trace(sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r1 = (java.io.Closeable) this.getHighSpeedVideoFpsRangesFor;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                bufferedOutputStream = r1;
                copyTo$default = obj;
            } catch (java.lang.Throwable th5) {
                th2 = th5;
                bufferedOutputStream2 = r1;
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th6) {
                    kotlin.io.CloseableKt.closeFinally(bufferedOutputStream2, th);
                    throw th6;
                }
            }
        }
        try {
            java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) copyTo$default).longValue());
            kotlin.io.CloseableKt.closeFinally(bufferedOutputStream, null);
            return boxLong;
        } catch (java.lang.Throwable th7) {
            th2 = th7;
            r1 = bufferedOutputStream;
            bufferedOutputStream2 = r1;
            th = th2;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2 fileCacheStorage$writeCacheUnsafe$2 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        fileCacheStorage$writeCacheUnsafe$2.getHighSpeedVideoFpsRangesFor = obj;
        return fileCacheStorage$writeCacheUnsafe$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCacheUnsafe$2(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, java.lang.String str, java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = fileCacheStorage;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
