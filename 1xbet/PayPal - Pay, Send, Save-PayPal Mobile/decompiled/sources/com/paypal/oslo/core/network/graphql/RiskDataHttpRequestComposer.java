package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0016\u001a\u0004\u0018\u00010\u000f\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskDataHttpRequestComposer;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "defaultComposer", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "<init>", "(Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;Lcom/paypal/oslo/core/security/RiskDataProvider;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "apolloRequest", "Lcom/apollographql/apollo/api/http/HttpRequest;", "compose", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/api/http/HttpRequest;", "Lcom/apollographql/apollo/api/http/HttpBody;", "p0", "p1", "Lcom/paypal/oslo/core/security/RiskData;", "p2", "Lcom/paypal/oslo/core/network/graphql/IncludeRiskData;", "p3", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/api/http/HttpBody;Lcom/apollographql/apollo/api/ApolloRequest;Lcom/paypal/oslo/core/security/RiskData;Lcom/paypal/oslo/core/network/graphql/IncludeRiskData;)Lcom/apollographql/apollo/api/http/HttpBody;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RiskDataHttpRequestComposer implements com.apollographql.apollo.api.http.HttpRequestComposer {
    private static final com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer.Companion Companion = new com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer.Companion(null);
    private static final kotlinx.serialization.json.Json getHighSpeedVideoSizes = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer.$r8$lambda$ByhqgQ554jezJeKuN9O74NZQzqk((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.DefaultHttpRequestComposer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.security.RiskDataProvider getHighResolutionOutputSizeshNQ4ISI;

    public RiskDataHttpRequestComposer(com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultHttpRequestComposer, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultHttpRequestComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        this.getHighSpeedVideoFpsRangesFor = defaultHttpRequestComposer;
        this.getHighResolutionOutputSizeshNQ4ISI = riskDataProvider;
    }

    @Override // com.apollographql.apollo.api.http.HttpRequestComposer
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.http.HttpRequest compose(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.api.http.HttpRequest compose = this.getHighSpeedVideoFpsRangesFor.compose(apolloRequest);
        com.paypal.oslo.core.network.graphql.IncludeRiskData includeRiskData = (com.paypal.oslo.core.network.graphql.IncludeRiskData) apolloRequest.getExecutionContext().get(com.paypal.oslo.core.network.graphql.IncludeRiskData.INSTANCE);
        com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader includeClientMetadataIdHeader = (com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader) apolloRequest.getExecutionContext().get(com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader.INSTANCE);
        if (includeRiskData == null) {
            if (includeClientMetadataIdHeader == null) {
                return compose;
            }
            com.paypal.oslo.core.security.RiskData generateFreshDeviceRiskData = this.getHighResolutionOutputSizeshNQ4ISI.generateFreshDeviceRiskData(includeClientMetadataIdHeader.getSourceId().getRawValue(), includeClientMetadataIdHeader.getCmId());
            return kotlin.text.StringsKt.isBlank(generateFreshDeviceRiskData.getClientMetadataId()) ? compose : com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(compose, null, null, 3, null).addHeader(com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader.CLIENT_METADATA_ID_HEADER, generateFreshDeviceRiskData.getClientMetadataId()).build();
        }
        com.paypal.oslo.core.security.RiskData generateFreshDeviceRiskData2 = this.getHighResolutionOutputSizeshNQ4ISI.generateFreshDeviceRiskData(includeRiskData.getSourceId().getRawValue(), includeRiskData.getCmId());
        com.apollographql.apollo.api.http.HttpBody body = compose.getBody();
        com.apollographql.apollo.api.http.HttpBody highSpeedVideoFpsRangesFor = body != null ? getHighSpeedVideoFpsRangesFor(body, apolloRequest, generateFreshDeviceRiskData2, includeRiskData) : null;
        boolean z = highSpeedVideoFpsRangesFor != null;
        boolean isBlank = kotlin.text.StringsKt.isBlank(generateFreshDeviceRiskData2.getClientMetadataId());
        if (!z && isBlank) {
            return compose;
        }
        com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder$default = com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(compose, null, null, 3, null);
        if (highSpeedVideoFpsRangesFor != null) {
            newBuilder$default.body(highSpeedVideoFpsRangesFor);
        }
        if (!isBlank) {
            newBuilder$default.addHeader(com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader.CLIENT_METADATA_ID_HEADER, generateFreshDeviceRiskData2.getClientMetadataId());
        }
        return newBuilder$default.build();
    }

    private static <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.http.HttpBody getHighSpeedVideoFpsRangesFor(final com.apollographql.apollo.api.http.HttpBody p0, com.apollographql.apollo.api.ApolloRequest<D> p1, com.paypal.oslo.core.security.RiskData p2, com.paypal.oslo.core.network.graphql.IncludeRiskData p3) {
        kotlinx.serialization.json.JsonObject jsonObject;
        try {
            java.lang.String deviceRiskData = p2.getDeviceRiskData();
            java.util.Map<java.lang.String, java.lang.String> additionalData = p3.getAdditionalData();
            okio.Buffer buffer = new okio.Buffer();
            p0.writeTo(buffer);
            java.lang.String readUtf8 = buffer.readUtf8();
            kotlinx.serialization.json.Json json = getHighSpeedVideoSizes;
            kotlinx.serialization.json.JsonObject jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(json.parseToJsonElement(readUtf8));
            kotlinx.serialization.json.JsonObject jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(json.parseToJsonElement(deviceRiskData));
            if (!additionalData.isEmpty()) {
                kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
                for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry : jsonObject3.entrySet()) {
                    jsonObjectBuilder.put(entry.getKey(), entry.getValue());
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : additionalData.entrySet()) {
                    jsonObjectBuilder.put(entry2.getKey(), kotlinx.serialization.json.JsonElementKt.JsonPrimitive(entry2.getValue()));
                }
                jsonObject3 = jsonObjectBuilder.build();
            }
            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder2 = new kotlinx.serialization.json.JsonObjectBuilder();
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
            if (jsonElement != null && (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) != null) {
                for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry3 : jsonObject.entrySet()) {
                    jsonObjectBuilder2.put(entry3.getKey(), entry3.getValue());
                }
            }
            jsonObjectBuilder2.put("riskData", jsonObject3);
            kotlinx.serialization.json.JsonObject build = jsonObjectBuilder2.build();
            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder3 = new kotlinx.serialization.json.JsonObjectBuilder();
            for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry4 : jsonObject2.entrySet()) {
                java.lang.String key = entry4.getKey();
                kotlinx.serialization.json.JsonElement value = entry4.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(key, com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
                    jsonObjectBuilder3.put(key, build);
                } else {
                    jsonObjectBuilder3.put(key, value);
                }
            }
            if (!jsonObject2.containsKey((java.lang.Object) com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
                jsonObjectBuilder3.put(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, build);
            }
            final byte[] bytes = jsonObjectBuilder3.build().toString().getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new com.apollographql.apollo.api.http.HttpBody(p0, bytes) { // from class: com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer$enhanceBodyWithRiskData$1
                private final long contentLength;
                private final java.lang.String contentType;
                final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;

                {
                    this.getHighSpeedVideoFpsRangesFor = bytes;
                    this.contentType = p0.getContentType();
                    this.contentLength = bytes.length;
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                public final java.lang.String getContentType() {
                    return this.contentType;
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                public final long getContentLength() {
                    return this.contentLength;
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                public final void writeTo(okio.BufferedSink bufferedSink) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
                    bufferedSink.write(this.getHighSpeedVideoFpsRangesFor);
                }
            };
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "IO error while reading request body", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getClass().getSimpleName()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, p1.getOperation().name())), null, e, 4, null);
            return null;
        } catch (kotlinx.serialization.SerializationException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Invalid JSON encountered while adding risk data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e2.getClass().getSimpleName()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, p1.getOperation().name())), null, e2, 4, null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskDataHttpRequestComposer$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ByhqgQ554jezJeKuN9O74NZQzqk(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return kotlin.Unit.INSTANCE;
    }
}
