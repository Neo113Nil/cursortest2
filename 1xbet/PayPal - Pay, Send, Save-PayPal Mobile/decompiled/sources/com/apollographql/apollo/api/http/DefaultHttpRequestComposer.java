package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "apolloRequest", "Lcom/apollographql/apollo/api/http/HttpRequest;", "compose", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/api/http/HttpRequest;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultHttpRequestComposer implements com.apollographql.apollo.api.http.HttpRequestComposer {
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion INSTANCE = new com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion(null);
    private static final java.lang.String HEADER_APOLLO_OPERATION_ID = com.paypal.oslo.core.network.graphql.interceptor.OperationTrackingInterceptor.HEADER_OPERATION_ID;
    private static final java.lang.String HEADER_APOLLO_OPERATION_NAME = com.paypal.oslo.core.network.graphql.interceptor.OperationTrackingInterceptor.HEADER_OPERATION_NAME;
    private static final java.lang.String HEADER_APOLLO_REQUIRE_PREFLIGHT = "Apollo-Require-Preflight";
    private static final java.lang.String HEADER_ACCEPT_NAME = "Accept";
    private static final java.lang.String HEADER_ACCEPT_VALUE_DEFER = "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json";
    private static final java.lang.String HEADER_ACCEPT_VALUE_MULTIPART = "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json";

    public DefaultHttpRequestComposer(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
    }

    @Override // com.apollographql.apollo.api.http.HttpRequestComposer
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.http.HttpRequest compose(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        com.apollographql.apollo.api.http.HttpRequest.Builder addHeader;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.api.Operation<D> operation = apolloRequest.getOperation();
        com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = (com.apollographql.apollo.api.CustomScalarAdapters) apolloRequest.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
        if (customScalarAdapters == null) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters2 = customScalarAdapters;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (apolloRequest.getOperation() instanceof com.apollographql.apollo.api.Subscription) {
            arrayList.add(new com.apollographql.apollo.api.http.HttpHeader(HEADER_ACCEPT_NAME, HEADER_ACCEPT_VALUE_MULTIPART));
        } else {
            arrayList.add(new com.apollographql.apollo.api.http.HttpHeader(HEADER_ACCEPT_NAME, HEADER_ACCEPT_VALUE_DEFER));
        }
        if (apolloRequest.getHttpHeaders() != null) {
            arrayList.addAll(apolloRequest.getHttpHeaders());
        }
        java.lang.Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
        boolean booleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
        java.lang.Boolean sendDocument = apolloRequest.getSendDocument();
        boolean booleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
        boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
        com.apollographql.apollo.api.http.HttpMethod httpMethod = apolloRequest.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = com.apollographql.apollo.api.http.HttpMethod.Post;
        }
        int i = com.apollographql.apollo.api.http.DefaultHttpRequestComposer.WhenMappings.$EnumSwitchMapping$0[httpMethod.ordinal()];
        if (i == 1) {
            addHeader = new com.apollographql.apollo.api.http.HttpRequest.Builder(com.apollographql.apollo.api.http.HttpMethod.Get, com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion.access$buildGetUrl(INSTANCE, this.getHighSpeedVideoSizes, operation, customScalarAdapters2, booleanValue, booleanValue2, sendEnhancedClientAwareness)).addHeader(HEADER_APOLLO_REQUIRE_PREFLIGHT, "true");
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String document = booleanValue2 ? operation.document() : null;
            com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion companion = INSTANCE;
            com.apollographql.apollo.api.http.HttpBody buildPostBody = companion.buildPostBody(operation, customScalarAdapters2, document, com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion.access$extensionsWriter(companion, operation.id(), booleanValue, sendEnhancedClientAwareness));
            addHeader = new com.apollographql.apollo.api.http.HttpRequest.Builder(com.apollographql.apollo.api.http.HttpMethod.Post, this.getHighSpeedVideoSizes).body(buildPostBody);
            if (kotlin.text.StringsKt.startsWith$default(buildPostBody.getContentType(), androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_MULTIPART, false, 2, (java.lang.Object) null)) {
                addHeader = addHeader.addHeader(HEADER_APOLLO_REQUIRE_PREFLIGHT, "true");
            }
        }
        return addHeader.addHeaders(arrayList).addExecutionContext(apolloRequest.getExecutionContext()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\f*\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001f\u001a\u00020\u001e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001f\u0010 JP\u0010\u001f\u001a\u00020\u001e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u001f\u0010\"J?\u0010%\u001a\u00020$\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0007¢\u0006\u0004\b%\u0010&JE\u0010%\u001a\u00020$\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b%\u0010(J3\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\b+\u0010,R \u0010-\u001a\u00020\f8\u0007X\u0087D¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010\u0003\u001a\u0004\b/\u00100R \u00102\u001a\u00020\f8\u0007X\u0087D¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u00100R\u001a\u00105\u001a\u00020\f8\u0001X\u0081D¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001a\u00107\u001a\u00020\f8\u0007X\u0087D¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u001a\u00109\u001a\u00020\f8\u0007X\u0087D¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u001a\u0010;\u001a\u00020\f8\u0007X\u0087D¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/json/JsonWriter;", "p0", "Lcom/apollographql/apollo/api/Operation;", "p1", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "p2", "", "p3", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "p4", "", "Lcom/apollographql/apollo/api/Upload;", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "parameters", "appendQueryParameters", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "customScalarAdapters", "", "autoPersistQueries", "query", "Lcom/apollographql/apollo/api/http/HttpBody;", "buildPostBody", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;ZLjava/lang/String;)Lcom/apollographql/apollo/api/http/HttpBody;", "extensionsWriter", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/api/http/HttpBody;", "sendDocument", "Lokio/ByteString;", "buildParamsMap", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;ZZ)Lokio/ByteString;", "sendEnhancedClientAwarenessExtensions", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;ZZZ)Lokio/ByteString;", "Lcom/apollographql/apollo/api/ApolloRequest;", "apolloRequest", "composePayload", "(Lcom/apollographql/apollo/api/ApolloRequest;)Ljava/util/Map;", "HEADER_APOLLO_OPERATION_ID", "Ljava/lang/String;", "getHEADER_APOLLO_OPERATION_ID", "()Ljava/lang/String;", "getHEADER_APOLLO_OPERATION_ID$annotations", "HEADER_APOLLO_OPERATION_NAME", "getHEADER_APOLLO_OPERATION_NAME", "getHEADER_APOLLO_OPERATION_NAME$annotations", "HEADER_APOLLO_REQUIRE_PREFLIGHT", "getHEADER_APOLLO_REQUIRE_PREFLIGHT$apollo_api", "HEADER_ACCEPT_NAME", "getHEADER_ACCEPT_NAME", "HEADER_ACCEPT_VALUE_DEFER", "getHEADER_ACCEPT_VALUE_DEFER", "HEADER_ACCEPT_VALUE_MULTIPART", "getHEADER_ACCEPT_VALUE_MULTIPART"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "If needed, add this header with ApolloCall.addHttpHeader() instead")
        public static /* synthetic */ void getHEADER_APOLLO_OPERATION_ID$annotations() {
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "If needed, add this header with ApolloCall.addHttpHeader() instead")
        public static /* synthetic */ void getHEADER_APOLLO_OPERATION_NAME$annotations() {
        }

        private Companion() {
        }

        public static final /* synthetic */ java.util.Map access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion companion, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
            return Camera2StreamConfigurationMap(jsonWriter, operation, customScalarAdapters, str, function1);
        }

        public final java.lang.String getHEADER_APOLLO_OPERATION_ID() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_ID;
        }

        public final java.lang.String getHEADER_APOLLO_OPERATION_NAME() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_NAME;
        }

        public final java.lang.String getHEADER_APOLLO_REQUIRE_PREFLIGHT$apollo_api() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT;
        }

        public final java.lang.String getHEADER_ACCEPT_NAME() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_ACCEPT_NAME;
        }

        public final java.lang.String getHEADER_ACCEPT_VALUE_DEFER() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_DEFER;
        }

        public final java.lang.String getHEADER_ACCEPT_VALUE_MULTIPART() {
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_MULTIPART;
        }

        public final java.lang.String appendQueryParameters(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, false, 2, (java.lang.Object) null);
            java.util.Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (contains$default) {
                    sb.append(kotlin.text.Typography.amp);
                } else {
                    sb.append('?');
                    contains$default = true;
                }
                sb.append(com.apollographql.apollo.api.http.internal.UrlEncodeKt.urlEncode((java.lang.String) entry.getKey()));
                sb.append('=');
                sb.append(com.apollographql.apollo.api.http.internal.UrlEncodeKt.urlEncode((java.lang.String) entry.getValue()));
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }

        @kotlin.Deprecated(message = "Use buildPostBody(operation, customScalarAdapters, query, extensionsWriter) instead")
        public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.http.HttpBody buildPostBody(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, java.lang.String query) {
            kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String id = operation.id();
            if (!autoPersistQueries) {
                defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1 = new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda0();
            } else {
                defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1 = new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1(autoPersistQueries, false, id);
            }
            return buildPostBody(operation, customScalarAdapters, query, defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1);
        }

        public final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Map<java.lang.String, java.lang.Object> composePayload(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
            com.apollographql.apollo.api.Operation<D> operation = apolloRequest.getOperation();
            java.lang.Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
            boolean booleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
            boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
            java.lang.Boolean sendDocument = apolloRequest.getSendDocument();
            boolean booleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
            com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = (com.apollographql.apollo.api.CustomScalarAdapters) apolloRequest.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
            if (customScalarAdapters == null) {
                customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
            }
            com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters2 = customScalarAdapters;
            java.lang.String document = booleanValue2 ? operation.document() : null;
            com.apollographql.apollo.api.json.MapJsonWriter mapJsonWriter = new com.apollographql.apollo.api.json.MapJsonWriter();
            access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE, mapJsonWriter, operation, customScalarAdapters2, booleanValue, sendEnhancedClientAwareness, document);
            java.lang.Object root = mapJsonWriter.root();
            kotlin.jvm.internal.Intrinsics.checkNotNull(root, "");
            return (java.util.Map) root;
        }

        private static <D extends com.apollographql.apollo.api.Operation.Data> java.util.Map<java.lang.String, com.apollographql.apollo.api.Upload> Camera2StreamConfigurationMap(com.apollographql.apollo.api.json.JsonWriter p0, com.apollographql.apollo.api.Operation<D> p1, com.apollographql.apollo.api.CustomScalarAdapters p2, java.lang.String p3, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> p4) {
            p0.beginObject();
            p0.name("operationName");
            p0.value(p1.name());
            p0.name("variables");
            com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter(p0);
            com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter fileUploadAwareJsonWriter2 = fileUploadAwareJsonWriter;
            fileUploadAwareJsonWriter2.beginObject();
            p1.serializeVariables(fileUploadAwareJsonWriter2, p2, false);
            fileUploadAwareJsonWriter2.endObject();
            java.util.Map<java.lang.String, com.apollographql.apollo.api.Upload> collectedUploads = fileUploadAwareJsonWriter.collectedUploads();
            if (p3 != null) {
                p0.name("query");
                p0.value(p3);
            }
            p4.invoke(p0);
            p0.endObject();
            return collectedUploads;
        }

        public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.http.HttpBody buildPostBody(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String query, kotlin.jvm.functions.Function1<? super com.apollographql.apollo.api.json.JsonWriter, kotlin.Unit> extensionsWriter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsWriter, "");
            okio.Buffer buffer = new okio.Buffer();
            java.util.Map access$composePostParams = access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE, new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, query, extensionsWriter);
            final okio.ByteString readByteString = buffer.readByteString();
            if (access$composePostParams.isEmpty()) {
                return new com.apollographql.apollo.api.http.HttpBody() { // from class: com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$buildPostBody$1
                    private final long contentLength;
                    private final java.lang.String contentType = "application/json";

                    {
                        this.contentLength = okio.ByteString.this.size();
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
                        bufferedSink.write(okio.ByteString.this);
                    }
                };
            }
            return new com.apollographql.apollo.api.http.UploadsHttpBody(access$composePostParams, readByteString);
        }

        @kotlin.Deprecated(message = "Use new function with additional parameters instead.", replaceWith = @kotlin.ReplaceWith(expression = "buildParamsMap(operation = operation, customScalarAdapters = customScalarAdapters, autoPersistQueries = autoPersistQueries, sendDocument = sendDocument, sendEnhancedClientAwarenessExtensions = true)", imports = {}))
        public final <D extends com.apollographql.apollo.api.Operation.Data> okio.ByteString buildParamsMap(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, boolean sendDocument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            okio.Buffer buffer = new okio.Buffer();
            access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE, new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, autoPersistQueries, true, sendDocument ? operation.document() : null);
            return buffer.readByteString();
        }

        public final <D extends com.apollographql.apollo.api.Operation.Data> okio.ByteString buildParamsMap(com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, boolean sendDocument, boolean sendEnhancedClientAwarenessExtensions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            okio.Buffer buffer = new okio.Buffer();
            access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE, new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, autoPersistQueries, sendEnhancedClientAwarenessExtensions, sendDocument ? operation.document() : null);
            return buffer.readByteString();
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$A7lzncXVh6HqmxjGkTEfTY4ayA4(com.apollographql.apollo.api.json.JsonWriter jsonWriter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$G0TsX-0O_vGFk0VdPWX-DrFgbrs, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9951$r8$lambda$G0TsX0O_vGFk0VdPWXDrFgbrs(boolean z, boolean z2, java.lang.String str, com.apollographql.apollo.api.json.JsonWriter jsonWriter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
            jsonWriter.name(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
            jsonWriter.beginObject();
            if (z) {
                jsonWriter.name("persistedQuery");
                jsonWriter.beginObject();
                jsonWriter.name("version").value(1);
                jsonWriter.name("sha256Hash").value(str);
                jsonWriter.endObject();
            }
            if (z2) {
                jsonWriter.name("clientLibrary");
                jsonWriter.beginObject();
                jsonWriter.name("name").value("apollo-kotlin");
                jsonWriter.name("version").value(com.apollographql.apollo.api.ApolloApiVersionKt.apolloApiVersion);
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
            return kotlin.Unit.INSTANCE;
        }

        public static final /* synthetic */ java.lang.String access$buildGetUrl(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion companion, java.lang.String str, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean z, boolean z2, boolean z3) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            okio.Buffer buffer = new okio.Buffer();
            com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null));
            com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter fileUploadAwareJsonWriter2 = fileUploadAwareJsonWriter;
            fileUploadAwareJsonWriter2.beginObject();
            operation.serializeVariables(fileUploadAwareJsonWriter2, customScalarAdapters, false);
            fileUploadAwareJsonWriter2.endObject();
            if (!fileUploadAwareJsonWriter.collectedUploads().isEmpty()) {
                throw new java.lang.IllegalStateException("FileUpload and Http GET are not supported at the same time".toString());
            }
            linkedHashMap.put("variables", buffer.readUtf8());
            if (z2) {
                linkedHashMap.put("query", operation.document());
            }
            okio.Buffer buffer2 = new okio.Buffer();
            com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer2, null);
            bufferedSinkJsonWriter.beginObject();
            if (z) {
                bufferedSinkJsonWriter.name("persistedQuery");
                bufferedSinkJsonWriter.beginObject();
                bufferedSinkJsonWriter.name("version").value(1);
                bufferedSinkJsonWriter.name("sha256Hash").value(operation.id());
                bufferedSinkJsonWriter.endObject();
            }
            if (z3) {
                bufferedSinkJsonWriter.name("clientLibrary");
                bufferedSinkJsonWriter.beginObject();
                bufferedSinkJsonWriter.name("name").value("apollo-kotlin");
                bufferedSinkJsonWriter.name("version").value(com.apollographql.apollo.api.ApolloApiVersionKt.apolloApiVersion);
                bufferedSinkJsonWriter.endObject();
            }
            bufferedSinkJsonWriter.endObject();
            java.lang.String readUtf8 = buffer2.readUtf8();
            if (readUtf8.length() != 0) {
                linkedHashMap.put(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, readUtf8);
            }
            return companion.appendQueryParameters(str, linkedHashMap);
        }

        public static final /* synthetic */ java.util.Map access$composePostParams(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion companion, com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.Operation operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean z, boolean z2, java.lang.String str) {
            kotlin.jvm.functions.Function1 defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1;
            java.lang.String id = operation.id();
            if (!z && !z2) {
                defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1 = new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda0();
            } else {
                defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1 = new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1(z, z2, id);
            }
            return Camera2StreamConfigurationMap(jsonWriter, operation, customScalarAdapters, str, defaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1);
        }

        public static final /* synthetic */ kotlin.jvm.functions.Function1 access$extensionsWriter(com.apollographql.apollo.api.http.DefaultHttpRequestComposer.Companion companion, java.lang.String str, boolean z, boolean z2) {
            if (!z && !z2) {
                return new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda0();
            }
            return new com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1(z, z2, str);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.api.http.HttpMethod.values().length];
            try {
                iArr[com.apollographql.apollo.api.http.HttpMethod.Get.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.api.http.HttpMethod.Post.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
