package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000f\u0012\u000b\u0012\t\u0018\u00018\u0000¢\u0006\u0002\b\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/api/CatchToNullAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "p0", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "p1", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "p2", "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/Adapter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CatchToNullAdapter<T> implements com.apollographql.apollo.api.Adapter<T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.Adapter<T> Camera2StreamConfigurationMap;

    public CatchToNullAdapter(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.Camera2StreamConfigurationMap = adapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final T fromJson(com.apollographql.apollo.api.json.JsonReader p0, com.apollographql.apollo.api.CustomScalarAdapters p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        try {
            return this.Camera2StreamConfigurationMap.fromJson(p0, p1);
        } catch (com.apollographql.apollo.exception.ApolloException unused) {
            return null;
        }
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter p0, com.apollographql.apollo.api.CustomScalarAdapters p1, T p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (p2 == null) {
            p0.nullValue();
        } else {
            this.Camera2StreamConfigurationMap.toJson(p0, p1, p2);
        }
    }
}
