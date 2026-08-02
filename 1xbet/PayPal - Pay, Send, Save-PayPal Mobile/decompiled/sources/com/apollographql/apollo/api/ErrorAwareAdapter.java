package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/apollographql/apollo/api/ErrorAwareAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "p0", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "p1", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "p2", "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/api/Adapter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ErrorAwareAdapter<T> implements com.apollographql.apollo.api.Adapter<T> {
    private final com.apollographql.apollo.api.Adapter<T> getHighSpeedVideoFpsRanges;

    public ErrorAwareAdapter(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.getHighSpeedVideoFpsRanges = adapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final T fromJson(com.apollographql.apollo.api.json.JsonReader p0, com.apollographql.apollo.api.CustomScalarAdapters p1) {
        com.apollographql.apollo.api.Error firstErrorStartingWith;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (p0.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL && (firstErrorStartingWith = p1.firstErrorStartingWith(p0.getPath())) != null) {
            p0.skipValue();
            throw new com.apollographql.apollo.exception.ApolloGraphQLException(firstErrorStartingWith);
        }
        return this.getHighSpeedVideoFpsRanges.fromJson(p0, p1);
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter p0, com.apollographql.apollo.api.CustomScalarAdapters p1, T p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        this.getHighSpeedVideoFpsRanges.toJson(p0, p1, p2);
    }
}
