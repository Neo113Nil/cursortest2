package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0019\u001a\u00020\u00182\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001d\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001d\u0010!R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/Normalizer;", "", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "", "rootKey", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "cacheKeyGenerator", "<init>", "(Lcom/apollographql/apollo/api/Executable$Variables;Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;)V", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "map", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "selections", "parentType", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "normalize", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "p0", "p1", "p2", "p3", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "Lcom/apollographql/apollo/api/CompiledField;", "Lcom/apollographql/apollo/api/CompiledType;", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/CompiledType;Ljava/lang/String;)Ljava/lang/Object;", "Lcom/apollographql/apollo/cache/normalized/api/internal/Normalizer$CollectState;", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/internal/Normalizer$CollectState;)V", "Lcom/apollographql/apollo/api/Executable$Variables;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "CollectState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Normalizer {
    private final com.apollographql.apollo.api.Executable.Variables getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/Normalizer$CollectState;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledField;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class CollectState {
        final java.util.List<com.apollographql.apollo.api.CompiledField> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    public Normalizer(com.apollographql.apollo.api.Executable.Variables variables, java.lang.String str, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = variables;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = cacheKeyGenerator;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    public final java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> normalize(java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> selections, java.lang.String parentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selections, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentType, "");
        getHighResolutionOutputSizeshNQ4ISI(map, this.getHighSpeedVideoFpsRangesFor, selections, parentType);
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.apollographql.apollo.cache.normalized.api.CacheKey getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, ? extends java.lang.Object> p0, java.lang.String p1, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> p2, java.lang.String p3) {
        kotlin.Pair pair;
        java.lang.String obj;
        java.lang.Object obj2 = p0.get("__typename");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        com.apollographql.apollo.cache.normalized.api.internal.Normalizer.CollectState collectState = new com.apollographql.apollo.cache.normalized.api.internal.Normalizer.CollectState();
        Camera2StreamConfigurationMap(p2, p3, str, collectState);
        java.util.List<com.apollographql.apollo.api.CompiledField> list = collectState.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Set<java.util.Map.Entry<java.lang.String, ? extends java.lang.Object>> entrySet = p0.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.CompiledField) obj3).getResponseName(), entry.getKey())) {
                    arrayList2.add(obj3);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : arrayList3) {
                    if (!com.apollographql.apollo.cache.normalized.api.internal.ShouldSkipKt.shouldSkip((com.apollographql.apollo.api.CompiledField) obj4, (java.util.Map<java.lang.String, ? extends java.lang.Object>) this.getHighResolutionOutputSizeshNQ4ISI.getValueMap())) {
                        arrayList4.add(obj4);
                    }
                }
                java.util.ArrayList arrayList5 = arrayList4;
                if (!arrayList5.isEmpty()) {
                    com.apollographql.apollo.api.CompiledField.Builder newBuilder = ((com.apollographql.apollo.api.CompiledField) kotlin.collections.CollectionsKt.first((java.util.List) arrayList5)).newBuilder();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        kotlin.collections.CollectionsKt.addAll(arrayList6, ((com.apollographql.apollo.api.CompiledField) it2.next()).getSelections());
                    }
                    com.apollographql.apollo.api.CompiledField build = newBuilder.selections(arrayList6).condition(kotlin.collections.CollectionsKt.emptyList()).build();
                    java.lang.String nameWithArguments = build.nameWithArguments(this.getHighResolutionOutputSizeshNQ4ISI);
                    java.lang.String str2 = kotlin.jvm.internal.Intrinsics.areEqual(p1, com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.rootKey().getKey()) ? null : p1;
                    java.lang.Object value = entry.getValue();
                    com.apollographql.apollo.api.CompiledType type = build.getType();
                    if (str2 == null) {
                        obj = nameWithArguments;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str2);
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        sb.append(nameWithArguments);
                        obj = sb.toString();
                    }
                    pair = kotlin.TuplesKt.to(nameWithArguments, Camera2StreamConfigurationMap(value, build, type, obj));
                    if (pair == null) {
                        arrayList.add(pair);
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        com.apollographql.apollo.cache.normalized.api.Record record = new com.apollographql.apollo.cache.normalized.api.Record(p1, kotlin.collections.MapsKt.toMap(arrayList), null, 4, null);
        com.apollographql.apollo.cache.normalized.api.Record record2 = this.Camera2StreamConfigurationMap.get(p1);
        if (record2 != null) {
            record = record2.mergeWith(record).getFirst();
        }
        this.Camera2StreamConfigurationMap.put(p1, record);
        return new com.apollographql.apollo.cache.normalized.api.CacheKey(p1);
    }

    private final java.lang.Object Camera2StreamConfigurationMap(java.lang.Object p0, com.apollographql.apollo.api.CompiledField p1, com.apollographql.apollo.api.CompiledType p2, java.lang.String p3) {
        java.lang.String key;
        if (p2 instanceof com.apollographql.apollo.api.CompiledNotNullType) {
            if (p0 == null) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p2 = ((com.apollographql.apollo.api.CompiledNotNullType) p2).getOfType();
        } else if (p0 == null) {
            return null;
        }
        if (p2 instanceof com.apollographql.apollo.api.CompiledListType) {
            if (!(p0 instanceof java.util.List)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Iterable iterable = (java.lang.Iterable) p0;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            int i = 0;
            for (java.lang.Object obj : iterable) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.apollographql.apollo.api.CompiledType ofType = ((com.apollographql.apollo.api.CompiledListType) p2).getOfType();
                java.lang.String valueOf = java.lang.String.valueOf(i);
                if (p3 != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(p3);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    sb.append(valueOf);
                    valueOf = sb.toString();
                }
                arrayList.add(Camera2StreamConfigurationMap(obj, p1, ofType, valueOf));
                i++;
            }
            return arrayList;
        }
        if (!(p2 instanceof com.apollographql.apollo.api.CompiledNamedType) || !com.apollographql.apollo.api.CompiledGraphQL.isComposite((com.apollographql.apollo.api.CompiledNamedType) p2)) {
            return p0;
        }
        if (!(p0 instanceof java.util.Map)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) p0;
        com.apollographql.apollo.cache.normalized.api.CacheKey cacheKeyForObject = this.getHighSpeedVideoSizes.cacheKeyForObject(map, new com.apollographql.apollo.cache.normalized.api.CacheKeyGeneratorContext(p1, this.getHighResolutionOutputSizeshNQ4ISI));
        if (cacheKeyForObject != null && (key = cacheKeyForObject.getKey()) != null) {
            p3 = key;
        }
        return getHighResolutionOutputSizeshNQ4ISI(map, p3, p1.getSelections(), p1.getType().rawType().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Camera2StreamConfigurationMap(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> p0, java.lang.String p1, java.lang.String p2, com.apollographql.apollo.cache.normalized.api.internal.Normalizer.CollectState p3) {
        for (com.apollographql.apollo.api.CompiledSelection compiledSelection : p0) {
            if (compiledSelection instanceof com.apollographql.apollo.api.CompiledField) {
                p3.getHighResolutionOutputSizeshNQ4ISI.add(compiledSelection);
            } else {
                if (!(compiledSelection instanceof com.apollographql.apollo.api.CompiledFragment)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.apollographql.apollo.api.CompiledFragment compiledFragment = (com.apollographql.apollo.api.CompiledFragment) compiledSelection;
                if (kotlin.collections.CollectionsKt.contains(compiledFragment.getPossibleTypes(), p2) || kotlin.jvm.internal.Intrinsics.areEqual(compiledFragment.getTypeCondition(), p1)) {
                    Camera2StreamConfigurationMap(compiledFragment.getSelections(), p1, p2, p3);
                }
            }
        }
    }
}
