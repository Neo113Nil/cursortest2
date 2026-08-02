package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0013\u0014J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable;", "Lcom/apollographql/apollo/api/Executable$Data;", "D", "", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Data", "Variables"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Executable<D extends com.apollographql.apollo.api.Executable.Data> {

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Data;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Data {
    }

    com.apollographql.apollo.api.Adapter<D> adapter();

    com.apollographql.apollo.api.CompiledField rootField();

    void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) throws java.io.IOException;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR/\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Variables;", "", "", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "Lcom/apollographql/apollo/api/VariablesJson;", "valueMap", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getValueMap", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Variables {
        private final java.util.Map<java.lang.String, java.lang.Object> valueMap;

        public Variables(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.valueMap = map;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getValueMap() {
            return this.valueMap;
        }
    }
}
