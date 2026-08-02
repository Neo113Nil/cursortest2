package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0003345BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010 \u001a\u00020\u0017*\u0004\u0018\u00010\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$R4\u0010-\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader;", "", "Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "", "rootKey", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "cacheResolver", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "rootSelections", "rootTypename", "<init>", "(Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;Ljava/lang/String;Lcom/apollographql/apollo/api/Executable$Variables;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;Ljava/util/List;Ljava/lang/String;)V", "p0", "p1", "p2", "Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$CollectState;", "p3", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$CollectState;)V", "Lcom/apollographql/apollo/api/CompiledField;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/Executable$Variables;Ljava/lang/String;)Ljava/util/List;", "Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "collectData", "()Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;", "getInputFormats", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/apollographql/apollo/api/Executable$Variables;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "getOutputFormats", "Ljava/util/List;", "getHighSpeedVideoSizesFor", "", "", "Ljava/util/Map;", "", "Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$PendingReference;", "PendingReference", "CollectState", "CacheBatchReaderData"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheBatchReader {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.CacheHeaders getHighSpeedVideoFpsRangesFor;
    private final com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.util.List<java.lang.Object>, java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.CacheResolver getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.Executable.Variables Camera2StreamConfigurationMap;
    private final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    public CacheBatchReader(com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache, java.lang.String str, com.apollographql.apollo.api.Executable.Variables variables, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readOnlyNormalizedCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = readOnlyNormalizedCache;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = variables;
        this.getHighSpeedVideoFpsRanges = cacheResolver;
        this.getHighSpeedVideoFpsRangesFor = cacheHeaders;
        this.getOutputFormats = list;
        this.getInputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizesFor = new java.util.LinkedHashMap();
        this.getInputFormats = new java.util.ArrayList();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$PendingReference;", "", "", "key", "", "path", "Lcom/apollographql/apollo/api/CompiledSelection;", "selections", "parentType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "getSelections", "getParentType"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PendingReference {
        private final java.lang.String key;
        private final java.lang.String parentType;
        private final java.util.List<java.lang.Object> path;
        private final java.util.List<com.apollographql.apollo.api.CompiledSelection> selections;

        /* JADX WARN: Multi-variable type inference failed */
        public PendingReference(java.lang.String str, java.util.List<? extends java.lang.Object> list, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list2, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.key = str;
            this.path = list;
            this.selections = list2;
            this.parentType = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.util.List<java.lang.Object> getPath() {
            return this.path;
        }

        public final java.util.List<com.apollographql.apollo.api.CompiledSelection> getSelections() {
            return this.selections;
        }

        public final java.lang.String getParentType() {
            return this.parentType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\u0006\n\u0004\b\b\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$CollectState;", "", "Lcom/apollographql/apollo/api/Executable$Variables;", "p0", "<init>", "(Lcom/apollographql/apollo/api/Executable$Variables;)V", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/api/Executable$Variables;", "Camera2StreamConfigurationMap", "", "Lcom/apollographql/apollo/api/CompiledField;", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class CollectState {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.util.List<com.apollographql.apollo.api.CompiledField> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final com.apollographql.apollo.api.Executable.Variables Camera2StreamConfigurationMap;

        public CollectState(com.apollographql.apollo.api.Executable.Variables variables) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
            this.Camera2StreamConfigurationMap = variables;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getHighSpeedVideoFpsRanges(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> p0, java.lang.String p1, java.lang.String p2, com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CollectState p3) {
        for (com.apollographql.apollo.api.CompiledSelection compiledSelection : p0) {
            if (compiledSelection instanceof com.apollographql.apollo.api.CompiledField) {
                p3.getHighResolutionOutputSizeshNQ4ISI.add(compiledSelection);
            } else {
                if (!(compiledSelection instanceof com.apollographql.apollo.api.CompiledFragment)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.apollographql.apollo.api.CompiledFragment compiledFragment = (com.apollographql.apollo.api.CompiledFragment) compiledSelection;
                if (kotlin.collections.CollectionsKt.contains(compiledFragment.getPossibleTypes(), p2) || kotlin.jvm.internal.Intrinsics.areEqual(compiledFragment.getTypeCondition(), p1)) {
                    if (!com.apollographql.apollo.cache.normalized.api.internal.ShouldSkipKt.shouldSkip(compiledFragment, (java.util.Map<java.lang.String, ? extends java.lang.Object>) p3.Camera2StreamConfigurationMap.getValueMap())) {
                        getHighSpeedVideoFpsRanges(compiledFragment.getSelections(), p1, p2, p3);
                    }
                }
            }
        }
    }

    private final java.util.List<com.apollographql.apollo.api.CompiledField> getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> p0, java.lang.String p1, com.apollographql.apollo.api.Executable.Variables p2, java.lang.String p3) {
        com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CollectState collectState = new com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CollectState(p2);
        getHighSpeedVideoFpsRanges(p0, p1, p3, collectState);
        java.util.List<com.apollographql.apollo.api.CompiledField> list = collectState.getHighResolutionOutputSizeshNQ4ISI;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            com.apollographql.apollo.api.CompiledField compiledField = (com.apollographql.apollo.api.CompiledField) obj;
            kotlin.Pair pair = kotlin.TuplesKt.to(compiledField.getResponseName(), compiledField.getCondition());
            java.lang.Object obj2 = linkedHashMap.get(pair);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(pair, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.Collection<java.util.List> values = linkedHashMap.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        for (java.util.List list2 : values) {
            com.apollographql.apollo.api.CompiledField.Builder newBuilder = ((com.apollographql.apollo.api.CompiledField) kotlin.collections.CollectionsKt.first(list2)).newBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.apollographql.apollo.api.CompiledField) it.next()).getSelections());
            }
            arrayList.add(newBuilder.selections(arrayList2).build());
        }
        return arrayList;
    }

    public final com.apollographql.apollo.cache.normalized.api.CacheData collectData() {
        kotlin.Pair pair;
        this.getInputFormats.add(new com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference(this.getHighSpeedVideoSizes, kotlin.collections.CollectionsKt.emptyList(), this.getOutputFormats, this.getInputSizeshNQ4ISI));
        while (!this.getInputFormats.isEmpty()) {
            com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache readOnlyNormalizedCache = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference> list = this.getInputFormats;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference) it.next()).getKey());
            }
            java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> loadRecords = readOnlyNormalizedCache.loadRecords(arrayList, this.getHighSpeedVideoFpsRangesFor);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(loadRecords, 10)), 16));
            for (java.lang.Object obj : loadRecords) {
                linkedHashMap.put(((com.apollographql.apollo.cache.normalized.api.Record) obj).getKey(), obj);
            }
            java.util.List<com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference> list2 = kotlin.collections.CollectionsKt.toList(this.getInputFormats);
            this.getInputFormats.clear();
            for (com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference pendingReference : list2) {
                java.lang.Object obj2 = linkedHashMap.get(pendingReference.getKey());
                if (obj2 == null) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(pendingReference.getKey(), com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.rootKey().getKey())) {
                        throw new com.apollographql.apollo.exception.CacheMissException(pendingReference.getKey(), null, false, 6, null);
                    }
                    obj2 = new com.apollographql.apollo.cache.normalized.api.Record(pendingReference.getKey(), kotlin.collections.MapsKt.emptyMap(), null, 4, null);
                }
                java.util.List<com.apollographql.apollo.api.CompiledSelection> selections = pendingReference.getSelections();
                java.lang.String parentType = pendingReference.getParentType();
                com.apollographql.apollo.api.Executable.Variables variables = this.Camera2StreamConfigurationMap;
                com.apollographql.apollo.cache.normalized.api.Record record = (com.apollographql.apollo.cache.normalized.api.Record) obj2;
                java.lang.Object obj3 = record.get((java.lang.Object) "__typename");
                java.util.List<com.apollographql.apollo.api.CompiledField> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(selections, parentType, variables, obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.apollographql.apollo.api.CompiledField compiledField : highResolutionOutputSizeshNQ4ISI) {
                    if (com.apollographql.apollo.cache.normalized.api.internal.ShouldSkipKt.shouldSkip(compiledField, (java.util.Map<java.lang.String, ? extends java.lang.Object>) this.Camera2StreamConfigurationMap.getValueMap())) {
                        pair = null;
                    } else {
                        java.lang.Object resolveField = this.getHighSpeedVideoFpsRanges.resolveField(compiledField, this.Camera2StreamConfigurationMap, (java.util.Map) obj2, record.getKey());
                        getHighSpeedVideoFpsRangesFor(resolveField, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) pendingReference.getPath(), compiledField.getResponseName()), compiledField.getSelections(), compiledField.getType().rawType().getName());
                        pair = kotlin.TuplesKt.to(compiledField.getResponseName(), resolveField);
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                this.getHighSpeedVideoSizesFor.put(pendingReference.getPath(), kotlin.collections.MapsKt.toMap(arrayList2));
            }
        }
        return new com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CacheBatchReaderData(this.getHighSpeedVideoSizesFor);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.util.List<? extends java.lang.Object> list, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list2, java.lang.String str) {
        kotlin.Pair pair;
        if (obj instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
            this.getInputFormats.add(new com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.PendingReference(((com.apollographql.apollo.cache.normalized.api.CacheKey) obj).getKey(), list, list2, str));
            return;
        }
        if (!(obj instanceof java.util.List)) {
            if (obj instanceof java.util.Map) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                java.util.Map<java.lang.String, java.lang.Object> map = (java.util.Map) obj;
                com.apollographql.apollo.api.Executable.Variables variables = this.Camera2StreamConfigurationMap;
                java.lang.Object obj2 = map.get("__typename");
                java.util.List<com.apollographql.apollo.api.CompiledField> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list2, str, variables, obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.apollographql.apollo.api.CompiledField compiledField : highResolutionOutputSizeshNQ4ISI) {
                    if (com.apollographql.apollo.cache.normalized.api.internal.ShouldSkipKt.shouldSkip(compiledField, (java.util.Map<java.lang.String, ? extends java.lang.Object>) this.Camera2StreamConfigurationMap.getValueMap())) {
                        pair = null;
                    } else {
                        java.lang.Object resolveField = this.getHighSpeedVideoFpsRanges.resolveField(compiledField, this.Camera2StreamConfigurationMap, map, "");
                        getHighSpeedVideoFpsRangesFor(resolveField, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, compiledField.getResponseName()), compiledField.getSelections(), compiledField.getType().rawType().getName());
                        pair = kotlin.TuplesKt.to(compiledField.getResponseName(), resolveField);
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                kotlin.collections.MapsKt.toMap(arrayList);
                return;
            }
            return;
        }
        int i = 0;
        for (java.lang.Object obj3 : (java.lang.Iterable) obj) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            getHighSpeedVideoFpsRangesFor(obj3, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Integer>) list, java.lang.Integer.valueOf(i)), list2, str);
            i++;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012&\u0010\u0006\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R4\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/CacheBatchReader$CacheBatchReaderData;", "Lcom/apollographql/apollo/cache/normalized/api/CacheData;", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "toMap", "()Ljava/util/Map;", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class CacheBatchReaderData implements com.apollographql.apollo.cache.normalized.api.CacheData {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.Map<java.util.List<java.lang.Object>, java.util.Map<java.lang.String, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public CacheBatchReaderData(java.util.Map<java.util.List<java.lang.Object>, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.getHighResolutionOutputSizeshNQ4ISI = map;
        }

        @Override // com.apollographql.apollo.cache.normalized.api.CacheData
        public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.get(kotlin.collections.CollectionsKt.emptyList()), kotlin.collections.CollectionsKt.emptyList());
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap, "");
            return (java.util.Map) Camera2StreamConfigurationMap;
        }

        private final java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj, java.util.List<? extends java.lang.Object> list) {
            while (obj instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
                obj = this.getHighResolutionOutputSizeshNQ4ISI.get(list);
            }
            if (obj instanceof java.util.List) {
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                int i = 0;
                for (java.lang.Object obj2 : iterable) {
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(Camera2StreamConfigurationMap(obj2, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Integer>) list, java.lang.Integer.valueOf(i))));
                    i++;
                }
                return arrayList;
            }
            if (!(obj instanceof java.util.Map)) {
                return obj;
            }
            java.util.Map map = (java.util.Map) obj;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Object key2 = entry.getKey();
                kotlin.jvm.internal.Intrinsics.checkNotNull(key2, "");
                linkedHashMap.put(key, Camera2StreamConfigurationMap(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, (java.lang.String) key2)));
            }
            return linkedHashMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheBatchReaderData(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CacheBatchReaderData) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((com.apollographql.apollo.cache.normalized.api.internal.CacheBatchReader.CacheBatchReaderData) p0).getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
