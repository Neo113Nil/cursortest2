package com.apollographql.apollo.api.internal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/apollographql/apollo/api/internal/ResponseParser;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/json/JsonReader;", "jsonReader", "Lcom/apollographql/apollo/api/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "requestUuid", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "deferredFragmentIds", "Lcom/apollographql/apollo/api/ApolloResponse;", "parse", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;)Lcom/apollographql/apollo/api/ApolloResponse;", "", "", "payload", "Lcom/apollographql/apollo/api/Error;", "parseError", "(Ljava/util/Map;)Lcom/apollographql/apollo/api/Error;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResponseParser {
    public static final com.apollographql.apollo.api.internal.ResponseParser INSTANCE = new com.apollographql.apollo.api.internal.ResponseParser();

    private ResponseParser() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parse(com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.Operation<D> operation, java.util.UUID requestUuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> deferredFragmentIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        jsonReader.beginObject();
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = null;
        com.apollographql.apollo.api.Operation.Data data = null;
        java.util.List<com.apollographql.apollo.api.Error> list = null;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1809421292) {
                if (hashCode == -1294635157) {
                    if (nextName.equals(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY)) {
                        list = com.apollographql.apollo.api.internal.ResponseParserKt.readErrors(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    if (hashCode == 3076010 && nextName.equals(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        com.apollographql.apollo.api.Operation<D> operation2 = operation;
                        data = (com.apollographql.apollo.api.Operation.Data) com.apollographql.apollo.api.Executables.parseData(operation2, jsonReader, customScalarAdapters, com.apollographql.apollo.api.Executables.falseVariables(operation2, customScalarAdapters), deferredFragmentIds, list);
                    }
                    jsonReader.skipValue();
                }
            } else if (nextName.equals(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
                java.lang.Object readAny = com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader);
                map = readAny instanceof java.util.Map ? (java.util.Map) readAny : null;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (requestUuid == null) {
            requestUuid = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestUuid, "");
        }
        return new com.apollographql.apollo.api.ApolloResponse.Builder(operation, requestUuid).errors(list).data(data).extensions(map).build();
    }

    public final com.apollographql.apollo.api.Error parseError(java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
        com.apollographql.apollo.api.Error Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        Camera2StreamConfigurationMap = com.apollographql.apollo.api.internal.ResponseParserKt.Camera2StreamConfigurationMap(new com.apollographql.apollo.api.json.MapJsonReader(payload, null, 2, null));
        return Camera2StreamConfigurationMap;
    }
}
