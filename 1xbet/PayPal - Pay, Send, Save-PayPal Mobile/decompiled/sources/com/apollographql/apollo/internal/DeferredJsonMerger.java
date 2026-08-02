package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\b¢\u0006\u0004\b\t\u0010\u000bJC\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0003R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\b8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010&\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%"}, d2 = {"Lcom/apollographql/apollo/internal/DeferredJsonMerger;", "", "<init>", "()V", "Lokio/BufferedSource;", "payload", "", "", "Lcom/apollographql/apollo/internal/JsonMap;", "merge", "(Lokio/BufferedSource;)Ljava/util/Map;", "(Ljava/util/Map;)Ljava/util/Map;", "", "Lcom/apollographql/apollo/internal/MutableJsonMap;", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Ljava/util/Map;)V", "reset", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "merged", "getMerged", "()Ljava/util/Map;", "", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "Ljava/util/Set;", "", "mergedFragmentIds", "getMergedFragmentIds", "()Ljava/util/Set;", "", "hasNext", "Z", "getHasNext", "()Z", "isEmptyPayload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeferredJsonMerger {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> getHighSpeedVideoFpsRanges;
    private boolean hasNext;
    private boolean isEmptyPayload;
    private final java.util.Map<java.lang.String, java.lang.Object> merged;
    private final java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> mergedFragmentIds;

    public DeferredJsonMerger() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
        this.merged = linkedHashMap;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.getHighSpeedVideoFpsRanges = linkedHashSet;
        this.mergedFragmentIds = linkedHashSet;
        this.hasNext = true;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMerged() {
        return this.merged;
    }

    public final java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> getMergedFragmentIds() {
        return this.mergedFragmentIds;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    /* renamed from: isEmptyPayload, reason: from getter */
    public final boolean getIsEmptyPayload() {
        return this.isEmptyPayload;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> merge(java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        if (this.merged.isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.putAll(payload);
            return this.merged;
        }
        java.lang.Object obj = payload.get("incremental");
        java.util.List<java.util.Map> list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list == null) {
            this.isEmptyPayload = true;
        } else {
            this.isEmptyPayload = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.util.Map map : list) {
                java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = (java.util.Map) map.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                java.lang.Object obj2 = map.get("path");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                java.util.List list2 = (java.util.List) obj2;
                java.lang.Object obj3 = this.merged.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                java.lang.Object obj4 = (java.util.Map) obj3;
                if (map2 != null) {
                    for (java.lang.Object obj5 : list2) {
                        if (obj4 instanceof java.util.List) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
                            obj4 = ((java.util.List) obj4).get(((java.lang.Integer) obj5).intValue());
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                            obj4 = ((java.util.Map) obj4).get(obj5);
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                    getHighSpeedVideoFpsRanges(kotlin.jvm.internal.TypeIntrinsics.asMutableMap(obj4), map2);
                    this.getHighSpeedVideoFpsRanges.add(new com.apollographql.apollo.api.DeferredFragmentIdentifier(list2, (java.lang.String) map.get("label")));
                }
                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
                java.util.List list3 = obj6 instanceof java.util.List ? (java.util.List) obj6 : null;
                if (list3 != null) {
                    kotlin.collections.CollectionsKt.addAll(arrayList, list3);
                }
                java.lang.Object obj7 = map.get(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
                java.util.Map map3 = obj7 instanceof java.util.Map ? (java.util.Map) obj7 : null;
                if (map3 != null) {
                    arrayList2.add(map3);
                }
            }
            if (!arrayList.isEmpty()) {
                this.getHighSpeedVideoFpsRangesFor.put(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, arrayList);
            } else {
                this.getHighSpeedVideoFpsRangesFor.remove(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            }
            if (!arrayList2.isEmpty()) {
                this.getHighSpeedVideoFpsRangesFor.put(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("incremental", arrayList2)));
            } else {
                this.getHighSpeedVideoFpsRangesFor.remove(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) payload.get("hasNext");
        this.hasNext = bool != null ? bool.booleanValue() : false;
        return this.merged;
    }

    private final void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> p0, java.util.Map<java.lang.String, ? extends java.lang.Object> p1) {
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : p1.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (p0.containsKey(key) && kotlin.jvm.internal.TypeIntrinsics.isMutableMap(p0.get(key))) {
                java.lang.Object obj = p0.get(key);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                java.util.Map<java.lang.String, java.lang.Object> asMutableMap = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(obj);
                java.util.Map<java.lang.String, ? extends java.lang.Object> map = value instanceof java.util.Map ? (java.util.Map) value : null;
                if (map == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
                    sb.append(key);
                    sb.append("' is an object in destination but not in map");
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                getHighSpeedVideoFpsRanges(asMutableMap, map);
            } else {
                p0.put(key, value);
            }
        }
    }

    public final void reset() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighSpeedVideoFpsRanges.clear();
        this.hasNext = true;
        this.isEmptyPayload = false;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> merge(okio.BufferedSource payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        java.lang.Object readAny = com.apollographql.apollo.api.json.JsonReaders.readAny(new com.apollographql.apollo.api.json.BufferedSourceJsonReader(payload));
        kotlin.jvm.internal.Intrinsics.checkNotNull(readAny, "");
        return merge((java.util.Map<java.lang.String, ? extends java.lang.Object>) readAny);
    }
}
