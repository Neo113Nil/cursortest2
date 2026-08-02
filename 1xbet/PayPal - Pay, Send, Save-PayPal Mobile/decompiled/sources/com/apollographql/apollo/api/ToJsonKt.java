package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "toJson", "(Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/String;", "toResponseJson"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToJsonKt {
    public static /* synthetic */ java.lang.String toJson$default(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        return toJson(data, customScalarAdapters);
    }

    public static /* synthetic */ java.lang.String toResponseJson$default(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        return toResponseJson(data, customScalarAdapters);
    }

    public static final java.lang.String toJson(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api._DataKt.toJson(data, new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), customScalarAdapters);
        return buffer.readUtf8();
    }

    public static final java.lang.String toResponseJson(com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null);
        bufferedSinkJsonWriter.beginObject();
        bufferedSinkJsonWriter.name(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        com.apollographql.apollo.api._DataKt.toJson(data, bufferedSinkJsonWriter, customScalarAdapters);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }
}
