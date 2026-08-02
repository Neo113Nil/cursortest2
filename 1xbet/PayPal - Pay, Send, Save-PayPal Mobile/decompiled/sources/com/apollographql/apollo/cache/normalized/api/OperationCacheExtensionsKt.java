package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\"\b\b\u0000\u0010\u0001*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0010\u001aA\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001d\u001aA\u0010!\u001a\u00020 \"\b\b\u0000\u0010\u0001*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"\u001aI\u0010!\u001a\u00020 \"\b\b\u0000\u0010\u0001*\u00020\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010#\u001aK\u0010)\u001a\u00020 \"\b\b\u0000\u0010\u0001*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0,*\n\u0012\u0004\u0012\u00020\n\u0018\u00010+¢\u0006\u0004\b-\u0010.\u001a9\u00101\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\r*\u00020 2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b1\u00102"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/Operation;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "cacheKeyGenerator", "", "", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "normalize", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;)Ljava/util/Map;", "Lcom/apollographql/apollo/api/Executable$Data;", "Lcom/apollographql/apollo/api/Executable;", "rootKey", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/Executable$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;Ljava/lang/String;)Ljava/util/Map;", "Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "cacheResolver", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "readDataFromCache", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/api/Executable$Data;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/apollographql/apollo/api/Fragment;", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "(Lcom/apollographql/apollo/api/Fragment;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "readDataFromCacheInternal", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;Lcom/apollographql/apollo/api/Executable$Variables;)Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "(Lcom/apollographql/apollo/api/Fragment;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;Lcom/apollographql/apollo/api/Executable$Variables;)Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "p0", "p1", "p2", "p3", "p4", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;Lcom/apollographql/apollo/api/Executable$Variables;)Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "", "", "dependentKeys", "(Ljava/util/Collection;)Ljava/util/Set;", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "toData", "(Lcom/apollographql/apollo/cache/normalized/api/CacheData;Lcom/apollographql/apollo/api/Adapter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/api/Executable$Variables;)Lcom/apollographql/apollo/api/Executable$Data;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationCacheExtensionsKt {
    public static final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> normalize(com.apollographql.apollo.api.Operation<D> operation, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        return normalize(operation, d, customScalarAdapters, cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.rootKey().getKey());
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> normalize(com.apollographql.apollo.api.Executable<D> executable, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
        executable.adapter().toJson(mapJsonWriter, customScalarAdapters, d);
        com.apollographql.apollo.cache.normalized.api.internal.Normalizer normalizer = new com.apollographql.apollo.cache.normalized.api.internal.Normalizer(com.apollographql.apollo.api.Executables.variables(executable, customScalarAdapters, true), str, cacheKeyGenerator);
        java.lang.Object root = mapJsonWriter.root();
        kotlin.jvm.internal.Intrinsics.checkNotNull(root, "");
        return normalizer.normalize((java.util.Map) root, executable.rootField().getSelections(), executable.rootField().getType().rawType().getName());
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D readDataFromCache(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readOnlyNormalizedCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        com.apollographql.apollo.api.Executable.Variables variables = com.apollographql.apollo.api.Executables.variables(executable, customScalarAdapters, true);
        return (D) toData(Camera2StreamConfigurationMap(executable, com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.rootKey(), readOnlyNormalizedCache, cacheResolver, cacheHeaders, variables), executable.adapter(), customScalarAdapters, variables);
    }

    public static final <D extends com.apollographql.apollo.api.Fragment.Data> D readDataFromCache(com.apollographql.apollo.api.Fragment<D> fragment, com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readOnlyNormalizedCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        com.apollographql.apollo.api.Fragment<D> fragment2 = fragment;
        com.apollographql.apollo.api.Executable.Variables variables = com.apollographql.apollo.api.Executables.variables(fragment2, customScalarAdapters, true);
        return (D) toData(Camera2StreamConfigurationMap(fragment2, cacheKey, readOnlyNormalizedCache, cacheResolver, cacheHeaders, variables), fragment.adapter(), customScalarAdapters, variables);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> com.apollographql.apollo.cache.normalized.api.CacheData readDataFromCacheInternal(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, com.apollographql.apollo.api.Executable.Variables variables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readOnlyNormalizedCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        return Camera2StreamConfigurationMap(executable, com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.rootKey(), readOnlyNormalizedCache, cacheResolver, cacheHeaders, variables);
    }

    public static final <D extends com.apollographql.apollo.api.Fragment.Data> com.apollographql.apollo.cache.normalized.api.CacheData readDataFromCacheInternal(com.apollographql.apollo.api.Fragment<D> fragment, com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, com.apollographql.apollo.api.Executable.Variables variables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readOnlyNormalizedCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        return Camera2StreamConfigurationMap(fragment, cacheKey, readOnlyNormalizedCache, cacheResolver, cacheHeaders, variables);
    }

    private static final <D extends com.apollographql.apollo.api.Executable.Data> com.apollographql.apollo.cache.normalized.api.CacheData Camera2StreamConfigurationMap(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, com.apollographql.apollo.api.Executable.Variables variables) {
        return new com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader(readOnlyNormalizedCache, cacheKey.getKey(), variables, cacheResolver, cacheHeaders, executable.rootField().getSelections(), executable.rootField().getType().rawType().getName()).collectData();
    }

    public static final java.util.Set<java.lang.String> dependentKeys(java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> collection) {
        if (collection != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.apollographql.apollo.cache.normalized.api.Record) it.next()).fieldKeys());
            }
            java.util.Set<java.lang.String> set = kotlin.collections.CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return kotlin.collections.SetsKt.emptySet();
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D toData(com.apollographql.apollo.cache.normalized.api.CacheData cacheData, com.apollographql.apollo.api.Adapter<D> adapter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.api.Executable.Variables variables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        com.apollographql.apollo.api.json.MapJsonReader mapJsonReader = new com.apollographql.apollo.api.json.MapJsonReader(cacheData.toMap(), null, 2, null);
        com.apollographql.apollo.api.CustomScalarAdapters.Builder newBuilder = customScalarAdapters.newBuilder();
        java.util.Map<java.lang.String, java.lang.Object> valueMap = variables.getValueMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : valueMap.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), java.lang.Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return adapter.fromJson(mapJsonReader, newBuilder.falseVariables(linkedHashMap.keySet()).build());
    }
}
