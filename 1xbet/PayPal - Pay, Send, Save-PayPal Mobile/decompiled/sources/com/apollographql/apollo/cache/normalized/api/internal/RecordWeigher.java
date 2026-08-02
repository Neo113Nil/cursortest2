package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/RecordWeigher;", "", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "oldValue", "", "byteChange", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "record", "calculateBytes", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)I", "Lcom/apollographql/apollo/cache/normalized/api/RecordValue;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecordWeigher {
    public static final com.apollographql.apollo.cache.normalized.api.internal.RecordWeigher INSTANCE = new com.apollographql.apollo.cache.normalized.api.internal.RecordWeigher();

    private RecordWeigher() {
    }

    @kotlin.jvm.JvmStatic
    public static final int byteChange(java.lang.Object newValue, java.lang.Object oldValue) {
        return getHighResolutionOutputSizeshNQ4ISI(newValue) - getHighResolutionOutputSizeshNQ4ISI(oldValue);
    }

    @kotlin.jvm.JvmStatic
    public static final int calculateBytes(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        int length = okio.internal._Utf8Kt.commonAsUtf8ToByteArray(record.getKey()).length + 16;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : record.getFields().entrySet()) {
            length += okio.internal._Utf8Kt.commonAsUtf8ToByteArray(entry.getKey()).length + getHighResolutionOutputSizeshNQ4ISI(entry.getValue());
        }
        return length;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(java.lang.Object p0) {
        if (p0 == null) {
            return 4;
        }
        if (p0 instanceof java.lang.String) {
            return okio.internal._Utf8Kt.commonAsUtf8ToByteArray((java.lang.String) p0).length;
        }
        if (p0 instanceof java.lang.Boolean) {
            return 16;
        }
        if (p0 instanceof java.lang.Integer) {
            return 4;
        }
        if ((p0 instanceof java.lang.Long) || (p0 instanceof java.lang.Double)) {
            return 8;
        }
        if (p0 instanceof com.apollographql.apollo.api.json.JsonNumber) {
            return okio.internal._Utf8Kt.commonAsUtf8ToByteArray(((com.apollographql.apollo.api.json.JsonNumber) p0).getValue()).length + 8;
        }
        int i = 0;
        if (p0 instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) p0;
            java.util.Iterator it = map.keySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += getHighResolutionOutputSizeshNQ4ISI(it.next());
            }
            java.util.Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                i += getHighResolutionOutputSizeshNQ4ISI(it2.next());
            }
            return i2 + 16 + i;
        }
        if (p0 instanceof java.util.List) {
            java.util.Iterator it3 = ((java.lang.Iterable) p0).iterator();
            while (it3.hasNext()) {
                i += getHighResolutionOutputSizeshNQ4ISI(it3.next());
            }
            return i + 16;
        }
        if (p0 instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
            return okio.internal._Utf8Kt.commonAsUtf8ToByteArray(((com.apollographql.apollo.cache.normalized.api.CacheKey) p0).getKey()).length + 16;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown field type in Record: '");
        sb.append(p0);
        sb.append('\'');
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
