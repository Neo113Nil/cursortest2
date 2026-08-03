package io.ktor.client.plugins.cache.storage;

/* compiled from: FileCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00132\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001f0\u001eH\u0082H¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b#\u0010\u001dJ&\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0082@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b(\u0010\u001dJ \u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\nH\u0082@¢\u0006\u0004\b,\u0010-J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010*\u001a\u00020.H\u0082@¢\u0006\u0004\b\u001c\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Ljava/io/File;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "", com.ironsource.X3.i.U, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", com.ironsource.X3.i.W, "(Lio/ktor/http/Url;)Ljava/lang/String;", "urlHex", "readCache", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "transform", "updateCache", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCache", "caches", "", "writeCacheUnsafe", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readCacheUnsafe", "Lio/ktor/utils/io/ByteChannel;", "channel", "cache", "writeCache", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lio/ktor/util/collections/ConcurrentMap;", "Lkotlinx/coroutines/sync/Mutex;", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FileCacheStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    private final java.io.File directory;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final io.ktor.util.collections.ConcurrentMap<java.lang.String, kotlinx.coroutines.sync.Mutex> mutexes;

    public FileCacheStorage(java.io.File directory, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    public /* synthetic */ FileCacheStorage(java.io.File file, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2(this, url, cachedResponseData, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object findAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 fileCacheStorage$findAll$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1) {
            fileCacheStorage$findAll$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1) continuation;
            if ((fileCacheStorage$findAll$1.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$findAll$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileCacheStorage$findAll$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileCacheStorage$findAll$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String key = key(url);
                    fileCacheStorage$findAll$1.label = 1;
                    obj = readCache(key, fileCacheStorage$findAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) obj);
            }
        }
        fileCacheStorage$findAll$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1(this, continuation);
        java.lang.Object obj2 = fileCacheStorage$findAll$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$findAll$1.label;
        if (i != 0) {
        }
        return kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 fileCacheStorage$find$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1) {
            fileCacheStorage$find$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1) continuation;
            if ((fileCacheStorage$find$1.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$find$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileCacheStorage$find$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileCacheStorage$find$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String key = key(url);
                    fileCacheStorage$find$1.L$0 = map;
                    fileCacheStorage$find$1.label = 1;
                    obj = readCache(key, fileCacheStorage$find$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) fileCacheStorage$find$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (java.lang.Object obj2 : (java.util.Set) obj) {
                    io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj2;
                    if (map.isEmpty()) {
                        return obj2;
                    }
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    return obj2;
                }
                return null;
            }
        }
        fileCacheStorage$find$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1(this, continuation);
        java.lang.Object obj3 = fileCacheStorage$find$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$find$1.label;
        if (i != 0) {
        }
        while (r6.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:13:0x0031, B:20:0x004e, B:21:0x00a5, B:22:0x00b4, B:24:0x00ba, B:27:0x00cb, B:32:0x00cf, B:36:0x0093), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object remove(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1 fileCacheStorage$remove$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map2;
        kotlinx.coroutines.sync.Mutex mutex;
        io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage;
        java.util.Map<java.lang.String, java.lang.String> map3;
        java.util.ArrayList arrayList;
        try {
            if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1) {
                fileCacheStorage$remove$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1) continuation;
                if ((fileCacheStorage$remove$1.label & Integer.MIN_VALUE) != 0) {
                    fileCacheStorage$remove$1.label -= Integer.MIN_VALUE;
                    obj = fileCacheStorage$remove$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileCacheStorage$remove$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String key = key(url);
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) this.mutexes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap) key, (kotlin.jvm.functions.Function0) io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1.INSTANCE);
                        fileCacheStorage$remove$1.L$0 = map;
                        fileCacheStorage$remove$1.L$1 = key;
                        fileCacheStorage$remove$1.L$2 = this;
                        fileCacheStorage$remove$1.L$3 = mutex2;
                        fileCacheStorage$remove$1.label = 1;
                        if (mutex2.lock(null, fileCacheStorage$remove$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = key;
                        map2 = map;
                        mutex = mutex2;
                        fileCacheStorage = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$remove$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            mutex = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$remove$1.L$3;
                            fileCacheStorage = (io.ktor.client.plugins.cache.storage.FileCacheStorage) fileCacheStorage$remove$1.L$2;
                            str = (java.lang.String) fileCacheStorage$remove$1.L$1;
                            map3 = (java.util.Map) fileCacheStorage$remove$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : (java.util.Set) obj) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.client.plugins.cache.storage.CachedResponseData) obj2).getVaryKeys(), map3)) {
                                    arrayList.add(obj2);
                                }
                            }
                            fileCacheStorage$remove$1.L$0 = mutex;
                            fileCacheStorage$remove$1.L$1 = null;
                            fileCacheStorage$remove$1.L$2 = null;
                            fileCacheStorage$remove$1.L$3 = null;
                            fileCacheStorage$remove$1.label = 3;
                            if (fileCacheStorage.writeCacheUnsafe(str, arrayList, fileCacheStorage$remove$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$remove$1.L$3;
                        fileCacheStorage = (io.ktor.client.plugins.cache.storage.FileCacheStorage) fileCacheStorage$remove$1.L$2;
                        str = (java.lang.String) fileCacheStorage$remove$1.L$1;
                        map2 = (java.util.Map) fileCacheStorage$remove$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    fileCacheStorage$remove$1.L$0 = map2;
                    fileCacheStorage$remove$1.L$1 = str;
                    fileCacheStorage$remove$1.L$2 = fileCacheStorage;
                    fileCacheStorage$remove$1.L$3 = mutex;
                    fileCacheStorage$remove$1.label = 2;
                    obj = fileCacheStorage.readCacheUnsafe(str, fileCacheStorage$remove$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map3 = map2;
                    arrayList = new java.util.ArrayList();
                    while (r12.hasNext()) {
                    }
                    fileCacheStorage$remove$1.L$0 = mutex;
                    fileCacheStorage$remove$1.L$1 = null;
                    fileCacheStorage$remove$1.L$2 = null;
                    fileCacheStorage$remove$1.L$3 = null;
                    fileCacheStorage$remove$1.label = 3;
                    if (fileCacheStorage.writeCacheUnsafe(str, arrayList, fileCacheStorage$remove$1) == coroutine_suspended) {
                    }
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            fileCacheStorage$remove$1.L$0 = map2;
            fileCacheStorage$remove$1.L$1 = str;
            fileCacheStorage$remove$1.L$2 = fileCacheStorage;
            fileCacheStorage$remove$1.L$3 = mutex;
            fileCacheStorage$remove$1.label = 2;
            obj = fileCacheStorage.readCacheUnsafe(str, fileCacheStorage$remove$1);
            if (obj != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th) {
            url.unlock(null);
            throw th;
        }
        fileCacheStorage$remove$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1(this, continuation);
        obj = fileCacheStorage$remove$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$remove$1.label;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object removeAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object deleteCache = deleteCache(key(url), continuation);
        return deleteCache == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteCache : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String key(io.ktor.http.Url url) {
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(kotlin.text.StringsKt.encodeToByteArray(url.getUrlString()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return io.ktor.util.CryptoKt.hex(digest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readCache(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1 fileCacheStorage$readCache$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex computeIfAbsent;
        java.lang.Throwable th;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object readCacheUnsafe;
        try {
            if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1) {
                fileCacheStorage$readCache$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1) continuation;
                if ((fileCacheStorage$readCache$1.label & Integer.MIN_VALUE) != 0) {
                    fileCacheStorage$readCache$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = fileCacheStorage$readCache$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileCacheStorage$readCache$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        computeIfAbsent = this.mutexes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<java.lang.String, kotlinx.coroutines.sync.Mutex>) str, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlinx.coroutines.sync.Mutex readCache$lambda$4;
                                readCache$lambda$4 = io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache$lambda$4();
                                return readCache$lambda$4;
                            }
                        });
                        fileCacheStorage$readCache$1.L$0 = str;
                        fileCacheStorage$readCache$1.L$1 = computeIfAbsent;
                        fileCacheStorage$readCache$1.label = 1;
                        if (computeIfAbsent.lock(null, fileCacheStorage$readCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$readCache$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                java.util.Set set = (java.util.Set) obj;
                                mutex.unlock(null);
                                return set;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$readCache$1.L$1;
                        java.lang.String str2 = (java.lang.String) fileCacheStorage$readCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        computeIfAbsent = mutex2;
                        str = str2;
                    }
                    fileCacheStorage$readCache$1.L$0 = computeIfAbsent;
                    fileCacheStorage$readCache$1.L$1 = null;
                    fileCacheStorage$readCache$1.label = 2;
                    readCacheUnsafe = readCacheUnsafe(str, fileCacheStorage$readCache$1);
                    if (readCacheUnsafe != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.sync.Mutex mutex3 = computeIfAbsent;
                    obj = readCacheUnsafe;
                    mutex = mutex3;
                    java.util.Set set2 = (java.util.Set) obj;
                    mutex.unlock(null);
                    return set2;
                }
            }
            fileCacheStorage$readCache$1.L$0 = computeIfAbsent;
            fileCacheStorage$readCache$1.L$1 = null;
            fileCacheStorage$readCache$1.label = 2;
            readCacheUnsafe = readCacheUnsafe(str, fileCacheStorage$readCache$1);
            if (readCacheUnsafe != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.sync.Mutex mutex4 = computeIfAbsent;
            th = th3;
            mutex = mutex4;
            mutex.unlock(null);
            throw th;
        }
        fileCacheStorage$readCache$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1(this, continuation);
        java.lang.Object obj2 = fileCacheStorage$readCache$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$readCache$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.sync.Mutex readCache$lambda$4() {
        return kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    private final java.lang.Object updateCache(java.lang.String str, kotlin.jvm.functions.Function1<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>, ? extends java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData>> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.sync.Mutex mutex = (kotlinx.coroutines.sync.Mutex) this.mutexes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap) str, (kotlin.jvm.functions.Function0) io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1.INSTANCE);
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(null, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            kotlin.jvm.internal.InlineMarker.mark(3);
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object readCacheUnsafe = readCacheUnsafe(str, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> invoke = function1.invoke((java.util.Set) readCacheUnsafe);
            kotlin.jvm.internal.InlineMarker.mark(3);
            kotlin.jvm.internal.InlineMarker.mark(0);
            writeCacheUnsafe(str, invoke, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCache(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1 fileCacheStorage$deleteCache$1;
        int i;
        kotlinx.coroutines.sync.Mutex computeIfAbsent;
        java.io.File file;
        try {
            if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1) {
                fileCacheStorage$deleteCache$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1) continuation;
                if ((fileCacheStorage$deleteCache$1.label & Integer.MIN_VALUE) != 0) {
                    fileCacheStorage$deleteCache$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = fileCacheStorage$deleteCache$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileCacheStorage$deleteCache$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        computeIfAbsent = this.mutexes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<java.lang.String, kotlinx.coroutines.sync.Mutex>) str, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlinx.coroutines.sync.Mutex deleteCache$lambda$7;
                                deleteCache$lambda$7 = io.ktor.client.plugins.cache.storage.FileCacheStorage.deleteCache$lambda$7();
                                return deleteCache$lambda$7;
                            }
                        });
                        fileCacheStorage$deleteCache$1.L$0 = str;
                        fileCacheStorage$deleteCache$1.L$1 = computeIfAbsent;
                        fileCacheStorage$deleteCache$1.label = 1;
                        if (computeIfAbsent.lock(null, fileCacheStorage$deleteCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex = (kotlinx.coroutines.sync.Mutex) fileCacheStorage$deleteCache$1.L$1;
                        java.lang.String str2 = (java.lang.String) fileCacheStorage$deleteCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        computeIfAbsent = mutex;
                        str = str2;
                    }
                    file = new java.io.File(this.directory, str);
                    if (file.exists()) {
                        try {
                            file.delete();
                        } catch (java.lang.Exception e) {
                            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                                logger.trace("Exception during cache deletion in a file: " + kotlin.ExceptionsKt.stackTraceToString(e));
                            }
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    computeIfAbsent.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            file = new java.io.File(this.directory, str);
            if (file.exists()) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            computeIfAbsent.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            computeIfAbsent.unlock(null);
            throw th;
        }
        fileCacheStorage$deleteCache$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1(this, continuation);
        java.lang.Object obj2 = fileCacheStorage$deleteCache$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$deleteCache$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.sync.Mutex deleteCache$lambda$7() {
        return kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object writeCacheUnsafe(java.lang.String str, java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2(this, str, list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003e, blocks: (B:13:0x0039, B:26:0x00e0, B:30:0x0101), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003e, blocks: (B:13:0x0039, B:26:0x00e0, B:30:0x0101), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r19v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f5 -> B:23:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readCacheUnsafe(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1 fileCacheStorage$readCacheUnsafe$1;
        int i;
        java.lang.Throwable th;
        ?? r2;
        java.io.BufferedInputStream bufferedInputStream;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        java.util.LinkedHashSet linkedHashSet;
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1 fileCacheStorage$readCacheUnsafe$12;
        java.io.Closeable closeable;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i2;
        int i3;
        java.lang.Throwable th2;
        java.util.Set set;
        try {
            if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1) {
                io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1 fileCacheStorage$readCacheUnsafe$13 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1) continuation;
                if ((fileCacheStorage$readCacheUnsafe$13.label & Integer.MIN_VALUE) != 0) {
                    fileCacheStorage$readCacheUnsafe$13.label -= Integer.MIN_VALUE;
                    fileCacheStorage$readCacheUnsafe$1 = fileCacheStorage$readCacheUnsafe$13;
                    java.lang.Object obj = fileCacheStorage$readCacheUnsafe$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileCacheStorage$readCacheUnsafe$1.label;
                    java.lang.Throwable th3 = null;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.io.File file = new java.io.File(this.directory, str);
                        if (!file.exists()) {
                            return kotlin.collections.SetsKt.emptySet();
                        }
                        try {
                            java.io.InputStream fileInputStream = new java.io.FileInputStream(file);
                            bufferedInputStream = fileInputStream instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) fileInputStream : new java.io.BufferedInputStream(fileInputStream, 8192);
                            try {
                                io.ktor.utils.io.ByteReadChannel byteReadChannelWithArrayPool$default = io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannelWithArrayPool$default(bufferedInputStream, null, null, 3, null);
                                fileCacheStorage$readCacheUnsafe$1.L$0 = bufferedInputStream;
                                fileCacheStorage$readCacheUnsafe$1.L$1 = byteReadChannelWithArrayPool$default;
                                fileCacheStorage$readCacheUnsafe$1.label = 1;
                                java.lang.Object readInt = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannelWithArrayPool$default, fileCacheStorage$readCacheUnsafe$1);
                                if (readInt == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel = byteReadChannelWithArrayPool$default;
                                obj = readInt;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r2 = bufferedInputStream;
                                throw th;
                            }
                        } catch (java.lang.Exception e) {
                            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                                logger.trace("Exception during cache lookup in a file: " + kotlin.ExceptionsKt.stackTraceToString(e));
                            }
                            return kotlin.collections.SetsKt.emptySet();
                        }
                    } else if (i == 1) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCacheUnsafe$1.L$1;
                        ?? r9 = (java.io.Closeable) fileCacheStorage$readCacheUnsafe$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            byteReadChannel = byteReadChannel3;
                            bufferedInputStream = r9;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            r2 = r9;
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            set = (java.util.Set) fileCacheStorage$readCacheUnsafe$1.L$1;
                            closeable = (java.io.Closeable) fileCacheStorage$readCacheUnsafe$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.io.CloseableKt.closeFinally(closeable, th3);
                            return set;
                        }
                        i2 = fileCacheStorage$readCacheUnsafe$1.I$1;
                        i3 = fileCacheStorage$readCacheUnsafe$1.I$0;
                        linkedHashSet = (java.util.Set) fileCacheStorage$readCacheUnsafe$1.L$3;
                        java.util.Set set2 = (java.util.Set) fileCacheStorage$readCacheUnsafe$1.L$2;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCacheUnsafe$1.L$1;
                        java.io.Closeable closeable2 = (java.io.Closeable) fileCacheStorage$readCacheUnsafe$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            fileCacheStorage$readCacheUnsafe$12 = fileCacheStorage$readCacheUnsafe$1;
                            java.lang.Throwable th6 = null;
                            linkedHashSet.add(obj);
                            i2++;
                            th2 = th6;
                            linkedHashSet = set2;
                            closeable = closeable2;
                            if (i2 >= i3) {
                                fileCacheStorage$readCacheUnsafe$12.L$0 = closeable;
                                fileCacheStorage$readCacheUnsafe$12.L$1 = byteReadChannel2;
                                fileCacheStorage$readCacheUnsafe$12.L$2 = linkedHashSet;
                                fileCacheStorage$readCacheUnsafe$12.L$3 = linkedHashSet;
                                fileCacheStorage$readCacheUnsafe$12.I$0 = i3;
                                fileCacheStorage$readCacheUnsafe$12.I$1 = i2;
                                fileCacheStorage$readCacheUnsafe$12.label = 2;
                                java.lang.Object readCache = readCache(byteReadChannel2, fileCacheStorage$readCacheUnsafe$12);
                                if (readCache == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                closeable2 = closeable;
                                th6 = th2;
                                obj = readCache;
                                set2 = linkedHashSet;
                                linkedHashSet.add(obj);
                                i2++;
                                th2 = th6;
                                linkedHashSet = set2;
                                closeable = closeable2;
                                if (i2 >= i3) {
                                    fileCacheStorage$readCacheUnsafe$12.L$0 = closeable;
                                    fileCacheStorage$readCacheUnsafe$12.L$1 = linkedHashSet;
                                    fileCacheStorage$readCacheUnsafe$12.L$2 = null;
                                    fileCacheStorage$readCacheUnsafe$12.L$3 = null;
                                    fileCacheStorage$readCacheUnsafe$12.label = 3;
                                    if (io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(byteReadChannel2, 0L, fileCacheStorage$readCacheUnsafe$12, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    th3 = th2;
                                    set = linkedHashSet;
                                    kotlin.io.CloseableKt.closeFinally(closeable, th3);
                                    return set;
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            r2 = closeable2;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th8) {
                                kotlin.io.CloseableKt.closeFinally(r2, th);
                                throw th8;
                            }
                        }
                    }
                    int intValue = ((java.lang.Number) obj).intValue();
                    linkedHashSet = new java.util.LinkedHashSet();
                    fileCacheStorage$readCacheUnsafe$12 = fileCacheStorage$readCacheUnsafe$1;
                    closeable = bufferedInputStream;
                    byteReadChannel2 = byteReadChannel;
                    i2 = 0;
                    i3 = intValue;
                    th2 = null;
                    if (i2 >= i3) {
                    }
                }
            }
            if (i != 0) {
            }
            int intValue2 = ((java.lang.Number) obj).intValue();
            linkedHashSet = new java.util.LinkedHashSet();
            fileCacheStorage$readCacheUnsafe$12 = fileCacheStorage$readCacheUnsafe$1;
            closeable = bufferedInputStream;
            byteReadChannel2 = byteReadChannel;
            i2 = 0;
            i3 = intValue2;
            th2 = null;
            if (i2 >= i3) {
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            r2 = fileCacheStorage$readCacheUnsafe$1;
        }
        fileCacheStorage$readCacheUnsafe$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1(this, continuation);
        java.lang.Object obj2 = fileCacheStorage$readCacheUnsafe$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$readCacheUnsafe$1.label;
        java.lang.Throwable th32 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x033a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0303 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0290 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0304 -> B:20:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0223 -> B:49:0x01bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeCache(io.ktor.utils.io.ByteChannel byteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1 fileCacheStorage$writeCache$1;
        int value;
        io.ktor.utils.io.ByteChannel byteChannel2;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData2;
        java.lang.String str;
        java.lang.String sb;
        io.ktor.utils.io.ByteChannel byteChannel3;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData3;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> flattenEntries;
        int size;
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it;
        java.lang.String str2;
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it2;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData4;
        io.ktor.utils.io.ByteChannel byteChannel4;
        java.lang.String str3;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData5;
        io.ktor.utils.io.ByteChannel byteChannel5;
        long timestamp;
        long timestamp2;
        int size2;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it3;
        java.lang.String str4;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it4;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData6;
        io.ktor.utils.io.ByteChannel byteChannel6;
        java.lang.String str5;
        io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1 fileCacheStorage$writeCache$12;
        byte[] body;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1) {
            fileCacheStorage$writeCache$1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1) continuation;
            if ((fileCacheStorage$writeCache$1.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$writeCache$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileCacheStorage$writeCache$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (fileCacheStorage$writeCache$1.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(cachedResponseData.getUrl());
                        sb2.append('\n');
                        java.lang.String sb3 = sb2.toString();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$1.label = 1;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel, sb3, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        value = cachedResponseData.getStatusCode().getValue();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$1.label = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel, value, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData7 = cachedResponseData;
                        byteChannel2 = byteChannel;
                        cachedResponseData2 = cachedResponseData7;
                        str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                        fileCacheStorage$writeCache$1.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$1.label = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel2, str, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(cachedResponseData2.getVersion());
                        sb4.append('\n');
                        sb = sb4.toString();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$1.label = 4;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel2, sb, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = io.ktor.util.StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$1.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$1.label = 5;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel3, size, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                            kotlin.Pair<java.lang.String, java.lang.String> next = it.next();
                            java.lang.String component1 = next.component1();
                            java.lang.String component2 = next.component2();
                            java.lang.String str6 = component1 + '\n';
                            fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                            fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                            fileCacheStorage$writeCache$1.L$2 = it;
                            fileCacheStorage$writeCache$1.L$3 = component2;
                            fileCacheStorage$writeCache$1.label = 6;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel3, str6, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteChannel4 = byteChannel3;
                            cachedResponseData4 = cachedResponseData3;
                            it2 = it;
                            str2 = component2;
                            str3 = str2 + '\n';
                            fileCacheStorage$writeCache$1.L$0 = byteChannel4;
                            fileCacheStorage$writeCache$1.L$1 = cachedResponseData4;
                            fileCacheStorage$writeCache$1.L$2 = it2;
                            fileCacheStorage$writeCache$1.L$3 = null;
                            fileCacheStorage$writeCache$1.label = 7;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel4, str3, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = it2;
                            cachedResponseData3 = cachedResponseData4;
                            byteChannel3 = byteChannel4;
                            if (it.hasNext()) {
                                long timestamp3 = cachedResponseData3.getRequestTime().getTimestamp();
                                fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                                fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                                fileCacheStorage$writeCache$1.L$2 = null;
                                fileCacheStorage$writeCache$1.label = 8;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel3, timestamp3, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                cachedResponseData5 = cachedResponseData3;
                                byteChannel5 = byteChannel3;
                                timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                                fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$1.label = 9;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel5, timestamp, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                                fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$1.label = 10;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel5, timestamp2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                size2 = cachedResponseData5.getVaryKeys().size();
                                fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$1.label = 11;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel5, size2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                                if (it3.hasNext()) {
                                    java.util.Map.Entry<java.lang.String, java.lang.String> next2 = it3.next();
                                    java.lang.String key = next2.getKey();
                                    java.lang.String value2 = next2.getValue();
                                    java.lang.String str7 = key + '\n';
                                    fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                                    fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                                    fileCacheStorage$writeCache$1.L$2 = it3;
                                    fileCacheStorage$writeCache$1.L$3 = value2;
                                    fileCacheStorage$writeCache$1.label = 12;
                                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel5, str7, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteChannel6 = byteChannel5;
                                    it4 = it3;
                                    cachedResponseData6 = cachedResponseData5;
                                    str4 = value2;
                                    str5 = str4 + '\n';
                                    fileCacheStorage$writeCache$1.L$0 = byteChannel6;
                                    fileCacheStorage$writeCache$1.L$1 = cachedResponseData6;
                                    fileCacheStorage$writeCache$1.L$2 = it4;
                                    fileCacheStorage$writeCache$1.L$3 = null;
                                    fileCacheStorage$writeCache$1.label = 13;
                                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel6, str5, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it3 = it4;
                                    cachedResponseData5 = cachedResponseData6;
                                    byteChannel5 = byteChannel6;
                                    if (it3.hasNext()) {
                                        int length = cachedResponseData5.getBody().length;
                                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                                        fileCacheStorage$writeCache$1.L$2 = null;
                                        fileCacheStorage$writeCache$1.label = 14;
                                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel5, length, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        fileCacheStorage$writeCache$12 = fileCacheStorage$writeCache$1;
                                        body = cachedResponseData5.getBody();
                                        fileCacheStorage$writeCache$12.L$0 = null;
                                        fileCacheStorage$writeCache$12.L$1 = null;
                                        fileCacheStorage$writeCache$12.label = 15;
                                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteChannel5, body, 0, 0, fileCacheStorage$writeCache$12, 6, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    case 1:
                        cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        value = cachedResponseData.getStatusCode().getValue();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$1.label = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel, value, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                        fileCacheStorage$writeCache$1.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$1.label = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel2, str, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                        sb42.append(cachedResponseData2.getVersion());
                        sb42.append('\n');
                        sb = sb42.toString();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$1.label = 4;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel2, sb, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = io.ktor.util.StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$1.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$1.label = 5;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel3, size, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 3:
                        cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.StringBuilder sb422 = new java.lang.StringBuilder();
                        sb422.append(cachedResponseData2.getVersion());
                        sb422.append('\n');
                        sb = sb422.toString();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$1.label = 4;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel2, sb, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = io.ktor.util.StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$1.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$1.label = 5;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel3, size, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 4:
                        cachedResponseData2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = io.ktor.util.StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$1.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$1.label = 5;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel3, size, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 5:
                        flattenEntries = (java.util.List) fileCacheStorage$writeCache$1.L$2;
                        cachedResponseData3 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel3 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        str2 = (java.lang.String) fileCacheStorage$writeCache$1.L$3;
                        it2 = (java.util.Iterator) fileCacheStorage$writeCache$1.L$2;
                        cachedResponseData4 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel4 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = str2 + '\n';
                        fileCacheStorage$writeCache$1.L$0 = byteChannel4;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData4;
                        fileCacheStorage$writeCache$1.L$2 = it2;
                        fileCacheStorage$writeCache$1.L$3 = null;
                        fileCacheStorage$writeCache$1.label = 7;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel4, str3, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        it = (java.util.Iterator) fileCacheStorage$writeCache$1.L$2;
                        cachedResponseData3 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel3 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (it.hasNext()) {
                        }
                        break;
                    case 8:
                        cachedResponseData5 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel5 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 9;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel5, timestamp, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 10;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel5, timestamp2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 11;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel5, size2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 9:
                        cachedResponseData5 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel5 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 10;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(byteChannel5, timestamp2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 11;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel5, size2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 10:
                        cachedResponseData5 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel5 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$1.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$1.label = 11;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteChannel5, size2, fileCacheStorage$writeCache$1) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 11:
                        cachedResponseData5 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel5 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 12:
                        str4 = (java.lang.String) fileCacheStorage$writeCache$1.L$3;
                        it4 = (java.util.Iterator) fileCacheStorage$writeCache$1.L$2;
                        cachedResponseData6 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel6 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str5 = str4 + '\n';
                        fileCacheStorage$writeCache$1.L$0 = byteChannel6;
                        fileCacheStorage$writeCache$1.L$1 = cachedResponseData6;
                        fileCacheStorage$writeCache$1.L$2 = it4;
                        fileCacheStorage$writeCache$1.L$3 = null;
                        fileCacheStorage$writeCache$1.label = 13;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(byteChannel6, str5, fileCacheStorage$writeCache$1) != coroutine_suspended) {
                        }
                        break;
                    case 13:
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it5 = (java.util.Iterator) fileCacheStorage$writeCache$1.L$2;
                        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData8 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        io.ktor.utils.io.ByteChannel byteChannel7 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it3 = it5;
                        cachedResponseData5 = cachedResponseData8;
                        byteChannel5 = byteChannel7;
                        if (it3.hasNext()) {
                        }
                        break;
                    case 14:
                        cachedResponseData5 = (io.ktor.client.plugins.cache.storage.CachedResponseData) fileCacheStorage$writeCache$1.L$1;
                        byteChannel5 = (io.ktor.utils.io.ByteChannel) fileCacheStorage$writeCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        fileCacheStorage$writeCache$12 = fileCacheStorage$writeCache$1;
                        body = cachedResponseData5.getBody();
                        fileCacheStorage$writeCache$12.L$0 = null;
                        fileCacheStorage$writeCache$12.L$1 = null;
                        fileCacheStorage$writeCache$12.label = 15;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteChannel5, body, 0, 0, fileCacheStorage$writeCache$12, 6, null) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    case 15:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fileCacheStorage$writeCache$1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1(this, continuation);
        java.lang.Object obj2 = fileCacheStorage$writeCache$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (fileCacheStorage$writeCache$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0449 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x037e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0330 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x044a -> B:20:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0331 -> B:52:0x01cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readCache(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3 fileCacheStorage$readCache$3;
        java.lang.Object readInt;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        java.lang.String str;
        int intValue;
        java.lang.Object readUTF8Line$default;
        io.ktor.http.HttpProtocolVersion.Companion companion;
        java.lang.Object readUTF8Line$default2;
        java.lang.String str2;
        io.ktor.http.HttpStatusCode httpStatusCode;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        io.ktor.http.HttpProtocolVersion parse;
        java.lang.Object obj;
        io.ktor.http.HeadersBuilder headersBuilder;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.String str3;
        io.ktor.http.HttpStatusCode httpStatusCode2;
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3 fileCacheStorage$readCache$32;
        int i;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion;
        int i2;
        int i3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel5;
        java.lang.String str4;
        io.ktor.http.HttpStatusCode httpStatusCode3;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion2;
        io.ktor.http.HeadersBuilder headersBuilder2;
        java.lang.String str5;
        int i4;
        java.lang.Object readUTF8Line$default3;
        io.ktor.http.HeadersBuilder headersBuilder3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel6;
        java.lang.String str6;
        io.ktor.http.HttpStatusCode httpStatusCode4;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion3;
        io.ktor.util.date.GMTDate GMTDate;
        java.lang.Object readLong;
        io.ktor.utils.io.ByteReadChannel byteReadChannel7;
        io.ktor.http.HttpStatusCode httpStatusCode5;
        io.ktor.http.HeadersBuilder headersBuilder4;
        io.ktor.util.date.GMTDate gMTDate;
        java.lang.String str7;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion4;
        io.ktor.util.date.GMTDate gMTDate2;
        io.ktor.util.date.GMTDate GMTDate2;
        int intValue2;
        java.util.Map createMapBuilder;
        io.ktor.utils.io.ByteReadChannel byteReadChannel8;
        java.util.Map map;
        java.lang.String str8;
        io.ktor.http.HttpStatusCode httpStatusCode6;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion5;
        io.ktor.http.HeadersBuilder headersBuilder5;
        io.ktor.util.date.GMTDate gMTDate3;
        io.ktor.util.date.GMTDate gMTDate4;
        int i5;
        int i6;
        java.lang.Object obj2;
        int i7;
        io.ktor.utils.io.ByteReadChannel byteReadChannel9;
        io.ktor.http.HeadersBuilder headersBuilder6;
        java.util.Map map2;
        java.lang.String str9;
        io.ktor.util.date.GMTDate gMTDate5;
        java.util.Map map3;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion6;
        io.ktor.util.date.GMTDate gMTDate6;
        io.ktor.http.HttpStatusCode httpStatusCode7;
        io.ktor.util.date.GMTDate gMTDate7;
        java.lang.String str10;
        int i8;
        int i9;
        java.lang.Object readUTF8Line$default4;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion7;
        java.util.Map map4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel10;
        int i10;
        io.ktor.util.date.GMTDate gMTDate8;
        io.ktor.http.HeadersBuilder headersBuilder7;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion8;
        io.ktor.utils.io.ByteReadChannel byteReadChannel11;
        io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3 fileCacheStorage$readCache$33;
        io.ktor.util.date.GMTDate gMTDate9;
        java.lang.String str11;
        io.ktor.http.HttpStatusCode httpStatusCode8;
        io.ktor.util.date.GMTDate gMTDate10;
        java.util.Map map5;
        byte[] bArr;
        java.util.Map map6;
        byte[] bArr2;
        io.ktor.util.date.GMTDate gMTDate11;
        io.ktor.util.date.GMTDate gMTDate12;
        io.ktor.util.date.GMTDate gMTDate13;
        io.ktor.http.HeadersBuilder headersBuilder8;
        io.ktor.http.HttpProtocolVersion httpProtocolVersion9;
        io.ktor.http.HttpStatusCode httpStatusCode9;
        io.ktor.utils.io.ByteReadChannel byteReadChannel12 = byteReadChannel;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3) {
            fileCacheStorage$readCache$3 = (io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3) continuation;
            if ((fileCacheStorage$readCache$3.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$readCache$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj3 = fileCacheStorage$readCache$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (fileCacheStorage$readCache$3.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel12;
                        fileCacheStorage$readCache$3.label = 1;
                        java.lang.Object readUTF8Line$default5 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel12, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj3 = readUTF8Line$default5;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        java.lang.String str12 = (java.lang.String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel12;
                        fileCacheStorage$readCache$3.L$1 = str12;
                        fileCacheStorage$readCache$3.label = 2;
                        readInt = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel12, fileCacheStorage$readCache$3);
                        if (readInt != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel12;
                        str = str12;
                        obj3 = readInt;
                        intValue = ((java.lang.Number) obj3).intValue();
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.I$0 = intValue;
                        fileCacheStorage$readCache$3.label = 3;
                        readUTF8Line$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj3 = readUTF8Line$default;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        io.ktor.http.HttpStatusCode httpStatusCode10 = new io.ktor.http.HttpStatusCode(intValue, (java.lang.String) obj3);
                        companion = io.ktor.http.HttpProtocolVersion.INSTANCE;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode10;
                        fileCacheStorage$readCache$3.L$3 = companion;
                        fileCacheStorage$readCache$3.label = 4;
                        readUTF8Line$default2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj3 = readUTF8Line$default2;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel13 = byteReadChannel2;
                        str2 = str;
                        httpStatusCode = httpStatusCode10;
                        byteReadChannel3 = byteReadChannel13;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        parse = companion.parse((java.lang.CharSequence) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                        fileCacheStorage$readCache$3.L$1 = str2;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                        fileCacheStorage$readCache$3.L$3 = parse;
                        fileCacheStorage$readCache$3.label = 5;
                        obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel3, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int intValue3 = ((java.lang.Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
                        byteReadChannel4 = byteReadChannel3;
                        str3 = str2;
                        httpStatusCode2 = httpStatusCode;
                        fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                        i = intValue3;
                        httpProtocolVersion = parse;
                        i2 = 0;
                        if (i2 < i) {
                            fileCacheStorage$readCache$32.L$0 = byteReadChannel4;
                            fileCacheStorage$readCache$32.L$1 = str3;
                            fileCacheStorage$readCache$32.L$2 = httpStatusCode2;
                            fileCacheStorage$readCache$32.L$3 = httpProtocolVersion;
                            fileCacheStorage$readCache$32.L$4 = headersBuilder;
                            fileCacheStorage$readCache$32.L$5 = obj;
                            fileCacheStorage$readCache$32.I$0 = i;
                            fileCacheStorage$readCache$32.I$1 = i2;
                            fileCacheStorage$readCache$32.label = 6;
                            java.lang.Object readUTF8Line$default6 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel4, 0, fileCacheStorage$readCache$32, 1, obj);
                            if (readUTF8Line$default6 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str4 = str3;
                            byteReadChannel5 = byteReadChannel4;
                            headersBuilder2 = headersBuilder;
                            httpProtocolVersion2 = httpProtocolVersion;
                            httpStatusCode3 = httpStatusCode2;
                            obj3 = readUTF8Line$default6;
                            io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3 fileCacheStorage$readCache$34 = fileCacheStorage$readCache$32;
                            i3 = i;
                            fileCacheStorage$readCache$3 = fileCacheStorage$readCache$34;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                            str5 = (java.lang.String) obj3;
                            fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                            fileCacheStorage$readCache$3.L$1 = str4;
                            fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                            fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                            fileCacheStorage$readCache$3.L$4 = headersBuilder2;
                            fileCacheStorage$readCache$3.L$5 = str5;
                            fileCacheStorage$readCache$3.I$0 = i3;
                            fileCacheStorage$readCache$3.I$1 = i2;
                            fileCacheStorage$readCache$3.label = 7;
                            i4 = 1;
                            readUTF8Line$default3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, fileCacheStorage$readCache$3, 1, null);
                            if (readUTF8Line$default3 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = readUTF8Line$default3;
                            int i11 = i3;
                            fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                            i = i11;
                            java.lang.String str13 = str4;
                            io.ktor.http.HeadersBuilder headersBuilder9 = headersBuilder2;
                            str3 = str13;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                            headersBuilder9.append(str5, (java.lang.String) obj3);
                            i2 += i4;
                            httpProtocolVersion = httpProtocolVersion2;
                            httpStatusCode2 = httpStatusCode3;
                            headersBuilder = headersBuilder9;
                            byteReadChannel4 = byteReadChannel5;
                            obj = null;
                            if (i2 < i) {
                                fileCacheStorage$readCache$32.L$0 = byteReadChannel4;
                                fileCacheStorage$readCache$32.L$1 = str3;
                                fileCacheStorage$readCache$32.L$2 = httpStatusCode2;
                                fileCacheStorage$readCache$32.L$3 = httpProtocolVersion;
                                fileCacheStorage$readCache$32.L$4 = headersBuilder;
                                fileCacheStorage$readCache$32.L$5 = null;
                                fileCacheStorage$readCache$32.label = 8;
                                java.lang.Object readLong2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel4, fileCacheStorage$readCache$32);
                                if (readLong2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                fileCacheStorage$readCache$3 = fileCacheStorage$readCache$32;
                                headersBuilder3 = headersBuilder;
                                byteReadChannel6 = byteReadChannel4;
                                str6 = str3;
                                httpStatusCode4 = httpStatusCode2;
                                httpProtocolVersion3 = httpProtocolVersion;
                                obj3 = readLong2;
                                GMTDate = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                                fileCacheStorage$readCache$3.L$1 = str6;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                                fileCacheStorage$readCache$3.L$5 = GMTDate;
                                fileCacheStorage$readCache$3.label = 9;
                                obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel6, fileCacheStorage$readCache$3);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                io.ktor.util.date.GMTDate GMTDate3 = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                                fileCacheStorage$readCache$3.L$1 = str6;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                                fileCacheStorage$readCache$3.L$5 = GMTDate;
                                fileCacheStorage$readCache$3.L$6 = GMTDate3;
                                fileCacheStorage$readCache$3.label = 10;
                                readLong = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel6, fileCacheStorage$readCache$3);
                                if (readLong == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel7 = byteReadChannel6;
                                httpStatusCode5 = httpStatusCode4;
                                headersBuilder4 = headersBuilder3;
                                gMTDate = GMTDate3;
                                obj3 = readLong;
                                str7 = str6;
                                httpProtocolVersion4 = httpProtocolVersion3;
                                gMTDate2 = GMTDate;
                                GMTDate2 = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel7;
                                fileCacheStorage$readCache$3.L$1 = str7;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode5;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion4;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                                fileCacheStorage$readCache$3.L$5 = gMTDate2;
                                fileCacheStorage$readCache$3.L$6 = gMTDate;
                                fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                fileCacheStorage$readCache$3.label = 11;
                                obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel7, fileCacheStorage$readCache$3);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                intValue2 = ((java.lang.Number) obj3).intValue();
                                createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                                byteReadChannel8 = byteReadChannel7;
                                map = createMapBuilder;
                                str8 = str7;
                                httpStatusCode6 = httpStatusCode5;
                                httpProtocolVersion5 = httpProtocolVersion4;
                                headersBuilder5 = headersBuilder4;
                                gMTDate3 = gMTDate2;
                                gMTDate4 = gMTDate;
                                i5 = 0;
                                if (i5 < intValue2) {
                                    fileCacheStorage$readCache$3.L$0 = byteReadChannel8;
                                    fileCacheStorage$readCache$3.L$1 = str8;
                                    fileCacheStorage$readCache$3.L$2 = httpStatusCode6;
                                    fileCacheStorage$readCache$3.L$3 = httpProtocolVersion5;
                                    fileCacheStorage$readCache$3.L$4 = headersBuilder5;
                                    fileCacheStorage$readCache$3.L$5 = gMTDate3;
                                    fileCacheStorage$readCache$3.L$6 = gMTDate4;
                                    fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                    fileCacheStorage$readCache$3.L$8 = createMapBuilder;
                                    fileCacheStorage$readCache$3.L$9 = map;
                                    fileCacheStorage$readCache$3.L$10 = null;
                                    fileCacheStorage$readCache$3.I$0 = intValue2;
                                    fileCacheStorage$readCache$3.I$1 = i5;
                                    int i12 = intValue2;
                                    fileCacheStorage$readCache$3.label = 12;
                                    int i13 = i5;
                                    obj2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel8, 0, fileCacheStorage$readCache$3, 1, null);
                                    if (obj2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i6 = i12;
                                    headersBuilder6 = headersBuilder5;
                                    httpStatusCode7 = httpStatusCode6;
                                    map3 = map;
                                    i7 = i13;
                                    gMTDate5 = gMTDate3;
                                    str9 = str8;
                                    map2 = createMapBuilder;
                                    gMTDate6 = GMTDate2;
                                    byteReadChannel9 = byteReadChannel8;
                                    gMTDate7 = gMTDate4;
                                    httpProtocolVersion6 = httpProtocolVersion5;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                                    str10 = (java.lang.String) obj2;
                                    fileCacheStorage$readCache$3.L$0 = byteReadChannel9;
                                    fileCacheStorage$readCache$3.L$1 = str9;
                                    fileCacheStorage$readCache$3.L$2 = httpStatusCode7;
                                    fileCacheStorage$readCache$3.L$3 = httpProtocolVersion6;
                                    fileCacheStorage$readCache$3.L$4 = headersBuilder6;
                                    fileCacheStorage$readCache$3.L$5 = gMTDate5;
                                    fileCacheStorage$readCache$3.L$6 = gMTDate7;
                                    fileCacheStorage$readCache$3.L$7 = gMTDate6;
                                    fileCacheStorage$readCache$3.L$8 = map2;
                                    fileCacheStorage$readCache$3.L$9 = map3;
                                    fileCacheStorage$readCache$3.L$10 = str10;
                                    fileCacheStorage$readCache$3.I$0 = i6;
                                    fileCacheStorage$readCache$3.I$1 = i7;
                                    fileCacheStorage$readCache$3.label = 13;
                                    int i14 = i7;
                                    i8 = i6;
                                    io.ktor.http.HttpProtocolVersion httpProtocolVersion10 = httpProtocolVersion6;
                                    i9 = 1;
                                    readUTF8Line$default4 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel9, 0, fileCacheStorage$readCache$3, 1, null);
                                    if (readUTF8Line$default4 != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    httpProtocolVersion7 = httpProtocolVersion10;
                                    map4 = map3;
                                    httpStatusCode6 = httpStatusCode7;
                                    headersBuilder5 = headersBuilder6;
                                    byteReadChannel10 = byteReadChannel9;
                                    i10 = i14;
                                    java.util.Map map7 = map2;
                                    str8 = str9;
                                    gMTDate3 = gMTDate5;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(readUTF8Line$default4);
                                    map4.put(str10, (java.lang.String) readUTF8Line$default4);
                                    int i15 = i10 + i9;
                                    httpProtocolVersion5 = httpProtocolVersion7;
                                    gMTDate4 = gMTDate7;
                                    byteReadChannel8 = byteReadChannel10;
                                    intValue2 = i8;
                                    java.util.Map map8 = map4;
                                    i5 = i15;
                                    GMTDate2 = gMTDate6;
                                    createMapBuilder = map7;
                                    map = map8;
                                    if (i5 < intValue2) {
                                        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                                        fileCacheStorage$readCache$3.L$0 = byteReadChannel8;
                                        fileCacheStorage$readCache$3.L$1 = str8;
                                        fileCacheStorage$readCache$3.L$2 = httpStatusCode6;
                                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion5;
                                        fileCacheStorage$readCache$3.L$4 = headersBuilder5;
                                        fileCacheStorage$readCache$3.L$5 = gMTDate3;
                                        fileCacheStorage$readCache$3.L$6 = gMTDate4;
                                        fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                        fileCacheStorage$readCache$3.L$8 = build;
                                        fileCacheStorage$readCache$3.L$9 = null;
                                        fileCacheStorage$readCache$3.L$10 = null;
                                        fileCacheStorage$readCache$3.label = 14;
                                        java.lang.Object readInt2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel8, fileCacheStorage$readCache$3);
                                        if (readInt2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        gMTDate8 = gMTDate4;
                                        headersBuilder7 = headersBuilder5;
                                        httpProtocolVersion8 = httpProtocolVersion5;
                                        byteReadChannel11 = byteReadChannel8;
                                        fileCacheStorage$readCache$33 = fileCacheStorage$readCache$3;
                                        gMTDate9 = gMTDate3;
                                        str11 = str8;
                                        httpStatusCode8 = httpStatusCode6;
                                        gMTDate10 = GMTDate2;
                                        map5 = build;
                                        obj3 = readInt2;
                                        bArr = new byte[((java.lang.Number) obj3).intValue()];
                                        fileCacheStorage$readCache$33.L$0 = str11;
                                        fileCacheStorage$readCache$33.L$1 = httpStatusCode8;
                                        fileCacheStorage$readCache$33.L$2 = httpProtocolVersion8;
                                        fileCacheStorage$readCache$33.L$3 = headersBuilder7;
                                        fileCacheStorage$readCache$33.L$4 = gMTDate9;
                                        fileCacheStorage$readCache$33.L$5 = gMTDate8;
                                        fileCacheStorage$readCache$33.L$6 = gMTDate10;
                                        fileCacheStorage$readCache$33.L$7 = map5;
                                        fileCacheStorage$readCache$33.L$8 = bArr;
                                        fileCacheStorage$readCache$33.label = 15;
                                        io.ktor.http.HttpStatusCode httpStatusCode11 = httpStatusCode8;
                                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.readFully$default(byteReadChannel11, bArr, 0, 0, fileCacheStorage$readCache$33, 6, null) != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        map6 = map5;
                                        bArr2 = bArr;
                                        gMTDate11 = gMTDate10;
                                        gMTDate12 = gMTDate8;
                                        gMTDate13 = gMTDate9;
                                        headersBuilder8 = headersBuilder7;
                                        httpProtocolVersion9 = httpProtocolVersion8;
                                        httpStatusCode9 = httpStatusCode11;
                                        return new io.ktor.client.plugins.cache.storage.CachedResponseData(io.ktor.http.URLUtilsKt.Url(str11), httpStatusCode9, gMTDate13, gMTDate12, httpProtocolVersion9, gMTDate11, headersBuilder8.build(), map6, bArr2);
                                    }
                                }
                            }
                        }
                    case 1:
                        byteReadChannel12 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        java.lang.String str122 = (java.lang.String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel12;
                        fileCacheStorage$readCache$3.L$1 = str122;
                        fileCacheStorage$readCache$3.label = 2;
                        readInt = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel12, fileCacheStorage$readCache$3);
                        if (readInt != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        java.lang.String str14 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel14 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        byteReadChannel2 = byteReadChannel14;
                        str = str14;
                        intValue = ((java.lang.Number) obj3).intValue();
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.I$0 = intValue;
                        fileCacheStorage$readCache$3.label = 3;
                        readUTF8Line$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        intValue = fileCacheStorage$readCache$3.I$0;
                        str = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        io.ktor.http.HttpStatusCode httpStatusCode102 = new io.ktor.http.HttpStatusCode(intValue, (java.lang.String) obj3);
                        companion = io.ktor.http.HttpProtocolVersion.INSTANCE;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode102;
                        fileCacheStorage$readCache$3.L$3 = companion;
                        fileCacheStorage$readCache$3.label = 4;
                        readUTF8Line$default2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default2 != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        companion = (io.ktor.http.HttpProtocolVersion.Companion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str2 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        parse = companion.parse((java.lang.CharSequence) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                        fileCacheStorage$readCache$3.L$1 = str2;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                        fileCacheStorage$readCache$3.L$3 = parse;
                        fileCacheStorage$readCache$3.label = 5;
                        obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel3, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        int intValue32 = ((java.lang.Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
                        byteReadChannel4 = byteReadChannel3;
                        str3 = str2;
                        httpStatusCode2 = httpStatusCode;
                        fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                        i = intValue32;
                        httpProtocolVersion = parse;
                        i2 = 0;
                        if (i2 < i) {
                        }
                        break;
                    case 5:
                        parse = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str2 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        int intValue322 = ((java.lang.Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
                        byteReadChannel4 = byteReadChannel3;
                        str3 = str2;
                        httpStatusCode2 = httpStatusCode;
                        fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                        i = intValue322;
                        httpProtocolVersion = parse;
                        i2 = 0;
                        if (i2 < i) {
                        }
                        break;
                    case 6:
                        i2 = fileCacheStorage$readCache$3.I$1;
                        i3 = fileCacheStorage$readCache$3.I$0;
                        io.ktor.http.HeadersBuilder headersBuilder10 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion11 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode12 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        java.lang.String str15 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel15 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        byteReadChannel5 = byteReadChannel15;
                        str4 = str15;
                        httpStatusCode3 = httpStatusCode12;
                        httpProtocolVersion2 = httpProtocolVersion11;
                        headersBuilder2 = headersBuilder10;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        str5 = (java.lang.String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                        fileCacheStorage$readCache$3.L$1 = str4;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder2;
                        fileCacheStorage$readCache$3.L$5 = str5;
                        fileCacheStorage$readCache$3.I$0 = i3;
                        fileCacheStorage$readCache$3.I$1 = i2;
                        fileCacheStorage$readCache$3.label = 7;
                        i4 = 1;
                        readUTF8Line$default3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default3 != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        i2 = fileCacheStorage$readCache$3.I$1;
                        i3 = fileCacheStorage$readCache$3.I$0;
                        str5 = (java.lang.String) fileCacheStorage$readCache$3.L$5;
                        headersBuilder2 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion2 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode3 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str4 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        i4 = 1;
                        int i112 = i3;
                        fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                        i = i112;
                        java.lang.String str132 = str4;
                        io.ktor.http.HeadersBuilder headersBuilder92 = headersBuilder2;
                        str3 = str132;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                        headersBuilder92.append(str5, (java.lang.String) obj3);
                        i2 += i4;
                        httpProtocolVersion = httpProtocolVersion2;
                        httpStatusCode2 = httpStatusCode3;
                        headersBuilder = headersBuilder92;
                        byteReadChannel4 = byteReadChannel5;
                        obj = null;
                        if (i2 < i) {
                        }
                        break;
                    case 8:
                        io.ktor.http.HeadersBuilder headersBuilder11 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion12 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode13 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        java.lang.String str16 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel16 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        byteReadChannel6 = byteReadChannel16;
                        str6 = str16;
                        httpStatusCode4 = httpStatusCode13;
                        httpProtocolVersion3 = httpProtocolVersion12;
                        headersBuilder3 = headersBuilder11;
                        GMTDate = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                        fileCacheStorage$readCache$3.L$1 = str6;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.label = 9;
                        obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel6, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        io.ktor.util.date.GMTDate GMTDate32 = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                        fileCacheStorage$readCache$3.L$1 = str6;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.L$6 = GMTDate32;
                        fileCacheStorage$readCache$3.label = 10;
                        readLong = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel6, fileCacheStorage$readCache$3);
                        if (readLong == coroutine_suspended) {
                        }
                        break;
                    case 9:
                        GMTDate = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        headersBuilder3 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion3 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode4 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str6 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel6 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        io.ktor.util.date.GMTDate GMTDate322 = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                        fileCacheStorage$readCache$3.L$1 = str6;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.L$6 = GMTDate322;
                        fileCacheStorage$readCache$3.label = 10;
                        readLong = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel6, fileCacheStorage$readCache$3);
                        if (readLong == coroutine_suspended) {
                        }
                        break;
                    case 10:
                        io.ktor.util.date.GMTDate gMTDate14 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        io.ktor.util.date.GMTDate gMTDate15 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        io.ktor.http.HeadersBuilder headersBuilder12 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion13 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode14 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        java.lang.String str17 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel17 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        byteReadChannel7 = byteReadChannel17;
                        str7 = str17;
                        httpStatusCode5 = httpStatusCode14;
                        httpProtocolVersion4 = httpProtocolVersion13;
                        headersBuilder4 = headersBuilder12;
                        gMTDate2 = gMTDate15;
                        gMTDate = gMTDate14;
                        GMTDate2 = io.ktor.util.date.DateJvmKt.GMTDate((java.lang.Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel7;
                        fileCacheStorage$readCache$3.L$1 = str7;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode5;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion4;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                        fileCacheStorage$readCache$3.L$5 = gMTDate2;
                        fileCacheStorage$readCache$3.L$6 = gMTDate;
                        fileCacheStorage$readCache$3.L$7 = GMTDate2;
                        fileCacheStorage$readCache$3.label = 11;
                        obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel7, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        intValue2 = ((java.lang.Number) obj3).intValue();
                        createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                        byteReadChannel8 = byteReadChannel7;
                        map = createMapBuilder;
                        str8 = str7;
                        httpStatusCode6 = httpStatusCode5;
                        httpProtocolVersion5 = httpProtocolVersion4;
                        headersBuilder5 = headersBuilder4;
                        gMTDate3 = gMTDate2;
                        gMTDate4 = gMTDate;
                        i5 = 0;
                        if (i5 < intValue2) {
                        }
                        break;
                    case 11:
                        GMTDate2 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$7;
                        gMTDate = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        gMTDate2 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        headersBuilder4 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion4 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode5 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str7 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel7 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        intValue2 = ((java.lang.Number) obj3).intValue();
                        createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                        byteReadChannel8 = byteReadChannel7;
                        map = createMapBuilder;
                        str8 = str7;
                        httpStatusCode6 = httpStatusCode5;
                        httpProtocolVersion5 = httpProtocolVersion4;
                        headersBuilder5 = headersBuilder4;
                        gMTDate3 = gMTDate2;
                        gMTDate4 = gMTDate;
                        i5 = 0;
                        if (i5 < intValue2) {
                        }
                        break;
                    case 12:
                        int i16 = fileCacheStorage$readCache$3.I$1;
                        int i17 = fileCacheStorage$readCache$3.I$0;
                        java.util.Map map9 = (java.util.Map) fileCacheStorage$readCache$3.L$9;
                        java.util.Map map10 = (java.util.Map) fileCacheStorage$readCache$3.L$8;
                        io.ktor.util.date.GMTDate gMTDate16 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$7;
                        io.ktor.util.date.GMTDate gMTDate17 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        io.ktor.util.date.GMTDate gMTDate18 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        io.ktor.http.HeadersBuilder headersBuilder13 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion14 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode15 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        java.lang.String str18 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel18 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        i6 = i17;
                        obj2 = obj3;
                        i7 = i16;
                        byteReadChannel9 = byteReadChannel18;
                        headersBuilder6 = headersBuilder13;
                        map2 = map10;
                        str9 = str18;
                        gMTDate5 = gMTDate18;
                        map3 = map9;
                        httpProtocolVersion6 = httpProtocolVersion14;
                        gMTDate6 = gMTDate16;
                        httpStatusCode7 = httpStatusCode15;
                        gMTDate7 = gMTDate17;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                        str10 = (java.lang.String) obj2;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel9;
                        fileCacheStorage$readCache$3.L$1 = str9;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode7;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion6;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder6;
                        fileCacheStorage$readCache$3.L$5 = gMTDate5;
                        fileCacheStorage$readCache$3.L$6 = gMTDate7;
                        fileCacheStorage$readCache$3.L$7 = gMTDate6;
                        fileCacheStorage$readCache$3.L$8 = map2;
                        fileCacheStorage$readCache$3.L$9 = map3;
                        fileCacheStorage$readCache$3.L$10 = str10;
                        fileCacheStorage$readCache$3.I$0 = i6;
                        fileCacheStorage$readCache$3.I$1 = i7;
                        fileCacheStorage$readCache$3.label = 13;
                        int i142 = i7;
                        i8 = i6;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion102 = httpProtocolVersion6;
                        i9 = 1;
                        readUTF8Line$default4 = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel9, 0, fileCacheStorage$readCache$3, 1, null);
                        if (readUTF8Line$default4 != coroutine_suspended) {
                        }
                        break;
                    case 13:
                        int i18 = fileCacheStorage$readCache$3.I$1;
                        int i19 = fileCacheStorage$readCache$3.I$0;
                        str10 = (java.lang.String) fileCacheStorage$readCache$3.L$10;
                        java.util.Map map11 = (java.util.Map) fileCacheStorage$readCache$3.L$9;
                        map2 = (java.util.Map) fileCacheStorage$readCache$3.L$8;
                        gMTDate6 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$7;
                        gMTDate7 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        gMTDate5 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        io.ktor.http.HeadersBuilder headersBuilder14 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion15 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode16 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str9 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel19 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        i8 = i19;
                        httpProtocolVersion7 = httpProtocolVersion15;
                        map4 = map11;
                        readUTF8Line$default4 = obj3;
                        httpStatusCode6 = httpStatusCode16;
                        headersBuilder5 = headersBuilder14;
                        i9 = 1;
                        byteReadChannel10 = byteReadChannel19;
                        i10 = i18;
                        java.util.Map map72 = map2;
                        str8 = str9;
                        gMTDate3 = gMTDate5;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(readUTF8Line$default4);
                        map4.put(str10, (java.lang.String) readUTF8Line$default4);
                        int i152 = i10 + i9;
                        httpProtocolVersion5 = httpProtocolVersion7;
                        gMTDate4 = gMTDate7;
                        byteReadChannel8 = byteReadChannel10;
                        intValue2 = i8;
                        java.util.Map map82 = map4;
                        i5 = i152;
                        GMTDate2 = gMTDate6;
                        createMapBuilder = map72;
                        map = map82;
                        if (i5 < intValue2) {
                        }
                        break;
                    case 14:
                        map5 = (java.util.Map) fileCacheStorage$readCache$3.L$8;
                        io.ktor.util.date.GMTDate gMTDate19 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$7;
                        io.ktor.util.date.GMTDate gMTDate20 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        io.ktor.util.date.GMTDate gMTDate21 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        io.ktor.http.HeadersBuilder headersBuilder15 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion16 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpStatusCode httpStatusCode17 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        java.lang.String str19 = (java.lang.String) fileCacheStorage$readCache$3.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel20 = (io.ktor.utils.io.ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        gMTDate10 = gMTDate19;
                        gMTDate9 = gMTDate21;
                        headersBuilder7 = headersBuilder15;
                        httpProtocolVersion8 = httpProtocolVersion16;
                        byteReadChannel11 = byteReadChannel20;
                        fileCacheStorage$readCache$33 = fileCacheStorage$readCache$3;
                        gMTDate8 = gMTDate20;
                        str11 = str19;
                        httpStatusCode8 = httpStatusCode17;
                        bArr = new byte[((java.lang.Number) obj3).intValue()];
                        fileCacheStorage$readCache$33.L$0 = str11;
                        fileCacheStorage$readCache$33.L$1 = httpStatusCode8;
                        fileCacheStorage$readCache$33.L$2 = httpProtocolVersion8;
                        fileCacheStorage$readCache$33.L$3 = headersBuilder7;
                        fileCacheStorage$readCache$33.L$4 = gMTDate9;
                        fileCacheStorage$readCache$33.L$5 = gMTDate8;
                        fileCacheStorage$readCache$33.L$6 = gMTDate10;
                        fileCacheStorage$readCache$33.L$7 = map5;
                        fileCacheStorage$readCache$33.L$8 = bArr;
                        fileCacheStorage$readCache$33.label = 15;
                        io.ktor.http.HttpStatusCode httpStatusCode112 = httpStatusCode8;
                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.readFully$default(byteReadChannel11, bArr, 0, 0, fileCacheStorage$readCache$33, 6, null) != coroutine_suspended) {
                        }
                        break;
                    case 15:
                        byte[] bArr3 = (byte[]) fileCacheStorage$readCache$3.L$8;
                        java.util.Map map12 = (java.util.Map) fileCacheStorage$readCache$3.L$7;
                        io.ktor.util.date.GMTDate gMTDate22 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$6;
                        io.ktor.util.date.GMTDate gMTDate23 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$5;
                        io.ktor.util.date.GMTDate gMTDate24 = (io.ktor.util.date.GMTDate) fileCacheStorage$readCache$3.L$4;
                        headersBuilder8 = (io.ktor.http.HeadersBuilder) fileCacheStorage$readCache$3.L$3;
                        io.ktor.http.HttpProtocolVersion httpProtocolVersion17 = (io.ktor.http.HttpProtocolVersion) fileCacheStorage$readCache$3.L$2;
                        io.ktor.http.HttpStatusCode httpStatusCode18 = (io.ktor.http.HttpStatusCode) fileCacheStorage$readCache$3.L$1;
                        str11 = (java.lang.String) fileCacheStorage$readCache$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        bArr2 = bArr3;
                        map6 = map12;
                        gMTDate11 = gMTDate22;
                        gMTDate12 = gMTDate23;
                        gMTDate13 = gMTDate24;
                        httpProtocolVersion9 = httpProtocolVersion17;
                        httpStatusCode9 = httpStatusCode18;
                        return new io.ktor.client.plugins.cache.storage.CachedResponseData(io.ktor.http.URLUtilsKt.Url(str11), httpStatusCode9, gMTDate13, gMTDate12, httpProtocolVersion9, gMTDate11, headersBuilder8.build(), map6, bArr2);
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fileCacheStorage$readCache$3 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3(this, continuation);
        java.lang.Object obj32 = fileCacheStorage$readCache$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (fileCacheStorage$readCache$3.label) {
        }
    }
}
