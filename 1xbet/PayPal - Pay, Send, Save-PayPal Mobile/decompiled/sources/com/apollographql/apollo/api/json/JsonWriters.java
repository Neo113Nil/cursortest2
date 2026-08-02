package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\n\u001aG\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonWriter;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeAny", "(Lcom/apollographql/apollo/api/json/JsonWriter;Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "writeObject", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lkotlin/jvm/functions/Function1;)V", "writeArray", "", "indent", "buildJsonString", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lokio/ByteString;", "buildJsonByteString", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lokio/ByteString;", "buildJsonMap", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.apollographql.apollo.api.json.-JsonWriters, reason: invalid class name */
/* loaded from: classes.dex */
public final class JsonWriters {
    public static final void writeAny(com.apollographql.apollo.api.json.JsonWriter jsonWriter, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
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
                if (obj instanceof java.lang.String) {
                    jsonWriter.value((java.lang.String) obj);
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot write ");
                sb.append(obj);
                sb.append(" of class '");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()));
                sb.append("' to Json");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            jsonWriter.beginArray();
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                writeAny(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return;
        }
        jsonWriter.beginObject();
        for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            jsonWriter.name(java.lang.String.valueOf(key));
            writeAny(jsonWriter, value);
        }
        jsonWriter.endObject();
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
    }

    public static final void writeObject(com.apollographql.apollo.api.json.JsonWriter jsonWriter, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        jsonWriter.beginObject();
        function1.invoke(jsonWriter);
        jsonWriter.endObject();
    }

    public static final void writeArray(com.apollographql.apollo.api.json.JsonWriter jsonWriter, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        jsonWriter.beginArray();
        function1.invoke(jsonWriter);
        jsonWriter.endArray();
    }

    public static /* synthetic */ java.lang.String buildJsonString$default(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        okio.Buffer buffer = new okio.Buffer();
        function1.invoke(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str));
        return buffer.readUtf8();
    }

    public static final java.lang.String buildJsonString(java.lang.String str, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        okio.Buffer buffer = new okio.Buffer();
        function1.invoke(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str));
        return buffer.readUtf8();
    }

    public static /* synthetic */ okio.ByteString buildJsonByteString$default(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        okio.Buffer buffer = new okio.Buffer();
        function1.invoke(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str));
        return buffer.readByteString();
    }

    public static final okio.ByteString buildJsonByteString(java.lang.String str, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        okio.Buffer buffer = new okio.Buffer();
        function1.invoke(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str));
        return buffer.readByteString();
    }

    public static final java.lang.Object buildJsonMap(kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
        function1.invoke(mapJsonWriter);
        return mapJsonWriter.root();
    }
}
