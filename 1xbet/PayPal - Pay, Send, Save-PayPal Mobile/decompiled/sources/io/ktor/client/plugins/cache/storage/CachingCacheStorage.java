package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "getHighSpeedVideoSizes", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Lio/ktor/util/collections/ConcurrentMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/util/collections/ConcurrentMap;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CachingCacheStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> getHighSpeedVideoFpsRangesFor;
    private final io.ktor.client.plugins.cache.storage.CacheStorage getHighSpeedVideoSizes;

    public CachingCacheStorage(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStorage, "");
        this.getHighSpeedVideoSizes = cacheStorage;
        this.getHighSpeedVideoFpsRangesFor = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8.store(r6, r7, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 cachingCacheStorage$store$1;
        int i;
        io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1) {
            cachingCacheStorage$store$1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1) continuation;
            if ((cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cachingCacheStorage$store$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.getHighSpeedVideoSizes;
                    cachingCacheStorage$store$1.Camera2StreamConfigurationMap = url;
                    cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        url = (io.ktor.http.Url) cachingCacheStorage$store$1.getHighSpeedVideoFpsRanges;
                        concurrentMap = (java.util.Map) cachingCacheStorage$store$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        concurrentMap.put(url, obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    url = (io.ktor.http.Url) cachingCacheStorage$store$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                concurrentMap = this.getHighSpeedVideoFpsRangesFor;
                io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2 = this.getHighSpeedVideoSizes;
                cachingCacheStorage$store$1.Camera2StreamConfigurationMap = concurrentMap;
                cachingCacheStorage$store$1.getHighSpeedVideoFpsRanges = url;
                cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = cacheStorage2.findAll(url, cachingCacheStorage$store$1);
            }
        }
        cachingCacheStorage$store$1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1(this, continuation);
        java.lang.Object obj2 = cachingCacheStorage$store$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        concurrentMap = this.getHighSpeedVideoFpsRangesFor;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage22 = this.getHighSpeedVideoSizes;
        cachingCacheStorage$store$1.Camera2StreamConfigurationMap = concurrentMap;
        cachingCacheStorage$store$1.getHighSpeedVideoFpsRanges = url;
        cachingCacheStorage$store$1.getHighSpeedVideoFpsRangesFor = 2;
        obj2 = cacheStorage22.findAll(url, cachingCacheStorage$store$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 cachingCacheStorage$find$1;
        int i;
        java.util.Map<java.lang.String, java.lang.String> map2;
        java.util.Map map3;
        io.ktor.http.Url url2;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1) {
            cachingCacheStorage$find$1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1) continuation;
            if ((cachingCacheStorage$find$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$find$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cachingCacheStorage$find$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$find$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRangesFor.containsKey(url)) {
                        io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap = this.getHighSpeedVideoFpsRangesFor;
                        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.getHighSpeedVideoSizes;
                        cachingCacheStorage$find$1.getHighSpeedVideoFpsRangesFor = url;
                        cachingCacheStorage$find$1.getHighSpeedVideoFpsRanges = map;
                        cachingCacheStorage$find$1.getHighSpeedVideoSizes = concurrentMap;
                        cachingCacheStorage$find$1.Camera2StreamConfigurationMap = url;
                        cachingCacheStorage$find$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object findAll = cacheStorage.findAll(url, cachingCacheStorage$find$1);
                        if (findAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map2 = map;
                        map3 = concurrentMap;
                        obj = findAll;
                        url2 = url;
                    }
                    for (java.lang.Object obj2 : (java.util.Set) kotlin.collections.MapsKt.getValue(this.getHighSpeedVideoFpsRangesFor, url)) {
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
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (io.ktor.http.Url) cachingCacheStorage$find$1.Camera2StreamConfigurationMap;
                map3 = (java.util.Map) cachingCacheStorage$find$1.getHighSpeedVideoSizes;
                map2 = (java.util.Map) cachingCacheStorage$find$1.getHighSpeedVideoFpsRanges;
                url2 = (io.ktor.http.Url) cachingCacheStorage$find$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                map3.put(url, obj);
                url = url2;
                map = map2;
                while (r6.hasNext()) {
                }
                return null;
            }
        }
        cachingCacheStorage$find$1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1(this, continuation);
        java.lang.Object obj3 = cachingCacheStorage$find$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$find$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        map3.put(url, obj3);
        url = url2;
        map = map2;
        while (r6.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 cachingCacheStorage$findAll$1;
        int i;
        java.util.Map map;
        io.ktor.http.Url url2;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1) {
            cachingCacheStorage$findAll$1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1) continuation;
            if ((cachingCacheStorage$findAll$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$findAll$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cachingCacheStorage$findAll$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$findAll$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRangesFor.containsKey(url)) {
                        io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap = this.getHighSpeedVideoFpsRangesFor;
                        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.getHighSpeedVideoSizes;
                        cachingCacheStorage$findAll$1.getHighSpeedVideoFpsRangesFor = url;
                        cachingCacheStorage$findAll$1.getHighSpeedVideoSizes = concurrentMap;
                        cachingCacheStorage$findAll$1.getHighSpeedVideoFpsRanges = url;
                        cachingCacheStorage$findAll$1.Camera2StreamConfigurationMap = 1;
                        java.lang.Object findAll = cacheStorage.findAll(url, cachingCacheStorage$findAll$1);
                        if (findAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map = concurrentMap;
                        obj = findAll;
                        url2 = url;
                    }
                    return kotlin.collections.MapsKt.getValue(this.getHighSpeedVideoFpsRangesFor, url);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (io.ktor.http.Url) cachingCacheStorage$findAll$1.getHighSpeedVideoFpsRanges;
                map = (java.util.Map) cachingCacheStorage$findAll$1.getHighSpeedVideoSizes;
                url2 = (io.ktor.http.Url) cachingCacheStorage$findAll$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                map.put(url, obj);
                url = url2;
                return kotlin.collections.MapsKt.getValue(this.getHighSpeedVideoFpsRangesFor, url);
            }
        }
        cachingCacheStorage$findAll$1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1(this, continuation);
        java.lang.Object obj2 = cachingCacheStorage$findAll$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$findAll$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        map.put(url, obj2);
        url = url2;
        return kotlin.collections.MapsKt.getValue(this.getHighSpeedVideoFpsRangesFor, url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8.remove(r6, r7, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object remove(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1 cachingCacheStorage$remove$1;
        int i;
        io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1) {
            cachingCacheStorage$remove$1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1) continuation;
            if ((cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cachingCacheStorage$remove$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.getHighSpeedVideoSizes;
                    cachingCacheStorage$remove$1.getHighSpeedVideoSizes = url;
                    cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        url = (io.ktor.http.Url) cachingCacheStorage$remove$1.getHighResolutionOutputSizeshNQ4ISI;
                        concurrentMap = (java.util.Map) cachingCacheStorage$remove$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        concurrentMap.put(url, obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    url = (io.ktor.http.Url) cachingCacheStorage$remove$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                concurrentMap = this.getHighSpeedVideoFpsRangesFor;
                io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2 = this.getHighSpeedVideoSizes;
                cachingCacheStorage$remove$1.getHighSpeedVideoSizes = concurrentMap;
                cachingCacheStorage$remove$1.getHighResolutionOutputSizeshNQ4ISI = url;
                cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = cacheStorage2.findAll(url, cachingCacheStorage$remove$1);
            }
        }
        cachingCacheStorage$remove$1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1(this, continuation);
        java.lang.Object obj2 = cachingCacheStorage$remove$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        concurrentMap = this.getHighSpeedVideoFpsRangesFor;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage22 = this.getHighSpeedVideoSizes;
        cachingCacheStorage$remove$1.getHighSpeedVideoSizes = concurrentMap;
        cachingCacheStorage$remove$1.getHighResolutionOutputSizeshNQ4ISI = url;
        cachingCacheStorage$remove$1.getHighSpeedVideoFpsRangesFor = 2;
        obj2 = cacheStorage22.findAll(url, cachingCacheStorage$remove$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1 cachingCacheStorage$removeAll$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1) {
            cachingCacheStorage$removeAll$1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1) continuation;
            if ((cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cachingCacheStorage$removeAll$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.getHighSpeedVideoSizes;
                    cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRanges = url;
                    cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (cacheStorage.removeAll(url, cachingCacheStorage$removeAll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (io.ktor.http.Url) cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRangesFor.remove(url);
                return kotlin.Unit.INSTANCE;
            }
        }
        cachingCacheStorage$removeAll$1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1(this, continuation);
        java.lang.Object obj2 = cachingCacheStorage$removeAll$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$removeAll$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRangesFor.remove(url);
        return kotlin.Unit.INSTANCE;
    }
}
