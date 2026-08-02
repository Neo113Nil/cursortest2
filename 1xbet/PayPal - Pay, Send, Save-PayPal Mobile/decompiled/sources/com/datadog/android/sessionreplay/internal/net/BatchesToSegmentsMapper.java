package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/BatchesToSegmentsMapper;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "", "batchData", "Lkotlin/Pair;", "Lcom/datadog/android/sessionreplay/model/MobileSegment;", "Lcom/google/gson/JsonObject;", "map", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BatchesToSegmentsMapper {
    public static final java.lang.String ILLEGAL_STATE_ENRICHED_RECORD_ERROR_MESSAGE = "SR BatchesToSegmentMapper: Enriched record was missing the context information";
    public static final java.lang.String RECORDS_KEY = "records";
    public static final java.lang.String TIMESTAMP_KEY = "timestamp";
    public static final java.lang.String UNABLE_TO_DESERIALIZE_ENRICHED_RECORD_ERROR_MESSAGE = "SR BatchesToSegmentMapper: unable to deserialize EnrichedRecord";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public BatchesToSegmentsMapper(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    public static final /* synthetic */ com.google.gson.JsonArray access$records(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper, com.google.gson.JsonObject jsonObject) {
        com.google.gson.JsonElement jsonElement = jsonObject.get("records");
        if (jsonElement != null) {
            return com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonArray(jsonElement, batchesToSegmentsMapper.getHighSpeedVideoFpsRangesFor);
        }
        return null;
    }

    public static final /* synthetic */ com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext access$rumContext(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper, com.google.gson.JsonObject jsonObject) {
        com.google.gson.JsonElement jsonElement = jsonObject.get("application_id");
        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
        com.google.gson.JsonElement jsonElement2 = jsonObject.get("session_id");
        java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        com.google.gson.JsonElement jsonElement3 = jsonObject.get("view_id");
        java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
        if (asString == null || asString2 == null || asString3 == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(batchesToSegmentsMapper.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$rumContext$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.ILLEGAL_STATE_ENRICHED_RECORD_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, true, (java.util.Map) null, 32, (java.lang.Object) null);
            return null;
        }
        return new com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext(asString, asString2, asString3, 0L, 8, null);
    }

    public static final /* synthetic */ java.lang.Long access$timestamp(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper, com.google.gson.JsonObject jsonObject) {
        com.google.gson.JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("timestamp");
        if (asJsonPrimitive != null) {
            return com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsLong(asJsonPrimitive, batchesToSegmentsMapper.getHighSpeedVideoFpsRangesFor);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<kotlin.Pair<com.datadog.android.sessionreplay.model.MobileSegment, com.google.gson.JsonObject>> map(com.datadog.android.api.context.DatadogContext datadogContext, java.util.List<byte[]> batchData) {
        kotlin.Pair pair;
        boolean z;
        java.lang.Long l;
        com.google.gson.JsonObject safeGetAsJsonObject;
        com.google.gson.JsonPrimitive asJsonPrimitive;
        com.google.gson.JsonObject safeGetAsJsonObject2;
        com.google.gson.JsonPrimitive asJsonPrimitive2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        kotlin.sequences.Sequence mapNotNull = kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(batchData), new kotlin.jvm.functions.Function1<byte[], com.google.gson.JsonObject>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$groupBatchDataIntoSegments$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.google.gson.JsonObject invoke(byte[] bArr) {
                com.datadog.android.api.InternalLogger internalLogger;
                com.datadog.android.api.InternalLogger internalLogger2;
                com.datadog.android.api.InternalLogger internalLogger3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(new java.lang.String(bArr, kotlin.text.Charsets.UTF_8));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    internalLogger3 = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this.getHighSpeedVideoFpsRangesFor;
                    return com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonObject(parseString, internalLogger3);
                } catch (com.google.gson.JsonParseException e) {
                    internalLogger2 = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this.getHighSpeedVideoFpsRangesFor;
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger2, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$groupBatchDataIntoSegments$1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.UNABLE_TO_DESERIALIZE_ENRICHED_RECORD_ERROR_MESSAGE;
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                    return null;
                } catch (java.lang.IllegalStateException e2) {
                    internalLogger = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this.getHighSpeedVideoFpsRangesFor;
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$groupBatchDataIntoSegments$1.2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.UNABLE_TO_DESERIALIZE_ENRICHED_RECORD_ERROR_MESSAGE;
                        }
                    }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
                    return null;
                }
            }

            {
                super(1);
            }
        }), new kotlin.jvm.functions.Function1<com.google.gson.JsonObject, kotlin.Pair<? extends com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext, ? extends com.google.gson.JsonArray>>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$groupBatchDataIntoSegments$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final kotlin.Pair<com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext, com.google.gson.JsonArray> invoke(com.google.gson.JsonObject jsonObject) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                com.google.gson.JsonArray access$records = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.access$records(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this, jsonObject);
                com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext access$rumContext = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.access$rumContext(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this, jsonObject);
                if (access$records == null || access$rumContext == null || access$records.isEmpty()) {
                    return null;
                }
                return new kotlin.Pair<>(access$rumContext, access$records);
            }

            {
                super(1);
            }
        });
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : mapNotNull) {
            com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext = (com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext) ((kotlin.Pair) obj).getFirst();
            java.lang.Object obj2 = linkedHashMap.get(sessionReplayRumContext);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(sessionReplayRumContext, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                jsonArray.addAll((com.google.gson.JsonArray) ((kotlin.Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, jsonArray);
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((com.google.gson.JsonArray) entry2.getValue()).isEmpty()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry3 : linkedHashMap3.entrySet()) {
            com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext2 = (com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext) entry3.getKey();
            kotlin.sequences.Sequence map = kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.sortedWith(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence((com.google.gson.JsonArray) entry3.getValue()), new kotlin.jvm.functions.Function1<com.google.gson.JsonElement, com.google.gson.JsonObject>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$mapToSegment$orderedRecords$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.google.gson.JsonObject invoke(com.google.gson.JsonElement jsonElement) {
                    com.datadog.android.api.InternalLogger internalLogger;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement, "");
                    internalLogger = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this.getHighSpeedVideoFpsRangesFor;
                    return com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonObject(jsonElement, internalLogger);
                }

                {
                    super(1);
                }
            }), new kotlin.jvm.functions.Function1<com.google.gson.JsonObject, kotlin.Pair<? extends com.google.gson.JsonObject, ? extends java.lang.Long>>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$mapToSegment$orderedRecords$2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final kotlin.Pair<com.google.gson.JsonObject, java.lang.Long> invoke(com.google.gson.JsonObject jsonObject) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                    java.lang.Long access$timestamp = com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.access$timestamp(com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper.this, jsonObject);
                    if (access$timestamp == null) {
                        return null;
                    }
                    return new kotlin.Pair<>(jsonObject, access$timestamp);
                }

                {
                    super(1);
                }
            }), new java.util.Comparator() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$mapToSegment$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Long) ((kotlin.Pair) t).getSecond(), (java.lang.Long) ((kotlin.Pair) t2).getSecond());
                }
            }), new kotlin.jvm.functions.Function1<kotlin.Pair<? extends com.google.gson.JsonObject, ? extends java.lang.Long>, com.google.gson.JsonObject>() { // from class: com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper$mapToSegment$orderedRecords$4
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final com.google.gson.JsonObject invoke(kotlin.Pair<com.google.gson.JsonObject, java.lang.Long> pair2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair2, "");
                    return pair2.getFirst();
                }
            });
            com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray();
            java.util.Iterator it2 = map.iterator();
            while (it2.hasNext()) {
                jsonArray2.add((com.google.gson.JsonObject) it2.next());
            }
            if (!jsonArray2.isEmpty()) {
                com.google.gson.JsonArray jsonArray3 = jsonArray2;
                com.google.gson.JsonElement jsonElement = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.firstOrNull(jsonArray3);
                java.lang.Long safeGetAsLong = (jsonElement == null || (safeGetAsJsonObject2 = com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonObject(jsonElement, this.getHighSpeedVideoFpsRangesFor)) == null || (asJsonPrimitive2 = safeGetAsJsonObject2.getAsJsonPrimitive("timestamp")) == null) ? null : com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsLong(asJsonPrimitive2, this.getHighSpeedVideoFpsRangesFor);
                com.google.gson.JsonElement jsonElement2 = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.lastOrNull(jsonArray3);
                java.lang.Long safeGetAsLong2 = (jsonElement2 == null || (safeGetAsJsonObject = com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonObject(jsonElement2, this.getHighSpeedVideoFpsRangesFor)) == null || (asJsonPrimitive = safeGetAsJsonObject.getAsJsonPrimitive("timestamp")) == null) ? null : com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsLong(asJsonPrimitive, this.getHighSpeedVideoFpsRangesFor);
                if (safeGetAsLong != null && safeGetAsLong2 != null) {
                    java.util.Iterator<com.google.gson.JsonElement> it3 = jsonArray3.iterator();
                    while (it3.hasNext()) {
                        com.google.gson.JsonPrimitive asJsonPrimitive3 = it3.next().getAsJsonObject().getAsJsonPrimitive("type");
                        if (asJsonPrimitive3 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonPrimitive3, "");
                            l = com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsLong(asJsonPrimitive3, this.getHighSpeedVideoFpsRangesFor);
                        } else {
                            l = null;
                        }
                        if ((l != null && l.longValue() == 10) || (l != null && l.longValue() == 2)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    com.datadog.android.sessionreplay.model.MobileSegment mobileSegment = new com.datadog.android.sessionreplay.model.MobileSegment(new com.datadog.android.sessionreplay.model.MobileSegment.Application(sessionReplayRumContext2.getApplicationId()), new com.datadog.android.sessionreplay.model.MobileSegment.Session(sessionReplayRumContext2.getSessionId()), new com.datadog.android.sessionreplay.model.MobileSegment.View(sessionReplayRumContext2.getViewId()), safeGetAsLong.longValue(), safeGetAsLong2.longValue(), jsonArray2.size(), null, java.lang.Boolean.valueOf(z), com.datadog.android.sessionreplay.internal.processor.MobileSegmentExtKt.tryFromSource(com.datadog.android.sessionreplay.model.MobileSegment.Source.INSTANCE, datadogContext.getSource(), this.getHighSpeedVideoFpsRangesFor), kotlin.collections.CollectionsKt.emptyList());
                    com.google.gson.JsonObject safeGetAsJsonObject3 = com.datadog.android.sessionreplay.internal.gson.GsonExtKt.safeGetAsJsonObject(mobileSegment.toJson(), this.getHighSpeedVideoFpsRangesFor);
                    if (safeGetAsJsonObject3 != null) {
                        safeGetAsJsonObject3.add("records", jsonArray2);
                        pair = new kotlin.Pair(mobileSegment, safeGetAsJsonObject3);
                        if (pair == null) {
                            arrayList.add(pair);
                        }
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        return arrayList;
    }
}
