package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/BlobRecordSerializer;", "", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "record", "", "serialize", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)[B", "", "key", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "deserialize", "(Ljava/lang/String;[B)Lcom/apollographql/apollo/cache/normalized/api/Record;", "Lokio/Buffer;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lokio/Buffer;Ljava/lang/Object;)V", "(Lokio/Buffer;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlobRecordSerializer {
    public static final com.apollographql.apollo.cache.normalized.api.internal.BlobRecordSerializer INSTANCE = new com.apollographql.apollo.cache.normalized.api.internal.BlobRecordSerializer();

    private BlobRecordSerializer() {
    }

    public final byte[] serialize(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        okio.Buffer buffer = new okio.Buffer();
        java.util.Set<java.lang.String> keySet = record.getFields().keySet();
        buffer.writeInt(keySet.size());
        for (java.lang.String str : keySet) {
            buffer.writeInt(str.length());
            buffer.writeUtf8(str);
            java.util.Map<java.lang.String, java.lang.Long> date = record.getDate();
            getHighResolutionOutputSizeshNQ4ISI(buffer, date != null ? date.get(str) : null);
            getHighResolutionOutputSizeshNQ4ISI(buffer, record.getFields().get(str));
        }
        return buffer.readByteArray();
    }

    public final com.apollographql.apollo.cache.normalized.api.Record deserialize(java.lang.String key, byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        okio.Buffer write = new okio.Buffer().write(bytes);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        int readInt = write.readInt();
        for (int i = 0; i < readInt; i++) {
            java.lang.String readUtf8 = write.readUtf8(write.readInt());
            linkedHashMap2.put(readUtf8, (java.lang.Long) getHighResolutionOutputSizeshNQ4ISI(write));
            linkedHashMap.put(readUtf8, getHighResolutionOutputSizeshNQ4ISI(write));
        }
        return new com.apollographql.apollo.cache.normalized.api.Record(key, linkedHashMap, null, linkedHashMap2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(okio.Buffer buffer, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            buffer.getBuffer().writeByte(0);
            okio.Buffer buffer2 = buffer.getBuffer();
            java.lang.String str = (java.lang.String) obj;
            buffer2.writeInt(str.length());
            buffer2.writeUtf8(str);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            buffer.getBuffer().writeByte(1);
            buffer.getBuffer().writeInt(((java.lang.Number) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            buffer.getBuffer().writeByte(2);
            buffer.getBuffer().writeLong(((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            buffer.getBuffer().writeByte(4);
            okio.Buffer buffer3 = buffer.getBuffer();
            java.lang.String valueOf = java.lang.String.valueOf(((java.lang.Number) obj).doubleValue());
            buffer3.writeInt(valueOf.length());
            buffer3.writeUtf8(valueOf);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            buffer.getBuffer().writeByte(3);
            buffer.getBuffer().writeByte(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
            buffer.getBuffer().writeByte(7);
            okio.Buffer buffer4 = buffer.getBuffer();
            java.lang.String key = ((com.apollographql.apollo.cache.normalized.api.CacheKey) obj).getKey();
            buffer4.writeInt(key.length());
            buffer4.writeUtf8(key);
            return;
        }
        if (obj instanceof java.util.List) {
            buffer.getBuffer().writeByte(5);
            buffer.getBuffer().writeInt(((java.util.List) obj).size());
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI(buffer.getBuffer(), it.next());
            }
            return;
        }
        if (!(obj instanceof java.util.Map)) {
            if (obj == null) {
                buffer.getBuffer().writeByte(8);
                return;
            }
            throw new java.lang.IllegalStateException("Trying to write unsupported Record value: ".concat(java.lang.String.valueOf(obj)).toString());
        }
        buffer.getBuffer().writeByte(6);
        java.util.Map map = (java.util.Map) obj;
        buffer.getBuffer().writeInt(map.size());
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        for (java.util.Map.Entry entry : map.entrySet()) {
            okio.Buffer buffer5 = buffer.getBuffer();
            java.lang.String str2 = (java.lang.String) entry.getKey();
            buffer5.writeInt(str2.length());
            buffer5.writeUtf8(str2);
            getHighResolutionOutputSizeshNQ4ISI(buffer.getBuffer(), entry.getValue());
        }
    }

    private static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(okio.Buffer buffer) {
        byte readByte = buffer.readByte();
        switch (readByte) {
            case 0:
                return buffer.readUtf8(buffer.readInt());
            case 1:
                return java.lang.Integer.valueOf(buffer.readInt());
            case 2:
                return java.lang.Long.valueOf(buffer.readLong());
            case 3:
                return java.lang.Boolean.valueOf(buffer.readByte() > 0);
            case 4:
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(buffer.readUtf8(buffer.readInt())));
            case 5:
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, buffer.readInt());
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
                java.util.Iterator<java.lang.Integer> it = until.iterator();
                while (it.hasNext()) {
                    ((kotlin.collections.IntIterator) it).nextInt();
                    arrayList.add(getHighResolutionOutputSizeshNQ4ISI(buffer));
                }
                return arrayList;
            case 6:
                kotlin.ranges.IntRange until2 = kotlin.ranges.RangesKt.until(0, buffer.readInt());
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until2, 10)), 16));
                java.util.Iterator<java.lang.Integer> it2 = until2.iterator();
                while (it2.hasNext()) {
                    ((kotlin.collections.IntIterator) it2).nextInt();
                    kotlin.Pair pair = kotlin.TuplesKt.to(buffer.readUtf8(buffer.readInt()), getHighResolutionOutputSizeshNQ4ISI(buffer));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return linkedHashMap;
            case 7:
                return new com.apollographql.apollo.cache.normalized.api.CacheKey(buffer.readUtf8(buffer.readInt()));
            case 8:
                return null;
            default:
                throw new java.lang.IllegalStateException("Trying to read unsupported Record value: ".concat(java.lang.String.valueOf((int) readByte)).toString());
        }
    }
}
