package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/api/BuilderProperty;", "T", "", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "Lcom/apollographql/apollo/api/ObjectBuilder;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Lcom/apollographql/apollo/api/ObjectBuilder;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setValue", "(Lcom/apollographql/apollo/api/ObjectBuilder;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lcom/apollographql/apollo/api/Adapter;", "getAdapter", "()Lcom/apollographql/apollo/api/Adapter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuilderProperty<T> {
    private final com.apollographql.apollo.api.Adapter<T> adapter;

    public BuilderProperty(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        this.adapter = adapter;
    }

    public final com.apollographql.apollo.api.Adapter<T> getAdapter() {
        return this.adapter;
    }

    public final T getValue(com.apollographql.apollo.api.ObjectBuilder<?> thisRef, kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        java.lang.Object obj = thisRef.get__fields().get(property.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return this.adapter.fromJson(new com.apollographql.apollo.api.json.MapJsonReader((java.util.Map) obj, null, 2, null), com.apollographql.apollo.api.CustomScalarAdapters.Empty);
    }

    public final void setValue(com.apollographql.apollo.api.ObjectBuilder<?> thisRef, kotlin.reflect.KProperty<?> property, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        java.util.Map<java.lang.String, java.lang.Object> map = thisRef.get__fields();
        java.lang.String name2 = property.getName();
        com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
        this.adapter.toJson(mapJsonWriter, com.apollographql.apollo.api.CustomScalarAdapters.Empty, value);
        map.put(name2, mapJsonWriter.root());
    }
}
