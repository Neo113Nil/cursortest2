package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/apollographql/apollo/api/CatchToResultAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/FieldResult;", "p0", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/apollographql/apollo/api/FieldResult;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/api/Adapter;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CatchToResultAdapter<T> implements com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.FieldResult<? extends T>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.Adapter<T> getHighResolutionOutputSizeshNQ4ISI;

    public CatchToResultAdapter(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = adapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.Adapter
    public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Object obj) {
        com.apollographql.apollo.api.FieldResult fieldResult = (com.apollographql.apollo.api.FieldResult) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        if (fieldResult instanceof com.apollographql.apollo.api.FieldResult.Success) {
            this.getHighResolutionOutputSizeshNQ4ISI.toJson(jsonWriter, customScalarAdapters, com.apollographql.apollo.api.FieldResultKt.getOrThrow(fieldResult));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.apollographql.apollo.api.Adapter
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public com.apollographql.apollo.api.FieldResult<T> fromJson(com.apollographql.apollo.api.json.JsonReader p0, com.apollographql.apollo.api.CustomScalarAdapters p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        try {
            return new com.apollographql.apollo.api.FieldResult.Success(this.getHighResolutionOutputSizeshNQ4ISI.fromJson(p0, p1));
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            return new com.apollographql.apollo.api.FieldResult.Failure(e);
        }
    }
}
