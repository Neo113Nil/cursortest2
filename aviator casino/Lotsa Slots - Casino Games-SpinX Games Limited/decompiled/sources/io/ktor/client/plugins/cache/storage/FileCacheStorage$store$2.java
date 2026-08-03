package io.ktor.client.plugins.cache.storage;

/* compiled from: FileCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {254, 257, 258}, m = "invokeSuspend", n = {"urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0"})
/* loaded from: classes6.dex */
final class FileCacheStorage$store$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachedResponseData $data;
    final /* synthetic */ io.ktor.http.Url $url;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$store$2(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2> continuation) {
        super(2, continuation);
        this.this$0 = fileCacheStorage;
        this.$url = url;
        this.$data = cachedResponseData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2(this.this$0, this.$url, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:20:0x0036, B:21:0x009d, B:22:0x00ac, B:24:0x00b2, B:27:0x00c7, B:32:0x00cb, B:38:0x0087), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String key;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.String str;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData2;
        io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage2;
        java.util.List plus;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                key = this.this$0.key(this.$url);
                io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage3 = this.this$0;
                io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData3 = this.$data;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) fileCacheStorage3.mutexes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap) key, (kotlin.jvm.functions.Function0) io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1.INSTANCE);
                this.L$0 = key;
                this.L$1 = fileCacheStorage3;
                this.L$2 = cachedResponseData3;
                this.L$3 = mutex3;
                this.label = 1;
                if (mutex3.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cachedResponseData = cachedResponseData3;
                fileCacheStorage = fileCacheStorage3;
                mutex2 = mutex3;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) this.L$0;
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
                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) this.L$3;
                    cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) this.L$2;
                    fileCacheStorage2 = (io.ktor.client.plugins.cache.storage.FileCacheStorage) this.L$1;
                    str = (java.lang.String) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = mutex4;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.util.Set) obj) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.client.plugins.cache.storage.CachedResponseData) obj2).getVaryKeys(), cachedResponseData2.getVaryKeys())) {
                            arrayList.add(obj2);
                        }
                    }
                    plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.client.plugins.cache.storage.CachedResponseData>) arrayList, cachedResponseData2);
                    this.L$0 = r1;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    if (fileCacheStorage2.writeCacheUnsafe(str, plus, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = r1;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.sync.Mutex mutex5 = (kotlinx.coroutines.sync.Mutex) this.L$3;
                cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) this.L$2;
                fileCacheStorage = (io.ktor.client.plugins.cache.storage.FileCacheStorage) this.L$1;
                java.lang.String str2 = (java.lang.String) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                key = str2;
                mutex2 = mutex5;
            }
            this.L$0 = key;
            this.L$1 = fileCacheStorage;
            this.L$2 = cachedResponseData;
            this.L$3 = mutex2;
            this.label = 2;
            java.lang.Object readCacheUnsafe = fileCacheStorage.readCacheUnsafe(key, this);
            if (readCacheUnsafe == coroutine_suspended) {
                return coroutine_suspended;
            }
            io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage4 = fileCacheStorage;
            str = key;
            obj = readCacheUnsafe;
            cachedResponseData2 = cachedResponseData;
            fileCacheStorage2 = fileCacheStorage4;
            r1 = mutex2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (r13.hasNext()) {
            }
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.client.plugins.cache.storage.CachedResponseData>) arrayList2, cachedResponseData2);
            this.L$0 = r1;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (fileCacheStorage2.writeCacheUnsafe(str, plus, this) != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex = r1;
        }
    }
}
