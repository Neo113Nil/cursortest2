package com.apollographql.apollo.cache.normalized.sql;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\"J+\u0010%\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0#0#H\u0016¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00162\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\n*\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b.\u0010/J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\n002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b+\u00101R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/SqlNormalizedCache;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "recordDatabase", "<init>", "(Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;)V", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "loadRecord", "(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "loadRecords", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Collection;", "", "clearAll", "()V", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "", "cascade", "remove", "(Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Z)Z", "pattern", "", "(Ljava/lang/String;)I", "records", "", "merge", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "record", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "", "Lkotlin/reflect/KClass;", "dump", "()Ljava/util/Map;", "p0", "p1", "", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;ZLjava/util/Set;)Z", "", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Ljava/lang/Long;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", "(Ljava/util/Collection;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SqlNormalizedCache extends com.apollographql.apollo.cache.normalized.api.NormalizedCache {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase getHighSpeedVideoFpsRanges;

    public SqlNormalizedCache(com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase recordDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordDatabase, "");
        this.getHighSpeedVideoFpsRanges = recordDatabase;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final com.apollographql.apollo.cache.normalized.api.Record loadRecord(java.lang.String key, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        com.apollographql.apollo.cache.normalized.api.Record record;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY)) {
            return null;
        }
        try {
            record = this.getHighSpeedVideoFpsRanges.select(key);
        } catch (java.lang.Exception e) {
            com.apollographql.apollo.exception.ApolloExceptionHandlerKt.getApolloExceptionHandler().invoke(new java.lang.Exception("Unable to read a record from the database", e));
            record = null;
        }
        if (record != null) {
            if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.EVICT_AFTER_READ)) {
                this.getHighSpeedVideoFpsRanges.delete(key);
            }
            return record;
        }
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        if (nextCache != null) {
            return nextCache.loadRecord(key, cacheHeaders);
        }
        return null;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> loadRecords(java.util.Collection<java.lang.String> keys, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        java.util.List<com.apollographql.apollo.cache.normalized.api.Record> emptyList;
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        try {
            emptyList = getHighSpeedVideoSizes(keys);
        } catch (java.lang.Exception e) {
            com.apollographql.apollo.exception.ApolloExceptionHandlerKt.getApolloExceptionHandler().invoke(new java.lang.Exception("Unable to read records from the database", e));
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.EVICT_AFTER_READ)) {
            java.util.Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoFpsRanges.delete(((com.apollographql.apollo.cache.normalized.api.Record) it.next()).getKey());
            }
        }
        java.util.Collection<java.lang.String> collection = keys;
        java.util.List<com.apollographql.apollo.cache.normalized.api.Record> list = emptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.apollographql.apollo.cache.normalized.api.Record) it2.next()).getKey());
        }
        java.util.List minus = kotlin.collections.CollectionsKt.minus((java.lang.Iterable) collection, (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(arrayList));
        java.util.List list2 = null;
        if (minus.isEmpty()) {
            minus = null;
        }
        java.util.List list3 = minus;
        if (list3 != null && (nextCache = getNextCache()) != null) {
            list2 = nextCache.loadRecords(list3, cacheHeaders);
        }
        if (list2 == null) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList, (java.lang.Iterable) list2);
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final void clearAll() {
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        if (nextCache != null) {
            nextCache.clearAll();
        }
        this.getHighSpeedVideoFpsRanges.deleteAll();
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final boolean remove(final com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, final boolean cascade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        boolean booleanValue = ((java.lang.Boolean) com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase.transaction$default(this.getHighSpeedVideoFpsRanges, false, new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.this.getHighSpeedVideoSizes(cacheKey.getKey(), cascade, new java.util.LinkedHashSet());
                return java.lang.Boolean.valueOf(highSpeedVideoSizes);
            }
        }, 1, null)).booleanValue();
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return booleanValue || (nextCache != null ? nextCache.remove(cacheKey, cascade) : false);
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final int remove(final java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase.transaction$default(this.getHighSpeedVideoFpsRanges, false, new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.m9968$r8$lambda$mCCstcPe646QmMd5qt2JztRE4w(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.this, pattern, intRef);
            }
        }, 1, null);
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return intRef.element + (nextCache != null ? nextCache.remove(pattern) : 0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.Set] */
    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> records, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DO_NOT_STORE) || cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY)) {
            return kotlin.collections.SetsKt.emptySet();
        }
        try {
            java.lang.String headerValue = cacheHeaders.headerValue(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DATE);
            final java.lang.Long valueOf = headerValue != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(headerValue)) : null;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = kotlin.collections.SetsKt.emptySet();
            com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase.transaction$default(this.getHighSpeedVideoFpsRanges, false, new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.m9966$r8$lambda$J8Ctv8uitYVQwfKRx6kg4O51Ec(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.this, records, objectRef, valueOf);
                }
            }, 1, null);
            java.util.Set set = (java.util.Set) objectRef.element;
            com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
            java.util.Set<java.lang.String> merge = nextCache != null ? nextCache.merge(records, cacheHeaders) : null;
            if (merge == null) {
                merge = kotlin.collections.SetsKt.emptySet();
            }
            return kotlin.collections.SetsKt.plus(set, (java.lang.Iterable) merge);
        } catch (java.lang.Exception e) {
            com.apollographql.apollo.exception.ApolloExceptionHandlerKt.getApolloExceptionHandler().invoke(new java.lang.Exception("Unable to merge records from the database", e));
            return kotlin.collections.SetsKt.emptySet();
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(final com.apollographql.apollo.cache.normalized.api.Record record, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        if (cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DO_NOT_STORE) || cacheHeaders.hasHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY)) {
            return kotlin.collections.SetsKt.emptySet();
        }
        try {
            java.lang.String headerValue = cacheHeaders.headerValue(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DATE);
            final java.lang.Long valueOf = headerValue != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(headerValue)) : null;
            java.util.Set set = (java.util.Set) com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase.transaction$default(this.getHighSpeedVideoFpsRanges, false, new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.m9967$r8$lambda$SbzrOkHua4y7GbJiKZUpvgePA(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache.this, record, valueOf);
                }
            }, 1, null);
            com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
            java.util.Set<java.lang.String> merge = nextCache != null ? nextCache.merge(record, cacheHeaders) : null;
            if (merge == null) {
                merge = kotlin.collections.SetsKt.emptySet();
            }
            return kotlin.collections.SetsKt.plus(set, (java.lang.Iterable) merge);
        } catch (java.lang.Exception e) {
            com.apollographql.apollo.exception.ApolloExceptionHandlerKt.getApolloExceptionHandler().invoke(new java.lang.Exception("Unable to merge a record from the database", e));
            return kotlin.collections.SetsKt.emptySet();
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump() {
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass());
        java.util.List<com.apollographql.apollo.cache.normalized.api.Record> selectAll = this.getHighSpeedVideoFpsRanges.selectAll();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(selectAll, 10)), 16));
        for (java.lang.Object obj : selectAll) {
            linkedHashMap.put(((com.apollographql.apollo.cache.normalized.api.Record) obj).getKey(), obj);
        }
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(orCreateKotlinClass, linkedHashMap));
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump = nextCache != null ? nextCache.dump() : null;
        if (dump == null) {
            dump = kotlin.collections.MapsKt.emptyMap();
        }
        return kotlin.collections.MapsKt.plus(mapOf, dump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoSizes(java.lang.String p0, boolean p1, java.util.Set<java.lang.String> p2) {
        java.util.List<com.apollographql.apollo.cache.normalized.api.CacheKey> referencedFields;
        if (p1) {
            if (p2.contains(p0)) {
                return false;
            }
            p2.add(p0);
            com.apollographql.apollo.cache.normalized.api.Record select = this.getHighSpeedVideoFpsRanges.select(p0);
            if (select != null && (referencedFields = select.referencedFields()) != null) {
                java.util.Iterator<T> it = referencedFields.iterator();
                while (it.hasNext()) {
                    getHighSpeedVideoSizes(((com.apollographql.apollo.cache.normalized.api.CacheKey) it.next()).getKey(), true, p2);
                }
            }
        }
        this.getHighSpeedVideoFpsRanges.delete(p0);
        return this.getHighSpeedVideoFpsRanges.changes() > 0;
    }

    private static com.apollographql.apollo.cache.normalized.api.Record Camera2StreamConfigurationMap(com.apollographql.apollo.cache.normalized.api.Record record, java.lang.Long l) {
        if (l == null) {
            return record;
        }
        java.lang.String key = record.getKey();
        java.util.Map<java.lang.String, java.lang.Object> fields = record.getFields();
        java.util.UUID mutationId = record.getMutationId();
        java.util.Map<java.lang.String, java.lang.Object> fields2 = record.getFields();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(fields2.size()));
        java.util.Iterator<T> it = fields2.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((java.util.Map.Entry) it.next()).getKey(), java.lang.Long.valueOf(l.longValue()));
        }
        return new com.apollographql.apollo.cache.normalized.api.Record(key, fields, mutationId, linkedHashMap);
    }

    private final java.util.List<com.apollographql.apollo.cache.normalized.api.Record> getHighSpeedVideoSizes(java.util.Collection<java.lang.String> p0) {
        java.util.List chunked = kotlin.collections.CollectionsKt.chunked(p0, 999);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = chunked.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, this.getHighSpeedVideoFpsRanges.select((java.util.List) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.Set] */
    /* renamed from: $r8$lambda$J8Ctv8uitYVQwfKRx6k-g4O51Ec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9966$r8$lambda$J8Ctv8uitYVQwfKRx6kg4O51Ec(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache sqlNormalizedCache, java.util.Collection collection, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.lang.Long l) {
        java.util.Set<java.lang.String> component2;
        java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.apollographql.apollo.cache.normalized.api.Record) it.next()).getKey());
        }
        java.util.List<com.apollographql.apollo.cache.normalized.api.Record> highSpeedVideoSizes = sqlNormalizedCache.getHighSpeedVideoSizes(arrayList);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highSpeedVideoSizes, 10)), 16));
        for (java.lang.Object obj : highSpeedVideoSizes) {
            linkedHashMap.put(((com.apollographql.apollo.cache.normalized.api.Record) obj).getKey(), obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.apollographql.apollo.cache.normalized.api.Record record : collection2) {
            com.apollographql.apollo.cache.normalized.api.Record record2 = (com.apollographql.apollo.cache.normalized.api.Record) linkedHashMap.get(record.getKey());
            if (record2 == null) {
                sqlNormalizedCache.getHighSpeedVideoFpsRanges.insert(Camera2StreamConfigurationMap(record, l));
                component2 = record.fieldKeys();
            } else {
                kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith = record2.mergeWith(record, l);
                com.apollographql.apollo.cache.normalized.api.Record component1 = mergeWith.component1();
                component2 = mergeWith.component2();
                if (!component1.isEmpty()) {
                    sqlNormalizedCache.getHighSpeedVideoFpsRanges.update(component1);
                }
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, component2);
        }
        objectRef.element = kotlin.collections.CollectionsKt.toSet(arrayList2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SbzrOkHua4y7GbJiKZ-UpvgeP-A, reason: not valid java name */
    public static /* synthetic */ java.util.Set m9967$r8$lambda$SbzrOkHua4y7GbJiKZUpvgePA(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache sqlNormalizedCache, com.apollographql.apollo.cache.normalized.api.Record record, java.lang.Long l) {
        com.apollographql.apollo.cache.normalized.api.Record select = sqlNormalizedCache.getHighSpeedVideoFpsRanges.select(record.getKey());
        if (select == null) {
            sqlNormalizedCache.getHighSpeedVideoFpsRanges.insert(Camera2StreamConfigurationMap(record, l));
            return record.fieldKeys();
        }
        kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith = select.mergeWith(record, l);
        com.apollographql.apollo.cache.normalized.api.Record component1 = mergeWith.component1();
        java.util.Set<java.lang.String> component2 = mergeWith.component2();
        if (!component1.isEmpty()) {
            sqlNormalizedCache.getHighSpeedVideoFpsRanges.update(component1);
        }
        return component2;
    }

    /* renamed from: $r8$lambda$mCCstcP-e646QmMd5qt2JztRE4w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9968$r8$lambda$mCCstcPe646QmMd5qt2JztRE4w(com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache sqlNormalizedCache, java.lang.String str, kotlin.jvm.internal.Ref.IntRef intRef) {
        sqlNormalizedCache.getHighSpeedVideoFpsRanges.deleteMatching(str);
        intRef.element = (int) sqlNormalizedCache.getHighSpeedVideoFpsRanges.changes();
        return kotlin.Unit.INSTANCE;
    }
}
