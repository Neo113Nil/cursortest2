package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001:B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010 J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J+\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010&J%\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\"2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010$J+\u0010*\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0(0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010\u0018R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0014\u0010'\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00106R\u0011\u00109\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/MemoryCache;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "", "maxSizeBytes", "", "expireAfterMillis", "<init>", "(IJ)V", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "loadRecord", "(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "loadRecords", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Collection;", "p0", "p1", "getHighSpeedVideoSizes", "", "clearAll", "()V", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "", "cascade", "remove", "(Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Z)Z", "pattern", "(Ljava/lang/String;)I", "record", "", "merge", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "records", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "Camera2StreamConfigurationMap", "", "Lkotlin/reflect/KClass;", "dump", "()Ljava/util/Map;", "clearCurrentCache$apollo_normalized_cache_api", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/cache/normalized/api/internal/CacheLock;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/cache/normalized/api/internal/CacheLock;", "Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache;", "Lcom/apollographql/apollo/cache/normalized/api/MemoryCache$CacheEntry;", "Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "CacheEntry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryCache extends com.apollographql.apollo.cache.normalized.api.NormalizedCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.internal.LruCache<java.lang.String, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.internal.CacheLock Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ MemoryCache(int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? -1L : j);
    }

    public MemoryCache(int i, long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = new com.apollographql.apollo.cache.normalized.api.internal.CacheLock();
        this.getHighSpeedVideoFpsRanges = new com.apollographql.apollo.cache.normalized.api.internal.LruCache<>(i, new kotlin.jvm.functions.Function2() { // from class: com.apollographql.apollo.cache.normalized.api.MemoryCache$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(com.apollographql.apollo.cache.normalized.api.MemoryCache.$r8$lambda$6NvpKGQK_R8855qMMxareLuuEks((java.lang.String) obj, (com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry) obj2));
            }
        });
    }

    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final com.apollographql.apollo.cache.normalized.api.Record loadRecord(final java.lang.String key, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        return (com.apollographql.apollo.cache.normalized.api.Record) this.Camera2StreamConfigurationMap.lock(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.api.MemoryCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.api.MemoryCache.$r8$lambda$JtdyIMrqT2ETaapqNrXYtISj3hs(com.apollographql.apollo.cache.normalized.api.MemoryCache.this, key, cacheHeaders);
            }
        });
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> loadRecords(final java.util.Collection<java.lang.String> keys, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        return (java.util.Collection) this.Camera2StreamConfigurationMap.lock(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.api.MemoryCache$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.api.MemoryCache.m9958$r8$lambda$biwyiaI_TaqdnMAezsigSFDoXM(keys, this, cacheHeaders);
            }
        });
    }

    private final com.apollographql.apollo.cache.normalized.api.Record getHighSpeedVideoSizes(java.lang.String p0, com.apollographql.apollo.cache.normalized.api.CacheHeaders p1) {
        com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry cacheEntry = this.getHighSpeedVideoFpsRanges.get(p0);
        if (cacheEntry != null) {
            if ((cacheEntry.getHighSpeedVideoFpsRanges >= 0 && com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() - cacheEntry.getHighSpeedVideoFpsRangesFor >= cacheEntry.getHighSpeedVideoFpsRanges) || p1.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.EVICT_AFTER_READ)) {
                this.getHighSpeedVideoFpsRanges.remove((com.apollographql.apollo.cache.normalized.api.internal.LruCache<java.lang.String, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry>) p0);
            }
            if (cacheEntry.getHighSpeedVideoFpsRanges >= 0 && com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() - cacheEntry.getHighSpeedVideoFpsRangesFor >= cacheEntry.getHighSpeedVideoFpsRanges) {
                cacheEntry = null;
            }
            if (cacheEntry != null) {
                return cacheEntry.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        return null;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final void clearAll() {
        this.getHighSpeedVideoFpsRanges.clear();
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        if (nextCache != null) {
            nextCache.clearAll();
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final boolean remove(com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, boolean cascade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry remove = this.getHighSpeedVideoFpsRanges.remove((com.apollographql.apollo.cache.normalized.api.internal.LruCache<java.lang.String, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry>) cacheKey.getKey());
        if (cascade && remove != null) {
            java.util.Iterator<com.apollographql.apollo.cache.normalized.api.CacheKey> it = remove.getHighResolutionOutputSizeshNQ4ISI.referencedFields().iterator();
            while (it.hasNext()) {
                remove(new com.apollographql.apollo.cache.normalized.api.CacheKey(it.next().getKey()), true);
            }
        }
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return remove != null || (nextCache != null ? nextCache.remove(cacheKey, cascade) : false);
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final int remove(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        kotlin.text.Regex patternToRegex = com.apollographql.apollo.cache.normalized.api.NormalizedCache.INSTANCE.patternToRegex(pattern);
        int i = 0;
        for (java.lang.String str : new java.util.HashSet(this.getHighSpeedVideoFpsRanges.keys())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            if (patternToRegex.matches(str)) {
                this.getHighSpeedVideoFpsRanges.remove((com.apollographql.apollo.cache.normalized.api.internal.LruCache<java.lang.String, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry>) str);
                i++;
            }
        }
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return i + (nextCache != null ? nextCache.remove(pattern) : 0);
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(com.apollographql.apollo.cache.normalized.api.Record record, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DO_NOT_STORE)) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set<java.lang.String> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(record, cacheHeaders);
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        java.util.Set<java.lang.String> merge = nextCache != null ? nextCache.merge(record, cacheHeaders) : null;
        if (merge == null) {
            merge = kotlin.collections.SetsKt.emptySet();
        }
        return kotlin.collections.SetsKt.plus((java.util.Set) Camera2StreamConfigurationMap, (java.lang.Iterable) merge);
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> records, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DO_NOT_STORE)) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = records.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, Camera2StreamConfigurationMap((com.apollographql.apollo.cache.normalized.api.Record) it.next(), cacheHeaders));
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        java.util.Set<java.lang.String> merge = nextCache != null ? nextCache.merge(records, cacheHeaders) : null;
        if (merge == null) {
            merge = kotlin.collections.SetsKt.emptySet();
        }
        return kotlin.collections.SetsKt.plus(set, (java.lang.Iterable) merge);
    }

    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap(com.apollographql.apollo.cache.normalized.api.Record p0, com.apollographql.apollo.cache.normalized.api.CacheHeaders p1) {
        com.apollographql.apollo.cache.normalized.api.Record loadRecord = loadRecord(p0.getKey(), p1);
        if (loadRecord == null) {
            this.getHighSpeedVideoFpsRanges.set(p0.getKey(), new com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry(p0, this.getHighSpeedVideoFpsRangesFor));
            return p0.fieldKeys();
        }
        kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith = loadRecord.mergeWith(p0);
        com.apollographql.apollo.cache.normalized.api.Record component1 = mergeWith.component1();
        java.util.Set<java.lang.String> component2 = mergeWith.component2();
        this.getHighSpeedVideoFpsRanges.set(p0.getKey(), new com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry(component1, this.getHighSpeedVideoFpsRangesFor));
        return component2;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump() {
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass());
        java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry> dump = this.getHighSpeedVideoFpsRanges.dump();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(dump.size()));
        java.util.Iterator<T> it = dump.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry) entry.getValue()).getHighResolutionOutputSizeshNQ4ISI);
        }
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(orCreateKotlinClass, linkedHashMap));
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump2 = nextCache != null ? nextCache.dump() : null;
        if (dump2 == null) {
            dump2 = kotlin.collections.MapsKt.emptyMap();
        }
        return kotlin.collections.MapsKt.plus(mapOf, dump2);
    }

    public final void clearCurrentCache$apollo_normalized_cache_api() {
        this.getHighSpeedVideoFpsRanges.clear();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0011\u0010\n\u001a\u00020\u000e8\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/MemoryCache$CacheEntry;", "", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "p0", "", "p1", "<init>", "(Lcom/apollographql/apollo/cache/normalized/api/Record;J)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class CacheEntry {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final long getHighSpeedVideoFpsRanges;
        final com.apollographql.apollo.cache.normalized.api.Record getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final long getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final int Camera2StreamConfigurationMap;

        public CacheEntry(com.apollographql.apollo.cache.normalized.api.Record record, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
            this.getHighResolutionOutputSizeshNQ4ISI = record;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoFpsRangesFor = com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis();
            this.Camera2StreamConfigurationMap = record.getSizeInBytes() + 8;
        }
    }

    public static /* synthetic */ int $r8$lambda$6NvpKGQK_R8855qMMxareLuuEks(java.lang.String str, com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry cacheEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return okio.internal._Utf8Kt.commonAsUtf8ToByteArray(str).length + (cacheEntry != null ? cacheEntry.Camera2StreamConfigurationMap : 0);
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.api.Record $r8$lambda$JtdyIMrqT2ETaapqNrXYtISj3hs(com.apollographql.apollo.cache.normalized.api.MemoryCache memoryCache, java.lang.String str, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        com.apollographql.apollo.cache.normalized.api.Record loadRecord;
        com.apollographql.apollo.cache.normalized.api.Record highSpeedVideoSizes = memoryCache.getHighSpeedVideoSizes(str, cacheHeaders);
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = memoryCache.getNextCache();
        if (nextCache == null || (loadRecord = nextCache.loadRecord(str, cacheHeaders)) == null) {
            return null;
        }
        memoryCache.getHighSpeedVideoFpsRanges.set(str, new com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry(loadRecord, memoryCache.getHighSpeedVideoFpsRangesFor));
        return loadRecord;
    }

    /* renamed from: $r8$lambda$biw-yiaI_TaqdnMAezsigSFDoXM, reason: not valid java name */
    public static /* synthetic */ java.util.List m9958$r8$lambda$biwyiaI_TaqdnMAezsigSFDoXM(java.util.Collection collection, com.apollographql.apollo.cache.normalized.api.MemoryCache memoryCache, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        java.util.Collection collection2 = collection;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10)), 16));
        for (java.lang.Object obj : collection2) {
            linkedHashMap.put(obj, memoryCache.getHighSpeedVideoSizes((java.lang.String) obj, cacheHeaders));
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((com.apollographql.apollo.cache.normalized.api.Record) entry.getValue()) == null) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap3.keySet();
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = memoryCache.getNextCache();
        java.util.List loadRecords = nextCache != null ? nextCache.loadRecords(keySet, cacheHeaders) : null;
        if (loadRecords == null) {
            loadRecords = kotlin.collections.CollectionsKt.emptyList();
        }
        for (com.apollographql.apollo.cache.normalized.api.Record record : loadRecords) {
            memoryCache.getHighSpeedVideoFpsRanges.set(record.getKey(), new com.apollographql.apollo.cache.normalized.api.MemoryCache.CacheEntry(record, memoryCache.getHighSpeedVideoFpsRangesFor));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.filterNotNull(linkedHashMap2.values()), (java.lang.Iterable) loadRecords);
    }

    public MemoryCache() {
        this(0, 0L, 3, null);
    }
}
