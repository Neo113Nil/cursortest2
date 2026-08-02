package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001a\u0010\u0011J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ2\u0010\"\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b\"\u0010#J&\u0010%\u001a\u00020\u000f2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020.0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u00105\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00106"}, d2 = {"Lcom/statsig/androidsdk/NetworkFallbackResolver;", "", "Lcom/statsig/androidsdk/KeyValueStorage;", "", "keyValueStorage", "Lkotlinx/coroutines/CoroutineScope;", "statsigScope", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/statsig/androidsdk/KeyValueStorage;Lkotlinx/coroutines/CoroutineScope;Lcom/google/gson/Gson;)V", "Lcom/statsig/androidsdk/UrlConfig;", "urlConfig", "getActiveFallbackUrlFromMemory", "(Lcom/statsig/androidsdk/UrlConfig;)Ljava/lang/String;", "", "initializeFallbackInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/FallbackInfoEntry;", "currentFallbackInfo", "", "urls", "pickNewFallbackUrl", "(Lcom/statsig/androidsdk/FallbackInfoEntry;Ljava/util/List;)Ljava/lang/String;", "", "Lcom/statsig/androidsdk/Endpoint;", "readFallbackInfoFromCache", "tryBumpExpiryTime", "(Lcom/statsig/androidsdk/UrlConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryFetchFallbackUrlsFromNetwork", "errorMessage", "", "timedOut", "hasNetwork", "tryFetchUpdatedFallbackInfo", "(Lcom/statsig/androidsdk/UrlConfig;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "info", "tryWriteFallbackInfoToCache", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endpoint", "newUrl", "updateFallbackInfoWithNewUrl", "(Lcom/statsig/androidsdk/Endpoint;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "dnsQueryCooldowns", "Ljava/util/Map;", "fallbackInfo", "Lcom/google/gson/Gson;", "Lcom/statsig/androidsdk/KeyValueStorage;", "Lkotlinx/coroutines/CoroutineScope;", "storeName", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkFallbackResolver {
    private final com.statsig.androidsdk.CoroutineDispatcherProvider dispatcherProvider;
    private final java.util.Map<com.statsig.androidsdk.Endpoint, java.lang.Long> dnsQueryCooldowns;
    private java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> fallbackInfo;
    private final com.google.gson.Gson gson;
    private final com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage;
    private final kotlinx.coroutines.CoroutineScope statsigScope;
    private final java.lang.String storeName;

    public NetworkFallbackResolver(com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage, kotlinx.coroutines.CoroutineScope coroutineScope, com.google.gson.Gson gson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "");
        this.keyValueStorage = keyValueStorage;
        this.statsigScope = coroutineScope;
        this.gson = gson;
        this.dnsQueryCooldowns = new java.util.LinkedHashMap();
        this.dispatcherProvider = new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);
        this.storeName = "networkfallback";
    }

    public final java.lang.Object tryBumpExpiryTime(com.statsig.androidsdk.UrlConfig urlConfig, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry;
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map;
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map2 = this.fallbackInfo;
        if (map2 == null || (fallbackInfoEntry = map2.get(urlConfig.getEndpoint())) == null) {
            return kotlin.Unit.INSTANCE;
        }
        fallbackInfoEntry.setExpiryTime(new java.util.Date().getTime() + com.statsig.androidsdk.NetworkFallbackResolverKt.DEFAULT_TTL_MS);
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map3 = this.fallbackInfo;
        if (map3 == null || (map = kotlin.collections.MapsKt.toMutableMap(map3)) == null) {
            map = null;
        } else {
            map.put(urlConfig.getEndpoint(), fallbackInfoEntry);
        }
        java.lang.Object tryWriteFallbackInfoToCache = tryWriteFallbackInfoToCache(map, continuation);
        return tryWriteFallbackInfoToCache == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? tryWriteFallbackInfoToCache : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initializeFallbackInfo(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.NetworkFallbackResolver$initializeFallbackInfo$1 networkFallbackResolver$initializeFallbackInfo$1;
        int i;
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
        if (continuation instanceof com.statsig.androidsdk.NetworkFallbackResolver$initializeFallbackInfo$1) {
            networkFallbackResolver$initializeFallbackInfo$1 = (com.statsig.androidsdk.NetworkFallbackResolver$initializeFallbackInfo$1) continuation;
            if ((networkFallbackResolver$initializeFallbackInfo$1.label & Integer.MIN_VALUE) != 0) {
                networkFallbackResolver$initializeFallbackInfo$1.label -= 2147483648;
                java.lang.Object obj = networkFallbackResolver$initializeFallbackInfo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFallbackResolver$initializeFallbackInfo$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    networkFallbackResolver$initializeFallbackInfo$1.L$0 = this;
                    networkFallbackResolver$initializeFallbackInfo$1.label = 1;
                    obj = readFallbackInfoFromCache(networkFallbackResolver$initializeFallbackInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkFallbackResolver = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    networkFallbackResolver = (com.statsig.androidsdk.NetworkFallbackResolver) networkFallbackResolver$initializeFallbackInfo$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                networkFallbackResolver.fallbackInfo = (java.util.Map) obj;
                return kotlin.Unit.INSTANCE;
            }
        }
        networkFallbackResolver$initializeFallbackInfo$1 = new com.statsig.androidsdk.NetworkFallbackResolver$initializeFallbackInfo$1(this, continuation);
        java.lang.Object obj2 = networkFallbackResolver$initializeFallbackInfo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFallbackResolver$initializeFallbackInfo$1.label;
        if (i != 0) {
        }
        networkFallbackResolver.fallbackInfo = (java.util.Map) obj2;
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String getActiveFallbackUrlFromMemory(com.statsig.androidsdk.UrlConfig urlConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlConfig, "");
        if (urlConfig.getCustomUrl() == null && urlConfig.getUserFallbackUrls() == null) {
            java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map = this.fallbackInfo;
            com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry = map != null ? map.get(urlConfig.getEndpoint()) : null;
            if (fallbackInfoEntry == null || new java.util.Date().getTime() > fallbackInfoEntry.getExpiryTime()) {
                java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map2 = this.fallbackInfo;
                if (map2 != null) {
                    map2.remove(urlConfig.getEndpoint());
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.NetworkFallbackResolver$getActiveFallbackUrlFromMemory$1(this, null), 2, null);
            } else {
                return fallbackInfoEntry.getUrl();
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:32|33|(2:35|36)(2:37|(5:44|21|(1:23)(1:31)|24|(2:26|27)(1:28))(3:41|(1:43)|30)))|20|21|(0)(0)|24|(0)(0)))|46|6|7|(0)(0)|20|21|(0)(0)|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r8.updateFallbackInfoWithNewUrl(r7, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002a, B:19:0x003f, B:20:0x006a, B:21:0x0072, B:23:0x0077, B:24:0x0083, B:26:0x0089, B:28:0x008e, B:33:0x0046, B:35:0x004c, B:37:0x0051, B:39:0x0057, B:41:0x005d, B:44:0x006d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002a, B:19:0x003f, B:20:0x006a, B:21:0x0072, B:23:0x0077, B:24:0x0083, B:26:0x0089, B:28:0x008e, B:33:0x0046, B:35:0x004c, B:37:0x0051, B:39:0x0057, B:41:0x005d, B:44:0x006d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: Exception -> 0x00a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002a, B:19:0x003f, B:20:0x006a, B:21:0x0072, B:23:0x0077, B:24:0x0083, B:26:0x0089, B:28:0x008e, B:33:0x0046, B:35:0x004c, B:37:0x0051, B:39:0x0057, B:41:0x005d, B:44:0x006d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryFetchUpdatedFallbackInfo(com.statsig.androidsdk.UrlConfig urlConfig, java.lang.String str, boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1 networkFallbackResolver$tryFetchUpdatedFallbackInfo$1;
        int i;
        java.util.List<java.lang.String> userFallbackUrls;
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
        java.lang.String pickNewFallbackUrl;
        if (continuation instanceof com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1) {
            networkFallbackResolver$tryFetchUpdatedFallbackInfo$1 = (com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1) continuation;
            if ((networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label & Integer.MIN_VALUE) != 0) {
                networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label -= 2147483648;
                java.lang.Object obj = networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label;
                boolean z3 = false;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!com.statsig.androidsdk.NetworkFallbackResolverKt.isDomainFailure(str, z, z2)) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    if (urlConfig.getCustomUrl() == null && urlConfig.getUserFallbackUrls() == null) {
                        networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$0 = this;
                        networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$1 = urlConfig;
                        networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label = 1;
                        obj = tryFetchFallbackUrlsFromNetwork(urlConfig, networkFallbackResolver$tryFetchUpdatedFallbackInfo$1);
                        if (obj != coroutine_suspended) {
                            networkFallbackResolver = this;
                        }
                        return coroutine_suspended;
                    }
                    userFallbackUrls = urlConfig.getUserFallbackUrls();
                    networkFallbackResolver = this;
                    java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map = networkFallbackResolver.fallbackInfo;
                    pickNewFallbackUrl = networkFallbackResolver.pickNewFallbackUrl(map != null ? map.get(urlConfig.getEndpoint()) : null, userFallbackUrls);
                    if (pickNewFallbackUrl == null) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    com.statsig.androidsdk.Endpoint endpoint = urlConfig.getEndpoint();
                    networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$0 = null;
                    networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$1 = null;
                    networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        z3 = true;
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z3);
                    }
                    urlConfig = (com.statsig.androidsdk.UrlConfig) networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$1;
                    networkFallbackResolver = (com.statsig.androidsdk.NetworkFallbackResolver) networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                userFallbackUrls = (java.util.List) obj;
                java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map2 = networkFallbackResolver.fallbackInfo;
                pickNewFallbackUrl = networkFallbackResolver.pickNewFallbackUrl(map2 != null ? map2.get(urlConfig.getEndpoint()) : null, userFallbackUrls);
                if (pickNewFallbackUrl == null) {
                }
            }
        }
        networkFallbackResolver$tryFetchUpdatedFallbackInfo$1 = new com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1(this, continuation);
        java.lang.Object obj2 = networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFallbackResolver$tryFetchUpdatedFallbackInfo$1.label;
        boolean z32 = false;
        if (i != 0) {
        }
        userFallbackUrls = (java.util.List) obj2;
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map22 = networkFallbackResolver.fallbackInfo;
        pickNewFallbackUrl = networkFallbackResolver.pickNewFallbackUrl(map22 != null ? map22.get(urlConfig.getEndpoint()) : null, userFallbackUrls);
        if (pickNewFallbackUrl == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object updateFallbackInfoWithNewUrl(com.statsig.androidsdk.Endpoint endpoint, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry;
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry2 = new com.statsig.androidsdk.FallbackInfoEntry(str, null, new java.util.Date().getTime() + com.statsig.androidsdk.NetworkFallbackResolverKt.DEFAULT_TTL_MS, 2, null);
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map = this.fallbackInfo;
        java.lang.String str2 = null;
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry3 = map != null ? map.get(endpoint) : null;
        if (fallbackInfoEntry3 != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fallbackInfoEntry2.getPrevious().addAll(fallbackInfoEntry3.getPrevious()));
        }
        if (fallbackInfoEntry2.getPrevious().size() > 10) {
            fallbackInfoEntry2.getPrevious().clear();
        }
        java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map2 = this.fallbackInfo;
        if (map2 != null && (fallbackInfoEntry = map2.get(endpoint)) != null) {
            str2 = fallbackInfoEntry.getUrl();
        }
        if (str2 != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fallbackInfoEntry2.getPrevious().add(str2));
        }
        java.util.LinkedHashMap linkedHashMap = this.fallbackInfo;
        if (linkedHashMap == null) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        linkedHashMap.put(endpoint, fallbackInfoEntry2);
        this.fallbackInfo = linkedHashMap;
        java.lang.Object tryWriteFallbackInfoToCache = tryWriteFallbackInfoToCache(linkedHashMap, continuation);
        return tryWriteFallbackInfoToCache == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? tryWriteFallbackInfoToCache : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryFetchFallbackUrlsFromNetwork(com.statsig.androidsdk.UrlConfig urlConfig, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1 networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1;
        int i;
        java.util.List list;
        com.statsig.androidsdk.UrlConfig urlConfig2;
        if (continuation instanceof com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1) {
            networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1 = (com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1) continuation;
            if ((networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.label & Integer.MIN_VALUE) != 0) {
                networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.label -= 2147483648;
                java.lang.Object obj = networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Long l = this.dnsQueryCooldowns.get(urlConfig.getEndpoint());
                    if (l != null && new java.util.Date().getTime() < l.longValue()) {
                        return null;
                    }
                    this.dnsQueryCooldowns.put(urlConfig.getEndpoint(), kotlin.coroutines.jvm.internal.Boxing.boxLong(new java.util.Date().getTime() + com.statsig.androidsdk.NetworkFallbackResolverKt.COOLDOWN_TIME_MS));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.L$0 = urlConfig;
                    networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.L$1 = arrayList;
                    networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.label = 1;
                    java.lang.Object fetchTxtRecords = com.statsig.androidsdk.DnsTxtQueryKt.fetchTxtRecords(networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1);
                    if (fetchTxtRecords == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                    obj = fetchTxtRecords;
                    urlConfig2 = urlConfig;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.L$1;
                    urlConfig2 = (com.statsig.androidsdk.UrlConfig) networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String extractPathFromUrl = com.statsig.androidsdk.NetworkFallbackResolverKt.extractPathFromUrl(urlConfig2.getDefaultUrl());
                for (java.lang.String str : (java.util.List) obj) {
                    java.lang.String endpointDnsKey = urlConfig2.getEndpointDnsKey();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(endpointDnsKey);
                    sb.append("=");
                    if (kotlin.text.StringsKt.startsWith$default(str, sb.toString(), false, 2, (java.lang.Object) null)) {
                        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
                        if (split$default.size() > 1) {
                            java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix((java.lang.String) split$default.get(1), (java.lang.CharSequence) androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://");
                            sb2.append(removeSuffix);
                            sb2.append(extractPathFromUrl);
                            list.add(sb2.toString());
                        }
                    }
                }
                return list;
            }
        }
        networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1 = new com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1(this, continuation);
        java.lang.Object obj2 = networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1.label;
        if (i != 0) {
        }
        java.lang.String extractPathFromUrl2 = com.statsig.androidsdk.NetworkFallbackResolverKt.extractPathFromUrl(urlConfig2.getDefaultUrl());
        while (r1.hasNext()) {
        }
        return list;
    }

    public final java.lang.Object tryWriteFallbackInfoToCache(java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String fallbackInfoStorageKey = com.statsig.androidsdk.NetworkFallbackResolverKt.getFallbackInfoStorageKey();
        if (map == null || map.isEmpty()) {
            java.lang.Object removeValue = this.keyValueStorage.removeValue(this.storeName, fallbackInfoStorageKey, continuation);
            return removeValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeValue : kotlin.Unit.INSTANCE;
        }
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage = this.keyValueStorage;
        java.lang.String str = this.storeName;
        java.lang.String json = this.gson.toJson(map);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object writeValue = keyValueStorage.writeValue(str, fallbackInfoStorageKey, json, continuation);
        return writeValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeValue : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readFallbackInfoFromCache(kotlin.coroutines.Continuation<? super java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry>> continuation) {
        com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$1 networkFallbackResolver$readFallbackInfoFromCache$1;
        int i;
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
        java.lang.String str;
        if (continuation instanceof com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$1) {
            networkFallbackResolver$readFallbackInfoFromCache$1 = (com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$1) continuation;
            if ((networkFallbackResolver$readFallbackInfoFromCache$1.label & Integer.MIN_VALUE) != 0) {
                networkFallbackResolver$readFallbackInfoFromCache$1.label -= 2147483648;
                java.lang.Object obj = networkFallbackResolver$readFallbackInfoFromCache$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFallbackResolver$readFallbackInfoFromCache$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String fallbackInfoStorageKey = com.statsig.androidsdk.NetworkFallbackResolverKt.getFallbackInfoStorageKey();
                    com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage = this.keyValueStorage;
                    java.lang.String str2 = this.storeName;
                    networkFallbackResolver$readFallbackInfoFromCache$1.L$0 = this;
                    networkFallbackResolver$readFallbackInfoFromCache$1.label = 1;
                    obj = keyValueStorage.readValue(str2, fallbackInfoStorageKey, networkFallbackResolver$readFallbackInfoFromCache$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkFallbackResolver = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    networkFallbackResolver = (com.statsig.androidsdk.NetworkFallbackResolver) networkFallbackResolver$readFallbackInfoFromCache$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return null;
                }
                try {
                    return (java.util.Map) networkFallbackResolver.gson.fromJson(str, new com.google.gson.reflect.TypeToken<java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry>>() { // from class: com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$mapType$1
                    }.getType());
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        }
        networkFallbackResolver$readFallbackInfoFromCache$1 = new com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$1(this, continuation);
        java.lang.Object obj2 = networkFallbackResolver$readFallbackInfoFromCache$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFallbackResolver$readFallbackInfoFromCache$1.label;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    private final java.lang.String pickNewFallbackUrl(com.statsig.androidsdk.FallbackInfoEntry currentFallbackInfo, java.util.List<java.lang.String> urls) {
        java.util.Set emptySet;
        java.util.List<java.lang.String> previous;
        if (urls == null) {
            return null;
        }
        if (currentFallbackInfo == null || (previous = currentFallbackInfo.getPrevious()) == null || (emptySet = kotlin.collections.CollectionsKt.toSet(previous)) == null) {
            emptySet = kotlin.collections.SetsKt.emptySet();
        }
        java.lang.String url = currentFallbackInfo != null ? currentFallbackInfo.getUrl() : null;
        java.util.Iterator<java.lang.String> it = urls.iterator();
        while (it.hasNext()) {
            java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix(it.next(), (java.lang.CharSequence) androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            if (!emptySet.contains(removeSuffix) && !kotlin.jvm.internal.Intrinsics.areEqual(removeSuffix, url)) {
                return removeSuffix;
            }
        }
        return null;
    }
}
