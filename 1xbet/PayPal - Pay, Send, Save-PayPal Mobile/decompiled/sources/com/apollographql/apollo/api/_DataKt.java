package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "jsonWriter", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "toJson", "(Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "", "indent", "toJsonString", "(Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class _DataKt {
    public static /* synthetic */ void toJson$default(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        toJson(data, jsonWriter, customScalarAdapters);
    }

    public static /* synthetic */ java.lang.String toJsonString$default(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return toJsonString(data, customScalarAdapters, str);
    }

    public static final java.lang.String toJsonString(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        toJson(data, new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str), customScalarAdapters);
        return buffer.readUtf8();
    }

    public static final void toJson(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        java.lang.String name2 = data.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
        java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix(name2, (java.lang.CharSequence) "$Data");
        java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(removeSuffix, ".", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String substringBeforeLast$default = kotlin.text.StringsKt.substringBeforeLast$default(removeSuffix, ".", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substringBeforeLast$default);
        sb.append(".adapter.");
        sb.append(substringAfterLast$default);
        sb.append("_ResponseAdapter$Data");
        java.lang.Object obj = java.lang.Class.forName(sb.toString()).getDeclaredField("INSTANCE").get(null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        com.apollographql.apollo.api.Adapters.m9940obj$default((com.apollographql.apollo.api.Adapter) obj, false, 1, null).toJson(jsonWriter, customScalarAdapters, data);
    }
}
