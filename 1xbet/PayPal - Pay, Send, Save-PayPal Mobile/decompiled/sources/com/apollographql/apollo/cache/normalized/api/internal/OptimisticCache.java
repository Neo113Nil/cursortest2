package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u001f\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0*0*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/OptimisticCache;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "<init>", "()V", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "loadRecord", "(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "loadRecords", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Collection;", "record", "", "merge", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "records", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "", "clearAll", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "", "cascade", "remove", "(Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Z)Z", "pattern", "", "(Ljava/lang/String;)I", "recordSet", "addOptimisticUpdates", "(Ljava/util/Collection;)Ljava/util/Set;", "addOptimisticUpdate", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)Ljava/util/Set;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "mutationId", "removeOptimisticUpdates", "(Ljava/util/UUID;)Ljava/util/Set;", "", "Lkotlin/reflect/KClass;", "dump", "()Ljava/util/Map;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", "Lcom/apollographql/apollo/cache/normalized/api/internal/OptimisticCache$RecordJournal;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "RemovalResult", "RecordJournal"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptimisticCache extends com.apollographql.apollo.cache.normalized.api.NormalizedCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final com.apollographql.apollo.cache.normalized.api.Record loadRecord(java.lang.String key, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        try {
            com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
            return getHighSpeedVideoFpsRangesFor(nextCache != null ? nextCache.loadRecord(key, cacheHeaders) : null, key);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> loadRecords(java.util.Collection<java.lang.String> keys, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        java.util.LinkedHashMap emptyMap;
        java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> loadRecords;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        if (nextCache == null || (loadRecords = nextCache.loadRecords(keys, cacheHeaders)) == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        } else {
            java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> collection = loadRecords;
            emptyMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10)), 16));
            for (java.lang.Object obj : collection) {
                emptyMap.put(((com.apollographql.apollo.cache.normalized.api.Record) obj).getKey(), obj);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : keys) {
            com.apollographql.apollo.cache.normalized.api.Record highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.apollographql.apollo.cache.normalized.api.Record) emptyMap.get(str), str);
            if (highSpeedVideoFpsRangesFor != null) {
                arrayList.add(highSpeedVideoFpsRangesFor);
            }
        }
        return arrayList;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(com.apollographql.apollo.cache.normalized.api.Record record, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        java.util.Set<java.lang.String> merge;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return (nextCache == null || (merge = nextCache.merge(record, cacheHeaders)) == null) ? kotlin.collections.SetsKt.emptySet() : merge;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final java.util.Set<java.lang.String> merge(java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> records, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        java.util.Set<java.lang.String> merge;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return (nextCache == null || (merge = nextCache.merge(records, cacheHeaders)) == null) ? kotlin.collections.SetsKt.emptySet() : merge;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final void clearAll() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        if (nextCache != null) {
            nextCache.clearAll();
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final boolean remove(com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, boolean cascade) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        boolean remove = nextCache != null ? nextCache.remove(cacheKey, cascade) : false;
        com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal recordJournal = this.getHighResolutionOutputSizeshNQ4ISI.get(cacheKey.getKey());
        if (recordJournal == null) {
            return remove;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.remove(cacheKey.getKey());
        if (!cascade) {
            return true;
        }
        while (true) {
            for (com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey2 : recordJournal.Camera2StreamConfigurationMap.referencedFields()) {
                z = z && remove(new com.apollographql.apollo.cache.normalized.api.CacheKey(cacheKey2.getKey()), true);
            }
            return z;
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCache
    public final int remove(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        kotlin.text.Regex patternToRegex = com.apollographql.apollo.cache.normalized.api.NormalizedCache.INSTANCE.patternToRegex(pattern);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal>> it = this.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (patternToRegex.matches(it.next().getKey())) {
                it.remove();
                i++;
            }
        }
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        return i + (nextCache != null ? nextCache.remove(pattern) : 0);
    }

    public final java.util.Set<java.lang.String> addOptimisticUpdates(java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> recordSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordSet, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = recordSet.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, addOptimisticUpdate((com.apollographql.apollo.cache.normalized.api.Record) it.next()));
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    public final java.util.Set<java.lang.String> addOptimisticUpdate(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal recordJournal = this.getHighResolutionOutputSizeshNQ4ISI.get(record.getKey());
        if (recordJournal == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(record.getKey(), new com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal(record));
            return record.fieldKeys();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith = recordJournal.Camera2StreamConfigurationMap.mergeWith(record);
        com.apollographql.apollo.cache.normalized.api.Record component1 = mergeWith.component1();
        java.util.Set<java.lang.String> component2 = mergeWith.component2();
        recordJournal.Camera2StreamConfigurationMap = component1;
        recordJournal.getHighSpeedVideoFpsRanges.add(record);
        return component2;
    }

    public final java.util.Set<java.lang.String> removeOptimisticUpdates(java.util.UUID mutationId) {
        com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RemovalResult removalResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutationId, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal>> it = this.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
        while (it.hasNext()) {
            com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal value = it.next().getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutationId, "");
            java.util.Iterator<com.apollographql.apollo.cache.normalized.api.Record> it2 = value.getHighSpeedVideoFpsRanges.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutationId, it2.next().getMutationId())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                removalResult = new com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RemovalResult(kotlin.collections.SetsKt.emptySet(), false);
            } else if (value.getHighSpeedVideoFpsRanges.size() == 1) {
                removalResult = new com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RemovalResult(value.Camera2StreamConfigurationMap.fieldKeys(), true);
            } else {
                com.apollographql.apollo.cache.normalized.api.Record record = value.Camera2StreamConfigurationMap;
                value.getHighSpeedVideoFpsRanges.remove(i).getKey();
                int size = value.getHighSpeedVideoFpsRanges.size();
                com.apollographql.apollo.cache.normalized.api.Record record2 = null;
                for (int max = java.lang.Math.max(0, i - 1); max < size; max++) {
                    com.apollographql.apollo.cache.normalized.api.Record record3 = value.getHighSpeedVideoFpsRanges.get(max);
                    record2 = record2 == null ? record3 : record2.mergeWith(record3).component1();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(record2);
                value.Camera2StreamConfigurationMap = record2;
                removalResult = new com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RemovalResult(com.apollographql.apollo.cache.normalized.api.Record.INSTANCE.changedKeys$apollo_normalized_cache_api(record, value.Camera2StreamConfigurationMap), false);
            }
            linkedHashSet.addAll(removalResult.getHighSpeedVideoFpsRanges);
            if (removalResult.getHighResolutionOutputSizeshNQ4ISI) {
                it.remove();
            }
        }
        return linkedHashSet;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump() {
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass());
        java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal> map = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal) entry.getValue()).Camera2StreamConfigurationMap);
        }
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(orCreateKotlinClass, linkedHashMap));
        com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache = getNextCache();
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump = nextCache != null ? nextCache.dump() : null;
        if (dump == null) {
            dump = kotlin.collections.MapsKt.emptyMap();
        }
        return kotlin.collections.MapsKt.plus(mapOf, dump);
    }

    private final com.apollographql.apollo.cache.normalized.api.Record getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.api.Record record, java.lang.String str) {
        kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith;
        com.apollographql.apollo.cache.normalized.api.Record first;
        com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache.RecordJournal recordJournal = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        return recordJournal != null ? (record == null || (mergeWith = record.mergeWith(recordJournal.Camera2StreamConfigurationMap)) == null || (first = mergeWith.getFirst()) == null) ? recordJournal.Camera2StreamConfigurationMap : first : record;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/OptimisticCache$RemovalResult;", "", "", "", "p0", "", "p1", "<init>", "(Ljava/util/Set;Z)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemovalResult {
        final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final boolean getHighResolutionOutputSizeshNQ4ISI;

        public RemovalResult(java.util.Set<java.lang.String> set, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.getHighSpeedVideoFpsRanges = set;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/OptimisticCache$RecordJournal;", "", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "p0", "<init>", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "Camera2StreamConfigurationMap", "", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RecordJournal {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.util.List<com.apollographql.apollo.cache.normalized.api.Record> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        com.apollographql.apollo.cache.normalized.api.Record Camera2StreamConfigurationMap;

        public RecordJournal(com.apollographql.apollo.cache.normalized.api.Record record) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
            this.Camera2StreamConfigurationMap = record;
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.mutableListOf(record);
        }
    }
}
