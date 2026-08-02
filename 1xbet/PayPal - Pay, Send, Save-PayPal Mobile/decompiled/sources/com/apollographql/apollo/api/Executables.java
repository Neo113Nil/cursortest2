package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010\u001ak\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001e\u001a\u00020\u001d\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Data;", "D", "Lcom/apollographql/apollo/api/Executable;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/apollographql/apollo/api/Executable$Variables;", "", "variablesJson", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/String;", "", "falseVariables", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/util/Set;", "", "withDefaultValues", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)Lcom/apollographql/apollo/api/Executable$Variables;", "Lcom/apollographql/apollo/api/json/JsonReader;", "jsonReader", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "deferredFragmentIds", "", "Lcom/apollographql/apollo/api/Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "parseData", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)Lcom/apollographql/apollo/api/Executable$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "jsonWriter", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "composeData", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/api/Executable$Data;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Executables {
    public static final <D extends com.apollographql.apollo.api.Executable.Data> com.apollographql.apollo.api.Executable.Variables variables(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return variables(executable, customScalarAdapters, false);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> java.lang.String variablesJson(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null, 2, null);
        bufferedSinkJsonWriter.beginObject();
        executable.serializeVariables(bufferedSinkJsonWriter, customScalarAdapters, false);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> java.util.Set<java.lang.String> falseVariables(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        java.util.Map<java.lang.String, java.lang.Object> valueMap = variables(executable, customScalarAdapters, true).getValueMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : valueMap.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), java.lang.Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> com.apollographql.apollo.api.Executable.Variables variables(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
        mapJsonWriter.beginObject();
        executable.serializeVariables(mapJsonWriter, customScalarAdapters, z);
        mapJsonWriter.endObject();
        java.lang.Object root = mapJsonWriter.root();
        kotlin.jvm.internal.Intrinsics.checkNotNull(root, "");
        return new com.apollographql.apollo.api.Executable.Variables((java.util.Map) root);
    }

    public static /* synthetic */ com.apollographql.apollo.api.Executable.Data parseData$default(com.apollographql.apollo.api.Executable executable, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set set, java.util.Set set2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        return parseData(executable, jsonReader, customScalarAdapters, (i & 4) != 0 ? null : set, (i & 8) != 0 ? null : set2, (i & 16) != 0 ? null : list);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D parseData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<java.lang.String> set, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set2, java.util.List<com.apollographql.apollo.api.Error> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return (D) com.apollographql.apollo.api.Adapters.m9938nullable(executable.adapter()).fromJson(jsonReader, customScalarAdapters.newBuilder().falseVariables(set).deferredFragmentIdentifiers(set2).errors(list).build());
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> void composeData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        executable.adapter().toJson(jsonWriter, customScalarAdapters, d);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D parseData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<java.lang.String> set, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, set, set2, null, 16, null);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D parseData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, set, null, null, 24, null);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D parseData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, null, null, null, 28, null);
    }

    public static final <D extends com.apollographql.apollo.api.Executable.Data> D parseData(com.apollographql.apollo.api.Executable<D> executable, com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        return (D) parseData$default(executable, jsonReader, null, null, null, null, 30, null);
    }
}
