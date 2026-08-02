package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/apollographql/apollo/api/ObjectAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "", "buffered", "<init>", "(Lcom/apollographql/apollo/api/Adapter;Z)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/Adapter;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectAdapter<T> implements com.apollographql.apollo.api.Adapter<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.Adapter<T> getHighSpeedVideoFpsRangesFor;

    public ObjectAdapter(com.apollographql.apollo.api.Adapter<T> adapter, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.getHighSpeedVideoFpsRangesFor = adapter;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final T fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        if (this.getHighSpeedVideoFpsRanges) {
            reader = com.apollographql.apollo.api.json.MapJsonReader.INSTANCE.buffer(reader);
        }
        reader.beginObject();
        T fromJson = this.getHighSpeedVideoFpsRangesFor.fromJson(reader, customScalarAdapters);
        reader.endObject();
        return fromJson;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        if (this.getHighSpeedVideoFpsRanges && !(writer instanceof com.apollographql.apollo.api.json.MapJsonWriter)) {
            com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
            mapJsonWriter.beginObject();
            this.getHighSpeedVideoFpsRangesFor.toJson(mapJsonWriter, customScalarAdapters, value);
            mapJsonWriter.endObject();
            java.lang.Object root = mapJsonWriter.root();
            kotlin.jvm.internal.Intrinsics.checkNotNull(root);
            com.apollographql.apollo.api.json.JsonWriters.writeAny(writer, root);
            return;
        }
        writer.beginObject();
        this.getHighSpeedVideoFpsRangesFor.toJson(writer, customScalarAdapters, value);
        writer.endObject();
    }
}
