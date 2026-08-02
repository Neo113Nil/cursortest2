package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 257, 258}, m = "invokeSuspend", n = {"urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0"})
/* loaded from: classes17.dex */
final class FileCacheStorage$store$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.http.Url Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachedResponseData getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:20:0x0036, B:21:0x0095, B:22:0x00a4, B:24:0x00aa, B:27:0x00bf, B:32:0x00c3, B:38:0x0080), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String highSpeedVideoFpsRangesFor;
        io.ktor.util.collections.ConcurrentMap concurrentMap;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.String str;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData2;
        io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage2;
        java.util.List plus;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getInputSizeshNQ4ISI;
        try {
            if (r1 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                highSpeedVideoFpsRangesFor = io.ktor.client.plugins.cache.storage.FileCacheStorage.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
                io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage3 = this.getOutputMinFrameDuration;
                io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData3 = this.getHighSpeedVideoSizes;
                concurrentMap = fileCacheStorage3.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) concurrentMap.computeIfAbsent((io.ktor.util.collections.ConcurrentMap) highSpeedVideoFpsRangesFor, (kotlin.jvm.functions.Function0) io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1.INSTANCE);
                this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = fileCacheStorage3;
                this.getHighSpeedVideoFpsRanges = cachedResponseData3;
                this.getInputFormats = mutex3;
                this.getInputSizeshNQ4ISI = 1;
                if (mutex3.lock(null, this) != coroutine_suspended) {
                    cachedResponseData = cachedResponseData3;
                    fileCacheStorage = fileCacheStorage3;
                    mutex2 = mutex3;
                }
                return coroutine_suspended;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) this.getInputFormats;
                cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) this.getHighSpeedVideoFpsRanges;
                fileCacheStorage2 = (io.ktor.client.plugins.cache.storage.FileCacheStorage) this.getHighResolutionOutputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                r1 = mutex4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.util.Set) obj) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.client.plugins.cache.storage.CachedResponseData) obj2).getVaryKeys(), cachedResponseData2.getVaryKeys())) {
                        arrayList.add(obj2);
                    }
                }
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.client.plugins.cache.storage.CachedResponseData>) arrayList, cachedResponseData2);
                this.getHighSpeedVideoFpsRangesFor = r1;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getInputFormats = null;
                this.getInputSizeshNQ4ISI = 3;
                if (io.ktor.client.plugins.cache.storage.FileCacheStorage.getHighResolutionOutputSizeshNQ4ISI(fileCacheStorage2, str, plus, this) != coroutine_suspended) {
                    mutex = r1;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            kotlinx.coroutines.sync.Mutex mutex5 = (kotlinx.coroutines.sync.Mutex) this.getInputFormats;
            cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) this.getHighSpeedVideoFpsRanges;
            fileCacheStorage = (io.ktor.client.plugins.cache.storage.FileCacheStorage) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRangesFor = str2;
            mutex2 = mutex5;
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = fileCacheStorage;
            this.getHighSpeedVideoFpsRanges = cachedResponseData;
            this.getInputFormats = mutex2;
            this.getInputSizeshNQ4ISI = 2;
            highResolutionOutputSizeshNQ4ISI = fileCacheStorage.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, (kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>>) this);
            if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage4 = fileCacheStorage;
                str = highSpeedVideoFpsRangesFor;
                obj = highResolutionOutputSizeshNQ4ISI;
                cachedResponseData2 = cachedResponseData;
                fileCacheStorage2 = fileCacheStorage4;
                r1 = mutex2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (r13.hasNext()) {
                }
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.client.plugins.cache.storage.CachedResponseData>) arrayList2, cachedResponseData2);
                this.getHighSpeedVideoFpsRangesFor = r1;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getInputFormats = null;
                this.getInputSizeshNQ4ISI = 3;
                if (io.ktor.client.plugins.cache.storage.FileCacheStorage.getHighResolutionOutputSizeshNQ4ISI(fileCacheStorage2, str, plus, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex = r1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$store$2(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = fileCacheStorage;
        this.Camera2StreamConfigurationMap = url;
        this.getHighSpeedVideoSizes = cachedResponseData;
    }
}
