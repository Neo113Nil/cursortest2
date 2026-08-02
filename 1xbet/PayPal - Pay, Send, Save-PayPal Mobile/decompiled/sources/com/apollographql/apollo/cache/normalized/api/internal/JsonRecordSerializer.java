package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\u000e\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/JsonRecordSerializer;", "", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "record", "", "serialize", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)Ljava/lang/String;", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;)Ljava/lang/Object;", "key", "jsonFieldSource", "deserialize", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "Lcom/apollographql/apollo/cache/normalized/api/RecordValue;", "", "getHighSpeedVideoSizes", "(Lcom/apollographql/apollo/api/json/JsonWriter;Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonRecordSerializer {
    public static final com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer INSTANCE = new com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer();

    private JsonRecordSerializer() {
    }

    public final java.lang.String serialize(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        return getHighSpeedVideoFpsRanges(record.getFields());
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        okio.Buffer buffer = new okio.Buffer();
        java.lang.Throwable th = null;
        com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null, 2, null);
        try {
            com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter2 = bufferedSinkJsonWriter;
            bufferedSinkJsonWriter2.beginObject();
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : p0.entrySet()) {
                java.lang.String key = entry.getKey();
                INSTANCE.getHighSpeedVideoSizes(bufferedSinkJsonWriter2.name(key), entry.getValue());
            }
            bufferedSinkJsonWriter2.endObject();
            try {
                bufferedSinkJsonWriter.close();
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                bufferedSinkJsonWriter.close();
            } catch (java.lang.Throwable th4) {
                kotlin.ExceptionsKt.addSuppressed(th, th4);
            }
        }
        if (th == null) {
            return buffer.readUtf8();
        }
        throw th;
    }

    private static java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.canDeserialize(str)) {
                return com.apollographql.apollo.cache.normalized.api.CacheKey.INSTANCE.deserialize(str);
            }
        } else if (!(obj instanceof java.util.Map)) {
            if (obj instanceof java.util.List) {
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(getHighSpeedVideoFpsRangesFor(it.next()));
                }
                return arrayList;
            }
        } else {
            java.util.Map map = (java.util.Map) obj;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), getHighSpeedVideoFpsRangesFor(entry.getValue()));
            }
            return linkedHashMap;
        }
        return obj;
    }

    public final com.apollographql.apollo.cache.normalized.api.Record deserialize(java.lang.String key, java.lang.String jsonFieldSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonFieldSource, "");
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.api.json.JsonReaders.readAny(new com.apollographql.apollo.api.json.BufferedSourceJsonReader(new okio.Buffer().write(okio.ByteString.INSTANCE.encodeUtf8(jsonFieldSource)))));
        java.util.Map map = highSpeedVideoFpsRangesFor instanceof java.util.Map ? (java.util.Map) highSpeedVideoFpsRangesFor : null;
        if (map == null) {
            throw new java.lang.IllegalStateException("error deserializing: ".concat(java.lang.String.valueOf(jsonFieldSource)).toString());
        }
        return new com.apollographql.apollo.cache.normalized.api.Record(key, map, null, 4, null);
    }

    private final void getHighSpeedVideoSizes(com.apollographql.apollo.api.json.JsonWriter jsonWriter, java.lang.Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof java.lang.String) {
            jsonWriter.value((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.Integer) {
            jsonWriter.value(((java.lang.Number) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            jsonWriter.value(((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            jsonWriter.value(((java.lang.Number) obj).doubleValue());
            return;
        }
        if (obj instanceof com.apollographql.apollo.api.json.JsonNumber) {
            jsonWriter.value((com.apollographql.apollo.api.json.JsonNumber) obj);
            return;
        }
        if (obj instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
            jsonWriter.value(((com.apollographql.apollo.cache.normalized.api.CacheKey) obj).serialize());
            return;
        }
        if (obj instanceof java.util.List) {
            jsonWriter.beginArray();
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                INSTANCE.getHighSpeedVideoSizes(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (obj instanceof java.util.Map) {
            jsonWriter.beginObject();
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                getHighSpeedVideoSizes(jsonWriter.name((java.lang.String) entry.getKey()), entry.getValue());
            }
            jsonWriter.endObject();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported record value type: '");
        sb.append(obj);
        sb.append('\'');
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
