package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "Lcom/apollographql/apollo/api/BuilderScope;", "Builder", "(Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/apollographql/apollo/api/BuilderScope;", "T", "Lcom/apollographql/apollo/api/Adapter;", "adapter", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "adaptValue", "(Lcom/apollographql/apollo/api/Adapter;Ljava/lang/Object;)Ljava/lang/Object;", "GlobalBuilder", "Lcom/apollographql/apollo/api/BuilderScope;", "getGlobalBuilder", "()Lcom/apollographql/apollo/api/BuilderScope;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ObjectBuilderKt {
    private static final com.apollographql.apollo.api.BuilderScope GlobalBuilder = new com.apollographql.apollo.api.BuilderScope() { // from class: com.apollographql.apollo.api.ObjectBuilderKt$GlobalBuilder$1
        @Override // com.apollographql.apollo.api.BuilderScope
        /* renamed from: getCustomScalarAdapters */
        public final com.apollographql.apollo.api.CustomScalarAdapters getGetHighSpeedVideoFpsRangesFor() {
            return com.apollographql.apollo.api.CustomScalarAdapters.PassThrough;
        }
    };

    public static final com.apollographql.apollo.api.BuilderScope Builder(final com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return new com.apollographql.apollo.api.BuilderScope() { // from class: com.apollographql.apollo.api.ObjectBuilderKt$Builder$1
            @Override // com.apollographql.apollo.api.BuilderScope
            /* renamed from: getCustomScalarAdapters, reason: from getter */
            public final com.apollographql.apollo.api.CustomScalarAdapters getGetHighSpeedVideoFpsRangesFor() {
                return com.apollographql.apollo.api.CustomScalarAdapters.this;
            }
        };
    }

    public static final com.apollographql.apollo.api.BuilderScope getGlobalBuilder() {
        return GlobalBuilder;
    }

    public static final <T> java.lang.Object adaptValue(com.apollographql.apollo.api.Adapter<T> adapter, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
        adapter.toJson(mapJsonWriter, com.apollographql.apollo.api.CustomScalarAdapters.Empty, t);
        return mapJsonWriter.root();
    }
}
