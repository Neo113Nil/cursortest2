package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\u000f\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u000b\u0012*\u0012(\u0012\u0004\u0012\u00020\u000b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n0\f0\n0\n0\t*\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "normalizedCacheFactory", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "cacheKeyGenerator", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "cacheResolver", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "ApolloStore", "(Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;)Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "Lkotlin/Function0;", "", "", "Lkotlin/Pair;", "", "", "cacheDumpProvider", "(Lcom/apollographql/apollo/cache/normalized/ApolloStore;)Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloStoreKt {
    public static /* synthetic */ com.apollographql.apollo.cache.normalized.ApolloStore ApolloStore$default(com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            cacheKeyGenerator = com.apollographql.apollo.cache.normalized.api.TypePolicyCacheKeyGenerator.INSTANCE;
        }
        if ((i & 4) != 0) {
            cacheResolver = com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver.INSTANCE;
        }
        return ApolloStore(normalizedCacheFactory, cacheKeyGenerator, cacheResolver);
    }

    public static final com.apollographql.apollo.cache.normalized.ApolloStore ApolloStore(com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        return new com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore(normalizedCacheFactory, cacheKeyGenerator, cacheResolver);
    }

    public static final kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>>>>> cacheDumpProvider(final com.apollographql.apollo.cache.normalized.ApolloStore apolloStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloStore, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.ApolloStoreKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.ApolloStoreKt.$r8$lambda$wbcYF1eojOQPReo2gytaY5WnfA4(com.apollographql.apollo.cache.normalized.ApolloStore.this);
            }
        };
    }

    private static final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof com.apollographql.apollo.api.json.JsonNumber)) {
            return obj;
        }
        if (obj instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
            return ((com.apollographql.apollo.cache.normalized.api.CacheKey) obj).serialize();
        }
        if (obj instanceof java.util.List) {
            java.lang.Iterable iterable = (java.lang.Iterable) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(getHighSpeedVideoSizes(it.next()));
            }
            return arrayList;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), getHighSpeedVideoSizes(entry.getValue()));
            }
            return linkedHashMap;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported record value type: '");
        sb.append(obj);
        sb.append('\'');
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ java.util.Map $r8$lambda$wbcYF1eojOQPReo2gytaY5WnfA4(com.apollographql.apollo.cache.normalized.ApolloStore apolloStore) {
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump = apolloStore.dump();
        java.util.ArrayList arrayList = new java.util.ArrayList(dump.size());
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> entry : dump.entrySet()) {
            kotlin.reflect.KClass<?> key = entry.getKey();
            java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> value = entry.getValue();
            java.lang.String normalizedCacheName = com.apollographql.apollo.cache.normalized.ApolloStore_concurrentKt.normalizedCacheName(key);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(value.size()));
            java.util.Iterator<T> it = value.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                java.lang.Object key2 = entry2.getKey();
                com.apollographql.apollo.cache.normalized.api.Record record = (com.apollographql.apollo.cache.normalized.api.Record) entry2.getValue();
                int size = record.size();
                java.util.Map<java.lang.String, java.lang.Object> fields = record.getFields();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(fields.size()));
                java.util.Iterator<T> it2 = fields.entrySet().iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry) it2.next();
                    linkedHashMap2.put(entry3.getKey(), getHighSpeedVideoSizes(entry3.getValue()));
                }
                linkedHashMap.put(key2, kotlin.TuplesKt.to(java.lang.Integer.valueOf(size), linkedHashMap2));
            }
            arrayList.add(kotlin.TuplesKt.to(normalizedCacheName, linkedHashMap));
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }
}
