package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u0000 B2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001BB=\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u0001\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001¢\u0006\u0004\b\n\u0010\u000eJ1\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.RJ\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00012\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00018\u0007@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010+R\u0011\u00106\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105R(\u00109\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003070\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u0010\u0017R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0014\u0010=\u001a\u0002038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u00105R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/Record;", "", "", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/RecordValue;", "fields", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "mutationId", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/UUID;)V", "", "date", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/UUID;Ljava/util/Map;)V", "newRecord", "newDate", "Lkotlin/Pair;", "", "mergeWith", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Ljava/lang/Long;)Lkotlin/Pair;", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)Lkotlin/Pair;", "fieldKeys", "()Ljava/util/Set;", "", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "referencedFields", "()Ljava/util/List;", "", "containsKey", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "Ljava/util/UUID;", "getMutationId", "()Ljava/util/UUID;", "p0", "getDate", "getDate$annotations", "()V", "", "getSizeInBytes", "()I", "sizeInBytes", "", "getEntries", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "getValues", "()Ljava/util/Collection;", "values", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Record implements java.util.Map<java.lang.String, java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.api.Record.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.api.Record.Companion(null);
    private java.util.Map<java.lang.String, java.lang.Long> date;
    private final java.util.Map<java.lang.String, java.lang.Object> fields;
    private final java.lang.String key;
    private final java.util.UUID mutationId;

    public static /* synthetic */ void getDate$annotations() {
    }

    public Record(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.key = str;
        this.fields = map;
        this.mutationId = uuid;
    }

    public /* synthetic */ Record(java.lang.String str, java.util.Map map, java.util.UUID uuid, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : uuid);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.lang.Object> values() {
        return getValues();
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getFields() {
        return this.fields;
    }

    public final java.util.UUID getMutationId() {
        return this.mutationId;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getDate() {
        return this.date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Record(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.UUID uuid, java.util.Map<java.lang.String, java.lang.Long> map2) {
        this(str, map, uuid);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        this.date = map2;
    }

    public final int getSizeInBytes() {
        java.util.Map<java.lang.String, java.lang.Long> map = this.date;
        return com.apollographql.apollo.cache.normalized.api.internal.RecordWeigher.calculateBytes(this) + (map != null ? map.size() * 8 : 0);
    }

    public final kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith(com.apollographql.apollo.cache.normalized.api.Record newRecord, java.lang.Long newDate) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newRecord, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.fields);
        java.util.Map<java.lang.String, java.lang.Long> map = this.date;
        if (map == null || (linkedHashMap = kotlin.collections.MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : newRecord.fields.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            boolean containsKey = this.fields.containsKey(key);
            java.lang.Object obj = this.fields.get(key);
            if (!containsKey || !kotlin.jvm.internal.Intrinsics.areEqual(obj, value)) {
                mutableMap.put(key, value);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.key);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(key);
                linkedHashSet.add(sb.toString());
            }
            if (newDate != null) {
                linkedHashMap.put(key, newDate);
            }
        }
        return kotlin.TuplesKt.to(new com.apollographql.apollo.cache.normalized.api.Record(this.key, mutableMap, newRecord.mutationId, linkedHashMap), linkedHashSet);
    }

    public final kotlin.Pair<com.apollographql.apollo.cache.normalized.api.Record, java.util.Set<java.lang.String>> mergeWith(com.apollographql.apollo.cache.normalized.api.Record newRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newRecord, "");
        return mergeWith(newRecord, null);
    }

    public final java.util.Set<java.lang.String> fieldKeys() {
        java.util.Set<java.lang.String> keySet = this.fields.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
        for (java.lang.String str : keySet) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.key);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(str);
            arrayList.add(sb.toString());
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    public final java.util.List<com.apollographql.apollo.cache.normalized.api.CacheKey> referencedFields() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.fields.values());
        while (!mutableList.isEmpty()) {
            java.lang.Object remove = mutableList.remove(mutableList.size() - 1);
            if (remove instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
                arrayList.add(remove);
            } else if (remove instanceof java.util.Map) {
                mutableList.addAll(((java.util.Map) remove).values());
            } else if (remove instanceof java.util.List) {
                mutableList.addAll((java.util.Collection) remove);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/Record$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "record1", "record2", "", "", "changedKeys$apollo_normalized_cache_api", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Lcom/apollographql/apollo/cache/normalized/api/Record;)Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> changedKeys$apollo_normalized_cache_api(com.apollographql.apollo.cache.normalized.api.Record record1, com.apollographql.apollo.cache.normalized.api.Record record2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record2, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(record1.getKey(), record2.getKey())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot compute changed keys on record with different keys: '");
                sb.append(record1.getKey());
                sb.append("' - '");
                sb.append(record2.getKey());
                sb.append('\'');
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            java.util.Set<java.lang.String> keySet = record1.getFields().keySet();
            java.util.Set<java.lang.String> keySet2 = record2.getFields().keySet();
            java.util.Set intersect = kotlin.collections.CollectionsKt.intersect(keySet, keySet2);
            java.util.Set plus = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.minus((java.util.Set) keySet, (java.lang.Iterable) intersect), (java.lang.Iterable) kotlin.collections.SetsKt.minus((java.util.Set) keySet2, (java.lang.Iterable) intersect));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : intersect) {
                java.lang.String str = (java.lang.String) obj;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(record1.getFields().get(str), record2.getFields().get(str))) {
                    arrayList.add(obj);
                }
            }
            java.util.Set<java.lang.String> plus2 = kotlin.collections.SetsKt.plus(plus, (java.lang.Iterable) arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus2, 10));
            for (java.lang.String str2 : plus2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(record1.getKey());
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb2.append(str2);
                arrayList2.add(sb2.toString());
            }
            return kotlin.collections.CollectionsKt.toSet(arrayList2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public final boolean replace2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public final java.lang.Object replace2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public final java.lang.Object putIfAbsent2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public final java.lang.Object put2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public final java.lang.Object merge2(java.lang.String str, java.lang.Object obj, java.util.function.BiFunction<? super java.lang.Object, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.String str, java.lang.Object obj, java.util.function.BiFunction<? super java.lang.Object, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public final java.util.Collection<java.lang.Object> getValues() {
        return this.fields.values();
    }

    public final int getSize() {
        return this.fields.size();
    }

    public final java.util.Set<java.lang.String> getKeys() {
        return this.fields.keySet();
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> getEntries() {
        return this.fields.entrySet();
    }

    public final java.lang.Object get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.fields.get(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        return this.fields.containsValue(value);
    }

    public final boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.fields.containsKey(key);
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public final java.lang.Object computeIfPresent2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public final java.lang.Object computeIfAbsent2(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends java.lang.Object> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends java.lang.Object> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public final java.lang.Object compute2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
