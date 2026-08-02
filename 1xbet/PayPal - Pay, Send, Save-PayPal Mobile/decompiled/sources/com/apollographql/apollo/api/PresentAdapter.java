package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/api/PresentAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/Optional$Present;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/apollographql/apollo/api/Optional$Present;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/api/Optional$Present;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/api/Adapter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PresentAdapter<T> implements com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.Optional.Present<T>> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.Adapter<T> getHighSpeedVideoFpsRanges;

    public PresentAdapter(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.getHighSpeedVideoFpsRanges = adapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final com.apollographql.apollo.api.Optional.Present<T> fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return new com.apollographql.apollo.api.Optional.Present<>(this.getHighSpeedVideoFpsRanges.fromJson(reader, customScalarAdapters));
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.api.Optional.Present<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.toJson(writer, customScalarAdapters, value.getValue());
    }
}
