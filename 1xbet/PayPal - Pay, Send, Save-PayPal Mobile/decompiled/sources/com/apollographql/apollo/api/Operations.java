package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a]\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u0018\u001a\u00020\u001a\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u001b\u001a]\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001e\u001a]\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/Operation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "jsonWriter", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "composeJsonRequest", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "jsonReader", "", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "deferredFragmentIdentifiers", "Lcom/apollographql/apollo/api/ApolloResponse;", "parseJsonResponse", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;)Lcom/apollographql/apollo/api/ApolloResponse;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "requestUuid", "parseResponse", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/json/JsonReader;Ljava/util/UUID;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;)Lcom/apollographql/apollo/api/ApolloResponse;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "composeJsonResponse", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "toApolloResponse", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;)Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Operations {
    public static /* synthetic */ void composeJsonRequest$default(com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        composeJsonRequest(operation, jsonWriter, customScalarAdapters);
    }

    public static /* synthetic */ com.apollographql.apollo.api.ApolloResponse parseJsonResponse$default(com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return parseJsonResponse(operation, jsonReader, customScalarAdapters, set);
    }

    @kotlin.Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @kotlin.ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseJsonResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set) {
        com.apollographql.apollo.api.ApolloResponse<D> apolloResponse;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.json.JsonReader jsonReader2 = jsonReader;
        java.lang.Throwable th = null;
        try {
            apolloResponse = com.apollographql.apollo.api.internal.ResponseParser.INSTANCE.parse(jsonReader2, operation, null, customScalarAdapters, set);
            try {
                jsonReader2.close();
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                jsonReader2.close();
            } catch (java.lang.Throwable th4) {
                kotlin.ExceptionsKt.addSuppressed(th3, th4);
            }
            th = th3;
            apolloResponse = null;
        }
        if (th == null) {
            return apolloResponse;
        }
        throw th;
    }

    public static /* synthetic */ com.apollographql.apollo.api.ApolloResponse parseResponse$default(com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.json.JsonReader jsonReader, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return parseResponse(operation, jsonReader, uuid, customScalarAdapters, (java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier>) set);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set) {
        com.apollographql.apollo.exception.ApolloNetworkException apolloNetworkException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        try {
            return com.apollographql.apollo.api.internal.ResponseParser.INSTANCE.parse(jsonReader, operation, uuid, customScalarAdapters, set);
        } catch (java.lang.Throwable th) {
            if (uuid == null) {
                uuid = java.util.UUID.randomUUID();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "");
            }
            com.apollographql.apollo.api.ApolloResponse.Builder builder = new com.apollographql.apollo.api.ApolloResponse.Builder(operation, uuid);
            if (th instanceof com.apollographql.apollo.exception.ApolloException) {
                apolloNetworkException = th;
            } else {
                apolloNetworkException = new com.apollographql.apollo.exception.ApolloNetworkException("Error while reading JSON response", th);
            }
            return builder.exception(apolloNetworkException).isLast(true).build();
        }
    }

    public static /* synthetic */ void composeJsonResponse$default(com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        composeJsonResponse(operation, jsonWriter, data, customScalarAdapters);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> void composeJsonResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.json.JsonWriter jsonWriter2 = jsonWriter;
        try {
            com.apollographql.apollo.api.json.JsonWriter jsonWriter3 = jsonWriter2;
            jsonWriter3.beginObject();
            jsonWriter3.name(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            operation.adapter().toJson(jsonWriter3, customScalarAdapters, d);
            jsonWriter3.endObject();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            try {
                jsonWriter2.close();
                th = null;
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                jsonWriter2.close();
            } catch (java.lang.Throwable th3) {
                kotlin.ExceptionsKt.addSuppressed(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public static /* synthetic */ java.lang.String composeJsonResponse$default(com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.Operation.Data data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        return composeJsonResponse((com.apollographql.apollo.api.Operation<com.apollographql.apollo.api.Operation.Data>) operation, data, customScalarAdapters);
    }

    public static /* synthetic */ com.apollographql.apollo.api.ApolloResponse toApolloResponse$default(com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.Operation operation, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return toApolloResponse(jsonReader, operation, uuid, customScalarAdapters, set);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> toApolloResponse(com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.Operation<D> operation, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set) {
        com.apollographql.apollo.api.ApolloResponse<D> apolloResponse;
        com.apollographql.apollo.exception.ApolloNetworkException apolloNetworkException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.json.JsonReader jsonReader2 = jsonReader;
        java.lang.Throwable th = null;
        try {
            com.apollographql.apollo.api.json.JsonReader jsonReader3 = jsonReader2;
            try {
                apolloResponse = com.apollographql.apollo.api.internal.ResponseParser.INSTANCE.parse(jsonReader, operation, uuid, customScalarAdapters, set);
            } catch (java.lang.Throwable th2) {
                if (uuid == null) {
                    uuid = java.util.UUID.randomUUID();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "");
                }
                com.apollographql.apollo.api.ApolloResponse.Builder builder = new com.apollographql.apollo.api.ApolloResponse.Builder(operation, uuid);
                if (th2 instanceof com.apollographql.apollo.exception.ApolloException) {
                    apolloNetworkException = th2;
                } else {
                    apolloNetworkException = new com.apollographql.apollo.exception.ApolloNetworkException("Error while reading JSON response", th2);
                }
                apolloResponse = builder.exception(apolloNetworkException).isLast(true).build();
            }
        } catch (java.lang.Throwable th3) {
            try {
                jsonReader2.close();
            } catch (java.lang.Throwable th4) {
                kotlin.ExceptionsKt.addSuppressed(th3, th4);
            }
            apolloResponse = null;
            th = th3;
        }
        if (jsonReader.getCamera2StreamConfigurationMap() != com.apollographql.apollo.api.json.JsonReader.Token.END_DOCUMENT) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_DOCUMENT but was ");
            sb.append(jsonReader.getCamera2StreamConfigurationMap());
            throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
        }
        try {
            jsonReader2.close();
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
        if (th == null) {
            return apolloResponse;
        }
        throw th;
    }

    public static /* synthetic */ com.apollographql.apollo.api.ApolloResponse parseResponse$default(com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.Operation operation, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return parseResponse(jsonReader, operation, uuid, customScalarAdapters, (java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier>) set);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseResponse(com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.Operation<D> operation, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set) {
        com.apollographql.apollo.exception.ApolloNetworkException apolloNetworkException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        try {
            return com.apollographql.apollo.api.internal.ResponseParser.INSTANCE.parse(jsonReader, operation, uuid, customScalarAdapters, set);
        } catch (java.lang.Throwable th) {
            if (uuid == null) {
                uuid = java.util.UUID.randomUUID();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "");
            }
            com.apollographql.apollo.api.ApolloResponse.Builder builder = new com.apollographql.apollo.api.ApolloResponse.Builder(operation, uuid);
            if (th instanceof com.apollographql.apollo.exception.ApolloException) {
                apolloNetworkException = th;
            } else {
                apolloNetworkException = new com.apollographql.apollo.exception.ApolloNetworkException("Error while reading JSON response", th);
            }
            return builder.exception(apolloNetworkException).isLast(true).build();
        }
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> void composeJsonRequest(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        jsonWriter.beginObject();
        jsonWriter.name("operationName");
        jsonWriter.value(operation.name());
        jsonWriter.name("variables");
        jsonWriter.beginObject();
        operation.serializeVariables(jsonWriter, customScalarAdapters, false);
        jsonWriter.endObject();
        jsonWriter.name("query");
        jsonWriter.value(operation.document());
        jsonWriter.endObject();
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.String composeJsonResponse(com.apollographql.apollo.api.Operation<D> operation, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null);
        bufferedSinkJsonWriter.beginObject();
        bufferedSinkJsonWriter.name(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        operation.adapter().toJson(bufferedSinkJsonWriter, customScalarAdapters, d);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return parseResponse$default(operation, jsonReader, uuid, customScalarAdapters, (java.util.Set) null, 8, (java.lang.Object) null);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader, java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        return parseResponse$default(operation, jsonReader, uuid, (com.apollographql.apollo.api.CustomScalarAdapters) null, (java.util.Set) null, 12, (java.lang.Object) null);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        return parseResponse$default(operation, jsonReader, (java.util.UUID) null, (com.apollographql.apollo.api.CustomScalarAdapters) null, (java.util.Set) null, 14, (java.lang.Object) null);
    }

    @kotlin.Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @kotlin.ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseJsonResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return parseJsonResponse$default(operation, jsonReader, customScalarAdapters, null, 4, null);
    }

    @kotlin.Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @kotlin.ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> parseJsonResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        return parseJsonResponse$default(operation, jsonReader, null, null, 6, null);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> void composeJsonResponse(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        composeJsonResponse$default(operation, jsonWriter, d, null, 4, null);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> void composeJsonRequest(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.json.JsonWriter jsonWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        composeJsonRequest$default(operation, jsonWriter, null, 2, null);
    }
}
